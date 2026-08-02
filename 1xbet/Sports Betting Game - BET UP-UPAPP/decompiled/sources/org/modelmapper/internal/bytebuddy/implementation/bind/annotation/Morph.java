package org.modelmapper.internal.bytebuddy.implementation.bind.annotation;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.Serializable;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.modelmapper.internal.asm.MethodVisitor;
import org.modelmapper.internal.bytebuddy.ByteBuddy;
import org.modelmapper.internal.bytebuddy.ClassFileVersion;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.annotation.AnnotationDescription;
import org.modelmapper.internal.bytebuddy.description.field.FieldDescription;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.method.MethodList;
import org.modelmapper.internal.bytebuddy.description.method.ParameterDescription;
import org.modelmapper.internal.bytebuddy.description.modifier.ModifierContributor;
import org.modelmapper.internal.bytebuddy.description.type.TypeDefinition;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
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
import org.modelmapper.internal.bytebuddy.implementation.bytecode.collection.ArrayAccess;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.IntegerConstant;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.FieldAccess;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodInvocation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodReturn;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodVariableAccess;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatchers;

@Target({ElementType.PARAMETER})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes4.dex */
public @interface Morph {
    boolean defaultMethod() default false;

    Class<?> defaultTarget() default void.class;

    boolean serializableProxy() default false;

    @HashCodeAndEqualsPlugin.Enhance
    public static class Binder implements TargetMethodAnnotationDrivenBinder.ParameterBinder<Morph> {
        private static final MethodDescription.InDefinedShape DEFAULT_METHOD;
        private static final MethodDescription.InDefinedShape DEFAULT_TARGET;
        private static final MethodDescription.InDefinedShape SERIALIZABLE_PROXY;
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

