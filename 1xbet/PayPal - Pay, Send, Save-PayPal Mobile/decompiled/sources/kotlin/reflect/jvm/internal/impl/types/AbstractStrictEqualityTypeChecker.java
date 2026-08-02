package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
public final class AbstractStrictEqualityTypeChecker {
    public static final kotlin.reflect.jvm.internal.impl.types.AbstractStrictEqualityTypeChecker INSTANCE = new kotlin.reflect.jvm.internal.impl.types.AbstractStrictEqualityTypeChecker();

    private AbstractStrictEqualityTypeChecker() {
    }

    public final boolean strictEqualTypes(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSystemContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker2, "");
        return getHighSpeedVideoFpsRanges(typeSystemContext, kotlinTypeMarker, kotlinTypeMarker2);
    }

    private final boolean getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker2) {
        if (kotlinTypeMarker == kotlinTypeMarker2) {
            return true;
        }
        kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker asRigidType = typeSystemContext.asRigidType(kotlinTypeMarker);
        kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker asRigidType2 = typeSystemContext.asRigidType(kotlinTypeMarker2);
        if (asRigidType != null && asRigidType2 != null) {
            return getHighSpeedVideoFpsRangesFor(typeSystemContext, asRigidType, asRigidType2);
        }
        kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker asFlexibleType = typeSystemContext.asFlexibleType(kotlinTypeMarker);
        kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker asFlexibleType2 = typeSystemContext.asFlexibleType(kotlinTypeMarker2);
        return asFlexibleType != null && asFlexibleType2 != null && getHighSpeedVideoFpsRangesFor(typeSystemContext, typeSystemContext.lowerBound(asFlexibleType), typeSystemContext.lowerBound(asFlexibleType2)) && getHighSpeedVideoFpsRangesFor(typeSystemContext, typeSystemContext.upperBound(asFlexibleType), typeSystemContext.upperBound(asFlexibleType2));
    }

    private final boolean getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker2) {
        kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker3 = rigidTypeMarker;
        kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker4 = rigidTypeMarker2;
        if (typeSystemContext.argumentsCount(rigidTypeMarker3) != typeSystemContext.argumentsCount(rigidTypeMarker4) || typeSystemContext.isMarkedNullable(rigidTypeMarker3) != typeSystemContext.isMarkedNullable(rigidTypeMarker4) || typeSystemContext.isDefinitelyNotNullType(rigidTypeMarker) != typeSystemContext.isDefinitelyNotNullType(rigidTypeMarker2) || !typeSystemContext.areEqualTypeConstructors(typeSystemContext.typeConstructor(rigidTypeMarker), typeSystemContext.typeConstructor(rigidTypeMarker2))) {
            return false;
        }
        if (typeSystemContext.identicalArguments(rigidTypeMarker, rigidTypeMarker2)) {
            return true;
        }
        int argumentsCount = typeSystemContext.argumentsCount(rigidTypeMarker3);
        for (int i = 0; i < argumentsCount; i++) {
            kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker argument = typeSystemContext.getArgument(rigidTypeMarker3, i);
            kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker argument2 = typeSystemContext.getArgument(rigidTypeMarker4, i);
            if (typeSystemContext.isStarProjection(argument) != typeSystemContext.isStarProjection(argument2)) {
                return false;
            }
            if (!typeSystemContext.isStarProjection(argument)) {
                if (typeSystemContext.getVariance(argument) != typeSystemContext.getVariance(argument2)) {
                    return false;
                }
                kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker type = typeSystemContext.getType(argument);
                kotlin.jvm.internal.Intrinsics.checkNotNull(type);
                kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker type2 = typeSystemContext.getType(argument2);
                kotlin.jvm.internal.Intrinsics.checkNotNull(type2);
                if (!getHighSpeedVideoFpsRanges(typeSystemContext, type, type2)) {
                    return false;
                }
            }
        }
        return true;
    }
}
