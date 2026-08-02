package com.visa.cbp.external.common;

/* loaded from: classes16.dex */
public class NullAndLengthValidator {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] BuildConfig;
    private static int ConfirmReplenishRequest;
    private static boolean ReplenishAckRequest;
    public static final java.lang.String TAG;
    private static int getTvls;
    private static boolean valueOf;
    private static int values;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, short s, java.lang.Object[] objArr) {
        int i3;
        int i4;
        int i5 = (i * 4) + 4;
        byte[] bArr = $$a;
        int i6 = 116 - (i2 * 5);
        int i7 = s * 3;
        byte[] bArr2 = new byte[i7 + 1];
        if (bArr == null) {
            int i8 = i6;
            i3 = 0;
            i4 = i5;
            i5 += -i8;
            i4++;
            bArr2[i3] = (byte) i5;
            if (i3 == i7) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i8 = bArr[i4];
            i3++;
            i5 += -i8;
            i4++;
            bArr2[i3] = (byte) i5;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            i4 = i5;
            i5 = i6;
            bArr2[i3] = (byte) i5;
            if (i3 == i7) {
            }
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        values = 0;
        getTvls = 1;
        BuildConfig();
        TAG = "NullAndLengthValidator";
        values = (getTvls + 5) % 128;
    }

    public static void processAnnotations(java.lang.Object obj) {
        java.lang.Class<?> cls;
        if (obj == null) {
            com.visa.cbp.setDeviceCerts setdevicecerts = com.visa.cbp.setDeviceCerts.getEncryptionMetaData;
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(128 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), null, null, "\u0088\u0089\u008d\u0088\u008b\u0088\u008c\u0088\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0083\u0082\u0081", objArr);
            throw new com.visa.cbp.sdk.facade.exception.InvalidInputException(setdevicecerts, ((java.lang.String) objArr[0]).intern());
        }
        if (!(obj instanceof java.lang.reflect.Field)) {
            cls = obj.getClass();
            values = (getTvls + 81) % 128;
        } else {
            int i = values + 115;
            getTvls = i % 128;
            if (i % 2 == 0) {
                ((java.lang.reflect.Field) obj).getType();
                throw new java.lang.ArithmeticException();
            }
            cls = ((java.lang.reflect.Field) obj).getType();
        }
        for (java.lang.reflect.Field field : cls.getDeclaredFields()) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(com.visa.cbp.external.common.NullAndLengthValidate.class)) {
                com.visa.cbp.external.common.NullAndLengthValidate nullAndLengthValidate = (com.visa.cbp.external.common.NullAndLengthValidate) field.getAnnotation(com.visa.cbp.external.common.NullAndLengthValidate.class);
                checkNullAndValidLengthThrow(obj, nullAndLengthValidate.length(), null, field);
                nullAndLengthValidate.regEx();
            } else {
                checkIfNotNullAndProcessAnnotation(obj, null, field);
                getTvls = (values + 61) % 128;
            }
        }
    }

    public static boolean validateText(java.lang.String str, java.lang.String str2) {
        values = (getTvls + 57) % 128;
        boolean matches = java.util.regex.Pattern.compile(str, 34).matcher(str2).matches();
        int i = values + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        getTvls = i % 128;
        if (i % 2 != 0) {
            return matches;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005d, code lost:
    
        if (r2.startsWith(((java.lang.String) r5[0]).intern()) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void checkNullAndValidLengthThrow(java.lang.Object obj, int i, java.lang.Object obj2, java.lang.reflect.Field field) {
        try {
            java.lang.Object obj3 = field.get(obj);
            if (obj3 != null) {
                int i2 = getTvls + 87;
                values = i2 % 128;
                if (i2 % 2 != 0) {
                    java.lang.String name2 = field.getType().getName();
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    a(113 / (android.view.ViewConfiguration.getWindowTouchSlop() << 107), null, null, "\u0095\u0091\u0096\u0092\u0090\u0095\u0094\u0085\u0089", objArr);
                    if (name2.startsWith(((java.lang.String) objArr[0]).intern())) {
                        field.setAccessible(true);
                        processAnnotations(obj3);
                        return;
                    }
                } else {
                    java.lang.String name3 = field.getType().getName();
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    a(127 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), null, null, "\u0095\u0091\u0096\u0092\u0090\u0095\u0094\u0085\u0089", objArr2);
                }
            }
            if (obj3 == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                a(128 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), null, null, "\u0084\u0093\u0083\u0088\u0092\u008c\u0084\u0088\u008f\u008a\u0084\u008c\u0085\u0084\u0088\u0082\u0083\u0091\u0090\u0084\u0088\u008f\u008e", objArr3);
                sb.append(((java.lang.String) objArr3[0]).intern());
                sb.append(field.getName());
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                a(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 128, null, null, "\u0095\u0099\u0099\u0098\u0081\u0084\u0088\u0086\u0084\u008a\u0097\u008d\u0091\u0089\u0084", objArr4);
                sb.append(((java.lang.String) objArr4[0]).intern());
                throw new java.lang.NullPointerException(sb.toString());
            }
            if (!(obj3 instanceof java.lang.String)) {
                if (!(obj3 instanceof byte[])) {
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    a(128 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), null, null, "\u0095\u0093\u0088\u008a\u0089\u0088\u009e\u009d\u0088\u0084\u0096\u0092\u0084\u009b\u0091\u008b\u008b\u0091\u0084\u0088\u008a\u009b\u0086\u0084\u008b\u0085\u0084\u009c\u008d\u0092\u008b\u008a\u0096\u0084\u008b\u0088\u008f\u008a\u0092\u0088\u0084\u009b\u0083\u008d\u009a", objArr5);
                    throw new java.lang.UnsupportedOperationException(((java.lang.String) objArr5[0]).intern());
                }
                byte[] bArr = (byte[]) obj3;
                if ("".equals(bArr) || bArr.length != i) {
                    throw new com.visa.cbp.sdk.facade.exception.InvalidInputException(com.visa.cbp.setDeviceCerts.ReplenishResponse);
                }
                return;
            }
            values = (getTvls + 115) % 128;
            java.lang.String str = (java.lang.String) obj3;
            if (i != 0 && ("".equals(str) || str.length() != i)) {
                throw new com.visa.cbp.sdk.facade.exception.InvalidInputException(com.visa.cbp.setDeviceCerts.ReplenishResponse);
            }
            int i3 = getTvls + 59;
            values = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
        } catch (java.lang.IllegalAccessException e) {
            e.getMessage();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
    
        if (r8.startsWith(((java.lang.String) r5[0]).intern()) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void checkIfNotNullAndProcessAnnotation(java.lang.Object obj, java.lang.Object obj2, java.lang.reflect.Field field) {
        int i = getTvls + 81;
        values = i % 128;
        try {
            if (i % 2 != 0) {
                java.lang.String name2 = field.getType().getName();
                java.lang.Object[] objArr = new java.lang.Object[1];
                a(31 >> (android.view.ViewConfiguration.getFadingEdgeLength() * 27), null, null, "\u0095\u0091\u0096\u0092\u0090\u0095\u0094\u0085\u0089", objArr);
                if (name2.startsWith(((java.lang.String) objArr[0]).intern())) {
                    java.lang.Object obj3 = field.get(obj);
                    if (obj3 != null) {
                        getTvls = (values + 119) % 128;
                        field.setAccessible(true);
                        processAnnotations(obj3);
                    }
                }
                getTvls = (values + 17) % 128;
                return;
            }
            java.lang.String name3 = field.getType().getName();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a(127 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), null, null, "\u0095\u0091\u0096\u0092\u0090\u0095\u0094\u0085\u0089", objArr2);
        } catch (java.lang.IllegalAccessException e) {
            e.getMessage();
        }
        e.getMessage();
    }

    private static void a(int i, int[] iArr, java.lang.String str, java.lang.String str2, java.lang.Object[] objArr) {
        char[] cArr;
        java.lang.String str3 = str2;
        int i2 = ($11 + 99) % 128;
        $10 = i2;
        byte[] bArr = str3;
        if (str3 != null) {
            $11 = (i2 + 61) % 128;
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        if (str != null) {
            $11 = ($10 + 95) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.visa.cbp.setMac setmac = new com.visa.cbp.setMac();
        char[] cArr3 = BuildConfig;
        int i3 = 2;
        if (cArr3 != null) {
            $11 = ($10 + 9) % 128;
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                int i5 = $11 + 45;
                $10 = i5 % 128;
                if (i5 % i3 != 0) {
                    try {
                        java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr3[i4])};
                        java.lang.Object obj = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1013896520);
                        if (obj == null) {
                            obj = ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (30832 - (android.os.Process.myPid() >> 22)), 2019 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 29 - android.graphics.drawable.Drawable.resolveOpacity(0, 0))).getMethod("m", java.lang.Integer.TYPE);
                            com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1013896520, obj);
                        }
                        cArr4[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(cArr3[i4])};
                        java.lang.Object obj2 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1013896520);
                        if (obj2 == null) {
                            obj2 = ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (30880 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), 1971 - android.view.KeyEvent.normalizeMetaState(0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 29)).getMethod("m", java.lang.Integer.TYPE);
                            com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1013896520, obj2);
                        }
                        cArr4[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).charValue();
                        i4++;
                    } catch (java.lang.Throwable th2) {
                        java.lang.Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i3 = 2;
            }
            cArr3 = cArr4;
        }
        try {
            java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(ConfirmReplenishRequest)};
            java.lang.Object obj3 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(892366433);
            if (obj3 == null) {
                java.lang.Class cls = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.view.ViewConfiguration.getTapTimeout() >> 16), 959 - android.graphics.Color.green(0), android.view.KeyEvent.normalizeMetaState(0) + 20);
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                b(0, 1, (short) 0, objArr5);
                obj3 = cls.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE);
                com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(892366433, obj3);
            }
            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue();
            if (ReplenishAckRequest) {
                $10 = ($11 + 47) % 128;
                setmac.BuildConfig = bArr2.length;
                char[] cArr5 = new char[setmac.BuildConfig];
                setmac.valueOf = 0;
                while (setmac.valueOf < setmac.BuildConfig) {
                    int i6 = $10 + 67;
                    $11 = i6 % 128;
                    if (i6 % 2 == 0) {
                        cArr5[setmac.valueOf] = (char) (cArr3[bArr2[setmac.BuildConfig / setmac.valueOf] >>> i] % intValue);
                        try {
                            java.lang.Object[] objArr6 = {setmac, setmac};
                            java.lang.Object obj4 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-2053037684);
                            if (obj4 == null) {
                                java.lang.Class cls2 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.view.ViewConfiguration.getScrollBarSize() >> 8), android.os.Process.getGidForName("") + 258, 25 - (android.view.ViewConfiguration.getTouchSlop() >> 8));
                                java.lang.Object[] objArr7 = new java.lang.Object[1];
                                b(0, 0, (short) 0, objArr7);
                                obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                                com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-2053037684, obj4);
                            }
                            ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
                        } catch (java.lang.Throwable th3) {
                            java.lang.Throwable cause3 = th3.getCause();
                            if (cause3 == null) {
                                throw th3;
                            }
                            throw cause3;
                        }
                    } else {
                        cArr5[setmac.valueOf] = (char) (cArr3[bArr2[(setmac.BuildConfig - 1) - setmac.valueOf] + i] - intValue);
                        try {
                            java.lang.Object[] objArr8 = {setmac, setmac};
                            java.lang.Object obj5 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-2053037684);
                            if (obj5 == null) {
                                java.lang.Class cls3 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 257 - android.view.View.combineMeasuredStates(0, 0), 25 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16));
                                java.lang.Object[] objArr9 = new java.lang.Object[1];
                                b(0, 0, (short) 0, objArr9);
                                obj5 = cls3.getMethod((java.lang.String) objArr9[0], java.lang.Object.class, java.lang.Object.class);
                                com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-2053037684, obj5);
                            }
                            ((java.lang.reflect.Method) obj5).invoke(null, objArr8);
                        } catch (java.lang.Throwable th4) {
                            java.lang.Throwable cause4 = th4.getCause();
                            if (cause4 == null) {
                                throw th4;
                            }
                            throw cause4;
                        }
                    }
                }
                objArr[0] = new java.lang.String(cArr5);
                return;
            }
            if (!valueOf) {
                setmac.BuildConfig = iArr.length;
                char[] cArr6 = new char[setmac.BuildConfig];
                setmac.valueOf = 0;
                while (setmac.valueOf < setmac.BuildConfig) {
                    cArr6[setmac.valueOf] = (char) (cArr3[iArr[(setmac.BuildConfig - 1) - setmac.valueOf] - i] - intValue);
                    setmac.valueOf++;
                }
                objArr[0] = new java.lang.String(cArr6);
                return;
            }
            setmac.BuildConfig = cArr2.length;
            char[] cArr7 = new char[setmac.BuildConfig];
            setmac.valueOf = 0;
            while (setmac.valueOf < setmac.BuildConfig) {
                int i7 = $10 + 19;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    cArr7[setmac.valueOf] = (char) (cArr3[cArr2[(setmac.BuildConfig % 1) >>> setmac.valueOf] + i] >>> intValue);
                    try {
                        java.lang.Object[] objArr10 = {setmac, setmac};
                        java.lang.Object obj6 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-2053037684);
                        if (obj6 == null) {
                            java.lang.Class cls4 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), 257 - android.view.View.combineMeasuredStates(0, 0), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 25);
                            java.lang.Object[] objArr11 = new java.lang.Object[1];
                            b(0, 0, (short) 0, objArr11);
                            obj6 = cls4.getMethod((java.lang.String) objArr11[0], java.lang.Object.class, java.lang.Object.class);
                            com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-2053037684, obj6);
                        }
                        ((java.lang.reflect.Method) obj6).invoke(null, objArr10);
                    } catch (java.lang.Throwable th5) {
                        java.lang.Throwable cause5 = th5.getCause();
                        if (cause5 == null) {
                            throw th5;
                        }
                        throw cause5;
                    }
                } else {
                    cArr7[setmac.valueOf] = (char) (cArr3[cArr2[(setmac.BuildConfig - 1) - setmac.valueOf] - i] - intValue);
                    try {
                        java.lang.Object[] objArr12 = {setmac, setmac};
                        java.lang.Object obj7 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-2053037684);
                        if (obj7 == null) {
                            java.lang.Class cls5 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) ((android.os.Process.getThreadPriority(0) + 20) >> 6), 257 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), android.view.Gravity.getAbsoluteGravity(0, 0) + 25);
                            java.lang.Object[] objArr13 = new java.lang.Object[1];
                            b(0, 0, (short) 0, objArr13);
                            obj7 = cls5.getMethod((java.lang.String) objArr13[0], java.lang.Object.class, java.lang.Object.class);
                            com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-2053037684, obj7);
                        }
                        ((java.lang.reflect.Method) obj7).invoke(null, objArr12);
                    } catch (java.lang.Throwable th6) {
                        java.lang.Throwable cause6 = th6.getCause();
                        if (cause6 == null) {
                            throw th6;
                        }
                        throw cause6;
                    }
                }
            }
            objArr[0] = new java.lang.String(cArr7);
        } catch (java.lang.Throwable th7) {
            java.lang.Throwable cause7 = th7.getCause();
            if (cause7 == null) {
                throw th7;
            }
            throw cause7;
        }
    }

    static void init$0() {
        $$a = new byte[]{33, 5, -51, -77};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE;
    }

    static void BuildConfig() {
        valueOf = true;
        ReplenishAckRequest = true;
        ConfirmReplenishRequest = 514420703;
        BuildConfig = new char[]{28557, 28258, 28267, 28607, 28268, 28273, 28265, 28274, 28272, 28259, 28257, 28277, 28269, 28547, 28279, 28261, 28286, 28278, 28275, 28266, 28589, 28256, 28596, 28546, 28555, 28556, 28262, 28276, 28263, 28271};
    }
}
