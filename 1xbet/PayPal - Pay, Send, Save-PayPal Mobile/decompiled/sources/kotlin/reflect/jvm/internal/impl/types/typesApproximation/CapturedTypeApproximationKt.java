package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

/* loaded from: classes5.dex */
public final class CapturedTypeApproximationKt {
    public static final kotlin.reflect.jvm.internal.impl.types.TypeProjection approximateCapturedTypesIfNecessary(kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection, boolean z) {
        if (typeProjection == null) {
            return null;
        }
        if (typeProjection.isStarProjection()) {
            return typeProjection;
        }
        kotlin.reflect.jvm.internal.impl.types.KotlinType type = typeProjection.getType();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "");
        if (!kotlin.reflect.jvm.internal.impl.types.TypeUtils.contains(type, new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt$$Lambda$1
            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt.getHighSpeedVideoSizes((kotlin.reflect.jvm.internal.impl.types.UnwrappedType) obj);
            }
        })) {
            return typeProjection;
        }
        kotlin.reflect.jvm.internal.impl.types.Variance projectionKind = typeProjection.getProjectionKind();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(projectionKind, "");
        if (projectionKind == kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE) {
            return new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(projectionKind, approximateCapturedTypes(type).getUpper());
        }
        if (z) {
            return new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(projectionKind, approximateCapturedTypes(type).getLower());
        }
        kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor create = kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.create(new kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution() { // from class: kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt$substituteCapturedTypesWithProjections$typeSubstitutor$1
            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution
            public final kotlin.reflect.jvm.internal.impl.types.TypeProjection get(kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeConstructor, "");
                kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor capturedTypeConstructor = typeConstructor instanceof kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor ? (kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor) typeConstructor : null;
                if (capturedTypeConstructor == null) {
                    return null;
                }
                if (capturedTypeConstructor.getProjection().isStarProjection()) {
                    return new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE, capturedTypeConstructor.getProjection().getType());
                }
                return capturedTypeConstructor.getProjection();
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create, "");
        return create.substituteWithoutApproximation(typeProjection);
    }

    public static final kotlin.reflect.jvm.internal.impl.types.typesApproximation.ApproximationBounds<kotlin.reflect.jvm.internal.impl.types.KotlinType> approximateCapturedTypes(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.reflect.jvm.internal.impl.types.SimpleType highSpeedVideoFpsRangesFor;
        kotlin.reflect.jvm.internal.impl.types.typesApproximation.TypeArgument typeArgument;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        if (kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt.isFlexible(kotlinType)) {
            kotlin.reflect.jvm.internal.impl.types.typesApproximation.ApproximationBounds<kotlin.reflect.jvm.internal.impl.types.KotlinType> approximateCapturedTypes = approximateCapturedTypes(kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt.lowerIfFlexible(kotlinType));
            kotlin.reflect.jvm.internal.impl.types.typesApproximation.ApproximationBounds<kotlin.reflect.jvm.internal.impl.types.KotlinType> approximateCapturedTypes2 = approximateCapturedTypes(kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt.upperIfFlexible(kotlinType));
            return new kotlin.reflect.jvm.internal.impl.types.typesApproximation.ApproximationBounds<>(kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt.inheritEnhancement(kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.flexibleType(kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt.lowerIfFlexible(approximateCapturedTypes.getLower()), kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt.upperIfFlexible(approximateCapturedTypes2.getLower())), kotlinType), kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt.inheritEnhancement(kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.flexibleType(kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt.lowerIfFlexible(approximateCapturedTypes.getUpper()), kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt.upperIfFlexible(approximateCapturedTypes2.getUpper())), kotlinType));
        }
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor constructor = kotlinType.getConstructor();
        if (kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt.isCaptured(kotlinType)) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(constructor, "");
            kotlin.reflect.jvm.internal.impl.types.TypeProjection projection = ((kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor) constructor).getProjection();
            kotlin.reflect.jvm.internal.impl.types.KotlinType type = projection.getType();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "");
            kotlin.reflect.jvm.internal.impl.types.KotlinType makeNullableIfNeeded = kotlin.reflect.jvm.internal.impl.types.TypeUtils.makeNullableIfNeeded(type, kotlinType.isMarkedNullable());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(makeNullableIfNeeded, "");
            int i = kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt.WhenMappings.$EnumSwitchMapping$0[projection.getProjectionKind().ordinal()];
            if (i == 2) {
                return new kotlin.reflect.jvm.internal.impl.types.typesApproximation.ApproximationBounds<>(makeNullableIfNeeded, kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.getBuiltIns(kotlinType).getNullableAnyType());
            }
            if (i == 3) {
                kotlin.reflect.jvm.internal.impl.types.SimpleType nothingType = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.getBuiltIns(kotlinType).getNothingType();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(nothingType, "");
                kotlin.reflect.jvm.internal.impl.types.KotlinType makeNullableIfNeeded2 = kotlin.reflect.jvm.internal.impl.types.TypeUtils.makeNullableIfNeeded((kotlin.reflect.jvm.internal.impl.types.KotlinType) nothingType, kotlinType.isMarkedNullable());
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(makeNullableIfNeeded2, "");
                return new kotlin.reflect.jvm.internal.impl.types.typesApproximation.ApproximationBounds<>(makeNullableIfNeeded2, makeNullableIfNeeded);
            }
            throw new java.lang.AssertionError("Only nontrivial projections should have been captured, not: ".concat(java.lang.String.valueOf(projection)));
        }
        if (kotlinType.getArguments().isEmpty() || kotlinType.getArguments().size() != constructor.getParameters().size()) {
            return new kotlin.reflect.jvm.internal.impl.types.typesApproximation.ApproximationBounds<>(kotlinType, kotlinType);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> arguments = kotlinType.getArguments();
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> parameters = constructor.getParameters();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parameters, "");
        for (kotlin.Pair pair : kotlin.collections.CollectionsKt.zip(arguments, parameters)) {
            kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection = (kotlin.reflect.jvm.internal.impl.types.TypeProjection) pair.component1();
            kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) pair.component2();
            kotlin.jvm.internal.Intrinsics.checkNotNull(typeParameterDescriptor);
            int i2 = kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt.WhenMappings.$EnumSwitchMapping$0[kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.combine(typeParameterDescriptor.getVariance(), typeProjection).ordinal()];
            if (i2 == 1) {
                kotlin.reflect.jvm.internal.impl.types.KotlinType type2 = typeProjection.getType();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type2, "");
                kotlin.reflect.jvm.internal.impl.types.KotlinType type3 = typeProjection.getType();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type3, "");
                typeArgument = new kotlin.reflect.jvm.internal.impl.types.typesApproximation.TypeArgument(typeParameterDescriptor, type2, type3);
            } else if (i2 == 2) {
                kotlin.reflect.jvm.internal.impl.types.KotlinType type4 = typeProjection.getType();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type4, "");
                kotlin.reflect.jvm.internal.impl.types.SimpleType nullableAnyType = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getBuiltIns(typeParameterDescriptor).getNullableAnyType();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(nullableAnyType, "");
                typeArgument = new kotlin.reflect.jvm.internal.impl.types.typesApproximation.TypeArgument(typeParameterDescriptor, type4, nullableAnyType);
            } else {
                if (i2 != 3) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                kotlin.reflect.jvm.internal.impl.types.SimpleType nothingType2 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getBuiltIns(typeParameterDescriptor).getNothingType();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(nothingType2, "");
                kotlin.reflect.jvm.internal.impl.types.KotlinType type5 = typeProjection.getType();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type5, "");
                typeArgument = new kotlin.reflect.jvm.internal.impl.types.typesApproximation.TypeArgument(typeParameterDescriptor, nothingType2, type5);
            }
            if (typeProjection.isStarProjection()) {
                arrayList.add(typeArgument);
                arrayList2.add(typeArgument);
            } else {
                kotlin.reflect.jvm.internal.impl.types.typesApproximation.ApproximationBounds<kotlin.reflect.jvm.internal.impl.types.KotlinType> approximateCapturedTypes3 = approximateCapturedTypes(typeArgument.getHighResolutionOutputSizeshNQ4ISI);
                kotlin.reflect.jvm.internal.impl.types.KotlinType component1 = approximateCapturedTypes3.component1();
                kotlin.reflect.jvm.internal.impl.types.KotlinType component2 = approximateCapturedTypes3.component2();
                kotlin.reflect.jvm.internal.impl.types.typesApproximation.ApproximationBounds<kotlin.reflect.jvm.internal.impl.types.KotlinType> approximateCapturedTypes4 = approximateCapturedTypes(typeArgument.getHighSpeedVideoFpsRangesFor);
                kotlin.reflect.jvm.internal.impl.types.typesApproximation.ApproximationBounds approximationBounds = new kotlin.reflect.jvm.internal.impl.types.typesApproximation.ApproximationBounds(new kotlin.reflect.jvm.internal.impl.types.typesApproximation.TypeArgument(typeArgument.getHighSpeedVideoSizes, component2, approximateCapturedTypes4.component1()), new kotlin.reflect.jvm.internal.impl.types.typesApproximation.TypeArgument(typeArgument.getHighSpeedVideoSizes, component1, approximateCapturedTypes4.component2()));
                kotlin.reflect.jvm.internal.impl.types.typesApproximation.TypeArgument typeArgument2 = (kotlin.reflect.jvm.internal.impl.types.typesApproximation.TypeArgument) approximationBounds.component1();
                kotlin.reflect.jvm.internal.impl.types.typesApproximation.TypeArgument typeArgument3 = (kotlin.reflect.jvm.internal.impl.types.typesApproximation.TypeArgument) approximationBounds.component2();
                arrayList.add(typeArgument2);
                arrayList2.add(typeArgument3);
            }
        }
        java.util.ArrayList<kotlin.reflect.jvm.internal.impl.types.typesApproximation.TypeArgument> arrayList3 = arrayList;
        if (!arrayList3.isEmpty()) {
            for (kotlin.reflect.jvm.internal.impl.types.typesApproximation.TypeArgument typeArgument4 : arrayList3) {
                if (!kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.DEFAULT.isSubtypeOf(typeArgument4.getHighResolutionOutputSizeshNQ4ISI, typeArgument4.getHighSpeedVideoFpsRangesFor)) {
                    kotlin.reflect.jvm.internal.impl.types.SimpleType nothingType3 = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.getBuiltIns(kotlinType).getNothingType();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(nothingType3, "");
                    highSpeedVideoFpsRangesFor = nothingType3;
                    break;
                }
            }
        }
        highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(kotlinType, arrayList);
        return new kotlin.reflect.jvm.internal.impl.types.typesApproximation.ApproximationBounds<>(highSpeedVideoFpsRangesFor, getHighSpeedVideoFpsRangesFor(kotlinType, arrayList2));
    }

    private static final kotlin.reflect.jvm.internal.impl.types.KotlinType getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, java.util.List<kotlin.reflect.jvm.internal.impl.types.typesApproximation.TypeArgument> list) {
        kotlinType.getArguments().size();
        list.size();
        java.util.List<kotlin.reflect.jvm.internal.impl.types.typesApproximation.TypeArgument> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(getHighSpeedVideoFpsRangesFor((kotlin.reflect.jvm.internal.impl.types.typesApproximation.TypeArgument) it.next()));
        }
        return kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt.replace$default(kotlinType, arrayList, null, null, 6, null);
    }

    static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions descriptorRendererOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptorRendererOptions, "");
        descriptorRendererOptions.setClassifierNamePolicy(kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy.FULLY_QUALIFIED.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ java.lang.Boolean getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedType) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(unwrappedType);
        return java.lang.Boolean.valueOf(kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt.isCaptured(unwrappedType));
    }

    private static final kotlin.reflect.jvm.internal.impl.types.TypeProjection getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.types.typesApproximation.TypeArgument typeArgument) {
        kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.DEFAULT.isSubtypeOf(typeArgument.getHighResolutionOutputSizeshNQ4ISI, typeArgument.getHighSpeedVideoFpsRangesFor);
        if (kotlin.jvm.internal.Intrinsics.areEqual(typeArgument.getHighResolutionOutputSizeshNQ4ISI, typeArgument.getHighSpeedVideoFpsRangesFor) || typeArgument.getHighSpeedVideoSizes.getVariance() == kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE) {
            return new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(typeArgument.getHighResolutionOutputSizeshNQ4ISI);
        }
        if (kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isNothing(typeArgument.getHighResolutionOutputSizeshNQ4ISI) && typeArgument.getHighSpeedVideoSizes.getVariance() != kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE) {
            kotlin.reflect.jvm.internal.impl.types.Variance variance = kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE;
            if (variance == typeArgument.getHighSpeedVideoSizes.getVariance()) {
                variance = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT;
            }
            return new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(variance, typeArgument.getHighSpeedVideoFpsRangesFor);
        }
        if (kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isNullableAny(typeArgument.getHighSpeedVideoFpsRangesFor)) {
            kotlin.reflect.jvm.internal.impl.types.Variance variance2 = kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE;
            if (variance2 == typeArgument.getHighSpeedVideoSizes.getVariance()) {
                variance2 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT;
            }
            return new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(variance2, typeArgument.getHighResolutionOutputSizeshNQ4ISI);
        }
        kotlin.reflect.jvm.internal.impl.types.Variance variance3 = kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE;
        if (variance3 == typeArgument.getHighSpeedVideoSizes.getVariance()) {
            variance3 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT;
        }
        return new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(variance3, typeArgument.getHighSpeedVideoFpsRangesFor);
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kotlin.reflect.jvm.internal.impl.types.Variance.values().length];
            try {
                iArr[kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
