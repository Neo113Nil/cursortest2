package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
public final class IntersectionTypeConstructor implements kotlin.reflect.jvm.internal.impl.types.TypeConstructor, kotlin.reflect.jvm.internal.impl.types.model.IntersectionTypeConstructorMarker {
    private kotlin.reflect.jvm.internal.impl.types.KotlinType getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRanges;
    private final java.util.LinkedHashSet<kotlin.reflect.jvm.internal.impl.types.KotlinType> getHighSpeedVideoSizes;

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* renamed from: getDeclarationDescriptor */
    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final boolean isDenotable() {
        return false;
    }

    public IntersectionTypeConstructor(java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.types.KotlinType> collection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        collection.isEmpty();
        java.util.LinkedHashSet<kotlin.reflect.jvm.internal.impl.types.KotlinType> linkedHashSet = new java.util.LinkedHashSet<>(collection);
        this.getHighSpeedVideoSizes = linkedHashSet;
        this.getHighSpeedVideoFpsRanges = linkedHashSet.hashCode();
    }

    private IntersectionTypeConstructor(java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.types.KotlinType> collection, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        this(collection);
        this.getHighResolutionOutputSizeshNQ4ISI = kotlinType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getParameters() {
        return kotlin.collections.CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> getSupertypes() {
        return this.getHighSpeedVideoSizes;
    }

    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope createScopeForKotlinType() {
        return kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope.Companion.create("member scope for intersection type", this.getHighSpeedVideoSizes);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns getBuiltIns() {
        kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns builtIns = this.getHighSpeedVideoSizes.iterator().next().getConstructor().getBuiltIns();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builtIns, "");
        return builtIns;
    }

    public final java.lang.String toString() {
        return makeDebugNameForIntersectionType$default(this, null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.String makeDebugNameForIntersectionType$default(kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor intersectionTypeConstructor, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor$$Lambda$1
                @Override // kotlin.jvm.functions.Function1
                public java.lang.Object invoke(java.lang.Object obj2) {
                    return kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor.getHighSpeedVideoFpsRanges((kotlin.reflect.jvm.internal.impl.types.KotlinType) obj2);
                }
            };
        }
        return intersectionTypeConstructor.makeDebugNameForIntersectionType(function1);
    }

    public final java.lang.String makeDebugNameForIntersectionType(final kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.types.KotlinType, ? extends java.lang.Object> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return kotlin.collections.CollectionsKt.joinToString$default(kotlin.collections.CollectionsKt.sortedWith(this.getHighSpeedVideoSizes, new java.util.Comparator() { // from class: kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor$makeDebugNameForIntersectionType$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType = (kotlin.reflect.jvm.internal.impl.types.KotlinType) t;
                kotlin.jvm.functions.Function1 function12 = kotlin.jvm.functions.Function1.this;
                kotlin.jvm.internal.Intrinsics.checkNotNull(kotlinType);
                java.lang.String obj = function12.invoke(kotlinType).toString();
                kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType2 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) t2;
                kotlin.jvm.functions.Function1 function13 = kotlin.jvm.functions.Function1.this;
                kotlin.jvm.internal.Intrinsics.checkNotNull(kotlinType2);
                return kotlin.comparisons.ComparisonsKt.compareValues(obj, function13.invoke(kotlinType2).toString());
            }
        }), " & ", "{", "}", 0, null, new kotlin.jvm.functions.Function1(function1) { // from class: kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor$$Lambda$0
            private final kotlin.jvm.functions.Function1 getHighResolutionOutputSizeshNQ4ISI;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor.getHighSpeedVideoFpsRanges(this.getHighResolutionOutputSizeshNQ4ISI, (kotlin.reflect.jvm.internal.impl.types.KotlinType) obj);
            }

            {
                this.getHighResolutionOutputSizeshNQ4ISI = function1;
            }
        }, 24, null);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor) {
            return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, ((kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor) obj).getHighSpeedVideoSizes);
        }
        return false;
    }

    public final kotlin.reflect.jvm.internal.impl.types.SimpleType createType() {
        return kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(kotlin.reflect.jvm.internal.impl.types.TypeAttributes.Companion.getEmpty(), this, kotlin.collections.CollectionsKt.emptyList(), false, createScopeForKotlinType(), new kotlin.jvm.functions.Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor$$Lambda$2
            private final kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor getHighResolutionOutputSizeshNQ4ISI;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor.getHighSpeedVideoFpsRanges(this.getHighResolutionOutputSizeshNQ4ISI, (kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner) obj);
            }

            {
                this.getHighResolutionOutputSizeshNQ4ISI = this;
            }
        });
    }

    public final int hashCode() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor setAlternative(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        return new kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor(this.getHighSpeedVideoSizes, kotlinType);
    }

    public final kotlin.reflect.jvm.internal.impl.types.KotlinType getAlternativeType() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor refine(kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "");
        java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> supertypes = getSupertypes();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(supertypes, 10));
        java.util.Iterator<T> it = supertypes.iterator();
        boolean z = false;
        while (it.hasNext()) {
            arrayList.add(((kotlin.reflect.jvm.internal.impl.types.KotlinType) it.next()).refine(kotlinTypeRefiner));
            z = true;
        }
        java.util.ArrayList arrayList2 = arrayList;
        kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor intersectionTypeConstructor = null;
        if (z) {
            kotlin.reflect.jvm.internal.impl.types.KotlinType alternativeType = getAlternativeType();
            intersectionTypeConstructor = new kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor(arrayList2).setAlternative(alternativeType != null ? alternativeType.refine(kotlinTypeRefiner) : null);
        }
        return intersectionTypeConstructor == null ? this : intersectionTypeConstructor;
    }

    static /* synthetic */ java.lang.CharSequence getHighSpeedVideoFpsRanges(kotlin.jvm.functions.Function1 function1, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(kotlinType);
        return function1.invoke(kotlinType).toString();
    }

    static /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        return kotlinType.toString();
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.SimpleType getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor intersectionTypeConstructor, kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "");
        return intersectionTypeConstructor.refine(kotlinTypeRefiner).createType();
    }
}
