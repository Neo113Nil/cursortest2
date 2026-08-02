package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* loaded from: classes3.dex */
public abstract class AbstractDeserializedPackageFragmentProvider implements kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized {
    private final kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable<kotlin.reflect.jvm.internal.impl.name.FqName, kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor> Camera2StreamConfigurationMap;
    protected kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents components;
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.KotlinMetadataFinder getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor getHighSpeedVideoFpsRangesFor;
    private final kotlin.reflect.jvm.internal.impl.storage.StorageManager getHighSpeedVideoSizes;

    protected abstract kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragment findPackage(kotlin.reflect.jvm.internal.impl.name.FqName fqName);

    public AbstractDeserializedPackageFragmentProvider(kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.serialization.deserialization.KotlinMetadataFinder kotlinMetadataFinder, kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storageManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinMetadataFinder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleDescriptor, "");
        this.getHighSpeedVideoSizes = storageManager;
        this.getHighResolutionOutputSizeshNQ4ISI = kotlinMetadataFinder;
        this.getHighSpeedVideoFpsRangesFor = moduleDescriptor;
        this.Camera2StreamConfigurationMap = storageManager.createMemoizedFunctionWithNullableValues(new kotlin.jvm.functions.Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractDeserializedPackageFragmentProvider$$Lambda$0
            private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractDeserializedPackageFragmentProvider getHighSpeedVideoFpsRanges;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractDeserializedPackageFragmentProvider.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges, (kotlin.reflect.jvm.internal.impl.name.FqName) obj);
            }

            {
                this.getHighSpeedVideoFpsRanges = this;
            }
        });
    }

    protected final kotlin.reflect.jvm.internal.impl.storage.StorageManager getStorageManager() {
        return this.getHighSpeedVideoSizes;
    }

    protected final kotlin.reflect.jvm.internal.impl.serialization.deserialization.KotlinMetadataFinder getFinder() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    protected final kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor getModuleDescriptor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    protected final kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents getComponents() {
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents deserializationComponents = this.components;
        if (deserializationComponents != null) {
            return deserializationComponents;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    protected final void setComponents(kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents deserializationComponents) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializationComponents, "");
        this.components = deserializationComponents;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public void collectPackageFragments(kotlin.reflect.jvm.internal.impl.name.FqName fqName, java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor> collection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(collection, this.Camera2StreamConfigurationMap.invoke(fqName));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public boolean isEmpty(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor findPackage;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        if (this.Camera2StreamConfigurationMap.isComputed(fqName)) {
            findPackage = this.Camera2StreamConfigurationMap.invoke(fqName);
        } else {
            findPackage = findPackage(fqName);
        }
        return findPackage == null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @kotlin.Deprecated(message = "for usages use #packageFragments(FqName) at final point, for impl use #collectPackageFragments(FqName, MutableCollection<PackageFragmentDescriptor>)")
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor> getPackageFragments(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        return kotlin.collections.CollectionsKt.listOfNotNull(this.Camera2StreamConfigurationMap.invoke(fqName));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.name.FqName> getSubPackagesOf(kotlin.reflect.jvm.internal.impl.name.FqName fqName, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return kotlin.collections.SetsKt.emptySet();
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractDeserializedPackageFragmentProvider abstractDeserializedPackageFragmentProvider, kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragment findPackage = abstractDeserializedPackageFragmentProvider.findPackage(fqName);
        if (findPackage != null) {
            findPackage.initialize(abstractDeserializedPackageFragmentProvider.getComponents());
        } else {
            findPackage = null;
        }
        return findPackage;
    }
}
