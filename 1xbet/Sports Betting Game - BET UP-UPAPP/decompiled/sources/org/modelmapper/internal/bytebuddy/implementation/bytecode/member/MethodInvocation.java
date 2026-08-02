package org.modelmapper.internal.bytebuddy.implementation.bytecode.member;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Iterator;
import java.util.List;
import org.modelmapper.internal.asm.Handle;
import org.modelmapper.internal.asm.MethodVisitor;
import org.modelmapper.internal.asm.Opcodes;
import org.modelmapper.internal.bytebuddy.ClassFileVersion;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.description.type.TypeList;
import org.modelmapper.internal.bytebuddy.implementation.Implementation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackSize;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.assign.TypeCasting;

/* loaded from: classes4.dex */
public enum MethodInvocation {
    VIRTUAL(Opcodes.INVOKEVIRTUAL, 5, Opcodes.INVOKEVIRTUAL, 5),
    INTERFACE(Opcodes.INVOKEINTERFACE, 9, Opcodes.INVOKEINTERFACE, 9),
    STATIC(Opcodes.INVOKESTATIC, 6, Opcodes.INVOKESTATIC, 6),
    SPECIAL(Opcodes.INVOKESPECIAL, 7, Opcodes.INVOKESPECIAL, 7),
    SPECIAL_CONSTRUCTOR(Opcodes.INVOKESPECIAL, 8, Opcodes.INVOKESPECIAL, 8),
    VIRTUAL_PRIVATE(Opcodes.INVOKEVIRTUAL, 5, Opcodes.INVOKESPECIAL, 7),
    INTERFACE_PRIVATE(Opcodes.INVOKEINTERFACE, 9, Opcodes.INVOKESPECIAL, 7);

    private final int handle;
    private final int legacyHandle;
    private final int legacyOpcode;
    private final int opcode;

    public interface WithImplicitInvocationTargetType extends StackManipulation {
        StackManipulation dynamic(String str, TypeDescription typeDescription, List<? extends TypeDescription> list, List<?> list2);

        StackManipulation onHandle(HandleType handleType);

        StackManipulation special(TypeDescription typeDescription);

        StackManipulation virtual(TypeDescription typeDescription);
    }

    MethodInvocation(int i, int i2, int i3, int i4) {
        this.opcode = i;
        this.handle = i2;
        this.legacyOpcode = i3;
        this.legacyHandle = i4;
    }

    public static WithImplicitInvocationTargetType invoke(MethodDescription.InDefinedShape inDefinedShape) {
        if (inDefinedShape.isTypeInitializer()) {
            return IllegalInvocation.INSTANCE;
        }
        if (inDefinedShape.isStatic()) {
            MethodInvocation methodInvocation = STATIC;
            methodInvocation.getClass();
            return new Invocation(methodInvocation, inDefinedShape);
        }
        if (inDefinedShape.isConstructor()) {
            MethodInvocation methodInvocation2 = SPECIAL_CONSTRUCTOR;
            methodInvocation2.getClass();
            return new Invocation(methodInvocation2, inDefinedShape);
        }
        if (inDefinedShape.isPrivate()) {
            MethodInvocation methodInvocation3 = inDefinedShape.getDeclaringType().isInterface() ? INTERFACE_PRIVATE : VIRTUAL_PRIVATE;
            methodInvocation3.getClass();
            return new Invocation(methodInvocation3, inDefinedShape);
        }
        if (inDefinedShape.getDeclaringType().isInterface()) {
            MethodInvocation methodInvocation4 = INTERFACE;
            methodInvocation4.getClass();
            return new Invocation(methodInvocation4, inDefinedShape);
        }
        MethodInvocation methodInvocation5 = VIRTUAL;
        methodInvocation5.getClass();
        return new Invocation(methodInvocation5, inDefinedShape);
    }

    public static WithImplicitInvocationTargetType invoke(MethodDescription methodDescription) {
        MethodDescription.InDefinedShape asDefined = methodDescription.asDefined();
        if (asDefined.getReturnType().asErasure().equals(methodDescription.getReturnType().asErasure())) {
            return invoke(asDefined);
        }
        return OfGenericMethod.of(methodDescription, invoke(asDefined));
    }

