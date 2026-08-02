package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* loaded from: classes3.dex */
public final class DeserializationComponents {
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor, kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>> Camera2StreamConfigurationMap;
    private final java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeAttributeTranslator> coroutineBoundary;
    private final kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer getHighSpeedVideoFpsRangesFor;
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration getHighSpeedVideoSizes;
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.EnumEntriesDeserializationSupport getHighSpeedVideoSizesFor;
    private final kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite getInputFormats;
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter getInputSizeshNQ4ISI;
    private final java.lang.Iterable<kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory> getOutputFormats;
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer getOutputMinFrameDuration;
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.LocalClassifierTypeSettings getOutputMinFrameDurationlomOqCM;
    private final kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor getOutputSizes;
    private final kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker getOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer getOutputStallDuration;
    private final kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker getOutputStallDurationlomOqCM;
    private final kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider getValidOutputFormatsForInputhNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolver isOutputSupportedFor;
    private final kotlin.reflect.jvm.internal.impl.storage.StorageManager isOutputSupportedForhNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter toString;
    private final kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses unwrapAs;

    /* JADX WARN: Multi-variable type inference failed */
    public DeserializationComponents(kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor, kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration deserializationConfiguration, kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder classDataFinder, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor, ? extends kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>> annotationAndConstantLoader, kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider packageFragmentProvider, kotlin.reflect.jvm.internal.impl.serialization.deserialization.LocalClassifierTypeSettings localClassifierTypeSettings, kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter errorReporter, kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker lookupTracker, kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer flexibleTypeDeserializer, java.lang.Iterable<? extends kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory> iterable, kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses notFoundClasses, kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer contractDeserializer, kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider additionalClassPartsProvider, kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter platformDependentDeclarationFilter, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite, kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker newKotlinTypeChecker, kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolver samConversionResolver, java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.TypeAttributeTranslator> list, kotlin.reflect.jvm.internal.impl.serialization.deserialization.EnumEntriesDeserializationSupport enumEntriesDeserializationSupport) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storageManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializationConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classDataFinder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotationAndConstantLoader, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageFragmentProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localClassifierTypeSettings, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorReporter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lookupTracker, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flexibleTypeDeserializer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notFoundClasses, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contractDeserializer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(additionalClassPartsProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(platformDependentDeclarationFilter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extensionRegistryLite, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newKotlinTypeChecker, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(samConversionResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enumEntriesDeserializationSupport, "");
        this.isOutputSupportedForhNQ4ISI = storageManager;
        this.getOutputSizes = moduleDescriptor;
        this.getHighSpeedVideoSizes = deserializationConfiguration;
        this.getHighSpeedVideoFpsRanges = classDataFinder;
        this.Camera2StreamConfigurationMap = annotationAndConstantLoader;
        this.getValidOutputFormatsForInputhNQ4ISI = packageFragmentProvider;
        this.getOutputMinFrameDurationlomOqCM = localClassifierTypeSettings;
        this.getInputSizeshNQ4ISI = errorReporter;
        this.getOutputSizeshNQ4ISI = lookupTracker;
        this.getOutputStallDuration = flexibleTypeDeserializer;
        this.getOutputFormats = iterable;
        this.unwrapAs = notFoundClasses;
        this.getOutputMinFrameDuration = contractDeserializer;
        this.getHighResolutionOutputSizeshNQ4ISI = additionalClassPartsProvider;
        this.toString = platformDependentDeclarationFilter;
        this.getInputFormats = extensionRegistryLite;
        this.getOutputStallDurationlomOqCM = newKotlinTypeChecker;
        this.isOutputSupportedFor = samConversionResolver;
        this.coroutineBoundary = list;
        this.getHighSpeedVideoSizesFor = enumEntriesDeserializationSupport;
        this.getHighSpeedVideoFpsRangesFor = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer(this);
    }

    public final kotlin.reflect.jvm.internal.impl.storage.StorageManager getStorageManager() {
        return this.isOutputSupportedForhNQ4ISI;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor getModuleDescriptor() {
        return this.getOutputSizes;
    }

    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration getConfiguration() {
        return this.getHighSpeedVideoSizes;
    }

    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder getClassDataFinder() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor, kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>> getAnnotationAndConstantLoader() {
        return this.Camera2StreamConfigurationMap;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider getPackageFragmentProvider() {
        return this.getValidOutputFormatsForInputhNQ4ISI;
    }

    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.LocalClassifierTypeSettings getLocalClassifierTypeSettings() {
        return this.getOutputMinFrameDurationlomOqCM;
    }

    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter getErrorReporter() {
        return this.getInputSizeshNQ4ISI;
    }

    public final kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker getLookupTracker() {
        return this.getOutputSizeshNQ4ISI;
    }

    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer getFlexibleTypeDeserializer() {
        return this.getOutputStallDuration;
    }

    public final java.lang.Iterable<kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory> getFictitiousClassDescriptorFactories() {
        return this.getOutputFormats;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses getNotFoundClasses() {
        return this.unwrapAs;
    }

    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer getContractDeserializer() {
        return this.getOutputMinFrameDuration;
    }

    public /* synthetic */ DeserializationComponents(kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor, kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration deserializationConfiguration, kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder classDataFinder, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader annotationAndConstantLoader, kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider packageFragmentProvider, kotlin.reflect.jvm.internal.impl.serialization.deserialization.LocalClassifierTypeSettings localClassifierTypeSettings, kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter errorReporter, kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker lookupTracker, kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer flexibleTypeDeserializer, java.lang.Iterable iterable, kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses notFoundClasses, kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer contractDeserializer, kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider additionalClassPartsProvider, kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter platformDependentDeclarationFilter, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite, kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker newKotlinTypeChecker, kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolver samConversionResolver, java.util.List list, kotlin.reflect.jvm.internal.impl.serialization.deserialization.EnumEntriesDeserializationSupport enumEntriesDeserializationSupport, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(storageManager, moduleDescriptor, deserializationConfiguration, classDataFinder, annotationAndConstantLoader, packageFragmentProvider, localClassifierTypeSettings, errorReporter, lookupTracker, flexibleTypeDeserializer, iterable, notFoundClasses, contractDeserializer, (i & 8192) != 0 ? kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider.None.INSTANCE : additionalClassPartsProvider, (i & 16384) != 0 ? kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter.All.INSTANCE : platformDependentDeclarationFilter, extensionRegistryLite, (65536 & i) != 0 ? kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker.Companion.getDefault() : newKotlinTypeChecker, samConversionResolver, (262144 & i) != 0 ? kotlin.collections.CollectionsKt.listOf(kotlin.reflect.jvm.internal.impl.types.DefaultTypeAttributeTranslator.INSTANCE) : list, (i & 524288) != 0 ? kotlin.reflect.jvm.internal.impl.serialization.deserialization.EnumEntriesDeserializationSupport.Default.INSTANCE : enumEntriesDeserializationSupport);
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider getAdditionalClassPartsProvider() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter getPlatformDependentDeclarationFilter() {
        return this.toString;
    }

    public final kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite getExtensionRegistryLite() {
        return this.getInputFormats;
    }

    public final kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker getKotlinTypeChecker() {
        return this.getOutputStallDurationlomOqCM;
    }

    public final java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeAttributeTranslator> getTypeAttributeTranslators() {
        return this.coroutineBoundary;
    }

    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.EnumEntriesDeserializationSupport getEnumEntriesDeserializationSupport() {
        return this.getHighSpeedVideoSizesFor;
    }

    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer getClassDeserializer() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor deserializeClass(kotlin.reflect.jvm.internal.impl.name.ClassId classId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classId, "");
        return kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer.deserializeClass$default(this.getHighSpeedVideoFpsRangesFor, classId, null, 2, null);
    }

    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext createContext(kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor packageFragmentDescriptor, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable, kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable versionRequirementTable, kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion binaryVersion, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource deserializedContainerSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageFragmentDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeTable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(versionRequirementTable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(binaryVersion, "");
        return new kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext(this, nameResolver, packageFragmentDescriptor, typeTable, versionRequirementTable, binaryVersion, deserializedContainerSource, null, kotlin.collections.CollectionsKt.emptyList());
    }
}
