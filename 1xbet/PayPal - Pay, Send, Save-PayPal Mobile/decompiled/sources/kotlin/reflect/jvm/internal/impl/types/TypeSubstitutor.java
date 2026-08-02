package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
public class TypeSubstitutor implements kotlin.reflect.jvm.internal.impl.types.model.TypeSubstitutorMarker {
    public static final kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor EMPTY = create(kotlin.reflect.jvm.internal.impl.types.TypeSubstitution.EMPTY);
    private final kotlin.reflect.jvm.internal.impl.types.TypeSubstitution getHighResolutionOutputSizeshNQ4ISI;

    enum VarianceConflictType {
        NO_CONFLICT,
        IN_IN_OUT_POSITION,
        OUT_IN_IN_POSITION
    }

    static final class SubstitutionException extends java.lang.Exception {
        public SubstitutionException(java.lang.String str) {
            super(str);
        }
    }

    public static kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor create(kotlin.reflect.jvm.internal.impl.types.TypeSubstitution typeSubstitution) {
        if (typeSubstitution == null) {
            getHighSpeedVideoSizes(0);
        }
        return new kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor(typeSubstitution);
    }

    public kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor replaceWithNonApproximatingSubstitution() {
        kotlin.reflect.jvm.internal.impl.types.TypeSubstitution typeSubstitution = this.getHighResolutionOutputSizeshNQ4ISI;
        return ((typeSubstitution instanceof kotlin.reflect.jvm.internal.impl.types.IndexedParametersSubstitution) && typeSubstitution.approximateContravariantCapturedTypes()) ? new kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor(new kotlin.reflect.jvm.internal.impl.types.IndexedParametersSubstitution(((kotlin.reflect.jvm.internal.impl.types.IndexedParametersSubstitution) this.getHighResolutionOutputSizeshNQ4ISI).getParameters(), ((kotlin.reflect.jvm.internal.impl.types.IndexedParametersSubstitution) this.getHighResolutionOutputSizeshNQ4ISI).getArguments(), false)) : this;
    }

    public static kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor createChainedSubstitutor(kotlin.reflect.jvm.internal.impl.types.TypeSubstitution typeSubstitution, kotlin.reflect.jvm.internal.impl.types.TypeSubstitution typeSubstitution2) {
        if (typeSubstitution == null) {
            getHighSpeedVideoSizes(3);
        }
        if (typeSubstitution2 == null) {
            getHighSpeedVideoSizes(4);
        }
        return create(kotlin.reflect.jvm.internal.impl.types.DisjointKeysUnionTypeSubstitution.create(typeSubstitution, typeSubstitution2));
    }

    public static kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor create(java.util.Map<kotlin.reflect.jvm.internal.impl.types.TypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeProjection> map) {
        if (map == null) {
            getHighSpeedVideoSizes(5);
        }
        return create(kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution.createByConstructorsMap(map));
    }

