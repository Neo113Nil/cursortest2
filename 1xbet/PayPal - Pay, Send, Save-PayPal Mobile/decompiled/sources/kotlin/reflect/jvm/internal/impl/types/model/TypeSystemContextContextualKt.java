package kotlin.reflect.jvm.internal.impl.types.model;

/* loaded from: classes5.dex */
public final class TypeSystemContextContextualKt {
    public static final kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker asRigidType(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSystemContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
        return typeSystemContext.asRigidType(kotlinTypeMarker);
    }

    public static final kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker asFlexibleType(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSystemContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
        return typeSystemContext.asFlexibleType(kotlinTypeMarker);
    }

    public static final boolean isError(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSystemContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
        return typeSystemContext.isError(kotlinTypeMarker);
    }

    public static final kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker lowerBound(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker flexibleTypeMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSystemContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flexibleTypeMarker, "");
        return typeSystemContext.lowerBound(flexibleTypeMarker);
    }

    public static final kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker asCapturedTypeUnwrappingDnn(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSystemContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rigidTypeMarker, "");
        return typeSystemContext.asCapturedTypeUnwrappingDnn(rigidTypeMarker);
    }

    public static final boolean isCapturedType(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSystemContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
        return typeSystemContext.isCapturedType(kotlinTypeMarker);
    }

    public static final kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker originalIfDefinitelyNotNullable(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSystemContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rigidTypeMarker, "");
        return typeSystemContext.originalIfDefinitelyNotNullable(rigidTypeMarker);
    }

    public static final kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker makeDefinitelyNotNullOrNotNull(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSystemContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
        return typeSystemContext.makeDefinitelyNotNullOrNotNull(kotlinTypeMarker);
    }

    public static final boolean isMarkedNullable(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSystemContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
        return typeSystemContext.isMarkedNullable(kotlinTypeMarker);
    }

    public static final kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker withNullability(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSystemContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rigidTypeMarker, "");
        return typeSystemContext.withNullability(rigidTypeMarker, z);
    }

    public static final kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructor(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSystemContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rigidTypeMarker, "");
        return typeSystemContext.typeConstructor(rigidTypeMarker);
    }

    public static final kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker withNullability(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSystemContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
        return typeSystemContext.withNullability(kotlinTypeMarker, z);
    }

    public static final boolean isOldCapturedType(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker capturedTypeMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSystemContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(capturedTypeMarker, "");
        return typeSystemContext.isOldCapturedType(capturedTypeMarker);
    }

    public static final kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeConstructorMarker typeConstructor(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker capturedTypeMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSystemContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(capturedTypeMarker, "");
        return typeSystemContext.typeConstructor(capturedTypeMarker);
    }

    public static final kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus captureStatus(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker capturedTypeMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSystemContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(capturedTypeMarker, "");
        return typeSystemContext.captureStatus(capturedTypeMarker);
    }

    public static final kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker projection(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeConstructorMarker capturedTypeConstructorMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSystemContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(capturedTypeConstructorMarker, "");
        return typeSystemContext.projection(capturedTypeConstructorMarker);
    }

    public static final int argumentsCount(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSystemContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
        return typeSystemContext.argumentsCount(kotlinTypeMarker);
    }

    public static final kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker getArgument(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSystemContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
        return typeSystemContext.getArgument(kotlinTypeMarker, i);
    }

    public static final kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker getArgumentOrNull(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSystemContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rigidTypeMarker, "");
        return typeSystemContext.getArgumentOrNull(rigidTypeMarker, i);
    }

    public static final boolean isStubType(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSystemContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rigidTypeMarker, "");
        return typeSystemContext.isStubType(rigidTypeMarker);
    }

    public static final boolean isStubTypeForBuilderInference(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSystemContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rigidTypeMarker, "");
        return typeSystemContext.isStubTypeForBuilderInference(rigidTypeMarker);
    }

    public static final kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker asTypeArgument(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSystemContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
        return typeSystemContext.asTypeArgument(kotlinTypeMarker);
    }

    public static final kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker lowerType(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker capturedTypeMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSystemContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(capturedTypeMarker, "");
        return typeSystemContext.lowerType(capturedTypeMarker);
    }

    public static final boolean isStarProjection(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker typeArgumentMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSystemContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeArgumentMarker, "");
        return typeSystemContext.isStarProjection(typeArgumentMarker);
    }

    public static final kotlin.reflect.jvm.internal.impl.types.model.TypeVariance getVariance(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker typeArgumentMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSystemContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeArgumentMarker, "");
        return typeSystemContext.getVariance(typeArgumentMarker);
    }

    public static final kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker getType(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker typeArgumentMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSystemContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeArgumentMarker, "");
        return typeSystemContext.getType(typeArgumentMarker);
    }

    public static final int parametersCount(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSystemContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeConstructorMarker, "");
        return typeSystemContext.parametersCount(typeConstructorMarker);
    }

    public static final kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker getParameter(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSystemContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeConstructorMarker, "");
        return typeSystemContext.getParameter(typeConstructorMarker, i);
    }

    public static final java.util.Collection<kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker> supertypes(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSystemContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeConstructorMarker, "");
        return typeSystemContext.supertypes(typeConstructorMarker);
    }

    public static final boolean isIntersection(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSystemContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeConstructorMarker, "");
        return typeSystemContext.isIntersection(typeConstructorMarker);
    }

    public static final boolean isClassTypeConstructor(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSystemContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeConstructorMarker, "");
        return typeSystemContext.isClassTypeConstructor(typeConstructorMarker);
    }

    public static final boolean isIntegerLiteralTypeConstructor(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSystemContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeConstructorMarker, "");
        return typeSystemContext.isIntegerLiteralTypeConstructor(typeConstructorMarker);
    }

    public static final kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker getTypeParameter(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeVariableTypeConstructorMarker typeVariableTypeConstructorMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSystemContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeVariableTypeConstructorMarker, "");
        return typeSystemContext.getTypeParameter(typeVariableTypeConstructorMarker);
    }

    public static final kotlin.reflect.jvm.internal.impl.types.model.TypeVariance getVariance(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker typeParameterMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSystemContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeParameterMarker, "");
        return typeSystemContext.getVariance(typeParameterMarker);
    }

    public static final boolean hasRecursiveBounds(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker typeParameterMarker, kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSystemContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeParameterMarker, "");
        return typeSystemContext.hasRecursiveBounds(typeParameterMarker, typeConstructorMarker);
    }

    public static final boolean isDenotable(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSystemContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeConstructorMarker, "");
        return typeSystemContext.isDenotable(typeConstructorMarker);
    }

    public static final kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker lowerBoundIfFlexible(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSystemContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
        return typeSystemContext.lowerBoundIfFlexible(kotlinTypeMarker);
    }

    public static final kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker upperBoundIfFlexible(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSystemContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
        return typeSystemContext.upperBoundIfFlexible(kotlinTypeMarker);
    }

    public static final boolean isFlexibleWithDifferentTypeConstructors(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSystemContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
        return typeSystemContext.isFlexibleWithDifferentTypeConstructors(kotlinTypeMarker);
    }

    public static final boolean isFlexible(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSystemContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
        return typeSystemContext.isFlexible(kotlinTypeMarker);
    }

    public static final boolean isDynamic(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSystemContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
        return typeSystemContext.isDynamic(kotlinTypeMarker);
    }

    public static final boolean isDefinitelyNotNullType(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSystemContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
        return typeSystemContext.isDefinitelyNotNullType(kotlinTypeMarker);
    }

    public static final boolean isDefinitelyNotNullType(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSystemContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rigidTypeMarker, "");
        return typeSystemContext.isDefinitelyNotNullType(rigidTypeMarker);
    }

    public static final boolean isNotNullTypeParameter(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSystemContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
        return typeSystemContext.isNotNullTypeParameter(kotlinTypeMarker);
    }

    public static final kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructor(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSystemContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
        return typeSystemContext.typeConstructor(kotlinTypeMarker);
    }

    public static final boolean isClassType(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSystemContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rigidTypeMarker, "");
        return typeSystemContext.isClassType(rigidTypeMarker);
    }

    public static final java.util.List<kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker> fastCorrespondingSupertypes(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSystemContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rigidTypeMarker, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeConstructorMarker, "");
        return typeSystemContext.fastCorrespondingSupertypes(rigidTypeMarker, typeConstructorMarker);
    }

    public static final boolean isIntegerLiteralType(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSystemContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rigidTypeMarker, "");
        return typeSystemContext.isIntegerLiteralType(rigidTypeMarker);
    }

    public static final java.util.Collection<kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker> possibleIntegerTypes(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSystemContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rigidTypeMarker, "");
        return typeSystemContext.possibleIntegerTypes(rigidTypeMarker);
    }

    public static final boolean isCommonFinalClassConstructor(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSystemContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeConstructorMarker, "");
        return typeSystemContext.isCommonFinalClassConstructor(typeConstructorMarker);
    }

    public static final kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker asArgumentList(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSystemContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rigidTypeMarker, "");
        return typeSystemContext.asArgumentList(rigidTypeMarker);
    }

    public static final kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker get(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker typeArgumentListMarker, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSystemContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeArgumentListMarker, "");
        return typeSystemContext.get(typeArgumentListMarker, i);
    }

    public static final int size(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker typeArgumentListMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSystemContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeArgumentListMarker, "");
        return typeSystemContext.size(typeArgumentListMarker);
    }

    public static final boolean isAnyConstructor(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSystemContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeConstructorMarker, "");
        return typeSystemContext.isAnyConstructor(typeConstructorMarker);
    }

    public static final boolean isNothingConstructor(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSystemContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeConstructorMarker, "");
        return typeSystemContext.isNothingConstructor(typeConstructorMarker);
    }

    public static final boolean isSingleClassifierType(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSystemContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rigidTypeMarker, "");
        return typeSystemContext.isSingleClassifierType(rigidTypeMarker);
    }
}
