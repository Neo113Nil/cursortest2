package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

/* loaded from: classes17.dex */
public final class BuiltInsLoaderImpl implements kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader {
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsResourceLoader getHighSpeedVideoFpsRangesFor = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsResourceLoader();

    @Override // kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader
    public final kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider createPackageFragmentProvider(kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor, java.lang.Iterable<? extends kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory> iterable, kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter platformDependentDeclarationFilter, kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider additionalClassPartsProvider, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storageManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(platformDependentDeclarationFilter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(additionalClassPartsProvider, "");
        return createBuiltInPackageFragmentProvider(storageManager, moduleDescriptor, kotlin.reflect.jvm.internal.impl.builtins.StandardNames.BUILT_INS_PACKAGE_FQ_NAMES, iterable, platformDependentDeclarationFilter, additionalClassPartsProvider, z, new kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsLoaderImpl$createPackageFragmentProvider$1(this.getHighSpeedVideoFpsRangesFor));
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider createBuiltInPackageFragmentProvider(kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor, java.util.Set<kotlin.reflect.jvm.internal.impl.name.FqName> set, java.lang.Iterable<? extends kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory> iterable, kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter platformDependentDeclarationFilter, kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider additionalClassPartsProvider, boolean z, kotlin.jvm.functions.Function1<? super java.lang.String, ? extends java.io.InputStream> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storageManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(platformDependentDeclarationFilter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(additionalClassPartsProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (kotlin.reflect.jvm.internal.impl.name.FqName fqName : set) {
            java.io.InputStream invoke = function1.invoke(kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInSerializerProtocol.INSTANCE.getBuiltInsFilePath(fqName));
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsPackageFragmentImpl create = invoke != null ? kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsPackageFragmentImpl.Companion.create(fqName, storageManager, moduleDescriptor, invoke, z) : null;
            if (create != null) {
                arrayList.add(create);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderImpl packageFragmentProviderImpl = new kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderImpl(arrayList2);
        kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses notFoundClasses = new kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses(storageManager, moduleDescriptor);
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration.Default r3 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration.Default.INSTANCE;
        kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderImpl packageFragmentProviderImpl2 = packageFragmentProviderImpl;
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedClassDataFinder deserializedClassDataFinder = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedClassDataFinder(packageFragmentProviderImpl2);
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoaderImpl annotationAndConstantLoaderImpl = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoaderImpl(moduleDescriptor, notFoundClasses, kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInSerializerProtocol.INSTANCE);
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.LocalClassifierTypeSettings.Default r7 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.LocalClassifierTypeSettings.Default.INSTANCE;
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter errorReporter = kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter.DO_NOTHING;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(errorReporter, "");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents deserializationComponents = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents(storageManager, moduleDescriptor, r3, deserializedClassDataFinder, annotationAndConstantLoaderImpl, packageFragmentProviderImpl2, r7, errorReporter, kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker.DO_NOTHING.INSTANCE, kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer.ThrowException.INSTANCE, iterable, notFoundClasses, kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer.Companion.getDEFAULT(), additionalClassPartsProvider, platformDependentDeclarationFilter, kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInSerializerProtocol.INSTANCE.getExtensionRegistry(), null, new kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolverImpl(storageManager, kotlin.collections.CollectionsKt.emptyList()), null, null, 851968, null);
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsPackageFragmentImpl) it.next()).initialize(deserializationComponents);
        }
        return packageFragmentProviderImpl2;
    }
}