    protected enum IllegalInvocation implements WithImplicitInvocationTargetType {
        INSTANCE;

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
        public boolean isValid() {
            return false;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodInvocation.WithImplicitInvocationTargetType
        public StackManipulation virtual(TypeDescription typeDescription) {
            return StackManipulation.Illegal.INSTANCE;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodInvocation.WithImplicitInvocationTargetType
        public StackManipulation special(TypeDescription typeDescription) {
            return StackManipulation.Illegal.INSTANCE;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodInvocation.WithImplicitInvocationTargetType
        public StackManipulation dynamic(String str, TypeDescription typeDescription, List<? extends TypeDescription> list, List<?> list2) {
            return StackManipulation.Illegal.INSTANCE;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodInvocation.WithImplicitInvocationTargetType
        public StackManipulation onHandle(HandleType handleType) {
            return StackManipulation.Illegal.INSTANCE;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
        public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
            return StackManipulation.Illegal.INSTANCE.apply(methodVisitor, context);
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    protected static class OfGenericMethod implements WithImplicitInvocationTargetType {
        private final WithImplicitInvocationTargetType invocation;
        private final TypeDescription targetType;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            OfGenericMethod ofGenericMethod = (OfGenericMethod) obj;
            return this.targetType.equals(ofGenericMethod.targetType) && this.invocation.equals(ofGenericMethod.invocation);
        }

        public int hashCode() {
            return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.targetType.hashCode()) * 31) + this.invocation.hashCode();
        }

        protected OfGenericMethod(TypeDescription typeDescription, WithImplicitInvocationTargetType withImplicitInvocationTargetType) {
            this.targetType = typeDescription;
            this.invocation = withImplicitInvocationTargetType;
        }

        protected static WithImplicitInvocationTargetType of(MethodDescription methodDescription, WithImplicitInvocationTargetType withImplicitInvocationTargetType) {
            return new OfGenericMethod(methodDescription.getReturnType().asErasure(), withImplicitInvocationTargetType);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodInvocation.WithImplicitInvocationTargetType
        public StackManipulation virtual(TypeDescription typeDescription) {
            return new StackManipulation.Compound(this.invocation.virtual(typeDescription), TypeCasting.to(this.targetType));
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodInvocation.WithImplicitInvocationTargetType
        public StackManipulation special(TypeDescription typeDescription) {
            return new StackManipulation.Compound(this.invocation.special(typeDescription), TypeCasting.to(this.targetType));
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodInvocation.WithImplicitInvocationTargetType
        public StackManipulation dynamic(String str, TypeDescription typeDescription, List<? extends TypeDescription> list, List<?> list2) {
            return this.invocation.dynamic(str, typeDescription, list, list2);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodInvocation.WithImplicitInvocationTargetType
        public StackManipulation onHandle(HandleType handleType) {
            return new StackManipulation.Compound(this.invocation.onHandle(handleType), TypeCasting.to(this.targetType));
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
        public boolean isValid() {
            return this.invocation.isValid();
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
        public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
            return new StackManipulation.Compound(this.invocation, TypeCasting.to(this.targetType)).apply(methodVisitor, context);
        }
    }

    @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
    protected class Invocation implements WithImplicitInvocationTargetType {
        private final MethodDescription.InDefinedShape methodDescription;
        private final TypeDescription typeDescription;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Invocation invocation = (Invocation) obj;
            return this.typeDescription.equals(invocation.typeDescription) && this.methodDescription.equals(invocation.methodDescription) && MethodInvocation.this.equals(MethodInvocation.this);
        }

        public int hashCode() {
            return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.typeDescription.hashCode()) * 31) + this.methodDescription.hashCode()) * 31) + MethodInvocation.this.hashCode();
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
        public boolean isValid() {
            return true;
        }

        protected Invocation(MethodInvocation methodInvocation, MethodDescription.InDefinedShape inDefinedShape) {
            this(inDefinedShape, inDefinedShape.getDeclaringType());
        }

        protected Invocation(MethodDescription.InDefinedShape inDefinedShape, TypeDescription typeDescription) {
            this.typeDescription = typeDescription;
            this.methodDescription = inDefinedShape;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
        public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
            methodVisitor.visitMethodInsn((MethodInvocation.this.opcode == MethodInvocation.this.legacyOpcode || context.getClassFileVersion().isAtLeast(ClassFileVersion.JAVA_V11)) ? MethodInvocation.this.opcode : MethodInvocation.this.legacyOpcode, this.typeDescription.getInternalName(), this.methodDescription.getInternalName(), this.methodDescription.getDescriptor(), this.typeDescription.isInterface());
            int size = this.methodDescription.getReturnType().getStackSize().getSize() - this.methodDescription.getStackSize();
            return new StackManipulation.Size(size, Math.max(0, size));
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodInvocation.WithImplicitInvocationTargetType
        public StackManipulation virtual(TypeDescription typeDescription) {
            if (this.methodDescription.isConstructor() || this.methodDescription.isStatic()) {
                return StackManipulation.Illegal.INSTANCE;
            }
            if (this.methodDescription.isPrivate()) {
                return this.methodDescription.getDeclaringType().equals(typeDescription) ? this : StackManipulation.Illegal.INSTANCE;
            }
            if (typeDescription.isInterface()) {
                if (this.methodDescription.getDeclaringType().represents(Object.class)) {
                    return this;
                }
                MethodInvocation methodInvocation = MethodInvocation.INTERFACE;
                methodInvocation.getClass();
                return methodInvocation.new Invocation(this.methodDescription, typeDescription);
            }
            MethodInvocation methodInvocation2 = MethodInvocation.VIRTUAL;
            methodInvocation2.getClass();
            return methodInvocation2.new Invocation(this.methodDescription, typeDescription);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodInvocation.WithImplicitInvocationTargetType
        public StackManipulation special(TypeDescription typeDescription) {
            if (!this.methodDescription.isSpecializableFor(typeDescription)) {
                return StackManipulation.Illegal.INSTANCE;
            }
            MethodInvocation methodInvocation = MethodInvocation.SPECIAL;
            methodInvocation.getClass();
            return methodInvocation.new Invocation(this.methodDescription, typeDescription);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodInvocation.WithImplicitInvocationTargetType
        public StackManipulation dynamic(String str, TypeDescription typeDescription, List<? extends TypeDescription> list, List<?> list2) {
            return this.methodDescription.isInvokeBootstrap() ? MethodInvocation.this.new DynamicInvocation(str, typeDescription, new TypeList.Explicit(list), this.methodDescription.asDefined(), list2) : StackManipulation.Illegal.INSTANCE;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodInvocation.WithImplicitInvocationTargetType
        public StackManipulation onHandle(HandleType handleType) {
            return new HandleInvocation(this.methodDescription, handleType);
        }
    }

    @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
    protected class DynamicInvocation implements StackManipulation {
        private final List<?> arguments;
        private final MethodDescription.InDefinedShape bootstrapMethod;
        private final String methodName;
        private final List<? extends TypeDescription> parameterTypes;
        private final TypeDescription returnType;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            DynamicInvocation dynamicInvocation = (DynamicInvocation) obj;
            return this.methodName.equals(dynamicInvocation.methodName) && this.returnType.equals(dynamicInvocation.returnType) && this.parameterTypes.equals(dynamicInvocation.parameterTypes) && this.bootstrapMethod.equals(dynamicInvocation.bootstrapMethod) && this.arguments.equals(dynamicInvocation.arguments) && MethodInvocation.this.equals(MethodInvocation.this);
        }

        public int hashCode() {
            return ((((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.methodName.hashCode()) * 31) + this.returnType.hashCode()) * 31) + this.parameterTypes.hashCode()) * 31) + this.bootstrapMethod.hashCode()) * 31) + this.arguments.hashCode()) * 31) + MethodInvocation.this.hashCode();
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
        public boolean isValid() {
            return true;
        }

        public DynamicInvocation(String str, TypeDescription typeDescription, List<? extends TypeDescription> list, MethodDescription.InDefinedShape inDefinedShape, List<?> list2) {
            this.methodName = str;
            this.returnType = typeDescription;
            this.parameterTypes = list;
            this.bootstrapMethod = inDefinedShape;
            this.arguments = list2;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
        public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
            StringBuilder sb = new StringBuilder("(");
            Iterator<? extends TypeDescription> it = this.parameterTypes.iterator();
            while (it.hasNext()) {
                sb.append(it.next().getDescriptor());
            }
            String sb2 = sb.append(')').append(this.returnType.getDescriptor()).toString();
            String str = this.methodName;
            Handle handle = new Handle((MethodInvocation.this.handle == MethodInvocation.this.legacyHandle || context.getClassFileVersion().isAtLeast(ClassFileVersion.JAVA_V11)) ? MethodInvocation.this.handle : MethodInvocation.this.legacyHandle, this.bootstrapMethod.getDeclaringType().getInternalName(), this.bootstrapMethod.getInternalName(), this.bootstrapMethod.getDescriptor(), this.bootstrapMethod.getDeclaringType().isInterface());
            List<?> list = this.arguments;
            methodVisitor.visitInvokeDynamicInsn(str, sb2, handle, list.toArray(new Object[list.size()]));
            int size = this.returnType.getStackSize().getSize() - StackSize.of(this.parameterTypes);
            return new StackManipulation.Size(size, Math.max(size, 0));
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    protected static class HandleInvocation implements StackManipulation {
        private static final String METHOD_HANDLE = "java/lang/invoke/MethodHandle";
        private final MethodDescription.InDefinedShape methodDescription;
        private final HandleType type;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            HandleInvocation handleInvocation = (HandleInvocation) obj;
            return this.methodDescription.equals(handleInvocation.methodDescription) && this.type.equals(handleInvocation.type);
        }

        public int hashCode() {
            return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.methodDescription.hashCode()) * 31) + this.type.hashCode();
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
        public boolean isValid() {
            return true;
        }

        protected HandleInvocation(MethodDescription.InDefinedShape inDefinedShape, HandleType handleType) {
            this.methodDescription = inDefinedShape;
            this.type = handleType;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
        public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
            String descriptor;
            String methodName = this.type.getMethodName();
            if (this.methodDescription.isStatic() || this.methodDescription.isConstructor()) {
                descriptor = this.methodDescription.getDescriptor();
            } else {
                descriptor = "(" + this.methodDescription.getDeclaringType().getDescriptor() + this.methodDescription.getDescriptor().substring(1);
            }
            methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, METHOD_HANDLE, methodName, descriptor, false);
            int size = this.methodDescription.getReturnType().getStackSize().getSize() - (this.methodDescription.getStackSize() + 1);
            return new StackManipulation.Size(size, Math.max(0, size));
        }
    }

    public enum HandleType {
        EXACT("invokeExact"),
        REGULAR("invoke");

        private final String methodName;

        HandleType(String str) {
            this.methodName = str;
        }

        protected String getMethodName() {
            return this.methodName;
        }
    }
}
