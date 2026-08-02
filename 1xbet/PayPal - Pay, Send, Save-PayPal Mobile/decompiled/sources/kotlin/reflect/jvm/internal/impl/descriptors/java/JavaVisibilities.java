package kotlin.reflect.jvm.internal.impl.descriptors.java;

/* loaded from: classes5.dex */
public final class JavaVisibilities {
    public static final kotlin.reflect.jvm.internal.impl.descriptors.java.JavaVisibilities INSTANCE = new kotlin.reflect.jvm.internal.impl.descriptors.java.JavaVisibilities();

    public static final class PackageVisibility extends kotlin.reflect.jvm.internal.impl.descriptors.Visibility {
        public static final kotlin.reflect.jvm.internal.impl.descriptors.java.JavaVisibilities.PackageVisibility INSTANCE = new kotlin.reflect.jvm.internal.impl.descriptors.java.JavaVisibilities.PackageVisibility();

        private PackageVisibility() {
            super("package", false);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        public final java.lang.Integer compareTo(kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibility) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(visibility, "");
            if (this == visibility) {
                return 0;
            }
            return kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.INSTANCE.isPrivate(visibility) ? 1 : -1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        public final kotlin.reflect.jvm.internal.impl.descriptors.Visibility normalize() {
            return kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.Protected.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        public final java.lang.String getInternalDisplayName() {
            return "public/*package*/";
        }
    }

    private JavaVisibilities() {
    }

    public static final class ProtectedStaticVisibility extends kotlin.reflect.jvm.internal.impl.descriptors.Visibility {
        public static final kotlin.reflect.jvm.internal.impl.descriptors.java.JavaVisibilities.ProtectedStaticVisibility INSTANCE = new kotlin.reflect.jvm.internal.impl.descriptors.java.JavaVisibilities.ProtectedStaticVisibility();

        private ProtectedStaticVisibility() {
            super("protected_static", true);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        public final kotlin.reflect.jvm.internal.impl.descriptors.Visibility normalize() {
            return kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.Protected.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        public final java.lang.String getInternalDisplayName() {
            return "protected/*protected static*/";
        }
    }

    public static final class ProtectedAndPackage extends kotlin.reflect.jvm.internal.impl.descriptors.Visibility {
        public static final kotlin.reflect.jvm.internal.impl.descriptors.java.JavaVisibilities.ProtectedAndPackage INSTANCE = new kotlin.reflect.jvm.internal.impl.descriptors.java.JavaVisibilities.ProtectedAndPackage();

        private ProtectedAndPackage() {
            super("protected_and_package", true);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        public final java.lang.Integer compareTo(kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibility) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(visibility, "");
            if (kotlin.jvm.internal.Intrinsics.areEqual(this, visibility)) {
                return 0;
            }
            if (visibility == kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.Internal.INSTANCE) {
                return null;
            }
            return kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.INSTANCE.isPrivate(visibility) ? 1 : -1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        public final kotlin.reflect.jvm.internal.impl.descriptors.Visibility normalize() {
            return kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.Protected.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        public final java.lang.String getInternalDisplayName() {
            return "protected/*protected and package*/";
        }
    }
}
