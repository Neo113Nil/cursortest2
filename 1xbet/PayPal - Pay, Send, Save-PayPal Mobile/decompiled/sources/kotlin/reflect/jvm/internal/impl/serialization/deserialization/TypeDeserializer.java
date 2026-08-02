package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* loaded from: classes5.dex */
public final class TypeDeserializer {
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer Camera2StreamConfigurationMap;
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext getHighSpeedVideoFpsRanges;
    private final java.lang.String getHighSpeedVideoFpsRangesFor;
    private final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor> getHighSpeedVideoSizes;
    private final java.util.Map<java.lang.Integer, kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getOutputFormats;
    private final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor> getOutputMinFrameDuration;

    public TypeDeserializer(kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext deserializationContext, kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer typeDeserializer, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter> list, java.lang.String str, java.lang.String str2) {
        java.util.LinkedHashMap linkedHashMap;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializationContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.getHighSpeedVideoFpsRanges = deserializationContext;
        this.Camera2StreamConfigurationMap = typeDeserializer;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoFpsRangesFor = str2;
        this.getHighSpeedVideoSizes = deserializationContext.getStorageManager().createMemoizedFunctionWithNullableValues(new kotlin.jvm.functions.Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$$Lambda$0
            private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer getHighSpeedVideoFpsRanges;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges, ((java.lang.Number) obj).intValue());
            }

