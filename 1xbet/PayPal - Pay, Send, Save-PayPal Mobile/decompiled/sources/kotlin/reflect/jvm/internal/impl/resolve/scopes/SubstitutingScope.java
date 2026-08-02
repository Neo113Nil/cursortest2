package kotlin.reflect.jvm.internal.impl.resolve.scopes;

/* loaded from: classes5.dex */
public final class SubstitutingScope implements kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope {
    private final kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor Camera2StreamConfigurationMap;
    private final kotlin.Lazy getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.Lazy getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getHighSpeedVideoFpsRangesFor;
    private java.util.Map<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> getHighSpeedVideoSizes;

    public SubstitutingScope(kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope, final kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor typeSubstitutor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(memberScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSubstitutor, "");
        this.getHighSpeedVideoFpsRangesFor = memberScope;
        this.getHighSpeedVideoFpsRanges = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(typeSubstitutor) { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope$$Lambda$0
            private final kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor getHighSpeedVideoSizes;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor buildSubstitutor;
                buildSubstitutor = this.getHighSpeedVideoSizes.getSubstitution().buildSubstitutor();
                return buildSubstitutor;
            }

            {
                this.getHighSpeedVideoSizes = typeSubstitutor;
            }
        });
        kotlin.reflect.jvm.internal.impl.types.TypeSubstitution substitution = typeSubstitutor.getSubstitution();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substitution, "");
        this.Camera2StreamConfigurationMap = kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt.wrapWithCapturingSubstitution$default(substitution, false, 1, null).buildSubstitutor();
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope$$Lambda$1
            private final kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope getHighSpeedVideoFpsRanges;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                java.util.Collection highResolutionOutputSizeshNQ4ISI;
                highResolutionOutputSizeshNQ4ISI = r0.getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope.DefaultImpls.getContributedDescriptors$default(this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor, null, null, 3, null));
                return highResolutionOutputSizeshNQ4ISI;
            }

            {
                this.getHighSpeedVideoFpsRanges = this;
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* renamed from: recordLookup */
    public final /* bridge */ void mo23903recordLookup(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.DefaultImpls.recordLookup(this, name2, lookupLocation);
    }

    private final <D extends kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> D getHighSpeedVideoFpsRanges(D d) {
        if (this.Camera2StreamConfigurationMap.isEmpty()) {
            return d;
        }
        if (this.getHighSpeedVideoSizes == null) {
            this.getHighSpeedVideoSizes = new java.util.HashMap();
        }
        java.util.Map<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> map = this.getHighSpeedVideoSizes;
        kotlin.jvm.internal.Intrinsics.checkNotNull(map);
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot declarationDescriptorNonRoot = map.get(d);
        if (declarationDescriptorNonRoot == null) {
            if (!(d instanceof kotlin.reflect.jvm.internal.impl.descriptors.Substitutable)) {
                throw new java.lang.IllegalStateException("Unknown descriptor in scope: ".concat(java.lang.String.valueOf(d)).toString());
            }
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot substitute = ((kotlin.reflect.jvm.internal.impl.descriptors.Substitutable) d).substitute(this.Camera2StreamConfigurationMap);
            if (substitute == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but ");
                sb.append(d);
                sb.append(" substitution fails");
                throw new java.lang.AssertionError(sb.toString());
            }
            declarationDescriptorNonRoot = substitute;
            map.put(d, declarationDescriptorNonRoot);
        }
        D d2 = (D) declarationDescriptorNonRoot;
        kotlin.jvm.internal.Intrinsics.checkNotNull(d2, "");
        return d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final <D extends kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> java.util.Collection<D> getHighResolutionOutputSizeshNQ4ISI(java.util.Collection<? extends D> collection) {
        if (this.Camera2StreamConfigurationMap.isEmpty() || collection.isEmpty()) {
            return collection;
        }
        java.util.LinkedHashSet newLinkedHashSetWithExpectedSize = kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.newLinkedHashSetWithExpectedSize(collection.size());
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            newLinkedHashSetWithExpectedSize.add(getHighSpeedVideoFpsRanges((kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope) it.next()));
        }
        return newLinkedHashSetWithExpectedSize;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> getContributedVariables(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lookupLocation, "");
        return getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor.getContributedVariables(name2, lookupLocation));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* renamed from: getContributedClassifier */
    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23899getContributedClassifier(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lookupLocation, "");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor contributedClassifier = this.getHighSpeedVideoFpsRangesFor.mo23899getContributedClassifier(name2, lookupLocation);
        if (contributedClassifier != null) {
            return (kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor) getHighSpeedVideoFpsRanges((kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope) contributedClassifier);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public final java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> getContributedFunctions(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lookupLocation, "");
        return getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor.getContributedFunctions(name2, lookupLocation));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getFunctionNames() {
        return this.getHighSpeedVideoFpsRangesFor.getFunctionNames();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getVariableNames() {
        return this.getHighSpeedVideoFpsRangesFor.getVariableNames();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getClassifierNames() {
        return this.getHighSpeedVideoFpsRangesFor.getClassifierNames();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> getContributedDescriptors(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter descriptorKindFilter, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptorKindFilter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return (java.util.Collection) this.getHighResolutionOutputSizeshNQ4ISI.getValue();
    }
}
