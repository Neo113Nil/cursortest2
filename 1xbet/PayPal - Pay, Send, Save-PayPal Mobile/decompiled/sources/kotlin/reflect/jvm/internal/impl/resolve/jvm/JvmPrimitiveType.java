package kotlin.reflect.jvm.internal.impl.resolve.jvm;

/* loaded from: classes5.dex */
public enum JvmPrimitiveType {
    BOOLEAN(kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.BOOLEAN, androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_BOOLEAN, "Z", "java.lang.Boolean"),
    CHAR(kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.CHAR, "char", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "java.lang.Character"),
    BYTE(kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.BYTE, "byte", "B", "java.lang.Byte"),
    SHORT(kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.SHORT, "short", "S", "java.lang.Short"),
    INT(kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.INT, com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesEngineConstants.Transform.TRANSFORM_TO_INT, com.visa.cbp.getEncExpo.warmup, "java.lang.Integer"),
    FLOAT(kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.FLOAT, androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_FLOAT, com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "java.lang.Float"),
    LONG(kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.LONG, com.adjust.sdk.Constants.LONG, "J", "java.lang.Long"),
    DOUBLE(kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.DOUBLE, com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesEngineConstants.Transform.TRANSFORM_TO_DOUBLE, "D", "java.lang.Double");

    private final java.lang.String getInputFormats;
    private final kotlin.reflect.jvm.internal.impl.name.FqName getInputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType getOutputFormats;
    private final java.lang.String getOutputMinFrameDuration;
    private static final java.util.Map<java.lang.String, kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType> getHighResolutionOutputSizeshNQ4ISI = new java.util.HashMap();
    private static final java.util.Map<kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType, kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType> Camera2StreamConfigurationMap = new java.util.EnumMap(kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.class);
    private static final java.util.Map<java.lang.String, kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType> getHighSpeedVideoSizes = new java.util.HashMap();
    private static final java.util.Set<java.lang.String> getHighSpeedVideoSizesFor = new java.util.HashSet();
    private static final java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoFpsRangesFor = new java.util.HashMap();

    static {
        for (kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType jvmPrimitiveType : values()) {
            getHighResolutionOutputSizeshNQ4ISI.put(jvmPrimitiveType.getJavaKeywordName(), jvmPrimitiveType);
            Camera2StreamConfigurationMap.put(jvmPrimitiveType.getPrimitiveType(), jvmPrimitiveType);
            getHighSpeedVideoSizes.put(jvmPrimitiveType.getDesc(), jvmPrimitiveType);
            java.lang.String replace = jvmPrimitiveType.getInputSizeshNQ4ISI.asString().replace(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR, kotlinx.io.files.FileSystemKt.UnixPathSeparator);
            getHighSpeedVideoSizesFor.add(replace);
            java.util.Map<java.lang.String, java.lang.String> map = getHighSpeedVideoFpsRangesFor;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("(");
            sb.append(jvmPrimitiveType.getInputFormats);
            sb.append(")L");
            sb.append(replace);
            sb.append(";");
            map.put(replace, sb.toString());
        }
    }

    public static kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType get(java.lang.String str) {
        if (str == null) {
            getHighResolutionOutputSizeshNQ4ISI(3);
        }
        kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType jvmPrimitiveType = getHighResolutionOutputSizeshNQ4ISI.get(str);
        if (jvmPrimitiveType == null) {
            throw new java.lang.AssertionError("Non-primitive type name passed: ".concat(java.lang.String.valueOf(str)));
        }
        if (jvmPrimitiveType == null) {
            getHighResolutionOutputSizeshNQ4ISI(4);
        }
        return jvmPrimitiveType;
    }

    public static kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType get(kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType primitiveType) {
        if (primitiveType == null) {
            getHighResolutionOutputSizeshNQ4ISI(5);
        }
        kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType jvmPrimitiveType = Camera2StreamConfigurationMap.get(primitiveType);
        if (jvmPrimitiveType == null) {
            getHighResolutionOutputSizeshNQ4ISI(6);
        }
        return jvmPrimitiveType;
    }

    JvmPrimitiveType(kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType primitiveType, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (primitiveType == null) {
            getHighResolutionOutputSizeshNQ4ISI(8);
        }
        this.getOutputFormats = primitiveType;
        this.getOutputMinFrameDuration = str;
        this.getInputFormats = str2;
        this.getInputSizeshNQ4ISI = new kotlin.reflect.jvm.internal.impl.name.FqName(str3);
    }

