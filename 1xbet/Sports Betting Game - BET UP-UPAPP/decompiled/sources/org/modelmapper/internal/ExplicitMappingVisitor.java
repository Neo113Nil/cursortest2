package org.modelmapper.internal;

import androidx.exifinterface.media.ExifInterface;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.modelmapper.internal.PropertyInfoImpl;
import org.modelmapper.internal.asm.ClassVisitor;
import org.modelmapper.internal.asm.FieldVisitor;
import org.modelmapper.internal.asm.Handle;
import org.modelmapper.internal.asm.MethodVisitor;
import org.modelmapper.internal.asm.Type;
import org.modelmapper.internal.asm.tree.AbstractInsnNode;
import org.modelmapper.internal.asm.tree.FieldInsnNode;
import org.modelmapper.internal.asm.tree.InsnNode;
import org.modelmapper.internal.asm.tree.InvokeDynamicInsnNode;
import org.modelmapper.internal.asm.tree.MethodInsnNode;
import org.modelmapper.internal.bytebuddy.pool.TypePool;
import org.modelmapper.internal.util.Members;
import org.modelmapper.internal.util.Primitives;
import org.modelmapper.internal.util.Types;
import org.modelmapper.spi.NameableType;

/* loaded from: classes4.dex */
public class ExplicitMappingVisitor extends ClassVisitor {
    private static final String CONFIGURE_METHOD = "configure";
    private static final String CONFIGURE_METHOD_DESC = "()V";
    private static final String DEST_FIELD = "destination";
    private static final String MAP_BOTH_METHOD_DESC = "(Ljava/lang/Object;Ljava/lang/Object;)V";
    private static final String MAP_DEST_METHOD_DESC = "()Ljava/lang/Object;";
    private static final String MAP_EXPR_OWNER_PREFIX = "org/modelmapper/builder";
    private static final String MAP_METHOD = "map";
    private static final String MAP_SOURCE_METHOD_DESC = "(Ljava/lang/Object;)Ljava/lang/Object;";
    private static final Pattern MUTATOR_METHOD_DESC_PATTERN = Pattern.compile("^\\(.+\\)(.+)$");
    private static final String PROXY_FIELD_DESC = "Ljava/lang/Object;";
    private static final String SKIP_DEST_METHOD_DESC = "(Ljava/lang/Object;)V";
    private static final String SKIP_METHOD = "skip";
    private static final String SOURCE_FIELD = "source";
    private final InheritingConfiguration config;
    private final Errors errors;
    final List<VisitedMapping> mappings;
    private final String propMapClassInternalName;
    private final ClassLoader propertyMapClassLoader;
    private final Set<String> syntheticFields;

    static class VisitedMapping {
        List<Accessor> sourceAccessors = new ArrayList();
        List<Accessor> destinationAccessors = new ArrayList();
        List<Mutator> destinationMutators = new ArrayList();

        VisitedMapping() {
        }
    }

    public ExplicitMappingVisitor(Errors errors, InheritingConfiguration inheritingConfiguration, String str, String str2, ClassLoader classLoader) {
        super(327680);
        this.syntheticFields = new HashSet();
        this.mappings = new ArrayList();
        this.errors = errors;
        this.config = inheritingConfiguration;
        this.propMapClassInternalName = str.replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/');
        this.propertyMapClassLoader = classLoader;
    }

    @Override // org.modelmapper.internal.asm.ClassVisitor
    public FieldVisitor visitField(int i, String str, String str2, String str3, Object obj) {
        if ((i & 4096) != 4096) {
            return null;
        }
        this.syntheticFields.add(str);
        return null;
    }

    @Override // org.modelmapper.internal.asm.ClassVisitor
    public MethodVisitor visitMethod(int i, String str, String str2, String str3, String[] strArr) {
        boolean equals = str.equals(CONFIGURE_METHOD);
        if (equals && str2.equals(CONFIGURE_METHOD_DESC)) {
            return new MappingCapturingVisitor();
        }
        return null;
    }

    private class MappingCapturingVisitor extends MethodVisitor {
        private final List<AbstractInsnNode> instructions;
        private int mapType;
        private VisitedMapping mapping;
        private int subjectType;

