package kotlin.reflect.jvm.internal.impl.km.internal;

/* loaded from: classes17.dex */
public final class WriteUtilsKt {
    public static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder writeAnnotation(kotlin.reflect.jvm.internal.impl.km.KmAnnotation kmAnnotation, kotlin.reflect.jvm.internal.impl.metadata.serialization.StringTable stringTable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmAnnotation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringTable, "");
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder newBuilder = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.newBuilder();
        newBuilder.setId(getClassNameIndex(stringTable, kmAnnotation.getClassName()));
        for (java.util.Map.Entry<java.lang.String, kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument> entry : kmAnnotation.getArguments().entrySet()) {
            java.lang.String key = entry.getKey();
            kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument value = entry.getValue();
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Builder newBuilder2 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.newBuilder();
            newBuilder2.setNameId(stringTable.getStringIndex(key));
            newBuilder2.setValue(writeAnnotationArgument(value, stringTable).build());
            newBuilder.addArgument(newBuilder2);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newBuilder, "");
        return newBuilder;
    }

    public static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder writeAnnotationArgument(kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument kmAnnotationArgument, kotlin.reflect.jvm.internal.impl.metadata.serialization.StringTable stringTable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmAnnotationArgument, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringTable, "");
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder newBuilder = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.newBuilder();
        if (kmAnnotationArgument instanceof kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.ByteValue) {
            newBuilder.setType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.BYTE);
            newBuilder.setIntValue(((kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.ByteValue) kmAnnotationArgument).getValue().byteValue());
        } else if (kmAnnotationArgument instanceof kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.CharValue) {
            newBuilder.setType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.CHAR);
            newBuilder.setIntValue(((kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.CharValue) kmAnnotationArgument).getValue().charValue());
        } else if (kmAnnotationArgument instanceof kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.ShortValue) {
            newBuilder.setType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.SHORT);
            newBuilder.setIntValue(((kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.ShortValue) kmAnnotationArgument).getValue().shortValue());
        } else if (kmAnnotationArgument instanceof kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.IntValue) {
            newBuilder.setType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.INT);
            newBuilder.setIntValue(((kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.IntValue) kmAnnotationArgument).getValue().intValue());
        } else if (kmAnnotationArgument instanceof kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LongValue) {
            newBuilder.setType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.LONG);
            newBuilder.setIntValue(((kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LongValue) kmAnnotationArgument).getValue().longValue());
        } else if (kmAnnotationArgument instanceof kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.FloatValue) {
            newBuilder.setType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.FLOAT);
            newBuilder.setFloatValue(((kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.FloatValue) kmAnnotationArgument).getValue().floatValue());
        } else if (kmAnnotationArgument instanceof kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.DoubleValue) {
            newBuilder.setType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.DOUBLE);
            newBuilder.setDoubleValue(((kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.DoubleValue) kmAnnotationArgument).getValue().doubleValue());
        } else if (kmAnnotationArgument instanceof kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.BooleanValue) {
            newBuilder.setType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.BOOLEAN);
            newBuilder.setIntValue(((kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.BooleanValue) kmAnnotationArgument).getValue().booleanValue() ? 1L : 0L);
        } else if (kmAnnotationArgument instanceof kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.UByteValue) {
            newBuilder.setType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.BYTE);
            newBuilder.setIntValue(((kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.UByteValue) kmAnnotationArgument).m23892getValuew2LRezQ() & 255);
            newBuilder.setFlags(kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_UNSIGNED.toFlags(java.lang.Boolean.TRUE));
        } else if (kmAnnotationArgument instanceof kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.UShortValue) {
            newBuilder.setType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.SHORT);
            newBuilder.setIntValue(((kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.UShortValue) kmAnnotationArgument).m23895getValueMh2AYeg() & okhttp3.internal.ws.WebSocketProtocol.PAYLOAD_SHORT_MAX);
            newBuilder.setFlags(kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_UNSIGNED.toFlags(java.lang.Boolean.TRUE));
        } else if (kmAnnotationArgument instanceof kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.UIntValue) {
            newBuilder.setType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.INT);
            newBuilder.setIntValue(((kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.UIntValue) kmAnnotationArgument).m23893getValuepVg5ArA() & 4294967295L);
            newBuilder.setFlags(kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_UNSIGNED.toFlags(java.lang.Boolean.TRUE));
        } else if (kmAnnotationArgument instanceof kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.ULongValue) {
            newBuilder.setType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.LONG);
            newBuilder.setIntValue(((kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.ULongValue) kmAnnotationArgument).m23894getValuesVKNKU());
            newBuilder.setFlags(kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_UNSIGNED.toFlags(java.lang.Boolean.TRUE));
        } else if (kmAnnotationArgument instanceof kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.StringValue) {
            newBuilder.setType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.STRING);
            newBuilder.setStringValue(stringTable.getStringIndex(((kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.StringValue) kmAnnotationArgument).getValue()));
        } else if (kmAnnotationArgument instanceof kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.KClassValue) {
            newBuilder.setType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.CLASS);
            newBuilder.setClassId(getClassNameIndex(stringTable, ((kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.KClassValue) kmAnnotationArgument).getClassName()));
        } else if (kmAnnotationArgument instanceof kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.ArrayKClassValue) {
            newBuilder.setType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.CLASS);
            kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.ArrayKClassValue arrayKClassValue = (kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.ArrayKClassValue) kmAnnotationArgument;
            newBuilder.setClassId(getClassNameIndex(stringTable, arrayKClassValue.getClassName()));
            newBuilder.setArrayDimensionCount(arrayKClassValue.getArrayDimensionCount());
        } else if (kmAnnotationArgument instanceof kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.EnumValue) {
            newBuilder.setType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.ENUM);
            kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.EnumValue enumValue = (kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.EnumValue) kmAnnotationArgument;
            newBuilder.setClassId(getClassNameIndex(stringTable, enumValue.getEnumClassName()));
            newBuilder.setEnumValueId(stringTable.getStringIndex(enumValue.getEnumEntryName()));
        } else if (kmAnnotationArgument instanceof kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.AnnotationValue) {
            newBuilder.setType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.ANNOTATION);
            newBuilder.setAnnotation(writeAnnotation(((kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.AnnotationValue) kmAnnotationArgument).getAnnotation(), stringTable).build());
        } else {
            if (!(kmAnnotationArgument instanceof kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.ArrayValue)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            newBuilder.setType(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type.ARRAY);
            java.util.Iterator<kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument> it = ((kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.ArrayValue) kmAnnotationArgument).getElements().iterator();
            while (it.hasNext()) {
                newBuilder.addArrayElement(writeAnnotationArgument(it.next(), stringTable));
            }
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newBuilder, "");
        return newBuilder;
    }

    public static final int getClassNameIndex(kotlin.reflect.jvm.internal.impl.metadata.serialization.StringTable stringTable, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringTable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (kotlin.reflect.jvm.internal.impl.km.ClassNameKt.isLocalClassName(str)) {
            java.lang.String substring = str.substring(1);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
            return stringTable.getQualifiedClassNameIndex(substring, true);
        }
        return stringTable.getQualifiedClassNameIndex(str, false);
    }
}
