package org.modelmapper.internal.bytebuddy.implementation;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.lang.reflect.Field;
import org.modelmapper.internal.asm.MethodVisitor;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.field.FieldDescription;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.method.ParameterDescription;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.FieldLocator;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType;
import org.modelmapper.internal.bytebuddy.implementation.Implementation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.ByteCodeAppender;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.assign.Assigner;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.FieldAccess;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodReturn;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodVariableAccess;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes4.dex */
public abstract class FieldAccessor implements Implementation {
    protected final Assigner assigner;
    protected final FieldLocation fieldLocation;
    protected final Assigner.Typing typing;

    public interface AssignerConfigurable extends PropertyConfigurable {
        PropertyConfigurable withAssigner(Assigner assigner, Assigner.Typing typing);
    }

    public interface OwnerTypeLocatable extends AssignerConfigurable {
        AssignerConfigurable in(Class<?> cls);

        AssignerConfigurable in(TypeDescription typeDescription);

        AssignerConfigurable in(FieldLocator.Factory factory);
    }

    public interface PropertyConfigurable extends Implementation {
        Implementation.Composable setsArgumentAt(int i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FieldAccessor fieldAccessor = (FieldAccessor) obj;
        return this.fieldLocation.equals(fieldAccessor.fieldLocation) && this.assigner.equals(fieldAccessor.assigner) && this.typing.equals(fieldAccessor.typing);
    }

