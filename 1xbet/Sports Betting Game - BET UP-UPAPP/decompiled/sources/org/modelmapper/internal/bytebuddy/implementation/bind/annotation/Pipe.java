package org.modelmapper.internal.bytebuddy.implementation.bind.annotation;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.Serializable;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.modelmapper.internal.asm.MethodVisitor;
import org.modelmapper.internal.bytebuddy.ByteBuddy;
import org.modelmapper.internal.bytebuddy.ClassFileVersion;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.annotation.AnnotationDescription;
import org.modelmapper.internal.bytebuddy.description.field.FieldDescription;
import org.modelmapper.internal.bytebuddy.description.field.FieldList;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.method.MethodList;
import org.modelmapper.internal.bytebuddy.description.method.ParameterDescription;
import org.modelmapper.internal.bytebuddy.description.modifier.ModifierContributor;
import org.modelmapper.internal.bytebuddy.description.modifier.Visibility;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.description.type.TypeList;
import org.modelmapper.internal.bytebuddy.dynamic.DynamicType;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeValidation;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy;
import org.modelmapper.internal.bytebuddy.implementation.Implementation;
import org.modelmapper.internal.bytebuddy.implementation.MethodAccessorFactory;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.AuxiliaryType;
import org.modelmapper.internal.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.modelmapper.internal.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder;
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

@Target({ElementType.PARAMETER})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes4.dex */
public @interface Pipe {
    boolean serializableProxy() default false;

    @HashCodeAndEqualsPlugin.Enhance
    public static class Binder implements TargetMethodAnnotationDrivenBinder.ParameterBinder<Pipe> {
        private final MethodDescription forwardingMethod;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.forwardingMethod.equals(((Binder) obj).forwardingMethod);
        }

        public int hashCode() {
            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.forwardingMethod.hashCode();
        }

        protected Binder(MethodDescription methodDescription) {
            this.forwardingMethod = methodDescription;
        }

        public static TargetMethodAnnotationDrivenBinder.ParameterBinder<Pipe> install(Class<?> cls) {
            return install(TypeDescription.ForLoadedType.of(cls));
        }

        public static TargetMethodAnnotationDrivenBinder.ParameterBinder<Pipe> install(TypeDescription typeDescription) {
            return new Binder(onlyMethod(typeDescription));
        }

