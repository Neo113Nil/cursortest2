package kotlin.reflect.jvm.internal.impl.resolve.scopes;

/* loaded from: classes5.dex */
public final class StaticScopeForKotlinEnum extends kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl {
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] Camera2StreamConfigurationMap = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.impl.resolve.scopes.StaticScopeForKotlinEnum.class, "functions", "getFunctions()Ljava/util/List;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.impl.resolve.scopes.StaticScopeForKotlinEnum.class, "properties", "getProperties()Ljava/util/List;", 0))};
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue getHighSpeedVideoFpsRanges;
    private final boolean getHighSpeedVideoFpsRangesFor;
    private final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getHighSpeedVideoSizes;

    public StaticScopeForKotlinEnum(kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storageManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classDescriptor, "");
        this.getHighSpeedVideoSizes = classDescriptor;
        this.getHighSpeedVideoFpsRangesFor = z;
        classDescriptor.getKind();
        kotlin.reflect.jvm.internal.impl.descriptors.ClassKind classKind = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_CLASS;
        this.getHighSpeedVideoFpsRanges = storageManager.createLazyValue(new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.StaticScopeForKotlinEnum$$Lambda$0
            private final kotlin.reflect.jvm.internal.impl.resolve.scopes.StaticScopeForKotlinEnum getHighSpeedVideoSizes;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                java.util.List listOf;
                listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor[]{kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory.createEnumValueOfMethod(r0.getHighSpeedVideoSizes), kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory.createEnumValuesMethod(this.getHighSpeedVideoSizes.getHighSpeedVideoSizes)});
                return listOf;
            }

            {
                this.getHighSpeedVideoSizes = this;
            }
        });
        this.getHighResolutionOutputSizeshNQ4ISI = storageManager.createLazyValue(new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.StaticScopeForKotlinEnum$$Lambda$1
            private final kotlin.reflect.jvm.internal.impl.resolve.scopes.StaticScopeForKotlinEnum getHighSpeedVideoFpsRanges;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.impl.resolve.scopes.StaticScopeForKotlinEnum.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRanges);
            }

            {
                this.getHighSpeedVideoFpsRanges = this;
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* renamed from: getContributedClassifier, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23899getContributedClassifier(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
        return (kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor) getContributedClassifier(name2, lookupLocation);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public final /* bridge */ /* synthetic */ java.util.Collection getContributedDescriptors(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter descriptorKindFilter, kotlin.jvm.functions.Function1 function1) {
        return getContributedDescriptors(descriptorKindFilter, (kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean>) function1);
    }

    static /* synthetic */ java.util.List getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.resolve.scopes.StaticScopeForKotlinEnum staticScopeForKotlinEnum) {
        if (staticScopeForKotlinEnum.getHighSpeedVideoFpsRangesFor) {
            return kotlin.collections.CollectionsKt.listOfNotNull(kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory.createEnumEntriesProperty(staticScopeForKotlinEnum.getHighSpeedVideoSizes));
        }
        return kotlin.collections.CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> getContributedDescriptors(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter descriptorKindFilter, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptorKindFilter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue notNullLazyValue = this.getHighSpeedVideoFpsRanges;
        kotlin.reflect.KProperty<java.lang.Object>[] kPropertyArr = Camera2StreamConfigurationMap;
        return kotlin.collections.CollectionsKt.plus((java.util.Collection) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(notNullLazyValue, this, (kotlin.reflect.KProperty<?>) kPropertyArr[0]), (java.lang.Iterable) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.getHighResolutionOutputSizeshNQ4ISI, this, (kotlin.reflect.KProperty<?>) kPropertyArr[1]));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public final kotlin.reflect.jvm.internal.impl.utils.SmartList<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> getContributedFunctions(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lookupLocation, "");
        java.util.List list = (java.util.List) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.getHighSpeedVideoFpsRanges, this, (kotlin.reflect.KProperty<?>) Camera2StreamConfigurationMap[0]);
        kotlin.reflect.jvm.internal.impl.utils.SmartList smartList = new kotlin.reflect.jvm.internal.impl.utils.SmartList();
        for (java.lang.Object obj : list) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(((kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) obj).getName(), name2)) {
                smartList.add(obj);
            }
        }
        return smartList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> getContributedVariables(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lookupLocation, "");
        java.util.List list = (java.util.List) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.getHighResolutionOutputSizeshNQ4ISI, this, (kotlin.reflect.KProperty<?>) Camera2StreamConfigurationMap[1]);
        kotlin.reflect.jvm.internal.impl.utils.SmartList smartList = new kotlin.reflect.jvm.internal.impl.utils.SmartList();
        for (java.lang.Object obj : list) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(((kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) obj).getName(), name2)) {
                smartList.add(obj);
            }
        }
        return smartList;
    }

    public final java.lang.Void getContributedClassifier(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lookupLocation, "");
        return null;
    }
}
