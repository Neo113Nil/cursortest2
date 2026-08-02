package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* loaded from: classes5.dex */
public final class DeserializationComponentsForJava {
    public static final kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializationComponentsForJava.Companion Companion = new kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializationComponentsForJava.Companion(null);
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents getHighSpeedVideoSizes;

    public DeserializationComponentsForJava(kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor, kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration deserializationConfiguration, kotlin.reflect.jvm.internal.impl.load.kotlin.JavaClassDataFinder javaClassDataFinder, kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl, kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider, kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses notFoundClasses, kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter errorReporter, kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker lookupTracker, kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer contractDeserializer, kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker newKotlinTypeChecker, kotlin.reflect.jvm.internal.impl.types.extensions.TypeAttributeTranslators typeAttributeTranslators) {
        kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter customizer;
        kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider customizer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storageManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializationConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaClassDataFinder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(binaryClassAnnotationAndConstantLoaderImpl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyJavaPackageFragmentProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notFoundClasses, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorReporter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lookupTracker, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contractDeserializer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newKotlinTypeChecker, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeAttributeTranslators, "");
        kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns builtIns = moduleDescriptor.getBuiltIns();
        kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns jvmBuiltIns = builtIns instanceof kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns ? (kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns) builtIns : null;
        this.getHighSpeedVideoSizes = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents(storageManager, moduleDescriptor, deserializationConfiguration, javaClassDataFinder, binaryClassAnnotationAndConstantLoaderImpl, lazyJavaPackageFragmentProvider, kotlin.reflect.jvm.internal.impl.serialization.deserialization.LocalClassifierTypeSettings.Default.INSTANCE, errorReporter, lookupTracker, kotlin.reflect.jvm.internal.impl.load.kotlin.JavaFlexibleTypeDeserializer.INSTANCE, kotlin.collections.CollectionsKt.emptyList(), notFoundClasses, contractDeserializer, (jvmBuiltIns == null || (customizer2 = jvmBuiltIns.getCustomizer()) == null) ? kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider.None.INSTANCE : customizer2, (jvmBuiltIns == null || (customizer = jvmBuiltIns.getCustomizer()) == null) ? kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter.NoPlatformDependent.INSTANCE : customizer, kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil.INSTANCE.getEXTENSION_REGISTRY(), newKotlinTypeChecker, new kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolverImpl(storageManager, kotlin.collections.CollectionsKt.emptyList()), typeAttributeTranslators.getTranslators(), kotlin.reflect.jvm.internal.impl.serialization.deserialization.JvmEnumEntriesDeserializationSupport.INSTANCE);
    }

    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents getComponents() {
        return this.getHighSpeedVideoSizes;
    }

    public static final class Companion {
        private Companion() {
        }

        public static final class ModuleData {
            private final kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializationComponentsForJava getHighResolutionOutputSizeshNQ4ISI;
            private final kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver getHighSpeedVideoFpsRangesFor;

            public ModuleData(kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializationComponentsForJava deserializationComponentsForJava, kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver deserializedDescriptorResolver) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializationComponentsForJava, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializedDescriptorResolver, "");
                this.getHighResolutionOutputSizeshNQ4ISI = deserializationComponentsForJava;
                this.getHighSpeedVideoFpsRangesFor = deserializedDescriptorResolver;
            }

            public final kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializationComponentsForJava getDeserializationComponentsForJava() {
                return this.getHighResolutionOutputSizeshNQ4ISI;
            }

