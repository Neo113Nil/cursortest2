package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

/* loaded from: classes5.dex */
public final class JavaTypeResolver {
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawProjectionComputer getHighSpeedVideoFpsRangesFor;
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public JavaTypeResolver(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext, kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver typeParameterResolver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyJavaResolverContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeParameterResolver, "");
        this.getHighSpeedVideoSizes = lazyJavaResolverContext;
        this.getHighResolutionOutputSizeshNQ4ISI = typeParameterResolver;
        kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawProjectionComputer rawProjectionComputer = new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawProjectionComputer();
        this.getHighSpeedVideoFpsRangesFor = rawProjectionComputer;
        this.getHighSpeedVideoFpsRanges = new kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser(rawProjectionComputer, null, 2, 0 == true ? 1 : 0);
    }

    public final kotlin.reflect.jvm.internal.impl.types.KotlinType transformJavaType(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType javaType, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes javaTypeAttributes) {
        kotlin.reflect.jvm.internal.impl.types.KotlinType transformJavaType;
        kotlin.reflect.jvm.internal.impl.types.SimpleType unitType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaTypeAttributes, "");
        if (javaType instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPrimitiveType) {
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType type = ((kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPrimitiveType) javaType).getType();
            if (type != null) {
                unitType = this.getHighSpeedVideoSizes.getModule().getBuiltIns().getPrimitiveKotlinType(type);
            } else {
                unitType = this.getHighSpeedVideoSizes.getModule().getBuiltIns().getUnitType();
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(unitType);
            return unitType;
        }
        if (!(javaType instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType)) {
            if (javaType instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType) {
                return transformArrayType$default(this, (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType) javaType, javaTypeAttributes, false, 4, null);
            }
            if (!(javaType instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType)) {
                if (javaType == null) {
                    kotlin.reflect.jvm.internal.impl.types.SimpleType defaultBound = this.getHighSpeedVideoSizes.getModule().getBuiltIns().getDefaultBound();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(defaultBound, "");
                    return defaultBound;
                }
                throw new java.lang.UnsupportedOperationException("Unsupported type: ".concat(java.lang.String.valueOf(javaType)));
            }
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType bound = ((kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType) javaType).getBound();
            if (bound != null && (transformJavaType = transformJavaType(bound, javaTypeAttributes)) != null) {
                return transformJavaType;
            }
            kotlin.reflect.jvm.internal.impl.types.SimpleType defaultBound2 = this.getHighSpeedVideoSizes.getModule().getBuiltIns().getDefaultBound();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(defaultBound2, "");
            return defaultBound2;
        }
        kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType javaClassifierType = (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType) javaType;
        boolean z = (javaTypeAttributes.isForAnnotationParameter() || javaTypeAttributes.getHowThisTypeIsUsed() == kotlin.reflect.jvm.internal.impl.types.TypeUsage.SUPERTYPE) ? false : true;
        boolean isRaw = javaClassifierType.isRaw();
        if (!isRaw && !z) {
            kotlin.reflect.jvm.internal.impl.types.SimpleType highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(javaClassifierType, javaTypeAttributes, null);
            return highResolutionOutputSizeshNQ4ISI != null ? highResolutionOutputSizeshNQ4ISI : kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils.createErrorType(kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind.UNRESOLVED_JAVA_CLASS, javaClassifierType.getPresentableText());
        }
        kotlin.reflect.jvm.internal.impl.types.SimpleType highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(javaClassifierType, javaTypeAttributes.withFlexibility(kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND), null);
        if (highResolutionOutputSizeshNQ4ISI2 != null) {
            kotlin.reflect.jvm.internal.impl.types.SimpleType highResolutionOutputSizeshNQ4ISI3 = getHighResolutionOutputSizeshNQ4ISI(javaClassifierType, javaTypeAttributes.withFlexibility(kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND), highResolutionOutputSizeshNQ4ISI2);
            if (highResolutionOutputSizeshNQ4ISI3 == null) {
                return kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils.createErrorType(kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind.UNRESOLVED_JAVA_CLASS, javaClassifierType.getPresentableText());
            }
            if (isRaw) {
                return new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl(highResolutionOutputSizeshNQ4ISI2, highResolutionOutputSizeshNQ4ISI3);
            }
            return kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.flexibleType(highResolutionOutputSizeshNQ4ISI2, highResolutionOutputSizeshNQ4ISI3);
        }
        return kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils.createErrorType(kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind.UNRESOLVED_JAVA_CLASS, javaClassifierType.getPresentableText());
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.KotlinType transformArrayType$default(kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver javaTypeResolver, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType javaArrayType, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes javaTypeAttributes, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return javaTypeResolver.transformArrayType(javaArrayType, javaTypeAttributes, z);
    }

    public final kotlin.reflect.jvm.internal.impl.types.KotlinType transformArrayType(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType javaArrayType, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes javaTypeAttributes, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaArrayType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaTypeAttributes, "");
        kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType componentType = javaArrayType.getComponentType();
        kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPrimitiveType javaPrimitiveType = componentType instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPrimitiveType ? (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPrimitiveType) componentType : null;
        kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType type = javaPrimitiveType != null ? javaPrimitiveType.getType() : null;
        kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations lazyJavaAnnotations = new kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations(this.getHighSpeedVideoSizes, javaArrayType, true);
        if (type != null) {
            kotlin.reflect.jvm.internal.impl.types.SimpleType primitiveArrayKotlinType = this.getHighSpeedVideoSizes.getModule().getBuiltIns().getPrimitiveArrayKotlinType(type);
            kotlin.jvm.internal.Intrinsics.checkNotNull(primitiveArrayKotlinType);
            kotlin.reflect.jvm.internal.impl.types.KotlinType replaceAnnotations = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.replaceAnnotations(primitiveArrayKotlinType, new kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations(primitiveArrayKotlinType.getAnnotations(), lazyJavaAnnotations));
            kotlin.jvm.internal.Intrinsics.checkNotNull(replaceAnnotations, "");
            kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType = (kotlin.reflect.jvm.internal.impl.types.SimpleType) replaceAnnotations;
            if (javaTypeAttributes.isForAnnotationParameter()) {
                return simpleType;
            }
            return kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.flexibleType(simpleType, simpleType.makeNullableAsSpecified(true));
        }
        kotlin.reflect.jvm.internal.impl.types.KotlinType transformJavaType = transformJavaType(componentType, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt.toAttributes$default(kotlin.reflect.jvm.internal.impl.types.TypeUsage.COMMON, javaTypeAttributes.isForAnnotationParameter(), false, null, 6, null));
        if (javaTypeAttributes.isForAnnotationParameter()) {
            kotlin.reflect.jvm.internal.impl.types.SimpleType arrayType = this.getHighSpeedVideoSizes.getModule().getBuiltIns().getArrayType(z ? kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE : kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT, transformJavaType, lazyJavaAnnotations);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(arrayType, "");
            return arrayType;
        }
        kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations lazyJavaAnnotations2 = lazyJavaAnnotations;
        kotlin.reflect.jvm.internal.impl.types.SimpleType arrayType2 = this.getHighSpeedVideoSizes.getModule().getBuiltIns().getArrayType(kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT, transformJavaType, lazyJavaAnnotations2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(arrayType2, "");
        return kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.flexibleType(arrayType2, this.getHighSpeedVideoSizes.getModule().getBuiltIns().getArrayType(kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE, transformJavaType, lazyJavaAnnotations2).makeNullableAsSpecified(true));
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x00bf, code lost:
    
        if (r5 != kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0162, code lost:
    
        if (r0.isEmpty() != false) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x010e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final kotlin.reflect.jvm.internal.impl.types.SimpleType getHighResolutionOutputSizeshNQ4ISI(final kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType javaClassifierType, final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes javaTypeAttributes, kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType) {
        kotlin.reflect.jvm.internal.impl.types.TypeAttributes defaultAttributes;
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor;
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor2;
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor;
        kotlin.reflect.jvm.internal.impl.name.FqName fqName;
        java.util.List list;
        java.lang.Object obj;
        java.util.List list2;
        java.util.Iterator it;
        kotlin.reflect.jvm.internal.impl.types.TypeProjection computeProjection;
        if (simpleType == null || (defaultAttributes = simpleType.getAttributes()) == null) {
            defaultAttributes = kotlin.reflect.jvm.internal.impl.types.TypeAttributesKt.toDefaultAttributes(new kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations(this.getHighSpeedVideoSizes, javaClassifierType, false, 4, null));
        }
        kotlin.reflect.jvm.internal.impl.types.TypeAttributes typeAttributes = defaultAttributes;
        kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifier classifier = javaClassifierType.getClassifier();
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor3 = null;
        if (classifier == null) {
            typeConstructor2 = Camera2StreamConfigurationMap(javaClassifierType);
        } else if (classifier instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass) {
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass javaClass = (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass) classifier;
            kotlin.reflect.jvm.internal.impl.name.FqName fqName2 = javaClass.getFqName();
            if (fqName2 == null) {
                throw new java.lang.AssertionError("Class type should have a FQ name: ".concat(java.lang.String.valueOf(classifier)));
            }
            if (javaTypeAttributes.isForAnnotationParameter()) {
                fqName = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolverKt.getHighSpeedVideoSizes;
                if (kotlin.jvm.internal.Intrinsics.areEqual(fqName2, fqName)) {
                    classDescriptor = this.getHighSpeedVideoSizes.getComponents().getReflectionTypes().getKClass();
                    if (classDescriptor == null) {
                        classDescriptor = this.getHighSpeedVideoSizes.getComponents().getModuleClassResolver().resolveClass(javaClass);
                    }
                    if (classDescriptor != null || (typeConstructor2 = classDescriptor.getTypeConstructor()) == null) {
                        typeConstructor2 = Camera2StreamConfigurationMap(javaClassifierType);
                    }
                }
            }
            kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMapper javaToKotlinClassMapper = kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMapper.INSTANCE;
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor mapJavaToKotlin$default = kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMapper.mapJavaToKotlin$default(javaToKotlinClassMapper, fqName2, this.getHighSpeedVideoSizes.getModule().getBuiltIns(), null, 4, null);
            if (mapJavaToKotlin$default == null) {
                classDescriptor = null;
            } else {
                if (javaToKotlinClassMapper.isReadOnly(mapJavaToKotlin$default)) {
                    if (javaTypeAttributes.getFlexibility() != kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND && javaTypeAttributes.getHowThisTypeIsUsed() != kotlin.reflect.jvm.internal.impl.types.TypeUsage.SUPERTYPE) {
                        if (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypesKt.isSuperWildcard((kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) javaClassifierType.getTypeArguments()))) {
                            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> parameters = kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMapper.INSTANCE.convertReadOnlyToMutable(mapJavaToKotlin$default).getTypeConstructor().getParameters();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parameters, "");
                            kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) parameters);
                            if (typeParameterDescriptor != null) {
                                kotlin.reflect.jvm.internal.impl.types.Variance variance = typeParameterDescriptor.getVariance();
                                if (variance != null) {
                                }
                            }
                        }
                    }
                    classDescriptor = javaToKotlinClassMapper.convertReadOnlyToMutable(mapJavaToKotlin$default);
                }
                classDescriptor = mapJavaToKotlin$default;
            }
            if (classDescriptor == null) {
            }
            if (classDescriptor != null) {
            }
            typeConstructor2 = Camera2StreamConfigurationMap(javaClassifierType);
        } else if (classifier instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter) {
            kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor resolveTypeParameter = this.getHighResolutionOutputSizeshNQ4ISI.resolveTypeParameter((kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter) classifier);
            if (resolveTypeParameter == null) {
                typeConstructor = null;
                if (typeConstructor != null) {
                    return null;
                }
                boolean z = false;
                boolean z2 = (javaTypeAttributes.getFlexibility() == kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND || javaTypeAttributes.isForAnnotationParameter() || javaTypeAttributes.getHowThisTypeIsUsed() == kotlin.reflect.jvm.internal.impl.types.TypeUsage.SUPERTYPE) ? false : true;
                if (kotlin.jvm.internal.Intrinsics.areEqual(simpleType != null ? simpleType.getConstructor() : null, typeConstructor) && !javaClassifierType.isRaw() && z2) {
                    return simpleType.makeNullableAsSpecified(true);
                }
                if (!javaClassifierType.isRaw()) {
                    if (javaClassifierType.getTypeArguments().isEmpty()) {
                        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> parameters2 = typeConstructor.getParameters();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parameters2, "");
                    }
                    java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> parameters3 = typeConstructor.getParameters();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parameters3, "");
                    if (z) {
                        if (parameters3.size() != javaClassifierType.getTypeArguments().size()) {
                            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list3 = parameters3;
                            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
                            for (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor2 : list3) {
                                kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind errorTypeKind = kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind.MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER;
                                java.lang.String asString = typeParameterDescriptor2.getName().asString();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
                                arrayList.add(new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils.createErrorType(errorTypeKind, asString)));
                            }
                            list = kotlin.collections.CollectionsKt.toList(arrayList);
                        } else {
                            java.lang.Iterable<kotlin.collections.IndexedValue> withIndex = kotlin.collections.CollectionsKt.withIndex(javaClassifierType.getTypeArguments());
                            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(withIndex, 10));
                            for (kotlin.collections.IndexedValue indexedValue : withIndex) {
                                int index = indexedValue.getIndex();
                                kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType javaType = (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType) indexedValue.component2();
                                parameters3.size();
                                kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor3 = parameters3.get(index);
                                kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes attributes$default = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt.toAttributes$default(kotlin.reflect.jvm.internal.impl.types.TypeUsage.COMMON, false, false, null, 7, null);
                                kotlin.jvm.internal.Intrinsics.checkNotNull(typeParameterDescriptor3);
                                if (javaType instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType) {
                                    kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType javaWildcardType = (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType) javaType;
                                    kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType bound = javaWildcardType.getBound();
                                    kotlin.reflect.jvm.internal.impl.types.Variance variance2 = javaWildcardType.isExtends() ? kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE : kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE;
                                    if (bound == null || (typeParameterDescriptor3.getVariance() != kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT && variance2 != typeParameterDescriptor3.getVariance())) {
                                        obj = kotlin.reflect.jvm.internal.impl.types.TypeUtils.makeStarProjection(typeParameterDescriptor3, attributes$default);
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
                                    } else {
                                        kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor extractNullabilityAnnotationOnBoundedWildcard = kotlin.reflect.jvm.internal.impl.load.java.UtilsKt.extractNullabilityAnnotationOnBoundedWildcard(this.getHighSpeedVideoSizes, javaWildcardType);
                                        kotlin.reflect.jvm.internal.impl.types.KotlinType transformJavaType = transformJavaType(bound, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt.toAttributes$default(kotlin.reflect.jvm.internal.impl.types.TypeUsage.COMMON, false, false, null, 7, null));
                                        if (extractNullabilityAnnotationOnBoundedWildcard != null) {
                                            transformJavaType = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.replaceAnnotations(transformJavaType, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.create(kotlin.collections.CollectionsKt.plus(transformJavaType.getAnnotations(), extractNullabilityAnnotationOnBoundedWildcard)));
                                        }
                                        obj = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.createProjection(transformJavaType, variance2, typeParameterDescriptor3);
                                    }
                                } else {
                                    obj = (kotlin.reflect.jvm.internal.impl.types.TypeProjection) new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT, transformJavaType(javaType, attributes$default));
                                }
                                arrayList2.add(obj);
                            }
                            list = kotlin.collections.CollectionsKt.toList(arrayList2);
                        }
                        list2 = list;
                    } else {
                        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list4 = parameters3;
                        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list4, 10));
                        java.util.Iterator it2 = list4.iterator();
                        while (it2.hasNext()) {
                            final kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor4 = (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) it2.next();
                            if (kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.hasTypeParameterRecursiveBounds(typeParameterDescriptor4, typeConstructor3, javaTypeAttributes.getVisitedTypeParameters())) {
                                computeProjection = kotlin.reflect.jvm.internal.impl.types.TypeUtils.makeStarProjection(typeParameterDescriptor4, javaTypeAttributes);
                                it = it2;
                            } else {
                                final kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor4 = typeConstructor;
                                it = it2;
                                computeProjection = this.getHighSpeedVideoFpsRangesFor.computeProjection(typeParameterDescriptor4, javaTypeAttributes.markIsRaw(javaClassifierType.isRaw()), this.getHighSpeedVideoFpsRanges, new kotlin.reflect.jvm.internal.impl.types.LazyWrappedType(this.getHighSpeedVideoSizes.getStorageManager(), new kotlin.jvm.functions.Function0(this, typeParameterDescriptor4, javaTypeAttributes, typeConstructor4, javaClassifierType) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver$$Lambda$0
                                    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver Camera2StreamConfigurationMap;
                                    private final kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType getHighResolutionOutputSizeshNQ4ISI;
                                    private final kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor getHighSpeedVideoFpsRanges;
                                    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes getHighSpeedVideoFpsRangesFor;
                                    private final kotlin.reflect.jvm.internal.impl.types.TypeConstructor getHighSpeedVideoSizes;

                                    @Override // kotlin.jvm.functions.Function0
                                    public java.lang.Object invoke() {
                                        return kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver.Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI);
                                    }

                                    {
                                        this.Camera2StreamConfigurationMap = this;
                                        this.getHighSpeedVideoFpsRanges = typeParameterDescriptor4;
                                        this.getHighSpeedVideoFpsRangesFor = javaTypeAttributes;
                                        this.getHighSpeedVideoSizes = typeConstructor4;
                                        this.getHighResolutionOutputSizeshNQ4ISI = javaClassifierType;
                                    }
                                }));
                            }
                            arrayList3.add(computeProjection);
                            it2 = it;
                            typeConstructor3 = null;
                        }
                        list2 = arrayList3;
                    }
                    return kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.simpleType$default(typeAttributes, typeConstructor, list2, z2, (kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner) null, 16, (java.lang.Object) null);
                }
                z = true;
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> parameters32 = typeConstructor.getParameters();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parameters32, "");
                if (z) {
                }
                return kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.simpleType$default(typeAttributes, typeConstructor, list2, z2, (kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner) null, 16, (java.lang.Object) null);
            }
            typeConstructor2 = resolveTypeParameter.getTypeConstructor();
        } else {
            throw new java.lang.IllegalStateException("Unknown classifier kind: ".concat(java.lang.String.valueOf(classifier)));
        }
        typeConstructor = typeConstructor2;
        if (typeConstructor != null) {
        }
    }

    private final kotlin.reflect.jvm.internal.impl.types.TypeConstructor Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType javaClassifierType) {
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor = this.getHighSpeedVideoSizes.getComponents().getDeserializedDescriptorResolver().getComponents().getNotFoundClasses().getClass(kotlin.reflect.jvm.internal.impl.name.ClassId.Companion.topLevel(new kotlin.reflect.jvm.internal.impl.name.FqName(javaClassifierType.getClassifierQualifiedName())), kotlin.collections.CollectionsKt.listOf(0)).getTypeConstructor();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeConstructor, "");
        return typeConstructor;
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.KotlinType Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver javaTypeResolver, kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes javaTypeAttributes, kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType javaClassifierType) {
        kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser typeParameterUpperBoundEraser = javaTypeResolver.getHighSpeedVideoFpsRanges;
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = typeConstructor.mo23898getDeclarationDescriptor();
        return typeParameterUpperBoundEraser.getErasedUpperBound(typeParameterDescriptor, javaTypeAttributes.withDefaultType(mo23898getDeclarationDescriptor != null ? mo23898getDeclarationDescriptor.getDefaultType() : null).markIsRaw(javaClassifierType.isRaw()));
    }
}
