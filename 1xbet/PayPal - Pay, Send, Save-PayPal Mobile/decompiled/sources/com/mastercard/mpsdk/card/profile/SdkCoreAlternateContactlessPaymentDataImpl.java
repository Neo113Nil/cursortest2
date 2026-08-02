package com.mastercard.mpsdk.card.profile;

/* loaded from: classes4.dex */
public class SdkCoreAlternateContactlessPaymentDataImpl implements com.payair.hce.enforceCallingOrSelfUriPermission, java.io.Serializable {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10 = 0;
    private static int $11 = 0;
    private static short[] AlternateContactlessPaymentDataJson = null;
    private static int DigitizedCardProfile = 0;
    private static char[] IccPrivateKeyCrtComponentsJson = null;
    private static long RecordsJson = 0;
    private static int SdkCoreAlternateContactlessPaymentDataImpl = 0;
    private static int getAid = 0;
    private static final long serialVersionUID = -368655353379069289L;
    private static byte[] valueOf;
    private static int values;
    private static int writeReplace;
    private byte[] aid;
    private byte[] ciacDecline;
    private byte[] cvrMaskAnd;
    private byte[] gpoResponse;
    private byte[] paymentFci;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, byte b, byte b2, java.lang.Object[] objArr) {
        int i2;
        int i3;
        byte[] bArr = $$a;
        int i4 = b * 2;
        int i5 = b2 + 4;
        char[] cArr = new char[35 - i4];
        int i6 = 34 - i4;
        if (bArr == null) {
            int i7 = i6;
            int i8 = i5;
            i3 = 0;
            int i9 = (i5 + i7) - 2;
            i5 = i8;
            i2 = i9;
            int i10 = i5 + 1;
            cArr[i3] = (char) i2;
            if (i3 == i6) {
                objArr[0] = new java.lang.String(cArr);
                return;
            }
            i3++;
            i7 = bArr[i10];
            i5 = i2;
            i8 = i10;
            int i92 = (i5 + i7) - 2;
            i5 = i8;
            i2 = i92;
            int i102 = i5 + 1;
            cArr[i3] = (char) i2;
            if (i3 == i6) {
            }
        } else {
            i2 = i + 65;
            i3 = 0;
            int i1022 = i5 + 1;
            cArr[i3] = (char) i2;
            if (i3 == i6) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(byte b, int i, short s, java.lang.Object[] objArr) {
        int i2;
        byte[] bArr = $$d;
        int i3 = b + 4;
        int i4 = (s * 5) + 99;
        int i5 = i * 2;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            int i6 = i5;
            int i7 = 0;
            i4 += -i6;
            i2 = i7;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            if (i2 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i3++;
            i6 = bArr[i3];
            i4 += -i6;
            i2 = i7;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            if (i2 == i5) {
            }
        }
    }

    public SdkCoreAlternateContactlessPaymentDataImpl(com.payair.hce.enforceCallingOrSelfUriPermission enforcecallingorselfuripermission) {
        this.aid = enforcecallingorselfuripermission.getAid();
        this.paymentFci = enforcecallingorselfuripermission.getPaymentFci();
        this.gpoResponse = enforcecallingorselfuripermission.getGpoResponse();
        this.ciacDecline = enforcecallingorselfuripermission.getCiacDecline();
        this.cvrMaskAnd = enforcecallingorselfuripermission.getCvrMaskAnd();
    }

    @Override // com.payair.hce.enforceCallingOrSelfUriPermission
    public byte[] getAid() {
        int i = getAid + 45;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        byte[] bArr = this.aid;
        if (i % 2 != 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.enforceCallingOrSelfUriPermission
    public byte[] getPaymentFci() {
        int i = SdkCoreAlternateContactlessPaymentDataImpl;
        int i2 = i + 61;
        getAid = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        byte[] bArr = this.paymentFci;
        getAid = (i + 17) % 128;
        return bArr;
    }

    @Override // com.payair.hce.enforceCallingOrSelfUriPermission
    public byte[] getGpoResponse() {
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 35;
        getAid = i % 128;
        if (i % 2 == 0) {
            return this.gpoResponse;
        }
        throw null;
    }

    @Override // com.payair.hce.enforceCallingOrSelfUriPermission
    public byte[] getCiacDecline() {
        int i = (SdkCoreAlternateContactlessPaymentDataImpl + 83) % 128;
        getAid = i;
        byte[] bArr = this.ciacDecline;
        int i2 = i + 95;
        SdkCoreAlternateContactlessPaymentDataImpl = i2 % 128;
        if (i2 % 2 != 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.enforceCallingOrSelfUriPermission
    public byte[] getCvrMaskAnd() {
        int i = getAid + 3;
        int i2 = i % 128;
        SdkCoreAlternateContactlessPaymentDataImpl = i2;
        if (i % 2 == 0) {
            throw null;
        }
        byte[] bArr = this.cvrMaskAnd;
        int i3 = i2 + 103;
        getAid = i3 % 128;
        if (i3 % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    private static void c(int i, char c, int i2, java.lang.Object[] objArr) {
        com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
        long[] jArr = new long[i2];
        char c2 = 0;
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i2) {
            int i3 = $11 + 51;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = getcvmmodel.valueOf;
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    objArr2[c2] = java.lang.Integer.valueOf(IccPrivateKeyCrtComponentsJson[i - getcvmmodel.valueOf]);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 380, (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 62387));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        d((byte) -1, 0, (short) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                    }
                    java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(RecordsJson), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                    if (obj2 == null) {
                        obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getCapsMode("", 0, 0) + 35, android.view.View.getDefaultSize(0, 0) + 3966, (char) (40223 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                    }
                    jArr[i4] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                    java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 211, (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj3);
                    }
                    ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i5 = getcvmmodel.valueOf;
                java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(IccPrivateKeyCrtComponentsJson[i + getcvmmodel.valueOf])};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                if (obj4 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 380, (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 62387));
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    d((byte) -1, 0, (short) 0, objArr7);
                    obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj4);
                }
                java.lang.Object[] objArr8 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr6)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(RecordsJson), java.lang.Integer.valueOf(c)};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                if (obj5 == null) {
                    obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 35, android.graphics.Color.alpha(0) + 3966, (char) (40224 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj5);
                }
                jArr[i5] = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr8)).longValue();
                java.lang.Object[] objArr9 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj6 == null) {
                    obj6 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - android.text.TextUtils.indexOf("", "", 0, 0), android.graphics.Color.argb(0, 0, 0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) android.view.KeyEvent.getDeadChar(0, 0))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj6);
                }
                ((java.lang.reflect.Method) obj6).invoke(null, objArr9);
            }
            $10 = ($11 + 23) % 128;
            c2 = 0;
        }
        char[] cArr = new char[i2];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i2) {
            $10 = ($11 + 33) % 128;
            cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
            java.lang.Object[] objArr10 = {getcvmmodel, getcvmmodel};
            java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
            if (obj7 == null) {
                obj7 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 35, 213 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj7);
            }
            ((java.lang.reflect.Method) obj7).invoke(null, objArr10);
        }
        objArr[0] = new java.lang.String(cArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0246 A[Catch: all -> 0x035c, TryCatch #0 {all -> 0x035c, blocks: (B:3:0x000d, B:6:0x0031, B:7:0x0065, B:16:0x0085, B:18:0x009c, B:19:0x00ca, B:27:0x00f2, B:29:0x010f, B:30:0x0145, B:34:0x016d, B:36:0x018a, B:37:0x01c0, B:47:0x0223, B:49:0x0246, B:50:0x0290), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, int i3, byte b, short s, java.lang.Object[] objArr) {
        long j;
        int i4;
        int i5;
        java.lang.Object obj;
        byte[] bArr;
        boolean z;
        int i6;
        int i7;
        com.payair.hce.getTrack2ConstructionData gettrack2constructiondata = new com.payair.hce.getTrack2ConstructionData();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(values)};
            java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
            if (obj2 == null) {
                obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 29, (char) ((-1) - android.os.Process.getGidForName("")))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj2);
            }
            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr2)).intValue();
            boolean z2 = intValue == -1;
            if (z2) {
                byte[] bArr2 = valueOf;
                if (bArr2 != null) {
                    int length = bArr2.length;
                    byte[] bArr3 = new byte[length];
                    for (int i8 = 0; i8 < length; i8++) {
                        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(bArr2[i8])};
                        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609478628);
                        if (obj3 == null) {
                            obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 31, android.view.KeyEvent.normalizeMetaState(0) + 5088, (char) android.view.View.resolveSize(0, 0))).getMethod("e", java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609478628, obj3);
                        }
                        bArr3[i8] = ((java.lang.Byte) ((java.lang.reflect.Method) obj3).invoke(null, objArr3)).byteValue();
                    }
                    bArr2 = bArr3;
                }
                if (bArr2 == null) {
                    j = -4897270311952305750L;
                    intValue = (short) (((short) (AlternateContactlessPaymentDataJson[i2 + ((int) (DigitizedCardProfile ^ (-4897270311952305750L)))] ^ (-4897270311952305750L))) + ((int) (values ^ (-4897270311952305750L))));
                    if (intValue > 0) {
                        int i9 = (int) (DigitizedCardProfile ^ j);
                        if (z2) {
                            int i10 = $11 + 13;
                            $10 = i10 % 128;
                            i4 = 2;
                            if (i10 % 2 == 0) {
                                i5 = 1;
                                gettrack2constructiondata.writeReplace = ((i2 + intValue) - i4) + i9 + i5;
                                java.lang.Object[] objArr4 = {gettrack2constructiondata, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(writeReplace), sb};
                                obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-500696024);
                                if (obj == null) {
                                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 2364, (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6));
                                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                                    d((byte) -1, 0, (short) 1, objArr5);
                                    obj = cls.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-500696024, obj);
                                }
                                ((java.lang.StringBuilder) ((java.lang.reflect.Method) obj).invoke(null, objArr4)).append(gettrack2constructiondata.values);
                                gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                                bArr = valueOf;
                                if (bArr != null) {
                                    $11 = ($10 + 79) % 128;
                                    int length2 = bArr.length;
                                    byte[] bArr4 = new byte[length2];
                                    for (int i11 = 0; i11 < length2; i11++) {
                                        bArr4[i11] = (byte) (bArr[i11] ^ (-4897270311952305750L));
                                    }
                                    bArr = bArr4;
                                }
                                if (bArr == null) {
                                    z = true;
                                } else {
                                    int i12 = $11 + 71;
                                    $10 = i12 % 128;
                                    int i13 = i12 % 2;
                                    z = false;
                                }
                                gettrack2constructiondata.DigitizedCardProfile = 1;
                                while (gettrack2constructiondata.DigitizedCardProfile < intValue) {
                                    if (z) {
                                        int i14 = $10 + 119;
                                        $11 = i14 % 128;
                                        if (i14 % 2 == 0) {
                                            byte[] bArr5 = valueOf;
                                            gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace + 1;
                                            i6 = gettrack2constructiondata.AlternateContactlessPaymentDataJson % (((byte) (((byte) (bArr5[r8] % (-4897270311952305750L))) << s)) ^ b);
                                        } else {
                                            byte[] bArr6 = valueOf;
                                            gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                                            i6 = gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((byte) (((byte) (bArr6[r8] ^ (-4897270311952305750L))) + s)) ^ b);
                                        }
                                        gettrack2constructiondata.values = (char) i6;
                                    } else {
                                        short[] sArr = AlternateContactlessPaymentDataJson;
                                        gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                                        gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((short) (((short) (sArr[r8] ^ (-4897270311952305750L))) + s)) ^ b));
                                    }
                                    sb.append(gettrack2constructiondata.values);
                                    gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                                    gettrack2constructiondata.DigitizedCardProfile++;
                                }
                            }
                        } else {
                            i4 = 2;
                        }
                        i5 = 0;
                        gettrack2constructiondata.writeReplace = ((i2 + intValue) - i4) + i9 + i5;
                        java.lang.Object[] objArr42 = {gettrack2constructiondata, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(writeReplace), sb};
                        obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-500696024);
                        if (obj == null) {
                        }
                        ((java.lang.StringBuilder) ((java.lang.reflect.Method) obj).invoke(null, objArr42)).append(gettrack2constructiondata.values);
                        gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                        bArr = valueOf;
                        if (bArr != null) {
                        }
                        if (bArr == null) {
                        }
                        gettrack2constructiondata.DigitizedCardProfile = 1;
                        while (gettrack2constructiondata.DigitizedCardProfile < intValue) {
                        }
                    }
                    objArr[0] = sb.toString();
                }
                int i15 = $10 + 101;
                $11 = i15 % 128;
                if (i15 % 2 == 0) {
                    byte[] bArr7 = valueOf;
                    java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(DigitizedCardProfile)};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                    if (obj4 == null) {
                        obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 28, (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 29, (char) android.text.TextUtils.indexOf("", "", 0, 0))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj4);
                    }
                    i7 = ((byte) (bArr7[((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr6)).intValue()] / (-4897270311952305750L))) - ((int) (values + 4897270311952305750L));
                } else {
                    byte[] bArr8 = valueOf;
                    java.lang.Object[] objArr7 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(DigitizedCardProfile)};
                    java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                    if (obj5 == null) {
                        obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.ImageFormat.getBitsPerPixel(0) + 28, 29 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj5);
                    }
                    i7 = ((byte) (bArr8[((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr7)).intValue()] ^ (-4897270311952305750L))) + ((int) (values ^ (-4897270311952305750L)));
                }
                intValue = (byte) i7;
            }
            j = -4897270311952305750L;
            if (intValue > 0) {
            }
            objArr[0] = sb.toString();
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        getAid = 0;
        SdkCoreAlternateContactlessPaymentDataImpl = 1;
        DigitizedCardProfile = 1989400681;
        values = 520368551;
        writeReplace = -903050520;
        valueOf = new byte[]{84, 89, -69, 64, -71, 88, -69, 83, -112, com.google.common.base.Ascii.NAK, 87, 83, -89, -81, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -89, 69, 81, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -87, -88, 82, 87, -94, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -89, 89, 87, -85, -69, -88, 81, 91, -83, -89, 94, -107, 16, -69, 68, -69, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, 87, -88, -24, com.google.common.base.Ascii.NAK, 87, -69, -89, 89, 87, -85, -69, -88, 81, 91, -83, -89, 94, -107, 107, -94, 91, -85, 80, -84, -17, 16, -69, 68, -69, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, 87, -88, -24, com.google.common.base.Ascii.NAK, 87, -91, 91, -18, 99, 83, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -85, 80, -86, 88, -71, 87, -85, -99, 99, 83, 85, -86, -105, 17, -95, 81, -81, -112, 102, 69, -91, -100, -86, 83, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -85, 80, -86, 88, -71, 87, -85, -100, com.google.common.base.Ascii.NAK, 87, 81, 80, -66, 80, -90, 87, 84, -87, 83, 87, -93, 93, -94, 81, 82, -85, 81, -81, -84, 83, 103, 94, -89, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -83, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -92, 87, 91, -18, com.visa.cbp.getEncExpo.IResultReceiver2, 87, -84, 71, -89, 82, -87, 81, 87, -89, 69, -91, 94, 87, -88, -85, 82, -69, 69, -69, 84, 83, -86, 87, -90, 87, 93, 87, -88, 80, -84, 83, -84, -88, -94, 89, 80, 100, 91, -95, 87, 81, 84, 83, -88, -88, 69, 84, -85, -87, 84, -85, -71, 71, -85, -20, 17, -89, 65, -69, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -95, 81, -89, 68, 87, 100, 94, -71, 91, -95, -88, -88, 69, 84, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -88, 91, -87, -93, 82, -93, -100, com.google.common.base.Ascii.GS, -87, -83, -81, 87, -83, 88, -18, com.google.common.base.Ascii.SYN, -89, -99, com.google.common.base.Ascii.SYN, 80, -84, -18, 85, -81, -83, 69, -18, 104, -94, 91, -85, 80, -84, -18, 85, -81, -83, 64, -29, 104, -94, 91, -85, 80, -84, -18, 84, -81, -83, com.visa.cbp.getEncExpo.registerForActivityResult, com.google.common.base.Ascii.ETB, -87, -95, 92, -93, 69, -19, 82, -81, -83, 69, -18, 93, 69, -91, -100, 84, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -88, 85, -93, 84, 82, -85, -89, 66, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, -81, 85, -88, -94, -82, 87, -81, 64, -88, -17, 97, 71, -87, -17, 16, -95, 81, -81, -87, 107, -81, -83, com.visa.cbp.getEncExpo.registerForActivityResult, 105, -95, 84, 94, -87, -105, 100, 71, -71, 87, -97, 83, 107, -81, -83, 69, -18, -82, 17, 86, -71, -99, 85, 107, -81, -83, com.visa.cbp.getEncExpo.registerForActivityResult, 104, -94, 91, -85, 80, -84, -18, -94, com.visa.cbp.getEncExpo.IResultReceiver2, 85, -81, 68, -83, -87, -94, 81, -99, 107, -81, -83, com.visa.cbp.getEncExpo.registerForActivityResult, 104, -94, 91, -85, 80, -84, -18, -87, 107, -81, -83, 64, -29, 97, 91, -18, 104, -94, 91, -85, 80, -84, -18, -90, 17, -81, -86, 87, -17, 99, 85, -86, 93, -21, 98, 68, -30, com.google.common.base.Ascii.ETB, 85, 84, -20, 104, -94, 91, -85, 80, -84, -18, 81, 107, -81, -83, com.visa.cbp.getEncExpo.registerForActivityResult, 16, -88, -18, -82, 85, -84, 83, -84, -88, -108, 99, 80, -83, 88, -18, 102, 94, 87, -88, -21, 83, 100, -114, -90, 87, Byte.MAX_VALUE, -93, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 80, 87, 87, 85, -21, com.google.common.base.Ascii.GS, -87, -83, -81, 87, -83, 88, -18, com.google.common.base.Ascii.SYN, -89, -99, com.google.common.base.Ascii.SYN, 80, -84, -18, 84, 82, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -88, 68, 85, -31, 19, -69, -85, -97};
        IccPrivateKeyCrtComponentsJson = new char[]{34649, 24270, 64885, 6543, 46142, 53345, 27776, 24267, 64874, 6538, 46116, 53354, 27797, 35643, 24264, 64867, 6557, 46116, 53354, 27797, 35625, 10066, 17309, 24262, 64873, 6550, 46115, 53282, 27779, 35642, 10069, 17306, 40480, 14865, 22245, 62764, 24259, 64872, 6552, 46119, 53354, 27797, 35628, 10078, 17308, 40499, 14865, 22244, 62779, 4422, 44525, 51203, 24287, 64885, 6544, 46129, 53356, 27784, 35635, 10075, 17290, 40484, 14923, 22259, 37493, 12742, 54585, 30857, 7371, 41007, 18310, 24284, 64884, 24284, 64883, 6558, 46117, 53371, 27832, 35624, 10078, 17307, 40495, 14944, 22267, 62752, 4420, 44532, 51222, 25672, 32994, 57105, 31651, 24284, 64882, 28288, 52526, 10693, 33903, 57393, 23756, 47973, 5912, 29660, 24283, 64885, 6558, 46132, 53354, 27797, 35632, 10050, 17307, 40482, 14857, 57333, 31814, 39079, 13585, 20814, 60844, 2607, 42609, 49838, 7950, 47999, 23530, 63577, 7352, 45326, 54609, 27059, 36400, 8821, 18106, 39696, 16208, 21454, 61457, 5233, 43200, 24282, 64873, 6536, 46142, 53345, 27779, 35584, 10052, 17302, 40490, 14941, 22264, 62755, 4436, 24192, 64884, 6534, 46116, 53371, 27778, 35634, 10008, 17293, 40494, 14929, 22200, 33521, 8454, 50684, 26697, 3101, 45241, 22365, 64291, 40946, 16976, 58977, 35477, 10570, 52535, 29082, 5235, 47149, 24192, 64867, 6554, 46113, 35153, 10917, 52823, 25589, 1962, 47955, 23779, 24192, 64884, 6534, 46116, 53371, 27778, 35634, 10008, 17293, 40494, 14929, 24285, 64872, 6609, 46133, 53370, 27790, 35635, 10067, 17345, 40495, 14928, 22244, 62779, 24285, 64882, 6545, 46137, 53350, 27785, 35640, 11980, 36209, 27038, 50231, 41077, 7303, 64312, 22282, 13199, 60973, 19039, 9898, 34094, 24923, 56803, 47120, 5219, 61685, 44815, 2983, 59385, 16903, 16063, 24192, 64867, 6558, 46115, 53358, 27848, 35635, 10072, 17292, 40486, 14931, 22200, 24192, 64867, 6558, 46115, 53358, 27848, 35635, 10072, 17292, 40486, 14931, 22200, 62775, 4421, 44534, 51225, 25600, 50313, 26493, 33679, 11821, 19058, 63115, 4411, 48401, 55710, 1068, 41055, 52464, 28521, 24192, 64882, 6540, 46117, 53280, 27781, 35638, 10073, 17344, 24192, 64887, 6541, 46136, 53356, 27848, 24192, 64874, 6544, 46114, 53345, 27795, 35628, 24261, 64870, 6537, 46134, 53281, 27787, 35646, 10073, 17288, 40553, 14955, 22271, 62781, 4418, 44542, 51219, 59802, 18997, 44760, 867, 26429};
        RecordsJson = 2582527029587934471L;
    }

    static void init$1() {
        $$d = new byte[]{com.google.common.base.Ascii.US, -55, -63, 6};
        $$e = 135;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x155e, code lost:
    
        if (((((int) (r10 >> 32)) & ((((((~((-1114113) | r15)) | (~((-1428181281) | r63))) * (-302)) + 1693896210) + ((~((-1114113) | r63)) * (-604))) + (((~((-1429295393) | r63)) | 264212) * 302))) | (((int) r10) & ((((~((-679544130) | r15)) * (-783)) + 2035110729) + (((~(1098019466 | r15)) | (-1759721420)) * 783)))) != 477111747) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x1677, code lost:
    
        r2 = 0;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x167b, code lost:
    
        if (r2 >= 28) goto L550;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x167d, code lost:
    
        r4 = r4[r2];
        r6 = new java.lang.Object[1];
        c((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 155, (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 12 - android.graphics.Color.green(0), r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x16ab, code lost:
    
        r4 = new java.lang.Object[]{((java.lang.String) r6[0]).intern().concat(java.lang.String.valueOf(r4))};
        r5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x16bc, code lost:
    
        if (r5 != null) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x16be, code lost:
    
        r5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(37 - (android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1)), 3162 - (android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1)), (char) (33099 - android.text.TextUtils.indexOf(r12, r12, 0)));
        r6 = com.mastercard.mpsdk.card.profile.SdkCoreAlternateContactlessPaymentDataImpl.$$a;
        r9 = new java.lang.Object[1];
        a(35, (byte) (-r6[16]), (byte) (-r6[23]), r9);
        r5 = r5.getMethod((java.lang.String) r9[0], java.lang.String.class);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x170f, code lost:
    
        r4 = ((java.lang.Long) ((java.lang.reflect.Method) r5).invoke(null, r4)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x171c, code lost:
    
        r6 = ~r4;
        r8 = (((((46 * r4) + 39609028180L) + (((~(r6 | r26)) | 861065830) * (-90))) + (((~(r4 | 861065830)) | (~(r6 | r13))) * (-45))) + (((~(r26 | 861065830)) | (r6 | (~((-861065831) | r13)))) * 45)) + 46404908;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x17ba, code lost:
    
        if (((((int) (r8 >> 32)) & ((((((~(801221670 | r63)) | (-2144599599)) * 576) - 1771464918) + (((~((-1343377929) | r15)) | 88080384) * 576)) + 1661212224)) | (((int) r8) & (((((((~((-433458829) | r15)) | 274074248) | (~(1870685238 | r15))) * (-1136)) - 1738041619) + ((((~((-433458829) | r63)) | (~(1870685238 | r63))) | (~((-1711300659) | r15))) * (-568))) + ((((~(433458828 | r15)) | (~((-1870685239) | r15))) | (~((-274074249) | r63))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION)))) != 0) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x17bc, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x17bf, code lost:
    
        r3 = r3 + r4;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x17be, code lost:
    
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x17cc, code lost:
    
        if (r3 < 25.2d) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x17ce, code lost:
    
        r3 = new java.lang.Object[]{new int[]{r63}, new int[]{r63 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE}, null, new int[1]};
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x17e8, code lost:
    
        r4 = new java.lang.Object[]{1735383130, 16, java.lang.Integer.valueOf((((~(r63 | (-130805828))) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING) - 2056503645) + (((~((-130805828) | r15)) | 806355728) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING))};
        r1 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x1828, code lost:
    
        if (r1 != null) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x182a, code lost:
    
        r1 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.getOffsetBefore(r12, 0), 2713 - android.text.TextUtils.getCapsMode(r12, 0, 0), (char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())));
        r2 = com.mastercard.mpsdk.card.profile.SdkCoreAlternateContactlessPaymentDataImpl.$$a[14];
        r5 = (short) (r2 - 1);
        r8 = new java.lang.Object[1];
        a(r5, (byte) r5, (byte) (-r2), r8);
        r1 = r1.getMethod((java.lang.String) r8[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x1889, code lost:
    
        ((int[]) r3[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) r1).invoke(null, r4)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x1891, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x1675, code lost:
    
        if (((((int) r2) & ((((((~(420144416 | r15)) | (-1033893290)) * 446) - 384374209) + (((~((-613748874) | r63)) | 16811296) * 446)) - 1554906668)) | (((int) (r2 >> 32)) & (((((92340384 | r15) * (-192)) - 1788177110) + (((~((-942074634) | r15)) | 402811393) * (-384))) + ((((~((-402811394) | r63)) | (~((-539263241) | r15))) | (~(1034415017 | r63))) * 192)))) == 477111747) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x2476, code lost:
    
        if (((((int) (r13 >> 32)) & ((((((~((-1202610) | r10)) | (~(1436023801 | r15))) * (-318)) - 642795462) + (((~(1167587833 | r10)) | 268435968) * (-318))) + (((~((-1167587834) | r10)) | (-269638578)) * 318))) | (((int) r13) & ((((((~(1921614290 | r15)) | 88352769) * (-108)) + 493056351) + ((((~((-936126596) | r10)) | 1073840464) | (~(936126595 | r15))) * 54)) + ((1073840464 | r10) * 54)))) == 0) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:528:0x0bb8, code lost:
    
        if (r4.equals(((java.lang.String) r11[0]).intern()) != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:543:0x0993, code lost:
    
        if (((((int) r2) & ((((((-596302824) | r15) * (-757)) - 942902548) + ((~((-25199142) | r63)) * 1514)) + ((((~(840923586 | r15)) | (-866122728)) | (~((-571103683) | r63))) * 757))) | (((int) (r2 >> 32)) & (((((~((-268960017) | r63)) | 27336768) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING) - 978574310) + ((~((-268960017) | r15)) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING)))) == 542074309) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:221:0x2623  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x26f8  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x0ae4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x099b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] AlternateContactlessPaymentDataJson$4956fc2a(int i, java.lang.Object obj) {
        java.lang.String str;
        long j;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        java.lang.Object[] objArr;
        int parseInt;
        java.lang.Object obj2;
        java.lang.String str2;
        char c;
        int i9;
        java.lang.String str3;
        try {
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1566620024);
            if (obj3 == null) {
                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(25 - android.graphics.ImageFormat.getBitsPerPixel(0), 1838 - android.view.View.combineMeasuredStates(0, 0), (char) (android.os.Process.getGidForName("") + 1));
                byte[] bArr = $$a;
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a(653, (byte) (-bArr[16]), (byte) (-bArr[14]), objArr2);
                obj3 = cls.getMethod((java.lang.String) objArr2[0], null);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1566620024, obj3);
            }
            long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, null)).longValue();
            long j2 = i;
            long j3 = ~longValue;
            long j4 = ~j2;
            long j5 = (302 * longValue) + 318234491400L + ((~(longValue | (-1060781638) | j2)) * (-301)) + (((~(j4 | (-1060781638))) | (~(j3 | j2))) * (-301)) + ((j3 | (~(1060781637 | j2))) * 301) + 1900860583;
            int i10 = (int) (j5 >> 32);
            int i11 = ~i;
            if (((i10 & ((((~(1054227685 | i)) | 382998725) * (-756)) + 794273578 + ((i11 | 1054227685) * 756))) | (((int) j5) & ((((154068910 | i) * (-50)) - 68360781) + (((~(1610612734 | i11)) | (~((-19317415) | i))) * 50) + (((~(1591295320 | i11)) | (-1610612735) | (~(154068910 | i11))) * 50)))) != 0) {
                java.lang.Object[] objArr3 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE}, null, new int[1]};
                java.lang.Object[] objArr4 = {1735383130, 16, java.lang.Integer.valueOf((((1002151798 | i) * (-676)) - 1894055709) + (((~(864194086 | i11)) | (-1002151799)) * 676) + (((~(i | (-137957713))) | (~(154868566 | i11)) | 847283232) * 676))};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj4 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 49, android.view.View.resolveSizeAndState(0, 0, 0) + 2713, (char) (android.os.Process.myPid() >> 22));
                    byte b = $$a[14];
                    short s = (short) (b - 1);
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    a(s, (byte) s, (byte) (-b), objArr5);
                    obj4 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj4);
                }
                ((int[]) objArr3[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr4)).intValue();
                return objArr3;
            }
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            b((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 718751024, (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1771563460, (-15) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (byte) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (short) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr6);
            java.lang.Object[] objArr7 = {((java.lang.String) objArr6[0]).intern()};
            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
            if (obj5 == null) {
                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.combineMeasuredStates(0, 0) + 40, android.text.TextUtils.getOffsetBefore("", 0) + 1921, (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                byte[] bArr2 = $$a;
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                a(653, (byte) (-bArr2[16]), (byte) (-bArr2[14]), objArr8);
                obj5 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.String.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj5);
            }
            java.lang.Object invoke = ((java.lang.reflect.Method) obj5).invoke(null, objArr7);
            if (invoke != null) {
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                b(android.view.View.resolveSize(0, 0) + 718751024, (-1771563448) - android.view.KeyEvent.normalizeMetaState(0), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) - 14, (byte) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (short) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr9);
                java.lang.String intern = ((java.lang.String) objArr9[0]).intern();
                j = j4;
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                b((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 718751013, (-1771563442) - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), android.graphics.drawable.Drawable.resolveOpacity(0, 0) - 14, (byte) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), (short) android.graphics.Color.alpha(0), objArr10);
                java.lang.Object[] objArr11 = {invoke, new java.lang.String[]{intern, ((java.lang.String) objArr10[0]).intern()}};
                java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1831766780);
                if (obj6 == null) {
                    java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), android.text.TextUtils.indexOf("", "", 0, 0) + 2880, (char) (android.os.Process.myTid() >> 22));
                    byte[] bArr3 = $$a;
                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                    a(653, (byte) (-bArr3[16]), (byte) (-bArr3[14]), objArr12);
                    obj6 = cls4.getMethod((java.lang.String) objArr12[0], java.lang.String.class, java.lang.String[].class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1831766780, obj6);
                }
                long longValue2 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr11)).longValue();
                long j6 = ~longValue2;
                long j7 = (((((367 * longValue2) - 597497279761L) + ((longValue2 | (-1628057983)) * (-366))) + (((~(j6 | j2)) | (-1628057983)) * (-366))) + (((~((j6 | (-1628057983)) | j2)) | (~(longValue2 | 1628057982))) * 366)) - 400653796;
                if (((((int) j7) & ((((-1208288289) | i) * (-381)) + 264804774 + (((~(833641437 | i11)) | (-1226118566)) * 381) + 796337056)) | (((int) (j7 >> 32)) & ((((~((-33723858) | i)) | (~(1403502553 | i))) * 69) + 6525314 + (((~((-1392950738) | i)) | 1359226880 | (~(44275673 | i))) * (-69)) + 728075304))) != 0) {
                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                    b((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 718751023, android.widget.ExpandableListView.getPackedPositionGroup(0L) - 1771563434, (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) - 14, (byte) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), (short) (1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))), objArr13);
                    java.lang.Object[] objArr14 = {((java.lang.String) objArr13[0]).intern()};
                    java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                    if (obj7 == null) {
                        java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.text.TextUtils.getOffsetBefore("", 0), android.text.TextUtils.getTrimmedLength("") + 1921, (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1));
                        byte[] bArr4 = $$a;
                        java.lang.Object[] objArr15 = new java.lang.Object[1];
                        a(653, (byte) (-bArr4[16]), (byte) (-bArr4[14]), objArr15);
                        obj7 = cls5.getMethod((java.lang.String) objArr15[0], java.lang.String.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj7);
                    }
                    java.lang.Object invoke2 = ((java.lang.reflect.Method) obj7).invoke(null, objArr14);
                    java.lang.Object[] objArr16 = new java.lang.Object[1];
                    b(718751023 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), android.graphics.Color.green(0) - 1771563411, (-14) - (android.view.KeyEvent.getMaxKeyCode() >> 16), (byte) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1), (short) android.text.TextUtils.indexOf("", "", 0, 0), objArr16);
                    java.lang.Object[] objArr17 = {((java.lang.String) objArr16[0]).intern()};
                    java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                    if (obj8 == null) {
                        java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(41 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1921, (char) android.graphics.Color.red(0));
                        byte[] bArr5 = $$a;
                        java.lang.Object[] objArr18 = new java.lang.Object[1];
                        a(653, (byte) (-bArr5[16]), (byte) (-bArr5[14]), objArr18);
                        obj8 = cls6.getMethod((java.lang.String) objArr18[0], java.lang.String.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj8);
                    }
                    java.lang.Object invoke3 = ((java.lang.reflect.Method) obj8).invoke(null, objArr17);
                    if (invoke2 != null) {
                        java.lang.Object[] objArr19 = {invoke2, 42};
                        java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                        if (obj9 == null) {
                            java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2593, (char) android.widget.ExpandableListView.getPackedPositionGroup(0L));
                            byte[] bArr6 = $$a;
                            java.lang.Object[] objArr20 = new java.lang.Object[1];
                            a(653, (byte) (-bArr6[16]), (byte) (-bArr6[14]), objArr20);
                            obj9 = cls7.getMethod((java.lang.String) objArr20[0], java.lang.String.class, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj9);
                        }
                        long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) obj9).invoke(null, objArr19)).longValue();
                        long j8 = ~longValue3;
                        long j9 = ~(j8 | 592477052 | j2);
                        obj2 = invoke2;
                        str2 = "";
                        long j10 = ((-712) * longValue3) + 423028615128L + (((~(j | (-592477053))) | (~(longValue3 | (-592477053))) | j9) * (-713)) + (j9 * 1426) + ((~(j8 | j)) * 713) + 664623472;
                        if (((((int) j10) & (((~(2007533262 | i11)) * 979) + 1122443422 + ((570306852 | i) * (-979)) + (((~(2007533262 | i)) | (~(570306852 | i11))) * 979))) | (((int) (j10 >> 32)) & (((((~(195626441 | i)) | 178783369) * (-502)) - 1631345130) + ((~(1811636221 | i11)) * (-502)) + (((~((-1632852853) | i)) | 195626441) * 502)))) == 477111747) {
                            i2 = i11;
                            str = str2;
                            if (android.os.Build.VERSION.SDK_INT > 33) {
                                java.lang.Object[] objArr21 = new java.lang.Object[1];
                                b(android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 718750958, android.view.View.MeasureSpec.makeMeasureSpec(0, 0) - 1771563381, ((android.os.Process.getThreadPriority(0) + 20) >> 6) - 14, (byte) (1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (short) android.view.View.resolveSizeAndState(0, 0, 0), objArr21);
                                java.lang.Object[] objArr22 = {((java.lang.String) objArr21[0]).intern()};
                                java.lang.Object obj10 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                                if (obj10 == null) {
                                    java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - android.graphics.Color.alpha(0), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 3160, (char) (android.text.TextUtils.indexOf(str, str, 0, 0) + 33099));
                                    byte[] bArr7 = $$a;
                                    java.lang.Object[] objArr23 = new java.lang.Object[1];
                                    a(653, (byte) (-bArr7[16]), (byte) (-bArr7[14]), objArr23);
                                    obj10 = cls8.getMethod((java.lang.String) objArr23[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, obj10);
                                }
                                long longValue4 = ((java.lang.Long) ((java.lang.reflect.Method) obj10).invoke(null, objArr22)).longValue();
                                long j11 = ~longValue4;
                                long j12 = (((((319 * longValue4) + 204050453711L) + (((~((j | (-643692283)) | longValue4)) | (~((643692282 | j11) | j2))) * (-318))) + (((~((-643692283) | j11)) | (~((-643692283) | j2))) * (-318))) + (((~(643692282 | j2)) | j11) * 318)) - 693975825;
                                if (((((int) (j12 >> 32)) & (((((-1080033377) | i2) * (-369)) - 802173004) + (((~(1240498288 | i2)) | (-1617242597)) * (-369)) + (((~((-1240498289) | i)) | 160464912 | (~((-537209221) | i2))) * 369))) | (((int) j12) & ((((~((-134807889) | i2)) | (~(1766828501 | i))) * 988) + 601760125 + (((~((-1225720273) | i)) | 1090912384 | (~(1766828501 | i2))) * 988)))) == 1) {
                                    i9 = 1;
                                    c = 0;
                                    int[] iArr = new int[i9];
                                    int[] iArr2 = new int[i9];
                                    iArr[c] = i;
                                    iArr2[c] = i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE;
                                    java.lang.Object[] objArr24 = {iArr, iArr2, null, new int[i9]};
                                    java.lang.Object[] objArr25 = {1735383130, 16, java.lang.Integer.valueOf(((((~(i | 134545460)) | 574780059) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE) - 1771104075) + (((~(134545460 | i2)) | 574780043) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE))};
                                    java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                    if (obj11 == null) {
                                        java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 2712 - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6));
                                        byte b2 = $$a[14];
                                        short s2 = (short) (b2 - 1);
                                        java.lang.Object[] objArr26 = new java.lang.Object[1];
                                        a(s2, (byte) s2, (byte) (-b2), objArr26);
                                        obj11 = cls9.getMethod((java.lang.String) objArr26[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj11);
                                    }
                                    ((int[]) objArr24[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj11).invoke(null, objArr25)).intValue();
                                    return objArr24;
                                }
                            } else {
                                java.lang.Object[] objArr27 = new java.lang.Object[1];
                                b(718751023 - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), android.text.TextUtils.getCapsMode(str, 0, 0) - 1771563353, android.widget.ExpandableListView.getPackedPositionGroup(0L) - 14, (byte) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (short) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr27);
                                java.lang.Object[] objArr28 = {((java.lang.String) objArr27[0]).intern()};
                                java.lang.Object obj12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                if (obj12 == null) {
                                    java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.ImageFormat.getBitsPerPixel(0) + 41, (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 1921, (char) (android.view.MotionEvent.axisFromString(str) + 1));
                                    byte[] bArr8 = $$a;
                                    java.lang.Object[] objArr29 = new java.lang.Object[1];
                                    a(653, (byte) (-bArr8[16]), (byte) (-bArr8[14]), objArr29);
                                    obj12 = cls10.getMethod((java.lang.String) objArr29[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj12);
                                }
                                java.lang.Object invoke4 = ((java.lang.reflect.Method) obj12).invoke(null, objArr28);
                                c = 0;
                                i9 = 1;
                                java.lang.Object[] objArr30 = new java.lang.Object[1];
                                c((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (55751 - android.view.View.getDefaultSize(0, 0)), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 1, objArr30);
                            }
                        }
                    } else {
                        obj2 = invoke2;
                        str2 = "";
                    }
                    if (invoke3 != null) {
                        java.lang.Object[] objArr31 = {invoke3, 42};
                        java.lang.Object obj13 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                        if (obj13 == null) {
                            java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), android.graphics.ImageFormat.getBitsPerPixel(0) + 2595, (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16));
                            byte[] bArr9 = $$a;
                            java.lang.Object[] objArr32 = new java.lang.Object[1];
                            a(653, (byte) (-bArr9[16]), (byte) (-bArr9[14]), objArr32);
                            obj13 = cls11.getMethod((java.lang.String) objArr32[0], java.lang.String.class, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj13);
                        }
                        long longValue5 = ((java.lang.Long) ((java.lang.reflect.Method) obj13).invoke(null, objArr31)).longValue();
                        long j13 = ~longValue5;
                        long j14 = j13 | 661689669;
                        i2 = i11;
                        long j15 = ((-496) * longValue5) + 328198076320L + ((~j14) * 497) + (((~(j14 | j2)) | (~(j13 | j | (-661689670)))) * 497) + (((~(j | 661689669)) | (~(longValue5 | 661689669)) | (~((-661689670) | j13 | j2))) * 497) + 1918790194;
                        if (((((int) j15) & (((43385474 | i2) * 1324) + 818885255 + (((~((-2087221566) | i)) | (~(649995155 | i))) * (-1324)) + 431062902)) | (((int) (j15 >> 32)) & ((((~((-76564678) | i2)) | 75513989) * 529) + 1520786966 + (((~((-76564678) | i)) | (-1513791089)) * 529)))) != 477111747) {
                        }
                        str = str2;
                        if (android.os.Build.VERSION.SDK_INT > 33) {
                        }
                    } else {
                        i2 = i11;
                    }
                    if (obj2 != null) {
                        java.lang.Object[] objArr33 = {obj2, 42};
                        java.lang.Object obj14 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                        if (obj14 == null) {
                            str3 = str2;
                            java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 28, 2593 - android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                            byte[] bArr10 = $$a;
                            java.lang.Object[] objArr34 = new java.lang.Object[1];
                            a(653, (byte) (-bArr10[16]), (byte) (-bArr10[14]), objArr34);
                            obj14 = cls12.getMethod((java.lang.String) objArr34[0], java.lang.String.class, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj14);
                        } else {
                            str3 = str2;
                        }
                        long longValue6 = ((java.lang.Long) ((java.lang.reflect.Method) obj14).invoke(null, objArr33)).longValue();
                        long j16 = ~longValue6;
                        long j17 = ~(j16 | 723975889);
                        long j18 = ((-445) * longValue6) + 322169271050L + (((~(j16 | j)) | j17) * 446) + (((~(longValue6 | 723975889)) | (~(j16 | (-723975890) | j2))) * 446) + (j17 * 446) + 1981076414;
                        if (((((int) j18) & ((((((~((-253667637) | i)) | 185991456) | (~((-1623217867) | i2))) * 886) - 1225531191) + (((~(253667636 | i2)) | (-1690894047)) * (-1772)) + ((~((-1690894047) | i2)) * 886))) | (((int) (j18 >> 32)) & (((((~(1969969006 | i)) | 879383142) * (-502)) - 659852550) + ((~((-8388737) | i2)) * (-502)) + (((~(887771878 | i)) | 1969969006) * 502)))) == -1032769152) {
                            str = str3;
                            if (android.os.Build.VERSION.SDK_INT > 33) {
                            }
                        }
                    } else {
                        str3 = str2;
                    }
                    if (invoke3 != null) {
                        java.lang.Object[] objArr35 = {invoke3, 42};
                        java.lang.Object obj15 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                        if (obj15 == null) {
                            java.lang.Class cls13 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - android.text.TextUtils.getTrimmedLength(str3), 2594 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())));
                            byte[] bArr11 = $$a;
                            java.lang.Object[] objArr36 = new java.lang.Object[1];
                            a(653, (byte) (-bArr11[16]), (byte) (-bArr11[14]), objArr36);
                            obj15 = cls13.getMethod((java.lang.String) objArr36[0], java.lang.String.class, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj15);
                        }
                        long longValue7 = ((java.lang.Long) ((java.lang.reflect.Method) obj15).invoke(null, objArr35)).longValue();
                        long j19 = ~((-707033101) | longValue7);
                        long j20 = (~longValue7) | 707033100;
                        str = str3;
                        long j21 = (1435 * longValue7) + 506235700316L + ((longValue7 | 707033100) * (-1434)) + (((~(j20 | j2)) | (~(j | longValue7)) | j19) * 717) + (((~(j20 | j)) | j19 | (~(longValue7 | j2))) * 717) + 1964133625;
                    } else {
                        str = str3;
                    }
                } else {
                    str = "";
                    i2 = i11;
                }
                i3 = 0;
            } else {
                str = "";
                j = j4;
                i2 = i11;
                i3 = 0;
            }
            java.lang.Object[] objArr37 = new java.lang.Object[1];
            b(android.view.View.resolveSize(i3, i3) + 718751007, (-1771563340) - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), android.widget.ExpandableListView.getPackedPositionType(0L) - 14, (byte) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (short) ((android.os.Process.getThreadPriority(i3) + 20) >> 6), objArr37);
            java.lang.String intern2 = ((java.lang.String) objArr37[0]).intern();
            java.lang.Object[] objArr38 = new java.lang.Object[1];
            c(-android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) android.graphics.Color.blue(0), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 6, objArr38);
            java.lang.String intern3 = ((java.lang.String) objArr38[0]).intern();
            java.lang.Object[] objArr39 = new java.lang.Object[1];
            c((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 7, (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16), 7 - android.view.View.MeasureSpec.getSize(0), objArr39);
            java.lang.String intern4 = ((java.lang.String) objArr39[0]).intern();
            java.lang.Object[] objArr40 = new java.lang.Object[1];
            c(15 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) android.text.TextUtils.getTrimmedLength(str), 9 - android.view.View.resolveSizeAndState(0, 0, 0), objArr40);
            java.lang.String intern5 = ((java.lang.String) objArr40[0]).intern();
            java.lang.Object[] objArr41 = new java.lang.Object[1];
            b(718751015 - android.text.TextUtils.getOffsetAfter(str, 0), android.widget.ExpandableListView.getPackedPositionGroup(0L) - 1771563332, android.graphics.Color.green(0) - 14, (byte) android.text.TextUtils.indexOf(str, str, 0), (short) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr41);
            java.lang.String intern6 = ((java.lang.String) objArr41[0]).intern();
            java.lang.Object[] objArr42 = new java.lang.Object[1];
            c(24 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) android.view.View.MeasureSpec.getSize(0), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 12, objArr42);
            java.lang.String intern7 = ((java.lang.String) objArr42[0]).intern();
            java.lang.Object[] objArr43 = new java.lang.Object[1];
            b(718751015 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), android.view.View.combineMeasuredStates(0, 0) - 1771563326, (-15) - android.graphics.ImageFormat.getBitsPerPixel(0), (byte) (android.view.MotionEvent.axisFromString(str) + 1), (short) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr43);
            java.lang.String intern8 = ((java.lang.String) objArr43[0]).intern();
            java.lang.Object[] objArr44 = new java.lang.Object[1];
            b((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 718751015, (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1771563322, ((byte) android.view.KeyEvent.getModifierMetaStateMask()) - 13, (byte) android.view.View.getDefaultSize(0, 0), (short) (android.os.Process.getGidForName(str) + 1), objArr44);
            java.lang.String intern9 = ((java.lang.String) objArr44[0]).intern();
            java.lang.Object[] objArr45 = new java.lang.Object[1];
            b((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 718751015, android.view.View.resolveSizeAndState(0, 0, 0) - 1771563315, (-14) - android.graphics.Color.alpha(0), (byte) (android.graphics.Color.rgb(0, 0, 0) + 16777216), (short) android.view.View.MeasureSpec.getMode(0), objArr45);
            java.lang.String intern10 = ((java.lang.String) objArr45[0]).intern();
            java.lang.Object[] objArr46 = new java.lang.Object[1];
            c(35 - android.widget.ExpandableListView.getPackedPositionChild(0L), (char) android.view.Gravity.getAbsoluteGravity(0, 0), 15 - android.widget.ExpandableListView.getPackedPositionChild(0L), objArr46);
            java.lang.String intern11 = ((java.lang.String) objArr46[0]).intern();
            java.lang.Object[] objArr47 = new java.lang.Object[1];
            b(android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 718751019, android.text.TextUtils.getCapsMode(str, 0, 0) - 1771563313, (-14) - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (byte) android.graphics.Color.alpha(0), (short) (android.view.ViewConfiguration.getTapTimeout() >> 16), objArr47);
            java.lang.String intern12 = ((java.lang.String) objArr47[0]).intern();
            java.lang.Object[] objArr48 = new java.lang.Object[1];
            b(718751022 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1771563304, (-13) - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (byte) (android.view.MotionEvent.axisFromString(str) + 1), (short) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr48);
            java.lang.String intern13 = ((java.lang.String) objArr48[0]).intern();
            java.lang.Object[] objArr49 = new java.lang.Object[1];
            c((android.view.KeyEvent.getMaxKeyCode() >> 16) + 52, (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 11 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr49);
            java.lang.String intern14 = ((java.lang.String) objArr49[0]).intern();
            java.lang.Object[] objArr50 = new java.lang.Object[1];
            b(718751022 - android.view.View.resolveSizeAndState(0, 0, 0), (-1771563294) - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (-15) - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (byte) android.widget.ExpandableListView.getPackedPositionGroup(0L), (short) android.graphics.Color.blue(0), objArr50);
            java.lang.String intern15 = ((java.lang.String) objArr50[0]).intern();
            java.lang.Object[] objArr51 = new java.lang.Object[1];
            b(android.view.Gravity.getAbsoluteGravity(0, 0) + 718751024, android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 1771563280, (-15) - android.os.Process.getGidForName(str), (byte) (android.view.ViewConfiguration.getScrollBarSize() >> 8), (short) android.widget.ExpandableListView.getPackedPositionType(0L), objArr51);
            java.lang.String intern16 = ((java.lang.String) objArr51[0]).intern();
            java.lang.Object[] objArr52 = new java.lang.Object[1];
            c(64 - (android.os.Process.myTid() >> 22), (char) (android.text.TextUtils.getTrimmedLength(str) + 52393), 7 - android.view.KeyEvent.keyCodeFromString(str), objArr52);
            java.lang.String intern17 = ((java.lang.String) objArr52[0]).intern();
            java.lang.Object[] objArr53 = new java.lang.Object[1];
            b(android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 718751026, (-1771563274) - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (android.view.ViewConfiguration.getEdgeSlop() >> 16) - 14, (byte) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (short) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr53);
            java.lang.String intern18 = ((java.lang.String) objArr53[0]).intern();
            java.lang.Object[] objArr54 = new java.lang.Object[1];
            c(71 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), android.view.View.MeasureSpec.getSize(0) + 2, objArr54);
            java.lang.String intern19 = ((java.lang.String) objArr54[0]).intern();
            java.lang.Object[] objArr55 = new java.lang.Object[1];
            c(73 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) android.text.TextUtils.getCapsMode(str, 0, 0), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 20, objArr55);
            java.lang.String intern20 = ((java.lang.String) objArr55[0]).intern();
            java.lang.Object[] objArr56 = new java.lang.Object[1];
            b(718751025 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) - 1771563267, (-15) - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (byte) android.view.KeyEvent.normalizeMetaState(0), (short) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr56);
            java.lang.String intern21 = ((java.lang.String) objArr56[0]).intern();
            java.lang.Object[] objArr57 = new java.lang.Object[1];
            c((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 93, (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 3, objArr57);
            java.lang.String intern22 = ((java.lang.String) objArr57[0]).intern();
            java.lang.Object[] objArr58 = new java.lang.Object[1];
            b(718751025 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) - 1771563260, (-14) - android.view.View.MeasureSpec.getMode(0), (byte) ((-1) - android.os.Process.getGidForName(str)), (short) android.view.KeyEvent.keyCodeFromString(str), objArr58);
            java.lang.String intern23 = ((java.lang.String) objArr58[0]).intern();
            java.lang.Object[] objArr59 = new java.lang.Object[1];
            c(94 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (12379 - android.widget.ExpandableListView.getPackedPositionType(0L)), 9 - (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr59);
            java.lang.String intern24 = ((java.lang.String) objArr59[0]).intern();
            java.lang.Object[] objArr60 = new java.lang.Object[1];
            b(android.text.TextUtils.indexOf(str, str, 0) + 718751026, android.text.TextUtils.indexOf(str, str) - 1771563245, (-14) - android.view.View.MeasureSpec.getMode(0), (byte) android.text.TextUtils.indexOf(str, str), (short) android.view.View.combineMeasuredStates(0, 0), objArr60);
            java.lang.String intern25 = ((java.lang.String) objArr60[0]).intern();
            java.lang.Object[] objArr61 = new java.lang.Object[1];
            c(104 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (char) (1 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 11, objArr61);
            java.lang.String intern26 = ((java.lang.String) objArr61[0]).intern();
            java.lang.Object[] objArr62 = new java.lang.Object[1];
            c((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 115, (char) (33071 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16)), android.graphics.Color.blue(0) + 11, objArr62);
            java.lang.String intern27 = ((java.lang.String) objArr62[0]).intern();
            java.lang.Object[] objArr63 = new java.lang.Object[1];
            c(126 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) (android.view.KeyEvent.normalizeMetaState(0) + 1328), 15 - android.text.TextUtils.getCapsMode(str, 0, 0), objArr63);
            java.lang.String intern28 = ((java.lang.String) objArr63[0]).intern();
            java.lang.Object[] objArr64 = new java.lang.Object[1];
            c((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 141, (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '\"', objArr64);
            java.lang.String[] strArr = {intern2, intern3, intern4, intern5, intern6, intern7, intern8, intern9, intern10, intern11, intern12, intern13, intern14, intern15, intern16, intern17, intern18, intern19, intern20, intern21, intern22, intern23, intern24, intern25, intern26, intern27, intern28, ((java.lang.String) objArr64[0]).intern()};
            java.lang.Object[] objArr65 = new java.lang.Object[1];
            b(android.graphics.Color.red(0) + 718751024, android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) - 1771563458, (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 15, (byte) android.graphics.Color.red(0), (short) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr65);
            java.lang.Object[] objArr66 = {((java.lang.String) objArr65[0]).intern()};
            java.lang.Object obj16 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
            if (obj16 == null) {
                java.lang.Class cls14 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.text.TextUtils.indexOf(str, str, 0, 0), android.text.TextUtils.getOffsetBefore(str, 0) + 1921, (char) android.text.TextUtils.getTrimmedLength(str));
                byte[] bArr12 = $$a;
                java.lang.Object[] objArr67 = new java.lang.Object[1];
                a(653, (byte) (-bArr12[16]), (byte) (-bArr12[14]), objArr67);
                obj16 = cls14.getMethod((java.lang.String) objArr67[0], java.lang.String.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj16);
            }
            java.lang.String str4 = (java.lang.String) ((java.lang.reflect.Method) obj16).invoke(null, objArr66);
            if (str4 != null) {
                java.lang.Object[] objArr68 = new java.lang.Object[1];
                b(718751023 - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) - 1771563448, android.view.KeyEvent.keyCodeFromString(str) - 14, (byte) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (short) android.view.View.resolveSizeAndState(0, 0, 0), objArr68);
                java.lang.String intern29 = ((java.lang.String) objArr68[0]).intern();
                java.lang.Object[] objArr69 = new java.lang.Object[1];
                b(android.text.TextUtils.getOffsetAfter(str, 0) + 718751013, (-1771563441) - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) - 14, (byte) ((-1) - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), (short) android.view.KeyEvent.getDeadChar(0, 0), objArr69);
                java.lang.String[] strArr2 = {intern29, ((java.lang.String) objArr69[0]).intern()};
                int i12 = 2;
                int i13 = 0;
                while (true) {
                    if (i13 >= i12) {
                        break;
                    }
                    if (str4.contains(strArr2[i13])) {
                        java.lang.Object[] objArr70 = new java.lang.Object[1];
                        b((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 718751024, android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 1771563433, android.os.Process.getGidForName(str) - 13, (byte) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (short) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), objArr70);
                        java.lang.Object[] objArr71 = {((java.lang.String) objArr70[0]).intern()};
                        java.lang.Object obj17 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                        if (obj17 == null) {
                            java.lang.Class cls15 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.view.View.getDefaultSize(0, 0), 1921 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) android.widget.ExpandableListView.getPackedPositionGroup(0L));
                            byte[] bArr13 = $$a;
                            java.lang.Object[] objArr72 = new java.lang.Object[1];
                            a(653, (byte) (-bArr13[16]), (byte) (-bArr13[14]), objArr72);
                            obj17 = cls15.getMethod((java.lang.String) objArr72[0], java.lang.String.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj17);
                        }
                        java.lang.Object invoke5 = ((java.lang.reflect.Method) obj17).invoke(null, objArr71);
                        java.lang.Object[] objArr73 = new java.lang.Object[1];
                        b(718751025 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (-1771563411) - android.text.TextUtils.getOffsetBefore(str, 0), android.view.Gravity.getAbsoluteGravity(0, 0) - 14, (byte) android.text.TextUtils.getOffsetBefore(str, 0), (short) (android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1), objArr73);
                        java.lang.Object[] objArr74 = {((java.lang.String) objArr73[0]).intern()};
                        java.lang.Object obj18 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                        if (obj18 == null) {
                            java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.view.View.MeasureSpec.getMode(0), 1921 - android.view.View.getDefaultSize(0, 0), (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1));
                            byte[] bArr14 = $$a;
                            java.lang.Object[] objArr75 = new java.lang.Object[1];
                            a(653, (byte) (-bArr14[16]), (byte) (-bArr14[14]), objArr75);
                            obj18 = cls16.getMethod((java.lang.String) objArr75[0], java.lang.String.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj18);
                        }
                        java.lang.Object invoke6 = ((java.lang.reflect.Method) obj18).invoke(null, objArr74);
                        if (invoke5 != null) {
                            java.lang.Object[] objArr76 = {invoke5, 42};
                            java.lang.Object obj19 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                            if (obj19 == null) {
                                java.lang.Class cls17 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - android.widget.ExpandableListView.getPackedPositionGroup(0L), 2594 - android.view.KeyEvent.getDeadChar(0, 0), (char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))));
                                byte[] bArr15 = $$a;
                                java.lang.Object[] objArr77 = new java.lang.Object[1];
                                a(653, (byte) (-bArr15[16]), (byte) (-bArr15[14]), objArr77);
                                obj19 = cls17.getMethod((java.lang.String) objArr77[0], java.lang.String.class, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj19);
                            }
                            long longValue8 = ((java.lang.Long) ((java.lang.reflect.Method) obj19).invoke(null, objArr76)).longValue();
                            long j22 = ~longValue8;
                            long j23 = ((-565) * longValue8) + 315876524418L + (((~(j2 | (-557101455))) | (~(longValue8 | (-557101455)))) * (-566)) + ((~(557101454 | j22)) * 566) + ((~((-557101455) | j22 | j2)) * 566) + 699999070;
                        }
                        if (invoke6 != null) {
                            java.lang.Object[] objArr78 = {invoke6, 42};
                            java.lang.Object obj20 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                            if (obj20 == null) {
                                java.lang.Class cls18 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myPid() >> 22) + 28, (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 2594, (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                                byte[] bArr16 = $$a;
                                java.lang.Object[] objArr79 = new java.lang.Object[1];
                                a(653, (byte) (-bArr16[16]), (byte) (-bArr16[14]), objArr79);
                                obj20 = cls18.getMethod((java.lang.String) objArr79[0], java.lang.String.class, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj20);
                            }
                            long longValue9 = ((java.lang.Long) ((java.lang.reflect.Method) obj20).invoke(null, objArr78)).longValue();
                            long j24 = ~longValue9;
                            long j25 = j | (-1010751194);
                            long j26 = (242 * longValue9) + 488192826219L + (((~(j24 | (-1010751194))) | (~j25)) * (-241)) + ((longValue9 | 1010751193) * (-482)) + (((~(1010751193 | j24)) | (~(j25 | longValue9))) * 241) + 246349331;
                        }
                    } else {
                        i13++;
                        i12 = 2;
                    }
                }
            }
            java.lang.Object[] objArr80 = new java.lang.Object[1];
            b(718750957 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), android.text.TextUtils.getCapsMode(str, 0, 0) - 1771563235, (-14) - android.widget.ExpandableListView.getPackedPositionType(0L), (byte) android.widget.ExpandableListView.getPackedPositionType(0L), (short) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1), objArr80);
            java.lang.Object[] objArr81 = {((java.lang.String) objArr80[0]).intern()};
            java.lang.Object obj21 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
            if (obj21 == null) {
                java.lang.Class cls19 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 30, android.view.KeyEvent.getDeadChar(0, 0) + 2807, (char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())));
                byte[] bArr17 = $$a;
                java.lang.Object[] objArr82 = new java.lang.Object[1];
                a(653, (byte) (-bArr17[16]), (byte) (-bArr17[14]), objArr82);
                obj21 = cls19.getMethod((java.lang.String) objArr82[0], java.lang.String.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj21);
            }
            long longValue10 = ((java.lang.Long) ((java.lang.reflect.Method) obj21).invoke(null, objArr81)).longValue();
            long j27 = ~(553955953 | longValue10);
            long j28 = ~longValue10;
            long j29 = ~(j | (-553955954));
            long j30 = (((-1187) * longValue10) - 329603792630L) + ((j27 | (~(j | longValue10))) * (-1188)) + ((j27 | (~(j28 | j2)) | j29) * 594) + (((~(j28 | j)) | (~(j28 | (-553955954))) | j29) * 594) + 1844496021;
            int i14 = ~((-648708101) | i2);
            long j31 = (((int) (j30 >> 32)) & ((((~(1389029833 | i2)) | (-1472915916)) * 446) + 384374654 + (((~((-83886083) | i)) | 4204864) * 446) + 209497752)) | (((int) j30) & ((((~(784303140 | i)) | (-788518310) | i14) * (-470)) + 1621322641 + ((i14 | (~((-4215170) | i))) * 470)));
            java.lang.Object[] objArr83 = new java.lang.Object[1];
            c(android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, (char) (android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 56434), 17 - android.text.TextUtils.getOffsetBefore(str, 0), objArr83);
            java.lang.Object[] objArr84 = {((java.lang.String) objArr83[0]).intern()};
            java.lang.Object obj22 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
            if (obj22 == null) {
                java.lang.Class cls20 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 28, 2855 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1));
                byte[] bArr18 = $$a;
                java.lang.Object[] objArr85 = new java.lang.Object[1];
                a(653, (byte) (-bArr18[16]), (byte) (-bArr18[14]), objArr85);
                obj22 = cls20.getMethod((java.lang.String) objArr85[0], java.lang.String.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj22);
            }
            long longValue11 = ((java.lang.Long) ((java.lang.reflect.Method) obj22).invoke(null, objArr84)).longValue();
            long j32 = ~longValue11;
            long j33 = j32 | 96972179;
            java.lang.String str5 = str;
            long j34 = ((-167) * longValue11) + 16194354060L + (((~j33) | (~(j32 | j))) * 168) + ((~(j33 | j2)) * 168) + (((~(j | 96972179)) | (~(longValue11 | 96972179)) | (~((-96972180) | j32 | j2))) * 168) + 1387512247;
            int i15 = ~(1157414442 | i2);
            long j35 = (((int) j34) & (((((1146103808 | i15) | (~((-1157414443) | i))) * (-338)) - 601195947) + ((i15 | (~((-11310635) | i))) * 338))) | (((int) (j34 >> 32)) & ((((~((-488792339) | i2)) | 220348674) * 529) + 1520786966 + (((~((-488792339) | i)) | (-1926018750)) * 529)));
            if (j31 > 0) {
                int i16 = getAid;
                SdkCoreAlternateContactlessPaymentDataImpl = (i16 + 89) % 128;
                if (j35 > 0 && j35 - 3 < j31) {
                    SdkCoreAlternateContactlessPaymentDataImpl = (i16 + 29) % 128;
                    java.lang.Object[] objArr86 = {new int[]{i}, new int[]{i ^ 247}, null, new int[1]};
                    java.lang.Object[] objArr87 = {1735383130, 16, java.lang.Integer.valueOf(((((~(i | (-138973249))) | 848298768) * (-756)) - 237339133) + (((-138973249) | i2) * 756))};
                    java.lang.Object obj23 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj23 == null) {
                        java.lang.Class cls21 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str5, str5, 0) + 50, (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 2713, (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16));
                        byte b3 = $$a[14];
                        short s3 = (short) (b3 - 1);
                        java.lang.Object[] objArr88 = new java.lang.Object[1];
                        a(s3, (byte) s3, (byte) (-b3), objArr88);
                        obj23 = cls21.getMethod((java.lang.String) objArr88[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj23);
                    }
                    ((int[]) objArr86[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj23).invoke(null, objArr87)).intValue();
                    return objArr86;
                }
            }
            java.lang.Object[] objArr89 = new java.lang.Object[1];
            b(718750956 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (-1771563235) - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) - 14, (byte) android.view.View.resolveSizeAndState(0, 0, 0), (short) ((android.os.Process.getThreadPriority(0) + 20) >> 6), objArr89);
            java.lang.Object[] objArr90 = {((java.lang.String) objArr89[0]).intern()};
            java.lang.Object obj24 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
            if (obj24 == null) {
                java.lang.Class cls22 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - android.view.View.resolveSize(0, 0), 2806 - android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) ((-1) - android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)));
                byte[] bArr19 = $$a;
                java.lang.Object[] objArr91 = new java.lang.Object[1];
                a(653, (byte) (-bArr19[16]), (byte) (-bArr19[14]), objArr91);
                obj24 = cls22.getMethod((java.lang.String) objArr91[0], java.lang.String.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj24);
            }
            long longValue12 = ((java.lang.Long) ((java.lang.reflect.Method) obj24).invoke(null, objArr90)).longValue();
            long j36 = ~longValue12;
            long j37 = ~(j36 | j2);
            long j38 = (longValue12 * 246) + 51372932176L + (((~(j36 | j)) | (~(j36 | (-210544804)))) * (-245)) + ((-245) * j37) + (((-210544804) | j37) * 245) + 1501084871;
            long j39 = (((int) (j38 >> 32)) & ((((-1074866689) | i) * (-381)) + 1339146700 + (((~(323933690 | i2)) | (-1360374347)) * 381) + 1502315008)) | (((int) j38) & ((((~((-1315893570) | i)) | 1248243968 | (~(1609496917 | i2))) * 886) + 1466419663 + (((~(1315893569 | i2)) | 1541847316) * (-1772)) + ((~(1541847316 | i2)) * 886)));
            java.lang.Object[] objArr92 = new java.lang.Object[1];
            c(android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 185, (char) android.view.KeyEvent.getDeadChar(0, 0), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 4, objArr92);
            java.lang.Object[] objArr93 = {((java.lang.String) objArr92[0]).intern()};
            java.lang.Object obj25 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
            if (obj25 == null) {
                java.lang.Class cls23 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 29, 2807 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) android.graphics.Color.blue(0));
                byte[] bArr20 = $$a;
                java.lang.Object[] objArr94 = new java.lang.Object[1];
                a(653, (byte) (-bArr20[16]), (byte) (-bArr20[14]), objArr94);
                obj25 = cls23.getMethod((java.lang.String) objArr94[0], java.lang.String.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj25);
            }
            long longValue13 = ((java.lang.Long) ((java.lang.reflect.Method) obj25).invoke(null, objArr93)).longValue();
            long j40 = ~longValue13;
            long j41 = j | 104452593;
            long j42 = ((-903) * longValue13) + 94529596665L + (((~(j2 | (-104452594))) | (~(j | longValue13))) * (-1808)) + (((~((-104452594) | j40 | j2)) | (~(j41 | longValue13))) * 904) + (((~(j40 | j2)) | (~((-104452594) | longValue13)) | (~j41)) * 904) + 1186087474;
            long j43 = (((int) j42) & ((((~((-671712642) | i)) | 18882568) * 449) + 2129798916 + (((~((-671712642) | i2)) | 18882568) * 449))) | (((int) (j42 >> 32)) & ((((((~(1242175810 | i)) | 541163536) | (~((-1615565075) | i))) * (-754)) - 495110070) + (((~((-541163537) | i)) | (~((-1074401539) | i2))) * (-754)) + ((1242175810 | i2) * 754)));
            if (j39 > 0 && j43 > 0 && j43 + 100 < j39) {
                SdkCoreAlternateContactlessPaymentDataImpl = (getAid + 89) % 128;
                java.lang.Object[] objArr95 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE}, null, new int[1]};
                java.lang.Object[] objArr96 = {1735383130, 16, java.lang.Integer.valueOf((((18969263 | r3) * (-280)) - 58054013) + (((~((-229208768) | i)) | (~((-480116753) | i))) * 140) + (((~(i | (-210239505))) | (~((-18969264) | i2)) | (~((-269877249) | i2))) * 140))};
                java.lang.Object obj26 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj26 == null) {
                    java.lang.Class cls24 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.rgb(0, 0, 0) + 16777266, (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2713, (char) android.text.TextUtils.indexOf(str5, str5, 0));
                    byte b4 = $$a[14];
                    short s4 = (short) (b4 - 1);
                    java.lang.Object[] objArr97 = new java.lang.Object[1];
                    a(s4, (byte) s4, (byte) (-b4), objArr97);
                    obj26 = cls24.getMethod((java.lang.String) objArr97[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj26);
                }
                ((int[]) objArr95[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj26).invoke(null, objArr96)).intValue();
                return objArr95;
            }
            java.lang.Object[] objArr98 = new java.lang.Object[1];
            c(188 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (android.view.View.getDefaultSize(0, 0) + 55249), 7 - android.view.View.getDefaultSize(0, 0), objArr98);
            java.lang.String intern30 = ((java.lang.String) objArr98[0]).intern();
            java.lang.Object[] objArr99 = new java.lang.Object[1];
            c((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_EXTERNAL_VALUE, (char) android.view.View.combineMeasuredStates(0, 0), 11 - android.widget.ExpandableListView.getPackedPositionType(0L), objArr99);
            java.lang.String intern31 = ((java.lang.String) objArr99[0]).intern();
            java.lang.Object[] objArr100 = new java.lang.Object[1];
            b(718750956 - android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (-1771563212) - android.text.TextUtils.getTrimmedLength(str5), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) - 14, (byte) (android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1), (short) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr100);
            java.lang.String intern32 = ((java.lang.String) objArr100[0]).intern();
            java.lang.Object[] objArr101 = new java.lang.Object[1];
            b(718750957 - android.view.KeyEvent.normalizeMetaState(0), (-1771563200) - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) - 14, (byte) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (short) android.view.View.MeasureSpec.getSize(0), objArr101);
            java.lang.String intern33 = ((java.lang.String) objArr101[0]).intern();
            java.lang.Object[] objArr102 = new java.lang.Object[1];
            b((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 718750956, (-1788340404) - android.graphics.Color.rgb(0, 0, 0), (-14) - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (byte) android.view.KeyEvent.keyCodeFromString(str5), (short) android.graphics.Color.alpha(0), objArr102);
            java.lang.String intern34 = ((java.lang.String) objArr102[0]).intern();
            java.lang.Object[] objArr103 = new java.lang.Object[1];
            b((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 718750956, android.graphics.Color.blue(0) - 1771563177, '\"' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (byte) (android.view.ViewConfiguration.getTapTimeout() >> 16), (short) android.view.KeyEvent.getDeadChar(0, 0), objArr103);
            java.lang.String intern35 = ((java.lang.String) objArr103[0]).intern();
            java.lang.Object[] objArr104 = new java.lang.Object[1];
            b((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 718750957, (-1771563171) - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 14, (byte) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), (short) (1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), objArr104);
            java.lang.String[] strArr3 = {intern30, intern31, intern32, intern33, intern34, intern35, ((java.lang.String) objArr104[0]).intern()};
            int i17 = 0;
            while (true) {
                if (i17 >= 7) {
                    i4 = i;
                    i5 = 0;
                    break;
                }
                java.lang.Object[] objArr105 = {strArr3[i17]};
                java.lang.Object obj27 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2046560211);
                if (obj27 == null) {
                    java.lang.Class cls25 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 27, (-16775544) - android.graphics.Color.rgb(0, 0, 0), (char) (47940 - android.widget.ExpandableListView.getPackedPositionType(0L)));
                    byte[] bArr21 = $$a;
                    java.lang.Object[] objArr106 = new java.lang.Object[1];
                    a(653, (byte) (-bArr21[16]), (byte) (-bArr21[14]), objArr106);
                    obj27 = cls25.getMethod((java.lang.String) objArr106[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2046560211, obj27);
                }
                long longValue14 = ((java.lang.Long) ((java.lang.reflect.Method) obj27).invoke(null, objArr105)).longValue();
                long j44 = (((((603 * longValue14) - 107299189660L) + (((~(j | 355295329)) | longValue14) * (-602))) + ((((~(355295329 | (~longValue14))) | (~(j2 | 355295329))) | (~((j | (-355295330)) | longValue14))) * (-301))) + ((~(j | longValue14)) * 301)) - 1270234852;
                i4 = i;
                if (((((int) (j44 >> 32)) & (((((-1510998453) | i2) * (-490)) - 2010218410) + (((~((-1511002551) | i4)) | 4098) * 490) + 1790569742)) | (((int) j44) & (((~((-1099956357) | i2)) * 433) + 1460934866 + (((~((-946181490) | i4)) | (-1911559397)) * (-433)) + (((~((-1911559397) | i4)) | (-2046137846)) * 433)))) != 0) {
                    i5 = i17 + 90;
                    break;
                }
                i17++;
            }
            if (i5 != 0) {
                java.lang.Object[] objArr107 = {new int[]{i4}, new int[]{i5 ^ i4}, null, new int[1]};
                int i18 = ~((-95944969) | i4);
                java.lang.Object[] objArr108 = {1735383130, 16, java.lang.Integer.valueOf(((268462119 | i18) * (-476)) + 1223110771 + (i18 * 952) + ((~((-95944969) | i2)) * 476))};
                java.lang.Object obj28 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj28 == null) {
                    java.lang.Class cls26 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 2712 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16));
                    byte b5 = $$a[14];
                    short s5 = (short) (b5 - 1);
                    java.lang.Object[] objArr109 = new java.lang.Object[1];
                    a(s5, (byte) s5, (byte) (-b5), objArr109);
                    obj28 = cls26.getMethod((java.lang.String) objArr109[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj28);
                }
                ((int[]) objArr107[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj28).invoke(null, objArr108)).intValue();
                return objArr107;
            }
            try {
                objArr = new java.lang.Object[1];
                c(android.view.View.MeasureSpec.getSize(0) + 206, (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 14 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr);
            } catch (java.lang.Exception unused) {
            }
            try {
                java.lang.Object[] objArr110 = {((java.lang.String) objArr[0]).intern()};
                java.lang.Object obj29 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                if (obj29 == null) {
                    java.lang.Class cls27 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSize(0, 0) + 40, (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1920, (char) ((-1) - android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)));
                    byte[] bArr22 = $$a;
                    java.lang.Object[] objArr111 = new java.lang.Object[1];
                    a(653, (byte) (-bArr22[16]), (byte) (-bArr22[14]), objArr111);
                    obj29 = cls27.getMethod((java.lang.String) objArr111[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj29);
                }
                java.lang.Object invoke7 = ((java.lang.reflect.Method) obj29).invoke(null, objArr110);
                if (invoke7 != null) {
                    java.lang.Object[] objArr112 = new java.lang.Object[1];
                    b(718751009 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 1771563168, (-13) - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (byte) android.graphics.drawable.Drawable.resolveOpacity(0, 0), (short) android.view.View.resolveSize(0, 0), objArr112);
                    try {
                        java.lang.Object[] objArr113 = {invoke7, new java.lang.String[]{((java.lang.String) objArr112[0]).intern()}};
                        java.lang.Object obj30 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1831766780);
                        if (obj30 == null) {
                            java.lang.Class cls28 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 43, ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 2880, (char) android.text.TextUtils.getOffsetBefore(str5, 0));
                            byte[] bArr23 = $$a;
                            java.lang.Object[] objArr114 = new java.lang.Object[1];
                            a(653, (byte) (-bArr23[16]), (byte) (-bArr23[14]), objArr114);
                            obj30 = cls28.getMethod((java.lang.String) objArr114[0], java.lang.String.class, java.lang.String[].class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1831766780, obj30);
                        }
                        long longValue15 = ((java.lang.Long) ((java.lang.reflect.Method) obj30).invoke(null, objArr113)).longValue();
                        long j45 = ~longValue15;
                        long j46 = 1545331839 | j45;
                        long j47 = (((((868 * longValue15) - 1341348037120L) + (((~(j | 1545331839)) | (~(j45 | j))) * (-867))) + ((((~j46) | (~(j2 | 1545331839))) | (~(j45 | j2))) * (-1734))) + ((((~(j46 | j)) | (~((longValue15 | 1545331839) | j2))) | (~(((-1545331840) | j45) | j2))) * 867)) - 483379939;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                java.lang.Object[] objArr115 = new java.lang.Object[1];
                b(android.view.View.MeasureSpec.getSize(0) + 718751015, (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 1771563157, (android.view.KeyEvent.getMaxKeyCode() >> 16) - 14, (byte) ((android.os.Process.getThreadPriority(0) + 20) >> 6), (short) android.text.TextUtils.getTrimmedLength(str5), objArr115);
                try {
                    java.lang.Object[] objArr116 = {((java.lang.String) objArr115[0]).intern()};
                    java.lang.Object obj31 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                    if (obj31 == null) {
                        java.lang.Class cls29 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1922, (char) android.graphics.Color.argb(0, 0, 0, 0));
                        byte[] bArr24 = $$a;
                        java.lang.Object[] objArr117 = new java.lang.Object[1];
                        a(653, (byte) (-bArr24[16]), (byte) (-bArr24[14]), objArr117);
                        obj31 = cls29.getMethod((java.lang.String) objArr117[0], java.lang.String.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj31);
                    }
                    java.lang.Object invoke8 = ((java.lang.reflect.Method) obj31).invoke(null, objArr116);
                    if (invoke8 != null) {
                        getAid = (SdkCoreAlternateContactlessPaymentDataImpl + 119) % 128;
                        java.lang.Object[] objArr118 = new java.lang.Object[1];
                        c(218 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 6, objArr118);
                        if (invoke8.equals(((java.lang.String) objArr118[0]).intern())) {
                            java.lang.Object[] objArr119 = new java.lang.Object[1];
                            c(225 - android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (android.graphics.Color.blue(0) + 28691), 23 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr119);
                            try {
                                java.lang.Object[] objArr120 = {((java.lang.String) objArr119[0]).intern()};
                                java.lang.Object obj32 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                if (obj32 == null) {
                                    java.lang.Class cls30 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.view.View.resolveSizeAndState(0, 0, 0), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 1921, (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                    byte[] bArr25 = $$a;
                                    java.lang.Object[] objArr121 = new java.lang.Object[1];
                                    a(653, (byte) (-bArr25[16]), (byte) (-bArr25[14]), objArr121);
                                    obj32 = cls30.getMethod((java.lang.String) objArr121[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj32);
                                }
                                java.lang.String str6 = (java.lang.String) ((java.lang.reflect.Method) obj32).invoke(null, objArr120);
                                if (str6 != null && (parseInt = java.lang.Integer.parseInt(str6)) != 0) {
                                    i6 = parseInt + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE;
                                    if (i6 == 0) {
                                        java.lang.Object[] objArr122 = {new int[]{i4}, new int[]{i6 ^ i4}, null, new int[1]};
                                        java.lang.Object[] objArr123 = {1735383130, 16, java.lang.Integer.valueOf((((~((-922685125) | i2)) | (-213359605)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE) + 1936568614 + (((~((-79104709) | i2)) | (~((-134254897) | i4))) * (-519)) + (((~((-213359605) | i4)) | 922685124) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE))};
                                        java.lang.Object obj33 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj33 == null) {
                                            java.lang.Class cls31 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), 2713 - android.text.TextUtils.indexOf(str5, str5), (char) android.view.View.getDefaultSize(0, 0));
                                            byte b6 = $$a[14];
                                            short s6 = (short) (b6 - 1);
                                            java.lang.Object[] objArr124 = new java.lang.Object[1];
                                            a(s6, (byte) s6, (byte) (-b6), objArr124);
                                            obj33 = cls31.getMethod((java.lang.String) objArr124[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj33);
                                        }
                                        ((int[]) objArr122[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj33).invoke(null, objArr123)).intValue();
                                        return objArr122;
                                    }
                                    java.lang.Object[] objArr125 = new java.lang.Object[1];
                                    c(205 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) ((-1) - android.os.Process.getGidForName(str5)), 12 - android.widget.ExpandableListView.getPackedPositionChild(0L), objArr125);
                                    java.lang.Object[] objArr126 = {((java.lang.String) objArr125[0]).intern()};
                                    java.lang.Object obj34 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                    if (obj34 == null) {
                                        java.lang.Class cls32 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.KeyEvent.getMaxKeyCode() >> 16) + 40, (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1921, (char) android.text.TextUtils.getCapsMode(str5, 0, 0));
                                        byte[] bArr26 = $$a;
                                        java.lang.Object[] objArr127 = new java.lang.Object[1];
                                        a(653, (byte) (-bArr26[16]), (byte) (-bArr26[14]), objArr127);
                                        obj34 = cls32.getMethod((java.lang.String) objArr127[0], java.lang.String.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj34);
                                    }
                                    java.lang.String str7 = (java.lang.String) ((java.lang.reflect.Method) obj34).invoke(null, objArr126);
                                    if (str7 != null) {
                                        java.lang.Object[] objArr128 = new java.lang.Object[1];
                                        b(android.view.View.MeasureSpec.getSize(0) + 718751009, android.widget.ExpandableListView.getPackedPositionGroup(0L) - 1771563168, android.view.View.resolveSize(0, 0) - 14, (byte) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (short) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0)), objArr128);
                                        java.lang.String[] strArr4 = {((java.lang.String) objArr128[0]).intern()};
                                        int i19 = 0;
                                        while (true) {
                                            if (i19 > 0) {
                                                java.lang.Object[] objArr129 = new java.lang.Object[1];
                                                c(249 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) (android.view.KeyEvent.getMaxKeyCode() >> 16), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 12, objArr129);
                                                java.lang.String intern36 = ((java.lang.String) objArr129[0]).intern();
                                                java.lang.Object[] objArr130 = new java.lang.Object[1];
                                                b(718750957 - android.graphics.Color.red(0), (-1771563139) - android.view.KeyEvent.normalizeMetaState(0), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) - 14, (byte) ((android.os.Process.getThreadPriority(0) + 20) >> 6), (short) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), objArr130);
                                                java.lang.String intern37 = ((java.lang.String) objArr130[0]).intern();
                                                java.lang.Object[] objArr131 = new java.lang.Object[1];
                                                c(android.text.TextUtils.getOffsetAfter(str5, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE, (char) android.graphics.Color.alpha(0), android.view.MotionEvent.axisFromString(str5) + 18, objArr131);
                                                java.lang.String intern38 = ((java.lang.String) objArr131[0]).intern();
                                                java.lang.Object[] objArr132 = new java.lang.Object[1];
                                                b(android.text.TextUtils.getTrimmedLength(str5) + 718750957, android.view.KeyEvent.normalizeMetaState(0) - 1771563123, android.view.View.resolveSize(0, 0) - 14, (byte) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (short) android.graphics.Color.red(0), objArr132);
                                                java.lang.String intern39 = ((java.lang.String) objArr132[0]).intern();
                                                java.lang.Object[] objArr133 = new java.lang.Object[1];
                                                c(156 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) android.view.View.resolveSizeAndState(0, 0, 0), 12 - android.graphics.Color.green(0), objArr133);
                                                java.lang.String intern40 = ((java.lang.String) objArr133[0]).intern();
                                                java.lang.Object[] objArr134 = new java.lang.Object[1];
                                                b(718750958 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (-1771563117) - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (-14) - android.graphics.Color.argb(0, 0, 0, 0), (byte) (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (short) (android.graphics.ImageFormat.getBitsPerPixel(0) + 1), objArr134);
                                                java.lang.String intern41 = ((java.lang.String) objArr134[0]).intern();
                                                java.lang.Object[] objArr135 = new java.lang.Object[1];
                                                b(718750957 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (-1771563100) - android.graphics.Color.argb(0, 0, 0, 0), ((byte) android.view.KeyEvent.getModifierMetaStateMask()) - 13, (byte) android.view.KeyEvent.keyCodeFromString(str5), (short) android.view.View.MeasureSpec.getMode(0), objArr135);
                                                java.lang.String intern42 = ((java.lang.String) objArr135[0]).intern();
                                                java.lang.Object[] objArr136 = new java.lang.Object[1];
                                                b(android.view.View.resolveSizeAndState(0, 0, 0) + 718750957, (-1771563078) - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), android.view.View.MeasureSpec.getSize(0) - 14, (byte) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (short) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr136);
                                                java.lang.String intern43 = ((java.lang.String) objArr136[0]).intern();
                                                java.lang.Object[] objArr137 = new java.lang.Object[1];
                                                b((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 718750956, (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1771563064, android.text.TextUtils.indexOf(str5, str5) - 14, (byte) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (short) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), objArr137);
                                                java.lang.String intern44 = ((java.lang.String) objArr137[0]).intern();
                                                java.lang.Object[] objArr138 = new java.lang.Object[1];
                                                c(android.graphics.Color.rgb(0, 0, 0) + 16777494, (char) (android.graphics.Color.alpha(0) + 39433), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 12, objArr138);
                                                java.lang.String intern45 = ((java.lang.String) objArr138[0]).intern();
                                                java.lang.Object[] objArr139 = new java.lang.Object[1];
                                                c(291 - android.text.TextUtils.indexOf(str5, str5, 0), (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 9 - (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr139);
                                                java.lang.String intern46 = ((java.lang.String) objArr139[0]).intern();
                                                java.lang.Object[] objArr140 = new java.lang.Object[1];
                                                b(android.graphics.Color.red(0) + 718750957, (-1771563038) - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), android.text.TextUtils.indexOf(str5, str5) - 14, (byte) ((-1) - android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), (short) android.graphics.Color.alpha(0), objArr140);
                                                java.lang.String[] strArr5 = {intern36, intern37, intern38, intern39, intern40, intern41, intern42, intern43, intern44, intern45, intern46, ((java.lang.String) objArr140[0]).intern()};
                                                int i20 = 0;
                                                while (i20 < 12) {
                                                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                                    sb.append(strArr5[i20]);
                                                    java.lang.Object[] objArr141 = new java.lang.Object[1];
                                                    c(93 - android.text.TextUtils.indexOf(str5, str5, 0, 0), (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 3, objArr141);
                                                    sb.append(((java.lang.String) objArr141[0]).intern());
                                                    java.lang.Object[] objArr142 = {sb.toString()};
                                                    java.lang.Object obj35 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                                                    if (obj35 == null) {
                                                        java.lang.Class cls33 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - android.view.View.combineMeasuredStates(0, 0), 3161 - android.text.TextUtils.getTrimmedLength(str5), (char) (android.view.KeyEvent.getDeadChar(0, 0) + 33099));
                                                        byte[] bArr27 = $$a;
                                                        java.lang.Object[] objArr143 = new java.lang.Object[1];
                                                        a(653, (byte) (-bArr27[16]), (byte) (-bArr27[14]), objArr143);
                                                        obj35 = cls33.getMethod((java.lang.String) objArr143[0], java.lang.String.class);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, obj35);
                                                    }
                                                    long longValue16 = ((java.lang.Long) ((java.lang.reflect.Method) obj35).invoke(null, objArr142)).longValue();
                                                    long j48 = 37503865 | longValue16;
                                                    java.lang.String[] strArr6 = strArr5;
                                                    long j49 = (((((829 * longValue16) + 31090704085L) + (((~((~longValue16) | (-37503866))) | (~((j | 37503865) | longValue16))) * (-828))) + ((j48 | j) * (-828))) + ((~j48) * 828)) - 1375171973;
                                                    int i21 = (int) (j49 >> 32);
                                                    int i22 = ~(861108417 | i4);
                                                    if (((i21 & ((((((~(1667663455 | i2)) | 1190077429) | (~((-1667663456) | i4))) * (-564)) - 1633319902) + ((~((-553681931) | i4)) * 1128) + (((~(1190077429 | i2)) | 1113981525) * 564))) | (((int) j49) & ((((~((-855781505) | i2)) | (~(1996632468 | i4))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL) + 624760557 + (((~((-1996632469) | i2)) | i22) * (-1040)) + ((i22 | (~((-861108418) | i2)) | 1140850964) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL)))) != 0) {
                                                        i7 = i20 + 110;
                                                        break;
                                                    }
                                                    i20++;
                                                    strArr5 = strArr6;
                                                }
                                            } else {
                                                if (str7.contains(strArr4[i19])) {
                                                    getAid = (SdkCoreAlternateContactlessPaymentDataImpl + 107) % 128;
                                                    break;
                                                }
                                                i19++;
                                            }
                                        }
                                    }
                                    i7 = 0;
                                    if (i7 != 0) {
                                        java.lang.Object[] objArr144 = {new int[]{i4}, new int[]{i7 ^ i4}, null, new int[1]};
                                        java.lang.Object[] objArr145 = {1735383130, 16, java.lang.Integer.valueOf(((((-709323472) | i2) * 1444) - 322590975) + (((~(33637513 | i4)) | (-709324496) | (~(675688006 | i4))) * (-1444)) + 1030437838)};
                                        java.lang.Object obj36 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj36 == null) {
                                            java.lang.Class cls34 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 49, (android.view.ViewConfiguration.getTapTimeout() >> 16) + 2713, (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6));
                                            byte b7 = $$a[14];
                                            short s7 = (short) (b7 - 1);
                                            java.lang.Object[] objArr146 = new java.lang.Object[1];
                                            a(s7, (byte) s7, (byte) (-b7), objArr146);
                                            obj36 = cls34.getMethod((java.lang.String) objArr146[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj36);
                                        }
                                        ((int[]) objArr144[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj36).invoke(null, objArr145)).intValue();
                                        return objArr144;
                                    }
                                    long[] jArr = {472001035};
                                    java.lang.Object[] objArr147 = new java.lang.Object[1];
                                    b(718750957 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (-1771563031) - android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), android.graphics.drawable.Drawable.resolveOpacity(0, 0) - 14, (byte) (android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1), (short) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), objArr147);
                                    java.lang.Object[] objArr148 = {((java.lang.String) objArr147[0]).intern(), 5, java.lang.Long.valueOf(kotlinx.coroutines.internal.LockFreeTaskQueueCore.HEAD_MASK), jArr};
                                    java.lang.Object obj37 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1441749806);
                                    if (obj37 == null) {
                                        java.lang.Class cls35 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(37 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), android.graphics.Color.blue(0) + 3096, (char) android.graphics.Color.argb(0, 0, 0, 0));
                                        byte[] bArr28 = $$a;
                                        java.lang.Object[] objArr149 = new java.lang.Object[1];
                                        a(653, (byte) (-bArr28[16]), (byte) (-bArr28[14]), objArr149);
                                        obj37 = cls35.getMethod((java.lang.String) objArr149[0], java.lang.String.class, java.lang.Integer.TYPE, java.lang.Long.TYPE, long[].class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1441749806, obj37);
                                    }
                                    long longValue17 = ((java.lang.Long) ((java.lang.reflect.Method) obj37).invoke(null, objArr148)).longValue();
                                    long j50 = (((((561 * longValue17) + 476188286041L) + ((~(j | (-851857399))) * (-560))) + ((~(((~longValue17) | (-851857399)) | j2)) * (-560))) + (((~(longValue17 | 851857398)) | (~(j | longValue17))) * 560)) - 1058790511;
                                    if (((((int) (j50 >> 32)) & ((((894956926 | i2) * (-369)) - 802173004) + (((~((-609444159) | i2)) | 827782252) * (-369)) + (((~(609444158 | i4)) | 285512768 | (~((-67174675) | i2))) * 369))) | (((int) j50) & (((900279545 | i2) * (-490)) + 1767741711 + (((~(822683833 | i4)) | 77595712) * 490) + 478151520))) != 0) {
                                        i8 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE;
                                    } else {
                                        int i23 = SdkCoreAlternateContactlessPaymentDataImpl + 85;
                                        getAid = i23 % 128;
                                        i8 = i23 % 2 != 0 ? 1 : 0;
                                    }
                                    if (i8 != 0) {
                                        java.lang.Object[] objArr150 = {new int[]{i4}, new int[]{i8 ^ i4}, null, new int[1]};
                                        java.lang.Object[] objArr151 = {1735383130, 16, java.lang.Integer.valueOf((((268567757 | i2) * (-192)) - 539128305) + (((~((-234150659) | i2)) | 206607104) * (-384)) + (((~((-206607105) | i4)) | (~((-27543555) | i2)) | (~(502718415 | i4))) * 192))};
                                        java.lang.Object obj38 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj38 == null) {
                                            java.lang.Class cls36 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 2713, (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                                            byte b8 = $$a[14];
                                            short s8 = (short) (b8 - 1);
                                            java.lang.Object[] objArr152 = new java.lang.Object[1];
                                            a(s8, (byte) s8, (byte) (-b8), objArr152);
                                            obj38 = cls36.getMethod((java.lang.String) objArr152[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj38);
                                        }
                                        ((int[]) objArr150[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj38).invoke(null, objArr151)).intValue();
                                        return objArr150;
                                    }
                                    long[] jArr2 = {472001035};
                                    java.lang.Object[] objArr153 = new java.lang.Object[1];
                                    b((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 718750956, (-1771563007) - (android.os.Process.myTid() >> 22), (-14) - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (byte) (android.os.Process.myPid() >> 22), (short) (android.view.ViewConfiguration.getTapTimeout() >> 16), objArr153);
                                    java.lang.Object[] objArr154 = {((java.lang.String) objArr153[0]).intern(), 5, java.lang.Long.valueOf(kotlinx.coroutines.internal.LockFreeTaskQueueCore.HEAD_MASK), jArr2};
                                    java.lang.Object obj39 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1441749806);
                                    if (obj39 == null) {
                                        java.lang.Class cls37 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(37 - android.view.View.MeasureSpec.getSize(0), 3096 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) android.text.TextUtils.getOffsetAfter(str5, 0));
                                        byte[] bArr29 = $$a;
                                        java.lang.Object[] objArr155 = new java.lang.Object[1];
                                        a(653, (byte) (-bArr29[16]), (byte) (-bArr29[14]), objArr155);
                                        obj39 = cls37.getMethod((java.lang.String) objArr155[0], java.lang.String.class, java.lang.Integer.TYPE, java.lang.Long.TYPE, long[].class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1441749806, obj39);
                                    }
                                    long longValue18 = ((java.lang.Long) ((java.lang.reflect.Method) obj39).invoke(null, objArr154)).longValue();
                                    long j51 = ~(1856843629 | longValue18);
                                    long j52 = ~longValue18;
                                    int i24 = i8;
                                    long j53 = ((((((-613) * longValue18) - 1141958832450L) + (((j2 | j51) | (~(j52 | (-1856843630)))) * 614)) + ((((~(j | 1856843629)) | j51) | (~(j | longValue18))) * (-1228))) + (((~((1856843629 | j52) | j)) | (~(longValue18 | (j | (-1856843630))))) * 614)) - 53804280;
                                    if (((((int) (j53 >> 32)) & (((((~((-1685583756) | i2)) | (~(248357344 | i4))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) - 113597124) + (((~(1862268907 | i2)) | (~((-71672193) | i4))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE))) | (((int) j53) & ((((~(163289926 | i4)) | (-1275050856)) * 345) + 484646344 + (((~(163289926 | i2)) | 1114372) * 345) + ((~(1275050855 | i4)) * 345)))) != 0) {
                                        java.lang.Object[] objArr156 = {new int[]{i4}, new int[]{i4 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE}, null, new int[1]};
                                        java.lang.Object[] objArr157 = {1735383130, 16, java.lang.Integer.valueOf((((~(536304319 | i4)) | 173021200) * (-756)) + 945194499 + ((536304319 | i2) * 756))};
                                        java.lang.Object obj40 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj40 == null) {
                                            java.lang.Class cls38 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getMode(0) + 50, (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 2713, (char) android.graphics.Color.green(0));
                                            byte b9 = $$a[14];
                                            short s9 = (short) (b9 - 1);
                                            java.lang.Object[] objArr158 = new java.lang.Object[1];
                                            a(s9, (byte) s9, (byte) (-b9), objArr158);
                                            obj40 = cls38.getMethod((java.lang.String) objArr158[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj40);
                                        }
                                        ((int[]) objArr156[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj40).invoke(null, objArr157)).intValue();
                                        return objArr156;
                                    }
                                    java.lang.Object obj41 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(724989957);
                                    if (obj41 == null) {
                                        java.lang.Class cls39 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - android.widget.ExpandableListView.getPackedPositionType(0L), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 1890, (char) (android.view.Gravity.getAbsoluteGravity(0, 0) + 3600));
                                        byte[] bArr30 = $$a;
                                        java.lang.Object[] objArr159 = new java.lang.Object[1];
                                        a(653, (byte) (-bArr30[16]), (byte) (-bArr30[14]), objArr159);
                                        obj41 = cls39.getMethod((java.lang.String) objArr159[0], null);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(724989957, obj41);
                                    }
                                    long longValue19 = ((java.lang.Long) ((java.lang.reflect.Method) obj41).invoke(null, null)).longValue();
                                    long j54 = ~longValue19;
                                    long j55 = ((((((-167) * longValue19) - 42599957856L) + (((~(j54 | j2)) | (~((-255089569) | j54))) * 336)) + (((~(255089568 | longValue19)) | (~(j2 | 255089568))) * (-168))) + (((~(j | 255089568)) | j54) * 168)) - 2134337948;
                                    int i25 = ~(775657348 | i2);
                                    if (((((int) (j55 >> 32)) & (((35751172 | i25 | (~((-775657349) | i4))) * (-338)) + 636220658 + ((i25 | (~((-739906177) | i4))) * 338))) | (((int) j55) & ((((~(2100221435 | i2)) | 757519450) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) + 1899264761 + (((~(757519835 | i2)) | 2100221050) * (-440)) + ((2100221435 | i4) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE)))) != 0) {
                                        java.lang.Object[] objArr160 = {new int[]{i4 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE}, new int[]{i24}, null, new int[1]};
                                        java.lang.Object[] objArr161 = {1735383130, 16, java.lang.Integer.valueOf(((((174064640 | i2) * 1324) - 712732795) + (((~(199577098 | i4)) | (~(509748421 | i4))) * (-1324))) - 1406258358)};
                                        java.lang.Object obj42 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj42 == null) {
                                            java.lang.Class cls40 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.graphics.Color.green(0), 2713 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1));
                                            byte b10 = $$a[14];
                                            short s10 = (short) (b10 - 1);
                                            java.lang.Object[] objArr162 = new java.lang.Object[1];
                                            a(s10, (byte) s10, (byte) (-b10), objArr162);
                                            obj42 = cls40.getMethod((java.lang.String) objArr162[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj42);
                                        }
                                        ((int[]) objArr160[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj42).invoke(null, objArr161)).intValue();
                                        return objArr160;
                                    }
                                    java.lang.Object[] objArr163 = {2};
                                    java.lang.Object obj43 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(104106647);
                                    if (obj43 == null) {
                                        java.lang.Class cls41 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.MotionEvent.axisFromString(str5) + 28, android.graphics.Color.green(0) + 2364, (char) android.text.TextUtils.indexOf(str5, str5));
                                        byte[] bArr31 = $$a;
                                        java.lang.Object[] objArr164 = new java.lang.Object[1];
                                        a(653, (byte) (-bArr31[16]), (byte) (-bArr31[14]), objArr164);
                                        obj43 = cls41.getMethod((java.lang.String) objArr164[0], java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(104106647, obj43);
                                    }
                                    long longValue20 = ((java.lang.Long) ((java.lang.reflect.Method) obj43).invoke(null, objArr163)).longValue();
                                    long j56 = ~longValue20;
                                    long j57 = j | 722567257;
                                    long j58 = ((242 * longValue20) - 348999985614L) + (((~(j56 | 722567257)) | (~j57)) * (-241)) + ((longValue20 | (-722567258)) * (-482)) + (((~((-722567258) | j56)) | (~(j57 | longValue20))) * 241) + 2130477457;
                                    if (((((int) (j58 >> 32)) & ((((~((-1810526253) | i4)) | (-2108320430)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE) + 1780368586 + (((~((-1810526253) | i2)) | (-2108320430)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE))) | (((int) j58) & (((((~((-1464452796) | i2)) | 17383441) * (-108)) - 719889605) + (((~((-27226386) | i4)) | (-1474295740) | (~(27226385 | i2))) * 54) + (((-1474295740) | i4) * 54)))) == 2) {
                                        SdkCoreAlternateContactlessPaymentDataImpl = (getAid + 13) % 128;
                                        java.lang.Object[] objArr165 = {new int[]{i4}, new int[]{i4 ^ 270}, null, new int[1]};
                                        java.lang.Object[] objArr166 = {1735383130, 16, java.lang.Integer.valueOf(((((~((-139109663) | i2)) | (~((-570215858) | i4))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) - 1222087647) + (((~((-134357007) | i4)) | (~((-565463202) | i2))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE))};
                                        java.lang.Object obj44 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj44 == null) {
                                            java.lang.Class cls42 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 51, 2713 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                            byte b11 = $$a[14];
                                            short s11 = (short) (b11 - 1);
                                            java.lang.Object[] objArr167 = new java.lang.Object[1];
                                            a(s11, (byte) s11, (byte) (-b11), objArr167);
                                            obj44 = cls42.getMethod((java.lang.String) objArr167[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj44);
                                        }
                                        ((int[]) objArr165[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj44).invoke(null, objArr166)).intValue();
                                        return objArr165;
                                    }
                                    java.lang.Object obj45 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1411285061);
                                    if (obj45 == null) {
                                        java.lang.Class cls43 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.getDeadChar(0, 0) + 40, (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 3196, (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16));
                                        java.lang.Object[] objArr168 = new java.lang.Object[1];
                                        a(41, r3[21], (byte) (-$$a[23]), objArr168);
                                        obj45 = cls43.getMethod((java.lang.String) objArr168[0], null);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1411285061, obj45);
                                    }
                                    long longValue21 = ((java.lang.Long) ((java.lang.reflect.Method) obj45).invoke(null, null)).longValue();
                                    long j59 = ~(1119332156 | longValue21);
                                    long j60 = ~longValue21;
                                    long j61 = ~(j | (-1119332157));
                                    long j62 = (((-1187) * longValue21) - 666002633415L) + (((~(j | longValue21)) | j59) * (-1188)) + (((~(j60 | j2)) | j59 | j61) * 594) + (((~(j60 | j)) | (~((-1119332157) | j60)) | j61) * 594) + 1215577518;
                                    if (((((int) (j62 >> 32)) & ((((~((-955669915) | i2)) | 541328778 | (~(481556496 | i2))) * (-397)) + 522532266 + ((608544138 | i4) * 397))) | (((int) j62) & (((((~((-1808773844) | i2)) | (~((-1048967043) | i4))) * (-370)) - 635053777) + (((~((-1808773844) | i4)) | (~((-1048967043) | i2)) | (-2144335828)) * (-370)) + 1164693400))) != 0) {
                                        java.lang.Object[] objArr169 = {new int[]{i4}, new int[]{i4 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE}, null, new int[1]};
                                        java.lang.Object[] objArr170 = {1735383130, 16, java.lang.Integer.valueOf((((~(369878844 | i2)) | (-373026752)) * (-160)) + 2103514447 + (((~((-339446676) | i2)) | 369878844) * 160))};
                                        java.lang.Object obj46 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj46 == null) {
                                            java.lang.Class cls44 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 2713 - android.text.TextUtils.getTrimmedLength(str5), (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16));
                                            byte b12 = $$a[14];
                                            short s12 = (short) (b12 - 1);
                                            java.lang.Object[] objArr171 = new java.lang.Object[1];
                                            a(s12, (byte) s12, (byte) (-b12), objArr171);
                                            obj46 = cls44.getMethod((java.lang.String) objArr171[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj46);
                                        }
                                        ((int[]) objArr169[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj46).invoke(null, objArr170)).intValue();
                                        return objArr169;
                                    }
                                    java.lang.Object obj47 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(502613909);
                                    if (obj47 == null) {
                                        java.lang.Class cls45 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.view.View.MeasureSpec.getSize(0), 3197 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) (android.view.ViewConfiguration.getTouchSlop() >> 8));
                                        byte[] bArr32 = $$a;
                                        java.lang.Object[] objArr172 = new java.lang.Object[1];
                                        a(653, (byte) (-bArr32[16]), (byte) (-bArr32[14]), objArr172);
                                        obj47 = cls45.getMethod((java.lang.String) objArr172[0], null);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(502613909, obj47);
                                    }
                                    long longValue22 = ((java.lang.Long) ((java.lang.reflect.Method) obj47).invoke(null, null)).longValue();
                                    long j63 = 1161414703 | longValue22;
                                    long j64 = (((-753) * longValue22) - 876868101520L) + (((~(j2 | 1161414703)) | (~j63) | (~(longValue22 | j2))) * (-754)) + (((~(j63 | j2)) | (~(longValue22 | j | (-1161414704)))) * (-754)) + ((j | 1161414703) * 754) + 2114284594;
                                    if (((((int) (j64 >> 32)) & (((((~((-918640109) | i4)) | (~(518586302 | i2))) * (-1808)) - 1986353126) + (((~((-381703597) | i4)) | (~(1055522814 | i2))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN) + (((~((-518586303) | i4)) | 536936512 | (~(918640108 | i2))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN))) | (((int) j64) & (((((~((-1916486379) | i4)) | (~(941254507 | i2))) * (-1808)) - 295910707) + (((~((-807027307) | i4)) | (~(2050713579 | i2))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN) + (((~((-941254508) | i4)) | 1109459072 | (~(1916486378 | i2))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN)))) != 0) {
                                        java.lang.Object[] objArr173 = {new int[]{i4}, new int[]{i4 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE}, null, new int[1]};
                                        int i26 = 572075549 | i2;
                                        java.lang.Object[] objArr174 = {1735383130, 16, java.lang.Integer.valueOf((i26 * 495) + 449288654 + (((~i26) | 525328) * 495))};
                                        java.lang.Object obj48 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj48 == null) {
                                            java.lang.Class cls46 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 50, 2713 - android.graphics.Color.alpha(0), (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0));
                                            byte b13 = $$a[14];
                                            short s13 = (short) (b13 - 1);
                                            java.lang.Object[] objArr175 = new java.lang.Object[1];
                                            a(s13, (byte) s13, (byte) (-b13), objArr175);
                                            obj48 = cls46.getMethod((java.lang.String) objArr175[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj48);
                                        }
                                        ((int[]) objArr173[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj48).invoke(null, objArr174)).intValue();
                                        return objArr173;
                                    }
                                    java.lang.Object obj49 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1293945309);
                                    if (obj49 == null) {
                                        java.lang.Class cls47 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((-16777172) - android.graphics.Color.rgb(0, 0, 0), android.view.View.MeasureSpec.getSize(0) + 2836, (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16));
                                        byte[] bArr33 = $$a;
                                        java.lang.Object[] objArr176 = new java.lang.Object[1];
                                        a(653, (byte) (-bArr33[16]), (byte) (-bArr33[14]), objArr176);
                                        obj49 = cls47.getMethod((java.lang.String) objArr176[0], null);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1293945309, obj49);
                                    }
                                    long longValue23 = ((java.lang.Long) ((java.lang.reflect.Method) obj49).invoke(null, null)).longValue();
                                    long j65 = ~longValue23;
                                    long j66 = ((((((-67) * longValue23) + 86396650599L) + ((((~(longValue23 | 1252125371)) | (~(((-1252125372) | j65) | j))) | (~(longValue23 | j2))) * (-68))) + ((~((j | (-1252125372)) | longValue23)) * (-68))) + (((~(j65 | j)) | (-1252125372)) * 68)) - 2058420126;
                                    if (((((int) (j66 >> 32)) & (((((~(1874853883 | i2)) | (~((-68240801) | i2))) * (-184)) - 1019427974) + (((~(252934136 | i2)) | 1621919747 | (~((-1690160548) | i2))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) + 376164360)) | (((int) j66) & (((~((-1166083138) | i2)) * 130) + 1281383235 + (((~((-1166083138) | i4)) | 2380040) * 130)))) != 0) {
                                        java.lang.Object[] objArr177 = {new int[]{i4}, new int[]{i4 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE}, null, new int[1]};
                                        java.lang.Object[] objArr178 = {1735383130, 16, java.lang.Integer.valueOf(((((~((-440772718) | i2)) | 268552802) * (-602)) - 1302043284) + (((~((-440772718) | i4)) | 268535904 | (~(440789615 | i2))) * (-301)) + ((~(268552802 | i2)) * 301))};
                                        java.lang.Object obj50 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj50 == null) {
                                            java.lang.Class cls48 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 49, android.view.KeyEvent.keyCodeFromString(str5) + 2713, (char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())));
                                            byte b14 = $$a[14];
                                            short s14 = (short) (b14 - 1);
                                            java.lang.Object[] objArr179 = new java.lang.Object[1];
                                            a(s14, (byte) s14, (byte) (-b14), objArr179);
                                            obj50 = cls48.getMethod((java.lang.String) objArr179[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj50);
                                        }
                                        ((int[]) objArr177[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj50).invoke(null, objArr178)).intValue();
                                        return objArr177;
                                    }
                                    long[] jArr3 = {624887784092251L};
                                    java.lang.Object[] objArr180 = new java.lang.Object[1];
                                    b(718750956 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), android.text.TextUtils.indexOf(str5, str5, 0, 0) - 1771563030, (-14) - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (byte) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (short) (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr180);
                                    java.lang.Object[] objArr181 = {((java.lang.String) objArr180[0]).intern(), 3, 2251799813685247L, jArr3};
                                    java.lang.Object obj51 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1441749806);
                                    if (obj51 == null) {
                                        java.lang.Class cls49 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.alpha(0) + 37, android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 3096, (char) android.text.TextUtils.indexOf(str5, str5, 0, 0));
                                        byte[] bArr34 = $$a;
                                        java.lang.Object[] objArr182 = new java.lang.Object[1];
                                        a(653, (byte) (-bArr34[16]), (byte) (-bArr34[14]), objArr182);
                                        obj51 = cls49.getMethod((java.lang.String) objArr182[0], java.lang.String.class, java.lang.Integer.TYPE, java.lang.Long.TYPE, long[].class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1441749806, obj51);
                                    }
                                    long longValue24 = ((java.lang.Long) ((java.lang.reflect.Method) obj51).invoke(null, objArr181)).longValue();
                                    long j67 = ~longValue24;
                                    long j68 = ((((((-167) * longValue24) + 233581960291L) + (((~(j67 | j2)) | (~(1398694372 | j67))) * 336)) + (((~((-1398694373) | longValue24)) | (~(j2 | (-1398694373)))) * (-168))) + (((~(j | (-1398694373))) | j67) * 168)) - 511953537;
                                    if (((((int) (j68 >> 32)) & ((((~(1951857899 | i4)) | (-514631489)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE) + 90297149 + (((~(1951857899 | i2)) | (-2130640876)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE))) | (((int) j68) & ((((~((-1839972120) | i4)) | 1090655233 | (~(1017768766 | i4))) * (-754)) + 28811127 + (((~((-1090655234) | i4)) | (~(2108423999 | i2))) * (-754)) + (((-1839972120) | i2) * 754)))) != 0) {
                                        java.lang.Object[] objArr183 = {new int[]{i4}, new int[]{i4 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE}, null, new int[1]};
                                        java.lang.Object[] objArr184 = {1735383130, 16, java.lang.Integer.valueOf(((((~(457910282 | i4)) | 251415237) * 56) - 360336633) + (((~(251415237 | i2)) | 457910282) * 56))};
                                        java.lang.Object obj52 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj52 == null) {
                                            java.lang.Class cls50 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myPid() >> 22) + 50, android.view.KeyEvent.getDeadChar(0, 0) + 2713, (char) android.view.KeyEvent.normalizeMetaState(0));
                                            byte b15 = $$a[14];
                                            short s15 = (short) (b15 - 1);
                                            java.lang.Object[] objArr185 = new java.lang.Object[1];
                                            a(s15, (byte) s15, (byte) (-b15), objArr185);
                                            obj52 = cls50.getMethod((java.lang.String) objArr185[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj52);
                                        }
                                        ((int[]) objArr183[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj52).invoke(null, objArr184)).intValue();
                                        return objArr183;
                                    }
                                    java.lang.Object[] objArr186 = new java.lang.Object[1];
                                    b((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 718750956, (-1771562986) - android.os.Process.getGidForName(str5), (-14) - android.graphics.Color.green(0), (byte) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), (short) (android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1), objArr186);
                                    java.lang.Object[] objArr187 = {((java.lang.String) objArr186[0]).intern()};
                                    java.lang.Object obj53 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
                                    if (obj53 == null) {
                                        java.lang.Class cls51 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 36, 3161 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) (33099 - android.text.TextUtils.getCapsMode(str5, 0, 0)));
                                        byte[] bArr35 = $$a;
                                        java.lang.Object[] objArr188 = new java.lang.Object[1];
                                        a(35, (byte) (-bArr35[16]), (byte) (-bArr35[23]), objArr188);
                                        obj53 = cls51.getMethod((java.lang.String) objArr188[0], java.lang.String.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, obj53);
                                    }
                                    long longValue25 = ((java.lang.Long) ((java.lang.reflect.Method) obj53).invoke(null, objArr187)).longValue();
                                    long j69 = ~longValue25;
                                    long j70 = (((-958) * longValue25) - 419649546194L) + (((~(j2 | (-438047544))) | (~(j69 | j)) | (~(j | 438047543))) * 959) + ((~(438047543 | longValue25)) * (-959)) + (((~(j2 | 438047543)) | (~(j | (-438047544))) | (~(j69 | j2))) * 959) + 469423195;
                                    int i27 = (int) (j70 >> 32);
                                    int i28 = ~(849236172 | i2);
                                    if (((i27 & (((((~((-1073745939) | i2)) | (~((-172622337) | i2))) * (-184)) - 1019427974) + (((~(978308641 | i2)) | (-2052054580) | (~(1879432243 | i2))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) + 2077575056)) | (((int) j70) & ((((~((-849236173) | i4)) | (~(2008504713 | i2)) | i28) * (-516)) + 1675627873 + (((~((-848711817) | i4)) | (~((-1159792898) | i2))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR) + ((i28 | 1159792897) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR)))) != 0) {
                                        SdkCoreAlternateContactlessPaymentDataImpl = (getAid + 29) % 128;
                                        java.lang.Object[] objArr189 = {new int[]{i4}, new int[]{i4 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE}, null, new int[1]};
                                        int i29 = ~((-287079053) | i4);
                                        java.lang.Object[] objArr190 = {1735383130, 16, java.lang.Integer.valueOf((((-998244317) | i29) * (-196)) + 672496731 + ((i29 | 711165264) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE))};
                                        java.lang.Object obj54 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj54 == null) {
                                            java.lang.Class cls52 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), 2712 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (char) android.view.View.getDefaultSize(0, 0));
                                            byte b16 = $$a[14];
                                            short s16 = (short) (b16 - 1);
                                            java.lang.Object[] objArr191 = new java.lang.Object[1];
                                            a(s16, (byte) s16, (byte) (-b16), objArr191);
                                            obj54 = cls52.getMethod((java.lang.String) objArr191[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj54);
                                        }
                                        ((int[]) objArr189[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj54).invoke(null, objArr190)).intValue();
                                        return objArr189;
                                    }
                                    java.lang.Object obj55 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(236031171);
                                    if (obj55 == null) {
                                        java.lang.Class cls53 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), 2185 - android.view.View.getDefaultSize(0, 0), (char) ((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 59513));
                                        byte[] bArr36 = $$a;
                                        java.lang.Object[] objArr192 = new java.lang.Object[1];
                                        a(653, (byte) (-bArr36[16]), (byte) (-bArr36[14]), objArr192);
                                        obj55 = cls53.getMethod((java.lang.String) objArr192[0], null);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(236031171, obj55);
                                    }
                                    long longValue26 = ((java.lang.Long) ((java.lang.reflect.Method) obj55).invoke(null, null)).longValue();
                                    long j71 = j | 349229797;
                                    long j72 = ~longValue26;
                                    long j73 = j72 | j;
                                    long j74 = ((((((-183) * longValue26) + 63909053034L) + (((~(j71 | longValue26)) | (~(j73 | (-349229798)))) * (-184))) + ((((~(349229797 | j72)) | (~j71)) | (~j73)) * 184)) + ((longValue26 | (-349229798)) * 184)) - 522860788;
                                    if (((((int) j74) & ((((~(1740645557 | i2)) * 979) - 1752640152) + ((303419147 | i4) * (-979)) + (((~(1740645557 | i4)) | (~(303419147 | i2))) * 979))) | (((int) (j74 >> 32)) & ((((~(866106597 | i2)) | 571119813) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) + 941449514 + (((~(856398021 | i2)) | 580828389) * (-440)) + ((866106597 | i4) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE)))) != 0) {
                                        java.lang.Object[] objArr193 = {new int[]{i4}, new int[]{i4 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE}, null, new int[1]};
                                        int i30 = ~(i4 | (-11394));
                                        java.lang.Object[] objArr194 = {1735383130, 16, java.lang.Integer.valueOf((((~((-502645567) | i2)) | 295977006 | i30) * (-713)) + 1279410084 + (i30 * 1426) + ((~((-206679954) | i2)) * 713))};
                                        java.lang.Object obj56 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj56 == null) {
                                            java.lang.Class cls54 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 49, android.graphics.Color.red(0) + 2713, (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1));
                                            byte b17 = $$a[14];
                                            short s17 = (short) (b17 - 1);
                                            java.lang.Object[] objArr195 = new java.lang.Object[1];
                                            a(s17, (byte) s17, (byte) (-b17), objArr195);
                                            obj56 = cls54.getMethod((java.lang.String) objArr195[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj56);
                                        }
                                        ((int[]) objArr193[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj56).invoke(null, objArr194)).intValue();
                                        return objArr193;
                                    }
                                    java.lang.Object obj57 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1050293330);
                                    if (obj57 == null) {
                                        java.lang.Class cls55 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 36, 2973 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1));
                                        byte[] bArr37 = $$a;
                                        java.lang.Object[] objArr196 = new java.lang.Object[1];
                                        a(653, (byte) (-bArr37[16]), (byte) (-bArr37[14]), objArr196);
                                        obj57 = cls55.getMethod((java.lang.String) objArr196[0], null);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1050293330, obj57);
                                    }
                                    long j75 = ~((java.lang.Long) ((java.lang.reflect.Method) obj57).invoke(null, null)).longValue();
                                    long j76 = (((((r4 * (-1917)) - 882146029440L) + (((~(j75 | j)) | (~(j2 | (-918902114)))) * 959)) + ((-959) * j75)) + (((~(j75 | j2)) | (~(j | (-918902114)))) * 959)) - 933799650;
                                    if (((((int) (j76 >> 32)) & (((((~((-442506114) | i2)) | (~((-994720298) | i4))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) - 1736088312) + (((~((-554311721) | i2)) | (~((-2097537) | i4))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE))) | (((int) j76) & (((557908305 | i4) * 988) + 2017401485 + (((~(634074065 | i2)) | (-2147466236)) * (-1976)) + (((~(2071300475 | i4)) | 557908305 | (~((-2071300476) | i2))) * 988)))) != 0) {
                                        java.lang.Object[] objArr197 = {new int[]{i4}, new int[]{i4 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE}, null, new int[1]};
                                        java.lang.Object[] objArr198 = {1735383130, 16, java.lang.Integer.valueOf((((~((-210875105) | i4)) | (~((-268699663) | i2))) * 920) + 964877031 + (((~((-229750754) | i2)) | 210875104) * 920) + (((~((-268699663) | i4)) | (~((-210875105) | i2)) | (~((-18875650) | i4))) * 920))};
                                        java.lang.Object obj58 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj58 == null) {
                                            java.lang.Class cls56 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.view.MotionEvent.axisFromString(str5), 2713 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                                            byte b18 = $$a[14];
                                            short s18 = (short) (b18 - 1);
                                            java.lang.Object[] objArr199 = new java.lang.Object[1];
                                            a(s18, (byte) s18, (byte) (-b18), objArr199);
                                            obj58 = cls56.getMethod((java.lang.String) objArr199[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj58);
                                        }
                                        ((int[]) objArr197[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj58).invoke(null, objArr198)).intValue();
                                        return objArr197;
                                    }
                                    java.lang.Object obj59 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1827153043);
                                    if (obj59 == null) {
                                        java.lang.Class cls57 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2159, (char) ((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 56400));
                                        byte[] bArr38 = $$a;
                                        java.lang.Object[] objArr200 = new java.lang.Object[1];
                                        a(653, (byte) (-bArr38[16]), (byte) (-bArr38[14]), objArr200);
                                        obj59 = cls57.getMethod((java.lang.String) objArr200[0], null);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1827153043, obj59);
                                    }
                                    long longValue27 = ((java.lang.Long) ((java.lang.reflect.Method) obj59).invoke(null, null)).longValue();
                                    long j77 = ~longValue27;
                                    long j78 = ((((((-97) * longValue27) - 15200764050L) + (((~(j77 | (-304015281))) | (~(j77 | j))) * 98)) + ((((~(j | 304015280)) | j77) | (~(j2 | (-304015281)))) * (-49))) + (((~((-304015281) | longValue27)) | (~(j77 | j2))) * 49)) - 261802739;
                                    int i31 = (int) (j78 >> 32);
                                    int i32 = ~((-1368049059) | i4);
                                    if (((i31 & ((((~(1609299903 | i2)) * (-783)) - 1635188836) + (((~(1567311549 | i2)) | 130085138) * 783))) | (((int) j78) & (((1435850149 | i32) * (-658)) + 679008047 + ((i32 | 1367360928) * 658)))) != 0) {
                                        java.lang.Object[] objArr201 = {new int[]{i4}, new int[]{i4 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE}, null, new int[1]};
                                        java.lang.Object[] objArr202 = {1735383130, 16, java.lang.Integer.valueOf((((317887083 | r1) * 764) - 1279578473) + (((~(317887083 | i2)) | 84172804) * (-1528)) + (((~(391438436 | i2)) | 94794255) * 764))};
                                        java.lang.Object obj60 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj60 == null) {
                                            java.lang.Class cls58 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getTouchSlop() >> 8), android.widget.ExpandableListView.getPackedPositionType(0L) + 2713, (char) android.graphics.Color.alpha(0));
                                            byte b19 = $$a[14];
                                            short s19 = (short) (b19 - 1);
                                            java.lang.Object[] objArr203 = new java.lang.Object[1];
                                            a(s19, (byte) s19, (byte) (-b19), objArr203);
                                            obj60 = cls58.getMethod((java.lang.String) objArr203[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj60);
                                        }
                                        ((int[]) objArr201[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj60).invoke(null, objArr202)).intValue();
                                        return objArr201;
                                    }
                                    java.lang.Object obj61 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(887063382);
                                    if (obj61 == null) {
                                        java.lang.Class cls59 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - android.graphics.Color.blue(0), android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 839, (char) android.text.TextUtils.getOffsetAfter(str5, 0));
                                        byte[] bArr39 = $$a;
                                        java.lang.Object[] objArr204 = new java.lang.Object[1];
                                        a(653, (byte) (-bArr39[16]), (byte) (-bArr39[14]), objArr204);
                                        obj61 = cls59.getMethod((java.lang.String) objArr204[0], null);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(887063382, obj61);
                                    }
                                    long longValue28 = ((java.lang.Long) ((java.lang.reflect.Method) obj61).invoke(null, null)).longValue();
                                    long j79 = ~(j | 250342696);
                                    long j80 = ~((-250342697) | longValue28);
                                    long j81 = ((-1527) * longValue28) + 191512162440L + ((longValue28 | j79) * 764) + (((~(j | longValue28)) | j80) * (-1528)) + (((~((~longValue28) | 250342696)) | j80 | j79) * 764) + 1710410206;
                                    int i33 = ((((int) (j81 >> 32)) & (((((((~(1101817895 | i2)) | 1755922989) | (~((-1101817896) | i4))) * (-564)) + 985311970) + ((~((-17049603) | i4)) * 1128)) + (((~(1755922989 | i2)) | 1084768293) * 564))) | (((int) j81) & ((((((~((-69206025) | i2)) | (~((-1359577090) | i2))) * (-184)) + 1019428157) + ((((~(1363798737 | i2)) | (-1433004762)) | (~(73427672 | i2))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE)) - 776783416))) != 0 ? i4 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BANK_VALUE : i4;
                                    if (i33 != i4) {
                                        java.lang.Object[] objArr205 = {new int[]{i4}, new int[]{i33}, null, new int[1]};
                                        java.lang.Object[] objArr206 = {1735383130, 16, java.lang.Integer.valueOf((((~((-308281345) | i4)) | (~(401044175 | i2))) * (-318)) + 127055353 + (((~(308306626 | i4)) | 92737549) * (-318)) + (((~((-308306627) | i4)) | (-401018894)) * 318))};
                                        java.lang.Object obj62 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj62 == null) {
                                            java.lang.Class cls60 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.normalizeMetaState(0) + 50, 2713 - android.text.TextUtils.indexOf(str5, str5), (char) android.view.View.getDefaultSize(0, 0));
                                            byte b20 = $$a[14];
                                            short s20 = (short) (b20 - 1);
                                            java.lang.Object[] objArr207 = new java.lang.Object[1];
                                            a(s20, (byte) s20, (byte) (-b20), objArr207);
                                            obj62 = cls60.getMethod((java.lang.String) objArr207[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj62);
                                        }
                                        ((int[]) objArr205[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj62).invoke(null, objArr206)).intValue();
                                        java.lang.Object[] objArr208 = {objArr205};
                                        java.lang.Object obj63 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(712501173);
                                        if (obj63 == null) {
                                            java.lang.Class cls61 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 3236 - android.os.Process.getGidForName(str5), (char) android.graphics.Color.blue(0));
                                            byte b21 = $$a[14];
                                            short s21 = (short) (b21 - 1);
                                            java.lang.Object[] objArr209 = new java.lang.Object[1];
                                            a(s21, (byte) s21, (byte) (-b21), objArr209);
                                            obj63 = cls61.getMethod((java.lang.String) objArr209[0], java.lang.Object[].class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(712501173, obj63);
                                        }
                                        ((java.lang.reflect.Method) obj63).invoke(obj, objArr208);
                                        return objArr205;
                                    }
                                    java.lang.Object[] objArr210 = {java.lang.Integer.valueOf(i), obj, 1735383130, 0};
                                    java.lang.Object obj64 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(97317038);
                                    if (obj64 == null) {
                                        obj64 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), 3289 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) ((-1) - android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)))).getDeclaredConstructor(java.lang.Integer.TYPE, (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.getDefaultSize(0, 0) + 52, 3238 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16)), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(97317038, obj64);
                                    }
                                    java.lang.Object newInstance = ((java.lang.reflect.Constructor) obj64).newInstance(objArr210);
                                    try {
                                        java.lang.Object[] objArr211 = new java.lang.Object[1];
                                        c(313 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) android.graphics.Color.alpha(0), 15 - android.view.MotionEvent.axisFromString(str5), objArr211);
                                        java.lang.Class<?> cls62 = java.lang.Class.forName(((java.lang.String) objArr211[0]).intern());
                                        java.lang.Object[] objArr212 = new java.lang.Object[1];
                                        c((android.view.ViewConfiguration.getTapTimeout() >> 16) + 329, (char) (android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 46919), 4 - android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr212);
                                        cls62.getMethod(((java.lang.String) objArr212[0]).intern(), null).invoke(newInstance, null);
                                        java.lang.Object[] objArr213 = {new int[]{i4}, new int[]{i4}, null, new int[1]};
                                        java.lang.Object[] objArr214 = {1735383130, 0, java.lang.Integer.valueOf((((((-18874951) | i4) * (-381)) - 55354234) + (((~((-119801719) | i2)) | 911179056) * 381)) - 1398578642)};
                                        java.lang.Object obj65 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj65 == null) {
                                            java.lang.Class cls63 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.getDefaultSize(0, 0) + 50, android.view.View.combineMeasuredStates(0, 0) + 2713, (char) android.view.View.MeasureSpec.getSize(0));
                                            byte b22 = $$a[14];
                                            short s22 = (short) (b22 - 1);
                                            java.lang.Object[] objArr215 = new java.lang.Object[1];
                                            a(s22, (byte) s22, (byte) (-b22), objArr215);
                                            obj65 = cls63.getMethod((java.lang.String) objArr215[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj65);
                                        }
                                        ((int[]) objArr213[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj65).invoke(null, objArr214)).intValue();
                                        return objArr213;
                                    } catch (java.lang.Throwable th2) {
                                        java.lang.Throwable cause2 = th2.getCause();
                                        if (cause2 != null) {
                                            throw cause2;
                                        }
                                        throw th2;
                                    }
                                }
                            } catch (java.lang.Throwable th3) {
                                java.lang.Throwable cause3 = th3.getCause();
                                if (cause3 != null) {
                                    throw cause3;
                                }
                                throw th3;
                            }
                        }
                    }
                    i6 = 0;
                    if (i6 == 0) {
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
        } catch (java.lang.Throwable th6) {
            java.lang.Throwable cause6 = th6.getCause();
            if (cause6 != null) {
                throw cause6;
            }
            throw th6;
        }
    }

    static void init$0() {
        $$a = new byte[]{7, -8, -91, 32, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1, com.google.common.base.Ascii.SI, -10};
        $$b = 224;
    }
}