    public final kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType getPrimitiveType() {
        kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType primitiveType = this.getOutputFormats;
        if (primitiveType == null) {
            getHighResolutionOutputSizeshNQ4ISI(12);
        }
        return primitiveType;
    }

    public final java.lang.String getJavaKeywordName() {
        java.lang.String str = this.getOutputMinFrameDuration;
        if (str == null) {
            getHighResolutionOutputSizeshNQ4ISI(13);
        }
        return str;
    }

    public final java.lang.String getDesc() {
        java.lang.String str = this.getInputFormats;
        if (str == null) {
            getHighResolutionOutputSizeshNQ4ISI(14);
        }
        return str;
    }

    public final kotlin.reflect.jvm.internal.impl.name.FqName getWrapperFqName() {
        kotlin.reflect.jvm.internal.impl.name.FqName fqName = this.getInputSizeshNQ4ISI;
        if (fqName == null) {
            getHighResolutionOutputSizeshNQ4ISI(15);
        }
        return fqName;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0050 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(int i) {
        java.lang.String str;
        int i2;
        java.lang.Object[] objArr;
        if (i != 4 && i != 6) {
            switch (i) {
                case 12:
                case 13:
                case 14:
                case 15:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            if (i != 4 && i != 6) {
                switch (i) {
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        break;
                    default:
                        i2 = 3;
                        break;
                }
                objArr = new java.lang.Object[i2];
                switch (i) {
                    case 1:
                        objArr[0] = com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Owner;
                        break;
                    case 2:
                        objArr[0] = "methodDescriptor";
                        break;
                    case 3:
                    case 9:
                        objArr[0] = "name";
                        break;
                    case 4:
                    case 6:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                        break;
                    case 5:
                        objArr[0] = "type";
                        break;
                    case 7:
                    case 10:
                        objArr[0] = "desc";
                        break;
                    case 8:
                        objArr[0] = "primitiveType";
                        break;
                    case 11:
                        objArr[0] = "wrapperClassName";
                        break;
                    default:
                        objArr[0] = "internalName";
                        break;
                }
                if (i == 4 && i != 6) {
                    switch (i) {
                        case 12:
                            objArr[1] = "getPrimitiveType";
                            break;
                        case 13:
                            objArr[1] = "getJavaKeywordName";
                            break;
                        case 14:
                            objArr[1] = "getDesc";
                            break;
                        case 15:
                            objArr[1] = "getWrapperFqName";
                            break;
                        default:
                            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                            break;
                    }
                } else {
                    objArr[1] = "get";
                }
                switch (i) {
                    case 1:
                    case 2:
                        objArr[2] = "isBoxingMethodDescriptor";
                        break;
                    case 3:
                    case 5:
                        objArr[2] = "get";
                        break;
                    case 4:
                    case 6:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        break;
                    case 7:
                        objArr[2] = "getByDesc";
                        break;
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                        objArr[2] = "<init>";
                        break;
                    default:
                        objArr[2] = "isWrapperClassInternalName";
                        break;
                }
                java.lang.String format = java.lang.String.format(str, objArr);
                if (i != 4 && i != 6) {
                    switch (i) {
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                            break;
                        default:
                            throw new java.lang.IllegalArgumentException(format);
                    }
                }
                throw new java.lang.IllegalStateException(format);
            }
            i2 = 2;
            objArr = new java.lang.Object[i2];
            switch (i) {
            }
            if (i == 4) {
            }
            objArr[1] = "get";
            switch (i) {
            }
            java.lang.String format2 = java.lang.String.format(str, objArr);
            if (i != 4) {
                switch (i) {
                }
            }
            throw new java.lang.IllegalStateException(format2);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i != 4) {
            switch (i) {
            }
            objArr = new java.lang.Object[i2];
            switch (i) {
            }
            if (i == 4) {
            }
            objArr[1] = "get";
            switch (i) {
            }
            java.lang.String format22 = java.lang.String.format(str, objArr);
            if (i != 4) {
            }
            throw new java.lang.IllegalStateException(format22);
        }
        i2 = 2;
        objArr = new java.lang.Object[i2];
        switch (i) {
        }
        if (i == 4) {
        }
        objArr[1] = "get";
        switch (i) {
        }
        java.lang.String format222 = java.lang.String.format(str, objArr);
        if (i != 4) {
        }
        throw new java.lang.IllegalStateException(format222);
    }
}
