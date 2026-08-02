package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
public final class TypeParameterUpperBoundEraser {
    public static final kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser.Companion Companion = new kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser.Companion(null);
    private final kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager Camera2StreamConfigurationMap;
    private final kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull<kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser.DataToEraseUpperBound, kotlin.reflect.jvm.internal.impl.types.KotlinType> getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.types.TypeParameterErasureOptions getHighSpeedVideoFpsRanges;
    private final kotlin.Lazy getHighSpeedVideoFpsRangesFor;
    private final kotlin.reflect.jvm.internal.impl.types.ErasureProjectionComputer getHighSpeedVideoSizes;

    public TypeParameterUpperBoundEraser(kotlin.reflect.jvm.internal.impl.types.ErasureProjectionComputer erasureProjectionComputer, kotlin.reflect.jvm.internal.impl.types.TypeParameterErasureOptions typeParameterErasureOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(erasureProjectionComputer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeParameterErasureOptions, "");
        this.getHighSpeedVideoSizes = erasureProjectionComputer;
        this.getHighSpeedVideoFpsRanges = typeParameterErasureOptions;
        kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager lockBasedStorageManager = new kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager("Type parameter upper bound erasure results");
        this.Camera2StreamConfigurationMap = lockBasedStorageManager;
        this.getHighSpeedVideoFpsRangesFor = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser$$Lambda$0
            private final kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser getHighResolutionOutputSizeshNQ4ISI;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                kotlin.reflect.jvm.internal.impl.types.error.ErrorType createErrorType;
                createErrorType = kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils.createErrorType(kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind.CANNOT_COMPUTE_ERASED_BOUND, this.getHighResolutionOutputSizeshNQ4ISI.toString());
                return createErrorType;
            }