        private static MethodDescription onlyMethod(TypeDescription typeDescription) {
            if (!typeDescription.isInterface()) {
                throw new IllegalArgumentException(typeDescription + " is not an interface");
            }
            if (!typeDescription.getInterfaces().isEmpty()) {
                throw new IllegalArgumentException(typeDescription + " must not extend other interfaces");
            }
            if (!typeDescription.isPublic()) {
                throw new IllegalArgumentException(typeDescription + " is mot public");
            }
            MethodList filter = typeDescription.getDeclaredMethods().filter(ElementMatchers.isAbstract());
            if (filter.size() != 1) {
                throw new IllegalArgumentException(typeDescription + " must declare exactly one abstract method");
            }
            MethodDescription methodDescription = (MethodDescription) filter.getOnly();
            if (!methodDescription.getReturnType().asErasure().represents(Object.class)) {
                throw new IllegalArgumentException(methodDescription + " does not return an Object-type");
            }
            if (methodDescription.getParameters().size() == 1 && ((ParameterDescription) methodDescription.getParameters().getOnly()).getType().asErasure().represents(Object.class)) {
                return methodDescription;
            }
            throw new IllegalArgumentException(methodDescription + " does not take a single Object-typed argument");
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public Class<Pipe> getHandledType() {
            return Pipe.class;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public MethodDelegationBinder.ParameterBinding<?> bind(AnnotationDescription.Loadable<Pipe> loadable, MethodDescription methodDescription, ParameterDescription parameterDescription, Implementation.Target target, Assigner assigner, Assigner.Typing typing) {
            if (!parameterDescription.getType().asErasure().equals(this.forwardingMethod.getDeclaringType())) {
                throw new IllegalStateException("Illegal use of @Pipe for " + parameterDescription + " which was installed for " + this.forwardingMethod.getDeclaringType());
            }
            if (methodDescription.isStatic()) {
                return MethodDelegationBinder.ParameterBinding.Illegal.INSTANCE;
            }
            return new MethodDelegationBinder.ParameterBinding.Anonymous(new Redirection(this.forwardingMethod.getDeclaringType().asErasure(), methodDescription, assigner, loadable.loadSilent().serializableProxy()));
        }

        @HashCodeAndEqualsPlugin.Enhance
        protected static class Redirection implements AuxiliaryType, StackManipulation {
            private static final String FIELD_NAME_PREFIX = "argument";
            private final Assigner assigner;
            private final TypeDescription forwardingType;
            private final boolean serializableProxy;
            private final MethodDescription sourceMethod;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                Redirection redirection = (Redirection) obj;
                return this.forwardingType.equals(redirection.forwardingType) && this.sourceMethod.equals(redirection.sourceMethod) && this.assigner.equals(redirection.assigner) && this.serializableProxy == redirection.serializableProxy;
            }

            public int hashCode() {
                return ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.forwardingType.hashCode()) * 31) + this.sourceMethod.hashCode()) * 31) + this.assigner.hashCode()) * 31) + (this.serializableProxy ? 1 : 0);
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public boolean isValid() {
                return true;
            }

            protected Redirection(TypeDescription typeDescription, MethodDescription methodDescription, Assigner assigner, boolean z) {
                this.forwardingType = typeDescription;
                this.sourceMethod = methodDescription;
                this.assigner = assigner;
                this.serializableProxy = z;
            }

            private static LinkedHashMap<String, TypeDescription> extractFields(MethodDescription methodDescription) {
                TypeList asErasures = methodDescription.getParameters().asTypeList().asErasures();
                LinkedHashMap<String, TypeDescription> linkedHashMap = new LinkedHashMap<>();
                Iterator it = asErasures.iterator();
                int i = 0;
                while (it.hasNext()) {
                    linkedHashMap.put(fieldName(i), (TypeDescription) it.next());
                    i++;
                }
                return linkedHashMap;
            }

            private static String fieldName(int i) {
                return FIELD_NAME_PREFIX + i;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.auxiliary.AuxiliaryType
            public DynamicType make(String str, ClassFileVersion classFileVersion, MethodAccessorFactory methodAccessorFactory) {
                LinkedHashMap<String, TypeDescription> extractFields = extractFields(this.sourceMethod);
                DynamicType.Builder intercept = new ByteBuddy(classFileVersion).with(TypeValidation.DISABLED).subclass(this.forwardingType, ConstructorStrategy.Default.NO_CONSTRUCTORS).name(str).modifiers(DEFAULT_TYPE_MODIFIER).implement(this.serializableProxy ? new Class[]{Serializable.class} : new Class[0]).method(ElementMatchers.isAbstract().and(ElementMatchers.isDeclaredBy(this.forwardingType))).intercept(new MethodCall(this.sourceMethod, this.assigner)).defineConstructor(new ModifierContributor.ForMethod[0]).withParameters(extractFields.values()).intercept(ConstructorCall.INSTANCE);
                for (Map.Entry<String, TypeDescription> entry : extractFields.entrySet()) {
                    intercept = intercept.defineField(entry.getKey(), entry.getValue(), Visibility.PRIVATE);
                }
                return intercept.make();
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
                TypeDescription register = context.register(this);
                return new StackManipulation.Compound(TypeCreation.of(register), Duplication.SINGLE, MethodVariableAccess.allArgumentsOf(this.sourceMethod), MethodInvocation.invoke((MethodDescription.InDefinedShape) register.getDeclaredMethods().filter(ElementMatchers.isConstructor()).getOnly())).apply(methodVisitor, context);
            }

            protected enum ConstructorCall implements Implementation {
                INSTANCE;

                private final MethodDescription.InDefinedShape objectTypeDefaultConstructor = (MethodDescription.InDefinedShape) TypeDescription.OBJECT.getDeclaredMethods().filter(ElementMatchers.isConstructor()).getOnly();

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
                private static class Appender implements ByteCodeAppender {
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
                private final Assigner assigner;
                private final MethodDescription redirectedMethod;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    MethodCall methodCall = (MethodCall) obj;
                    return this.redirectedMethod.equals(methodCall.redirectedMethod) && this.assigner.equals(methodCall.assigner);
                }

                public int hashCode() {
                    return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.redirectedMethod.hashCode()) * 31) + this.assigner.hashCode();
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public InstrumentedType prepare(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }

                private MethodCall(MethodDescription methodDescription, Assigner assigner) {
                    this.redirectedMethod = methodDescription;
                    this.assigner = assigner;
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation
                public ByteCodeAppender appender(Implementation.Target target) {
                    if (!this.redirectedMethod.isAccessibleTo(target.getInstrumentedType())) {
                        throw new IllegalStateException("Cannot invoke " + this.redirectedMethod + " from outside of class via @Pipe proxy");
                    }
                    return new Appender(target.getInstrumentedType());
                }

                @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
                private class Appender implements ByteCodeAppender {
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
                        StackManipulation loadFrom = MethodVariableAccess.of(this.instrumentedType).loadFrom(0);
                        FieldList<FieldDescription.InDefinedShape> declaredFields = this.instrumentedType.getDeclaredFields();
                        StackManipulation[] stackManipulationArr = new StackManipulation[declaredFields.size()];
                        Iterator it = declaredFields.iterator();
                        int i = 0;
                        while (it.hasNext()) {
                            stackManipulationArr[i] = new StackManipulation.Compound(loadFrom, FieldAccess.forField((FieldDescription) it.next()).read());
                            i++;
                        }
                        return new ByteCodeAppender.Size(new StackManipulation.Compound(MethodVariableAccess.REFERENCE.loadFrom(1), MethodCall.this.assigner.assign(TypeDescription.Generic.OBJECT, MethodCall.this.redirectedMethod.getDeclaringType().asGenericType(), Assigner.Typing.DYNAMIC), new StackManipulation.Compound(stackManipulationArr), MethodInvocation.invoke(MethodCall.this.redirectedMethod), MethodCall.this.assigner.assign(MethodCall.this.redirectedMethod.getReturnType(), methodDescription.getReturnType(), Assigner.Typing.DYNAMIC), MethodReturn.REFERENCE).apply(methodVisitor, context).getMaximalSize(), methodDescription.getStackSize());
                    }
                }
            }
        }
    }
}
