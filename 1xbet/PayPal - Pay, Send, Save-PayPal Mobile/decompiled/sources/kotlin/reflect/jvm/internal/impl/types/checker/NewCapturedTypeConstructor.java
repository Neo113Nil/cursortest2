package kotlin.reflect.jvm.internal.impl.types.checker;

/* loaded from: classes5.dex */
public final class NewCapturedTypeConstructor implements kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor {
    private final kotlin.reflect.jvm.internal.impl.types.TypeProjection Camera2StreamConfigurationMap;
    private final kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor getHighSpeedVideoFpsRanges;
    private kotlin.jvm.functions.Function0<? extends java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.UnwrappedType>> getHighSpeedVideoFpsRangesFor;
    private final kotlin.Lazy getHighSpeedVideoSizes;

    static /* synthetic */ java.util.List getHighResolutionOutputSizeshNQ4ISI(java.util.List list) {
        return list;
    }

    static /* synthetic */ java.util.List getHighSpeedVideoSizes(java.util.List list) {
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* renamed from: getDeclarationDescriptor */
    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final boolean isDenotable() {
        return false;
    }

    public NewCapturedTypeConstructor(kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection, kotlin.jvm.functions.Function0<? extends java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.UnwrappedType>> function0, kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor newCapturedTypeConstructor, kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeProjection, "");
        this.Camera2StreamConfigurationMap = typeProjection;
        this.getHighSpeedVideoFpsRangesFor = function0;
        this.getHighResolutionOutputSizeshNQ4ISI = newCapturedTypeConstructor;
        this.getHighSpeedVideoFpsRanges = typeParameterDescriptor;
        this.getHighSpeedVideoSizes = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor$$Lambda$0
            private final kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor getHighSpeedVideoFpsRanges;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRanges);
            }

            {
                this.getHighSpeedVideoFpsRanges = this;
            }
        });
    }

    public /* synthetic */ NewCapturedTypeConstructor(kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection, kotlin.jvm.functions.Function0 function0, kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor newCapturedTypeConstructor, kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(typeProjection, (i & 2) != 0 ? null : function0, (i & 4) != 0 ? null : newCapturedTypeConstructor, (i & 8) != 0 ? null : typeParameterDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor
    public final kotlin.reflect.jvm.internal.impl.types.TypeProjection getProjection() {
        return this.Camera2StreamConfigurationMap;
    }

    public /* synthetic */ NewCapturedTypeConstructor(kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection, java.util.List list, kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor newCapturedTypeConstructor, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(typeProjection, list, (i & 4) != 0 ? null : newCapturedTypeConstructor);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NewCapturedTypeConstructor(kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection, final java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.UnwrappedType> list, kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor newCapturedTypeConstructor) {
        this(typeProjection, new kotlin.jvm.functions.Function0(list) { // from class: kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor$$Lambda$1
            private final java.util.List getHighSpeedVideoFpsRanges;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges);
            }

            {
                this.getHighSpeedVideoFpsRanges = list;
            }
        }, newCapturedTypeConstructor, null, 8, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeProjection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
    }

    public final void initializeSupertypes(final java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.UnwrappedType> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.getHighSpeedVideoFpsRangesFor = new kotlin.jvm.functions.Function0(list) { // from class: kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor$$Lambda$2
            private final java.util.List getHighResolutionOutputSizeshNQ4ISI;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor.getHighSpeedVideoSizes(this.getHighResolutionOutputSizeshNQ4ISI);
            }

            {
                this.getHighResolutionOutputSizeshNQ4ISI = list;
            }
        };
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getParameters() {
        return kotlin.collections.CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns getBuiltIns() {
        kotlin.reflect.jvm.internal.impl.types.KotlinType type = getProjection().getType();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "");
        return kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.getBuiltIns(type);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor refine(final kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "");
        kotlin.reflect.jvm.internal.impl.types.TypeProjection refine = getProjection().refine(kotlinTypeRefiner);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(refine, "");
        kotlin.jvm.functions.Function0 function0 = this.getHighSpeedVideoFpsRangesFor != null ? new kotlin.jvm.functions.Function0(this, kotlinTypeRefiner) { // from class: kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor$$Lambda$3
            private final kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor getHighSpeedVideoFpsRangesFor;
            private final kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner getHighSpeedVideoSizes;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes);
            }

            {
                this.getHighSpeedVideoFpsRangesFor = this;
                this.getHighSpeedVideoSizes = kotlinTypeRefiner;
            }
        } : null;
        kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor newCapturedTypeConstructor = this.getHighResolutionOutputSizeshNQ4ISI;
        if (newCapturedTypeConstructor == null) {
            newCapturedTypeConstructor = this;
        }
        return new kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor(refine, function0, newCapturedTypeConstructor, this.getHighSpeedVideoFpsRanges);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor newCapturedTypeConstructor = (kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor) obj;
        kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor newCapturedTypeConstructor2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (newCapturedTypeConstructor2 == null) {
            newCapturedTypeConstructor2 = this;
        }
        kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor newCapturedTypeConstructor3 = newCapturedTypeConstructor.getHighResolutionOutputSizeshNQ4ISI;
        if (newCapturedTypeConstructor3 != null) {
            obj = newCapturedTypeConstructor3;
        }
        return newCapturedTypeConstructor2 == obj;
    }

    public final int hashCode() {
        kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor newCapturedTypeConstructor = this;
        while (true) {
            kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor newCapturedTypeConstructor2 = newCapturedTypeConstructor.getHighResolutionOutputSizeshNQ4ISI;
            if (newCapturedTypeConstructor2 == null) {
                return super.hashCode();
            }
            newCapturedTypeConstructor = newCapturedTypeConstructor2;
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CapturedType(");
        sb.append(getProjection());
        sb.append(')');
        return sb.toString();
    }

    static /* synthetic */ java.util.List getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor newCapturedTypeConstructor) {
        kotlin.jvm.functions.Function0<? extends java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.UnwrappedType>> function0 = newCapturedTypeConstructor.getHighSpeedVideoFpsRangesFor;
        if (function0 != null) {
            return function0.invoke();
        }
        return null;
    }

    static /* synthetic */ java.util.List getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor newCapturedTypeConstructor, kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner) {
        java.util.List<kotlin.reflect.jvm.internal.impl.types.UnwrappedType> supertypes = newCapturedTypeConstructor.getSupertypes();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(supertypes, 10));
        java.util.Iterator<T> it = supertypes.iterator();
        while (it.hasNext()) {
            arrayList.add(((kotlin.reflect.jvm.internal.impl.types.UnwrappedType) it.next()).refine(kotlinTypeRefiner));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final java.util.List<kotlin.reflect.jvm.internal.impl.types.UnwrappedType> getSupertypes() {
        java.util.List<kotlin.reflect.jvm.internal.impl.types.UnwrappedType> list = (java.util.List) this.getHighSpeedVideoSizes.getValue();
        return list == null ? kotlin.collections.CollectionsKt.emptyList() : list;
    }
}
