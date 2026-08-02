package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
public final class AbstractNullabilityChecker {
    public static final kotlin.reflect.jvm.internal.impl.types.AbstractNullabilityChecker INSTANCE = new kotlin.reflect.jvm.internal.impl.types.AbstractNullabilityChecker();

    private AbstractNullabilityChecker() {
    }

    public final boolean hasNotNullSupertype(kotlin.reflect.jvm.internal.impl.types.TypeCheckerState typeCheckerState, kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker, kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy supertypesPolicy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeCheckerState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rigidTypeMarker, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supertypesPolicy, "");
        kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext = typeCheckerState.getTypeSystemContext();
        if ((typeSystemContext.isClassType(rigidTypeMarker) && !typeSystemContext.isMarkedNullable(rigidTypeMarker)) || typeSystemContext.isDefinitelyNotNullType(rigidTypeMarker)) {
            return true;
        }
        typeCheckerState.initialize();
        java.util.ArrayDeque<kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker> supertypesDeque = typeCheckerState.getSupertypesDeque();
        kotlin.jvm.internal.Intrinsics.checkNotNull(supertypesDeque);
        java.util.Set<kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker> supertypesSet = typeCheckerState.getSupertypesSet();
        kotlin.jvm.internal.Intrinsics.checkNotNull(supertypesSet);
        supertypesDeque.push(rigidTypeMarker);
        while (!supertypesDeque.isEmpty()) {
            kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker pop = supertypesDeque.pop();
            kotlin.jvm.internal.Intrinsics.checkNotNull(pop);
            if (supertypesSet.add(pop)) {
                kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy.None none = typeSystemContext.isMarkedNullable(pop) ? kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy.None.INSTANCE : supertypesPolicy;
                if (kotlin.jvm.internal.Intrinsics.areEqual(none, kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy.None.INSTANCE)) {
                    none = null;
                }
                if (none != null) {
                    kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext2 = typeCheckerState.getTypeSystemContext();
                    java.util.Iterator<kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker> it = typeSystemContext2.supertypes(typeSystemContext2.typeConstructor(pop)).iterator();
                    while (it.hasNext()) {
                        kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker mo23901transformType = none.mo23901transformType(typeCheckerState, it.next());
                        if ((typeSystemContext.isClassType(mo23901transformType) && !typeSystemContext.isMarkedNullable(mo23901transformType)) || typeSystemContext.isDefinitelyNotNullType(mo23901transformType)) {
                            typeCheckerState.clear();
                            return true;
                        }
                        supertypesDeque.add(mo23901transformType);
                    }
                } else {
                    continue;
                }
            }
        }
        typeCheckerState.clear();
        return false;
    }

    public final boolean hasPathByNotMarkedNullableNodes(kotlin.reflect.jvm.internal.impl.types.TypeCheckerState typeCheckerState, kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeCheckerState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rigidTypeMarker, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeConstructorMarker, "");
        kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext = typeCheckerState.getTypeSystemContext();
        if (getHighResolutionOutputSizeshNQ4ISI(typeCheckerState, rigidTypeMarker, typeConstructorMarker)) {
            return true;
        }
        typeCheckerState.initialize();
        java.util.ArrayDeque<kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker> supertypesDeque = typeCheckerState.getSupertypesDeque();
        kotlin.jvm.internal.Intrinsics.checkNotNull(supertypesDeque);
        java.util.Set<kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker> supertypesSet = typeCheckerState.getSupertypesSet();
        kotlin.jvm.internal.Intrinsics.checkNotNull(supertypesSet);
        supertypesDeque.push(rigidTypeMarker);
        while (!supertypesDeque.isEmpty()) {
            kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker pop = supertypesDeque.pop();
            kotlin.jvm.internal.Intrinsics.checkNotNull(pop);
            if (supertypesSet.add(pop)) {
                kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy supertypesPolicy = typeSystemContext.isMarkedNullable(pop) ? kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy.None.INSTANCE : kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy.LowerIfFlexible.INSTANCE;
                if (kotlin.jvm.internal.Intrinsics.areEqual(supertypesPolicy, kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy.None.INSTANCE)) {
                    supertypesPolicy = null;
                }
                if (supertypesPolicy != null) {
                    kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext2 = typeCheckerState.getTypeSystemContext();
                    java.util.Iterator<kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker> it = typeSystemContext2.supertypes(typeSystemContext2.typeConstructor(pop)).iterator();
                    while (it.hasNext()) {
                        kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker mo23901transformType = supertypesPolicy.mo23901transformType(typeCheckerState, it.next());
                        if (getHighResolutionOutputSizeshNQ4ISI(typeCheckerState, mo23901transformType, typeConstructorMarker)) {
                            typeCheckerState.clear();
                            return true;
                        }
                        supertypesDeque.add(mo23901transformType);
                    }
                } else {
                    continue;
                }
            }
        }
        typeCheckerState.clear();
        return false;
    }

    private static boolean getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.types.TypeCheckerState typeCheckerState, kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker) {
        kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext = typeCheckerState.getTypeSystemContext();
        kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker2 = rigidTypeMarker;
        if (typeSystemContext.isNothing(rigidTypeMarker2)) {
            return true;
        }
        if (typeSystemContext.isMarkedNullable(rigidTypeMarker2)) {
            return false;
        }
        if (typeCheckerState.isStubTypeEqualsToAnything() && typeSystemContext.isStubType(rigidTypeMarker)) {
            return true;
        }
        return typeSystemContext.areEqualTypeConstructors(typeSystemContext.typeConstructor(rigidTypeMarker), typeConstructorMarker);
    }

    public final boolean isPossibleSubtype(kotlin.reflect.jvm.internal.impl.types.TypeCheckerState typeCheckerState, kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeCheckerState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rigidTypeMarker, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rigidTypeMarker2, "");
        kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext = typeCheckerState.getTypeSystemContext();
        if (kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker.RUN_SLOW_ASSERTIONS) {
            if (!typeSystemContext.isSingleClassifierType(rigidTypeMarker) && !typeSystemContext.isIntersection(typeSystemContext.typeConstructor(rigidTypeMarker))) {
                typeCheckerState.isAllowedTypeVariable(rigidTypeMarker);
            }
            if (!typeSystemContext.isSingleClassifierType(rigidTypeMarker2)) {
                typeCheckerState.isAllowedTypeVariable(rigidTypeMarker2);
            }
        }
        if (typeSystemContext.isMarkedNullable(rigidTypeMarker2) || typeSystemContext.isNotNullTypeParameter(rigidTypeMarker) || typeSystemContext.isDefinitelyNotNullType(rigidTypeMarker)) {
            return true;
        }
        if ((rigidTypeMarker instanceof kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker) && typeSystemContext.isProjectionNotNull((kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker) rigidTypeMarker)) {
            return true;
        }
        kotlin.reflect.jvm.internal.impl.types.AbstractNullabilityChecker abstractNullabilityChecker = INSTANCE;
        if (abstractNullabilityChecker.hasNotNullSupertype(typeCheckerState, rigidTypeMarker, kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy.LowerIfFlexible.INSTANCE)) {
            return true;
        }
        if (typeSystemContext.isDefinitelyNotNullType(rigidTypeMarker2) || abstractNullabilityChecker.hasNotNullSupertype(typeCheckerState, rigidTypeMarker2, kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy.UpperIfFlexible.INSTANCE) || typeSystemContext.isClassType(rigidTypeMarker)) {
            return false;
        }
        return abstractNullabilityChecker.hasPathByNotMarkedNullableNodes(typeCheckerState, rigidTypeMarker, typeSystemContext.typeConstructor(rigidTypeMarker2));
    }
}