        private MappingCapturingVisitor() {
            super(327680);
            this.instructions = new ArrayList();
            this.mapping = new VisitedMapping();
        }

        @Override // org.modelmapper.internal.asm.MethodVisitor
        public void visitInsn(int i) {
            if (i == 177) {
                this.instructions.add(new InsnNode(i));
            }
        }

        @Override // org.modelmapper.internal.asm.MethodVisitor
        public void visitVarInsn(int i, int i2) {
            if (i != 25 || this.instructions.isEmpty()) {
                return;
            }
            AbstractInsnNode abstractInsnNode = this.instructions.get(r3.size() - 1);
            if (isMethodInvocation(abstractInsnNode)) {
                MethodInsnNode methodInsnNode = (MethodInsnNode) abstractInsnNode;
                if (isMapBothMethod(methodInsnNode) || isMutator(methodInsnNode)) {
                    this.instructions.add(new InsnNode(i));
                }
            }
        }

        @Override // org.modelmapper.internal.asm.MethodVisitor
        public void visitFieldInsn(int i, String str, String str2, String str3) {
            if (i == 180) {
                if (str.equals(ExplicitMappingVisitor.this.propMapClassInternalName) && ExplicitMappingVisitor.this.syntheticFields.contains(str2)) {
                    return;
                }
                this.instructions.add(new FieldInsnNode(i, str, str2, str3));
            }
        }

        @Override // org.modelmapper.internal.asm.MethodVisitor
        public void visitMethodInsn(int i, String str, String str2, String str3, boolean z) {
            boolean z2 = str.equals(ExplicitMappingVisitor.this.propMapClassInternalName) && (str2.equals("source") || str2.equals("destination"));
            if (i == 183 || z2 || Primitives.isPrimitiveWrapperInternalName(str)) {
                return;
            }
            this.instructions.add(new MethodInsnNode(i, str, str2, str3, z));
        }

        @Override // org.modelmapper.internal.asm.MethodVisitor
        public void visitInvokeDynamicInsn(String str, String str2, Handle handle, Object... objArr) {
            this.instructions.add(new InvokeDynamicInsnNode(str, str2, handle, objArr));
        }

