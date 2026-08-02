package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* loaded from: classes5.dex */
final class JvmTypeFactoryImpl implements kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory<kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType> {
    public static final kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactoryImpl getHighSpeedVideoFpsRanges = new kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactoryImpl();

    private JvmTypeFactoryImpl() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory
    public final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType boxType(kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType jvmType) {
        kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType jvmType2 = jvmType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jvmType2, "");
        if (!(jvmType2 instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Primitive)) {
            return jvmType2;
        }
        kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Primitive primitive = (kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Primitive) jvmType2;
        if (primitive.getJvmPrimitiveType() == null) {
            return jvmType2;
        }
        java.lang.String internalName = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName.byFqNameWithoutInnerClasses(primitive.getJvmPrimitiveType().getWrapperFqName()).getInternalName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(internalName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalName, "");
        return new kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Object(internalName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory
    public final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType createObjectType(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return new kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Object(str);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory
    public final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType createPrimitiveType(kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType primitiveType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(primitiveType, "");
        switch (kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactoryImpl.WhenMappings.$EnumSwitchMapping$0[primitiveType.ordinal()]) {
            case 1:
                return kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Companion.getBOOLEAN$descriptors_jvm();
            case 2:
                return kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Companion.getCHAR$descriptors_jvm();
            case 3:
                return kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Companion.getBYTE$descriptors_jvm();
            case 4:
                return kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Companion.getSHORT$descriptors_jvm();
            case 5:
                return kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Companion.getINT$descriptors_jvm();
            case 6:
                return kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Companion.getFLOAT$descriptors_jvm();
            case 7:
                return kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Companion.getLONG$descriptors_jvm();
            case 8:
                return kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Companion.getDOUBLE$descriptors_jvm();
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory
    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType createFromString(java.lang.String str) {
        kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType jvmPrimitiveType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = str;
        char charAt = str.charAt(0);
        kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType[] values = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                jvmPrimitiveType = null;
                break;
            }
            jvmPrimitiveType = values[i];
            if (jvmPrimitiveType.getDesc().charAt(0) == charAt) {
                break;
            }
            i++;
        }
        if (jvmPrimitiveType != null) {
            return new kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Primitive(jvmPrimitiveType);
        }
        if (charAt == 'V') {
            return new kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Primitive(null);
        }
        if (charAt == '[') {
            java.lang.String substring = str.substring(1);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
            return new kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Array(createFromString(substring));
        }
        if (charAt == 'L') {
            kotlin.text.StringsKt.endsWith$default((java.lang.CharSequence) str2, ';', false, 2, (java.lang.Object) null);
        }
        java.lang.String substring2 = str.substring(1, str.length() - 1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
        return new kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Object(substring2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory
    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
    public final java.lang.String toString(kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType jvmType) {
        java.lang.String desc;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jvmType, "");
        if (jvmType instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Array) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
            sb.append(toString(((kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Array) jvmType).getElementType()));
            return sb.toString();
        }
        if (jvmType instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Primitive) {
            kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType jvmPrimitiveType = ((kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Primitive) jvmType).getJvmPrimitiveType();
            return (jvmPrimitiveType == null || (desc = jvmPrimitiveType.getDesc()) == null) ? "V" : desc;
        }
        if (!(jvmType instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Object)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("L");
        sb2.append(((kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Object) jvmType).getInternalName());
        sb2.append(';');
        return sb2.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory
    public final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType getJavaLangClassType() {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("java/lang/Class", "");
        return new kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Object("java/lang/Class");
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.values().length];
            try {
                iArr[kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.BOOLEAN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.CHAR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.BYTE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.SHORT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.INT.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.FLOAT.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.LONG.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.DOUBLE.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
