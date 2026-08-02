package kotlin.reflect.jvm.internal.impl.resolve.scopes;

/* loaded from: classes5.dex */
public final class InnerClassesScopeWrapper extends kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl {
    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getHighSpeedVideoFpsRanges;

    public InnerClassesScopeWrapper(kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(memberScope, "");
        this.getHighSpeedVideoFpsRanges = memberScope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public final /* bridge */ /* synthetic */ java.util.Collection getContributedDescriptors(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter descriptorKindFilter, kotlin.jvm.functions.Function1 function1) {
        return getContributedDescriptors(descriptorKindFilter, (kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean>) function1);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* renamed from: getContributedClassifier */
    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23899getContributedClassifier(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lookupLocation, "");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor contributedClassifier = this.getHighSpeedVideoFpsRanges.mo23899getContributedClassifier(name2, lookupLocation);
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptor = null;
        if (contributedClassifier != null) {
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = contributedClassifier instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor ? (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) contributedClassifier : null;
            if (classDescriptor != null) {
                classifierDescriptor = classDescriptor;
            } else if (contributedClassifier instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor) {
                classifierDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor) contributedClassifier;
            }
            classifierDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters) classifierDescriptor;
        }
        return classifierDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor> getContributedDescriptors(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter descriptorKindFilter, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptorKindFilter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter restrictedToKindsOrNull = descriptorKindFilter.restrictedToKindsOrNull(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.Companion.getCLASSIFIERS_MASK());
        if (restrictedToKindsOrNull == null) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> contributedDescriptors = this.getHighSpeedVideoFpsRanges.getContributedDescriptors(restrictedToKindsOrNull, function1);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : contributedDescriptors) {
            if (obj instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getFunctionNames() {
        return this.getHighSpeedVideoFpsRanges.getFunctionNames();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getVariableNames() {
        return this.getHighSpeedVideoFpsRanges.getVariableNames();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getClassifierNames() {
        return this.getHighSpeedVideoFpsRanges.getClassifierNames();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* renamed from: recordLookup */
    public final void mo23903recordLookup(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lookupLocation, "");
        this.getHighSpeedVideoFpsRanges.mo23903recordLookup(name2, lookupLocation);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Classes from ");
        sb.append(this.getHighSpeedVideoFpsRanges);
        return sb.toString();
    }
}
