package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
public final class TypeAliasExpander {
    public static final kotlin.reflect.jvm.internal.impl.types.TypeAliasExpander.Companion Companion = new kotlin.reflect.jvm.internal.impl.types.TypeAliasExpander.Companion(null);
    private static final kotlin.reflect.jvm.internal.impl.types.TypeAliasExpander getHighResolutionOutputSizeshNQ4ISI = new kotlin.reflect.jvm.internal.impl.types.TypeAliasExpander(kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansionReportStrategy.DO_NOTHING.INSTANCE, false);
    private final boolean getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansionReportStrategy getHighSpeedVideoSizes;

    public TypeAliasExpander(kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansionReportStrategy typeAliasExpansionReportStrategy, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeAliasExpansionReportStrategy, "");
        this.getHighSpeedVideoSizes = typeAliasExpansionReportStrategy;
        this.getHighSpeedVideoFpsRanges = z;
    }

    public final kotlin.reflect.jvm.internal.impl.types.SimpleType expand(kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansion typeAliasExpansion, kotlin.reflect.jvm.internal.impl.types.TypeAttributes typeAttributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeAliasExpansion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeAttributes, "");
        return Camera2StreamConfigurationMap(typeAliasExpansion, typeAttributes, false, 0, true);
    }

    private final kotlin.reflect.jvm.internal.impl.types.SimpleType Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansion typeAliasExpansion, kotlin.reflect.jvm.internal.impl.types.TypeAttributes typeAttributes, boolean z, int i, boolean z2) {
        kotlin.reflect.jvm.internal.impl.types.TypeProjection highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT, typeAliasExpansion.getDescriptor().getUnderlyingType()), typeAliasExpansion, null, i);
        kotlin.reflect.jvm.internal.impl.types.KotlinType type = highSpeedVideoFpsRangesFor.getType();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "");
        kotlin.reflect.jvm.internal.impl.types.SimpleType asSimpleType = kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt.asSimpleType(type);
        if (kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt.isError(asSimpleType)) {
            return asSimpleType;
        }
        highSpeedVideoFpsRangesFor.getProjectionKind();
        kotlin.reflect.jvm.internal.impl.types.Variance variance = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT;
        getHighResolutionOutputSizeshNQ4ISI(asSimpleType.getAnnotations(), kotlin.reflect.jvm.internal.impl.types.AnnotationsTypeAttributeKt.getAnnotations(typeAttributes));
        kotlin.reflect.jvm.internal.impl.types.SimpleType makeNullableIfNeeded = kotlin.reflect.jvm.internal.impl.types.TypeUtils.makeNullableIfNeeded(Camera2StreamConfigurationMap(asSimpleType, typeAttributes), z);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(makeNullableIfNeeded, "");
        return z2 ? kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt.withAbbreviation(makeNullableIfNeeded, getHighSpeedVideoFpsRangesFor(typeAliasExpansion, typeAttributes, z)) : makeNullableIfNeeded;
    }

    private static kotlin.reflect.jvm.internal.impl.types.SimpleType getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansion typeAliasExpansion, kotlin.reflect.jvm.internal.impl.types.TypeAttributes typeAttributes, boolean z) {
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor = typeAliasExpansion.getDescriptor().getTypeConstructor();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeConstructor, "");
        return kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(typeAttributes, typeConstructor, typeAliasExpansion.getArguments(), z, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty.INSTANCE);
    }

    private final kotlin.reflect.jvm.internal.impl.types.TypeProjection getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection, kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansion typeAliasExpansion, kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor, int i) {
        kotlin.reflect.jvm.internal.impl.types.Variance variance;
        kotlin.reflect.jvm.internal.impl.types.SimpleType Camera2StreamConfigurationMap;
        kotlin.reflect.jvm.internal.impl.types.TypeAliasExpander.Companion.access$assertRecursionDepth(Companion, i, typeAliasExpansion.getDescriptor());
        if (typeProjection.isStarProjection()) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(typeParameterDescriptor);
            kotlin.reflect.jvm.internal.impl.types.TypeProjection makeStarProjection = kotlin.reflect.jvm.internal.impl.types.TypeUtils.makeStarProjection(typeParameterDescriptor);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(makeStarProjection, "");
            return makeStarProjection;
        }
        kotlin.reflect.jvm.internal.impl.types.KotlinType type = typeProjection.getType();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "");
        kotlin.reflect.jvm.internal.impl.types.TypeProjection replacement = typeAliasExpansion.getReplacement(type.getConstructor());
        if (replacement == null) {
            return getHighResolutionOutputSizeshNQ4ISI(typeProjection, typeAliasExpansion, i);
        }
        if (replacement.isStarProjection()) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(typeParameterDescriptor);
            kotlin.reflect.jvm.internal.impl.types.TypeProjection makeStarProjection2 = kotlin.reflect.jvm.internal.impl.types.TypeUtils.makeStarProjection(typeParameterDescriptor);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(makeStarProjection2, "");
            return makeStarProjection2;
        }
        kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrap = replacement.getType().unwrap();
        kotlin.reflect.jvm.internal.impl.types.Variance projectionKind = replacement.getProjectionKind();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(projectionKind, "");
        kotlin.reflect.jvm.internal.impl.types.Variance projectionKind2 = typeProjection.getProjectionKind();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(projectionKind2, "");
        if (projectionKind2 != projectionKind && projectionKind2 != kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT) {
            if (projectionKind != kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT) {
                this.getHighSpeedVideoSizes.conflictingProjection(typeAliasExpansion.getDescriptor(), typeParameterDescriptor, unwrap);
            } else {
                projectionKind = projectionKind2;
            }
        }
        if (typeParameterDescriptor == null || (variance = typeParameterDescriptor.getVariance()) == null) {
            variance = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT;
        }
        if (variance != projectionKind && variance != kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT) {
            if (projectionKind == kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT) {
                projectionKind = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT;
            } else {
                this.getHighSpeedVideoSizes.conflictingProjection(typeAliasExpansion.getDescriptor(), typeParameterDescriptor, unwrap);
            }
        }
        getHighResolutionOutputSizeshNQ4ISI(type.getAnnotations(), unwrap.getAnnotations());
        if (unwrap instanceof kotlin.reflect.jvm.internal.impl.types.DynamicType) {
            Camera2StreamConfigurationMap = getHighSpeedVideoFpsRangesFor((kotlin.reflect.jvm.internal.impl.types.DynamicType) unwrap, type.getAttributes());
        } else {
            kotlin.reflect.jvm.internal.impl.types.SimpleType makeNullableIfNeeded = kotlin.reflect.jvm.internal.impl.types.TypeUtils.makeNullableIfNeeded(kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt.asSimpleType(unwrap), type.isMarkedNullable());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(makeNullableIfNeeded, "");
            Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(makeNullableIfNeeded, type.getAttributes());
        }
        return new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(projectionKind, Camera2StreamConfigurationMap);
    }

    private static kotlin.reflect.jvm.internal.impl.types.DynamicType getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.types.DynamicType dynamicType, kotlin.reflect.jvm.internal.impl.types.TypeAttributes typeAttributes) {
        kotlin.reflect.jvm.internal.impl.types.DynamicType dynamicType2 = dynamicType;
        return dynamicType.replaceAttributes(kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt.isError(dynamicType2) ? dynamicType2.getAttributes() : typeAttributes.add(dynamicType2.getAttributes()));
    }

    private static kotlin.reflect.jvm.internal.impl.types.SimpleType Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType, kotlin.reflect.jvm.internal.impl.types.TypeAttributes typeAttributes) {
        kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType2 = simpleType;
        if (kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt.isError(simpleType2)) {
            return simpleType;
        }
        return kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt.replace$default(simpleType, null, kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt.isError(simpleType2) ? simpleType2.getAttributes() : typeAttributes.add(simpleType2.getAttributes()), 1, null);
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations2) {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor> it = annotations.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().getFqName());
        }
        java.util.HashSet hashSet2 = hashSet;
        for (kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor annotationDescriptor : annotations2) {
            if (hashSet2.contains(annotationDescriptor.getFqName())) {
                this.getHighSpeedVideoSizes.repeatedAnnotation(annotationDescriptor);
            }
        }
    }

    private final kotlin.reflect.jvm.internal.impl.types.TypeProjection getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection, kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansion typeAliasExpansion, int i) {
        kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrap = typeProjection.getType().unwrap();
        if (!kotlin.reflect.jvm.internal.impl.types.DynamicTypesKt.isDynamic(unwrap)) {
            kotlin.reflect.jvm.internal.impl.types.SimpleType asSimpleType = kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt.asSimpleType(unwrap);
            kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType = asSimpleType;
            if (!kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt.isError(simpleType) && kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.requiresTypeAliasExpansion(simpleType)) {
                kotlin.reflect.jvm.internal.impl.types.TypeConstructor constructor = asSimpleType.getConstructor();
                kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = constructor.mo23898getDeclarationDescriptor();
                constructor.getParameters().size();
                asSimpleType.getArguments().size();
                if (!(mo23898getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor)) {
                    int i2 = 0;
                    if (mo23898getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor) {
                        kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor typeAliasDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor) mo23898getDeclarationDescriptor;
                        if (typeAliasExpansion.isRecursion(typeAliasDescriptor)) {
                            this.getHighSpeedVideoSizes.recursiveTypeAlias(typeAliasDescriptor);
                            kotlin.reflect.jvm.internal.impl.types.Variance variance = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT;
                            kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind errorTypeKind = kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind.RECURSIVE_TYPE_ALIAS;
                            java.lang.String obj = typeAliasDescriptor.getName().toString();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
                            return new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(variance, kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils.createErrorType(errorTypeKind, obj));
                        }
                        java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> arguments = asSimpleType.getArguments();
                        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arguments, 10));
                        for (java.lang.Object obj2 : arguments) {
                            if (i2 < 0) {
                                kotlin.collections.CollectionsKt.throwIndexOverflow();
                            }
                            arrayList.add(getHighSpeedVideoFpsRangesFor((kotlin.reflect.jvm.internal.impl.types.TypeProjection) obj2, typeAliasExpansion, constructor.getParameters().get(i2), i + 1));
                            i2++;
                        }
                        kotlin.reflect.jvm.internal.impl.types.SimpleType Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansion.Companion.create(typeAliasExpansion, typeAliasDescriptor, arrayList), asSimpleType.getAttributes(), asSimpleType.isMarkedNullable(), i + 1, false);
                        kotlin.reflect.jvm.internal.impl.types.SimpleType highSpeedVideoSizes = getHighSpeedVideoSizes(asSimpleType, typeAliasExpansion, i);
                        if (!kotlin.reflect.jvm.internal.impl.types.DynamicTypesKt.isDynamic(Camera2StreamConfigurationMap)) {
                            Camera2StreamConfigurationMap = kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt.withAbbreviation(Camera2StreamConfigurationMap, highSpeedVideoSizes);
                        }
                        return new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(typeProjection.getProjectionKind(), Camera2StreamConfigurationMap);
                    }
                    kotlin.reflect.jvm.internal.impl.types.SimpleType highSpeedVideoSizes2 = getHighSpeedVideoSizes(asSimpleType, typeAliasExpansion, i);
                    kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor create = kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.create(highSpeedVideoSizes2);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create, "");
                    for (java.lang.Object obj3 : highSpeedVideoSizes2.getArguments()) {
                        if (i2 < 0) {
                            kotlin.collections.CollectionsKt.throwIndexOverflow();
                        }
                        kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection2 = (kotlin.reflect.jvm.internal.impl.types.TypeProjection) obj3;
                        if (!typeProjection2.isStarProjection()) {
                            kotlin.reflect.jvm.internal.impl.types.KotlinType type = typeProjection2.getType();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "");
                            if (!kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.containsTypeAliasParameters(type)) {
                                kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection3 = simpleType.getArguments().get(i2);
                                kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor = simpleType.getConstructor().getParameters().get(i2);
                                if (this.getHighSpeedVideoFpsRanges) {
                                    kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansionReportStrategy typeAliasExpansionReportStrategy = this.getHighSpeedVideoSizes;
                                    kotlin.reflect.jvm.internal.impl.types.KotlinType type2 = typeProjection3.getType();
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type2, "");
                                    kotlin.reflect.jvm.internal.impl.types.KotlinType type3 = typeProjection2.getType();
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type3, "");
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(typeParameterDescriptor);
                                    typeAliasExpansionReportStrategy.boundsViolationInSubstitution(create, type2, type3, typeParameterDescriptor);
                                }
                            }
                        }
                        i2++;
                    }
                    return new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(typeProjection.getProjectionKind(), highSpeedVideoSizes2);
                }
            }
        }
        return typeProjection;
    }

    private final kotlin.reflect.jvm.internal.impl.types.SimpleType getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType, kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansion typeAliasExpansion, int i) {
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor constructor = simpleType.getConstructor();
        java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> arguments = simpleType.getArguments();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arguments, 10));
        int i2 = 0;
        for (java.lang.Object obj : arguments) {
            if (i2 < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection = (kotlin.reflect.jvm.internal.impl.types.TypeProjection) obj;
            kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(typeProjection, typeAliasExpansion, constructor.getParameters().get(i2), i + 1);
            if (!highSpeedVideoFpsRangesFor.isStarProjection()) {
                highSpeedVideoFpsRangesFor = new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(highSpeedVideoFpsRangesFor.getProjectionKind(), kotlin.reflect.jvm.internal.impl.types.TypeUtils.makeNullableIfNeeded(highSpeedVideoFpsRangesFor.getType(), typeProjection.getType().isMarkedNullable()));
            }
            arrayList.add(highSpeedVideoFpsRangesFor);
            i2++;
        }
        return kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt.replace$default(simpleType, arrayList, null, 2, null);
    }

    public static final class Companion {
        private Companion() {
        }

        public static final /* synthetic */ void access$assertRecursionDepth(kotlin.reflect.jvm.internal.impl.types.TypeAliasExpander.Companion companion, int i, kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor typeAliasDescriptor) {
            if (i <= 100) {
                return;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Too deep recursion while expanding type alias ");
            sb.append(typeAliasDescriptor.getName());
            throw new java.lang.AssertionError(sb.toString());
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
