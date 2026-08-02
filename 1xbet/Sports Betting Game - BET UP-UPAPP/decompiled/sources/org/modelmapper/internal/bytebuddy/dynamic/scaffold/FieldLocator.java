package org.modelmapper.internal.bytebuddy.dynamic.scaffold;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Iterator;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.field.FieldDescription;
import org.modelmapper.internal.bytebuddy.description.field.FieldList;
import org.modelmapper.internal.bytebuddy.description.type.TypeDefinition;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatcher;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatchers;

/* loaded from: classes4.dex */
public interface FieldLocator {

    public interface Factory {
        FieldLocator make(TypeDescription typeDescription);
    }

    Resolution locate(String str);

    Resolution locate(String str, TypeDescription typeDescription);

    public interface Resolution {
        FieldDescription getField();

        boolean isResolved();

        public enum Illegal implements Resolution {
            INSTANCE;

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.FieldLocator.Resolution
            public boolean isResolved() {
                return false;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.FieldLocator.Resolution
            public FieldDescription getField() {
                throw new IllegalStateException("Could not locate field");
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class Simple implements Resolution {
            private final FieldDescription fieldDescription;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.fieldDescription.equals(((Simple) obj).fieldDescription);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.fieldDescription.hashCode();
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.FieldLocator.Resolution
            public boolean isResolved() {
                return true;
            }

            protected Simple(FieldDescription fieldDescription) {
                this.fieldDescription = fieldDescription;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.FieldLocator.Resolution
            public FieldDescription getField() {
                return this.fieldDescription;
            }
        }
    }

    public enum NoOp implements FieldLocator, Factory {
        INSTANCE;

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.FieldLocator.Factory
        public FieldLocator make(TypeDescription typeDescription) {
            return this;
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.FieldLocator
        public Resolution locate(String str) {
            return Resolution.Illegal.INSTANCE;
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.FieldLocator
        public Resolution locate(String str, TypeDescription typeDescription) {
            return Resolution.Illegal.INSTANCE;
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static abstract class AbstractBase implements FieldLocator {
        protected final TypeDescription accessingType;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.accessingType.equals(((AbstractBase) obj).accessingType);
        }

        public int hashCode() {
            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.accessingType.hashCode();
        }

        protected abstract FieldList<?> locate(ElementMatcher<? super FieldDescription> elementMatcher);

        protected AbstractBase(TypeDescription typeDescription) {
            this.accessingType = typeDescription;
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.FieldLocator
        public Resolution locate(String str) {
            FieldList<?> locate = locate(ElementMatchers.named(str).and(ElementMatchers.isVisibleTo(this.accessingType)));
            return locate.size() == 1 ? new Resolution.Simple((FieldDescription) locate.getOnly()) : Resolution.Illegal.INSTANCE;
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.FieldLocator
        public Resolution locate(String str, TypeDescription typeDescription) {
            FieldList<?> locate = locate(ElementMatchers.named(str).and(ElementMatchers.fieldType(typeDescription)).and(ElementMatchers.isVisibleTo(this.accessingType)));
            return locate.size() == 1 ? new Resolution.Simple((FieldDescription) locate.getOnly()) : Resolution.Illegal.INSTANCE;
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class ForExactType extends AbstractBase {
        private final TypeDescription typeDescription;

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.FieldLocator.AbstractBase
        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.typeDescription.equals(((ForExactType) obj).typeDescription);
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.FieldLocator.AbstractBase
        public int hashCode() {
            return (super.hashCode() * 31) + this.typeDescription.hashCode();
        }

        public ForExactType(TypeDescription typeDescription) {
            this(typeDescription, typeDescription);
        }

        public ForExactType(TypeDescription typeDescription, TypeDescription typeDescription2) {
            super(typeDescription2);
            this.typeDescription = typeDescription;
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.FieldLocator.AbstractBase
        protected FieldList<?> locate(ElementMatcher<? super FieldDescription> elementMatcher) {
            return (FieldList) this.typeDescription.getDeclaredFields().filter(elementMatcher);
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class Factory implements Factory {
            private final TypeDescription typeDescription;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.typeDescription.equals(((Factory) obj).typeDescription);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.typeDescription.hashCode();
            }

            public Factory(TypeDescription typeDescription) {
                this.typeDescription = typeDescription;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.FieldLocator.Factory
            public FieldLocator make(TypeDescription typeDescription) {
                return new ForExactType(this.typeDescription, typeDescription);
            }
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class ForClassHierarchy extends AbstractBase {
        private final TypeDescription typeDescription;

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.FieldLocator.AbstractBase
        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.typeDescription.equals(((ForClassHierarchy) obj).typeDescription);
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.FieldLocator.AbstractBase
        public int hashCode() {
            return (super.hashCode() * 31) + this.typeDescription.hashCode();
        }

        public ForClassHierarchy(TypeDescription typeDescription) {
            this(typeDescription, typeDescription);
        }

        public ForClassHierarchy(TypeDescription typeDescription, TypeDescription typeDescription2) {
            super(typeDescription2);
            this.typeDescription = typeDescription;
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.FieldLocator.AbstractBase
        protected FieldList<?> locate(ElementMatcher<? super FieldDescription> elementMatcher) {
            Iterator it = this.typeDescription.iterator();
            while (it.hasNext()) {
                FieldList<?> fieldList = (FieldList) ((TypeDefinition) it.next()).getDeclaredFields().filter(elementMatcher);
                if (!fieldList.isEmpty()) {
                    return fieldList;
                }
            }
            return new FieldList.Empty();
        }

        public enum Factory implements Factory {
            INSTANCE;

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.FieldLocator.Factory
            public FieldLocator make(TypeDescription typeDescription) {
                return new ForClassHierarchy(typeDescription);
            }
        }
    }

    public static class ForTopLevelType extends AbstractBase {
        protected ForTopLevelType(TypeDescription typeDescription) {
            super(typeDescription);
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.FieldLocator.AbstractBase
        protected FieldList<?> locate(ElementMatcher<? super FieldDescription> elementMatcher) {
            return (FieldList) this.accessingType.getDeclaredFields().filter(elementMatcher);
        }

        public enum Factory implements Factory {
            INSTANCE;

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.FieldLocator.Factory
            public FieldLocator make(TypeDescription typeDescription) {
                return new ForTopLevelType(typeDescription);
            }
        }
    }
}
