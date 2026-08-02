package com.payair.hce;

/* loaded from: classes4.dex */
public final class buildRecords {
    private final java.util.Map<java.lang.reflect.Type, com.payair.hce.RecordsJson<?>> DigitizedCardProfile;
    private final com.payair.hce.getPinAutomaticallyResetByApplication valueOf = com.payair.hce.getPinAutomaticallyResetByApplication.AlternateContactlessPaymentDataJson();

    public buildRecords(java.util.Map<java.lang.reflect.Type, com.payair.hce.RecordsJson<?>> map) {
        this.DigitizedCardProfile = map;
    }

    private <T> com.payair.hce.getMaximumPinTry<T> AlternateContactlessPaymentDataJson(java.lang.Class<? super T> cls) {
        try {
            final java.lang.reflect.Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new java.lang.Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.valueOf.writeReplace(declaredConstructor);
            }
            return new com.payair.hce.getMaximumPinTry<T>() { // from class: com.payair.hce.buildRecords.10
                @Override // com.payair.hce.getMaximumPinTry
                public final T DigitizedCardProfile() {
                    try {
                        try {
                            try {
                                return (T) declaredConstructor.newInstance(null);
                            } catch (java.lang.InstantiationException e) {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to invoke ");
                                sb.append(declaredConstructor);
                                sb.append(" with no args");
                                throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(java.lang.String.class, java.lang.Throwable.class).newInstance(sb.toString(), e));
                            }
                        } catch (java.lang.IllegalAccessException e2) {
                            throw new java.lang.AssertionError(e2);
                        } catch (java.lang.reflect.InvocationTargetException e3) {
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Failed to invoke ");
                            sb2.append(declaredConstructor);
                            sb2.append(" with no args");
                            throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(java.lang.String.class, java.lang.Throwable.class).newInstance(sb2.toString(), e3.getTargetException()));
                        }
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
            };
        } catch (java.lang.NoSuchMethodException unused) {
            return null;
        }
    }

    public final java.lang.String toString() {
        return this.DigitizedCardProfile.toString();
    }

    public final <T> com.payair.hce.getMaximumPinTry<T> values(com.payair.hce.getPinAlwaysRequiredIfCurrencyProvided<T> getpinalwaysrequiredifcurrencyprovided) {
        com.payair.hce.getMaximumPinTry<T> getmaximumpintry;
        final java.lang.reflect.Type type = getpinalwaysrequiredifcurrencyprovided.AlternateContactlessPaymentDataJson;
        final java.lang.Class<? super T> cls = getpinalwaysrequiredifcurrencyprovided.values;
        final com.payair.hce.RecordsJson<?> recordsJson = this.DigitizedCardProfile.get(type);
        if (recordsJson != null) {
            return new com.payair.hce.getMaximumPinTry<T>() { // from class: com.payair.hce.buildRecords.3
                @Override // com.payair.hce.getMaximumPinTry
                public final T DigitizedCardProfile() {
                    return (T) recordsJson.values();
                }
            };
        }
        final com.payair.hce.RecordsJson<?> recordsJson2 = this.DigitizedCardProfile.get(cls);
        if (recordsJson2 != null) {
            return new com.payair.hce.getMaximumPinTry<T>() { // from class: com.payair.hce.buildRecords.7
                @Override // com.payair.hce.getMaximumPinTry
                public final T DigitizedCardProfile() {
                    return (T) recordsJson2.values();
                }
            };
        }
        com.payair.hce.getMaximumPinTry<T> AlternateContactlessPaymentDataJson = AlternateContactlessPaymentDataJson(cls);
        if (AlternateContactlessPaymentDataJson != null) {
            return AlternateContactlessPaymentDataJson;
        }
        if (java.util.Collection.class.isAssignableFrom(cls)) {
            if (java.util.SortedSet.class.isAssignableFrom(cls)) {
                getmaximumpintry = new com.payair.hce.getMaximumPinTry<T>() { // from class: com.payair.hce.buildRecords.9
                    @Override // com.payair.hce.getMaximumPinTry
                    public final T DigitizedCardProfile() {
                        return (T) new java.util.TreeSet();
                    }
                };
            } else if (java.util.EnumSet.class.isAssignableFrom(cls)) {
                getmaximumpintry = new com.payair.hce.getMaximumPinTry<T>() { // from class: com.payair.hce.buildRecords.6
                    @Override // com.payair.hce.getMaximumPinTry
                    public final T DigitizedCardProfile() {
                        java.lang.reflect.Type type2 = type;
                        if (type2 instanceof java.lang.reflect.ParameterizedType) {
                            java.lang.reflect.Type type3 = ((java.lang.reflect.ParameterizedType) type2).getActualTypeArguments()[0];
                            if (type3 instanceof java.lang.Class) {
                                return (T) java.util.EnumSet.noneOf((java.lang.Class) type3);
                            }
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid EnumSet type: ");
                            sb.append(type.toString());
                            throw new com.payair.hce.getPaymentFci(sb.toString());
                        }
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Invalid EnumSet type: ");
                        sb2.append(type.toString());
                        throw new com.payair.hce.getPaymentFci(sb2.toString());
                    }
                };
            } else if (java.util.Set.class.isAssignableFrom(cls)) {
                getmaximumpintry = new com.payair.hce.getMaximumPinTry<T>() { // from class: com.payair.hce.buildRecords.15
                    @Override // com.payair.hce.getMaximumPinTry
                    public final T DigitizedCardProfile() {
                        return (T) new java.util.LinkedHashSet();
                    }
                };
            } else if (java.util.Queue.class.isAssignableFrom(cls)) {
                getmaximumpintry = new com.payair.hce.getMaximumPinTry<T>() { // from class: com.payair.hce.buildRecords.14
                    @Override // com.payair.hce.getMaximumPinTry
                    public final T DigitizedCardProfile() {
                        return (T) new java.util.ArrayDeque();
                    }
                };
            } else {
                getmaximumpintry = new com.payair.hce.getMaximumPinTry<T>() { // from class: com.payair.hce.buildRecords.12
                    @Override // com.payair.hce.getMaximumPinTry
                    public final T DigitizedCardProfile() {
                        return (T) new java.util.ArrayList();
                    }
                };
            }
        } else if (!java.util.Map.class.isAssignableFrom(cls)) {
            getmaximumpintry = null;
        } else if (java.util.concurrent.ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
            getmaximumpintry = new com.payair.hce.getMaximumPinTry<T>() { // from class: com.payair.hce.buildRecords.13
                @Override // com.payair.hce.getMaximumPinTry
                public final T DigitizedCardProfile() {
                    return (T) new java.util.concurrent.ConcurrentSkipListMap();
                }
            };
        } else if (java.util.concurrent.ConcurrentMap.class.isAssignableFrom(cls)) {
            getmaximumpintry = new com.payair.hce.getMaximumPinTry<T>() { // from class: com.payair.hce.buildRecords.2
                private static final byte[] $$a = null;
                private static final int $$b = 0;
                private static final byte[] $$d = null;
                private static final int $$e = 0;
                private static int $10;
                private static int $11;
                private static char AlternateContactlessPaymentDataJson;
                private static int RecordsJson;
                private static int SdkCoreAlternateContactlessPaymentDataImpl;
                private static long getProfileVersion;
                private static char valueOf;
                private static char values;
                private static char writeReplace;

                private static void a(byte b, short s, byte b2, java.lang.Object[] objArr) {
                    int i = b + 4;
                    int i2 = s * 4;
                    byte[] bArr = $$a;
                    int i3 = (b2 * 4) + 65;
                    byte[] bArr2 = new byte[i2 + 35];
                    int i4 = i2 + 34;
                    int i5 = -1;
                    if (bArr == null) {
                        i3 = (i3 + (-i4)) - 2;
                    }
                    while (true) {
                        i5++;
                        i++;
                        bArr2[i5] = (byte) i3;
                        if (i5 == i4) {
                            objArr[0] = new java.lang.String(bArr2, 0);
                            return;
                        }
                        i3 = (i3 + (-bArr[i])) - 2;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x0028). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private static void d(short s, short s2, byte b, java.lang.Object[] objArr) {
                    int i;
                    byte[] bArr = $$d;
                    int i2 = 3 - (s * 3);
                    int i3 = s2 * 2;
                    int i4 = b + 110;
                    byte[] bArr2 = new byte[i3 + 1];
                    if (bArr == null) {
                        int i5 = i3;
                        int i6 = 0;
                        i4 += -i5;
                        i = i6;
                        i2++;
                        bArr2[i] = (byte) i4;
                        i6 = i + 1;
                        if (i == i3) {
                            objArr[0] = new java.lang.String(bArr2, 0);
                            return;
                        }
                        i5 = bArr[i2];
                        i4 += -i5;
                        i = i6;
                        i2++;
                        bArr2[i] = (byte) i4;
                        i6 = i + 1;
                        if (i == i3) {
                        }
                    } else {
                        i = 0;
                        i2++;
                        bArr2[i] = (byte) i4;
                        i6 = i + 1;
                        if (i == i3) {
                        }
                    }
                }

                private static void c(java.lang.String str, int i, java.lang.Object[] objArr) {
                    char[] cArr;
                    $11 = ($10 + 101) % 128;
                    if (str != null) {
                        cArr = str.toCharArray();
                        int i2 = $11 + 71;
                        $10 = i2 % 128;
                        if (i2 % 2 != 0) {
                            int i3 = 5 / 3;
                        }
                    } else {
                        cArr = str;
                    }
                    char[] cArr2 = cArr;
                    com.payair.hce.getDsrpData getdsrpdata = new com.payair.hce.getDsrpData();
                    getdsrpdata.values = i;
                    int length = cArr2.length;
                    long[] jArr = new long[length];
                    getdsrpdata.valueOf = 0;
                    while (getdsrpdata.valueOf < cArr2.length) {
                        $11 = ($10 + 93) % 128;
                        int i4 = getdsrpdata.valueOf;
                        try {
                            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr2[getdsrpdata.valueOf]), getdsrpdata, getdsrpdata};
                            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2053068265);
                            if (obj == null) {
                                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(32 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), 1890 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 3601));
                                java.lang.Object[] objArr3 = new java.lang.Object[1];
                                d((short) 0, (short) 0, (byte) 3, objArr3);
                                obj = cls2.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2053068265, obj);
                            }
                            jArr[i4] = ((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue() ^ (getProfileVersion ^ (-4761752123935132024L));
                            java.lang.Object[] objArr4 = {getdsrpdata, getdsrpdata};
                            java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                            if (obj2 == null) {
                                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(64 - android.text.TextUtils.getTrimmedLength(""), 1443 - android.graphics.Color.argb(0, 0, 0, 0), (char) ((-16747534) - android.graphics.Color.rgb(0, 0, 0)));
                                java.lang.Object[] objArr5 = new java.lang.Object[1];
                                d((short) 0, (short) 0, (byte) 2, objArr5);
                                obj2 = cls3.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj2);
                            }
                            ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
                            $11 = ($10 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    char[] cArr3 = new char[length];
                    getdsrpdata.valueOf = 0;
                    while (getdsrpdata.valueOf < cArr2.length) {
                        cArr3[getdsrpdata.valueOf] = (char) jArr[getdsrpdata.valueOf];
                        java.lang.Object[] objArr6 = {getdsrpdata, getdsrpdata};
                        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                        if (obj3 == null) {
                            java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 65, 1443 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (29682 - android.text.TextUtils.indexOf("", "", 0, 0)));
                            java.lang.Object[] objArr7 = new java.lang.Object[1];
                            d((short) 0, (short) 0, (byte) 2, objArr7);
                            obj3 = cls4.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj3);
                        }
                        ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
                    }
                    objArr[0] = new java.lang.String(cArr3);
                }

                private static void b(java.lang.String str, int i, java.lang.Object[] objArr) {
                    char[] charArray = str != null ? str.toCharArray() : str;
                    com.payair.hce.getProductType getproducttype = new com.payair.hce.getProductType();
                    char[] cArr = new char[charArray.length];
                    getproducttype.AlternateContactlessPaymentDataJson = 0;
                    char[] cArr2 = new char[2];
                    while (getproducttype.AlternateContactlessPaymentDataJson < charArray.length) {
                        $11 = ($10 + 63) % 128;
                        cArr2[0] = charArray[getproducttype.AlternateContactlessPaymentDataJson];
                        cArr2[1] = charArray[getproducttype.AlternateContactlessPaymentDataJson + 1];
                        $10 = ($11 + 49) % 128;
                        int i2 = 58224;
                        for (int i3 = 0; i3 < 16; i3++) {
                            $11 = ($10 + 83) % 128;
                            char c = cArr2[1];
                            char c2 = cArr2[0];
                            try {
                                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf(((c2 << 4) + ((char) (values ^ 2144259807102049818L))) ^ r15), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(writeReplace)};
                                int i4 = c2 + i2;
                                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                                if (obj == null) {
                                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myTid() >> 22) + 62, (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1335, (char) (android.os.Process.myTid() >> 22));
                                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                                    d((short) 0, (short) 0, (byte) 0, objArr3);
                                    obj = cls2.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj);
                                }
                                char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                                cArr2[1] = charValue;
                                java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr2[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (valueOf ^ 2144259807102049818L))) ^ r15), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson)};
                                int i5 = charValue + i2;
                                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                                if (obj2 == null) {
                                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(62 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), 1335 - android.view.View.MeasureSpec.getSize(0), (char) android.text.TextUtils.indexOf("", "", 0));
                                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                                    d((short) 0, (short) 0, (byte) 0, objArr5);
                                    obj2 = cls3.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj2);
                                }
                                cArr2[0] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                                i2 -= 40503;
                            } catch (java.lang.Throwable th) {
                                java.lang.Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        cArr[getproducttype.AlternateContactlessPaymentDataJson] = cArr2[0];
                        cArr[getproducttype.AlternateContactlessPaymentDataJson + 1] = cArr2[1];
                        java.lang.Object[] objArr6 = {getproducttype, getproducttype};
                        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1765331150);
                        if (obj3 == null) {
                            obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - android.view.KeyEvent.keyCodeFromString(""), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 3543, (char) (android.view.ViewConfiguration.getTouchSlop() >> 8))).getMethod("r", java.lang.Object.class, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1765331150, obj3);
                        }
                        ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
                    }
                    objArr[0] = new java.lang.String(cArr, 0, i);
                }

                @Override // com.payair.hce.getMaximumPinTry
                public final T DigitizedCardProfile() {
                    T t = (T) new java.util.concurrent.ConcurrentHashMap();
                    int i = SdkCoreAlternateContactlessPaymentDataImpl + 59;
                    RecordsJson = i % 128;
                    if (i % 2 != 0) {
                        return t;
                    }
                    throw null;
                }

                static {
                    init$1();
                    $10 = 0;
                    $11 = 1;
                    init$0();
                    SdkCoreAlternateContactlessPaymentDataImpl = 0;
                    RecordsJson = 1;
                    valueOf = (char) 54812;
                    AlternateContactlessPaymentDataJson = (char) 65251;
                    values = (char) 18503;
                    writeReplace = (char) 20459;
                    getProfileVersion = -8642046157106515052L;
                }

                static void init$1() {
                    $$d = new byte[]{117, -13, -118, com.google.common.base.Ascii.RS};
                    $$e = 41;
                }

                static void init$0() {
                    $$a = new byte[]{106, 94, -55, -52, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.NAK, -43, 2, -1};
                    $$b = 86;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r19v11, types: [int] */
                /* JADX WARN: Type inference failed for: r19v2 */
                /* JADX WARN: Type inference failed for: r19v23 */
                /* JADX WARN: Type inference failed for: r19v3 */
                /* JADX WARN: Type inference failed for: r19v5 */
                public static java.lang.Object[] valueOf(android.content.Context context, int i, int i2) {
                    java.lang.Integer num;
                    int i3;
                    ?? r19;
                    java.lang.Object[] objArr;
                    java.lang.Object[] objArr2;
                    java.lang.Object[] objArr3;
                    try {
                        if (context == null) {
                            java.lang.Object[] objArr4 = {new int[]{i}, new int[]{i}, null, new int[1]};
                            int i4 = ~(328446040 | i);
                            java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf(((675303296 | i4) * (-814)) + 388476040 + ((i4 | (~((~i) | (-676482945))) | 327266392) * 407) + (((~(i | (-328446041))) | 327266392 | (~(676482944 | i))) * 407))};
                            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj == null) {
                                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 50, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 2714, (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)));
                                byte b = $$a[14];
                                byte b2 = (byte) (b + 1);
                                java.lang.Object[] objArr6 = new java.lang.Object[1];
                                a(b, b2, b2, objArr6);
                                obj = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj);
                            }
                            ((int[]) objArr4[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr5)).intValue();
                            return objArr4;
                        }
                        try {
                            int doubleTapTimeout = android.view.ViewConfiguration.getDoubleTapTimeout() >> 16;
                            try {
                                java.lang.Object[] objArr7 = new java.lang.Object[1];
                                b("⭦嫇\uf40a웑낹\ue677ﭥ⬤\ua63e\uefbd艋䄔作뿊\ue0cf疕搬\uefb2䊌忍ᑛ6괨ꍶđ춃⮬\ue58b뺃篂艋䄔鞘\ue924쀣酺⍵桯", ((doubleTapTimeout | 38) << 1) - (doubleTapTimeout ^ 38), objArr7);
                                objArr = (java.lang.Object[]) java.lang.reflect.Array.newInstance(java.lang.Class.forName((java.lang.String) objArr7[0]), 2);
                                int keyRepeatDelay = android.view.ViewConfiguration.getKeyRepeatDelay() >> 16;
                                objArr2 = new java.lang.Object[1];
                                c("蕟쳅ᘏ妘ꌮ\uea8b㳤虒짍ጷ嫚갥\uf66d㧕茫쪢᱀晔ꦿ\uf368㪾谛힔᧢捝\uaac7ﱦ䞲覥퍒\u1afd", ((keyRepeatDelay | 18839) << 1) - (keyRepeatDelay ^ 18839), objArr2);
                            } catch (java.lang.Throwable unused) {
                                r19 = 0;
                            }
                        } catch (java.lang.Throwable unused2) {
                            num = 0;
                            i3 = 1;
                        }
                        try {
                            try {
                                java.lang.Object[] objArr8 = {(java.lang.String) objArr2[0]};
                                int i5 = -android.widget.ExpandableListView.getPackedPositionGroup(0L);
                                java.lang.Object[] objArr9 = new java.lang.Object[1];
                                b("⭦嫇\uf40a웑낹\ue677ﭥ⬤\ua63e\uefbd艋䄔作뿊\ue0cf疕搬\uefb2䊌忍ᑛ6괨ꍶđ춃⮬\ue58b뺃篂艋䄔鞘\ue924쀣酺⍵桯", (i5 & 38) + (i5 | 38), objArr9);
                                objArr[0] = java.lang.Class.forName((java.lang.String) objArr9[0]).getDeclaredConstructor(java.lang.String.class).newInstance(objArr8);
                                int i6 = -(android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                objArr3 = new java.lang.Object[1];
                                c("蕟㊈\uea1bꎴ宔ጞ죗胂㠺\uf189꧴愰ẙ훭踎䞸ￂ뜘沿⓹\udc4c閳䷵՚늠檽≲\udbaa錂䭌µ", (47017 & i6) + (i6 | 47017), objArr3);
                            } catch (java.lang.Throwable unused3) {
                            }
                            try {
                                java.lang.Object[] objArr10 = {(java.lang.String) objArr3[0]};
                                int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                int i7 = lastIndexOf * (-661);
                                int i8 = (i7 & (-25779)) + (i7 | (-25779));
                                int i9 = ~i;
                                int i10 = ~lastIndexOf;
                                int i11 = ((~((i10 ^ (-40)) | (i10 & (-40)))) | i9) * 1324;
                                int i12 = ((i8 | i11) << 1) - (i8 ^ i11);
                                int i13 = ~((lastIndexOf ^ i) | (lastIndexOf & i));
                                int i14 = ~(i | 39);
                                int i15 = ((i13 ^ i14) | (i13 & i14)) * (-1324);
                                int i16 = ~(i10 | 39);
                                int i17 = ~((lastIndexOf & (-40)) | (lastIndexOf ^ (-40)));
                                java.lang.Object[] objArr11 = new java.lang.Object[1];
                                r19 = ((i12 | i15) << 1) - (i15 ^ i12);
                                b("⭦嫇\uf40a웑낹\ue677ﭥ⬤\ua63e\uefbd艋䄔作뿊\ue0cf疕搬\uefb2䊌忍ᑛ6괨ꍶđ춃⮬\ue58b뺃篂艋䄔鞘\ue924쀣酺⍵桯", r19 + (((i16 ^ i17) | (i16 & i17)) * 662), objArr11);
                                objArr[1] = java.lang.Class.forName((java.lang.String) objArr11[0]).getDeclaredConstructor(java.lang.String.class).newInstance(objArr10);
                                try {
                                    int i18 = -(-android.graphics.ImageFormat.getBitsPerPixel(0));
                                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                                    c("蕽勓⨺\u038d\udbf7덐袾恕㡷ᇚ\ue938욃黵癟侦❝ｏ퓂갠薛巭㕑ʾ", ((55202 | i18) << 1) - (i18 ^ 55202), objArr12);
                                    java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr12[0]);
                                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                                    c("蕻ﮈ碊烈纹ￊ糑\ufdea狳\uf300瀻\uf126瘾\uf740瑕\uf566橾", 32495 - (~(-((byte) android.view.KeyEvent.getModifierMetaStateMask()))), objArr13);
                                    java.lang.Object invoke = cls3.getMethod((java.lang.String) objArr13[0], null).invoke(context, null);
                                    try {
                                        int i19 = -android.view.View.resolveSizeAndState(0, 0, 0);
                                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                                        c("蕽勓⨺\u038d\udbf7덐袾恕㡷ᇚ\ue938욃黵癟侦❝ｏ퓂갠薛巭㕑ʾ", (55201 & i19) + (i19 | 55201), objArr14);
                                        java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr14[0]);
                                        int i20 = -android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                                        int i21 = i20 * 85;
                                        int i22 = ~i20;
                                        int i23 = ~((i22 ^ (-53268)) | (i22 & (-53268)));
                                        int i24 = ~((i22 ^ i9) | (i22 & i9));
                                        int i25 = (i23 ^ i24) | (i24 & i23);
                                        int i26 = ~((i9 ^ (-53268)) | (i9 & (-53268)));
                                        int i27 = (i25 ^ i26) | (i25 & i26);
                                        int i28 = (i20 ^ 53267) | (i20 & 53267);
                                        int i29 = ~((i28 ^ i) | (i28 & i));
                                        int i30 = ~((i ^ (-53268)) | ((-53268) & i));
                                        int i31 = (i20 & i30) | (i20 ^ i30);
                                        int i32 = ~((i9 ^ 53267) | (53267 & i9));
                                        int i33 = ~i28;
                                        r19 = 0;
                                        try {
                                            java.lang.Object[] objArr15 = new java.lang.Object[1];
                                            c("蕻啪╎\uf575씱锠攅㗸ף헒ꗬ疬䖕ᖎ", (((((i21 ^ 4527695) + ((i21 & 4527695) << 1)) + (((i27 ^ i29) | (i27 & i29)) * (-84))) + (((i31 ^ i32) | (i31 & i32)) * (-84))) - (~(-(-(((i33 ^ i32) | (i32 & i33)) * 84))))) - 1, objArr15);
                                            try {
                                                java.lang.Object[] objArr16 = {cls4.getMethod((java.lang.String) objArr15[0], null).invoke(context, null), 64};
                                                int i34 = -(android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                int i35 = i34 * (-518);
                                                int i36 = ~i34;
                                                int i37 = (i36 ^ i9) | (i36 & i9);
                                                int i38 = ~i37;
                                                int i39 = -(-(((i38 ^ 60077) | (i38 & 60077)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE));
                                                int i40 = ~((i37 ^ 60077) | (i37 & 60077));
                                                int i41 = (i34 ^ 60077) | (i34 & 60077);
                                                int i42 = ~((i41 ^ i) | (i41 & i));
                                                int i43 = ((((((-31119886) & i35) + (i35 | (-31119886))) - (~i39)) - 1) - (~(((i40 ^ i42) | (i40 & i42)) * (-519)))) - 1;
                                                int i44 = ~((i ^ 60077) | (i & 60077));
                                                int i45 = ((i34 ^ i44) | (i34 & i44)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE;
                                                java.lang.Object[] objArr17 = new java.lang.Object[1];
                                                c("蕽濟倢䕩⿇နն\uef89퀗앦꾰逇蕥澻倞䔑⾼ဌԘ\uef9b탹앎꾩郶蕃澜僃䕂⾞ფԽ\uef8a탎", (i43 ^ i45) + ((i45 & i43) << 1), objArr17);
                                                java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr17[0]);
                                                int i46 = -(android.view.ViewConfiguration.getJumpTapTimeout() >> 16);
                                                int i47 = i46 * com.knotapi.knot.utilities.Constants.ID_KROGER;
                                                int i48 = i46 | 5557;
                                                int i49 = ((((2056090 | i47) << 1) - (i47 ^ 2056090)) - (~(-(-(((i48 & i9) | (i48 ^ i9)) * (-369)))))) - 1;
                                                int i50 = ~i46;
                                                int i51 = (i50 ^ i9) | (i50 & i9);
                                                int i52 = ~i51;
                                                int i53 = ((i52 ^ 5557) | (i52 & 5557)) * (-369);
                                                int i54 = ~((i46 ^ (-5558)) | (i46 & (-5558)));
                                                int i55 = ~((i46 & i) | (i46 ^ i));
                                                int i56 = (i55 & i54) | (i54 ^ i55);
                                                int i57 = ~((i51 ^ 5557) | (i51 & 5557));
                                                java.lang.Object[] objArr18 = new java.lang.Object[1];
                                                c("蕻郌긂쑓펩\ue9f6݉\u128e⣓䘤屇段脆齂", (i49 & i53) + (i53 | i49) + (((i56 ^ i57) | (i57 & i56)) * 369), objArr18);
                                                java.lang.Object invoke2 = cls5.getMethod((java.lang.String) objArr18[0], java.lang.String.class, java.lang.Integer.TYPE).invoke(invoke, objArr16);
                                                java.lang.Object[] objArr19 = new java.lang.Object[1];
                                                b("츢齚닞\uf23a츳핟涵\ue310㝫\ue082県\ue759⯩躕겡\u2e6d쇕㱩Ⅻ川轶\uf26b軴佫䙉䀪ﺋꏷ⃨ﲷ", 31 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr19);
                                                java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr19[0]);
                                                int red = android.graphics.Color.red(0);
                                                int i58 = ~((53783 & red) | (53783 ^ red));
                                                int i59 = ~((red ^ i) | (red & i));
                                                int i60 = (red * 306) + 16458208 + (((i58 ^ i59) | (i58 & i59)) * 305);
                                                int i61 = ~((red & i9) | (red ^ i9));
                                                int i62 = ((i61 ^ (-53784)) | ((-53784) & i61)) * 305;
                                                java.lang.Object[] objArr20 = new java.lang.Object[1];
                                                c("蕯坢⅕\uf337촡鼛槣㯏ᗁ\ue7a0", (i60 & i62) + (i62 | i60), objArr20);
                                                java.lang.Object[] objArr21 = (java.lang.Object[]) cls6.getField((java.lang.String) objArr20[0]).get(invoke2);
                                                int length = objArr21.length;
                                                int i63 = 0;
                                                while (i63 < length) {
                                                    java.lang.Object obj2 = objArr21[i63];
                                                    java.lang.Object[] objArr22 = new java.lang.Object[1];
                                                    c("蕄鵃뗋챿\ue4e1", (android.view.KeyEvent.getMaxKeyCode() >> 16) + 6257, objArr22);
                                                    try {
                                                        java.lang.Object[] objArr23 = {(java.lang.String) objArr22[0]};
                                                        int maximumDrawingCacheSize = android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                                                        int i64 = maximumDrawingCacheSize * (-419);
                                                        int i65 = (2339497 & i64) + (i64 | 2339497);
                                                        int i66 = (~((i & 5557) | (i ^ 5557))) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING;
                                                        int i67 = ~((~maximumDrawingCacheSize) | (-5558));
                                                        int i68 = ~((i9 & 5557) | (i9 ^ 5557));
                                                        java.lang.Object[] objArr24 = objArr21;
                                                        java.lang.Object[] objArr25 = new java.lang.Object[1];
                                                        c("蕶郈글쑢폦\ue9e6݇ኌ⣁䘳屧殯脙鼃ꪙ샢\ude3e\uf46dΈᤰ㝝䊷壦瘶趂鯘넝콪\udaa4\uf0f8\u0e6c▖㏟䤽杹狑蠑", (((((i65 ^ i66) + ((i66 & i65) << 1)) - (~((r9 | 5557) * (-420)))) - 1) - (~(((i68 & i67) | (i67 ^ i68)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING))) - 1, objArr25);
                                                        java.lang.Class<?> cls7 = java.lang.Class.forName((java.lang.String) objArr25[0]);
                                                        int i69 = -(android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                                        int i70 = ~i69;
                                                        int i71 = ~(i70 | i9);
                                                        int i72 = ~(i9 | (-13));
                                                        int i73 = (((i69 * 868) + 10416) - (~(-(-(((i71 & i72) | (i71 ^ i72)) * (-867)))))) - 1;
                                                        int i74 = (i70 ^ (-13)) | (i70 & (-13));
                                                        int i75 = (~((i70 ^ i) | (i70 & i))) | (~i74);
                                                        int i76 = ~((i ^ (-13)) | (i & (-13)));
                                                        int i77 = -(-(((i75 ^ i76) | (i75 & i76)) * (-1734)));
                                                        int i78 = (i73 ^ i77) + ((i77 & i73) << 1);
                                                        int i79 = (i70 & 12) | (i70 ^ 12);
                                                        int i80 = (i69 ^ (-13)) | (i69 & (-13));
                                                        int i81 = ((~((i80 ^ i) | (i80 & i))) | (~((i79 ^ i) | (i79 & i))) | (~(i74 | i9))) * 867;
                                                        java.lang.Object[] objArr26 = new java.lang.Object[1];
                                                        b("䙉䀪쨆୴鍎廎㧮螊鞘\ue924\uef8d폝", ((i78 | i81) << 1) - (i81 ^ i78), objArr26);
                                                        java.lang.Object invoke3 = cls7.getMethod((java.lang.String) objArr26[0], java.lang.String.class).invoke(null, objArr23);
                                                        try {
                                                            int i82 = -(-android.widget.ExpandableListView.getPackedPositionGroup(0L));
                                                            java.lang.Object[] objArr27 = new java.lang.Object[1];
                                                            b("츢齚닞\uf23a츳핟涵\ue310㝫\ue082県\ue759⯩躕겡\u2e6d쇕㱩\uf8bd㼮䴟٢\u0cfaㅴ山⯮\ue8ac\u0bdd", (i82 ^ 28) + ((i82 & 28) << 1), objArr27);
                                                            java.lang.Class<?> cls8 = java.lang.Class.forName((java.lang.String) objArr27[0]);
                                                            int keyRepeatDelay2 = android.view.ViewConfiguration.getKeyRepeatDelay() >> 16;
                                                            java.lang.Object[] objArr28 = new java.lang.Object[1];
                                                            b("溞퓙㓶썍✒ᐇ둋홱㆙狶\uf206❯", ((keyRepeatDelay2 | 11) << 1) - (keyRepeatDelay2 ^ 11), objArr28);
                                                            try {
                                                                java.lang.Object[] objArr29 = {new java.io.ByteArrayInputStream((byte[]) cls8.getMethod((java.lang.String) objArr28[0], null).invoke(obj2, null))};
                                                                int i83 = -android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                                                java.lang.Object[] objArr30 = new java.lang.Object[1];
                                                                c("蕶郈글쑢폦\ue9e6݇ኌ⣁䘳屧殯脙鼃ꪙ샢\ude3e\uf46dΈᤰ㝝䊷壦瘶趂鯘넝콪\udaa4\uf0f8\u0e6c▖㏟䤽杹狑蠑", ((i83 | 5556) << 1) - (i83 ^ 5556), objArr30);
                                                                java.lang.Class<?> cls9 = java.lang.Class.forName((java.lang.String) objArr30[0]);
                                                                int i84 = -android.view.KeyEvent.keyCodeFromString("");
                                                                int i85 = i84 * (-159);
                                                                int i86 = ~i84;
                                                                java.lang.Object[] objArr31 = new java.lang.Object[1];
                                                                b("䙉䀪ŭແ㆙狶✒ᐇ肩䖫ឍ䔛䝙쀺賂㢘훥뇌\uef8d폝", ((((i85 & (-3021)) + (i85 | (-3021))) - (~(((i86 & 19) | (i86 ^ 19)) * 160))) - 1) + (((~((i9 ^ i84) | (i9 & i84))) | (~((i84 ^ 19) | (i84 & 19)))) * (-160)) + ((i84 | (~((i9 & (-20)) | (i9 ^ (-20))))) * 160), objArr31);
                                                                java.lang.Object invoke4 = cls9.getMethod((java.lang.String) objArr31[0], java.io.InputStream.class).invoke(invoke3, objArr29);
                                                                int length2 = objArr.length;
                                                                int i87 = 0;
                                                                while (i87 < 2) {
                                                                    java.lang.Object obj3 = objArr[i87];
                                                                    try {
                                                                        int edgeSlop = android.view.ViewConfiguration.getEdgeSlop() >> 16;
                                                                        int i88 = edgeSlop * 483;
                                                                        int i89 = (10857814 & i88) + (i88 | 10857814);
                                                                        int i90 = ~edgeSlop;
                                                                        int i91 = (i90 ^ i9) | (i90 & i9);
                                                                        int i92 = ((~((i90 ^ (-44868)) | (i90 & (-44868)))) | (~i91)) * (-241);
                                                                        int i93 = ((i89 | i92) << 1) - (i92 ^ i89);
                                                                        int i94 = -(-(((edgeSlop ^ 44867) | (edgeSlop & 44867)) * (-482)));
                                                                        int i95 = (i93 & i94) + (i94 | i93);
                                                                        int i96 = -(-(((~((edgeSlop ^ (-44868)) | (edgeSlop & (-44868)))) | (~((44867 ^ i91) | (i91 & 44867)))) * 241));
                                                                        java.lang.Object[] objArr32 = new java.lang.Object[1];
                                                                        c("蕶⨾\udbec袴㠾\ue920黫侪ｱ갵巫ʉ뉁捕ვ솔煞☛힄蒽㐕\ue553諧㩚\ueb31飥䦦磻긮忢ಥ뱠洈ዚ", (i95 ^ i96) + ((i95 & i96) << 1), objArr32);
                                                                        java.lang.Class<?> cls10 = java.lang.Class.forName((java.lang.String) objArr32[0]);
                                                                        int red2 = android.graphics.Color.red(0);
                                                                        java.lang.Object[] objArr33 = new java.lang.Object[1];
                                                                        c("蕻㮶\uf8f6뤢繕㽵ﶬ닐猇〯\uf152럌璘㖯\uea1eꭏ榅⻍\ueff1갨浀⎆\ue0ba", (48847 & red2) + (red2 | 48847), objArr33);
                                                                        if (obj3.equals(cls10.getMethod((java.lang.String) objArr33[0], null).invoke(invoke4, null))) {
                                                                            java.lang.Object[] objArr34 = {new int[]{i}, new int[]{(i & (-2)) | (i9 & 1)}, null, new int[1]};
                                                                            try {
                                                                                java.lang.Object[] objArr35 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((~((-374233739) | i9)) | (~((-630695247) | i)) | (~(630695246 | i9))) * 959) + 694935073 + (((~((-374233739) | i)) | (~((-630695247) | i9)) | (~(630695246 | i))) * 959))};
                                                                                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                                if (obj4 == null) {
                                                                                    java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 50, 2761 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) android.text.TextUtils.getOffsetAfter("", 0));
                                                                                    byte b3 = $$a[14];
                                                                                    byte b4 = (byte) (b3 + 1);
                                                                                    java.lang.Object[] objArr36 = new java.lang.Object[1];
                                                                                    a(b3, b4, b4, objArr36);
                                                                                    obj4 = cls11.getMethod((java.lang.String) objArr36[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj4);
                                                                                }
                                                                                ((int[]) objArr34[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr35)).intValue();
                                                                                return objArr34;
                                                                            } catch (java.lang.Throwable th) {
                                                                                java.lang.Throwable cause = th.getCause();
                                                                                if (cause != null) {
                                                                                    throw cause;
                                                                                }
                                                                                throw th;
                                                                            }
                                                                        }
                                                                        int i97 = (i87 ^ (-89)) + ((i87 & (-89)) << 1);
                                                                        i87 = (i97 ^ 90) + ((i97 & 90) << 1);
                                                                    } catch (java.lang.Throwable th2) {
                                                                        java.lang.Throwable cause2 = th2.getCause();
                                                                        if (cause2 != null) {
                                                                            throw cause2;
                                                                        }
                                                                        throw th2;
                                                                    }
                                                                }
                                                                i63 = ((i63 | 1) << 1) - (i63 ^ 1);
                                                                objArr21 = objArr24;
                                                            } catch (java.lang.Throwable th3) {
                                                                java.lang.Throwable cause3 = th3.getCause();
                                                                if (cause3 != null) {
                                                                    throw cause3;
                                                                }
                                                                throw th3;
                                                            }
                                                        } catch (java.lang.Throwable th4) {
                                                            java.lang.Throwable cause4 = th4.getCause();
                                                            if (cause4 != null) {
                                                                throw cause4;
                                                            }
                                                            throw th4;
                                                        }
                                                    } catch (java.lang.Throwable th5) {
                                                        java.lang.Throwable cause5 = th5.getCause();
                                                        if (cause5 != null) {
                                                            throw cause5;
                                                        }
                                                        throw th5;
                                                    }
                                                }
                                                i3 = 1;
                                                num = r19;
                                                int[] iArr = new int[i3];
                                                int[] iArr2 = new int[i3];
                                                iArr[0] = i;
                                                iArr2[0] = i;
                                                java.lang.Object[] objArr37 = {iArr, iArr2, null, new int[i3]};
                                                int i98 = ~i;
                                                java.lang.Object[] objArr38 = {java.lang.Integer.valueOf(i2), num, java.lang.Integer.valueOf((((629045100 | i) * (-859)) - 572918568) + (((~(i | (-73793645))) | (~(629045100 | i98))) * 859) + (((~((-375883885) | i98)) | 302090240) * 859))};
                                                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                if (obj5 == null) {
                                                    java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 50, android.graphics.Color.rgb(0, 0, 0) + 16779929, (char) android.widget.ExpandableListView.getPackedPositionGroup(0L));
                                                    byte b5 = $$a[14];
                                                    byte b6 = (byte) (b5 + 1);
                                                    java.lang.Object[] objArr39 = new java.lang.Object[1];
                                                    a(b5, b6, b6, objArr39);
                                                    obj5 = cls12.getMethod((java.lang.String) objArr39[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj5);
                                                }
                                                ((int[]) objArr37[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr38)).intValue();
                                                return objArr37;
                                            } catch (java.lang.Throwable th6) {
                                                java.lang.Throwable cause6 = th6.getCause();
                                                if (cause6 != null) {
                                                    throw cause6;
                                                }
                                                throw th6;
                                            }
                                        } catch (java.lang.Throwable th7) {
                                            th = th7;
                                            java.lang.Throwable cause7 = th.getCause();
                                            if (cause7 != null) {
                                                throw cause7;
                                            }
                                            throw th;
                                        }
                                    } catch (java.lang.Throwable th8) {
                                        th = th8;
                                    }
                                } catch (java.lang.Throwable th9) {
                                    java.lang.Throwable cause8 = th9.getCause();
                                    if (cause8 != null) {
                                        throw cause8;
                                    }
                                    throw th9;
                                }
                            } catch (java.lang.Throwable th10) {
                                java.lang.Throwable cause9 = th10.getCause();
                                if (cause9 != null) {
                                    throw cause9;
                                }
                                throw th10;
                            }
                        } catch (java.lang.Throwable th11) {
                            java.lang.Throwable cause10 = th11.getCause();
                            if (cause10 != null) {
                                throw cause10;
                            }
                            throw th11;
                        }
                    } catch (java.lang.Throwable th12) {
                        java.lang.Throwable cause11 = th12.getCause();
                        if (cause11 != null) {
                            throw cause11;
                        }
                        throw th12;
                    }
                }
            };
        } else if (java.util.SortedMap.class.isAssignableFrom(cls)) {
            getmaximumpintry = new com.payair.hce.getMaximumPinTry<T>() { // from class: com.payair.hce.buildRecords.1
                @Override // com.payair.hce.getMaximumPinTry
                public final T DigitizedCardProfile() {
                    return (T) new java.util.TreeMap();
                }
            };
        } else if ((type instanceof java.lang.reflect.ParameterizedType) && !java.lang.String.class.isAssignableFrom(new com.payair.hce.getPinAlwaysRequiredIfCurrencyProvided(((java.lang.reflect.ParameterizedType) type).getActualTypeArguments()[0]).values)) {
            getmaximumpintry = new com.payair.hce.getMaximumPinTry<T>() { // from class: com.payair.hce.buildRecords.4
                @Override // com.payair.hce.getMaximumPinTry
                public final T DigitizedCardProfile() {
                    return (T) new java.util.LinkedHashMap();
                }
            };
        } else {
            getmaximumpintry = new com.payair.hce.getMaximumPinTry<T>() { // from class: com.payair.hce.buildRecords.5
                @Override // com.payair.hce.getMaximumPinTry
                public final T DigitizedCardProfile() {
                    return (T) new com.payair.hce.getCiacDeclineOnPpms();
                }
            };
        }
        return getmaximumpintry != null ? getmaximumpintry : new com.payair.hce.getMaximumPinTry<T>() { // from class: com.payair.hce.buildRecords.8
            private final com.payair.hce.SdkCoreDigitizedCardProfileImpl values = com.payair.hce.SdkCoreDigitizedCardProfileImpl.AlternateContactlessPaymentDataJson();

            @Override // com.payair.hce.getMaximumPinTry
            public final T DigitizedCardProfile() {
                try {
                    return (T) this.values.DigitizedCardProfile(cls);
                } catch (java.lang.Exception e) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to invoke no-args constructor for ");
                    sb.append(type);
                    sb.append(". Registering an InstanceCreator with Gson for this type may fix this problem.");
                    try {
                        throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(java.lang.String.class, java.lang.Throwable.class).newInstance(sb.toString(), e));
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
            }
        };
    }
}
