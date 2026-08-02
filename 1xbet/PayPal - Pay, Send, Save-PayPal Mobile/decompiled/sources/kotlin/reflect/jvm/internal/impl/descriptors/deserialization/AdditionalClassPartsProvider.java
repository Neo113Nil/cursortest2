package kotlin.reflect.jvm.internal.impl.descriptors.deserialization;

/* loaded from: classes5.dex */
public interface AdditionalClassPartsProvider {
    java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor> getConstructors(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor);

    java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> getFunctions(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor);

    java.util.Collection<kotlin.reflect.jvm.internal.impl.name.Name> getFunctionsNames(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor);

    java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> getSupertypes(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor);

    public static final class None implements kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider {
        public static final kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider.None INSTANCE = new kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider.None();

        private None() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
        public final java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> getSupertypes(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classDescriptor, "");
            return kotlin.collections.CollectionsKt.emptyList();
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
        public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> getFunctions(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classDescriptor, "");
            return kotlin.collections.CollectionsKt.emptyList();
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
        public final java.util.Collection<kotlin.reflect.jvm.internal.impl.name.Name> getFunctionsNames(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classDescriptor, "");
            return kotlin.collections.CollectionsKt.emptyList();
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
        public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor> getConstructors(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classDescriptor, "");
            return kotlin.collections.CollectionsKt.emptyList();
        }
    }
}
