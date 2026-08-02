package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

/* loaded from: classes5.dex */
public final class CapturedTypeConstructorImpl implements kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor {
    private kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.impl.types.TypeProjection getHighSpeedVideoSizes;

    public final java.lang.Void getDeclarationDescriptor() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final boolean isDenotable() {
        return false;
    }

    public CapturedTypeConstructorImpl(kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeProjection, "");
        this.getHighSpeedVideoSizes = typeProjection;
        getProjection().getProjectionKind();
        kotlin.reflect.jvm.internal.impl.types.Variance variance = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* renamed from: getDeclarationDescriptor, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor() {
        return (kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor) getDeclarationDescriptor();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor
    public final kotlin.reflect.jvm.internal.impl.types.TypeProjection getProjection() {
        return this.getHighSpeedVideoSizes;
    }

    public final kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor getNewTypeConstructor() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final void setNewTypeConstructor(kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor newCapturedTypeConstructor) {
        this.getHighSpeedVideoFpsRanges = newCapturedTypeConstructor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getParameters() {
        return kotlin.collections.CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> getSupertypes() {
        kotlin.reflect.jvm.internal.impl.types.SimpleType nullableAnyType;
        if (getProjection().getProjectionKind() == kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE) {
            nullableAnyType = getProjection().getType();
        } else {
            nullableAnyType = getBuiltIns().getNullableAnyType();
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(nullableAnyType);
        return kotlin.collections.CollectionsKt.listOf(nullableAnyType);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CapturedTypeConstructor(");
        sb.append(getProjection());
        sb.append(')');
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns getBuiltIns() {
        kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns builtIns = getProjection().getType().getConstructor().getBuiltIns();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builtIns, "");
        return builtIns;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorImpl refine(kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "");
        kotlin.reflect.jvm.internal.impl.types.TypeProjection refine = getProjection().refine(kotlinTypeRefiner);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(refine, "");
        return new kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorImpl(refine);
    }
}
