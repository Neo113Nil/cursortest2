package kotlin.reflect.jvm.internal.impl.descriptors.deserialization;

/* loaded from: classes5.dex */
public interface PlatformDependentDeclarationFilter {
    boolean isFunctionAvailable(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor);

    public static final class All implements kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter {
        public static final kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter.All INSTANCE = new kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter.All();

        private All() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter
        public final boolean isFunctionAvailable(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classDescriptor, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(simpleFunctionDescriptor, "");
            return true;
        }
    }

    public static final class NoPlatformDependent implements kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter {
        public static final kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter.NoPlatformDependent INSTANCE = new kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter.NoPlatformDependent();

        private NoPlatformDependent() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter
        public final boolean isFunctionAvailable(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classDescriptor, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(simpleFunctionDescriptor, "");
            return !simpleFunctionDescriptor.getAnnotations().hasAnnotation(kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilterKt.getPLATFORM_DEPENDENT_ANNOTATION_FQ_NAME());
        }
    }
}
