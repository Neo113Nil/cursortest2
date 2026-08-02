package kotlin.reflect.jvm.internal.impl.types.error;

/* loaded from: classes5.dex */
public final class ErrorTypeConstructor implements kotlin.reflect.jvm.internal.impl.types.TypeConstructor {
    private final java.lang.String getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind getHighSpeedVideoFpsRangesFor;
    private final java.lang.String[] getHighSpeedVideoSizes;

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final boolean isDenotable() {
        return false;
    }

    public ErrorTypeConstructor(kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind errorTypeKind, java.lang.String... strArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorTypeKind, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "");
        this.getHighSpeedVideoFpsRangesFor = errorTypeKind;
        this.getHighSpeedVideoSizes = strArr;
        java.lang.String debugText = kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity.ERROR_TYPE.getDebugText();
        java.lang.String debugMessage = errorTypeKind.getDebugMessage();
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(strArr, strArr.length);
        java.lang.String format = java.lang.String.format(debugMessage, java.util.Arrays.copyOf(copyOf, copyOf.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        java.lang.String format2 = java.lang.String.format(debugText, java.util.Arrays.copyOf(new java.lang.Object[]{format}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format2, "");
        this.getHighSpeedVideoFpsRanges = format2;
    }

    public final kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind getKind() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final java.lang.String getParam(int i) {
        return this.getHighSpeedVideoSizes[i];
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getParameters() {
        return kotlin.collections.CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> getSupertypes() {
        return kotlin.collections.CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* renamed from: getDeclarationDescriptor */
    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor() {
        return kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils.INSTANCE.getErrorClass();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns getBuiltIns() {
        return kotlin.reflect.jvm.internal.impl.builtins.DefaultBuiltIns.Companion.getInstance();
    }

    public final java.lang.String toString() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final kotlin.reflect.jvm.internal.impl.types.TypeConstructor refine(kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "");
        return this;
    }
}
