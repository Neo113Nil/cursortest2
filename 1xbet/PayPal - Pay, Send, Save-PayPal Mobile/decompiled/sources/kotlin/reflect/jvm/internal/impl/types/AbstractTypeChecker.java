package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
public final class AbstractTypeChecker {
    public static final kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker INSTANCE = new kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker();
    public static boolean RUN_SLOW_ASSERTIONS;

    private AbstractTypeChecker() {
    }

    public static /* synthetic */ boolean isSubtypeOf$default(kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker abstractTypeChecker, kotlin.reflect.jvm.internal.impl.types.TypeCheckerState typeCheckerState, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker2, boolean z, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return abstractTypeChecker.isSubtypeOf(typeCheckerState, kotlinTypeMarker, kotlinTypeMarker2, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:211:0x02dd, code lost:
    
        r2 = java.lang.Boolean.TRUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x02db, code lost:
    
        if (getHighSpeedVideoSizes(r11, r22, r1, r0, true) != false) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0126, code lost:
    
        if (isSubtypeOf$default(r12, r22, r5, r3, false, 8, null) != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x01d4, code lost:
    
        if (kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.hasRecursiveBounds(r11, r0, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.typeConstructor(r11, r10)) != false) goto L117;
     */
    /* JADX WARN: Removed duplicated region for block: B:135:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isSubtypeOf(final kotlin.reflect.jvm.internal.impl.types.TypeCheckerState typeCheckerState, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker2, boolean z) {
        kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker prepareType;
        kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker prepareType2;
        java.lang.Boolean bool;
        final java.util.ArrayList arrayList;
        int size;
        kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy.LowerIfFlexible lowerIfFlexible;
        kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker;
        kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker type;
        kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker;
        kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker2;
        kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker3;
        boolean z2;
        kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker4 = kotlinTypeMarker;
        kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker simpleTypeMarker = kotlinTypeMarker2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeCheckerState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rigidTypeMarker4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(simpleTypeMarker, "");
        if (rigidTypeMarker4 == simpleTypeMarker) {
            return true;
        }
        if (!typeCheckerState.customIsSubtypeOf(kotlinTypeMarker, kotlinTypeMarker2)) {
            return false;
        }
        final kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext = typeCheckerState.getTypeSystemContext();
        kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker abstractTypeChecker = INSTANCE;
        while (true) {
            prepareType = typeCheckerState.prepareType(typeCheckerState.refineType(rigidTypeMarker4));
            prepareType2 = typeCheckerState.prepareType(typeCheckerState.refineType(simpleTypeMarker));
            if (!typeCheckerState.isDnnTypesEqualToFlexible() || !kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.isFlexible(typeSystemContext, prepareType) || !kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.isDefinitelyNotNullType(typeSystemContext, prepareType2)) {
                break;
            }
            kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker asFlexibleType = kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.asFlexibleType(typeSystemContext, prepareType);
            kotlin.jvm.internal.Intrinsics.checkNotNull(asFlexibleType);
            rigidTypeMarker4 = kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.lowerBound(typeSystemContext, asFlexibleType);
            kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker asRigidType = kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.asRigidType(typeSystemContext, prepareType2);
            kotlin.jvm.internal.Intrinsics.checkNotNull(asRigidType);
            simpleTypeMarker = kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.originalIfDefinitelyNotNullable(typeSystemContext, asRigidType);
        }
        kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker lowerBoundIfFlexible = kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.lowerBoundIfFlexible(typeSystemContext, prepareType);
        kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker upperBoundIfFlexible = kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.upperBoundIfFlexible(typeSystemContext, prepareType2);
        kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker5 = lowerBoundIfFlexible;
        boolean isError = kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.isError(typeSystemContext, rigidTypeMarker5);
        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
        if (!isError) {
            kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker6 = upperBoundIfFlexible;
            if (!kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.isError(typeSystemContext, rigidTypeMarker6)) {
                if (!kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.isStubTypeForBuilderInference(typeSystemContext, lowerBoundIfFlexible) || !kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.isStubTypeForBuilderInference(typeSystemContext, upperBoundIfFlexible)) {
                    if (kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.isStubType(typeSystemContext, lowerBoundIfFlexible) || kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.isStubType(typeSystemContext, upperBoundIfFlexible)) {
                        bool2 = java.lang.Boolean.valueOf(typeCheckerState.isStubTypeEqualsToAnything());
                    } else {
                        kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker asCapturedTypeUnwrappingDnn = kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.asCapturedTypeUnwrappingDnn(typeSystemContext, upperBoundIfFlexible);
                        kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker lowerType = asCapturedTypeUnwrappingDnn != null ? kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.lowerType(typeSystemContext, asCapturedTypeUnwrappingDnn) : null;
                        if (asCapturedTypeUnwrappingDnn != null && lowerType != null) {
                            if (kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.isMarkedNullable(typeSystemContext, rigidTypeMarker6)) {
                                lowerType = kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.withNullability(typeSystemContext, lowerType, true);
                            } else if (kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.isDefinitelyNotNullType(typeSystemContext, upperBoundIfFlexible)) {
                                lowerType = kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.makeDefinitelyNotNullOrNotNull(typeSystemContext, lowerType);
                            }
                            kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker3 = lowerType;
                            int i = kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker.WhenMappings.$EnumSwitchMapping$1[typeCheckerState.getLowerCapturedTypePolicy(lowerBoundIfFlexible, asCapturedTypeUnwrappingDnn).ordinal()];
                            if (i == 1) {
                                bool2 = java.lang.Boolean.valueOf(isSubtypeOf$default(abstractTypeChecker, typeCheckerState, rigidTypeMarker5, kotlinTypeMarker3, false, 8, null));
                            } else if (i == 2) {
                                rigidTypeMarker = rigidTypeMarker6;
                                rigidTypeMarker2 = rigidTypeMarker5;
                                rigidTypeMarker3 = upperBoundIfFlexible;
                            } else if (i != 3) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                        }
                        rigidTypeMarker = rigidTypeMarker6;
                        rigidTypeMarker2 = rigidTypeMarker5;
                        rigidTypeMarker3 = upperBoundIfFlexible;
                        kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructor = kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.typeConstructor(typeSystemContext, rigidTypeMarker3);
                        if (kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.isIntersection(typeSystemContext, typeConstructor)) {
                            kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.isMarkedNullable(typeSystemContext, rigidTypeMarker);
                            java.util.Collection<kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker> supertypes = kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.supertypes(typeSystemContext, typeConstructor);
                            if (!(supertypes instanceof java.util.Collection) || !supertypes.isEmpty()) {
                                java.util.Iterator<T> it = supertypes.iterator();
                                while (it.hasNext()) {
                                    if (!isSubtypeOf$default(INSTANCE, typeCheckerState, rigidTypeMarker2, (kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker) it.next(), false, 8, null)) {
                                        z2 = false;
                                        break;
                                    }
                                }
                            }
                            z2 = true;
                            bool2 = java.lang.Boolean.valueOf(z2);
                        } else {
                            kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructor2 = kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.typeConstructor(typeSystemContext, lowerBoundIfFlexible);
                            if (!(lowerBoundIfFlexible instanceof kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker)) {
                                if (kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.isIntersection(typeSystemContext, typeConstructor2)) {
                                    java.util.Collection<kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker> supertypes2 = kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.supertypes(typeSystemContext, typeConstructor2);
                                    if (!(supertypes2 instanceof java.util.Collection) || !supertypes2.isEmpty()) {
                                        java.util.Iterator<T> it2 = supertypes2.iterator();
                                        while (it2.hasNext()) {
                                            if (!(((kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker) it2.next()) instanceof kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker)) {
                                                break;
                                            }
                                        }
                                    }
                                }
                                bool2 = null;
                            }
                            kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker highSpeedVideoFpsRangesFor = abstractTypeChecker.getHighSpeedVideoFpsRangesFor(typeSystemContext, rigidTypeMarker, rigidTypeMarker2);
                            if (highSpeedVideoFpsRangesFor != null) {
                            }
                            bool2 = null;
                        }
                    }
                } else {
                    bool2 = java.lang.Boolean.valueOf((kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.typeConstructor(typeSystemContext, lowerBoundIfFlexible) == kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.typeConstructor(typeSystemContext, upperBoundIfFlexible) && ((kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.isDefinitelyNotNullType(typeSystemContext, lowerBoundIfFlexible) || !kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.isDefinitelyNotNullType(typeSystemContext, upperBoundIfFlexible)) && (!kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.isMarkedNullable(typeSystemContext, rigidTypeMarker5) || kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.isMarkedNullable(typeSystemContext, rigidTypeMarker6)))) || typeCheckerState.isStubTypeEqualsToAnything());
                }
                if (bool2 == null) {
                    boolean booleanValue = bool2.booleanValue();
                    typeCheckerState.addSubtypeConstraint(prepareType, prepareType2, z);
                    return booleanValue;
                }
                java.lang.Boolean addSubtypeConstraint = typeCheckerState.addSubtypeConstraint(prepareType, prepareType2, z);
                if (addSubtypeConstraint != null) {
                    return addSubtypeConstraint.booleanValue();
                }
                kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker lowerBoundIfFlexible2 = kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.lowerBoundIfFlexible(typeSystemContext, prepareType);
                final kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker upperBoundIfFlexible2 = kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.upperBoundIfFlexible(typeSystemContext, prepareType2);
                if (RUN_SLOW_ASSERTIONS) {
                    if (!kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.isSingleClassifierType(typeSystemContext, lowerBoundIfFlexible2) && !kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.isIntersection(typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.typeConstructor(typeSystemContext, lowerBoundIfFlexible2))) {
                        typeCheckerState.isAllowedTypeVariable(lowerBoundIfFlexible2);
                    }
                    if (!kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.isSingleClassifierType(typeSystemContext, upperBoundIfFlexible2)) {
                        typeCheckerState.isAllowedTypeVariable(upperBoundIfFlexible2);
                    }
                }
                if (!kotlin.reflect.jvm.internal.impl.types.AbstractNullabilityChecker.INSTANCE.isPossibleSubtype(typeCheckerState, lowerBoundIfFlexible2, upperBoundIfFlexible2)) {
                    return false;
                }
                if (kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.isIntegerLiteralType(typeSystemContext, lowerBoundIfFlexible2) || kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.isIntegerLiteralType(typeSystemContext, upperBoundIfFlexible2)) {
                    if ((kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.isIntegerLiteralType(typeSystemContext, lowerBoundIfFlexible2) || getHighSpeedVideoFpsRangesFor(typeSystemContext, lowerBoundIfFlexible2)) && (kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.isIntegerLiteralType(typeSystemContext, upperBoundIfFlexible2) || getHighSpeedVideoFpsRangesFor(typeSystemContext, upperBoundIfFlexible2))) {
                        bool = java.lang.Boolean.TRUE;
                    } else if (kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.isIntegerLiteralType(typeSystemContext, lowerBoundIfFlexible2)) {
                        if (getHighSpeedVideoSizes(typeSystemContext, typeCheckerState, lowerBoundIfFlexible2, upperBoundIfFlexible2, false)) {
                            bool = java.lang.Boolean.TRUE;
                        }
                    } else if (kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.isIntegerLiteralType(typeSystemContext, upperBoundIfFlexible2)) {
                        kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructor3 = kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.typeConstructor(typeSystemContext, lowerBoundIfFlexible2);
                        if (typeConstructor3 instanceof kotlin.reflect.jvm.internal.impl.types.model.IntersectionTypeConstructorMarker) {
                            java.util.Collection<kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker> supertypes3 = kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.supertypes(typeSystemContext, typeConstructor3);
                            if (!(supertypes3 instanceof java.util.Collection) || !supertypes3.isEmpty()) {
                                java.util.Iterator<T> it3 = supertypes3.iterator();
                                while (it3.hasNext()) {
                                    kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker asRigidType2 = kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.asRigidType(typeSystemContext, (kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker) it3.next());
                                    if (asRigidType2 != null && kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.isIntegerLiteralType(typeSystemContext, asRigidType2)) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    if (bool == null) {
                        boolean booleanValue2 = bool.booleanValue();
                        kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.addSubtypeConstraint$default(typeCheckerState, lowerBoundIfFlexible2, upperBoundIfFlexible2, false, 4, null);
                        return booleanValue2;
                    }
                    kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructor4 = kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.typeConstructor(typeSystemContext, upperBoundIfFlexible2);
                    if ((typeSystemContext.areEqualTypeConstructors(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.typeConstructor(typeSystemContext, lowerBoundIfFlexible2), typeConstructor4) && kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.parametersCount(typeSystemContext, typeConstructor4) == 0) || kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.isAnyConstructor(typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.typeConstructor(typeSystemContext, upperBoundIfFlexible2))) {
                        return true;
                    }
                    java.util.List<kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker> findCorrespondingSupertypes = abstractTypeChecker.findCorrespondingSupertypes(typeCheckerState, lowerBoundIfFlexible2, typeConstructor4);
                    int i2 = 10;
                    if (findCorrespondingSupertypes.size() > 1) {
                        kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext2 = typeCheckerState.getTypeSystemContext();
                        kotlin.reflect.jvm.internal.impl.types.model.TypeSystemInferenceExtensionContext typeSystemInferenceExtensionContext = typeSystemContext2 instanceof kotlin.reflect.jvm.internal.impl.types.model.TypeSystemInferenceExtensionContext ? (kotlin.reflect.jvm.internal.impl.types.model.TypeSystemInferenceExtensionContext) typeSystemContext2 : null;
                        if (typeSystemInferenceExtensionContext != null && typeSystemInferenceExtensionContext.isK2()) {
                            arrayList = new java.util.LinkedHashSet();
                            for (kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker7 : findCorrespondingSupertypes) {
                                kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker asRigidType3 = kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.asRigidType(typeSystemContext, typeCheckerState.prepareType(rigidTypeMarker7));
                                if (asRigidType3 != null) {
                                    rigidTypeMarker7 = asRigidType3;
                                }
                                arrayList.add(rigidTypeMarker7);
                            }
                            size = arrayList.size();
                            if (size != 0) {
                                kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructor5 = kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.typeConstructor(typeSystemContext, lowerBoundIfFlexible2);
                                if (kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.isClassTypeConstructor(typeSystemContext, typeConstructor5)) {
                                    return kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.isNothingConstructor(typeSystemContext, typeConstructor5);
                                }
                                if (kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.isNothingConstructor(typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.typeConstructor(typeSystemContext, lowerBoundIfFlexible2))) {
                                    return true;
                                }
                                typeCheckerState.initialize();
                                java.util.ArrayDeque<kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker> supertypesDeque = typeCheckerState.getSupertypesDeque();
                                kotlin.jvm.internal.Intrinsics.checkNotNull(supertypesDeque);
                                java.util.Set<kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker> supertypesSet = typeCheckerState.getSupertypesSet();
                                kotlin.jvm.internal.Intrinsics.checkNotNull(supertypesSet);
                                supertypesDeque.push(lowerBoundIfFlexible2);
                                while (!supertypesDeque.isEmpty()) {
                                    kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker pop = supertypesDeque.pop();
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(pop);
                                    if (supertypesSet.add(pop)) {
                                        if (kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.isClassType(typeSystemContext, pop)) {
                                            lowerIfFlexible = kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy.None.INSTANCE;
                                        } else {
                                            lowerIfFlexible = kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy.LowerIfFlexible.INSTANCE;
                                        }
                                        if (kotlin.jvm.internal.Intrinsics.areEqual(lowerIfFlexible, kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy.None.INSTANCE)) {
                                            lowerIfFlexible = null;
                                        }
                                        if (lowerIfFlexible != null) {
                                            kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext3 = typeCheckerState.getTypeSystemContext();
                                            java.util.Iterator<kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker> it4 = typeSystemContext3.supertypes(typeSystemContext3.typeConstructor(pop)).iterator();
                                            while (it4.hasNext()) {
                                                kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker mo23901transformType = lowerIfFlexible.mo23901transformType(typeCheckerState, it4.next());
                                                if (kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.isNothingConstructor(typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.typeConstructor(typeSystemContext, mo23901transformType))) {
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
                            if (size == 1) {
                                return abstractTypeChecker.isSubtypeForSameConstructor(typeCheckerState, typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.asArgumentList(typeSystemContext, (kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker) kotlin.collections.CollectionsKt.first(arrayList)), upperBoundIfFlexible2);
                            }
                            kotlin.reflect.jvm.internal.impl.types.model.ArgumentList argumentList = new kotlin.reflect.jvm.internal.impl.types.model.ArgumentList(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.parametersCount(typeSystemContext, typeConstructor4));
                            int parametersCount = kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.parametersCount(typeSystemContext, typeConstructor4);
                            int i3 = 0;
                            boolean z3 = false;
                            while (i3 < parametersCount) {
                                z3 = z3 || kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.getVariance(typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.getParameter(typeSystemContext, typeConstructor4, i3)) != kotlin.reflect.jvm.internal.impl.types.model.TypeVariance.OUT;
                                if (z3) {
                                    typeConstructorMarker = typeConstructor4;
                                } else {
                                    java.util.Collection<kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker> collection = arrayList;
                                    java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(collection, i2));
                                    for (kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker8 : collection) {
                                        kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker argumentOrNull = kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.getArgumentOrNull(typeSystemContext, rigidTypeMarker8, i3);
                                        if (argumentOrNull != null) {
                                            kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker2 = typeConstructor4;
                                            if (kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.getVariance(typeSystemContext, argumentOrNull) != kotlin.reflect.jvm.internal.impl.types.model.TypeVariance.INV) {
                                                argumentOrNull = null;
                                            }
                                            if (argumentOrNull != null && (type = kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.getType(typeSystemContext, argumentOrNull)) != null) {
                                                arrayList2.add(type);
                                                typeConstructor4 = typeConstructorMarker2;
                                            }
                                        }
                                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Incorrect type: ");
                                        sb.append(rigidTypeMarker8);
                                        sb.append(", subType: ");
                                        sb.append(lowerBoundIfFlexible2);
                                        sb.append(", superType: ");
                                        sb.append(upperBoundIfFlexible2);
                                        throw new java.lang.IllegalStateException(sb.toString().toString());
                                    }
                                    typeConstructorMarker = typeConstructor4;
                                    argumentList.add(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.asTypeArgument(typeSystemContext, typeSystemContext.intersectTypes(arrayList2)));
                                }
                                i3++;
                                typeConstructor4 = typeConstructorMarker;
                                i2 = 10;
                            }
                            if (z3 || !abstractTypeChecker.isSubtypeForSameConstructor(typeCheckerState, typeSystemContext, argumentList, upperBoundIfFlexible2)) {
                                return typeCheckerState.runForkingPoint(new kotlin.jvm.functions.Function1(arrayList, typeCheckerState, typeSystemContext, upperBoundIfFlexible2) { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker$$Lambda$0
                                    private final kotlin.reflect.jvm.internal.impl.types.TypeCheckerState Camera2StreamConfigurationMap;
                                    private final java.util.Collection getHighResolutionOutputSizeshNQ4ISI;
                                    private final kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker getHighSpeedVideoFpsRanges;
                                    private final kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext getHighSpeedVideoSizes;

                                    @Override // kotlin.jvm.functions.Function1
                                    public java.lang.Object invoke(java.lang.Object obj) {
                                        return kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker.getHighSpeedVideoSizes(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, (kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.ForkPointContext) obj);
                                    }

                                    {
                                        this.getHighResolutionOutputSizeshNQ4ISI = arrayList;
                                        this.Camera2StreamConfigurationMap = typeCheckerState;
                                        this.getHighSpeedVideoSizes = typeSystemContext;
                                        this.getHighSpeedVideoFpsRanges = upperBoundIfFlexible2;
                                    }
                                });
                            }
                            return true;
                        }
                    }
                    java.util.List<kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker> list = findCorrespondingSupertypes;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                    for (kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker9 : list) {
                        kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker asRigidType4 = kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.asRigidType(typeSystemContext, typeCheckerState.prepareType(rigidTypeMarker9));
                        if (asRigidType4 != null) {
                            rigidTypeMarker9 = asRigidType4;
                        }
                        arrayList3.add(rigidTypeMarker9);
                    }
                    arrayList = arrayList3;
                    size = arrayList.size();
                    if (size != 0) {
                    }
                }
                bool = null;
                if (bool == null) {
                }
            }
        }
        if (!typeCheckerState.isErrorTypeEqualsToAnything()) {
            bool2 = (!kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.isMarkedNullable(typeSystemContext, rigidTypeMarker5) || kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.isMarkedNullable(typeSystemContext, upperBoundIfFlexible)) ? java.lang.Boolean.valueOf(kotlin.reflect.jvm.internal.impl.types.AbstractStrictEqualityTypeChecker.INSTANCE.strictEqualTypes(typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.withNullability(typeSystemContext, lowerBoundIfFlexible, false), kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.withNullability(typeSystemContext, upperBoundIfFlexible, false))) : java.lang.Boolean.FALSE;
        }
        if (bool2 == null) {
        }
    }

    public final boolean equalTypes(kotlin.reflect.jvm.internal.impl.types.TypeCheckerState typeCheckerState, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeCheckerState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker2, "");
        kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext = typeCheckerState.getTypeSystemContext();
        if (kotlinTypeMarker == kotlinTypeMarker2) {
            return true;
        }
        kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker abstractTypeChecker = INSTANCE;
        if (getHighResolutionOutputSizeshNQ4ISI(typeSystemContext, kotlinTypeMarker) && getHighResolutionOutputSizeshNQ4ISI(typeSystemContext, kotlinTypeMarker2)) {
            kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker prepareType = typeCheckerState.prepareType(typeCheckerState.refineType(kotlinTypeMarker));
            kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker prepareType2 = typeCheckerState.prepareType(typeCheckerState.refineType(kotlinTypeMarker2));
            kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker lowerBoundIfFlexible = typeSystemContext.lowerBoundIfFlexible(prepareType);
            if (!typeSystemContext.areEqualTypeConstructors(typeSystemContext.typeConstructor(prepareType), typeSystemContext.typeConstructor(prepareType2))) {
                return false;
            }
            kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker = lowerBoundIfFlexible;
            if (typeSystemContext.argumentsCount(rigidTypeMarker) == 0) {
                return typeSystemContext.hasFlexibleNullability(prepareType) || typeSystemContext.hasFlexibleNullability(prepareType2) || typeSystemContext.isMarkedNullable(rigidTypeMarker) == typeSystemContext.isMarkedNullable(typeSystemContext.lowerBoundIfFlexible(prepareType2));
            }
        }
        return isSubtypeOf$default(abstractTypeChecker, typeCheckerState, kotlinTypeMarker, kotlinTypeMarker2, false, 8, null) && isSubtypeOf$default(abstractTypeChecker, typeCheckerState, kotlinTypeMarker2, kotlinTypeMarker, false, 8, null);
    }

    private static final boolean getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.TypeCheckerState typeCheckerState, kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker2, boolean z) {
        java.util.Collection<kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker> possibleIntegerTypes = kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.possibleIntegerTypes(typeSystemContext, rigidTypeMarker);
        if ((possibleIntegerTypes instanceof java.util.Collection) && possibleIntegerTypes.isEmpty()) {
            return false;
        }
        for (kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker : possibleIntegerTypes) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.typeConstructor(typeSystemContext, kotlinTypeMarker), kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.typeConstructor(typeSystemContext, rigidTypeMarker2))) {
                return true;
            }
            if (z && isSubtypeOf$default(INSTANCE, typeCheckerState, rigidTypeMarker2, kotlinTypeMarker, false, 8, null)) {
                return true;
            }
        }
        return false;
    }

    private static final boolean getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker) {
        kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker type;
        kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker upperBoundIfFlexible;
        return (rigidTypeMarker instanceof kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker) && (type = kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.getType(typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.projection(typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.typeConstructor(typeSystemContext, (kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker) rigidTypeMarker)))) != null && (upperBoundIfFlexible = kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.upperBoundIfFlexible(typeSystemContext, type)) != null && kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.isIntegerLiteralType(typeSystemContext, upperBoundIfFlexible);
    }

    private static boolean getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker2, kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker) {
        kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker typeParameter;
        kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker asRigidType = kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.asRigidType(typeSystemContext, kotlinTypeMarker);
        if (asRigidType instanceof kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker) {
            kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker capturedTypeMarker = (kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker) asRigidType;
            if (kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.isOldCapturedType(typeSystemContext, capturedTypeMarker) || !kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.isStarProjection(typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.projection(typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.typeConstructor(typeSystemContext, capturedTypeMarker))) || kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.captureStatus(typeSystemContext, capturedTypeMarker) != kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus.FOR_SUBTYPING) {
                return false;
            }
            kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructor = kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.typeConstructor(typeSystemContext, kotlinTypeMarker2);
            kotlin.reflect.jvm.internal.impl.types.model.TypeVariableTypeConstructorMarker typeVariableTypeConstructorMarker = typeConstructor instanceof kotlin.reflect.jvm.internal.impl.types.model.TypeVariableTypeConstructorMarker ? (kotlin.reflect.jvm.internal.impl.types.model.TypeVariableTypeConstructorMarker) typeConstructor : null;
            if (typeVariableTypeConstructorMarker != null && (typeParameter = kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.getTypeParameter(typeSystemContext, typeVariableTypeConstructorMarker)) != null && kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.hasRecursiveBounds(typeSystemContext, typeParameter, typeConstructorMarker)) {
                return true;
            }
        }
        return false;
    }

    public final boolean isSubtypeForSameConstructor(kotlin.reflect.jvm.internal.impl.types.TypeCheckerState typeCheckerState, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker typeArgumentListMarker, kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker) {
        int i;
        int i2;
        boolean equalTypes;
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeCheckerState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSystemContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeArgumentListMarker, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rigidTypeMarker, "");
        kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructor = kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.typeConstructor(typeSystemContext, rigidTypeMarker);
        int size = kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.size(typeSystemContext, typeArgumentListMarker);
        int parametersCount = kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.parametersCount(typeSystemContext, typeConstructor);
        if (size == parametersCount) {
            kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker2 = rigidTypeMarker;
            if (size == kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.argumentsCount(typeSystemContext, rigidTypeMarker2)) {
                for (int i4 = 0; i4 < parametersCount; i4++) {
                    kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker argument = kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.getArgument(typeSystemContext, rigidTypeMarker2, i4);
                    kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker type = kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.getType(typeSystemContext, argument);
                    if (type != null) {
                        kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker typeArgumentMarker = kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.get(typeSystemContext, typeArgumentListMarker, i4);
                        kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.getVariance(typeSystemContext, typeArgumentMarker);
                        kotlin.reflect.jvm.internal.impl.types.model.TypeVariance typeVariance = kotlin.reflect.jvm.internal.impl.types.model.TypeVariance.INV;
                        kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker type2 = kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.getType(typeSystemContext, typeArgumentMarker);
                        kotlin.jvm.internal.Intrinsics.checkNotNull(type2);
                        kotlin.reflect.jvm.internal.impl.types.model.TypeVariance effectiveVariance = effectiveVariance(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.getVariance(typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.getParameter(typeSystemContext, typeConstructor, i4)), kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.getVariance(typeSystemContext, argument));
                        if (effectiveVariance == null) {
                            return typeCheckerState.isErrorTypeEqualsToAnything();
                        }
                        if (effectiveVariance != kotlin.reflect.jvm.internal.impl.types.model.TypeVariance.INV || (!getHighSpeedVideoFpsRanges(typeSystemContext, type2, type, typeConstructor) && !getHighSpeedVideoFpsRanges(typeSystemContext, type, type2, typeConstructor))) {
                            i = typeCheckerState.getHighResolutionOutputSizeshNQ4ISI;
                            if (i <= 100) {
                                i2 = typeCheckerState.getHighResolutionOutputSizeshNQ4ISI;
                                typeCheckerState.getHighResolutionOutputSizeshNQ4ISI = i2 + 1;
                                int i5 = kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker.WhenMappings.$EnumSwitchMapping$0[effectiveVariance.ordinal()];
                                if (i5 == 1) {
                                    equalTypes = INSTANCE.equalTypes(typeCheckerState, type2, type);
                                } else if (i5 == 2) {
                                    equalTypes = isSubtypeOf$default(INSTANCE, typeCheckerState, type2, type, false, 8, null);
                                } else {
                                    if (i5 != 3) {
                                        throw new kotlin.NoWhenBranchMatchedException();
                                    }
                                    equalTypes = isSubtypeOf$default(INSTANCE, typeCheckerState, type, type2, false, 8, null);
                                }
                                i3 = typeCheckerState.getHighResolutionOutputSizeshNQ4ISI;
                                typeCheckerState.getHighResolutionOutputSizeshNQ4ISI = i3 - 1;
                                if (!equalTypes) {
                                    return false;
                                }
                            } else {
                                throw new java.lang.IllegalStateException("Arguments depth is too high. Some related argument: ".concat(java.lang.String.valueOf(type2)).toString());
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    private static boolean getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        return (!kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.isDenotable(typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.typeConstructor(typeSystemContext, kotlinTypeMarker)) || kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.isDynamic(typeSystemContext, kotlinTypeMarker) || kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.isDefinitelyNotNullType(typeSystemContext, kotlinTypeMarker) || kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.isNotNullTypeParameter(typeSystemContext, kotlinTypeMarker) || kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.isFlexibleWithDifferentTypeConstructors(typeSystemContext, kotlinTypeMarker)) ? false : true;
    }

    public final kotlin.reflect.jvm.internal.impl.types.model.TypeVariance effectiveVariance(kotlin.reflect.jvm.internal.impl.types.model.TypeVariance typeVariance, kotlin.reflect.jvm.internal.impl.types.model.TypeVariance typeVariance2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeVariance, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeVariance2, "");
        if (typeVariance == kotlin.reflect.jvm.internal.impl.types.model.TypeVariance.INV) {
            return typeVariance2;
        }
        if (typeVariance2 == kotlin.reflect.jvm.internal.impl.types.model.TypeVariance.INV || typeVariance == typeVariance2) {
            return typeVariance;
        }
        return null;
    }

    private final kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker2) {
        kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker type;
        int argumentsCount = kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.argumentsCount(typeSystemContext, kotlinTypeMarker);
        int i = 0;
        while (true) {
            if (i >= argumentsCount) {
                return null;
            }
            kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker argument = kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.getArgument(typeSystemContext, kotlinTypeMarker, i);
            kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker typeArgumentMarker = kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.isStarProjection(typeSystemContext, argument) ? null : argument;
            if (typeArgumentMarker != null && (type = kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.getType(typeSystemContext, typeArgumentMarker)) != null) {
                boolean z = kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.isCapturedType(typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.lowerBoundIfFlexible(typeSystemContext, type)) && kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.isCapturedType(typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.lowerBoundIfFlexible(typeSystemContext, kotlinTypeMarker2));
                if (kotlin.jvm.internal.Intrinsics.areEqual(type, kotlinTypeMarker2) || (z && kotlin.jvm.internal.Intrinsics.areEqual(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.typeConstructor(typeSystemContext, type), kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.typeConstructor(typeSystemContext, kotlinTypeMarker2)))) {
                    break;
                }
                kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(typeSystemContext, type, kotlinTypeMarker2);
                if (highSpeedVideoFpsRangesFor != null) {
                    return highSpeedVideoFpsRangesFor;
                }
            }
            i++;
        }
        return kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.getParameter(typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.typeConstructor(typeSystemContext, kotlinTypeMarker), i);
    }

    private static java.util.List<kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker> Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.types.TypeCheckerState typeCheckerState, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker) {
        kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy.LowerIfFlexible substitutionSupertypePolicy;
        java.util.List<kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker> fastCorrespondingSupertypes = kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.fastCorrespondingSupertypes(typeSystemContext, rigidTypeMarker, typeConstructorMarker);
        if (fastCorrespondingSupertypes != null) {
            return fastCorrespondingSupertypes;
        }
        if (!kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.isClassTypeConstructor(typeSystemContext, typeConstructorMarker) && kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.isClassType(typeSystemContext, rigidTypeMarker)) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        if (kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.isCommonFinalClassConstructor(typeSystemContext, typeConstructorMarker)) {
            if (typeSystemContext.areEqualTypeConstructors(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.typeConstructor(typeSystemContext, rigidTypeMarker), typeConstructorMarker)) {
                kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker captureFromArguments = typeSystemContext.captureFromArguments(rigidTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus.FOR_SUBTYPING);
                if (captureFromArguments != null) {
                    rigidTypeMarker = captureFromArguments;
                }
                return kotlin.collections.CollectionsKt.listOf(rigidTypeMarker);
            }
            return kotlin.collections.CollectionsKt.emptyList();
        }
        kotlin.reflect.jvm.internal.impl.utils.SmartList smartList = new kotlin.reflect.jvm.internal.impl.utils.SmartList();
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
                kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker captureFromArguments2 = typeSystemContext.captureFromArguments(pop, kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus.FOR_SUBTYPING);
                if (captureFromArguments2 == null) {
                    captureFromArguments2 = pop;
                }
                if (typeSystemContext.areEqualTypeConstructors(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.typeConstructor(typeSystemContext, captureFromArguments2), typeConstructorMarker)) {
                    smartList.add(captureFromArguments2);
                    substitutionSupertypePolicy = kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy.None.INSTANCE;
                } else if (kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.argumentsCount(typeSystemContext, captureFromArguments2) == 0) {
                    substitutionSupertypePolicy = kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy.LowerIfFlexible.INSTANCE;
                } else {
                    substitutionSupertypePolicy = typeCheckerState.getTypeSystemContext().substitutionSupertypePolicy(captureFromArguments2);
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(substitutionSupertypePolicy, kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy.None.INSTANCE)) {
                    substitutionSupertypePolicy = null;
                }
                if (substitutionSupertypePolicy != null) {
                    kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext2 = typeCheckerState.getTypeSystemContext();
                    java.util.Iterator<kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker> it = typeSystemContext2.supertypes(typeSystemContext2.typeConstructor(pop)).iterator();
                    while (it.hasNext()) {
                        supertypesDeque.add(substitutionSupertypePolicy.mo23901transformType(typeCheckerState, it.next()));
                    }
                }
            }
        }
        typeCheckerState.clear();
        return smartList;
    }

    private static java.util.List<kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker> getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.types.TypeCheckerState typeCheckerState, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker) {
        int i;
        java.util.List<kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker> Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(typeCheckerState, typeSystemContext, rigidTypeMarker, typeConstructorMarker);
        if (Camera2StreamConfigurationMap.size() >= 2) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : Camera2StreamConfigurationMap) {
                kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker asArgumentList = kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.asArgumentList(typeSystemContext, (kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker) obj);
                int size = typeSystemContext.size(asArgumentList);
                while (true) {
                    if (i < size) {
                        kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker type = kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.getType(typeSystemContext, typeSystemContext.get(asArgumentList, i));
                        i = (type != null ? kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.asFlexibleType(typeSystemContext, type) : null) == null ? i + 1 : 0;
                    } else {
                        arrayList.add(obj);
                        break;
                    }
                }
            }
            java.util.ArrayList arrayList2 = arrayList;
            if (!arrayList2.isEmpty()) {
                return arrayList2;
            }
        }
        return Camera2StreamConfigurationMap;
    }

    public final java.util.List<kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker> findCorrespondingSupertypes(kotlin.reflect.jvm.internal.impl.types.TypeCheckerState typeCheckerState, kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeCheckerState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rigidTypeMarker, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeConstructorMarker, "");
        return INSTANCE.findCorrespondingSupertypes(typeCheckerState, typeCheckerState.getTypeSystemContext(), rigidTypeMarker, typeConstructorMarker);
    }

    public final java.util.List<kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker> findCorrespondingSupertypes(kotlin.reflect.jvm.internal.impl.types.TypeCheckerState typeCheckerState, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker) {
        kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy.LowerIfFlexible lowerIfFlexible;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeCheckerState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSystemContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rigidTypeMarker, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeConstructorMarker, "");
        if (kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.isClassType(typeSystemContext, rigidTypeMarker)) {
            return getHighSpeedVideoFpsRangesFor(typeCheckerState, typeSystemContext, rigidTypeMarker, typeConstructorMarker);
        }
        if (!kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.isClassTypeConstructor(typeSystemContext, typeConstructorMarker) && !kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.isIntegerLiteralTypeConstructor(typeSystemContext, typeConstructorMarker)) {
            return Camera2StreamConfigurationMap(typeCheckerState, typeSystemContext, rigidTypeMarker, typeConstructorMarker);
        }
        kotlin.reflect.jvm.internal.impl.utils.SmartList<kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker> smartList = new kotlin.reflect.jvm.internal.impl.utils.SmartList();
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
                if (kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.isClassType(typeSystemContext, pop)) {
                    smartList.add(pop);
                    lowerIfFlexible = kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy.None.INSTANCE;
                } else {
                    lowerIfFlexible = kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy.LowerIfFlexible.INSTANCE;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(lowerIfFlexible, kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy.None.INSTANCE)) {
                    lowerIfFlexible = null;
                }
                if (lowerIfFlexible != null) {
                    kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext2 = typeCheckerState.getTypeSystemContext();
                    java.util.Iterator<kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker> it = typeSystemContext2.supertypes(typeSystemContext2.typeConstructor(pop)).iterator();
                    while (it.hasNext()) {
                        supertypesDeque.add(lowerIfFlexible.mo23901transformType(typeCheckerState, it.next()));
                    }
                }
            }
        }
        typeCheckerState.clear();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker2 : smartList) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(rigidTypeMarker2);
            kotlin.collections.CollectionsKt.addAll(arrayList, getHighSpeedVideoFpsRangesFor(typeCheckerState, typeSystemContext, rigidTypeMarker2, typeConstructorMarker));
        }
        return arrayList;
    }

    static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(java.util.Collection collection, final kotlin.reflect.jvm.internal.impl.types.TypeCheckerState typeCheckerState, final kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, final kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker, kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.ForkPointContext forkPointContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(forkPointContext, "");
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            final kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker2 = (kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker) it.next();
            forkPointContext.fork(new kotlin.jvm.functions.Function0(typeCheckerState, typeSystemContext, rigidTypeMarker2, rigidTypeMarker) { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker$$Lambda$1
                private final kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker Camera2StreamConfigurationMap;
                private final kotlin.reflect.jvm.internal.impl.types.TypeCheckerState getHighResolutionOutputSizeshNQ4ISI;
                private final kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker getHighSpeedVideoFpsRanges;
                private final kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext getHighSpeedVideoSizes;

                @Override // kotlin.jvm.functions.Function0
                public java.lang.Object invoke() {
                    boolean isSubtypeForSameConstructor;
                    isSubtypeForSameConstructor = kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker.INSTANCE.isSubtypeForSameConstructor(this.getHighResolutionOutputSizeshNQ4ISI, r1, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt.asArgumentList(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap), this.getHighSpeedVideoFpsRanges);
                    return java.lang.Boolean.valueOf(isSubtypeForSameConstructor);
                }

                {
                    this.getHighResolutionOutputSizeshNQ4ISI = typeCheckerState;
                    this.getHighSpeedVideoSizes = typeSystemContext;
                    this.Camera2StreamConfigurationMap = rigidTypeMarker2;
                    this.getHighSpeedVideoFpsRanges = rigidTypeMarker;
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[kotlin.reflect.jvm.internal.impl.types.model.TypeVariance.values().length];
            try {
                iArr[kotlin.reflect.jvm.internal.impl.types.model.TypeVariance.INV.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.types.model.TypeVariance.OUT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.types.model.TypeVariance.IN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.LowerCapturedTypePolicy.values().length];
            try {
                iArr2[kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.LowerCapturedTypePolicy.CHECK_ONLY_LOWER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.LowerCapturedTypePolicy.CHECK_SUBTYPE_AND_LOWER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.LowerCapturedTypePolicy.SKIP_LOWER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public final boolean isSubtypeOf(kotlin.reflect.jvm.internal.impl.types.TypeCheckerState typeCheckerState, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeCheckerState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker2, "");
        return isSubtypeOf$default(this, typeCheckerState, kotlinTypeMarker, kotlinTypeMarker2, false, 8, null);
    }
}
