package kotlin.reflect.jvm.internal.impl.types.error;

/* loaded from: classes5.dex */
public final class ErrorType extends kotlin.reflect.jvm.internal.impl.types.SimpleType {
    private final kotlin.reflect.jvm.internal.impl.types.TypeConstructor Camera2StreamConfigurationMap;
    private final java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String[] getHighSpeedVideoFpsRanges;
    private final boolean getHighSpeedVideoFpsRangesFor;
    private final java.lang.String getHighSpeedVideoSizes;
    private final kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind getHighSpeedVideoSizesFor;
    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getInputFormats;

    /* JADX WARN: Multi-variable type inference failed */
    public ErrorType(kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope, kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind errorTypeKind, java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.TypeProjection> list, boolean z, java.lang.String... strArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeConstructor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(memberScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorTypeKind, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "");
        this.Camera2StreamConfigurationMap = typeConstructor;
        this.getInputFormats = memberScope;
        this.getHighSpeedVideoSizesFor = errorTypeKind;
        this.getHighResolutionOutputSizeshNQ4ISI = list;
        this.getHighSpeedVideoFpsRangesFor = z;
        this.getHighSpeedVideoFpsRanges = strArr;
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String debugMessage = errorTypeKind.getDebugMessage();
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(strArr, strArr.length);
        java.lang.String format = java.lang.String.format(debugMessage, java.util.Arrays.copyOf(copyOf, copyOf.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        this.getHighSpeedVideoSizes = format;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public final /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.UnwrappedType makeNullableAsSpecified(boolean z) {
        return makeNullableAsSpecified(z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public final /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.UnwrappedType replaceAttributes(kotlin.reflect.jvm.internal.impl.types.TypeAttributes typeAttributes) {
        return replaceAttributes(typeAttributes);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final kotlin.reflect.jvm.internal.impl.types.TypeConstructor getConstructor() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getMemberScope() {
        return this.getInputFormats;
    }

    public final kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind getKind() {
        return this.getHighSpeedVideoSizesFor;
    }

    public /* synthetic */ ErrorType(kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope, kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind errorTypeKind, java.util.List list, boolean z, java.lang.String[] strArr, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(typeConstructor, memberScope, errorTypeKind, (i & 8) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 16) != 0 ? false : z, strArr);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> getArguments() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final boolean isMarkedNullable() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final java.lang.String getDebugMessage() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final kotlin.reflect.jvm.internal.impl.types.TypeAttributes getAttributes() {
        return kotlin.reflect.jvm.internal.impl.types.TypeAttributes.Companion.getEmpty();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public final kotlin.reflect.jvm.internal.impl.types.SimpleType replaceAttributes(kotlin.reflect.jvm.internal.impl.types.TypeAttributes typeAttributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeAttributes, "");
        return this;
    }

    public final kotlin.reflect.jvm.internal.impl.types.error.ErrorType replaceArguments(java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.TypeProjection> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor constructor = getConstructor();
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope = getMemberScope();
        kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind errorTypeKind = this.getHighSpeedVideoSizesFor;
        boolean isMarkedNullable = isMarkedNullable();
        java.lang.String[] strArr = this.getHighSpeedVideoFpsRanges;
        return new kotlin.reflect.jvm.internal.impl.types.error.ErrorType(constructor, memberScope, errorTypeKind, list, isMarkedNullable, (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public final kotlin.reflect.jvm.internal.impl.types.SimpleType makeNullableAsSpecified(boolean z) {
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor constructor = getConstructor();
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope = getMemberScope();
        kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind errorTypeKind = this.getHighSpeedVideoSizesFor;
        java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> arguments = getArguments();
        java.lang.String[] strArr = this.getHighSpeedVideoFpsRanges;
        return new kotlin.reflect.jvm.internal.impl.types.error.ErrorType(constructor, memberScope, errorTypeKind, arguments, z, (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final kotlin.reflect.jvm.internal.impl.types.error.ErrorType refine(kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "");
        return this;
    }
}
