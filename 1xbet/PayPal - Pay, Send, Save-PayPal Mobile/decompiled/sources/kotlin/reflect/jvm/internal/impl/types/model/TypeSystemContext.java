package kotlin.reflect.jvm.internal.impl.types.model;

/* loaded from: classes5.dex */
public interface TypeSystemContext extends kotlin.reflect.jvm.internal.impl.types.model.TypeSystemOptimizationContext {
    boolean areEqualTypeConstructors(kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker, kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker2);

    int argumentsCount(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker);

    kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker asArgumentList(kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker);

    kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker asCapturedType(kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker simpleTypeMarker);

    kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker asCapturedTypeUnwrappingDnn(kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker);

    kotlin.reflect.jvm.internal.impl.types.model.DefinitelyNotNullTypeMarker asDefinitelyNotNullType(kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker);

    kotlin.reflect.jvm.internal.impl.types.model.DynamicTypeMarker asDynamicType(kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker flexibleTypeMarker);

    kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker asFlexibleType(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker);

    kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker asRigidType(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker);

    kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker asTypeArgument(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker);

    kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker captureFromArguments(kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus captureStatus);

    kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus captureStatus(kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker capturedTypeMarker);

    java.util.List<kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker> fastCorrespondingSupertypes(kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker);

    kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker get(kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker typeArgumentListMarker, int i);

    kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker getArgument(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker, int i);

    kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker getArgumentOrNull(kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker, int i);

    java.util.List<kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker> getArguments(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker);

    kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker getParameter(kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker, int i);

    java.util.List<kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker> getParameters(kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker);

    kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker getType(kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker typeArgumentMarker);

    kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker getTypeConstructor(kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker typeParameterMarker);

    kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker getTypeParameter(kotlin.reflect.jvm.internal.impl.types.model.TypeVariableTypeConstructorMarker typeVariableTypeConstructorMarker);

    kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker getTypeParameterClassifier(kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker);

    java.util.List<kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker> getUpperBounds(kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker typeParameterMarker);

    kotlin.reflect.jvm.internal.impl.types.model.TypeVariance getVariance(kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker typeArgumentMarker);

    kotlin.reflect.jvm.internal.impl.types.model.TypeVariance getVariance(kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker typeParameterMarker);

    boolean hasFlexibleNullability(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker);

    boolean hasRecursiveBounds(kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker typeParameterMarker, kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker);

    kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker intersectTypes(java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker> collection);

    boolean isAnyConstructor(kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker);

    boolean isCapturedType(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker);

    boolean isClassType(kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker);

    boolean isClassTypeConstructor(kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker);

    boolean isCommonFinalClassConstructor(kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker);

    boolean isDefinitelyNotNullType(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker);

    boolean isDefinitelyNotNullType(kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker);

    boolean isDenotable(kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker);

    boolean isDynamic(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker);

    boolean isError(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker);

    boolean isFlexible(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker);

    boolean isFlexibleWithDifferentTypeConstructors(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker);

    boolean isIntegerLiteralType(kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker);

    boolean isIntegerLiteralTypeConstructor(kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker);

    boolean isIntersection(kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker);

    boolean isMarkedNullable(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker);

    boolean isNotNullTypeParameter(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker);

    boolean isNothing(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker);

    boolean isNothingConstructor(kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker);

    boolean isNullableType(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker);

    boolean isOldCapturedType(kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker capturedTypeMarker);

    boolean isPrimitiveType(kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker simpleTypeMarker);

    boolean isProjectionNotNull(kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker capturedTypeMarker);

    boolean isRawType(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker);

    boolean isSingleClassifierType(kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker);

    boolean isStarProjection(kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker typeArgumentMarker);

    boolean isStubType(kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker);

    boolean isStubTypeForBuilderInference(kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker);

    boolean isTypeVariableType(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker);

    kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker lowerBound(kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker flexibleTypeMarker);

    kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker lowerBoundIfFlexible(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker);

    kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker lowerType(kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker capturedTypeMarker);

    kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker makeDefinitelyNotNullOrNotNull(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker);

    kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker makeDefinitelyNotNullOrNotNull(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker, boolean z);

    kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker original(kotlin.reflect.jvm.internal.impl.types.model.DefinitelyNotNullTypeMarker definitelyNotNullTypeMarker);

    kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker originalIfDefinitelyNotNullable(kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker);

    int parametersCount(kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker);

    java.util.Collection<kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker> possibleIntegerTypes(kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker);

    kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker projection(kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeConstructorMarker capturedTypeConstructorMarker);

    kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker safeSubstitute(kotlin.reflect.jvm.internal.impl.types.model.TypeSubstitutorMarker typeSubstitutorMarker, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker);

    int size(kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker typeArgumentListMarker);

    kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy substitutionSupertypePolicy(kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker);

    java.util.Collection<kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker> supertypes(kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker);

    kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeConstructorMarker typeConstructor(kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker capturedTypeMarker);

    kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructor(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker);

    kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructor(kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker);

    kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker upperBound(kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker flexibleTypeMarker);

    kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker upperBoundIfFlexible(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker);

    kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker withNullability(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker, boolean z);

    kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker withNullability(kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker, boolean z);
}
