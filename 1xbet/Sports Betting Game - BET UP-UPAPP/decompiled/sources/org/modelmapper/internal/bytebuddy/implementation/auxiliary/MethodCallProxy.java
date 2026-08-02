package org.modelmapper.internal.bytebuddy.implementation.auxiliary;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import org.modelmapper.internal.asm.MethodVisitor;
import org.modelmapper.internal.bytebuddy.ByteBuddy;
import org.modelmapper.internal.bytebuddy.ClassFileVersion;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.annotation.AnnotationValue;
import org.modelmapper.internal.bytebuddy.description.field.FieldDescription;
import org.modelmapper.internal.bytebuddy.description.field.FieldList;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.method.ParameterDescription;
import org.modelmapper.internal.bytebuddy.description.modifier.ModifierContributor;
import org.modelmapper.internal.bytebuddy.description.modifier.Visibility;
import org.modelmapper.internal.bytebuddy.description.type.TypeDefinition;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.dynamic.DynamicType;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeValidation;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy;
import org.modelmapper.internal.bytebuddy.implementation.Implementation;
import org.modelmapper.internal.bytebuddy.implementation.MethodAccessorFactory;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.ByteCodeAppender;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.Duplication;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.TypeCreation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.assign.Assigner;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.FieldAccess;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodInvocation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodReturn;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodVariableAccess;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatchers;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes4.dex */
public class MethodCallProxy implements AuxiliaryType {
    private static final String FIELD_NAME_PREFIX = "argument";
    private final Assigner assigner;
    private final boolean serializableProxy;
    private final Implementation.SpecialMethodInvocation specialMethodInvocation;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MethodCallProxy methodCallProxy = (MethodCallProxy) obj;
        return this.specialMethodInvocation.equals(methodCallProxy.specialMethodInvocation) && this.serializableProxy == methodCallProxy.serializableProxy && this.assigner.equals(methodCallProxy.assigner);
    }

    public int hashCode() {
        return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.specialMethodInvocation.hashCode()) * 31) + (this.serializableProxy ? 1 : 0)) * 31) + this.assigner.hashCode();
    }

    public MethodCallProxy(Implementation.SpecialMethodInvocation specialMethodInvocation, boolean z) {
        this(specialMethodInvocation, z, Assigner.DEFAULT);
    }

    public MethodCallProxy(Implementation.SpecialMethodInvocation specialMethodInvocation, boolean z, Assigner assigner) {
        this.specialMethodInvocation = specialMethodInvocation;
        this.serializableProxy = z;
        this.assigner = assigner;
    }

    private static LinkedHashMap<String, TypeDescription> extractFields(MethodDescription methodDescription) {
        LinkedHashMap<String, TypeDescription> linkedHashMap = new LinkedHashMap<>();
        int i = 0;
        if (!methodDescription.isStatic()) {
            linkedHashMap.put(fieldName(0), methodDescription.getDeclaringType().asErasure());
            i = 1;
        }
        Iterator it = methodDescription.getParameters().iterator();
        while (it.hasNext()) {
            linkedHashMap.put(fieldName(i), ((ParameterDescription) it.next()).getType().asErasure());
            i++;
        }
        return linkedHashMap;
    }

    private static String fieldName(int i) {
        return FIELD_NAME_PREFIX + i;
    }

    @Override // org.modelmapper.internal.bytebuddy.implementation.auxiliary.AuxiliaryType
    public DynamicType make(String str, ClassFileVersion classFileVersion, MethodAccessorFactory methodAccessorFactory) {
        MethodDescription.InDefinedShape registerAccessorFor = methodAccessorFactory.registerAccessorFor(this.specialMethodInvocation, MethodAccessorFactory.AccessType.DEFAULT);
        LinkedHashMap<String, TypeDescription> extractFields = extractFields(registerAccessorFor);
        DynamicType.Builder intercept = new ByteBuddy(classFileVersion).with(TypeValidation.DISABLED).with(PrecomputedMethodGraph.INSTANCE).subclass(Object.class, (ConstructorStrategy) ConstructorStrategy.Default.NO_CONSTRUCTORS).name(str).modifiers(DEFAULT_TYPE_MODIFIER).implement(Runnable.class, Callable.class).intercept(new MethodCall(registerAccessorFor, this.assigner)).implement(this.serializableProxy ? new Class[]{Serializable.class} : new Class[0]).defineConstructor(new ModifierContributor.ForMethod[0]).withParameters(extractFields.values()).intercept(ConstructorCall.INSTANCE);
        for (Map.Entry<String, TypeDescription> entry : extractFields.entrySet()) {
            intercept = intercept.defineField(entry.getKey(), entry.getValue(), Visibility.PRIVATE);
        }
        return intercept.make();
    }

    protected enum PrecomputedMethodGraph implements MethodGraph.Compiler {
        INSTANCE;

        private final MethodGraph.Linked methodGraph;

        PrecomputedMethodGraph() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            MethodDescription.Latent latent = new MethodDescription.Latent(TypeDescription.ForLoadedType.of(Callable.class), NotificationCompat.CATEGORY_CALL, 1025, Collections.emptyList(), TypeDescription.Generic.OBJECT, Collections.emptyList(), Collections.singletonList(TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(Exception.class)), Collections.emptyList(), AnnotationValue.UNDEFINED, TypeDescription.Generic.UNDEFINED);
            linkedHashMap.put(latent.asSignatureToken(), new MethodGraph.Node.Simple(latent));
            MethodDescription.Latent latent2 = new MethodDescription.Latent(TypeDescription.ForLoadedType.of(Runnable.class), "run", 1025, Collections.emptyList(), TypeDescription.Generic.VOID, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), AnnotationValue.UNDEFINED, TypeDescription.Generic.UNDEFINED);
            linkedHashMap.put(latent2.asSignatureToken(), new MethodGraph.Node.Simple(latent2));
            MethodGraph.Simple simple = new MethodGraph.Simple(linkedHashMap);
            this.methodGraph = new MethodGraph.Linked.Delegation(simple, simple, Collections.emptyMap());
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph.Compiler
        public MethodGraph.Linked compile(TypeDescription typeDescription) {
            return compile(typeDescription, typeDescription);
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph.Compiler
        public MethodGraph.Linked compile(TypeDefinition typeDefinition, TypeDescription typeDescription) {
            return this.methodGraph;
        }
    }

    protected enum ConstructorCall implements Implementation {
        INSTANCE;

        private final MethodDescription objectTypeDefaultConstructor = (MethodDescription) TypeDescription.OBJECT.getDeclaredMethods().filter(ElementMatchers.isConstructor()).getOnly();

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
        public InstrumentedType prepare(InstrumentedType instrumentedType) {
            return instrumentedType;
        }

        ConstructorCall() {
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation
        public ByteCodeAppender appender(Implementation.Target target) {
            return new Appender(target.getInstrumentedType());
        }

        @HashCodeAndEqualsPlugin.Enhance
        protected static class Appender implements ByteCodeAppender {
            private final TypeDescription instrumentedType;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.instrumentedType.equals(((Appender) obj).instrumentedType);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.instrumentedType.hashCode();
            }

            private Appender(TypeDescription typeDescription) {
                this.instrumentedType = typeDescription;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.ByteCodeAppender
            public ByteCodeAppender.Size apply(MethodVisitor methodVisitor, Implementation.Context context, MethodDescription methodDescription) {
                FieldList<FieldDescription.InDefinedShape> declaredFields = this.instrumentedType.getDeclaredFields();
                StackManipulation[] stackManipulationArr = new StackManipulation[declaredFields.size()];
                Iterator it = declaredFields.iterator();
                int i = 0;
                while (it.hasNext()) {
                    stackManipulationArr[i] = new StackManipulation.Compound(MethodVariableAccess.loadThis(), MethodVariableAccess.load((ParameterDescription) methodDescription.getParameters().get(i)), FieldAccess.forField((FieldDescription) it.next()).write());
                    i++;
                }
                return new ByteCodeAppender.Size(new StackManipulation.Compound(MethodVariableAccess.loadThis(), MethodInvocation.invoke(ConstructorCall.INSTANCE.objectTypeDefaultConstructor), new StackManipulation.Compound(stackManipulationArr), MethodReturn.VOID).apply(methodVisitor, context).getMaximalSize(), methodDescription.getStackSize());
            }
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    protected static class MethodCall implements Implementation {
        private final MethodDescription accessorMethod;
        private final Assigner assigner;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            MethodCall methodCall = (MethodCall) obj;
            return this.accessorMethod.equals(methodCall.accessorMethod) && this.assigner.equals(methodCall.assigner);
        }

        public int hashCode() {
            return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.accessorMethod.hashCode()) * 31) + this.assigner.hashCode();
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
        public InstrumentedType prepare(InstrumentedType instrumentedType) {
            return instrumentedType;
        }

        protected MethodCall(MethodDescription methodDescription, Assigner assigner) {
            this.accessorMethod = methodDescription;
            this.assigner = assigner;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation
        public ByteCodeAppender appender(Implementation.Target target) {
            return new Appender(target.getInstrumentedType());
        }

        @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
        protected class Appender implements ByteCodeAppender {
            private final TypeDescription instrumentedType;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                Appender appender = (Appender) obj;
                return this.instrumentedType.equals(appender.instrumentedType) && MethodCall.this.equals(MethodCall.this);
            }

            public int hashCode() {
                return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.instrumentedType.hashCode()) * 31) + MethodCall.this.hashCode();
            }

            private Appender(TypeDescription typeDescription) {
                this.instrumentedType = typeDescription;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.ByteCodeAppender
            public ByteCodeAppender.Size apply(MethodVisitor methodVisitor, Implementation.Context context, MethodDescription methodDescription) {
                FieldList<FieldDescription.InDefinedShape> declaredFields = this.instrumentedType.getDeclaredFields();
                ArrayList arrayList = new ArrayList(declaredFields.size());
                Iterator it = declaredFields.iterator();
                while (it.hasNext()) {
                    arrayList.add(new StackManipulation.Compound(MethodVariableAccess.loadThis(), FieldAccess.forField((FieldDescription) it.next()).read()));
                }
                return new ByteCodeAppender.Size(new StackManipulation.Compound(new StackManipulation.Compound(arrayList), MethodInvocation.invoke(MethodCall.this.accessorMethod), MethodCall.this.assigner.assign(MethodCall.this.accessorMethod.getReturnType(), methodDescription.getReturnType(), Assigner.Typing.DYNAMIC), MethodReturn.of(methodDescription.getReturnType())).apply(methodVisitor, context).getMaximalSize(), methodDescription.getStackSize());
            }
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class AssignableSignatureCall implements StackManipulation {
        private final boolean serializable;
        private final Implementation.SpecialMethodInvocation specialMethodInvocation;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AssignableSignatureCall assignableSignatureCall = (AssignableSignatureCall) obj;
            return this.specialMethodInvocation.equals(assignableSignatureCall.specialMethodInvocation) && this.serializable == assignableSignatureCall.serializable;
        }

        public int hashCode() {
            return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.specialMethodInvocation.hashCode()) * 31) + (this.serializable ? 1 : 0);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
        public boolean isValid() {
            return true;
        }

        public AssignableSignatureCall(Implementation.SpecialMethodInvocation specialMethodInvocation, boolean z) {
            this.specialMethodInvocation = specialMethodInvocation;
            this.serializable = z;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
        public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
            TypeDescription register = context.register(new MethodCallProxy(this.specialMethodInvocation, this.serializable));
            return new StackManipulation.Compound(TypeCreation.of(register), Duplication.SINGLE, MethodVariableAccess.allArgumentsOf(this.specialMethodInvocation.getMethodDescription()).prependThisReference(), MethodInvocation.invoke((MethodDescription.InDefinedShape) register.getDeclaredMethods().filter(ElementMatchers.isConstructor()).getOnly())).apply(methodVisitor, context);
        }
    }
}
