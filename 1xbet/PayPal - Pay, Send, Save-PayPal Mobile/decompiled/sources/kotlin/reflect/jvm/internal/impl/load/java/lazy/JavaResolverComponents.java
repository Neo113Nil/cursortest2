package kotlin.reflect.jvm.internal.impl.load.java.lazy;

/* loaded from: classes3.dex */
public final class JavaResolverComponents {
    private final kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker ArtificialStackFrames;
    private final kotlin.reflect.jvm.internal.impl.load.java.JavaClassesTracker Camera2StreamConfigurationMap;
    private final kotlin.reflect.jvm.internal.impl.storage.StorageManager CoroutineDebuggingKt;
    private final kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElementFactory accessartificialFrame;
    private final kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider coroutineCreation;
    private final kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver getHighSpeedVideoFpsRangesFor;
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter getHighSpeedVideoSizes;
    private final kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache getHighSpeedVideoSizesFor;
    private final kotlin.reflect.jvm.internal.impl.load.java.components.JavaPropertyInitializerEvaluator getInputFormats;
    private final kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState getInputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.load.java.JavaModuleAnnotationsProvider getOutputFormats;
    private final kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder getOutputMinFrameDuration;
    private final kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor getOutputMinFrameDurationlomOqCM;
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.ModuleClassResolver getOutputSizes;
    private final kotlin.reflect.jvm.internal.impl.load.kotlin.PackagePartProvider getOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker getOutputStallDuration;
    private final kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker getOutputStallDurationlomOqCM;
    private final kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes getValidOutputFormatsForInputhNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolver isOutputSupportedFor;
    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement isOutputSupportedForhNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings toString;
    private final kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator unwrapAs;

