package kotlin.reflect.jvm.internal.impl.km.internal;

/* loaded from: classes5.dex */
public final class ReadUtilsKt {
    public static final kotlin.reflect.jvm.internal.impl.km.KmAnnotation readAnnotation(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation annotation, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameResolver, "");
        java.lang.String className = getClassName(nameResolver, annotation.getId());
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument> argumentList = annotation.getArgumentList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(argumentList, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument argument : argumentList) {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value value = argument.getValue();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "");
            kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument readAnnotationArgument = readAnnotationArgument(value, nameResolver);
            kotlin.Pair pair = readAnnotationArgument != null ? kotlin.TuplesKt.to(nameResolver.getString(argument.getNameId()), readAnnotationArgument) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return new kotlin.reflect.jvm.internal.impl.km.KmAnnotation(className, kotlin.collections.MapsKt.toMap(arrayList));
    }

    public static final kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument readAnnotationArgument(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value value, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameResolver, "");
        if (kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_UNSIGNED.get(value.getFlags()).booleanValue()) {
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type type = value.getType();
            int i = type != null ? kotlin.reflect.jvm.internal.impl.km.internal.ReadUtilsKt.WhenMappings.$EnumSwitchMapping$0[type.ordinal()] : -1;
            if (i == 1) {
                return new kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.UByteValue(kotlin.UByte.m23446constructorimpl((byte) value.getIntValue()), null);
            }
            if (i == 2) {
                return new kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.UShortValue(kotlin.UShort.m23518constructorimpl((short) value.getIntValue()), null);
            }
            if (i == 3) {
                return new kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.UIntValue(kotlin.UInt.m23470constructorimpl((int) value.getIntValue()), null);
            }
            if (i == 4) {
                return new kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.ULongValue(kotlin.ULong.m23494constructorimpl(value.getIntValue()), null);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot read value of unsigned type: ");
            sb.append(value.getType());
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type type2 = value.getType();
        switch (type2 != null ? kotlin.reflect.jvm.internal.impl.km.internal.ReadUtilsKt.WhenMappings.$EnumSwitchMapping$0[type2.ordinal()] : -1) {
            case -1:
                return null;
            case 0:
            default:
                throw new kotlin.NoWhenBranchMatchedException();
            case 1:
                return new kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.ByteValue((byte) value.getIntValue());
            case 2:
                return new kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.ShortValue((short) value.getIntValue());
            case 3:
                return new kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.IntValue((int) value.getIntValue());
            case 4:
                return new kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LongValue(value.getIntValue());
            case 5:
                return new kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.CharValue((char) value.getIntValue());
            case 6:
                return new kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.FloatValue(value.getFloatValue());
            case 7:
                return new kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.DoubleValue(value.getDoubleValue());
            case 8:
                return new kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.BooleanValue(value.getIntValue() != 0);
            case 9:
                return new kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.StringValue(nameResolver.getString(value.getStringValue()));
            case 10:
                java.lang.String className = getClassName(nameResolver, value.getClassId());
                if (value.getArrayDimensionCount() == 0) {
                    return new kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.KClassValue(className);
                }
                return new kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.ArrayKClassValue(className, value.getArrayDimensionCount());
            case 11:
                return new kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.EnumValue(getClassName(nameResolver, value.getClassId()), nameResolver.getString(value.getEnumValueId()));
            case 12:
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation annotation = value.getAnnotation();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(annotation, "");
                return new kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.AnnotationValue(readAnnotation(annotation, nameResolver));
            case 13:
                java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value> arrayElementList = value.getArrayElementList();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(arrayElementList, "");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value value2 : arrayElementList) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(value2);
                    kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument readAnnotationArgument = readAnnotationArgument(value2, nameResolver);
                    if (readAnnotationArgument != null) {
                        arrayList.add(readAnnotationArgument);
                    }
                }
                return new kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.ArrayValue(arrayList);
        }
    }

    public static final java.lang.String getClassName(kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameResolver, "");
        java.lang.String qualifiedClassName = nameResolver.getQualifiedClassName(i);
        return nameResolver.isLocalClassName(i) ? ".".concat(java.lang.String.valueOf(qualifiedClassName)) : qualifiedClassName;
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
                iArr[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.SHORT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.INT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.LONG.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.CHAR.ordinal()] = 5;
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
