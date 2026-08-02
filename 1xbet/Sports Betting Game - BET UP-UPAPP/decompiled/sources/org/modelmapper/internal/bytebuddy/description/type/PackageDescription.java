package org.modelmapper.internal.bytebuddy.description.type;

import org.modelmapper.internal.bytebuddy.description.NamedElement;
import org.modelmapper.internal.bytebuddy.description.annotation.AnnotationList;
import org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource;
import org.modelmapper.internal.bytebuddy.pool.TypePool;

/* loaded from: classes4.dex */
public interface PackageDescription extends NamedElement.WithRuntimeName, AnnotationSource {
    public static final String PACKAGE_CLASS_NAME = "package-info";
    public static final int PACKAGE_MODIFIERS = 5632;
    public static final PackageDescription UNDEFINED = null;

    boolean contains(TypeDescription typeDescription);

    public static abstract class AbstractBase implements PackageDescription {
        @Override // org.modelmapper.internal.bytebuddy.description.NamedElement.WithRuntimeName
        public String getInternalName() {
            return getName().replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/');
        }

        @Override // org.modelmapper.internal.bytebuddy.description.NamedElement
        public String getActualName() {
            return getName();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.PackageDescription
        public boolean contains(TypeDescription typeDescription) {
            return equals(typeDescription.getPackage());
        }

        public int hashCode() {
            return getName().hashCode();
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof PackageDescription) && getName().equals(((PackageDescription) obj).getName()));
        }

        public String toString() {
            return "package " + getName();
        }
    }

    public static class Simple extends AbstractBase {
        private final String name;

        public Simple(String str) {
            this.name = str;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
        public AnnotationList getDeclaredAnnotations() {
            return new AnnotationList.Empty();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.NamedElement.WithRuntimeName
        public String getName() {
            return this.name;
        }
    }

    public static class ForLoadedPackage extends AbstractBase {
        private final Package aPackage;

        public ForLoadedPackage(Package r1) {
            this.aPackage = r1;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
        public AnnotationList getDeclaredAnnotations() {
            return new AnnotationList.ForLoadedAnnotations(this.aPackage.getDeclaredAnnotations());
        }

        @Override // org.modelmapper.internal.bytebuddy.description.NamedElement.WithRuntimeName
        public String getName() {
            return this.aPackage.getName();
        }
    }
}