    public JavaResolverComponents(kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder javaClassFinder, kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder kotlinClassFinder, kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver deserializedDescriptorResolver, kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator signaturePropagator, kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter errorReporter, kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache javaResolverCache, kotlin.reflect.jvm.internal.impl.load.java.components.JavaPropertyInitializerEvaluator javaPropertyInitializerEvaluator, kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolver samConversionResolver, kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElementFactory javaSourceElementFactory, kotlin.reflect.jvm.internal.impl.load.java.lazy.ModuleClassResolver moduleClassResolver, kotlin.reflect.jvm.internal.impl.load.kotlin.PackagePartProvider packagePartProvider, kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker supertypeLoopChecker, kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker lookupTracker, kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor, kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes reflectionTypes, kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver annotationTypeQualifierResolver, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement signatureEnhancement, kotlin.reflect.jvm.internal.impl.load.java.JavaClassesTracker javaClassesTracker, kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings javaResolverSettings, kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker newKotlinTypeChecker, kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState javaTypeEnhancementState, kotlin.reflect.jvm.internal.impl.load.java.JavaModuleAnnotationsProvider javaModuleAnnotationsProvider, kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider syntheticJavaPartsProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storageManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaClassFinder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinClassFinder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializedDescriptorResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signaturePropagator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorReporter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaResolverCache, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaPropertyInitializerEvaluator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(samConversionResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaSourceElementFactory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleClassResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packagePartProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supertypeLoopChecker, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lookupTracker, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reflectionTypes, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotationTypeQualifierResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signatureEnhancement, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaClassesTracker, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaResolverSettings, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newKotlinTypeChecker, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaTypeEnhancementState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaModuleAnnotationsProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(syntheticJavaPartsProvider, "");
        this.CoroutineDebuggingKt = storageManager;
        this.getHighSpeedVideoFpsRanges = javaClassFinder;
        this.getOutputMinFrameDuration = kotlinClassFinder;
        this.getHighResolutionOutputSizeshNQ4ISI = deserializedDescriptorResolver;
        this.unwrapAs = signaturePropagator;
        this.getHighSpeedVideoSizes = errorReporter;
        this.getHighSpeedVideoSizesFor = javaResolverCache;
        this.getInputFormats = javaPropertyInitializerEvaluator;
        this.isOutputSupportedFor = samConversionResolver;
        this.accessartificialFrame = javaSourceElementFactory;
        this.getOutputSizes = moduleClassResolver;
        this.getOutputSizeshNQ4ISI = packagePartProvider;
        this.ArtificialStackFrames = supertypeLoopChecker;
        this.getOutputStallDurationlomOqCM = lookupTracker;
        this.getOutputMinFrameDurationlomOqCM = moduleDescriptor;
        this.getValidOutputFormatsForInputhNQ4ISI = reflectionTypes;
        this.getHighSpeedVideoFpsRangesFor = annotationTypeQualifierResolver;
        this.isOutputSupportedForhNQ4ISI = signatureEnhancement;
        this.Camera2StreamConfigurationMap = javaClassesTracker;
        this.toString = javaResolverSettings;
        this.getOutputStallDuration = newKotlinTypeChecker;
        this.getInputSizeshNQ4ISI = javaTypeEnhancementState;
        this.getOutputFormats = javaModuleAnnotationsProvider;
        this.coroutineCreation = syntheticJavaPartsProvider;
    }

    public final kotlin.reflect.jvm.internal.impl.storage.StorageManager getStorageManager() {
        return this.CoroutineDebuggingKt;
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder getFinder() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder getKotlinClassFinder() {
        return this.getOutputMinFrameDuration;
    }

    public final kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver getDeserializedDescriptorResolver() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator getSignaturePropagator() {
        return this.unwrapAs;
    }

    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter getErrorReporter() {
        return this.getHighSpeedVideoSizes;
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache getJavaResolverCache() {
        return this.getHighSpeedVideoSizesFor;
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.components.JavaPropertyInitializerEvaluator getJavaPropertyInitializerEvaluator() {
        return this.getInputFormats;
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElementFactory getSourceElementFactory() {
        return this.accessartificialFrame;
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.ModuleClassResolver getModuleClassResolver() {
        return this.getOutputSizes;
    }

    public final kotlin.reflect.jvm.internal.impl.load.kotlin.PackagePartProvider getPackagePartProvider() {
        return this.getOutputSizeshNQ4ISI;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker getSupertypeLoopChecker() {
        return this.ArtificialStackFrames;
    }

    public final kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker getLookupTracker() {
        return this.getOutputStallDurationlomOqCM;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor getModule() {
        return this.getOutputMinFrameDurationlomOqCM;
    }

    public final kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes getReflectionTypes() {
        return this.getValidOutputFormatsForInputhNQ4ISI;
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver getAnnotationTypeQualifierResolver() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement getSignatureEnhancement() {
        return this.isOutputSupportedForhNQ4ISI;
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.JavaClassesTracker getJavaClassesTracker() {
        return this.Camera2StreamConfigurationMap;
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings getSettings() {
        return this.toString;
    }

    public final kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker getKotlinTypeChecker() {
        return this.getOutputStallDuration;
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState getJavaTypeEnhancementState() {
        return this.getInputSizeshNQ4ISI;
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.JavaModuleAnnotationsProvider getJavaModuleResolver() {
        return this.getOutputFormats;
    }

    public /* synthetic */ JavaResolverComponents(kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder javaClassFinder, kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder kotlinClassFinder, kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver deserializedDescriptorResolver, kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator signaturePropagator, kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter errorReporter, kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache javaResolverCache, kotlin.reflect.jvm.internal.impl.load.java.components.JavaPropertyInitializerEvaluator javaPropertyInitializerEvaluator, kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolver samConversionResolver, kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElementFactory javaSourceElementFactory, kotlin.reflect.jvm.internal.impl.load.java.lazy.ModuleClassResolver moduleClassResolver, kotlin.reflect.jvm.internal.impl.load.kotlin.PackagePartProvider packagePartProvider, kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker supertypeLoopChecker, kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker lookupTracker, kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor, kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes reflectionTypes, kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver annotationTypeQualifierResolver, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement signatureEnhancement, kotlin.reflect.jvm.internal.impl.load.java.JavaClassesTracker javaClassesTracker, kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings javaResolverSettings, kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker newKotlinTypeChecker, kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState javaTypeEnhancementState, kotlin.reflect.jvm.internal.impl.load.java.JavaModuleAnnotationsProvider javaModuleAnnotationsProvider, kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider syntheticJavaPartsProvider, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(storageManager, javaClassFinder, kotlinClassFinder, deserializedDescriptorResolver, signaturePropagator, errorReporter, javaResolverCache, javaPropertyInitializerEvaluator, samConversionResolver, javaSourceElementFactory, moduleClassResolver, packagePartProvider, supertypeLoopChecker, lookupTracker, moduleDescriptor, reflectionTypes, annotationTypeQualifierResolver, signatureEnhancement, javaClassesTracker, javaResolverSettings, newKotlinTypeChecker, javaTypeEnhancementState, javaModuleAnnotationsProvider, (i & 8388608) != 0 ? kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider.Companion.getEMPTY() : syntheticJavaPartsProvider);
    }

    public final kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider getSyntheticPartsProvider() {
        return this.coroutineCreation;
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents replace(kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache javaResolverCache) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaResolverCache, "");
        return new kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents(this.CoroutineDebuggingKt, this.getHighSpeedVideoFpsRanges, this.getOutputMinFrameDuration, this.getHighResolutionOutputSizeshNQ4ISI, this.unwrapAs, this.getHighSpeedVideoSizes, javaResolverCache, this.getInputFormats, this.isOutputSupportedFor, this.accessartificialFrame, this.getOutputSizes, this.getOutputSizeshNQ4ISI, this.ArtificialStackFrames, this.getOutputStallDurationlomOqCM, this.getOutputMinFrameDurationlomOqCM, this.getValidOutputFormatsForInputhNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.isOutputSupportedForhNQ4ISI, this.Camera2StreamConfigurationMap, this.toString, this.getOutputStallDuration, this.getInputSizeshNQ4ISI, this.getOutputFormats, null, 8388608, null);
    }
}