        static {
            MethodList<MethodDescription.InDefinedShape> declaredMethods = TypeDescription.ForLoadedType.of(Morph.class).getDeclaredMethods();
            SERIALIZABLE_PROXY = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named("serializableProxy")).getOnly();
            DEFAULT_METHOD = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named("defaultMethod")).getOnly();
            DEFAULT_TARGET = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named("defaultTarget")).getOnly();
        }

        protected Binder(MethodDescription methodDescription) {
            this.forwardingMethod = methodDescription;
        }

        public static TargetMethodAnnotationDrivenBinder.ParameterBinder<Morph> install(Class<?> cls) {
            return install(TypeDescription.ForLoadedType.of(cls));
        }

        public static TargetMethodAnnotationDrivenBinder.ParameterBinder<Morph> install(TypeDescription typeDescription) {
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
            if (methodDescription.getParameters().size() == 1 && ((ParameterDescription) methodDescription.getParameters().get(0)).getType().asErasure().represents(Object[].class)) {
                return methodDescription;
            }
            throw new IllegalArgumentException(methodDescription + " does not take a single argument of type Object[]");
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public Class<Morph> getHandledType() {
            return Morph.class;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public MethodDelegationBinder.ParameterBinding<?> bind(AnnotationDescription.Loadable<Morph> loadable, MethodDescription methodDescription, ParameterDescription parameterDescription, Implementation.Target target, Assigner assigner, Assigner.Typing typing) {
            Implementation.SpecialMethodInvocation resolve;
            if (!parameterDescription.getType().asErasure().equals(this.forwardingMethod.getDeclaringType())) {
                throw new IllegalStateException("Illegal use of @Morph for " + parameterDescription + " which was installed for " + this.forwardingMethod.getDeclaringType());
            }
            TypeDescription typeDescription = (TypeDescription) loadable.getValue(DEFAULT_TARGET).resolve(TypeDescription.class);
            if (typeDescription.represents(Void.TYPE) && !((Boolean) loadable.getValue(DEFAULT_METHOD).resolve(Boolean.class)).booleanValue()) {
                resolve = target.invokeSuper(methodDescription.asSignatureToken());
            } else {
                resolve = (typeDescription.represents(Void.TYPE) ? DefaultMethodLocator.Implicit.INSTANCE : new DefaultMethodLocator.Explicit(typeDescription)).resolve(target, methodDescription);
            }
            Implementation.SpecialMethodInvocation specialMethodInvocation = resolve;
            return specialMethodInvocation.isValid() ? new MethodDelegationBinder.ParameterBinding.Anonymous(new RedirectionProxy(this.forwardingMethod.getDeclaringType().asErasure(), target.getInstrumentedType(), specialMethodInvocation, assigner, ((Boolean) loadable.getValue(SERIALIZABLE_PROXY).resolve(Boolean.class)).booleanValue())) : MethodDelegationBinder.ParameterBinding.Illegal.INSTANCE;
        }

        protected interface DefaultMethodLocator {
            Implementation.SpecialMethodInvocation resolve(Implementation.Target target, MethodDescription methodDescription);

            public enum Implicit implements DefaultMethodLocator {
                INSTANCE;

                @Override // org.modelmapper.internal.bytebuddy.implementation.bind.annotation.Morph.Binder.DefaultMethodLocator
                public Implementation.SpecialMethodInvocation resolve(Implementation.Target target, MethodDescription methodDescription) {
                    return target.invokeDefault(methodDescription.asSignatureToken());
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class Explicit implements DefaultMethodLocator {
                private final TypeDescription typeDescription;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.typeDescription.equals(((Explicit) obj).typeDescription);
                }

                public int hashCode() {
                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.typeDescription.hashCode();
                }

                public Explicit(TypeDescription typeDescription) {
                    this.typeDescription = typeDescription;
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.bind.annotation.Morph.Binder.DefaultMethodLocator
                public Implementation.SpecialMethodInvocation resolve(Implementation.Target target, MethodDescription methodDescription) {
                    if (!this.typeDescription.isInterface()) {
                        throw new IllegalStateException(methodDescription + " method carries default method call parameter on non-interface type");
                    }
                    return target.invokeDefault(methodDescription.asSignatureToken(), this.typeDescription);
                }
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        protected static class RedirectionProxy implements AuxiliaryType, StackManipulation {
            protected static final String FIELD_NAME = "target";
            private final Assigner assigner;
            private final TypeDescription instrumentedType;
            private final TypeDescription morphingType;
            private final boolean serializableProxy;
            private final Implementation.SpecialMethodInvocation specialMethodInvocation;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                RedirectionProxy redirectionProxy = (RedirectionProxy) obj;
                return this.morphingType.equals(redirectionProxy.morphingType) && this.instrumentedType.equals(redirectionProxy.instrumentedType) && this.specialMethodInvocation.equals(redirectionProxy.specialMethodInvocation) && this.assigner.equals(redirectionProxy.assigner) && this.serializableProxy == redirectionProxy.serializableProxy;
            }

            public int hashCode() {
                return ((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.morphingType.hashCode()) * 31) + this.instrumentedType.hashCode()) * 31) + this.specialMethodInvocation.hashCode()) * 31) + this.assigner.hashCode()) * 31) + (this.serializableProxy ? 1 : 0);
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public boolean isValid() {
                return true;
            }

            protected RedirectionProxy(TypeDescription typeDescription, TypeDescription typeDescription2, Implementation.SpecialMethodInvocation specialMethodInvocation, Assigner assigner, boolean z) {
                this.morphingType = typeDescription;
                this.instrumentedType = typeDescription2;
                this.specialMethodInvocation = specialMethodInvocation;
                this.assigner = assigner;
                this.serializableProxy = z;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.auxiliary.AuxiliaryType
            public DynamicType make(String str, ClassFileVersion classFileVersion, MethodAccessorFactory methodAccessorFactory) {
                List singletonList;
                DynamicType.Builder.MethodDefinition.ParameterDefinition.Initial<?> defineConstructor = new ByteBuddy(classFileVersion).with(TypeValidation.DISABLED).subclass(this.morphingType, ConstructorStrategy.Default.NO_CONSTRUCTORS).name(str).modifiers(DEFAULT_TYPE_MODIFIER).implement(this.serializableProxy ? new Class[]{Serializable.class} : new Class[0]).defineConstructor(new ModifierContributor.ForMethod[0]);
                if (this.specialMethodInvocation.getMethodDescription().isStatic()) {
                    singletonList = Collections.emptyList();
                } else {
                    singletonList = Collections.singletonList(this.instrumentedType);
                }
                return defineConstructor.withParameters((Collection<? extends TypeDefinition>) singletonList).intercept(this.specialMethodInvocation.getMethodDescription().isStatic() ? StaticFieldConstructor.INSTANCE : new InstanceFieldConstructor(this.instrumentedType)).method(ElementMatchers.isAbstract().and(ElementMatchers.isDeclaredBy(this.morphingType))).intercept(new MethodCall(methodAccessorFactory.registerAccessorFor(this.specialMethodInvocation, MethodAccessorFactory.AccessType.DEFAULT), this.assigner)).make();
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
                TypeDescription register = context.register(this);
                StackManipulation[] stackManipulationArr = new StackManipulation[4];
                stackManipulationArr[0] = TypeCreation.of(register);
                stackManipulationArr[1] = Duplication.SINGLE;
                stackManipulationArr[2] = this.specialMethodInvocation.getMethodDescription().isStatic() ? StackManipulation.Trivial.INSTANCE : MethodVariableAccess.loadThis();
                stackManipulationArr[3] = MethodInvocation.invoke((MethodDescription.InDefinedShape) register.getDeclaredMethods().filter(ElementMatchers.isConstructor()).getOnly());
                return new StackManipulation.Compound(stackManipulationArr).apply(methodVisitor, context);
            }

            protected enum StaticFieldConstructor implements Implementation {
                INSTANCE;

                private final MethodDescription objectTypeDefaultConstructor = (MethodDescription) TypeDescription.OBJECT.getDeclaredMethods().filter(ElementMatchers.isConstructor()).getOnly();

                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public InstrumentedType prepare(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }

                StaticFieldConstructor() {
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation
                public ByteCodeAppender appender(Implementation.Target target) {
                    return new ByteCodeAppender.Simple(MethodVariableAccess.loadThis(), MethodInvocation.invoke(this.objectTypeDefaultConstructor), MethodReturn.VOID);
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            protected static class InstanceFieldConstructor implements Implementation {
                private final TypeDescription instrumentedType;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.instrumentedType.equals(((InstanceFieldConstructor) obj).instrumentedType);
                }

                public int hashCode() {
                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.instrumentedType.hashCode();
                }

                protected InstanceFieldConstructor(TypeDescription typeDescription) {
                    this.instrumentedType = typeDescription;
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public InstrumentedType prepare(InstrumentedType instrumentedType) {
                    return instrumentedType.withField(new FieldDescription.Token("target", 18, this.instrumentedType.asGenericType()));
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation
                public ByteCodeAppender appender(Implementation.Target target) {
                    return new Appender(target);
                }

                @HashCodeAndEqualsPlugin.Enhance
                protected static class Appender implements ByteCodeAppender {
                    private final FieldDescription fieldDescription;

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return obj != null && getClass() == obj.getClass() && this.fieldDescription.equals(((Appender) obj).fieldDescription);
                    }

                    public int hashCode() {
                        return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.fieldDescription.hashCode();
                    }

                    protected Appender(Implementation.Target target) {
                        this.fieldDescription = (FieldDescription) target.getInstrumentedType().getDeclaredFields().filter(ElementMatchers.named("target")).getOnly();
                    }

                    @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.ByteCodeAppender
                    public ByteCodeAppender.Size apply(MethodVisitor methodVisitor, Implementation.Context context, MethodDescription methodDescription) {
                        return new ByteCodeAppender.Size(new StackManipulation.Compound(MethodVariableAccess.loadThis(), MethodInvocation.invoke(StaticFieldConstructor.INSTANCE.objectTypeDefaultConstructor), MethodVariableAccess.allArgumentsOf(methodDescription).prependThisReference(), FieldAccess.forField(this.fieldDescription).write(), MethodReturn.VOID).apply(methodVisitor, context).getMaximalSize(), methodDescription.getStackSize());
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
                    return new Appender(target);
                }

                @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
                protected class Appender implements ByteCodeAppender {
                    private final TypeDescription typeDescription;

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        Appender appender = (Appender) obj;
                        return this.typeDescription.equals(appender.typeDescription) && MethodCall.this.equals(MethodCall.this);
                    }

                    public int hashCode() {
                        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.typeDescription.hashCode()) * 31) + MethodCall.this.hashCode();
                    }

                    protected Appender(Implementation.Target target) {
                        this.typeDescription = target.getInstrumentedType();
                    }

                    @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.ByteCodeAppender
                    public ByteCodeAppender.Size apply(MethodVisitor methodVisitor, Implementation.Context context, MethodDescription methodDescription) {
                        StackManipulation loadFrom = MethodVariableAccess.REFERENCE.loadFrom(1);
                        StackManipulation[] stackManipulationArr = new StackManipulation[MethodCall.this.accessorMethod.getParameters().size()];
                        Iterator it = MethodCall.this.accessorMethod.getParameters().asTypeList().iterator();
                        int i = 0;
                        while (it.hasNext()) {
                            stackManipulationArr[i] = new StackManipulation.Compound(loadFrom, IntegerConstant.forValue(i), ArrayAccess.REFERENCE.load(), MethodCall.this.assigner.assign(TypeDescription.Generic.OBJECT, (TypeDescription.Generic) it.next(), Assigner.Typing.DYNAMIC));
                            i++;
                        }
                        StackManipulation[] stackManipulationArr2 = new StackManipulation[5];
                        stackManipulationArr2[0] = MethodCall.this.accessorMethod.isStatic() ? StackManipulation.Trivial.INSTANCE : new StackManipulation.Compound(MethodVariableAccess.loadThis(), FieldAccess.forField((FieldDescription.InDefinedShape) this.typeDescription.getDeclaredFields().filter(ElementMatchers.named("target")).getOnly()).read());
                        stackManipulationArr2[1] = new StackManipulation.Compound(stackManipulationArr);
                        stackManipulationArr2[2] = MethodInvocation.invoke(MethodCall.this.accessorMethod);
                        stackManipulationArr2[3] = MethodCall.this.assigner.assign(MethodCall.this.accessorMethod.getReturnType(), methodDescription.getReturnType(), Assigner.Typing.DYNAMIC);
                        stackManipulationArr2[4] = MethodReturn.REFERENCE;
                        return new ByteCodeAppender.Size(new StackManipulation.Compound(stackManipulationArr2).apply(methodVisitor, context).getMaximalSize(), methodDescription.getStackSize());
                    }
                }
            }
        }
    }
}
