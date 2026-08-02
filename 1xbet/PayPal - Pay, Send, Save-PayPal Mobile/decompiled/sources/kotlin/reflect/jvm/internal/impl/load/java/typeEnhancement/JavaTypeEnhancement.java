package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

/* loaded from: classes5.dex */
public final class JavaTypeEnhancement {
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings getHighResolutionOutputSizeshNQ4ISI;

    static final class Result {
        final kotlin.reflect.jvm.internal.impl.types.KotlinType getHighResolutionOutputSizeshNQ4ISI;
        final int getHighSpeedVideoFpsRanges;

        public Result(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, int i) {
            this.getHighResolutionOutputSizeshNQ4ISI = kotlinType;
            this.getHighSpeedVideoFpsRanges = i;
        }
    }

    public JavaTypeEnhancement(kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings javaResolverSettings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaResolverSettings, "");
        this.getHighResolutionOutputSizeshNQ4ISI = javaResolverSettings;
    }

    static final class SimpleResult {
        final boolean getHighResolutionOutputSizeshNQ4ISI;
        final int getHighSpeedVideoFpsRangesFor;
        final kotlin.reflect.jvm.internal.impl.types.SimpleType getHighSpeedVideoSizes;

        public SimpleResult(kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType, int i, boolean z) {
            this.getHighSpeedVideoSizes = simpleType;
            this.getHighSpeedVideoFpsRangesFor = i;
            this.getHighResolutionOutputSizeshNQ4ISI = z;
        }
    }

    public final kotlin.reflect.jvm.internal.impl.types.KotlinType enhance(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers> function1, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return getHighResolutionOutputSizeshNQ4ISI(kotlinType.unwrap(), function1, 0, z).getHighResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0085, code lost:
    
        if (r13 == null) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement.Result getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedType, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers> function1, int i, boolean z) {
        kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType;
        kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType2;
        kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl rawTypeImpl = null;
        if (kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt.isError(unwrappedType)) {
            return new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement.Result(null, 1);
        }
        if (unwrappedType instanceof kotlin.reflect.jvm.internal.impl.types.FlexibleType) {
            boolean z2 = unwrappedType instanceof kotlin.reflect.jvm.internal.impl.types.RawType;
            kotlin.reflect.jvm.internal.impl.types.FlexibleType flexibleType = (kotlin.reflect.jvm.internal.impl.types.FlexibleType) unwrappedType;
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement.SimpleResult highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(flexibleType.getLowerBound(), function1, i, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition.FLEXIBLE_LOWER, z2, z);
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement.SimpleResult highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(flexibleType.getUpperBound(), function1, i, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition.FLEXIBLE_UPPER, z2, z);
            int i2 = highResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor;
            int i3 = highResolutionOutputSizeshNQ4ISI2.getHighSpeedVideoFpsRangesFor;
            if (highResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes != null || highResolutionOutputSizeshNQ4ISI2.getHighSpeedVideoSizes != null) {
                if (highResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI || highResolutionOutputSizeshNQ4ISI2.getHighResolutionOutputSizeshNQ4ISI) {
                    kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType3 = highResolutionOutputSizeshNQ4ISI2.getHighSpeedVideoSizes;
                    if (simpleType3 != null) {
                        kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType4 = highResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes;
                        if (simpleType4 == null) {
                            simpleType4 = simpleType3;
                        }
                        simpleType2 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.flexibleType(simpleType4, simpleType3);
                    }
                    kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType5 = highResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(simpleType5);
                    simpleType2 = simpleType5;
                    rawTypeImpl = kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt.wrapEnhancement(unwrappedType, simpleType2);
                } else if (z2) {
                    kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType6 = highResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes;
                    if (simpleType6 == null) {
                        simpleType6 = flexibleType.getLowerBound();
                    }
                    kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType7 = highResolutionOutputSizeshNQ4ISI2.getHighSpeedVideoSizes;
                    if (simpleType7 == null) {
                        simpleType7 = flexibleType.getUpperBound();
                    }
                    rawTypeImpl = new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl(simpleType6, simpleType7);
                } else {
                    kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType8 = highResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes;
                    if (simpleType8 == null) {
                        simpleType8 = flexibleType.getLowerBound();
                    }
                    kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType9 = highResolutionOutputSizeshNQ4ISI2.getHighSpeedVideoSizes;
                    if (simpleType9 == null) {
                        simpleType9 = flexibleType.getUpperBound();
                    }
                    rawTypeImpl = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.flexibleType(simpleType8, simpleType9);
                }
            }
            return new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement.Result(rawTypeImpl, highResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor);
        }
        if (!(unwrappedType instanceof kotlin.reflect.jvm.internal.impl.types.SimpleType)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement.SimpleResult highResolutionOutputSizeshNQ4ISI3 = getHighResolutionOutputSizeshNQ4ISI((kotlin.reflect.jvm.internal.impl.types.SimpleType) unwrappedType, function1, i, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition.INFLEXIBLE, false, z);
        if (highResolutionOutputSizeshNQ4ISI3.getHighResolutionOutputSizeshNQ4ISI) {
            simpleType = kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt.wrapEnhancement(unwrappedType, highResolutionOutputSizeshNQ4ISI3.getHighSpeedVideoSizes);
        } else {
            simpleType = highResolutionOutputSizeshNQ4ISI3.getHighSpeedVideoSizes;
        }
        return new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement.Result(simpleType, highResolutionOutputSizeshNQ4ISI3.getHighSpeedVideoFpsRangesFor);
    }

    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement.SimpleResult getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers> function1, int i, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition typeComponentPosition, boolean z, boolean z2) {
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor constructor;
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.EnhancedTypeAnnotations enhancedTypeAnnotations;
        boolean z3;
        boolean z4;
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement.Result result;
        kotlin.reflect.jvm.internal.impl.types.TypeProjection makeStarProjection;
        boolean shouldEnhance = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPositionKt.shouldEnhance(typeComponentPosition);
        boolean z5 = (z2 && z) ? false : true;
        kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType = null;
        if (!shouldEnhance && simpleType.getArguments().isEmpty()) {
            return new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement.SimpleResult(null, 1, false);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = simpleType.getConstructor().mo23898getDeclarationDescriptor();
        if (mo23898getDeclarationDescriptor == null) {
            return new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement.SimpleResult(null, 1, false);
        }
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers invoke = function1.invoke(java.lang.Integer.valueOf(i));
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor access$enhanceMutability = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementKt.access$enhanceMutability(mo23898getDeclarationDescriptor, invoke, typeComponentPosition);
        java.lang.Boolean access$getEnhancedNullability = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementKt.access$getEnhancedNullability(invoke, typeComponentPosition);
        if (access$enhanceMutability == null || (constructor = access$enhanceMutability.getTypeConstructor()) == null) {
            constructor = simpleType.getConstructor();
        }
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor = constructor;
        int i2 = i + 1;
        java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> arguments = simpleType.getArguments();
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> parameters = typeConstructor.getParameters();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parameters, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list = parameters;
        java.util.Iterator<T> it = arguments.iterator();
        java.util.Iterator<T> it2 = list.iterator();
        java.util.ArrayList arrayList = new java.util.ArrayList(java.lang.Math.min(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arguments, 10), kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10)));
        while (it.hasNext() && it2.hasNext()) {
            java.lang.Object next = it.next();
            kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) it2.next();
            kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection = (kotlin.reflect.jvm.internal.impl.types.TypeProjection) next;
            if (!z5) {
                z4 = z5;
                result = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement.Result(kotlinType, 0);
            } else {
                z4 = z5;
                if (!typeProjection.isStarProjection()) {
                    result = getHighResolutionOutputSizeshNQ4ISI(typeProjection.getType().unwrap(), function1, i2, z2);
                } else if (function1.invoke(java.lang.Integer.valueOf(i2)).getNullability() == kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.FORCE_FLEXIBILITY) {
                    kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrap = typeProjection.getType().unwrap();
                    result = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement.Result(kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.flexibleType(kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt.lowerIfFlexible(unwrap).makeNullableAsSpecified(false), kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt.upperIfFlexible(unwrap).makeNullableAsSpecified(true)), 1);
                } else {
                    result = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement.Result(null, 1);
                }
            }
            i2 += result.getHighSpeedVideoFpsRanges;
            if (result.getHighResolutionOutputSizeshNQ4ISI == null) {
                if (access$enhanceMutability == null || typeProjection.isStarProjection()) {
                    makeStarProjection = access$enhanceMutability != null ? kotlin.reflect.jvm.internal.impl.types.TypeUtils.makeStarProjection(typeParameterDescriptor) : null;
                } else {
                    kotlin.reflect.jvm.internal.impl.types.KotlinType type = typeProjection.getType();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "");
                    kotlin.reflect.jvm.internal.impl.types.Variance projectionKind = typeProjection.getProjectionKind();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(projectionKind, "");
                    makeStarProjection = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.createProjection(type, projectionKind, typeParameterDescriptor);
                }
            } else {
                kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType2 = result.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.reflect.jvm.internal.impl.types.Variance projectionKind2 = typeProjection.getProjectionKind();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(projectionKind2, "");
                makeStarProjection = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.createProjection(kotlinType2, projectionKind2, typeParameterDescriptor);
            }
            arrayList.add(makeStarProjection);
            z5 = z4;
            kotlinType = null;
        }
        java.util.ArrayList arrayList2 = arrayList;
        int i3 = i2 - i;
        if (access$enhanceMutability == null && access$getEnhancedNullability == null) {
            java.util.ArrayList arrayList3 = arrayList2;
            if (!arrayList3.isEmpty()) {
                java.util.Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    if (((kotlin.reflect.jvm.internal.impl.types.TypeProjection) it3.next()) == null) {
                    }
                }
            }
            return new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement.SimpleResult(null, i3, false);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations[] annotationsArr = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations[3];
        annotationsArr[0] = simpleType.getAnnotations();
        enhancedTypeAnnotations = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementKt.getHighSpeedVideoFpsRanges;
        if (access$enhanceMutability == null) {
            enhancedTypeAnnotations = null;
        }
        annotationsArr[1] = enhancedTypeAnnotations;
        annotationsArr[2] = access$getEnhancedNullability == null ? null : kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementKt.getENHANCED_NULLABILITY_ANNOTATIONS();
        kotlin.reflect.jvm.internal.impl.types.TypeAttributes defaultAttributes = kotlin.reflect.jvm.internal.impl.types.TypeAttributesKt.toDefaultAttributes(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementKt.access$compositeAnnotationsOrSingle(kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) annotationsArr)));
        java.util.ArrayList arrayList4 = arrayList2;
        java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> arguments2 = simpleType.getArguments();
        java.util.Iterator it4 = arrayList4.iterator();
        java.util.Iterator<T> it5 = arguments2.iterator();
        java.util.ArrayList arrayList5 = new java.util.ArrayList(java.lang.Math.min(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList4, 10), kotlin.collections.CollectionsKt.collectionSizeOrDefault(arguments2, 10)));
        while (it4.hasNext() && it5.hasNext()) {
            java.lang.Object next2 = it4.next();
            kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection2 = (kotlin.reflect.jvm.internal.impl.types.TypeProjection) it5.next();
            kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection3 = (kotlin.reflect.jvm.internal.impl.types.TypeProjection) next2;
            if (typeProjection3 != null) {
                typeProjection2 = typeProjection3;
            }
            arrayList5.add(typeProjection2);
        }
        kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType$default = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.simpleType$default(defaultAttributes, typeConstructor, arrayList5, access$getEnhancedNullability != null ? access$getEnhancedNullability.booleanValue() : simpleType.isMarkedNullable(), (kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner) null, 16, (java.lang.Object) null);
        if (!invoke.getDefinitelyNotNull()) {
            z3 = true;
        } else if (this.getHighResolutionOutputSizeshNQ4ISI.getCorrectNullabilityForNotNullTypeParameter()) {
            z3 = true;
            simpleType$default = kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt.makeSimpleTypeDefinitelyNotNullOrNotNull(simpleType$default, true);
        } else {
            z3 = true;
            simpleType$default = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NotNullTypeParameterImpl(simpleType$default);
        }
        return new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement.SimpleResult(simpleType$default, i3, (access$getEnhancedNullability == null || !invoke.isNullabilityQualifierForWarning()) ? false : z3);
    }
}
