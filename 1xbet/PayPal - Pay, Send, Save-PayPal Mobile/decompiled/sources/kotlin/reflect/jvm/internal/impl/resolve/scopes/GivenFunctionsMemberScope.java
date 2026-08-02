package kotlin.reflect.jvm.internal.impl.resolve.scopes;

/* loaded from: classes5.dex */
public abstract class GivenFunctionsMemberScope extends kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl {
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoSizes = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope.class, "allDescriptors", "getAllDescriptors()Ljava/util/List;", 0))};
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue Camera2StreamConfigurationMap;
    private final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getHighSpeedVideoFpsRanges;

    protected abstract java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> computeDeclaredFunctions();

    public GivenFunctionsMemberScope(kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storageManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classDescriptor, "");
        this.getHighSpeedVideoFpsRanges = classDescriptor;
        this.Camera2StreamConfigurationMap = storageManager.createLazyValue(new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope$$Lambda$0
            private final kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope Camera2StreamConfigurationMap;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope.getHighSpeedVideoSizes(this.Camera2StreamConfigurationMap);
            }

            {
                this.Camera2StreamConfigurationMap = this;
            }
        });
    }

    protected final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getContainingClass() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> getContributedDescriptors(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter descriptorKindFilter, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptorKindFilter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return !descriptorKindFilter.acceptsKinds(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.CALLABLES.getKindMask()) ? kotlin.collections.CollectionsKt.emptyList() : (java.util.List) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.Camera2StreamConfigurationMap, this, (kotlin.reflect.KProperty<?>) getHighSpeedVideoSizes[0]);
    }

    static /* synthetic */ java.util.List getHighSpeedVideoSizes(final kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope givenFunctionsMemberScope) {
        java.util.ArrayList emptyList;
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> computeDeclaredFunctions = givenFunctionsMemberScope.computeDeclaredFunctions();
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> list = computeDeclaredFunctions;
        final java.util.ArrayList arrayList = new java.util.ArrayList(3);
        java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> supertypes = givenFunctionsMemberScope.getHighSpeedVideoFpsRanges.getTypeConstructor().getSupertypes();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supertypes, "");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator<T> it = supertypes.iterator();
        while (it.hasNext()) {
            kotlin.collections.CollectionsKt.addAll(arrayList2, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope.DefaultImpls.getContributedDescriptors$default(((kotlin.reflect.jvm.internal.impl.types.KotlinType) it.next()).getMemberScope(), null, null, 3, null));
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList2) {
            if (obj instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) {
                arrayList3.add(obj);
            }
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.lang.Object obj2 : arrayList3) {
            kotlin.reflect.jvm.internal.impl.name.Name name2 = ((kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) obj2).getName();
            java.lang.Object obj3 = linkedHashMap.get(name2);
            if (obj3 == null) {
                obj3 = (java.util.List) new java.util.ArrayList();
                linkedHashMap.put(name2, obj3);
            }
            ((java.util.List) obj3).add(obj2);
        }
        for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
            java.lang.Object key = entry.getKey();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
            kotlin.reflect.jvm.internal.impl.name.Name name3 = (kotlin.reflect.jvm.internal.impl.name.Name) key;
            java.util.List list2 = (java.util.List) entry.getValue();
            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
            for (java.lang.Object obj4 : list2) {
                java.lang.Boolean valueOf = java.lang.Boolean.valueOf(((kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) obj4) instanceof kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor);
                java.lang.Object obj5 = linkedHashMap2.get(valueOf);
                if (obj5 == null) {
                    obj5 = (java.util.List) new java.util.ArrayList();
                    linkedHashMap2.put(valueOf, obj5);
                }
                ((java.util.List) obj5).add(obj4);
            }
            for (java.util.Map.Entry entry2 : linkedHashMap2.entrySet()) {
                boolean booleanValue = ((java.lang.Boolean) entry2.getKey()).booleanValue();
                java.util.List list3 = (java.util.List) entry2.getValue();
                kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil overridingUtil = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.DEFAULT;
                java.util.List list4 = list3;
                if (!booleanValue) {
                    emptyList = kotlin.collections.CollectionsKt.emptyList();
                } else {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    for (java.lang.Object obj6 : computeDeclaredFunctions) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(((kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) obj6).getName(), name3)) {
                            arrayList4.add(obj6);
                        }
                    }
                    emptyList = arrayList4;
                }
                overridingUtil.generateOverridesInFunctionGroup(name3, list4, emptyList, givenFunctionsMemberScope.getHighSpeedVideoFpsRanges, new kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope$createFakeOverrides$4
                    @Override // kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
                    public final void addFakeOverride(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
                        kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.resolveUnknownVisibilityForMember(callableMemberDescriptor, null);
                        arrayList.add(callableMemberDescriptor);
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy
                    public final void conflict(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor2) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callableMemberDescriptor2, "");
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Conflict in scope of ");
                        sb.append(givenFunctionsMemberScope.getContainingClass());
                        sb.append(": ");
                        sb.append(callableMemberDescriptor);
                        sb.append(" vs ");
                        sb.append(callableMemberDescriptor2);
                        throw new java.lang.IllegalStateException(sb.toString().toString());
                    }
                });
            }
        }
        return kotlin.collections.CollectionsKt.plus((java.util.Collection) list, (java.lang.Iterable) kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.compact(arrayList));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> getContributedFunctions(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
        kotlin.reflect.jvm.internal.impl.utils.SmartList smartList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lookupLocation, "");
        java.util.List list = (java.util.List) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.Camera2StreamConfigurationMap, this, (kotlin.reflect.KProperty<?>) getHighSpeedVideoSizes[0]);
        if (list.isEmpty()) {
            smartList = kotlin.collections.CollectionsKt.emptyList();
        } else {
            kotlin.reflect.jvm.internal.impl.utils.SmartList smartList2 = new kotlin.reflect.jvm.internal.impl.utils.SmartList();
            for (java.lang.Object obj : list) {
                if ((obj instanceof kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) && kotlin.jvm.internal.Intrinsics.areEqual(((kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) obj).getName(), name2)) {
                    smartList2.add(obj);
                }
            }
            smartList = smartList2;
        }
        return smartList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> getContributedVariables(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
        kotlin.reflect.jvm.internal.impl.utils.SmartList smartList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lookupLocation, "");
        java.util.List list = (java.util.List) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.Camera2StreamConfigurationMap, this, (kotlin.reflect.KProperty<?>) getHighSpeedVideoSizes[0]);
        if (list.isEmpty()) {
            smartList = kotlin.collections.CollectionsKt.emptyList();
        } else {
            kotlin.reflect.jvm.internal.impl.utils.SmartList smartList2 = new kotlin.reflect.jvm.internal.impl.utils.SmartList();
            for (java.lang.Object obj : list) {
                if ((obj instanceof kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) && kotlin.jvm.internal.Intrinsics.areEqual(((kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) obj).getName(), name2)) {
                    smartList2.add(obj);
                }
            }
            smartList = smartList2;
        }
        return smartList;
    }
}