            {
                this.getHighSpeedVideoFpsRanges = this;
            }
        });
        this.getOutputMinFrameDuration = deserializationContext.getStorageManager().createMemoizedFunctionWithNullableValues(new kotlin.jvm.functions.Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$$Lambda$1
            private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer Camera2StreamConfigurationMap;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer.Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap, ((java.lang.Number) obj).intValue());
            }

            {
                this.Camera2StreamConfigurationMap = this;
            }
        });
        if (list.isEmpty()) {
            linkedHashMap = kotlin.collections.MapsKt.emptyMap();
        } else {
            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
            int i = 0;
            for (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter typeParameter : list) {
                linkedHashMap2.put(java.lang.Integer.valueOf(typeParameter.getId()), new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor(this.getHighSpeedVideoFpsRanges, typeParameter, i));
                i++;
            }
            linkedHashMap = linkedHashMap2;
        }
        this.getOutputFormats = linkedHashMap;
    }

    public final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getOwnTypeParameters() {
        return kotlin.collections.CollectionsKt.toList(this.getOutputFormats.values());
    }

    public final kotlin.reflect.jvm.internal.impl.types.KotlinType type(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        if (type.hasFlexibleTypeCapabilitiesId()) {
            java.lang.String string = this.getHighSpeedVideoFpsRanges.getNameResolver().getString(type.getFlexibleTypeCapabilitiesId());
            kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType$default = simpleType$default(this, type, false, 2, null);
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type flexibleUpperBound = kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.flexibleUpperBound(type, this.getHighSpeedVideoFpsRanges.getTypeTable());
            kotlin.jvm.internal.Intrinsics.checkNotNull(flexibleUpperBound);
            return this.getHighSpeedVideoFpsRanges.getComponents().getFlexibleTypeDeserializer().create(type, string, simpleType$default, simpleType$default(this, flexibleUpperBound, false, 2, null));
        }
        return simpleType(type, true);
    }

    private static kotlin.reflect.jvm.internal.impl.types.TypeAttributes getHighResolutionOutputSizeshNQ4ISI(java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.TypeAttributeTranslator> list, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.TypeAttributeTranslator> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((kotlin.reflect.jvm.internal.impl.types.TypeAttributeTranslator) it.next()).toAttributes(annotations, typeConstructor, declarationDescriptor));
        }
        return kotlin.reflect.jvm.internal.impl.types.TypeAttributes.Companion.create(kotlin.collections.CollectionsKt.flatten(arrayList));
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType$default(kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer typeDeserializer, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return typeDeserializer.simpleType(type, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0309, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r8, r9) != false) goto L105;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType(final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type, boolean z) {
        kotlin.reflect.jvm.internal.impl.types.SimpleType highSpeedVideoSizes;
        kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeConstructor createErrorTypeConstructor;
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor invoke;
        java.lang.Object obj;
        kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor;
        kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType simpleType$default;
        java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.TypeProjection> list;
        kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection;
        kotlin.reflect.jvm.internal.impl.types.KotlinType type2;
        kotlin.reflect.jvm.internal.impl.name.FqName fqName;
        int size;
        kotlin.reflect.jvm.internal.impl.types.SimpleType withAbbreviation;
        kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjectionImpl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType = null;
        simpleType = null;
        simpleType = null;
        simpleType = null;
        simpleType = null;
        if (type.hasClassName()) {
            highSpeedVideoSizes = getHighSpeedVideoSizes(type.getClassName());
        } else {
            highSpeedVideoSizes = type.hasTypeAliasName() ? getHighSpeedVideoSizes(type.getTypeAliasName()) : null;
        }
        if (highSpeedVideoSizes != null) {
            return highSpeedVideoSizes;
        }
        if (type.hasClassName()) {
            invoke = this.getHighSpeedVideoSizes.invoke(java.lang.Integer.valueOf(type.getClassName()));
            if (invoke == null) {
                invoke = Camera2StreamConfigurationMap(this, type, type.getClassName());
            }
        } else if (type.hasTypeParameter()) {
            int typeParameter = type.getTypeParameter();
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer typeDeserializer = this;
            while (true) {
                typeParameterDescriptor = typeDeserializer.getOutputFormats.get(java.lang.Integer.valueOf(typeParameter));
                if (typeParameterDescriptor != null) {
                    break;
                }
                typeDeserializer = typeDeserializer.Camera2StreamConfigurationMap;
                if (typeDeserializer == null) {
                    typeParameterDescriptor = null;
                    break;
                }
            }
            if (typeParameterDescriptor == null) {
                createErrorTypeConstructor = kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils.INSTANCE.createErrorTypeConstructor(kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER, java.lang.String.valueOf(type.getTypeParameter()), this.getHighSpeedVideoFpsRangesFor);
                if (!kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils.isError(createErrorTypeConstructor.mo23898getDeclarationDescriptor())) {
                    return kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils.INSTANCE.createErrorType(kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind.TYPE_FOR_ERROR_TYPE_CONSTRUCTOR, createErrorTypeConstructor, createErrorTypeConstructor.toString());
                }
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotations deserializedAnnotations = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotations(this.getHighSpeedVideoFpsRanges.getStorageManager(), new kotlin.jvm.functions.Function0(this, type) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$$Lambda$2
                    private final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type Camera2StreamConfigurationMap;
                    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer getHighSpeedVideoSizes;

                    @Override // kotlin.jvm.functions.Function0
                    public java.lang.Object invoke() {
                        java.util.List loadTypeAnnotations;
                        loadTypeAnnotations = r0.getHighSpeedVideoFpsRanges.getComponents().getAnnotationAndConstantLoader().loadTypeAnnotations(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges.getNameResolver());
                        return loadTypeAnnotations;
                    }

                    {
                        this.getHighSpeedVideoSizes = this;
                        this.Camera2StreamConfigurationMap = type;
                    }
                });
                kotlin.reflect.jvm.internal.impl.types.TypeAttributes highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges.getComponents().getTypeAttributeTranslators(), deserializedAnnotations, createErrorTypeConstructor, this.getHighSpeedVideoFpsRanges.getContainingDeclaration());
                java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument> highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(type, this);
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(highResolutionOutputSizeshNQ4ISI2, 10));
                int i = 0;
                for (java.lang.Object obj2 : highResolutionOutputSizeshNQ4ISI2) {
                    if (i < 0) {
                        kotlin.collections.CollectionsKt.throwIndexOverflow();
                    }
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument argument = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument) obj2;
                    java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> parameters = createErrorTypeConstructor.getParameters();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parameters, "");
                    kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor2 = (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) kotlin.collections.CollectionsKt.getOrNull(parameters, i);
                    if (argument.getProjection() != kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Projection.STAR) {
                        kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags protoEnumFlags = kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags.INSTANCE;
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Projection projection = argument.getProjection();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(projection, "");
                        kotlin.reflect.jvm.internal.impl.types.Variance variance = protoEnumFlags.variance(projection);
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type3 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.type(argument, this.getHighSpeedVideoFpsRanges.getTypeTable());
                        if (type3 == null) {
                            typeProjectionImpl = new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils.createErrorType(kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind.NO_RECORDED_TYPE, argument.toString()));
                        } else {
                            typeProjectionImpl = new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(variance, type(type3));
                        }
                    } else if (typeParameterDescriptor2 == null) {
                        typeProjectionImpl = new kotlin.reflect.jvm.internal.impl.types.StarProjectionForAbsentTypeParameter(this.getHighSpeedVideoFpsRanges.getComponents().getModuleDescriptor().getBuiltIns());
                    } else {
                        typeProjectionImpl = new kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl(typeParameterDescriptor2);
                    }
                    arrayList.add(typeProjectionImpl);
                    i++;
                }
                java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.TypeProjection> list2 = kotlin.collections.CollectionsKt.toList(arrayList);
                kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = createErrorTypeConstructor.mo23898getDeclarationDescriptor();
                boolean z2 = true;
                if (z && (mo23898getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor)) {
                    kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory kotlinTypeFactory = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.INSTANCE;
                    kotlin.reflect.jvm.internal.impl.types.SimpleType computeExpandedType = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.computeExpandedType((kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor) mo23898getDeclarationDescriptor, list2);
                    kotlin.reflect.jvm.internal.impl.types.TypeAttributes highResolutionOutputSizeshNQ4ISI3 = getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges.getComponents().getTypeAttributeTranslators(), kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.create(kotlin.collections.CollectionsKt.plus((java.lang.Iterable) deserializedAnnotations, (java.lang.Iterable) computeExpandedType.getAnnotations())), createErrorTypeConstructor, this.getHighSpeedVideoFpsRanges.getContainingDeclaration());
                    if (!kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt.isNullable(computeExpandedType) && !type.getNullable()) {
                        z2 = false;
                    }
                    simpleType$default = computeExpandedType.makeNullableAsSpecified(z2).replaceAttributes(highResolutionOutputSizeshNQ4ISI3);
                } else if (kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.SUSPEND_TYPE.get(type.getFlags()).booleanValue()) {
                    boolean nullable = type.getNullable();
                    int size2 = createErrorTypeConstructor.getParameters().size() - list2.size();
                    if (size2 != 0) {
                        if (size2 == 1 && (size = list2.size() - 1) >= 0) {
                            kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor = createErrorTypeConstructor.getBuiltIns().getSuspendFunction(size).getTypeConstructor();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeConstructor, "");
                            simpleType = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.simpleType$default(highResolutionOutputSizeshNQ4ISI, typeConstructor, list2, nullable, (kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner) null, 16, (java.lang.Object) null);
                        }
                        list = list2;
                    } else {
                        list = list2;
                        kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType$default2 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.simpleType$default(highResolutionOutputSizeshNQ4ISI, createErrorTypeConstructor, list2, nullable, (kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner) null, 16, (java.lang.Object) null);
                        if (kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt.isFunctionType(simpleType$default2) && (typeProjection = (kotlin.reflect.jvm.internal.impl.types.TypeProjection) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt.getValueParameterTypesFromFunctionType(simpleType$default2))) != null && (type2 = typeProjection.getType()) != null) {
                            kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor2 = type2.getConstructor().mo23898getDeclarationDescriptor();
                            kotlin.reflect.jvm.internal.impl.name.FqName fqNameSafe = mo23898getDeclarationDescriptor2 != null ? kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameSafe(mo23898getDeclarationDescriptor2) : null;
                            if (type2.getArguments().size() == 1) {
                                if (!kotlin.jvm.internal.Intrinsics.areEqual(fqNameSafe, kotlin.reflect.jvm.internal.impl.builtins.StandardNames.CONTINUATION_INTERFACE_FQ_NAME)) {
                                    fqName = kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializerKt.Camera2StreamConfigurationMap;
                                }
                                kotlin.reflect.jvm.internal.impl.types.KotlinType type4 = ((kotlin.reflect.jvm.internal.impl.types.TypeProjection) kotlin.collections.CollectionsKt.single((java.util.List) type2.getArguments())).getType();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type4, "");
                                kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = this.getHighSpeedVideoFpsRanges.getContainingDeclaration();
                                kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor = containingDeclaration instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor ? (kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor) containingDeclaration : null;
                                if (kotlin.jvm.internal.Intrinsics.areEqual(callableDescriptor != null ? kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.fqNameOrNull(callableDescriptor) : null, kotlin.reflect.jvm.internal.impl.serialization.deserialization.SuspendFunctionTypeUtilKt.KOTLIN_SUSPEND_BUILT_IN_FUNCTION_FQ_NAME)) {
                                    simpleType = Camera2StreamConfigurationMap(simpleType$default2, type4);
                                } else {
                                    simpleType = Camera2StreamConfigurationMap(simpleType$default2, type4);
                                }
                            }
                            simpleType = simpleType$default2;
                        }
                    }
                    simpleType$default = simpleType == null ? kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils.INSTANCE.createErrorTypeWithArguments(kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind.INCONSISTENT_SUSPEND_FUNCTION, list, createErrorTypeConstructor, new java.lang.String[0]) : simpleType;
                } else {
                    simpleType$default = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.simpleType$default(highResolutionOutputSizeshNQ4ISI, createErrorTypeConstructor, list2, type.getNullable(), (kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner) null, 16, (java.lang.Object) null);
                    if (kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.DEFINITELY_NOT_NULL_TYPE.get(type.getFlags()).booleanValue()) {
                        kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType makeDefinitelyNotNull$default = kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType.Companion.makeDefinitelyNotNull$default(kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType.Companion, simpleType$default, true, false, 4, null);
                        if (makeDefinitelyNotNull$default == null) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("null DefinitelyNotNullType for '");
                            sb.append(simpleType$default);
                            sb.append('\'');
                            throw new java.lang.IllegalStateException(sb.toString().toString());
                        }
                        simpleType$default = makeDefinitelyNotNull$default;
                    }
                }
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type abbreviatedType = kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.abbreviatedType(type, this.getHighSpeedVideoFpsRanges.getTypeTable());
                return (abbreviatedType == null || (withAbbreviation = kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt.withAbbreviation(simpleType$default, simpleType(abbreviatedType, false))) == null) ? simpleType$default : withAbbreviation;
            }
            invoke = typeParameterDescriptor;
        } else if (type.hasTypeParameterName()) {
            java.lang.String string = this.getHighSpeedVideoFpsRanges.getNameResolver().getString(type.getTypeParameterName());
            java.util.Iterator<T> it = getOwnTypeParameters().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) obj).getName().asString(), string)) {
                    break;
                }
            }
            kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor3 = (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) obj;
            if (typeParameterDescriptor3 == null) {
                createErrorTypeConstructor = kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils.INSTANCE.createErrorTypeConstructor(kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME, string, this.getHighSpeedVideoFpsRanges.getContainingDeclaration().toString());
                if (!kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils.isError(createErrorTypeConstructor.mo23898getDeclarationDescriptor())) {
                }
            } else {
                invoke = typeParameterDescriptor3;
            }
        } else if (type.hasTypeAliasName()) {
            invoke = this.getOutputMinFrameDuration.invoke(java.lang.Integer.valueOf(type.getTypeAliasName()));
            if (invoke == null) {
                invoke = Camera2StreamConfigurationMap(this, type, type.getTypeAliasName());
            }
        } else {
            createErrorTypeConstructor = kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils.INSTANCE.createErrorTypeConstructor(kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind.UNKNOWN_TYPE, new java.lang.String[0]);
            if (!kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils.isError(createErrorTypeConstructor.mo23898getDeclarationDescriptor())) {
            }
        }
        createErrorTypeConstructor = invoke.getTypeConstructor();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createErrorTypeConstructor, "");
        if (!kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils.isError(createErrorTypeConstructor.mo23898getDeclarationDescriptor())) {
        }
    }

    private static final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument> getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type, kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer typeDeserializer) {
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument> argumentList = type.getArgumentList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(argumentList, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument> list = argumentList;
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type outerType = kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.outerType(type, typeDeserializer.getHighSpeedVideoFpsRanges.getTypeTable());
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument> highResolutionOutputSizeshNQ4ISI = outerType != null ? getHighResolutionOutputSizeshNQ4ISI(outerType, typeDeserializer) : null;
        if (highResolutionOutputSizeshNQ4ISI == null) {
            highResolutionOutputSizeshNQ4ISI = kotlin.collections.CollectionsKt.emptyList();
        }
        return kotlin.collections.CollectionsKt.plus((java.util.Collection) list, (java.lang.Iterable) highResolutionOutputSizeshNQ4ISI);
    }

    private static final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor Camera2StreamConfigurationMap(final kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer typeDeserializer, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type, int i) {
        kotlin.reflect.jvm.internal.impl.name.ClassId classId = kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getClassId(typeDeserializer.getHighSpeedVideoFpsRanges.getNameResolver(), i);
        java.util.List<java.lang.Integer> mutableList = kotlin.sequences.SequencesKt.toMutableList(kotlin.sequences.SequencesKt.map(kotlin.sequences.SequencesKt.generateSequence(type, (kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type, ? extends kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type>) new kotlin.jvm.functions.Function1(typeDeserializer) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$$Lambda$3
            private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer getHighSpeedVideoFpsRangesFor;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRangesFor, (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) obj);
            }

            {
                this.getHighSpeedVideoFpsRangesFor = typeDeserializer;
            }
        }), new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$$Lambda$4
            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Integer.valueOf(kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer.Camera2StreamConfigurationMap((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) obj));
            }
        }));
        int count = kotlin.sequences.SequencesKt.count(kotlin.sequences.SequencesKt.generateSequence(classId, new kotlin.jvm.internal.PropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$typeConstructor$notFoundClass$classNestingLevel$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public final java.lang.Object get(java.lang.Object obj) {
                return ((kotlin.reflect.jvm.internal.impl.name.ClassId) obj).getOuterClassId();
            }
        }));
        while (mutableList.size() < count) {
            mutableList.add(0);
        }
        return typeDeserializer.getHighSpeedVideoFpsRanges.getComponents().getNotFoundClasses().getClass(classId, mutableList);
    }

    private static kotlin.reflect.jvm.internal.impl.types.SimpleType Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType2) {
        kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns builtIns = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.getBuiltIns(kotlinType);
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations = kotlinType.getAnnotations();
        kotlin.reflect.jvm.internal.impl.types.KotlinType receiverTypeFromFunctionType = kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt.getReceiverTypeFromFunctionType(kotlinType);
        java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> contextReceiverTypesFromFunctionType = kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt.getContextReceiverTypesFromFunctionType(kotlinType);
        java.util.List dropLast = kotlin.collections.CollectionsKt.dropLast(kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt.getValueParameterTypesFromFunctionType(kotlinType), 1);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(dropLast, 10));
        java.util.Iterator it = dropLast.iterator();
        while (it.hasNext()) {
            arrayList.add(((kotlin.reflect.jvm.internal.impl.types.TypeProjection) it.next()).getType());
        }
        return kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt.createFunctionType(builtIns, annotations, receiverTypeFromFunctionType, contextReceiverTypesFromFunctionType, arrayList, null, kotlinType2, true).makeNullableAsSpecified(kotlinType.isMarkedNullable());
    }

    private final kotlin.reflect.jvm.internal.impl.types.SimpleType getHighSpeedVideoSizes(int i) {
        if (kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getClassId(this.getHighSpeedVideoFpsRanges.getNameResolver(), i).isLocal()) {
            return this.getHighSpeedVideoFpsRanges.getComponents().getLocalClassifierTypeSettings().getReplacementTypeForLocalClassifiers();
        }
        return null;
    }

    public final java.lang.String toString() {
        java.lang.String obj;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        if (this.Camera2StreamConfigurationMap == null) {
            obj = "";
        } else {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(". Child of ");
            sb2.append(this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI);
            obj = sb2.toString();
        }
        sb.append(obj);
        return sb.toString();
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer typeDeserializer, int i) {
        kotlin.reflect.jvm.internal.impl.name.ClassId classId = kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getClassId(typeDeserializer.getHighSpeedVideoFpsRanges.getNameResolver(), i);
        if (classId.isLocal()) {
            return typeDeserializer.getHighSpeedVideoFpsRanges.getComponents().deserializeClass(classId);
        }
        return kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt.findClassifierAcrossModuleDependencies(typeDeserializer.getHighSpeedVideoFpsRanges.getComponents().getModuleDescriptor(), classId);
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer typeDeserializer, int i) {
        kotlin.reflect.jvm.internal.impl.name.ClassId classId = kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getClassId(typeDeserializer.getHighSpeedVideoFpsRanges.getNameResolver(), i);
        if (classId.isLocal()) {
            return null;
        }
        return kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt.findTypeAliasAcrossModuleDependencies(typeDeserializer.getHighSpeedVideoFpsRanges.getComponents().getModuleDescriptor(), classId);
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer typeDeserializer, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.outerType(type, typeDeserializer.getHighSpeedVideoFpsRanges.getTypeTable());
    }

    static /* synthetic */ int Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return type.getArgumentCount();
    }
}
