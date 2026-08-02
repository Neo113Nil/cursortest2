package kotlin.reflect.jvm.internal.impl.resolve;

/* loaded from: classes5.dex */
public final class OverridingUtilTypeSystemContext implements kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext {
    private final java.util.Map<kotlin.reflect.jvm.internal.impl.types.TypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor> Camera2StreamConfigurationMap;
    private final kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.TypeConstructorEquality getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator getHighSpeedVideoFpsRanges;
    private final kotlin.jvm.functions.Function2<kotlin.reflect.jvm.internal.impl.types.KotlinType, kotlin.reflect.jvm.internal.impl.types.KotlinType, java.lang.Boolean> getHighSpeedVideoFpsRangesFor;
    private final kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public OverridingUtilTypeSystemContext(java.util.Map<kotlin.reflect.jvm.internal.impl.types.TypeConstructor, ? extends kotlin.reflect.jvm.internal.impl.types.TypeConstructor> map, kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.TypeConstructorEquality typeConstructorEquality, kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner, kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator kotlinTypePreparator, kotlin.jvm.functions.Function2<? super kotlin.reflect.jvm.internal.impl.types.KotlinType, ? super kotlin.reflect.jvm.internal.impl.types.KotlinType, java.lang.Boolean> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeConstructorEquality, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypePreparator, "");
        this.Camera2StreamConfigurationMap = map;
        this.getHighResolutionOutputSizeshNQ4ISI = typeConstructorEquality;
        this.getHighSpeedVideoSizes = kotlinTypeRefiner;
        this.getHighSpeedVideoFpsRanges = kotlinTypePreparator;
        this.getHighSpeedVideoFpsRangesFor = function2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final /* bridge */ int argumentsCount(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.argumentsCount(this, kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    public final /* bridge */ kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker arrayType(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.arrayType(this, kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final /* bridge */ kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker asArgumentList(kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.asArgumentList(this, rigidTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final /* bridge */ kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker asCapturedType(kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker simpleTypeMarker) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.asCapturedType(this, simpleTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker asCapturedTypeUnwrappingDnn(kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker) {
        return default$asCapturedTypeUnwrappingDnn(rigidTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final /* bridge */ kotlin.reflect.jvm.internal.impl.types.model.DefinitelyNotNullTypeMarker asDefinitelyNotNullType(kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.asDefinitelyNotNullType(this, rigidTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final /* bridge */ kotlin.reflect.jvm.internal.impl.types.model.DynamicTypeMarker asDynamicType(kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker flexibleTypeMarker) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.asDynamicType(this, flexibleTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final /* bridge */ kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker asFlexibleType(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.asFlexibleType(this, kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final /* bridge */ kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker asRigidType(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.asRigidType(this, kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final /* bridge */ kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker asTypeArgument(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.asTypeArgument(this, kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final /* bridge */ kotlin.reflect.jvm.internal.impl.types.SimpleType captureFromArguments(kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus captureStatus) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.captureFromArguments(this, rigidTypeMarker, captureStatus);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final /* bridge */ kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus captureStatus(kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker capturedTypeMarker) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.captureStatus(this, capturedTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext
    public final /* bridge */ kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker createFlexibleType(kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker2) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.createFlexibleType(this, rigidTypeMarker, rigidTypeMarker2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final java.util.List<kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker> fastCorrespondingSupertypes(kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker) {
        return default$fastCorrespondingSupertypes(rigidTypeMarker, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker get(kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker typeArgumentListMarker, int i) {
        return default$get(typeArgumentListMarker, i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final /* bridge */ kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker getArgument(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker, int i) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.getArgument(this, kotlinTypeMarker, i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker getArgumentOrNull(kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker, int i) {
        return default$getArgumentOrNull(rigidTypeMarker, i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final /* bridge */ java.util.List<kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker> getArguments(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.getArguments(this, kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext
    public final /* bridge */ kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns getBuiltIns() {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.getBuiltIns(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    public final /* bridge */ kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe getClassFqNameUnsafe(kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.getClassFqNameUnsafe(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final /* bridge */ kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker getParameter(kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker, int i) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.getParameter(this, typeConstructorMarker, i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final /* bridge */ java.util.List<kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker> getParameters(kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.getParameters(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    public final /* bridge */ kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType getPrimitiveArrayType(kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.getPrimitiveArrayType(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    public final /* bridge */ kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType getPrimitiveType(kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.getPrimitiveType(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    public final /* bridge */ kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker getRepresentativeUpperBound(kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker typeParameterMarker) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.getRepresentativeUpperBound(this, typeParameterMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final /* bridge */ kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker getType(kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker typeArgumentMarker) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.getType(this, typeArgumentMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final /* bridge */ kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker getTypeConstructor(kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker typeParameterMarker) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.getTypeConstructor(this, typeParameterMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final /* bridge */ kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker getTypeParameter(kotlin.reflect.jvm.internal.impl.types.model.TypeVariableTypeConstructorMarker typeVariableTypeConstructorMarker) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.getTypeParameter(this, typeVariableTypeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final /* bridge */ kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker getTypeParameterClassifier(kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.getTypeParameterClassifier(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    public final /* bridge */ kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker getUnsubstitutedUnderlyingType(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.getUnsubstitutedUnderlyingType(this, kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final /* bridge */ java.util.List<kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker> getUpperBounds(kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker typeParameterMarker) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.getUpperBounds(this, typeParameterMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final /* bridge */ kotlin.reflect.jvm.internal.impl.types.model.TypeVariance getVariance(kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker typeArgumentMarker) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.getVariance(this, typeArgumentMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final /* bridge */ kotlin.reflect.jvm.internal.impl.types.model.TypeVariance getVariance(kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker typeParameterMarker) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.getVariance(this, typeParameterMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    public final /* bridge */ boolean hasAnnotation(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker, kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.hasAnnotation(this, kotlinTypeMarker, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean hasFlexibleNullability(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        return default$hasFlexibleNullability(kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final /* bridge */ boolean hasRecursiveBounds(kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker typeParameterMarker, kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.hasRecursiveBounds(this, typeParameterMarker, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemOptimizationContext
    public final /* bridge */ boolean identicalArguments(kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker2) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.identicalArguments(this, rigidTypeMarker, rigidTypeMarker2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final /* bridge */ kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker intersectTypes(java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker> collection) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.intersectTypes(this, collection);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final /* bridge */ boolean isAnyConstructor(kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.isAnyConstructor(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    public final /* bridge */ boolean isArrayOrNullableArray(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.isArrayOrNullableArray(this, kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean isCapturedType(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        return default$isCapturedType(kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean isClassType(kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker) {
        return default$isClassType(rigidTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final /* bridge */ boolean isClassTypeConstructor(kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.isClassTypeConstructor(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final /* bridge */ boolean isCommonFinalClassConstructor(kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.isCommonFinalClassConstructor(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean isDefinitelyNotNullType(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        return default$isDefinitelyNotNullType(kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean isDefinitelyNotNullType(kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker) {
        return default$isDefinitelyNotNullType(rigidTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final /* bridge */ boolean isDenotable(kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.isDenotable(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean isDynamic(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        return default$isDynamic(kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final /* bridge */ boolean isError(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.isError(this, kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean isFlexible(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        return default$isFlexible(kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean isFlexibleWithDifferentTypeConstructors(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        return default$isFlexibleWithDifferentTypeConstructors(kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    public final /* bridge */ boolean isInlineClass(kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.isInlineClass(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean isIntegerLiteralType(kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker) {
        return default$isIntegerLiteralType(rigidTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final /* bridge */ boolean isIntegerLiteralTypeConstructor(kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.isIntegerLiteralTypeConstructor(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final /* bridge */ boolean isIntersection(kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.isIntersection(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemInferenceExtensionContext
    public final /* bridge */ boolean isK2() {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.isK2(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final /* bridge */ boolean isMarkedNullable(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.isMarkedNullable(this, kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final /* bridge */ boolean isNotNullTypeParameter(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.isNotNullTypeParameter(this, kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean isNothing(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        return default$isNothing(kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final /* bridge */ boolean isNothingConstructor(kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.isNothingConstructor(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final /* bridge */ boolean isNullableType(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.isNullableType(this, kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final /* bridge */ boolean isOldCapturedType(kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker capturedTypeMarker) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.isOldCapturedType(this, capturedTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final /* bridge */ boolean isPrimitiveType(kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker simpleTypeMarker) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.isPrimitiveType(this, simpleTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final /* bridge */ boolean isProjectionNotNull(kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker capturedTypeMarker) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.isProjectionNotNull(this, capturedTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final /* bridge */ boolean isRawType(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.isRawType(this, kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final /* bridge */ boolean isSingleClassifierType(kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.isSingleClassifierType(this, rigidTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final /* bridge */ boolean isStarProjection(kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker typeArgumentMarker) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.isStarProjection(this, typeArgumentMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final /* bridge */ boolean isStubType(kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.isStubType(this, rigidTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final /* bridge */ boolean isStubTypeForBuilderInference(kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.isStubTypeForBuilderInference(this, rigidTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final /* bridge */ boolean isTypeVariableType(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.isTypeVariableType(this, kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    public final /* bridge */ boolean isUnderKotlinPackage(kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.isUnderKotlinPackage(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final /* bridge */ kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker lowerBound(kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker flexibleTypeMarker) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.lowerBound(this, flexibleTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker lowerBoundIfFlexible(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        return default$lowerBoundIfFlexible(kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final /* bridge */ kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker lowerType(kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker capturedTypeMarker) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.lowerType(this, capturedTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker makeDefinitelyNotNullOrNotNull(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        return default$makeDefinitelyNotNullOrNotNull(kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final /* bridge */ kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker makeDefinitelyNotNullOrNotNull(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker, boolean z) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.makeDefinitelyNotNullOrNotNull(this, kotlinTypeMarker, z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    public final kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker makeNullable(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        return default$makeNullable(kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    public final /* bridge */ kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker nullableAnyType() {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.nullableAnyType(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final /* bridge */ kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker original(kotlin.reflect.jvm.internal.impl.types.model.DefinitelyNotNullTypeMarker definitelyNotNullTypeMarker) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.original(this, definitelyNotNullTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker originalIfDefinitelyNotNullable(kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker) {
        return default$originalIfDefinitelyNotNullable(rigidTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final /* bridge */ int parametersCount(kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.parametersCount(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final /* bridge */ java.util.Collection<kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker> possibleIntegerTypes(kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.possibleIntegerTypes(this, rigidTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final /* bridge */ kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker projection(kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeConstructorMarker capturedTypeConstructorMarker) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.projection(this, capturedTypeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final /* bridge */ kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker safeSubstitute(kotlin.reflect.jvm.internal.impl.types.model.TypeSubstitutorMarker typeSubstitutorMarker, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.safeSubstitute(this, typeSubstitutorMarker, kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final int size(kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker typeArgumentListMarker) {
        return default$size(typeArgumentListMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final /* bridge */ kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy substitutionSupertypePolicy(kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.substitutionSupertypePolicy(this, rigidTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final /* bridge */ java.util.Collection<kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker> supertypes(kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.supertypes(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final /* bridge */ kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeConstructorMarker typeConstructor(kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker capturedTypeMarker) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.typeConstructor((kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext) this, capturedTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructor(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        return default$typeConstructor(kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final /* bridge */ kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructor(kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.typeConstructor(this, rigidTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    public final /* bridge */ kotlin.reflect.jvm.internal.impl.types.model.TypeSubstitutorMarker typeSubstitutorForUnderlyingType(java.util.Map<kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker, ? extends kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker> map) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.typeSubstitutorForUnderlyingType(this, map);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final /* bridge */ kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker upperBound(kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker flexibleTypeMarker) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.upperBound(this, flexibleTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker upperBoundIfFlexible(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        return default$upperBoundIfFlexible(kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final /* bridge */ kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker withNullability(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker, boolean z) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.withNullability(this, kotlinTypeMarker, z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final /* bridge */ kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker withNullability(kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker, boolean z) {
        return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.withNullability((kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext) this, rigidTypeMarker, z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean areEqualTypeConstructors(kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker, kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeConstructorMarker, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeConstructorMarker2, "");
        if (!(typeConstructorMarker instanceof kotlin.reflect.jvm.internal.impl.types.TypeConstructor)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(typeConstructorMarker2 instanceof kotlin.reflect.jvm.internal.impl.types.TypeConstructor)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        if (kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.DefaultImpls.areEqualTypeConstructors(this, typeConstructorMarker, typeConstructorMarker2)) {
            return true;
        }
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor = (kotlin.reflect.jvm.internal.impl.types.TypeConstructor) typeConstructorMarker;
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor2 = (kotlin.reflect.jvm.internal.impl.types.TypeConstructor) typeConstructorMarker2;
        if (this.getHighResolutionOutputSizeshNQ4ISI.equals(typeConstructor, typeConstructor2)) {
            return true;
        }
        java.util.Map<kotlin.reflect.jvm.internal.impl.types.TypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor> map = this.Camera2StreamConfigurationMap;
        if (map == null) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor3 = map.get(typeConstructor);
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor4 = this.Camera2StreamConfigurationMap.get(typeConstructor2);
        if (typeConstructor3 == null || !kotlin.jvm.internal.Intrinsics.areEqual(typeConstructor3, typeConstructor2)) {
            return typeConstructor4 != null && kotlin.jvm.internal.Intrinsics.areEqual(typeConstructor4, typeConstructor);
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeCheckerProviderContext
    public final kotlin.reflect.jvm.internal.impl.types.TypeCheckerState newTypeCheckerState(final boolean z, final boolean z2, final boolean z3) {
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeCheckerStateKt.createClassicTypeCheckerState(z, z2, this, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes);
        }
        final kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator kotlinTypePreparator = this.getHighSpeedVideoFpsRanges;
        final kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner = this.getHighSpeedVideoSizes;
        return new kotlin.reflect.jvm.internal.impl.types.TypeCheckerState(z, z2, z3, this, kotlinTypePreparator, kotlinTypeRefiner) { // from class: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilTypeSystemContext$newTypeCheckerState$1
            final /* synthetic */ kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilTypeSystemContext Camera2StreamConfigurationMap;

            {
                this.Camera2StreamConfigurationMap = this;
                kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilTypeSystemContext overridingUtilTypeSystemContext = this;
                kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator kotlinTypePreparator2 = kotlinTypePreparator;
                kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner2 = kotlinTypeRefiner;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState
            public final boolean customIsSubtypeOf(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker2) {
                kotlin.jvm.functions.Function2 function2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker2, "");
                if (!(kotlinTypeMarker instanceof kotlin.reflect.jvm.internal.impl.types.KotlinType)) {
                    throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
                }
                if (kotlinTypeMarker2 instanceof kotlin.reflect.jvm.internal.impl.types.KotlinType) {
                    function2 = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
                    return ((java.lang.Boolean) function2.invoke(kotlinTypeMarker, kotlinTypeMarker2)).booleanValue();
                }
                throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
            }
        };
    }

    public final kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker default$makeNullable(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker withNullability;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
        kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker asRigidType = asRigidType(kotlinTypeMarker);
        return (asRigidType == null || (withNullability = withNullability(asRigidType, true)) == null) ? kotlinTypeMarker : withNullability;
    }

    public final kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker default$asCapturedTypeUnwrappingDnn(kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rigidTypeMarker, "");
        return asCapturedType(originalIfDefinitelyNotNullable(rigidTypeMarker));
    }

    public final boolean default$isCapturedType(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
        kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker asRigidType = asRigidType(kotlinTypeMarker);
        return (asRigidType != null ? asCapturedTypeUnwrappingDnn(asRigidType) : null) != null;
    }

    public final kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker default$originalIfDefinitelyNotNullable(kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker) {
        kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker original;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rigidTypeMarker, "");
        kotlin.reflect.jvm.internal.impl.types.model.DefinitelyNotNullTypeMarker asDefinitelyNotNullType = asDefinitelyNotNullType(rigidTypeMarker);
        return (asDefinitelyNotNullType == null || (original = original(asDefinitelyNotNullType)) == null) ? (kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker) rigidTypeMarker : original;
    }

    public final kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker default$makeDefinitelyNotNullOrNotNull(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
        return makeDefinitelyNotNullOrNotNull(kotlinTypeMarker, false);
    }

    public final kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker default$getArgumentOrNull(kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rigidTypeMarker, "");
        if (i < 0) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker2 = rigidTypeMarker;
        if (i < argumentsCount(rigidTypeMarker2)) {
            return getArgument(rigidTypeMarker2, i);
        }
        return null;
    }

    public final kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker default$lowerBoundIfFlexible(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker lowerBound;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
        kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker asFlexibleType = asFlexibleType(kotlinTypeMarker);
        if (asFlexibleType != null && (lowerBound = lowerBound(asFlexibleType)) != null) {
            return lowerBound;
        }
        kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker asRigidType = asRigidType(kotlinTypeMarker);
        kotlin.jvm.internal.Intrinsics.checkNotNull(asRigidType);
        return asRigidType;
    }

    public final kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker default$upperBoundIfFlexible(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker upperBound;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
        kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker asFlexibleType = asFlexibleType(kotlinTypeMarker);
        if (asFlexibleType != null && (upperBound = upperBound(asFlexibleType)) != null) {
            return upperBound;
        }
        kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker asRigidType = asRigidType(kotlinTypeMarker);
        kotlin.jvm.internal.Intrinsics.checkNotNull(asRigidType);
        return asRigidType;
    }

    public final boolean default$isFlexibleWithDifferentTypeConstructors(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
        return !kotlin.jvm.internal.Intrinsics.areEqual(typeConstructor(lowerBoundIfFlexible(kotlinTypeMarker)), typeConstructor(upperBoundIfFlexible(kotlinTypeMarker)));
    }

    public final boolean default$isFlexible(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
        return asFlexibleType(kotlinTypeMarker) != null;
    }

    public final boolean default$isDynamic(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
        kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker asFlexibleType = asFlexibleType(kotlinTypeMarker);
        return (asFlexibleType != null ? asDynamicType(asFlexibleType) : null) != null;
    }

    public final boolean default$isDefinitelyNotNullType(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
        kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker asRigidType = asRigidType(kotlinTypeMarker);
        return (asRigidType != null ? asDefinitelyNotNullType(asRigidType) : null) != null;
    }

    public final boolean default$isDefinitelyNotNullType(kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rigidTypeMarker, "");
        return asDefinitelyNotNullType(rigidTypeMarker) != null;
    }

    public final boolean default$hasFlexibleNullability(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
        return isMarkedNullable(lowerBoundIfFlexible(kotlinTypeMarker)) != isMarkedNullable(upperBoundIfFlexible(kotlinTypeMarker));
    }

    public final kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker default$typeConstructor(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
        kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker asRigidType = asRigidType(kotlinTypeMarker);
        if (asRigidType == null) {
            asRigidType = lowerBoundIfFlexible(kotlinTypeMarker);
        }
        return typeConstructor(asRigidType);
    }

    public final boolean default$isNothing(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
        return isNothingConstructor(typeConstructor(kotlinTypeMarker)) && !isNullableType(kotlinTypeMarker);
    }

    public final boolean default$isClassType(kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rigidTypeMarker, "");
        return isClassTypeConstructor(typeConstructor(rigidTypeMarker));
    }

    public final boolean default$isIntegerLiteralType(kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rigidTypeMarker, "");
        return isIntegerLiteralTypeConstructor(typeConstructor(rigidTypeMarker));
    }

    public final kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker default$get(kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker typeArgumentListMarker, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeArgumentListMarker, "");
        if (typeArgumentListMarker instanceof kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker) {
            return getArgument((kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker) typeArgumentListMarker, i);
        }
        if (typeArgumentListMarker instanceof kotlin.reflect.jvm.internal.impl.types.model.ArgumentList) {
            kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker typeArgumentMarker = ((kotlin.reflect.jvm.internal.impl.types.model.ArgumentList) typeArgumentListMarker).get(i);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeArgumentMarker, "");
            return typeArgumentMarker;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown type argument list type: ");
        sb.append(typeArgumentListMarker);
        sb.append(", ");
        sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(typeArgumentListMarker.getClass()));
        throw new java.lang.IllegalStateException(sb.toString().toString());
    }

    public final int default$size(kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker typeArgumentListMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeArgumentListMarker, "");
        if (typeArgumentListMarker instanceof kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker) {
            return argumentsCount((kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker) typeArgumentListMarker);
        }
        if (typeArgumentListMarker instanceof kotlin.reflect.jvm.internal.impl.types.model.ArgumentList) {
            return ((kotlin.reflect.jvm.internal.impl.types.model.ArgumentList) typeArgumentListMarker).size();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown type argument list type: ");
        sb.append(typeArgumentListMarker);
        sb.append(", ");
        sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(typeArgumentListMarker.getClass()));
        throw new java.lang.IllegalStateException(sb.toString().toString());
    }

    public final java.util.List<kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker> default$fastCorrespondingSupertypes(kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rigidTypeMarker, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeConstructorMarker, "");
        return null;
    }
}
