package kotlin.reflect.jvm.internal.impl.resolve.constants;

/* loaded from: classes5.dex */
public final class ConstantValueFactory {
    public static final kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory INSTANCE = new kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory();

    private ConstantValueFactory() {
    }

    public final kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue createArrayValue(java.util.List<? extends kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>> list, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        return new kotlin.reflect.jvm.internal.impl.resolve.constants.TypedArrayValue(list, kotlinType);
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue createConstantValue$default(kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory constantValueFactory, java.lang.Object obj, kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor, int i, java.lang.Object obj2) {
        if ((i & 2) != 0) {
            moduleDescriptor = null;
        }
        return constantValueFactory.createConstantValue(obj, moduleDescriptor);
    }

    public final kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> createConstantValue(java.lang.Object obj, kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor) {
        if (obj instanceof java.lang.Byte) {
            return new kotlin.reflect.jvm.internal.impl.resolve.constants.ByteValue(((java.lang.Number) obj).byteValue());
        }
        if (obj instanceof java.lang.Short) {
            return new kotlin.reflect.jvm.internal.impl.resolve.constants.ShortValue(((java.lang.Number) obj).shortValue());
        }
        if (obj instanceof java.lang.Integer) {
            return new kotlin.reflect.jvm.internal.impl.resolve.constants.IntValue(((java.lang.Number) obj).intValue());
        }
        if (obj instanceof java.lang.Long) {
            return new kotlin.reflect.jvm.internal.impl.resolve.constants.LongValue(((java.lang.Number) obj).longValue());
        }
        if (obj instanceof java.lang.Character) {
            return new kotlin.reflect.jvm.internal.impl.resolve.constants.CharValue(((java.lang.Character) obj).charValue());
        }
        if (obj instanceof java.lang.Float) {
            return new kotlin.reflect.jvm.internal.impl.resolve.constants.FloatValue(((java.lang.Number) obj).floatValue());
        }
        if (obj instanceof java.lang.Double) {
            return new kotlin.reflect.jvm.internal.impl.resolve.constants.DoubleValue(((java.lang.Number) obj).doubleValue());
        }
        if (obj instanceof java.lang.Boolean) {
            return new kotlin.reflect.jvm.internal.impl.resolve.constants.BooleanValue(((java.lang.Boolean) obj).booleanValue());
        }
        if (obj instanceof java.lang.String) {
            return new kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue((java.lang.String) obj);
        }
        if (obj instanceof byte[]) {
            return getHighResolutionOutputSizeshNQ4ISI(kotlin.collections.ArraysKt.toList((byte[]) obj), moduleDescriptor, kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.BYTE);
        }
        if (obj instanceof short[]) {
            return getHighResolutionOutputSizeshNQ4ISI(kotlin.collections.ArraysKt.toList((short[]) obj), moduleDescriptor, kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.SHORT);
        }
        if (obj instanceof int[]) {
            return getHighResolutionOutputSizeshNQ4ISI(kotlin.collections.ArraysKt.toList((int[]) obj), moduleDescriptor, kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.INT);
        }
        if (obj instanceof long[]) {
            return getHighResolutionOutputSizeshNQ4ISI(kotlin.collections.ArraysKt.toList((long[]) obj), moduleDescriptor, kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.LONG);
        }
        if (obj instanceof char[]) {
            return getHighResolutionOutputSizeshNQ4ISI(kotlin.collections.ArraysKt.toList((char[]) obj), moduleDescriptor, kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.CHAR);
        }
        if (obj instanceof float[]) {
            return getHighResolutionOutputSizeshNQ4ISI(kotlin.collections.ArraysKt.toList((float[]) obj), moduleDescriptor, kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.FLOAT);
        }
        if (obj instanceof double[]) {
            return getHighResolutionOutputSizeshNQ4ISI(kotlin.collections.ArraysKt.toList((double[]) obj), moduleDescriptor, kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.DOUBLE);
        }
        if (obj instanceof boolean[]) {
            return getHighResolutionOutputSizeshNQ4ISI(kotlin.collections.ArraysKt.toList((boolean[]) obj), moduleDescriptor, kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.BOOLEAN);
        }
        if (obj == null) {
            return new kotlin.reflect.jvm.internal.impl.resolve.constants.NullValue();
        }
        return null;
    }

    private final kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue getHighResolutionOutputSizeshNQ4ISI(java.util.List<?> list, kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor, final kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType primitiveType) {
        java.util.List list2 = kotlin.collections.CollectionsKt.toList(list);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue createConstantValue$default = createConstantValue$default(this, it.next(), null, 2, null);
            if (createConstantValue$default != null) {
                arrayList.add(createConstantValue$default);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        if (moduleDescriptor != null) {
            kotlin.reflect.jvm.internal.impl.types.SimpleType primitiveArrayKotlinType = moduleDescriptor.getBuiltIns().getPrimitiveArrayKotlinType(primitiveType);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(primitiveArrayKotlinType, "");
            return new kotlin.reflect.jvm.internal.impl.resolve.constants.TypedArrayValue(arrayList2, primitiveArrayKotlinType);
        }
        return new kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue(arrayList2, new kotlin.jvm.functions.Function1(primitiveType) { // from class: kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory$$Lambda$0
            private final kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType Camera2StreamConfigurationMap;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory.getHighSpeedVideoFpsRanges(this.Camera2StreamConfigurationMap, (kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor) obj);
            }

            {
                this.Camera2StreamConfigurationMap = primitiveType;
            }
        });
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.KotlinType getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType primitiveType, kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleDescriptor, "");
        kotlin.reflect.jvm.internal.impl.types.SimpleType primitiveArrayKotlinType = moduleDescriptor.getBuiltIns().getPrimitiveArrayKotlinType(primitiveType);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(primitiveArrayKotlinType, "");
        return primitiveArrayKotlinType;
    }
}