            public final kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver getDeserializedDescriptorResolver() {
                return this.getHighSpeedVideoFpsRangesFor;
            }
        }

        public final kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializationComponentsForJava.Companion.ModuleData createModuleData(kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder kotlinClassFinder, kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder kotlinClassFinder2, kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder javaClassFinder, java.lang.String str, kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter errorReporter, kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElementFactory javaSourceElementFactory) {
            kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider makeLazyJavaPackageFragmentProvider;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinClassFinder, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinClassFinder2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaClassFinder, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorReporter, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaSourceElementFactory, "");
            kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager lockBasedStorageManager = new kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager("DeserializationComponentsForJava.ModuleData");
            kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns jvmBuiltIns = new kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns(lockBasedStorageManager, kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns.Kind.FROM_DEPENDENCIES);
            java.lang.StringBuilder sb = new java.lang.StringBuilder("<");
            sb.append(str);
            sb.append(kotlin.text.Typography.greater);
            kotlin.reflect.jvm.internal.impl.name.Name special = kotlin.reflect.jvm.internal.impl.name.Name.special(sb.toString());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(special, "");
            kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl moduleDescriptorImpl = new kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl(special, lockBasedStorageManager, jvmBuiltIns, null, null, null, 56, null);
            jvmBuiltIns.setBuiltInsModule(moduleDescriptorImpl);
            kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl moduleDescriptorImpl2 = moduleDescriptorImpl;
            jvmBuiltIns.initialize(moduleDescriptorImpl2, true);
            kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver deserializedDescriptorResolver = new kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver();
            kotlin.reflect.jvm.internal.impl.load.java.lazy.SingleModuleClassResolver singleModuleClassResolver = new kotlin.reflect.jvm.internal.impl.load.java.lazy.SingleModuleClassResolver();
            kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses notFoundClasses = new kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses(lockBasedStorageManager, moduleDescriptorImpl2);
            makeLazyJavaPackageFragmentProvider = kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializationComponentsForJavaKt.makeLazyJavaPackageFragmentProvider(javaClassFinder, moduleDescriptorImpl2, lockBasedStorageManager, notFoundClasses, kotlinClassFinder, deserializedDescriptorResolver, errorReporter, javaSourceElementFactory, singleModuleClassResolver, (r21 & 512) != 0 ? kotlin.reflect.jvm.internal.impl.load.kotlin.PackagePartProvider.Empty.INSTANCE : null);
            kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializationComponentsForJava makeDeserializationComponentsForJava = kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializationComponentsForJavaKt.makeDeserializationComponentsForJava(moduleDescriptorImpl2, lockBasedStorageManager, notFoundClasses, makeLazyJavaPackageFragmentProvider, kotlinClassFinder, deserializedDescriptorResolver, errorReporter, kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion.INSTANCE);
            deserializedDescriptorResolver.setComponents(makeDeserializationComponentsForJava);
            kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache javaResolverCache = kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache.EMPTY;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(javaResolverCache, "");
            kotlin.reflect.jvm.internal.impl.resolve.jvm.JavaDescriptorResolver javaDescriptorResolver = new kotlin.reflect.jvm.internal.impl.resolve.jvm.JavaDescriptorResolver(makeLazyJavaPackageFragmentProvider, javaResolverCache);
            singleModuleClassResolver.setResolver(javaDescriptorResolver);
            kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsPackageFragmentProvider jvmBuiltInsPackageFragmentProvider = new kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsPackageFragmentProvider(lockBasedStorageManager, kotlinClassFinder2, moduleDescriptorImpl2, notFoundClasses, jvmBuiltIns.getCustomizer(), jvmBuiltIns.getCustomizer(), kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration.Default.INSTANCE, kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker.Companion.getDefault(), new kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolverImpl(lockBasedStorageManager, kotlin.collections.CollectionsKt.emptyList()));
            moduleDescriptorImpl.setDependencies(moduleDescriptorImpl);
            moduleDescriptorImpl.initialize(new kotlin.reflect.jvm.internal.impl.descriptors.impl.CompositePackageFragmentProvider(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized[]{javaDescriptorResolver.getPackageFragmentProvider(), jvmBuiltInsPackageFragmentProvider}), "CompositeProvider@RuntimeModuleData for ".concat(java.lang.String.valueOf(moduleDescriptorImpl))));
            return new kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializationComponentsForJava.Companion.ModuleData(makeDeserializationComponentsForJava, deserializedDescriptorResolver);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
