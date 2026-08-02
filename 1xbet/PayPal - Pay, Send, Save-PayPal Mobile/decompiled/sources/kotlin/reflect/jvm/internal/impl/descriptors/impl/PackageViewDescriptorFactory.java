package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* loaded from: classes5.dex */
public interface PackageViewDescriptorFactory {
    public static final kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageViewDescriptorFactory.Companion Companion = kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageViewDescriptorFactory.Companion.getHighSpeedVideoSizes;

    kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor compute(kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl moduleDescriptorImpl, kotlin.reflect.jvm.internal.impl.name.FqName fqName, kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager);

    public static final class Default implements kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageViewDescriptorFactory {
        public static final kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageViewDescriptorFactory.Default INSTANCE = new kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageViewDescriptorFactory.Default();

        private Default() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageViewDescriptorFactory
        public final kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor compute(kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl moduleDescriptorImpl, kotlin.reflect.jvm.internal.impl.name.FqName fqName, kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleDescriptorImpl, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storageManager, "");
            return new kotlin.reflect.jvm.internal.impl.descriptors.impl.LazyPackageViewDescriptorImpl(moduleDescriptorImpl, fqName, storageManager);
        }
    }

    public static final class Companion {
        static final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageViewDescriptorFactory.Companion getHighSpeedVideoSizes = new kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageViewDescriptorFactory.Companion();
        private static final kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability<kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageViewDescriptorFactory> Camera2StreamConfigurationMap = new kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability<>("PackageViewDescriptorFactory");

        private Companion() {
        }

        public final kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability<kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageViewDescriptorFactory> getCAPABILITY() {
            return Camera2StreamConfigurationMap;
        }
    }
}
