package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* loaded from: classes5.dex */
public final class DeserializationComponentsForJavaKt {
    public static final kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider makeLazyJavaPackageFragmentProvider(kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder javaClassFinder, kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor, kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses notFoundClasses, kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder kotlinClassFinder, kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver deserializedDescriptorResolver, kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter errorReporter, kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElementFactory javaSourceElementFactory, kotlin.reflect.jvm.internal.impl.load.java.lazy.ModuleClassResolver moduleClassResolver, kotlin.reflect.jvm.internal.impl.load.kotlin.PackagePartProvider packagePartProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaClassFinder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storageManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notFoundClasses, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinClassFinder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializedDescriptorResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorReporter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaSourceElementFactory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleClassResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packagePartProvider, "");
        kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState javaTypeEnhancementState = kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState.Companion.getDefault(new kotlin.KotlinVersion(1, 9));
        kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator signaturePropagator = kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator.DO_NOTHING;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(signaturePropagator, "");
        kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache javaResolverCache = kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache.EMPTY;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(javaResolverCache, "");
        return new kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider(new kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents(storageManager, javaClassFinder, kotlinClassFinder, deserializedDescriptorResolver, signaturePropagator, errorReporter, javaResolverCache, kotlin.reflect.jvm.internal.impl.load.java.components.JavaPropertyInitializerEvaluator.DoNothing.INSTANCE, new kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolverImpl(storageManager, kotlin.collections.CollectionsKt.emptyList()), javaSourceElementFactory, moduleClassResolver, packagePartProvider, kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker.EMPTY.INSTANCE, kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker.DO_NOTHING.INSTANCE, moduleDescriptor, new kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes(moduleDescriptor, notFoundClasses), new kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver(javaTypeEnhancementState), new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement(new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement(kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings.Default.INSTANCE)), kotlin.reflect.jvm.internal.impl.load.java.JavaClassesTracker.Default.INSTANCE, kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings.Default.INSTANCE, kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker.Companion.getDefault(), javaTypeEnhancementState, new kotlin.reflect.jvm.internal.impl.load.java.JavaModuleAnnotationsProvider() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializationComponentsForJavaKt$makeLazyJavaPackageFragmentProvider$javaResolverComponents$1
            @Override // kotlin.reflect.jvm.internal.impl.load.java.JavaModuleAnnotationsProvider
            public final java.util.List<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation> getAnnotationsForModuleOwnerOfClass(kotlin.reflect.jvm.internal.impl.name.ClassId classId) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classId, "");
                return null;
            }
        }, null, 8388608, null));
    }

    public static final kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializationComponentsForJava makeDeserializationComponentsForJava(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor, kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses notFoundClasses, kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider, kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder kotlinClassFinder, kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver deserializedDescriptorResolver, kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter errorReporter, kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion metadataVersion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storageManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notFoundClasses, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyJavaPackageFragmentProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinClassFinder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializedDescriptorResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorReporter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metadataVersion, "");
        return new kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializationComponentsForJava(storageManager, moduleDescriptor, kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration.Default.INSTANCE, new kotlin.reflect.jvm.internal.impl.load.kotlin.JavaClassDataFinder(kotlinClassFinder, deserializedDescriptorResolver), kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImplKt.createBinaryClassAnnotationAndConstantLoader(moduleDescriptor, notFoundClasses, storageManager, kotlinClassFinder, metadataVersion), lazyJavaPackageFragmentProvider, notFoundClasses, errorReporter, kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker.DO_NOTHING.INSTANCE, kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer.Companion.getDEFAULT(), kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker.Companion.getDefault(), new kotlin.reflect.jvm.internal.impl.types.extensions.TypeAttributeTranslators(kotlin.collections.CollectionsKt.listOf(kotlin.reflect.jvm.internal.impl.types.DefaultTypeAttributeTranslator.INSTANCE)));
    }
}
