package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

/* loaded from: classes5.dex */
public final class CapturedType extends kotlin.reflect.jvm.internal.impl.types.SimpleType implements kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker {
    private final kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.types.TypeProjection getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.impl.types.TypeAttributes getHighSpeedVideoFpsRangesFor;
    private final boolean getHighSpeedVideoSizes;

    public CapturedType(kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection, kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor capturedTypeConstructor, boolean z, kotlin.reflect.jvm.internal.impl.types.TypeAttributes typeAttributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeProjection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(capturedTypeConstructor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeAttributes, "");
        this.getHighSpeedVideoFpsRanges = typeProjection;
        this.getHighResolutionOutputSizeshNQ4ISI = capturedTypeConstructor;
        this.getHighSpeedVideoSizes = z;
        this.getHighSpeedVideoFpsRangesFor = typeAttributes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public final /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.UnwrappedType replaceAttributes(kotlin.reflect.jvm.internal.impl.types.TypeAttributes typeAttributes) {
        return replaceAttributes(typeAttributes);
    }

    public /* synthetic */ CapturedType(kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection, kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorImpl capturedTypeConstructorImpl, boolean z, kotlin.reflect.jvm.internal.impl.types.TypeAttributes typeAttributes, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(typeProjection, (i & 2) != 0 ? new kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorImpl(typeProjection) : capturedTypeConstructorImpl, (i & 4) != 0 ? false : z, (i & 8) != 0 ? kotlin.reflect.jvm.internal.impl.types.TypeAttributes.Companion.getEmpty() : typeAttributes);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor getConstructor() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final boolean isMarkedNullable() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final kotlin.reflect.jvm.internal.impl.types.TypeAttributes getAttributes() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> getArguments() {
        return kotlin.collections.CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getMemberScope() {
        return kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils.createErrorScope(kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind.CAPTURED_TYPE_SCOPE, true, new java.lang.String[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Captured(");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(')');
        sb.append(isMarkedNullable() ? com.datadog.android.core.internal.CoreFeature.DEFAULT_APP_VERSION : "");
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public final kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedType makeNullableAsSpecified(boolean z) {
        return z == isMarkedNullable() ? this : new kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedType(this.getHighSpeedVideoFpsRanges, getConstructor(), z, getAttributes());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public final kotlin.reflect.jvm.internal.impl.types.SimpleType replaceAttributes(kotlin.reflect.jvm.internal.impl.types.TypeAttributes typeAttributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeAttributes, "");
        return new kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedType(this.getHighSpeedVideoFpsRanges, getConstructor(), isMarkedNullable(), typeAttributes);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedType refine(kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "");
        kotlin.reflect.jvm.internal.impl.types.TypeProjection refine = this.getHighSpeedVideoFpsRanges.refine(kotlinTypeRefiner);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(refine, "");
        return new kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedType(refine, getConstructor(), isMarkedNullable(), getAttributes());
    }
}
