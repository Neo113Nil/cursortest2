package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

/* loaded from: classes5.dex */
public final class JvmPackageScope implements kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope {
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoFpsRanges = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.JvmPackageScope.class, "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0))};
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment Camera2StreamConfigurationMap;
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext getHighSpeedVideoFpsRangesFor;
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue getHighSpeedVideoSizes;

    public JvmPackageScope(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage javaPackage, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment lazyJavaPackageFragment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyJavaResolverContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaPackage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyJavaPackageFragment, "");
        this.getHighSpeedVideoFpsRangesFor = lazyJavaResolverContext;
        this.Camera2StreamConfigurationMap = lazyJavaPackageFragment;
        this.getHighResolutionOutputSizeshNQ4ISI = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope(lazyJavaResolverContext, javaPackage, lazyJavaPackageFragment);
        this.getHighSpeedVideoSizes = lazyJavaResolverContext.getStorageManager().createLazyValue(new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.JvmPackageScope$$Lambda$0
            private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.JvmPackageScope getHighSpeedVideoFpsRanges;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.JvmPackageScope.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges);
            }

            {
                this.getHighSpeedVideoFpsRanges = this;
            }
        });
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope getJavaScope$descriptors_jvm() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* renamed from: getContributedClassifier */
    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23899getContributedClassifier(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lookupLocation, "");
        mo23903recordLookup(name2, lookupLocation);
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor mo23899getContributedClassifier = this.getHighResolutionOutputSizeshNQ4ISI.mo23899getContributedClassifier(name2, lookupLocation);
        if (mo23899getContributedClassifier != null) {
            return mo23899getContributedClassifier;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptor = null;
        for (kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope : (kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope[]) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.getHighSpeedVideoSizes, this, (kotlin.reflect.KProperty<?>) getHighSpeedVideoFpsRanges[0])) {
            kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor contributedClassifier = memberScope.mo23899getContributedClassifier(name2, lookupLocation);
            if (contributedClassifier != null) {
                if (!(contributedClassifier instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters) || !((kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor) contributedClassifier).isExpect()) {
                    return contributedClassifier;
                }
                if (classifierDescriptor == null) {
                    classifierDescriptor = contributedClassifier;
                }
            }
        }
        return classifierDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> getContributedVariables(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lookupLocation, "");
        mo23903recordLookup(name2, lookupLocation);
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope lazyJavaPackageScope = this.getHighResolutionOutputSizeshNQ4ISI;
        int i = 0;
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope[] memberScopeArr = (kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope[]) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.getHighSpeedVideoSizes, this, (kotlin.reflect.KProperty<?>) getHighSpeedVideoFpsRanges[0]);
        java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> contributedVariables = lazyJavaPackageScope.getContributedVariables(name2, lookupLocation);
        int length = memberScopeArr.length;
        java.util.Collection collection = contributedVariables;
        while (i < length) {
            java.util.Collection concat = kotlin.reflect.jvm.internal.impl.util.collectionUtils.ScopeUtilsKt.concat(collection, memberScopeArr[i].getContributedVariables(name2, lookupLocation));
            i++;
            collection = concat;
        }
        return collection == null ? kotlin.collections.SetsKt.emptySet() : collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> getContributedFunctions(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lookupLocation, "");
        mo23903recordLookup(name2, lookupLocation);
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope lazyJavaPackageScope = this.getHighResolutionOutputSizeshNQ4ISI;
        int i = 0;
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope[] memberScopeArr = (kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope[]) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.getHighSpeedVideoSizes, this, (kotlin.reflect.KProperty<?>) getHighSpeedVideoFpsRanges[0]);
        java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> contributedFunctions = lazyJavaPackageScope.getContributedFunctions(name2, lookupLocation);
        int length = memberScopeArr.length;
        java.util.Collection collection = contributedFunctions;
        while (i < length) {
            java.util.Collection concat = kotlin.reflect.jvm.internal.impl.util.collectionUtils.ScopeUtilsKt.concat(collection, memberScopeArr[i].getContributedFunctions(name2, lookupLocation));
            i++;
            collection = concat;
        }
        return collection == null ? kotlin.collections.SetsKt.emptySet() : collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> getContributedDescriptors(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter descriptorKindFilter, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptorKindFilter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope lazyJavaPackageScope = this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope[] memberScopeArr = (kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope[]) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.getHighSpeedVideoSizes, this, (kotlin.reflect.KProperty<?>) getHighSpeedVideoFpsRanges[0]);
        java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> contributedDescriptors = lazyJavaPackageScope.getContributedDescriptors(descriptorKindFilter, function1);
        for (kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope : memberScopeArr) {
            contributedDescriptors = kotlin.reflect.jvm.internal.impl.util.collectionUtils.ScopeUtilsKt.concat(contributedDescriptors, memberScope.getContributedDescriptors(descriptorKindFilter, function1));
        }
        return contributedDescriptors == null ? kotlin.collections.SetsKt.emptySet() : contributedDescriptors;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* renamed from: recordLookup */
    public final void mo23903recordLookup(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lookupLocation, "");
        kotlin.reflect.jvm.internal.impl.incremental.UtilsKt.record(this.getHighSpeedVideoFpsRangesFor.getComponents().getLookupTracker(), lookupLocation, this.Camera2StreamConfigurationMap, name2);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("scope for ");
        sb.append(this.Camera2StreamConfigurationMap);
        return sb.toString();
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope[] Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.JvmPackageScope jvmPackageScope) {
        java.util.Collection<kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass> values = jvmPackageScope.Camera2StreamConfigurationMap.getBinaryClasses$descriptors_jvm().values();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope createKotlinPackagePartScope = jvmPackageScope.getHighSpeedVideoFpsRangesFor.getComponents().getDeserializedDescriptorResolver().createKotlinPackagePartScope(jvmPackageScope.Camera2StreamConfigurationMap, (kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass) it.next());
            if (createKotlinPackagePartScope != null) {
                arrayList.add(createKotlinPackagePartScope);
            }
        }
        return (kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope[]) kotlin.reflect.jvm.internal.impl.util.collectionUtils.ScopeUtilsKt.listOfNonEmptyScopes(arrayList).toArray(new kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getClassifierNames() {
        java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> flatMapClassifierNamesOrNull = kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeKt.flatMapClassifierNamesOrNull(kotlin.collections.ArraysKt.asIterable((kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope[]) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.getHighSpeedVideoSizes, this, (kotlin.reflect.KProperty<?>) getHighSpeedVideoFpsRanges[0])));
        if (flatMapClassifierNamesOrNull == null) {
            return null;
        }
        flatMapClassifierNamesOrNull.addAll(this.getHighResolutionOutputSizeshNQ4ISI.getClassifierNames());
        return flatMapClassifierNamesOrNull;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getFunctionNames() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope[] memberScopeArr = (kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope[]) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.getHighSpeedVideoSizes, this, (kotlin.reflect.KProperty<?>) getHighSpeedVideoFpsRanges[0]);
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope : memberScopeArr) {
            kotlin.collections.CollectionsKt.addAll(linkedHashSet, memberScope.getFunctionNames());
        }
        java.util.LinkedHashSet linkedHashSet2 = linkedHashSet;
        linkedHashSet2.addAll(this.getHighResolutionOutputSizeshNQ4ISI.getFunctionNames());
        return linkedHashSet2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getVariableNames() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope[] memberScopeArr = (kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope[]) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.getHighSpeedVideoSizes, this, (kotlin.reflect.KProperty<?>) getHighSpeedVideoFpsRanges[0]);
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope : memberScopeArr) {
            kotlin.collections.CollectionsKt.addAll(linkedHashSet, memberScope.getVariableNames());
        }
        java.util.LinkedHashSet linkedHashSet2 = linkedHashSet;
        linkedHashSet2.addAll(this.getHighResolutionOutputSizeshNQ4ISI.getVariableNames());
        return linkedHashSet2;
    }
}
