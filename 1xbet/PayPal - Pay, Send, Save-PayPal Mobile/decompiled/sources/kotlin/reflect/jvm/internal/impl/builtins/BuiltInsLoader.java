package kotlin.reflect.jvm.internal.impl.builtins;

/* loaded from: classes5.dex */
public interface BuiltInsLoader {
    public static final kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader.Companion Companion = kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader.Companion.getHighSpeedVideoFpsRangesFor;

    kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider createPackageFragmentProvider(kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor, java.lang.Iterable<? extends kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory> iterable, kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter platformDependentDeclarationFilter, kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider additionalClassPartsProvider, boolean z);

    public static final class Companion {
        static final /* synthetic */ kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader.Companion getHighSpeedVideoFpsRangesFor = new kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader.Companion();
        private static final kotlin.Lazy<kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader> getHighSpeedVideoSizes = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0() { // from class: kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader$Companion$$Lambda$0
            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader.Companion.getHighSpeedVideoFpsRanges();
            }
        });

        private Companion() {
        }

        public final kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader getInstance() {
            return getHighSpeedVideoSizes.getValue();
        }

        static /* synthetic */ kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader getHighSpeedVideoFpsRanges() {
            java.util.ServiceLoader load = java.util.ServiceLoader.load(kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader.class, kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader.class.getClassLoader());
            kotlin.jvm.internal.Intrinsics.checkNotNull(load);
            kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader builtInsLoader = (kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader) kotlin.collections.CollectionsKt.firstOrNull(load);
            if (builtInsLoader != null) {
                return builtInsLoader;
            }
            throw new java.lang.IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
        }
    }
}