    public int hashCode() {
        return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.fieldLocation.hashCode()) * 31) + this.assigner.hashCode()) * 31) + this.typing.hashCode();
    }

    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
    public InstrumentedType prepare(InstrumentedType instrumentedType) {
        return instrumentedType;
    }

    protected FieldAccessor(FieldLocation fieldLocation, Assigner assigner, Assigner.Typing typing) {
        this.fieldLocation = fieldLocation;
        this.assigner = assigner;
        this.typing = typing;
    }

    public static OwnerTypeLocatable ofField(String str) {
        return of(new FieldNameExtractor.ForFixedValue(str));
    }

    public static OwnerTypeLocatable ofBeanProperty() {
        return of(FieldNameExtractor.ForBeanProperty.INSTANCE);
    }

    public static OwnerTypeLocatable of(FieldNameExtractor fieldNameExtractor) {
        return new ForImplicitProperty(new FieldLocation.Relative(fieldNameExtractor));
    }

    public static AssignerConfigurable of(Field field) {
        return of(new FieldDescription.ForLoadedField(field));
    }

    public static AssignerConfigurable of(FieldDescription fieldDescription) {
        return new ForImplicitProperty(new FieldLocation.Absolute(fieldDescription));
    }

    protected StackManipulation getter(FieldDescription fieldDescription, MethodDescription methodDescription) {
        return access(fieldDescription, methodDescription, new StackManipulation.Compound(FieldAccess.forField(fieldDescription).read(), this.assigner.assign(fieldDescription.getType(), methodDescription.getReturnType(), this.typing)));
    }

    protected StackManipulation setter(FieldDescription fieldDescription, ParameterDescription parameterDescription) {
        if (fieldDescription.isFinal() && parameterDescription.getDeclaringMethod().isMethod()) {
            throw new IllegalArgumentException("Cannot set final field " + fieldDescription + " from " + parameterDescription.getDeclaringMethod());
        }
        return access(fieldDescription, parameterDescription.getDeclaringMethod(), new StackManipulation.Compound(MethodVariableAccess.load(parameterDescription), this.assigner.assign(parameterDescription.getType(), fieldDescription.getType(), this.typing), FieldAccess.forField(fieldDescription).write()));
    }

    private StackManipulation access(FieldDescription fieldDescription, MethodDescription methodDescription, StackManipulation stackManipulation) {
        if (!stackManipulation.isValid()) {
            throw new IllegalStateException("Incompatible type of " + fieldDescription + " and " + methodDescription);
        }
        if (methodDescription.isStatic() && !fieldDescription.isStatic()) {
            throw new IllegalArgumentException("Cannot call instance field " + fieldDescription + " from static method " + methodDescription);
        }
        StackManipulation[] stackManipulationArr = new StackManipulation[2];
        stackManipulationArr[0] = fieldDescription.isStatic() ? StackManipulation.Trivial.INSTANCE : MethodVariableAccess.loadThis();
        stackManipulationArr[1] = stackManipulation;
        return new StackManipulation.Compound(stackManipulationArr);
    }

    protected interface FieldLocation {

        public interface Prepared {
            FieldDescription resolve(MethodDescription methodDescription);
        }

        Prepared prepare(TypeDescription typeDescription);

        FieldLocation with(FieldLocator.Factory factory);

        @HashCodeAndEqualsPlugin.Enhance
        public static class Absolute implements FieldLocation, Prepared {
            private final FieldDescription fieldDescription;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.fieldDescription.equals(((Absolute) obj).fieldDescription);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.fieldDescription.hashCode();
            }

            protected Absolute(FieldDescription fieldDescription) {
                this.fieldDescription = fieldDescription;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.FieldAccessor.FieldLocation
            public FieldLocation with(FieldLocator.Factory factory) {
                throw new IllegalStateException("Cannot specify a field locator factory for an absolute field location");
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.FieldAccessor.FieldLocation
            public Prepared prepare(TypeDescription typeDescription) {
                if (!typeDescription.isAssignableTo(this.fieldDescription.getDeclaringType().asErasure())) {
                    throw new IllegalStateException(this.fieldDescription + " is not declared by " + typeDescription);
                }
                if (this.fieldDescription.isVisibleTo(typeDescription)) {
                    return this;
                }
                throw new IllegalStateException("Cannot access " + this.fieldDescription + " from " + typeDescription);
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.FieldAccessor.FieldLocation.Prepared
            public FieldDescription resolve(MethodDescription methodDescription) {
                return this.fieldDescription;
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class Relative implements FieldLocation {
            private final FieldLocator.Factory fieldLocatorFactory;
            private final FieldNameExtractor fieldNameExtractor;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                Relative relative = (Relative) obj;
                return this.fieldNameExtractor.equals(relative.fieldNameExtractor) && this.fieldLocatorFactory.equals(relative.fieldLocatorFactory);
            }

            public int hashCode() {
                return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.fieldNameExtractor.hashCode()) * 31) + this.fieldLocatorFactory.hashCode();
            }

            protected Relative(FieldNameExtractor fieldNameExtractor) {
                this(fieldNameExtractor, FieldLocator.ForClassHierarchy.Factory.INSTANCE);
            }

            private Relative(FieldNameExtractor fieldNameExtractor, FieldLocator.Factory factory) {
                this.fieldNameExtractor = fieldNameExtractor;
                this.fieldLocatorFactory = factory;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.FieldAccessor.FieldLocation
            public FieldLocation with(FieldLocator.Factory factory) {
                return new Relative(this.fieldNameExtractor, factory);
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.FieldAccessor.FieldLocation
            public Prepared prepare(TypeDescription typeDescription) {
                return new Prepared(this.fieldNameExtractor, this.fieldLocatorFactory.make(typeDescription));
            }

            @HashCodeAndEqualsPlugin.Enhance
            protected static class Prepared implements Prepared {
                private final FieldLocator fieldLocator;
                private final FieldNameExtractor fieldNameExtractor;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    Prepared prepared = (Prepared) obj;
                    return this.fieldNameExtractor.equals(prepared.fieldNameExtractor) && this.fieldLocator.equals(prepared.fieldLocator);
                }

                public int hashCode() {
                    return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.fieldNameExtractor.hashCode()) * 31) + this.fieldLocator.hashCode();
                }

                protected Prepared(FieldNameExtractor fieldNameExtractor, FieldLocator fieldLocator) {
                    this.fieldNameExtractor = fieldNameExtractor;
                    this.fieldLocator = fieldLocator;
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.FieldAccessor.FieldLocation.Prepared
                public FieldDescription resolve(MethodDescription methodDescription) {
                    FieldLocator.Resolution locate = this.fieldLocator.locate(this.fieldNameExtractor.resolve(methodDescription));
                    if (!locate.isResolved()) {
                        throw new IllegalStateException("Cannot resolve field for " + methodDescription + " using " + this.fieldLocator);
                    }
                    return locate.getField();
                }
            }
        }
    }

    public interface FieldNameExtractor {
        String resolve(MethodDescription methodDescription);

        public enum ForBeanProperty implements FieldNameExtractor {
            INSTANCE;

            @Override // org.modelmapper.internal.bytebuddy.implementation.FieldAccessor.FieldNameExtractor
            public String resolve(MethodDescription methodDescription) {
                int i;
                String internalName = methodDescription.getInternalName();
                if (internalName.startsWith("get") || internalName.startsWith("set")) {
                    i = 3;
                } else {
                    if (!internalName.startsWith("is")) {
                        throw new IllegalArgumentException(methodDescription + " does not follow Java bean naming conventions");
                    }
                    i = 2;
                }
                String substring = internalName.substring(i);
                if (substring.length() == 0) {
                    throw new IllegalArgumentException(methodDescription + " does not specify a bean name");
                }
                return Character.toLowerCase(substring.charAt(0)) + substring.substring(1);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForFixedValue implements FieldNameExtractor {
            private final String name;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.name.equals(((ForFixedValue) obj).name);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.name.hashCode();
            }

            protected ForFixedValue(String str) {
                this.name = str;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.FieldAccessor.FieldNameExtractor
            public String resolve(MethodDescription methodDescription) {
                return this.name;
            }
        }
    }

    protected static class ForImplicitProperty extends FieldAccessor implements OwnerTypeLocatable {
        protected ForImplicitProperty(FieldLocation fieldLocation) {
            this(fieldLocation, Assigner.DEFAULT, Assigner.Typing.STATIC);
        }

        private ForImplicitProperty(FieldLocation fieldLocation, Assigner assigner, Assigner.Typing typing) {
            super(fieldLocation, assigner, typing);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation
        public ByteCodeAppender appender(Implementation.Target target) {
            return new Appender(this.fieldLocation.prepare(target.getInstrumentedType()));
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.FieldAccessor.PropertyConfigurable
        public Implementation.Composable setsArgumentAt(int i) {
            if (i < 0) {
                throw new IllegalArgumentException("A parameter index cannot be negative: " + i);
            }
            return new ForParameterSetter(this.fieldLocation, this.assigner, this.typing, i);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.FieldAccessor.AssignerConfigurable
        public PropertyConfigurable withAssigner(Assigner assigner, Assigner.Typing typing) {
            return new ForImplicitProperty(this.fieldLocation, assigner, typing);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.FieldAccessor.OwnerTypeLocatable
        public AssignerConfigurable in(Class<?> cls) {
            return in(TypeDescription.ForLoadedType.of(cls));
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.FieldAccessor.OwnerTypeLocatable
        public AssignerConfigurable in(TypeDescription typeDescription) {
            return in(new FieldLocator.ForExactType.Factory(typeDescription));
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.FieldAccessor.OwnerTypeLocatable
        public AssignerConfigurable in(FieldLocator.Factory factory) {
            return new ForImplicitProperty(this.fieldLocation.with(factory), this.assigner, this.typing);
        }

        @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
        protected class Appender implements ByteCodeAppender {
            private final FieldLocation.Prepared fieldLocation;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                Appender appender = (Appender) obj;
                return this.fieldLocation.equals(appender.fieldLocation) && ForImplicitProperty.this.equals(ForImplicitProperty.this);
            }

            public int hashCode() {
                return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.fieldLocation.hashCode()) * 31) + ForImplicitProperty.this.hashCode();
            }

            protected Appender(FieldLocation.Prepared prepared) {
                this.fieldLocation = prepared;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.ByteCodeAppender
            public ByteCodeAppender.Size apply(MethodVisitor methodVisitor, Implementation.Context context, MethodDescription methodDescription) {
                StackManipulation.Compound compound;
                if (!methodDescription.isMethod()) {
                    throw new IllegalArgumentException(methodDescription + " does not describe a field getter or setter");
                }
                FieldDescription resolve = this.fieldLocation.resolve(methodDescription);
                if (!methodDescription.getReturnType().represents(Void.TYPE)) {
                    compound = new StackManipulation.Compound(ForImplicitProperty.this.getter(resolve, methodDescription), MethodReturn.of(methodDescription.getReturnType()));
                } else if (methodDescription.getReturnType().represents(Void.TYPE) && methodDescription.getParameters().size() == 1) {
                    compound = new StackManipulation.Compound(ForImplicitProperty.this.setter(resolve, (ParameterDescription) methodDescription.getParameters().get(0)), MethodReturn.VOID);
                } else {
                    throw new IllegalArgumentException("Method " + context + " is no bean property");
                }
                return new ByteCodeAppender.Size(compound.apply(methodVisitor, context).getMaximalSize(), methodDescription.getStackSize());
            }
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    protected static class ForParameterSetter extends FieldAccessor implements Implementation.Composable {
        private final int index;
        private final TerminationHandler terminationHandler;

        protected enum TerminationHandler {
            RETURNING { // from class: org.modelmapper.internal.bytebuddy.implementation.FieldAccessor.ForParameterSetter.TerminationHandler.1
                @Override // org.modelmapper.internal.bytebuddy.implementation.FieldAccessor.ForParameterSetter.TerminationHandler
                protected StackManipulation resolve(MethodDescription methodDescription) {
                    if (!methodDescription.getReturnType().represents(Void.TYPE)) {
                        throw new IllegalStateException("Cannot implement setter with return value for " + methodDescription);
                    }
                    return MethodReturn.VOID;
                }
            },
            NON_OPERATIONAL { // from class: org.modelmapper.internal.bytebuddy.implementation.FieldAccessor.ForParameterSetter.TerminationHandler.2
                @Override // org.modelmapper.internal.bytebuddy.implementation.FieldAccessor.ForParameterSetter.TerminationHandler
                protected StackManipulation resolve(MethodDescription methodDescription) {
                    return StackManipulation.Trivial.INSTANCE;
                }
            };

            protected abstract StackManipulation resolve(MethodDescription methodDescription);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.FieldAccessor
        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ForParameterSetter forParameterSetter = (ForParameterSetter) obj;
            return this.index == forParameterSetter.index && this.terminationHandler.equals(forParameterSetter.terminationHandler);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.FieldAccessor
        public int hashCode() {
            return (((super.hashCode() * 31) + this.index) * 31) + this.terminationHandler.hashCode();
        }

        protected ForParameterSetter(FieldLocation fieldLocation, Assigner assigner, Assigner.Typing typing, int i) {
            this(fieldLocation, assigner, typing, i, TerminationHandler.RETURNING);
        }

        private ForParameterSetter(FieldLocation fieldLocation, Assigner assigner, Assigner.Typing typing, int i, TerminationHandler terminationHandler) {
            super(fieldLocation, assigner, typing);
            this.index = i;
            this.terminationHandler = terminationHandler;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation
        public ByteCodeAppender appender(Implementation.Target target) {
            return new Appender(this.fieldLocation.prepare(target.getInstrumentedType()));
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation.Composable
        public Implementation andThen(Implementation implementation) {
            return new Implementation.Compound(new ForParameterSetter(this.fieldLocation, this.assigner, this.typing, this.index, TerminationHandler.NON_OPERATIONAL), implementation);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation.Composable
        public Implementation.Composable andThen(Implementation.Composable composable) {
            return new Implementation.Compound.Composable(new ForParameterSetter(this.fieldLocation, this.assigner, this.typing, this.index, TerminationHandler.NON_OPERATIONAL), composable);
        }

        @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
        protected class Appender implements ByteCodeAppender {
            private final FieldLocation.Prepared fieldLocation;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                Appender appender = (Appender) obj;
                return this.fieldLocation.equals(appender.fieldLocation) && ForParameterSetter.this.equals(ForParameterSetter.this);
            }

            public int hashCode() {
                return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.fieldLocation.hashCode()) * 31) + ForParameterSetter.this.hashCode();
            }

            protected Appender(FieldLocation.Prepared prepared) {
                this.fieldLocation = prepared;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.ByteCodeAppender
            public ByteCodeAppender.Size apply(MethodVisitor methodVisitor, Implementation.Context context, MethodDescription methodDescription) {
                if (methodDescription.getParameters().size() <= ForParameterSetter.this.index) {
                    throw new IllegalStateException(methodDescription + " does not define a parameter with index " + ForParameterSetter.this.index);
                }
                return new ByteCodeAppender.Size(new StackManipulation.Compound(ForParameterSetter.this.setter(this.fieldLocation.resolve(methodDescription), (ParameterDescription) methodDescription.getParameters().get(ForParameterSetter.this.index)), ForParameterSetter.this.terminationHandler.resolve(methodDescription)).apply(methodVisitor, context).getMaximalSize(), methodDescription.getStackSize());
            }
        }
    }
}
