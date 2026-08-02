package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

/* loaded from: classes5.dex */
public class DeserializedPackageMemberScope extends kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope {
    private final kotlin.reflect.jvm.internal.impl.name.FqName Camera2StreamConfigurationMap;
    private final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String getHighSpeedVideoFpsRangesFor;
    private final kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor getHighSpeedVideoSizes;

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public /* bridge */ /* synthetic */ java.util.Collection getContributedDescriptors(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter descriptorKindFilter, kotlin.jvm.functions.Function1 function1) {
        return getContributedDescriptors(descriptorKindFilter, (kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean>) function1);
    }

    public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package getProto() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DeserializedPackageMemberScope(kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor packageFragmentDescriptor, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package r18, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver, kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion binaryVersion, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource deserializedContainerSource, kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents deserializationComponents, java.lang.String str, kotlin.jvm.functions.Function0<? extends java.util.Collection<kotlin.reflect.jvm.internal.impl.name.Name>> function0) {
        super(r1, r2, r3, r7, function0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageFragmentDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r18, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(binaryVersion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializationComponents, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable typeTable = r18.getTypeTable();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeTable, "");
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable2 = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable(typeTable);
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable.Companion companion = kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable.Companion;
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable versionRequirementTable = r18.getVersionRequirementTable();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(versionRequirementTable, "");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext createContext = deserializationComponents.createContext(packageFragmentDescriptor, nameResolver, typeTable2, companion.create(versionRequirementTable), binaryVersion, deserializedContainerSource);
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function> functionList = r18.getFunctionList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(functionList, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property> propertyList = r18.getPropertyList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(propertyList, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias> typeAliasList = r18.getTypeAliasList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeAliasList, "");
        this.getHighSpeedVideoSizes = packageFragmentDescriptor;
        this.getHighResolutionOutputSizeshNQ4ISI = r18;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.Camera2StreamConfigurationMap = packageFragmentDescriptor.getFqName();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> getContributedDescriptors(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter descriptorKindFilter, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptorKindFilter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> computeDescriptors = computeDescriptors(descriptorKindFilter, function1, kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
        java.lang.Iterable<kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory> fictitiousClassDescriptorFactories = getC().getComponents().getFictitiousClassDescriptorFactories();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory> it = fictitiousClassDescriptorFactories.iterator();
        while (it.hasNext()) {
            kotlin.collections.CollectionsKt.addAll(arrayList, it.next().getAllContributedClassesIfPossible(this.Camera2StreamConfigurationMap));
        }
        return kotlin.collections.CollectionsKt.plus((java.util.Collection) computeDescriptors, (java.lang.Iterable) arrayList);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    protected boolean hasClass(kotlin.reflect.jvm.internal.impl.name.Name name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        if (super.hasClass(name2)) {
            return true;
        }
        java.lang.Iterable<kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory> fictitiousClassDescriptorFactories = getC().getComponents().getFictitiousClassDescriptorFactories();
        if ((fictitiousClassDescriptorFactories instanceof java.util.Collection) && ((java.util.Collection) fictitiousClassDescriptorFactories).isEmpty()) {
            return false;
        }
        java.util.Iterator<kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory> it = fictitiousClassDescriptorFactories.iterator();
        while (it.hasNext()) {
            if (it.next().shouldCreateClass(this.Camera2StreamConfigurationMap, name2)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    protected kotlin.reflect.jvm.internal.impl.name.ClassId createClassId(kotlin.reflect.jvm.internal.impl.name.Name name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return new kotlin.reflect.jvm.internal.impl.name.ClassId(this.Camera2StreamConfigurationMap, name2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* renamed from: getContributedClassifier */
    public kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23899getContributedClassifier(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lookupLocation, "");
        mo23903recordLookup(name2, lookupLocation);
        return super.mo23899getContributedClassifier(name2, lookupLocation);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* renamed from: recordLookup */
    public void mo23903recordLookup(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lookupLocation, "");
        kotlin.reflect.jvm.internal.impl.incremental.UtilsKt.record(getC().getComponents().getLookupTracker(), lookupLocation, this.getHighSpeedVideoSizes, name2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    protected java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getNonDeclaredFunctionNames() {
        return kotlin.collections.SetsKt.emptySet();
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    protected java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getNonDeclaredVariableNames() {
        return kotlin.collections.SetsKt.emptySet();
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    protected java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getNonDeclaredClassifierNames() {
        return kotlin.collections.SetsKt.emptySet();
    }

    public java.lang.String toString() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    protected void addEnumEntryDescriptors(java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> collection, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
    }
}