    public static kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor create(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            getHighSpeedVideoSizes(6);
        }
        return create(kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution.create(kotlinType.getConstructor(), kotlinType.getArguments()));
    }

    protected TypeSubstitutor(kotlin.reflect.jvm.internal.impl.types.TypeSubstitution typeSubstitution) {
        if (typeSubstitution == null) {
            getHighSpeedVideoSizes(7);
        }
        this.getHighResolutionOutputSizeshNQ4ISI = typeSubstitution;
    }

    public boolean isEmpty() {
        return this.getHighResolutionOutputSizeshNQ4ISI.isEmpty();
    }

    public kotlin.reflect.jvm.internal.impl.types.TypeSubstitution getSubstitution() {
        kotlin.reflect.jvm.internal.impl.types.TypeSubstitution typeSubstitution = this.getHighResolutionOutputSizeshNQ4ISI;
        if (typeSubstitution == null) {
            getHighSpeedVideoSizes(8);
        }
        return typeSubstitution;
    }

    public kotlin.reflect.jvm.internal.impl.types.KotlinType safeSubstitute(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.types.Variance variance) {
        if (kotlinType == null) {
            getHighSpeedVideoSizes(9);
        }
        if (variance == null) {
            getHighSpeedVideoSizes(10);
        }
        if (isEmpty()) {
            if (kotlinType == null) {
                getHighSpeedVideoSizes(11);
            }
            return kotlinType;
        }
        try {
            kotlin.reflect.jvm.internal.impl.types.KotlinType type = Camera2StreamConfigurationMap(new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(variance, kotlinType), null, 0).getType();
            if (type == null) {
                getHighSpeedVideoSizes(12);
            }
            return type;
        } catch (kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.SubstitutionException e) {
            kotlin.reflect.jvm.internal.impl.types.error.ErrorType createErrorType = kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils.createErrorType(kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind.UNABLE_TO_SUBSTITUTE_TYPE, e.getMessage());
            if (createErrorType == null) {
                getHighSpeedVideoSizes(13);
            }
            return createErrorType;
        }
    }

    public kotlin.reflect.jvm.internal.impl.types.KotlinType substitute(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.types.Variance variance) {
        if (kotlinType == null) {
            getHighSpeedVideoSizes(14);
        }
        if (variance == null) {
            getHighSpeedVideoSizes(15);
        }
        kotlin.reflect.jvm.internal.impl.types.TypeProjection substitute = substitute(new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(variance, getSubstitution().prepareTopLevelType(kotlinType, variance)));
        if (substitute == null) {
            return null;
        }
        return substitute.getType();
    }

    public kotlin.reflect.jvm.internal.impl.types.TypeProjection substitute(kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection) {
        if (typeProjection == null) {
            getHighSpeedVideoSizes(16);
        }
        kotlin.reflect.jvm.internal.impl.types.TypeProjection substituteWithoutApproximation = substituteWithoutApproximation(typeProjection);
        return (this.getHighResolutionOutputSizeshNQ4ISI.approximateCapturedTypes() || this.getHighResolutionOutputSizeshNQ4ISI.approximateContravariantCapturedTypes()) ? kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt.approximateCapturedTypesIfNecessary(substituteWithoutApproximation, this.getHighResolutionOutputSizeshNQ4ISI.approximateContravariantCapturedTypes()) : substituteWithoutApproximation;
    }

    public kotlin.reflect.jvm.internal.impl.types.TypeProjection substituteWithoutApproximation(kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection) {
        if (typeProjection == null) {
            getHighSpeedVideoSizes(17);
        }
        if (isEmpty()) {
            return typeProjection;
        }
        try {
            return Camera2StreamConfigurationMap(typeProjection, null, 0);
        } catch (kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.SubstitutionException unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private kotlin.reflect.jvm.internal.impl.types.TypeProjection Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection, kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor, int i) throws kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.SubstitutionException {
        kotlin.reflect.jvm.internal.impl.types.KotlinType makeNullableIfNeeded;
        if (typeProjection == null) {
            getHighSpeedVideoSizes(18);
        }
        getHighSpeedVideoFpsRangesFor(i, typeProjection, this.getHighResolutionOutputSizeshNQ4ISI);
        if (!typeProjection.isStarProjection()) {
            kotlin.reflect.jvm.internal.impl.types.KotlinType type = typeProjection.getType();
            if (type instanceof kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancement) {
                kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancement typeWithEnhancement = (kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancement) type;
                kotlin.reflect.jvm.internal.impl.types.UnwrappedType origin = typeWithEnhancement.getOrigin();
                kotlin.reflect.jvm.internal.impl.types.KotlinType enhancement = typeWithEnhancement.getEnhancement();
                kotlin.reflect.jvm.internal.impl.types.TypeProjection Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(typeProjection.getProjectionKind(), origin), typeParameterDescriptor, i + 1);
                if (!Camera2StreamConfigurationMap.isStarProjection()) {
                    return new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(Camera2StreamConfigurationMap.getProjectionKind(), kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt.wrapEnhancement(Camera2StreamConfigurationMap.getType().unwrap(), substitute(enhancement, typeProjection.getProjectionKind())));
                }
                if (Camera2StreamConfigurationMap == null) {
                    getHighSpeedVideoSizes(20);
                }
                return Camera2StreamConfigurationMap;
            }
            if (!kotlin.reflect.jvm.internal.impl.types.DynamicTypesKt.isDynamic(type) && !(type.unwrap() instanceof kotlin.reflect.jvm.internal.impl.types.RawType)) {
                kotlin.reflect.jvm.internal.impl.types.TypeProjection mo23902get = this.getHighResolutionOutputSizeshNQ4ISI.mo23902get(type);
                kotlin.reflect.jvm.internal.impl.types.TypeProjection highResolutionOutputSizeshNQ4ISI = mo23902get != null ? getHighResolutionOutputSizeshNQ4ISI(type, mo23902get, typeParameterDescriptor, typeProjection) : null;
                kotlin.reflect.jvm.internal.impl.types.Variance projectionKind = typeProjection.getProjectionKind();
                if (highResolutionOutputSizeshNQ4ISI == null && kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt.isFlexible(type) && !kotlin.reflect.jvm.internal.impl.types.TypeCapabilitiesKt.isCustomTypeParameter(type)) {
                    kotlin.reflect.jvm.internal.impl.types.FlexibleType asFlexibleType = kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt.asFlexibleType(type);
                    int i2 = i + 1;
                    kotlin.reflect.jvm.internal.impl.types.TypeProjection Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(projectionKind, asFlexibleType.getLowerBound()), typeParameterDescriptor, i2);
                    kotlin.reflect.jvm.internal.impl.types.TypeProjection Camera2StreamConfigurationMap3 = Camera2StreamConfigurationMap(new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(projectionKind, asFlexibleType.getUpperBound()), typeParameterDescriptor, i2);
                    kotlin.reflect.jvm.internal.impl.types.Variance projectionKind2 = Camera2StreamConfigurationMap2.getProjectionKind();
                    if (Camera2StreamConfigurationMap2.getType() != asFlexibleType.getLowerBound() || Camera2StreamConfigurationMap3.getType() != asFlexibleType.getUpperBound()) {
                        return new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(projectionKind2, kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.flexibleType(kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt.asSimpleType(Camera2StreamConfigurationMap2.getType()), kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt.asSimpleType(Camera2StreamConfigurationMap3.getType())));
                    }
                    if (typeProjection == null) {
                        getHighSpeedVideoSizes(22);
                        return typeProjection;
                    }
                } else {
                    if (!kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isNothing(type) && !kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt.isError(type)) {
                        if (highResolutionOutputSizeshNQ4ISI != null) {
                            kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.VarianceConflictType highSpeedVideoSizes = getHighSpeedVideoSizes(projectionKind, highResolutionOutputSizeshNQ4ISI.getProjectionKind());
                            if (!kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt.isCaptured(type)) {
                                int i3 = kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.AnonymousClass2.getHighSpeedVideoSizes[highSpeedVideoSizes.ordinal()];
                                if (i3 == 1) {
                                    throw new kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.SubstitutionException("Out-projection in in-position");
                                }
                                if (i3 == 2) {
                                    return new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE, type.getConstructor().getBuiltIns().getNullableAnyType());
                                }
                            }
                            kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter customTypeParameter = kotlin.reflect.jvm.internal.impl.types.TypeCapabilitiesKt.getCustomTypeParameter(type);
                            if (highResolutionOutputSizeshNQ4ISI.isStarProjection()) {
                                if (highResolutionOutputSizeshNQ4ISI == null) {
                                    getHighSpeedVideoSizes(24);
                                }
                                return highResolutionOutputSizeshNQ4ISI;
                            }
                            if (customTypeParameter != null) {
                                makeNullableIfNeeded = customTypeParameter.substitutionResult(highResolutionOutputSizeshNQ4ISI.getType());
                            } else {
                                makeNullableIfNeeded = kotlin.reflect.jvm.internal.impl.types.TypeUtils.makeNullableIfNeeded(highResolutionOutputSizeshNQ4ISI.getType(), type.isMarkedNullable());
                            }
                            if (!type.getAnnotations().isEmpty()) {
                                makeNullableIfNeeded = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.replaceAnnotations(makeNullableIfNeeded, new kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations(makeNullableIfNeeded.getAnnotations(), getHighSpeedVideoSizes(this.getHighResolutionOutputSizeshNQ4ISI.filterAnnotations(type.getAnnotations()))));
                            }
                            if (highSpeedVideoSizes == kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.VarianceConflictType.NO_CONFLICT) {
                                projectionKind = combine(projectionKind, highResolutionOutputSizeshNQ4ISI.getProjectionKind());
                            }
                            return new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(projectionKind, makeNullableIfNeeded);
                        }
                        kotlin.reflect.jvm.internal.impl.types.TypeProjection highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(typeProjection, i);
                        if (highSpeedVideoFpsRangesFor == null) {
                            getHighSpeedVideoSizes(25);
                        }
                        return highSpeedVideoFpsRangesFor;
                    }
                    if (typeProjection == null) {
                        getHighSpeedVideoSizes(23);
                        return typeProjection;
                    }
                }
            } else if (typeProjection == null) {
                getHighSpeedVideoSizes(21);
            }
        } else if (typeProjection == null) {
            getHighSpeedVideoSizes(19);
            return typeProjection;
        }
        return typeProjection;
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] getHighSpeedVideoSizes;

        static {
            int[] iArr = new int[kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.VarianceConflictType.values().length];
            getHighSpeedVideoSizes = iArr;
            try {
                iArr[kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.VarianceConflictType.OUT_IN_IN_POSITION.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoSizes[kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.VarianceConflictType.IN_IN_OUT_POSITION.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoSizes[kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.VarianceConflictType.NO_CONFLICT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    private static kotlin.reflect.jvm.internal.impl.types.TypeProjection getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection, kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor, kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection2) {
        if (kotlinType == null) {
            getHighSpeedVideoSizes(26);
        }
        if (typeProjection == null) {
            getHighSpeedVideoSizes(27);
        }
        if (typeProjection2 == null) {
            getHighSpeedVideoSizes(28);
        }
        if (kotlinType.getAnnotations().hasAnnotation(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.unsafeVariance)) {
            kotlin.reflect.jvm.internal.impl.types.TypeConstructor constructor = typeProjection.getType().getConstructor();
            if (constructor instanceof kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor) {
                kotlin.reflect.jvm.internal.impl.types.TypeProjection projection = ((kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor) constructor).getProjection();
                kotlin.reflect.jvm.internal.impl.types.Variance projectionKind = projection.getProjectionKind();
                if (getHighSpeedVideoSizes(typeProjection2.getProjectionKind(), projectionKind) == kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.VarianceConflictType.OUT_IN_IN_POSITION) {
                    return new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(projection.getType());
                }
                if (typeParameterDescriptor == null) {
                    if (typeProjection == null) {
                        getHighSpeedVideoSizes(31);
                        return typeProjection;
                    }
                } else {
                    if (getHighSpeedVideoSizes(typeParameterDescriptor.getVariance(), projectionKind) == kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.VarianceConflictType.OUT_IN_IN_POSITION) {
                        return new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(projection.getType());
                    }
                    if (typeProjection == null) {
                        getHighSpeedVideoSizes(32);
                    }
                }
            } else if (typeProjection == null) {
                getHighSpeedVideoSizes(30);
                return typeProjection;
            }
        } else if (typeProjection == null) {
            getHighSpeedVideoSizes(29);
            return typeProjection;
        }
        return typeProjection;
    }

    private static kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations) {
        if (annotations == null) {
            getHighSpeedVideoSizes(33);
        }
        if (annotations.hasAnnotation(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.unsafeVariance)) {
            return new kotlin.reflect.jvm.internal.impl.descriptors.annotations.FilteredAnnotations(annotations, new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.name.FqName, java.lang.Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.1
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ java.lang.Boolean invoke(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
                    if (fqName != null) {
                        return java.lang.Boolean.valueOf(!r3.equals(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.unsafeVariance));
                    }
                    throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "name", "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1", "invoke"));
                }
            });
        }
        if (annotations == null) {
            getHighSpeedVideoSizes(34);
        }
        return annotations;
    }

    private kotlin.reflect.jvm.internal.impl.types.TypeProjection getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection, int i) throws kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.SubstitutionException {
        kotlin.reflect.jvm.internal.impl.types.KotlinType type = typeProjection.getType();
        kotlin.reflect.jvm.internal.impl.types.Variance projectionKind = typeProjection.getProjectionKind();
        if (type.getConstructor().mo23898getDeclarationDescriptor() instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) {
            return typeProjection;
        }
        kotlin.reflect.jvm.internal.impl.types.SimpleType abbreviation = kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt.getAbbreviation(type);
        kotlin.reflect.jvm.internal.impl.types.KotlinType substitute = abbreviation != null ? replaceWithNonApproximatingSubstitution().substitute(abbreviation, kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT) : null;
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> parameters = type.getConstructor().getParameters();
        java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> arguments = type.getArguments();
        java.util.ArrayList arrayList = new java.util.ArrayList(parameters.size());
        boolean z = false;
        for (int i2 = 0; i2 < parameters.size(); i2++) {
            kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor = parameters.get(i2);
            kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection2 = arguments.get(i2);
            kotlin.reflect.jvm.internal.impl.types.TypeProjection Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(typeProjection2, typeParameterDescriptor, i + 1);
            int i3 = kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.AnonymousClass2.getHighSpeedVideoSizes[getHighSpeedVideoSizes(typeParameterDescriptor.getVariance(), Camera2StreamConfigurationMap.getProjectionKind()).ordinal()];
            if (i3 != 1 && i3 != 2) {
                if (i3 == 3 && typeParameterDescriptor.getVariance() != kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT && !Camera2StreamConfigurationMap.isStarProjection()) {
                    Camera2StreamConfigurationMap = new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT, Camera2StreamConfigurationMap.getType());
                }
            } else {
                Camera2StreamConfigurationMap = kotlin.reflect.jvm.internal.impl.types.TypeUtils.makeStarProjection(typeParameterDescriptor);
            }
            if (Camera2StreamConfigurationMap != typeProjection2) {
                z = true;
            }
            arrayList.add(Camera2StreamConfigurationMap);
        }
        if (z) {
            arguments = arrayList;
        }
        kotlin.reflect.jvm.internal.impl.types.KotlinType replace = kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt.replace(type, arguments, this.getHighResolutionOutputSizeshNQ4ISI.filterAnnotations(type.getAnnotations()));
        if ((replace instanceof kotlin.reflect.jvm.internal.impl.types.SimpleType) && (substitute instanceof kotlin.reflect.jvm.internal.impl.types.SimpleType)) {
            replace = kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt.withAbbreviation((kotlin.reflect.jvm.internal.impl.types.SimpleType) replace, (kotlin.reflect.jvm.internal.impl.types.SimpleType) substitute);
        }
        return new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(projectionKind, replace);
    }

    public static kotlin.reflect.jvm.internal.impl.types.Variance combine(kotlin.reflect.jvm.internal.impl.types.Variance variance, kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection) {
        if (variance == null) {
            getHighSpeedVideoSizes(35);
        }
        if (typeProjection == null) {
            getHighSpeedVideoSizes(36);
        }
        if (!typeProjection.isStarProjection()) {
            return combine(variance, typeProjection.getProjectionKind());
        }
        kotlin.reflect.jvm.internal.impl.types.Variance variance2 = kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE;
        if (variance2 == null) {
            getHighSpeedVideoSizes(37);
        }
        return variance2;
    }

    public static kotlin.reflect.jvm.internal.impl.types.Variance combine(kotlin.reflect.jvm.internal.impl.types.Variance variance, kotlin.reflect.jvm.internal.impl.types.Variance variance2) {
        if (variance == null) {
            getHighSpeedVideoSizes(38);
        }
        if (variance2 == null) {
            getHighSpeedVideoSizes(39);
        }
        if (variance == kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT) {
            if (variance2 == null) {
                getHighSpeedVideoSizes(40);
                return variance2;
            }
        } else {
            if (variance2 == kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT) {
                if (variance == null) {
                    getHighSpeedVideoSizes(41);
                }
                return variance;
            }
            if (variance != variance2) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Variance conflict: type parameter variance '");
                sb.append(variance);
                sb.append("' and projection kind '");
                sb.append(variance2);
                sb.append("' cannot be combined");
                throw new java.lang.AssertionError(sb.toString());
            }
            if (variance2 == null) {
                getHighSpeedVideoSizes(42);
            }
        }
        return variance2;
    }

    private static kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.VarianceConflictType getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.types.Variance variance, kotlin.reflect.jvm.internal.impl.types.Variance variance2) {
        if (variance == kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE && variance2 == kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE) {
            return kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.VarianceConflictType.OUT_IN_IN_POSITION;
        }
        if (variance == kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE && variance2 == kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE) {
            return kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.VarianceConflictType.IN_IN_OUT_POSITION;
        }
        return kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.VarianceConflictType.NO_CONFLICT;
    }

    private static void getHighSpeedVideoFpsRangesFor(int i, kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection, kotlin.reflect.jvm.internal.impl.types.TypeSubstitution typeSubstitution) {
        if (i <= 100) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Recursion too deep. Most likely infinite loop while substituting ");
        sb.append(getHighResolutionOutputSizeshNQ4ISI(typeProjection));
        sb.append("; substitution: ");
        sb.append(getHighResolutionOutputSizeshNQ4ISI(typeSubstitution));
        throw new java.lang.IllegalStateException(sb.toString());
    }

    private static java.lang.String getHighResolutionOutputSizeshNQ4ISI(java.lang.Object obj) {
        try {
            return obj.toString();
        } catch (java.lang.Throwable th) {
            if (kotlin.reflect.jvm.internal.impl.utils.ExceptionUtilsKt.isProcessCanceledException(th)) {
                throw th;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("[Exception while computing toString(): ");
            sb.append(th);
            sb.append("]");
            return sb.toString();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x003b A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0021 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ void getHighSpeedVideoSizes(int i) {
        java.lang.String str;
        int i2;
        if (i != 1 && i != 2 && i != 8 && i != 34 && i != 37) {
            switch (i) {
                default:
                    switch (i) {
                        default:
                            switch (i) {
                                default:
                                    switch (i) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            break;
                    }
                case 11:
                case 12:
                case 13:
                    break;
            }
            if (i != 1 && i != 2 && i != 8 && i != 34 && i != 37) {
                switch (i) {
                    default:
                        switch (i) {
                            default:
                                switch (i) {
                                    default:
                                        switch (i) {
                                            case 40:
                                            case 41:
                                            case 42:
                                                break;
                                            default:
                                                i2 = 3;
                                                break;
                                        }
                                    case 29:
                                    case 30:
                                    case 31:
                                    case 32:
                                        i2 = 2;
                                        break;
                                }
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                                break;
                        }
                    case 11:
                    case 12:
                    case 13:
                        break;
                }
                java.lang.Object[] objArr = new java.lang.Object[i2];
                switch (i) {
                    case 1:
                    case 2:
                    case 8:
                    case 11:
                    case 12:
                    case 13:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 34:
                    case 37:
                    case 40:
                    case 41:
                    case 42:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                        break;
                    case 3:
                        objArr[0] = "first";
                        break;
                    case 4:
                        objArr[0] = "second";
                        break;
                    case 5:
                        objArr[0] = "substitutionContext";
                        break;
                    case 6:
                        objArr[0] = "context";
                        break;
                    case 7:
                    default:
                        objArr[0] = "substitution";
                        break;
                    case 9:
                    case 14:
                        objArr[0] = "type";
                        break;
                    case 10:
                    case 15:
                        objArr[0] = "howThisTypeIsUsed";
                        break;
                    case 16:
                    case 17:
                    case 36:
                        objArr[0] = "typeProjection";
                        break;
                    case 18:
                    case 28:
                        objArr[0] = "originalProjection";
                        break;
                    case 26:
                        objArr[0] = "originalType";
                        break;
                    case 27:
                        objArr[0] = "substituted";
                        break;
                    case 33:
                        objArr[0] = "annotations";
                        break;
                    case 35:
                    case 38:
                        objArr[0] = "typeParameterVariance";
                        break;
                    case 39:
                        objArr[0] = "projectionKind";
                        break;
                }
                if (i != 1) {
                    objArr[1] = "replaceWithNonApproximatingSubstitution";
                } else if (i == 2) {
                    objArr[1] = "replaceWithContravariantApproximatingSubstitution";
                } else if (i == 8) {
                    objArr[1] = "getSubstitution";
                } else if (i != 34) {
                    if (i != 37) {
                        switch (i) {
                            case 11:
                            case 12:
                            case 13:
                                objArr[1] = "safeSubstitute";
                                break;
                            default:
                                switch (i) {
                                    case 19:
                                    case 20:
                                    case 21:
                                    case 22:
                                    case 23:
                                    case 24:
                                    case 25:
                                        objArr[1] = "unsafeSubstitute";
                                        break;
                                    default:
                                        switch (i) {
                                            case 29:
                                            case 30:
                                            case 31:
                                            case 32:
                                                objArr[1] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                                                break;
                                            default:
                                                switch (i) {
                                                    case 40:
                                                    case 41:
                                                    case 42:
                                                        break;
                                                    default:
                                                        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                                                        break;
                                                }
                                        }
                                }
                        }
                    }
                    objArr[1] = "combine";
                } else {
                    objArr[1] = "filterOutUnsafeVariance";
                }
                switch (i) {
                    case 1:
                    case 2:
                    case 8:
                    case 11:
                    case 12:
                    case 13:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 34:
                    case 37:
                    case 40:
                    case 41:
                    case 42:
                        break;
                    case 3:
                    case 4:
                        objArr[2] = "createChainedSubstitutor";
                        break;
                    case 5:
                    case 6:
                    default:
                        objArr[2] = "create";
                        break;
                    case 7:
                        objArr[2] = "<init>";
                        break;
                    case 9:
                    case 10:
                        objArr[2] = "safeSubstitute";
                        break;
                    case 14:
                    case 15:
                    case 16:
                        objArr[2] = "substitute";
                        break;
                    case 17:
                        objArr[2] = "substituteWithoutApproximation";
                        break;
                    case 18:
                        objArr[2] = "unsafeSubstitute";
                        break;
                    case 26:
                    case 27:
                    case 28:
                        objArr[2] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                        break;
                    case 33:
                        objArr[2] = "filterOutUnsafeVariance";
                        break;
                    case 35:
                    case 36:
                    case 38:
                    case 39:
                        objArr[2] = "combine";
                        break;
                }
                java.lang.String format = java.lang.String.format(str, objArr);
                if (i != 1 && i != 2 && i != 8 && i != 34 && i != 37) {
                    switch (i) {
                        case 11:
                        case 12:
                        case 13:
                            break;
                        default:
                            switch (i) {
                                case 19:
                                case 20:
                                case 21:
                                case 22:
                                case 23:
                                case 24:
                                case 25:
                                    break;
                                default:
                                    switch (i) {
                                        case 29:
                                        case 30:
                                        case 31:
                                        case 32:
                                            break;
                                        default:
                                            switch (i) {
                                                case 40:
                                                case 41:
                                                case 42:
                                                    break;
                                                default:
                                                    throw new java.lang.IllegalArgumentException(format);
                                            }
                                    }
                            }
                    }
                }
                throw new java.lang.IllegalStateException(format);
            }
            i2 = 2;
            java.lang.Object[] objArr2 = new java.lang.Object[i2];
            switch (i) {
            }
            if (i != 1) {
            }
            switch (i) {
            }
            java.lang.String format2 = java.lang.String.format(str, objArr2);
            if (i != 1) {
                switch (i) {
                }
            }
            throw new java.lang.IllegalStateException(format2);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i != 1) {
            switch (i) {
            }
            java.lang.Object[] objArr22 = new java.lang.Object[i2];
            switch (i) {
            }
            if (i != 1) {
            }
            switch (i) {
            }
            java.lang.String format22 = java.lang.String.format(str, objArr22);
            if (i != 1) {
            }
            throw new java.lang.IllegalStateException(format22);
        }
        i2 = 2;
        java.lang.Object[] objArr222 = new java.lang.Object[i2];
        switch (i) {
        }
        if (i != 1) {
        }
        switch (i) {
        }
        java.lang.String format222 = java.lang.String.format(str, objArr222);
        if (i != 1) {
        }
        throw new java.lang.IllegalStateException(format222);
    }
}