            {
                this.getHighResolutionOutputSizeshNQ4ISI = this;
            }
        });
        kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull<kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser.DataToEraseUpperBound, kotlin.reflect.jvm.internal.impl.types.KotlinType> createMemoizedFunction = lockBasedStorageManager.createMemoizedFunction(new kotlin.jvm.functions.Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser$$Lambda$1
            private final kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser Camera2StreamConfigurationMap;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser.getHighSpeedVideoFpsRangesFor(this.Camera2StreamConfigurationMap, (kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser.DataToEraseUpperBound) obj);
            }

            {
                this.Camera2StreamConfigurationMap = this;
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createMemoizedFunction, "");
        this.getHighResolutionOutputSizeshNQ4ISI = createMemoizedFunction;
    }

    public /* synthetic */ TypeParameterUpperBoundEraser(kotlin.reflect.jvm.internal.impl.types.ErasureProjectionComputer erasureProjectionComputer, kotlin.reflect.jvm.internal.impl.types.TypeParameterErasureOptions typeParameterErasureOptions, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(erasureProjectionComputer, (i & 2) != 0 ? new kotlin.reflect.jvm.internal.impl.types.TypeParameterErasureOptions(false, false) : typeParameterErasureOptions);
    }

    static final class DataToEraseUpperBound {
        final kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor getHighResolutionOutputSizeshNQ4ISI;
        final kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes getHighSpeedVideoFpsRangesFor;

        public DataToEraseUpperBound(kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor, kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes erasureTypeAttributes) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeParameterDescriptor, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(erasureTypeAttributes, "");
            this.getHighResolutionOutputSizeshNQ4ISI = typeParameterDescriptor;
            this.getHighSpeedVideoFpsRangesFor = erasureTypeAttributes;
        }

        public final boolean equals(java.lang.Object obj) {
            if (!(obj instanceof kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser.DataToEraseUpperBound)) {
                return false;
            }
            kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser.DataToEraseUpperBound dataToEraseUpperBound = (kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser.DataToEraseUpperBound) obj;
            return kotlin.jvm.internal.Intrinsics.areEqual(dataToEraseUpperBound.getHighResolutionOutputSizeshNQ4ISI, this.getHighResolutionOutputSizeshNQ4ISI) && kotlin.jvm.internal.Intrinsics.areEqual(dataToEraseUpperBound.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRangesFor);
        }

        public final int hashCode() {
            int hashCode = this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
            return hashCode + (hashCode * 31) + this.getHighSpeedVideoFpsRangesFor.hashCode();
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DataToEraseUpperBound(typeParameter=");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb.append(", typeAttr=");
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            sb.append(')');
            return sb.toString();
        }
    }

    public final kotlin.reflect.jvm.internal.impl.types.KotlinType getErasedUpperBound(kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor, kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes erasureTypeAttributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeParameterDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(erasureTypeAttributes, "");
        kotlin.reflect.jvm.internal.impl.types.KotlinType invoke = this.getHighResolutionOutputSizeshNQ4ISI.invoke(new kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser.DataToEraseUpperBound(typeParameterDescriptor, erasureTypeAttributes));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(invoke, "");
        return invoke;
    }

    private final kotlin.reflect.jvm.internal.impl.types.KotlinType getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes erasureTypeAttributes) {
        kotlin.reflect.jvm.internal.impl.types.KotlinType replaceArgumentsWithStarProjections;
        kotlin.reflect.jvm.internal.impl.types.SimpleType defaultType = erasureTypeAttributes.getDefaultType();
        return (defaultType == null || (replaceArgumentsWithStarProjections = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.replaceArgumentsWithStarProjections(defaultType)) == null) ? (kotlin.reflect.jvm.internal.impl.types.error.ErrorType) this.getHighSpeedVideoFpsRangesFor.getValue() : replaceArgumentsWithStarProjections;
    }

    private final java.util.Set<kotlin.reflect.jvm.internal.impl.types.KotlinType> getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor typeSubstitutor, java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.KotlinType> list, kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes erasureTypeAttributes) {
        java.util.Set createSetBuilder = kotlin.collections.SetsKt.createSetBuilder();
        for (kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType : list) {
            kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = kotlinType.getConstructor().mo23898getDeclarationDescriptor();
            if (mo23898getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) {
                createSetBuilder.add(Companion.replaceArgumentsOfUpperBound(kotlinType, typeSubstitutor, erasureTypeAttributes.getVisitedTypeParameters(), this.getHighSpeedVideoFpsRanges.getLeaveNonTypeParameterTypes()));
            } else if (mo23898getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) {
                java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> visitedTypeParameters = erasureTypeAttributes.getVisitedTypeParameters();
                if (visitedTypeParameters != null && visitedTypeParameters.contains(mo23898getDeclarationDescriptor)) {
                    createSetBuilder.add(getHighSpeedVideoSizes(erasureTypeAttributes));
                } else {
                    java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> upperBounds = ((kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) mo23898getDeclarationDescriptor).getUpperBounds();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperBounds, "");
                    createSetBuilder.addAll(getHighSpeedVideoFpsRangesFor(typeSubstitutor, upperBounds, erasureTypeAttributes));
                }
            }
            if (!this.getHighSpeedVideoFpsRanges.getIntersectUpperBounds()) {
                break;
            }
        }
        return kotlin.collections.SetsKt.build(createSetBuilder);
    }

    public static final class Companion {
        private Companion() {
        }

        public final kotlin.reflect.jvm.internal.impl.types.KotlinType replaceArgumentsOfUpperBound(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor typeSubstitutor, java.util.Set<? extends kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> set, boolean z) {
            kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType;
            kotlin.reflect.jvm.internal.impl.types.KotlinType type;
            kotlin.reflect.jvm.internal.impl.types.KotlinType type2;
            kotlin.reflect.jvm.internal.impl.types.KotlinType type3;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSubstitutor, "");
            kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrap = kotlinType.unwrap();
            if (unwrap instanceof kotlin.reflect.jvm.internal.impl.types.FlexibleType) {
                kotlin.reflect.jvm.internal.impl.types.FlexibleType flexibleType = (kotlin.reflect.jvm.internal.impl.types.FlexibleType) unwrap;
                kotlin.reflect.jvm.internal.impl.types.SimpleType lowerBound = flexibleType.getLowerBound();
                if (!lowerBound.getConstructor().getParameters().isEmpty() && lowerBound.getConstructor().mo23898getDeclarationDescriptor() != null) {
                    java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> parameters = lowerBound.getConstructor().getParameters();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parameters, "");
                    java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list = parameters;
                    java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                    for (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor : list) {
                        kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl starProjectionImpl = (kotlin.reflect.jvm.internal.impl.types.TypeProjection) kotlin.collections.CollectionsKt.getOrNull(kotlinType.getArguments(), typeParameterDescriptor.getIndex());
                        if (!z || starProjectionImpl == null || (type3 = starProjectionImpl.getType()) == null || kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.containsTypeParameter(type3)) {
                            boolean z2 = set != null && set.contains(typeParameterDescriptor);
                            if (starProjectionImpl != null && !z2) {
                                kotlin.reflect.jvm.internal.impl.types.TypeSubstitution substitution = typeSubstitutor.getSubstitution();
                                kotlin.reflect.jvm.internal.impl.types.KotlinType type4 = starProjectionImpl.getType();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type4, "");
                                if (substitution.mo23902get(type4) != null) {
                                }
                            }
                            starProjectionImpl = new kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl(typeParameterDescriptor);
                        }
                        arrayList.add(starProjectionImpl);
                    }
                    lowerBound = kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt.replace$default(lowerBound, arrayList, null, 2, null);
                }
                kotlin.reflect.jvm.internal.impl.types.SimpleType upperBound = flexibleType.getUpperBound();
                if (!upperBound.getConstructor().getParameters().isEmpty() && upperBound.getConstructor().mo23898getDeclarationDescriptor() != null) {
                    java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> parameters2 = upperBound.getConstructor().getParameters();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parameters2, "");
                    java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list2 = parameters2;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                    for (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor2 : list2) {
                        kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl starProjectionImpl2 = (kotlin.reflect.jvm.internal.impl.types.TypeProjection) kotlin.collections.CollectionsKt.getOrNull(kotlinType.getArguments(), typeParameterDescriptor2.getIndex());
                        if (!z || starProjectionImpl2 == null || (type2 = starProjectionImpl2.getType()) == null || kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.containsTypeParameter(type2)) {
                            boolean z3 = set != null && set.contains(typeParameterDescriptor2);
                            if (starProjectionImpl2 != null && !z3) {
                                kotlin.reflect.jvm.internal.impl.types.TypeSubstitution substitution2 = typeSubstitutor.getSubstitution();
                                kotlin.reflect.jvm.internal.impl.types.KotlinType type5 = starProjectionImpl2.getType();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type5, "");
                                if (substitution2.mo23902get(type5) != null) {
                                }
                            }
                            starProjectionImpl2 = new kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl(typeParameterDescriptor2);
                        }
                        arrayList2.add(starProjectionImpl2);
                    }
                    upperBound = kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt.replace$default(upperBound, arrayList2, null, 2, null);
                }
                simpleType = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.flexibleType(lowerBound, upperBound);
            } else {
                if (!(unwrap instanceof kotlin.reflect.jvm.internal.impl.types.SimpleType)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType2 = (kotlin.reflect.jvm.internal.impl.types.SimpleType) unwrap;
                if (!simpleType2.getConstructor().getParameters().isEmpty() && simpleType2.getConstructor().mo23898getDeclarationDescriptor() != null) {
                    java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> parameters3 = simpleType2.getConstructor().getParameters();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parameters3, "");
                    java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list3 = parameters3;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
                    for (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor3 : list3) {
                        kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl starProjectionImpl3 = (kotlin.reflect.jvm.internal.impl.types.TypeProjection) kotlin.collections.CollectionsKt.getOrNull(kotlinType.getArguments(), typeParameterDescriptor3.getIndex());
                        if (!z || starProjectionImpl3 == null || (type = starProjectionImpl3.getType()) == null || kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.containsTypeParameter(type)) {
                            boolean z4 = set != null && set.contains(typeParameterDescriptor3);
                            if (starProjectionImpl3 != null && !z4) {
                                kotlin.reflect.jvm.internal.impl.types.TypeSubstitution substitution3 = typeSubstitutor.getSubstitution();
                                kotlin.reflect.jvm.internal.impl.types.KotlinType type6 = starProjectionImpl3.getType();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type6, "");
                                if (substitution3.mo23902get(type6) != null) {
                                }
                            }
                            starProjectionImpl3 = new kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl(typeParameterDescriptor3);
                        }
                        arrayList3.add(starProjectionImpl3);
                    }
                    simpleType2 = kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt.replace$default(simpleType2, arrayList3, null, 2, null);
                }
                simpleType = simpleType2;
            }
            kotlin.reflect.jvm.internal.impl.types.KotlinType safeSubstitute = typeSubstitutor.safeSubstitute(kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt.inheritEnhancement(simpleType, unwrap), kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(safeSubstitute, "");
            return safeSubstitute;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.KotlinType getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser typeParameterUpperBoundEraser, kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser.DataToEraseUpperBound dataToEraseUpperBound) {
        kotlin.reflect.jvm.internal.impl.types.TypeProjection computeProjection;
        kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor = dataToEraseUpperBound.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes erasureTypeAttributes = dataToEraseUpperBound.getHighSpeedVideoFpsRangesFor;
        java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> visitedTypeParameters = erasureTypeAttributes.getVisitedTypeParameters();
        if (visitedTypeParameters == null || !visitedTypeParameters.contains(typeParameterDescriptor.getOriginal())) {
            kotlin.reflect.jvm.internal.impl.types.SimpleType defaultType = typeParameterDescriptor.getDefaultType();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(defaultType, "");
            java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> extractTypeParametersFromUpperBounds = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.extractTypeParametersFromUpperBounds(defaultType, visitedTypeParameters);
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(extractTypeParametersFromUpperBounds, 10)), 16));
            for (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor2 : extractTypeParametersFromUpperBounds) {
                if (visitedTypeParameters == null || !visitedTypeParameters.contains(typeParameterDescriptor2)) {
                    computeProjection = typeParameterUpperBoundEraser.getHighSpeedVideoSizes.computeProjection(typeParameterDescriptor2, erasureTypeAttributes, typeParameterUpperBoundEraser, typeParameterUpperBoundEraser.getErasedUpperBound(typeParameterDescriptor2, erasureTypeAttributes.withNewVisitedTypeParameter(typeParameterDescriptor)));
                } else {
                    computeProjection = kotlin.reflect.jvm.internal.impl.types.TypeUtils.makeStarProjection(typeParameterDescriptor2, erasureTypeAttributes);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(computeProjection, "");
                }
                kotlin.Pair pair = kotlin.TuplesKt.to(typeParameterDescriptor2.getTypeConstructor(), computeProjection);
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
            kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor create = kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.create(kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution.Companion.createByConstructorsMap$default(kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution.Companion, linkedHashMap, false, 2, null));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create, "");
            java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> upperBounds = typeParameterDescriptor.getUpperBounds();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperBounds, "");
            java.util.Set<kotlin.reflect.jvm.internal.impl.types.KotlinType> highSpeedVideoFpsRangesFor = typeParameterUpperBoundEraser.getHighSpeedVideoFpsRangesFor(create, upperBounds, erasureTypeAttributes);
            if (!highSpeedVideoFpsRangesFor.isEmpty()) {
                if (!typeParameterUpperBoundEraser.getHighSpeedVideoFpsRanges.getIntersectUpperBounds()) {
                    if (highSpeedVideoFpsRangesFor.size() != 1) {
                        throw new java.lang.IllegalArgumentException("Should only be one computed upper bound if no need to intersect all bounds".toString());
                    }
                    return (kotlin.reflect.jvm.internal.impl.types.KotlinType) kotlin.collections.CollectionsKt.single(highSpeedVideoFpsRangesFor);
                }
                java.util.List list = kotlin.collections.CollectionsKt.toList(highSpeedVideoFpsRangesFor);
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((kotlin.reflect.jvm.internal.impl.types.KotlinType) it.next()).unwrap());
                }
                return kotlin.reflect.jvm.internal.impl.types.checker.IntersectionTypeKt.intersectTypes(arrayList);
            }
        }
        return typeParameterUpperBoundEraser.getHighSpeedVideoSizes(erasureTypeAttributes);
    }
}
