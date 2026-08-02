package kotlin.reflect.jvm.internal.impl.resolve.scopes;

/* loaded from: classes5.dex */
public final class ChainedMemberScope implements kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope {
    public static final kotlin.reflect.jvm.internal.impl.resolve.scopes.ChainedMemberScope.Companion Companion = new kotlin.reflect.jvm.internal.impl.resolve.scopes.ChainedMemberScope.Companion(null);
    private final java.lang.String getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope[] getHighSpeedVideoSizes;

    private ChainedMemberScope(java.lang.String str, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope[] memberScopeArr) {
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighSpeedVideoSizes = memberScopeArr;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* renamed from: getContributedClassifier */
    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23899getContributedClassifier(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lookupLocation, "");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptor = null;
        for (kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope : this.getHighSpeedVideoSizes) {
            kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23899getContributedClassifier = memberScope.mo23899getContributedClassifier(name2, lookupLocation);
            if (mo23899getContributedClassifier != null) {
                if (!(mo23899getContributedClassifier instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters) || !((kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor) mo23899getContributedClassifier).isExpect()) {
                    return mo23899getContributedClassifier;
                }
                if (classifierDescriptor == null) {
                    classifierDescriptor = mo23899getContributedClassifier;
                }
            }
        }
        return classifierDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> getContributedVariables(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lookupLocation, "");
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope[] memberScopeArr = this.getHighSpeedVideoSizes;
        int length = memberScopeArr.length;
        if (length == 0) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        if (length == 1) {
            return memberScopeArr[0].getContributedVariables(name2, lookupLocation);
        }
        java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> collection = null;
        for (kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope : memberScopeArr) {
            collection = kotlin.reflect.jvm.internal.impl.util.collectionUtils.ScopeUtilsKt.concat(collection, memberScope.getContributedVariables(name2, lookupLocation));
        }
        return collection == null ? kotlin.collections.SetsKt.emptySet() : collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> getContributedFunctions(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lookupLocation, "");
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope[] memberScopeArr = this.getHighSpeedVideoSizes;
        int length = memberScopeArr.length;
        if (length == 0) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        if (length == 1) {
            return memberScopeArr[0].getContributedFunctions(name2, lookupLocation);
        }
        java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> collection = null;
        for (kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope : memberScopeArr) {
            collection = kotlin.reflect.jvm.internal.impl.util.collectionUtils.ScopeUtilsKt.concat(collection, memberScope.getContributedFunctions(name2, lookupLocation));
        }
        return collection == null ? kotlin.collections.SetsKt.emptySet() : collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> getContributedDescriptors(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter descriptorKindFilter, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptorKindFilter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope[] memberScopeArr = this.getHighSpeedVideoSizes;
        int length = memberScopeArr.length;
        if (length == 0) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        if (length == 1) {
            return memberScopeArr[0].getContributedDescriptors(descriptorKindFilter, function1);
        }
        java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> collection = null;
        for (kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope : memberScopeArr) {
            collection = kotlin.reflect.jvm.internal.impl.util.collectionUtils.ScopeUtilsKt.concat(collection, memberScope.getContributedDescriptors(descriptorKindFilter, function1));
        }
        return collection == null ? kotlin.collections.SetsKt.emptySet() : collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getFunctionNames() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope[] memberScopeArr = this.getHighSpeedVideoSizes;
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope : memberScopeArr) {
            kotlin.collections.CollectionsKt.addAll(linkedHashSet, memberScope.getFunctionNames());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getVariableNames() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope[] memberScopeArr = this.getHighSpeedVideoSizes;
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope : memberScopeArr) {
            kotlin.collections.CollectionsKt.addAll(linkedHashSet, memberScope.getVariableNames());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getClassifierNames() {
        return kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeKt.flatMapClassifierNamesOrNull(kotlin.collections.ArraysKt.asIterable(this.getHighSpeedVideoSizes));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* renamed from: recordLookup */
    public final void mo23903recordLookup(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lookupLocation, "");
        for (kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope : this.getHighSpeedVideoSizes) {
            memberScope.mo23903recordLookup(name2, lookupLocation);
        }
    }

    public final java.lang.String toString() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public static final class Companion {
        private Companion() {
        }

        public final kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope create(java.lang.String str, java.lang.Iterable<? extends kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope> iterable) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
            kotlin.reflect.jvm.internal.impl.utils.SmartList smartList = new kotlin.reflect.jvm.internal.impl.utils.SmartList();
            for (kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope : iterable) {
                if (memberScope != kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty.INSTANCE) {
                    if (memberScope instanceof kotlin.reflect.jvm.internal.impl.resolve.scopes.ChainedMemberScope) {
                        kotlin.collections.CollectionsKt.addAll(smartList, ((kotlin.reflect.jvm.internal.impl.resolve.scopes.ChainedMemberScope) memberScope).getHighSpeedVideoSizes);
                    } else {
                        smartList.add(memberScope);
                    }
                }
            }
            return createOrSingle$descriptors(str, smartList);
        }

        public final kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope createOrSingle$descriptors(java.lang.String str, java.util.List<? extends kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            int size = list.size();
            if (size == 0) {
                return kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty.INSTANCE;
            }
            if (size == 1) {
                return list.get(0);
            }
            return new kotlin.reflect.jvm.internal.impl.resolve.scopes.ChainedMemberScope(str, (kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope[]) list.toArray(new kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope[0]), null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ChainedMemberScope(java.lang.String str, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope[] memberScopeArr, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, memberScopeArr);
    }
}
