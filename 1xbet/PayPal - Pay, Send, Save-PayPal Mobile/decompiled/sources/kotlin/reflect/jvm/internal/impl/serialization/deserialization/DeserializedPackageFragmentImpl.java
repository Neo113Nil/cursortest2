package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* loaded from: classes5.dex */
public abstract class DeserializedPackageFragmentImpl extends kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragment {
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion Camera2StreamConfigurationMap;
    private kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoBasedClassDataFinder getHighSpeedVideoFpsRanges;
    private kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getHighSpeedVideoFpsRangesFor;
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource getHighSpeedVideoSizes;
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolverImpl getOutputFormats;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedPackageFragmentImpl(kotlin.reflect.jvm.internal.impl.name.FqName fqName, kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment packageFragment, kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion binaryVersion, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource deserializedContainerSource) {
        super(fqName, storageManager, moduleDescriptor);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storageManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageFragment, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(binaryVersion, "");
        this.Camera2StreamConfigurationMap = binaryVersion;
        this.getHighSpeedVideoSizes = deserializedContainerSource;
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable strings = packageFragment.getStrings();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strings, "");
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable qualifiedNames = packageFragment.getQualifiedNames();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(qualifiedNames, "");
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolverImpl nameResolverImpl = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolverImpl(strings, qualifiedNames);
        this.getOutputFormats = nameResolverImpl;
        this.getHighSpeedVideoFpsRanges = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoBasedClassDataFinder(packageFragment, nameResolverImpl, binaryVersion, new kotlin.jvm.functions.Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragmentImpl$$Lambda$0
            private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragmentImpl Camera2StreamConfigurationMap;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragmentImpl.getHighSpeedVideoSizes(this.Camera2StreamConfigurationMap, (kotlin.reflect.jvm.internal.impl.name.ClassId) obj);
            }

            {
                this.Camera2StreamConfigurationMap = this;
            }
        });
        this.getHighResolutionOutputSizeshNQ4ISI = packageFragment;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragment
    public kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoBasedClassDataFinder getClassDataFinder() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragment
    public void initialize(kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents deserializationComponents) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializationComponents, "");
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment packageFragment = this.getHighResolutionOutputSizeshNQ4ISI;
        if (packageFragment == null) {
            throw new java.lang.IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize".toString());
        }
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package r5 = packageFragment.getPackage();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, "");
        this.getHighSpeedVideoFpsRangesFor = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPackageMemberScope(this, r5, this.getOutputFormats, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, deserializationComponents, "scope of ".concat(java.lang.String.valueOf(this)), new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragmentImpl$$Lambda$1
            private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragmentImpl getHighSpeedVideoFpsRanges;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragmentImpl.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges);
            }

            {
                this.getHighSpeedVideoFpsRanges = this;
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getMemberScope() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope = this.getHighSpeedVideoFpsRangesFor;
        if (memberScope != null) {
            return memberScope;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.SourceElement getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragmentImpl deserializedPackageFragmentImpl, kotlin.reflect.jvm.internal.impl.name.ClassId classId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classId, "");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource deserializedContainerSource = deserializedPackageFragmentImpl.getHighSpeedVideoSizes;
        if (deserializedContainerSource != null) {
            return deserializedContainerSource;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement = kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sourceElement, "");
        return sourceElement;
    }

    static /* synthetic */ java.util.Collection Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragmentImpl deserializedPackageFragmentImpl) {
        java.util.Collection<kotlin.reflect.jvm.internal.impl.name.ClassId> allClassIds = deserializedPackageFragmentImpl.getClassDataFinder().getAllClassIds();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : allClassIds) {
            kotlin.reflect.jvm.internal.impl.name.ClassId classId = (kotlin.reflect.jvm.internal.impl.name.ClassId) obj;
            if (!classId.isNestedClass() && !kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer.Companion.getBLACK_LIST().contains(classId)) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((kotlin.reflect.jvm.internal.impl.name.ClassId) it.next()).getShortClassName());
        }
        return arrayList3;
    }
}
