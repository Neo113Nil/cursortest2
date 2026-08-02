package kotlin.reflect.jvm.internal.impl.builtins.jvm;

/* loaded from: classes5.dex */
public final class JvmBuiltInsPackageFragmentProvider extends kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractDeserializedPackageFragmentProvider {
    public static final kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsPackageFragmentProvider.Companion Companion = new kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsPackageFragmentProvider.Companion(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmBuiltInsPackageFragmentProvider(kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder kotlinClassFinder, kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses notFoundClasses, kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider additionalClassPartsProvider, kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter platformDependentDeclarationFilter, kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration deserializationConfiguration, kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker newKotlinTypeChecker, kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolver samConversionResolver) {
        super(storageManager, kotlinClassFinder, moduleDescriptor);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storageManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinClassFinder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notFoundClasses, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(additionalClassPartsProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(platformDependentDeclarationFilter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializationConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newKotlinTypeChecker, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(samConversionResolver, "");
        kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsPackageFragmentProvider jvmBuiltInsPackageFragmentProvider = this;
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedClassDataFinder deserializedClassDataFinder = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedClassDataFinder(jvmBuiltInsPackageFragmentProvider);
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoaderImpl annotationAndConstantLoaderImpl = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoaderImpl(moduleDescriptor, notFoundClasses, kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInSerializerProtocol.INSTANCE);
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.LocalClassifierTypeSettings.Default r8 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.LocalClassifierTypeSettings.Default.INSTANCE;
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter errorReporter = kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter.DO_NOTHING;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(errorReporter, "");
        setComponents(new kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents(storageManager, moduleDescriptor, deserializationConfiguration, deserializedClassDataFinder, annotationAndConstantLoaderImpl, jvmBuiltInsPackageFragmentProvider, r8, errorReporter, kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker.DO_NOTHING.INSTANCE, kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer.ThrowException.INSTANCE, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory[]{new kotlin.reflect.jvm.internal.impl.builtins.functions.BuiltInFictitiousFunctionClassFactory(storageManager, moduleDescriptor), new kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInClassDescriptorFactory(storageManager, moduleDescriptor, null, 4, null)}), notFoundClasses, kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer.Companion.getDEFAULT(), additionalClassPartsProvider, platformDependentDeclarationFilter, kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInSerializerProtocol.INSTANCE.getExtensionRegistry(), newKotlinTypeChecker, samConversionResolver, null, kotlin.reflect.jvm.internal.impl.serialization.deserialization.JvmEnumEntriesDeserializationSupport.INSTANCE, 262144, null));
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractDeserializedPackageFragmentProvider
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragment findPackage(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        java.io.InputStream findBuiltInsData = getFinder().findBuiltInsData(fqName);
        return findBuiltInsData != null ? kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsPackageFragmentImpl.Companion.create(fqName, getStorageManager(), getModuleDescriptor(), findBuiltInsData, false) : null;
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