        @Override // org.modelmapper.internal.asm.MethodVisitor
        public void visitEnd() {
            for (int i = 0; i < this.instructions.size(); i++) {
                AbstractInsnNode abstractInsnNode = this.instructions.get(i);
                if (abstractInsnNode.getOpcode() == 180) {
                    FieldInsnNode fieldInsnNode = (FieldInsnNode) abstractInsnNode;
                    if (!fieldInsnNode.owner.equals(ExplicitMappingVisitor.this.propMapClassInternalName) || !fieldInsnNode.desc.equals("Ljava/lang/Object;")) {
                        Class<?> classFor = ExplicitMappingVisitor.this.classFor(fieldInsnNode.owner.replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH));
                        int i2 = this.subjectType;
                        if (i2 == 1) {
                            recordSourceField(classFor, ExplicitMappingVisitor.this.fieldFor(classFor, fieldInsnNode));
                        } else if (i2 == 2) {
                            recordDestinationField(classFor, ExplicitMappingVisitor.this.fieldFor(classFor, fieldInsnNode));
                        }
                    } else if (fieldInsnNode.name.equals("source")) {
                        this.subjectType = 1;
                    } else if (fieldInsnNode.name.equals("destination")) {
                        this.subjectType = 2;
                    }
                } else if (isMethodInvocation(abstractInsnNode)) {
                    MethodInsnNode methodInsnNode = (MethodInsnNode) abstractInsnNode;
                    if (isMapMethod(methodInsnNode) || isSkipMethod(methodInsnNode)) {
                        if (ExplicitMappingVisitor.MAP_DEST_METHOD_DESC.equals(methodInsnNode.desc)) {
                            this.mapType = 1;
                            this.subjectType = 2;
                        } else if (ExplicitMappingVisitor.MAP_SOURCE_METHOD_DESC.equals(methodInsnNode.desc)) {
                            if (this.subjectType == 2) {
                                recordProperties();
                            } else {
                                this.mapType = 2;
                                this.subjectType = 2;
                            }
                        } else if (ExplicitMappingVisitor.MAP_BOTH_METHOD_DESC.equals(methodInsnNode.desc)) {
                            recordProperties();
                        } else if (ExplicitMappingVisitor.SKIP_DEST_METHOD_DESC.equals(methodInsnNode.desc)) {
                            this.mapType = 3;
                        }
                    } else if (this.subjectType != 0) {
                        Class<?> classFor2 = ExplicitMappingVisitor.this.classFor(methodInsnNode.owner.replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH));
                        Type methodType = Type.getMethodType(methodInsnNode.desc);
                        if (this.mapType != 0 && isMutator(methodInsnNode)) {
                            recordDestinationMethod(classFor2, ExplicitMappingVisitor.this.methodFor(classFor2, methodType, methodInsnNode));
                            recordProperties();
                        } else {
                            int i3 = this.subjectType;
                            if (i3 == 1) {
                                recordSourceMethod(classFor2, ExplicitMappingVisitor.this.methodFor(classFor2, methodType, methodInsnNode));
                            } else if (i3 == 2) {
                                recordDestinationMethod(classFor2, ExplicitMappingVisitor.this.methodFor(classFor2, methodType, methodInsnNode));
                            }
                        }
                    }
                } else if (abstractInsnNode.getOpcode() == 25 || abstractInsnNode.getOpcode() == 177) {
                    int i4 = this.mapType;
                    if (i4 == 3 && this.subjectType != 0) {
                        recordProperties();
                    } else if (i4 != 0) {
                        ExplicitMappingVisitor.this.errors.missingDestination();
                    }
                }
            }
        }

        private boolean isMethodInvocation(AbstractInsnNode abstractInsnNode) {
            return abstractInsnNode.getOpcode() == 182 || abstractInsnNode.getOpcode() == 185;
        }

        private boolean isMapMethod(MethodInsnNode methodInsnNode) {
            return methodInsnNode.name.equals(ExplicitMappingVisitor.MAP_METHOD) && (methodInsnNode.owner.equals(ExplicitMappingVisitor.this.propMapClassInternalName) || methodInsnNode.owner.startsWith(ExplicitMappingVisitor.MAP_EXPR_OWNER_PREFIX));
        }

        private boolean isSkipMethod(MethodInsnNode methodInsnNode) {
            return methodInsnNode.name.equals(ExplicitMappingVisitor.SKIP_METHOD) && (methodInsnNode.owner.equals(ExplicitMappingVisitor.this.propMapClassInternalName) || methodInsnNode.owner.startsWith(ExplicitMappingVisitor.MAP_EXPR_OWNER_PREFIX));
        }

        private boolean isMapBothMethod(MethodInsnNode methodInsnNode) {
            return methodInsnNode.name.equals(ExplicitMappingVisitor.MAP_METHOD) && (methodInsnNode.owner.equals(ExplicitMappingVisitor.this.propMapClassInternalName) || methodInsnNode.owner.startsWith(ExplicitMappingVisitor.MAP_EXPR_OWNER_PREFIX)) && methodInsnNode.desc.equals(ExplicitMappingVisitor.MAP_BOTH_METHOD_DESC);
        }

        private boolean isMutator(MethodInsnNode methodInsnNode) {
            Matcher matcher = ExplicitMappingVisitor.MUTATOR_METHOD_DESC_PATTERN.matcher(methodInsnNode.desc);
            if (!matcher.find()) {
                return false;
            }
            String group = matcher.group(1);
            return group.equals(ExifInterface.GPS_MEASUREMENT_INTERRUPTED) || group.contains(methodInsnNode.owner);
        }

        private void recordProperties() {
            ExplicitMappingVisitor.this.mappings.add(this.mapping);
            this.mapping = new VisitedMapping();
            this.subjectType = 0;
            this.mapType = 0;
        }

        private void recordSourceMethod(Class<?> cls, Method method) {
            assertNotFinal(method);
            if (PropertyInfoResolver.ACCESSORS.isValid(method)) {
                this.mapping.sourceAccessors.add(PropertyInfoRegistry.accessorFor(cls, method, ExplicitMappingVisitor.this.config, ExplicitMappingVisitor.this.config.getSourceNameTransformer().transform(method.getName(), NameableType.METHOD)));
            } else {
                ExplicitMappingVisitor.this.errors.invalidSourceMethod(method);
            }
        }

        private void recordSourceField(Class<?> cls, Field field) {
            assertNotFinal(field);
            if (PropertyInfoResolver.FIELDS.isValid(field)) {
                this.mapping.sourceAccessors.add(PropertyInfoRegistry.fieldPropertyFor(cls, field, ExplicitMappingVisitor.this.config, ExplicitMappingVisitor.this.config.getSourceNameTransformer().transform(field.getName(), NameableType.FIELD)));
            } else {
                ExplicitMappingVisitor.this.errors.invalidSourceField(field);
            }
        }

        private void recordDestinationMethod(Class<?> cls, Method method) {
            assertNotFinal(method);
            if (PropertyInfoResolver.MUTATORS.isValid(method)) {
                this.mapping.destinationMutators.add(PropertyInfoRegistry.mutatorFor(cls, method, ExplicitMappingVisitor.this.config, ExplicitMappingVisitor.this.config.getDestinationNameTransformer().transform(method.getName(), NameableType.METHOD)));
            } else {
                if (PropertyInfoResolver.ACCESSORS.isValid(method)) {
                    this.mapping.destinationAccessors.add(PropertyInfoRegistry.accessorFor(cls, method, ExplicitMappingVisitor.this.config, ExplicitMappingVisitor.this.config.getSourceNameTransformer().transform(method.getName(), NameableType.METHOD)));
                    Mutator mutatorForAccessorMethod = TypeInfoRegistry.typeInfoFor(cls, ExplicitMappingVisitor.this.config).mutatorForAccessorMethod(method.getName());
                    if (mutatorForAccessorMethod == null) {
                        ExplicitMappingVisitor.this.errors.missingMutatorForAccessor(method);
                        return;
                    } else {
                        this.mapping.destinationMutators.add(mutatorForAccessorMethod);
                        return;
                    }
                }
                ExplicitMappingVisitor.this.errors.invalidDestinationMethod(method);
            }
        }

        private void recordDestinationField(Class<?> cls, Field field) {
            assertNotFinal(field);
            if (PropertyInfoResolver.FIELDS.isValid(field)) {
                PropertyInfoImpl.FieldPropertyInfo fieldPropertyFor = PropertyInfoRegistry.fieldPropertyFor(cls, field, ExplicitMappingVisitor.this.config, ExplicitMappingVisitor.this.config.getDestinationNameTransformer().transform(field.getName(), NameableType.FIELD));
                this.mapping.destinationAccessors.add(fieldPropertyFor);
                this.mapping.destinationMutators.add(fieldPropertyFor);
                return;
            }
            ExplicitMappingVisitor.this.errors.invalidDestinationField(field);
        }

        private void assertNotFinal(Member member) {
            if (Modifier.isFinal(member.getDeclaringClass().getModifiers())) {
                ExplicitMappingVisitor.this.errors.invocationAgainstFinalClass(member.getDeclaringClass());
            }
            if ((member instanceof Method) && Modifier.isFinal(member.getModifiers())) {
                ExplicitMappingVisitor.this.errors.invocationAgainstFinalMethod(member);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Field fieldFor(Class<?> cls, FieldInsnNode fieldInsnNode) {
        return Members.fieldFor(cls, fieldInsnNode.name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Method methodFor(Class<?> cls, Type type, MethodInsnNode methodInsnNode) {
        Type[] argumentTypes = type.getArgumentTypes();
        int length = argumentTypes.length;
        Class[] clsArr = new Class[length];
        for (int i = 0; i < length; i++) {
            try {
                clsArr[i] = Types.classFor(argumentTypes[i], this.propertyMapClassLoader);
            } catch (ClassNotFoundException e) {
                throw this.errors.errorResolvingClass(e, argumentTypes[i].getClassName()).toException();
            }
        }
        return Members.methodFor(cls, methodInsnNode.name, clsArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Class<?> classFor(String str) {
        try {
            return Class.forName(str, true, this.propertyMapClassLoader);
        } catch (ClassNotFoundException e) {
            throw this.errors.errorResolvingClass(e, str).toException();
        }
    }
}
