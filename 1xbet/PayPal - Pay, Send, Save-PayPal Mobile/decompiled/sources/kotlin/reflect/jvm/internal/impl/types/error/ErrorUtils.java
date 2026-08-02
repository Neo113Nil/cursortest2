package kotlin.reflect.jvm.internal.impl.types.error;

/* loaded from: classes5.dex */
public final class ErrorUtils {
    private static final kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor Camera2StreamConfigurationMap;
    private static final kotlin.reflect.jvm.internal.impl.types.error.ErrorClassDescriptor getHighResolutionOutputSizeshNQ4ISI;
    private static final kotlin.reflect.jvm.internal.impl.types.KotlinType getHighSpeedVideoFpsRangesFor;
    private static final java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> getHighSpeedVideoSizes;
    private static final kotlin.reflect.jvm.internal.impl.types.KotlinType getOutputMinFrameDuration;
    public static final kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils INSTANCE = new kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils();
    private static final kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor getHighSpeedVideoFpsRanges = kotlin.reflect.jvm.internal.impl.types.error.ErrorModuleDescriptor.INSTANCE;

    private ErrorUtils() {
    }

    static {
        java.lang.String format = java.lang.String.format(kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity.ERROR_CLASS.getDebugText(), java.util.Arrays.copyOf(new java.lang.Object[]{"unknown class"}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        kotlin.reflect.jvm.internal.impl.name.Name special = kotlin.reflect.jvm.internal.impl.name.Name.special(format);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(special, "");
        getHighResolutionOutputSizeshNQ4ISI = new kotlin.reflect.jvm.internal.impl.types.error.ErrorClassDescriptor(special);
        getOutputMinFrameDuration = createErrorType(kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind.CYCLIC_SUPERTYPES, new java.lang.String[0]);
        getHighSpeedVideoFpsRangesFor = createErrorType(kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind.ERROR_PROPERTY_TYPE, new java.lang.String[0]);
        kotlin.reflect.jvm.internal.impl.types.error.ErrorPropertyDescriptor errorPropertyDescriptor = new kotlin.reflect.jvm.internal.impl.types.error.ErrorPropertyDescriptor();
        Camera2StreamConfigurationMap = errorPropertyDescriptor;
        getHighSpeedVideoSizes = kotlin.collections.SetsKt.setOf(errorPropertyDescriptor);
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor getErrorModule() {
        return getHighSpeedVideoFpsRanges;
    }

    public final kotlin.reflect.jvm.internal.impl.types.error.ErrorClassDescriptor getErrorClass() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    public final kotlin.reflect.jvm.internal.impl.types.KotlinType getErrorTypeForLoopInSupertypes() {
        return getOutputMinFrameDuration;
    }

    public final kotlin.reflect.jvm.internal.impl.types.KotlinType getErrorPropertyType() {
        return getHighSpeedVideoFpsRangesFor;
    }

    public final java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> getErrorPropertyGroup() {
        return getHighSpeedVideoSizes;
    }

    @kotlin.jvm.JvmStatic
    public static final kotlin.reflect.jvm.internal.impl.types.error.ErrorScope createErrorScope(kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind errorScopeKind, java.lang.String... strArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorScopeKind, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "");
        return createErrorScope(errorScopeKind, false, (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
    }

    @kotlin.jvm.JvmStatic
    public static final kotlin.reflect.jvm.internal.impl.types.error.ErrorScope createErrorScope(kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind errorScopeKind, boolean z, java.lang.String... strArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorScopeKind, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "");
        return z ? new kotlin.reflect.jvm.internal.impl.types.error.ThrowingScope(errorScopeKind, (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length)) : new kotlin.reflect.jvm.internal.impl.types.error.ErrorScope(errorScopeKind, (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
    }

    @kotlin.jvm.JvmStatic
    public static final kotlin.reflect.jvm.internal.impl.types.error.ErrorType createErrorType(kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind errorTypeKind, java.lang.String... strArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorTypeKind, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "");
        return INSTANCE.createErrorTypeWithArguments(errorTypeKind, kotlin.collections.CollectionsKt.emptyList(), (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
    }

    public final kotlin.reflect.jvm.internal.impl.types.error.ErrorType createErrorType(kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind errorTypeKind, kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor, java.lang.String... strArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorTypeKind, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeConstructor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "");
        return createErrorTypeWithArguments(errorTypeKind, kotlin.collections.CollectionsKt.emptyList(), typeConstructor, (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
    }

    public final kotlin.reflect.jvm.internal.impl.types.error.ErrorType createErrorTypeWithArguments(kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind errorTypeKind, java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.TypeProjection> list, java.lang.String... strArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorTypeKind, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "");
        return createErrorTypeWithArguments(errorTypeKind, list, createErrorTypeConstructor(errorTypeKind, (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length)), (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
    }

    public final kotlin.reflect.jvm.internal.impl.types.error.ErrorType createErrorTypeWithArguments(kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind errorTypeKind, java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.TypeProjection> list, kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor, java.lang.String... strArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorTypeKind, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeConstructor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "");
        return new kotlin.reflect.jvm.internal.impl.types.error.ErrorType(typeConstructor, createErrorScope(kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind.ERROR_TYPE_SCOPE, typeConstructor.toString()), errorTypeKind, list, false, (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
    }

    public final kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeConstructor createErrorTypeConstructor(kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind errorTypeKind, java.lang.String... strArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorTypeKind, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "");
        return new kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeConstructor(errorTypeKind, (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isUninferredTypeVariable(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor constructor = kotlinType.getConstructor();
        return (constructor instanceof kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeConstructor) && ((kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeConstructor) constructor).getKind() == kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind.UNINFERRED_TYPE_VARIABLE;
    }

    public final java.lang.String unresolvedTypeAsItIs(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.isUnresolvedType(kotlinType);
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor constructor = kotlinType.getConstructor();
        kotlin.jvm.internal.Intrinsics.checkNotNull(constructor, "");
        return ((kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeConstructor) constructor).getParam(0);
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isError(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor != null) {
            return (declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.types.error.ErrorClassDescriptor) || (declarationDescriptor.getContainingDeclaration() instanceof kotlin.reflect.jvm.internal.impl.types.error.ErrorClassDescriptor) || declarationDescriptor == getHighSpeedVideoFpsRanges;
        }
        return false;
    }
}
