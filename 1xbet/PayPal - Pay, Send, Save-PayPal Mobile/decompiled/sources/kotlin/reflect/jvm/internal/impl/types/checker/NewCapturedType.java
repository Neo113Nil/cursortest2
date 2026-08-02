package kotlin.reflect.jvm.internal.impl.types.checker;

/* loaded from: classes5.dex */
public final class NewCapturedType extends kotlin.reflect.jvm.internal.impl.types.SimpleType implements kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker {
    private final kotlin.reflect.jvm.internal.impl.types.TypeAttributes Camera2StreamConfigurationMap;
    private final kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor getHighSpeedVideoFpsRanges;
    private final boolean getHighSpeedVideoFpsRangesFor;
    private final boolean getHighSpeedVideoSizes;
    private final kotlin.reflect.jvm.internal.impl.types.UnwrappedType getOutputFormats;

    public NewCapturedType(kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus captureStatus, kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor newCapturedTypeConstructor, kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedType, kotlin.reflect.jvm.internal.impl.types.TypeAttributes typeAttributes, boolean z, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(captureStatus, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newCapturedTypeConstructor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeAttributes, "");
        this.getHighResolutionOutputSizeshNQ4ISI = captureStatus;
        this.getHighSpeedVideoFpsRanges = newCapturedTypeConstructor;
        this.getOutputFormats = unwrappedType;
        this.Camera2StreamConfigurationMap = typeAttributes;
        this.getHighSpeedVideoFpsRangesFor = z;
        this.getHighSpeedVideoSizes = z2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public final /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.UnwrappedType replaceAttributes(kotlin.reflect.jvm.internal.impl.types.TypeAttributes typeAttributes) {
        return replaceAttributes(typeAttributes);
    }

    public final kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus getCaptureStatus() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor getConstructor() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final kotlin.reflect.jvm.internal.impl.types.UnwrappedType getLowerType() {
        return this.getOutputFormats;
    }

    public /* synthetic */ NewCapturedType(kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus captureStatus, kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor newCapturedTypeConstructor, kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedType, kotlin.reflect.jvm.internal.impl.types.TypeAttributes typeAttributes, boolean z, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(captureStatus, newCapturedTypeConstructor, unwrappedType, (i & 8) != 0 ? kotlin.reflect.jvm.internal.impl.types.TypeAttributes.Companion.getEmpty() : typeAttributes, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final kotlin.reflect.jvm.internal.impl.types.TypeAttributes getAttributes() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final boolean isMarkedNullable() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final boolean isProjectionNotNull() {
        return this.getHighSpeedVideoSizes;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NewCapturedType(kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus captureStatus, kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedType, kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection, kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor) {
        this(captureStatus, new kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor(typeProjection, null, null, typeParameterDescriptor, 6, null), unwrappedType, null, false, false, 56, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(captureStatus, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeProjection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeParameterDescriptor, "");
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> getArguments() {
        return kotlin.collections.CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getMemberScope() {
        return kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils.createErrorScope(kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind.CAPTURED_TYPE_SCOPE, true, new java.lang.String[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public final kotlin.reflect.jvm.internal.impl.types.SimpleType replaceAttributes(kotlin.reflect.jvm.internal.impl.types.TypeAttributes typeAttributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeAttributes, "");
        return new kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType(this.getHighResolutionOutputSizeshNQ4ISI, getConstructor(), this.getOutputFormats, typeAttributes, isMarkedNullable(), this.getHighSpeedVideoSizes);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public final kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType makeNullableAsSpecified(boolean z) {
        return new kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType(this.getHighResolutionOutputSizeshNQ4ISI, getConstructor(), this.getOutputFormats, getAttributes(), z, false, 32, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType refine(kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "");
        kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus captureStatus = this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor refine = getConstructor().refine(kotlinTypeRefiner);
        kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedType = this.getOutputFormats;
        return new kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType(captureStatus, refine, unwrappedType != null ? kotlinTypeRefiner.refineType((kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker) unwrappedType).unwrap() : null, getAttributes(), isMarkedNullable(), false, 32, null);
    }
}
