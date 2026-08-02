package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* loaded from: classes5.dex */
public final class AnnotationDeserializer {
    private final kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor getHighSpeedVideoSizes;

    public AnnotationDeserializer(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses notFoundClasses) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notFoundClasses, "");
        this.getHighSpeedVideoSizes = moduleDescriptor;
        this.getHighResolutionOutputSizeshNQ4ISI = notFoundClasses;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.Pair] */
    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor deserializeAnnotation(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation annotation, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameResolver, "");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor findNonGenericClassAcrossDependencies = kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt.findNonGenericClassAcrossDependencies(this.getHighSpeedVideoSizes, kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getClassId(nameResolver, annotation.getId()), this.getHighResolutionOutputSizeshNQ4ISI);
        java.util.Map emptyMap = kotlin.collections.MapsKt.emptyMap();
        if (annotation.getArgumentCount() != 0) {
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = findNonGenericClassAcrossDependencies;
            if (!kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils.isError(classDescriptor) && kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isAnnotationClass(classDescriptor)) {
                java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor> constructors = findNonGenericClassAcrossDependencies.getConstructors();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(constructors, "");
                kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor classConstructorDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor) kotlin.collections.CollectionsKt.singleOrNull(constructors);
                if (classConstructorDescriptor != null) {
                    java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters = classConstructorDescriptor.getValueParameters();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueParameters, "");
                    java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> list = valueParameters;
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
                    for (java.lang.Object obj : list) {
                        linkedHashMap.put(((kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) obj).getName(), obj);
                    }
                    java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument> argumentList = annotation.getArgumentList();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(argumentList, "");
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument argument : argumentList) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(argument);
                        kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) linkedHashMap.get(kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getName(nameResolver, argument.getNameId()));
                        if (valueParameterDescriptor != null) {
                            kotlin.reflect.jvm.internal.impl.name.Name name2 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getName(nameResolver, argument.getNameId());
                            kotlin.reflect.jvm.internal.impl.types.KotlinType type = valueParameterDescriptor.getType();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "");
                            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value value = argument.getValue();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "");
                            kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> resolveValue = resolveValue(type, value, nameResolver);
                            r6 = getHighSpeedVideoSizes(resolveValue, type, value) ? resolveValue : null;
                            if (r6 == null) {
                                kotlin.reflect.jvm.internal.impl.resolve.constants.ErrorValue.Companion companion = kotlin.reflect.jvm.internal.impl.resolve.constants.ErrorValue.Companion;
                                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected argument value: actual type ");
                                sb.append(value.getType());
                                sb.append(" != expected type ");
                                sb.append(type);
                                r6 = companion.create(sb.toString());
                            }
                            r6 = new kotlin.Pair(name2, r6);
                        }
                        if (r6 != null) {
                            arrayList.add(r6);
                        }
                    }
                    emptyMap = kotlin.collections.MapsKt.toMap(arrayList);
                }
            }
        }
        return new kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptorImpl(findNonGenericClassAcrossDependencies.getDefaultType(), emptyMap, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE);
    }

    public final kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> resolveValue(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value value, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameResolver, "");
        java.lang.Boolean bool = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_UNSIGNED.get(value.getFlags());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bool, "");
        boolean booleanValue = bool.booleanValue();
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type type = value.getType();
        switch (type == null ? -1 : kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationDeserializer.WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                byte intValue = (byte) value.getIntValue();
                return booleanValue ? new kotlin.reflect.jvm.internal.impl.resolve.constants.UByteValue(intValue) : new kotlin.reflect.jvm.internal.impl.resolve.constants.ByteValue(intValue);
            case 2:
                return new kotlin.reflect.jvm.internal.impl.resolve.constants.CharValue((char) value.getIntValue());
            case 3:
                short intValue2 = (short) value.getIntValue();
                return booleanValue ? new kotlin.reflect.jvm.internal.impl.resolve.constants.UShortValue(intValue2) : new kotlin.reflect.jvm.internal.impl.resolve.constants.ShortValue(intValue2);
            case 4:
                int intValue3 = (int) value.getIntValue();
                return booleanValue ? new kotlin.reflect.jvm.internal.impl.resolve.constants.UIntValue(intValue3) : new kotlin.reflect.jvm.internal.impl.resolve.constants.IntValue(intValue3);
            case 5:
                long intValue4 = value.getIntValue();
                return booleanValue ? new kotlin.reflect.jvm.internal.impl.resolve.constants.ULongValue(intValue4) : new kotlin.reflect.jvm.internal.impl.resolve.constants.LongValue(intValue4);
            case 6:
                return new kotlin.reflect.jvm.internal.impl.resolve.constants.FloatValue(value.getFloatValue());
            case 7:
                return new kotlin.reflect.jvm.internal.impl.resolve.constants.DoubleValue(value.getDoubleValue());
            case 8:
                return new kotlin.reflect.jvm.internal.impl.resolve.constants.BooleanValue(value.getIntValue() != 0);
            case 9:
                return new kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue(nameResolver.getString(value.getStringValue()));
            case 10:
                return new kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue(kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getClassId(nameResolver, value.getClassId()), value.getArrayDimensionCount());
            case 11:
                return new kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue(kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getClassId(nameResolver, value.getClassId()), kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getName(nameResolver, value.getEnumValueId()));
            case 12:
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation annotation = value.getAnnotation();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(annotation, "");
                return new kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue(deserializeAnnotation(annotation, nameResolver));
            case 13:
                kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory constantValueFactory = kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory.INSTANCE;
                java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value> arrayElementList = value.getArrayElementList();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(arrayElementList, "");
                java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value> list = arrayElementList;
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                for (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value value2 : list) {
                    kotlin.reflect.jvm.internal.impl.types.SimpleType anyType = this.getHighSpeedVideoSizes.getBuiltIns().getAnyType();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(anyType, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNull(value2);
                    arrayList.add(resolveValue(anyType, value2, nameResolver));
                }
                return constantValueFactory.createArrayValue(arrayList, kotlinType);
            default:
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unsupported annotation argument type: ");
                sb.append(value.getType());
                sb.append(" (expected ");
                sb.append(kotlinType);
                sb.append(')');
                throw new java.lang.IllegalStateException(sb.toString().toString());
        }
    }

    private final boolean getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> constantValue, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value value) {
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type type = value.getType();
        int i = type == null ? -1 : kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationDeserializer.WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 10) {
            kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = kotlinType.getConstructor().mo23898getDeclarationDescriptor();
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = mo23898getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor ? (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) mo23898getDeclarationDescriptor : null;
            return classDescriptor == null || kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isKClass(classDescriptor);
        }
        if (i == 13) {
            if (constantValue instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue) {
                kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue arrayValue = (kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue) constantValue;
                if (arrayValue.getValue().size() == value.getArrayElementList().size()) {
                    kotlin.reflect.jvm.internal.impl.types.KotlinType arrayElementTypeOrNull = this.getHighSpeedVideoSizes.getBuiltIns().getArrayElementTypeOrNull(kotlinType);
                    if (arrayElementTypeOrNull == null) {
                        return false;
                    }
                    java.lang.Iterable indices = kotlin.collections.CollectionsKt.getIndices(arrayValue.getValue());
                    if ((indices instanceof java.util.Collection) && ((java.util.Collection) indices).isEmpty()) {
                        return true;
                    }
                    java.util.Iterator it = indices.iterator();
                    while (it.hasNext()) {
                        int nextInt = ((kotlin.collections.IntIterator) it).nextInt();
                        kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> constantValue2 = arrayValue.getValue().get(nextInt);
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value arrayElement = value.getArrayElement(nextInt);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(arrayElement, "");
                        if (!getHighSpeedVideoSizes(constantValue2, arrayElementTypeOrNull, arrayElement)) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            throw new java.lang.IllegalStateException("Deserialized ArrayValue should have the same number of elements as the original array value: ".concat(java.lang.String.valueOf(constantValue)).toString());
        }
        return kotlin.jvm.internal.Intrinsics.areEqual(constantValue.getType(this.getHighSpeedVideoSizes), kotlinType);
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.values().length];
            try {
                iArr[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.BYTE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.CHAR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.SHORT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.INT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.LONG.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.FLOAT.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.DOUBLE.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.BOOLEAN.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.STRING.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.CLASS.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.ENUM.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.ANNOTATION.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.ARRAY.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
