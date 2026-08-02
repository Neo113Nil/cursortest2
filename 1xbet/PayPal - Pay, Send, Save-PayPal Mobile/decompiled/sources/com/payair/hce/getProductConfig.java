package com.payair.hce;

/* loaded from: classes4.dex */
public class getProductConfig extends com.payair.hce.getAuthenticationMethods {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static int DigitizedCardProfile;
    private static int RecordsJson;
    private static short[] SdkCoreAlternateContactlessPaymentDataImpl;
    private static byte[] getAid;
    private static int getProfileVersion;
    private static int values;
    private final int valueOf;
    private final java.lang.String writeReplace;

    private static void a(int i, int i2, short s, java.lang.Object[] objArr) {
        byte[] bArr = $$a;
        int i3 = s + 4;
        int i4 = i2 + 65;
        char[] cArr = new char[i + 1];
        int i5 = -1;
        if (bArr == null) {
            i4 = (i + i4) - 2;
        }
        while (true) {
            i5++;
            i3++;
            cArr[i5] = (char) i4;
            if (i5 == i) {
                objArr[0] = new java.lang.String(cArr);
                return;
            }
            i4 = (i4 + bArr[i3]) - 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(byte b, short s, int i, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4;
        int i5 = (i * 3) + 1;
        byte[] bArr = $$g;
        int i6 = s + 4;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            i3 = i6;
            int i7 = i5;
            i4 = 0;
            i6 += i7;
            i2 = i4;
            i4 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i4 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i3++;
            i7 = bArr[i3];
            i6 += i7;
            i2 = i4;
            i4 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i4 == i5) {
            }
        } else {
            i2 = 0;
            i6 = 104 - (b * 3);
            i3 = i6;
            i4 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i4 == i5) {
            }
        }
    }

    public getProductConfig(java.lang.String str, int i, java.lang.String str2) {
        super(str2, com.payair.hce.getVisaProvisioningResponse.writeReplace);
        this.writeReplace = str;
        this.valueOf = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x019b, code lost:
    
        if (r12 != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01b0, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01ae, code lost:
    
        r7 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01ac, code lost:
    
        if (r12 != false) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, int i3, byte b, short s, java.lang.Object[] objArr) {
        int i4;
        int i5;
        com.payair.hce.getTrack2ConstructionData gettrack2constructiondata = new com.payair.hce.getTrack2ConstructionData();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(DigitizedCardProfile)};
            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
            if (obj == null) {
                obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 30, (char) android.widget.ExpandableListView.getPackedPositionType(0L))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj);
            }
            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
            boolean z = intValue == -1;
            if (z) {
                byte[] bArr = getAid;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    $11 = ($10 + 3) % 128;
                    for (int i6 = 0; i6 < length; i6++) {
                        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(bArr[i6])};
                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609478628);
                        if (obj2 == null) {
                            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - android.view.KeyEvent.normalizeMetaState(0), 5088 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16))).getMethod("e", java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609478628, obj2);
                        }
                        bArr2[i6] = ((java.lang.Byte) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = getAid;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(values)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 27, 29 - android.graphics.Color.argb(0, 0, 0, 0), (char) android.widget.ExpandableListView.getPackedPositionType(0L))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj3);
                    }
                    intValue = (byte) (((byte) (bArr3[((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue()] ^ (-4897270311952305750L))) + ((int) (DigitizedCardProfile ^ (-4897270311952305750L))));
                } else {
                    intValue = (short) (((short) (SdkCoreAlternateContactlessPaymentDataImpl[i2 + ((int) (values ^ (-4897270311952305750L)))] ^ (-4897270311952305750L))) + ((int) (DigitizedCardProfile ^ (-4897270311952305750L))));
                }
            }
            if (intValue > 0) {
                int i7 = $10 + 111;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    i4 = ((i2 * intValue) % 2) >>> ((int) (values | (-4897270311952305750L)));
                } else {
                    i4 = ((i2 + intValue) - 2) + ((int) (values ^ (-4897270311952305750L)));
                }
                gettrack2constructiondata.writeReplace = i4 + i5;
                java.lang.Object[] objArr5 = {gettrack2constructiondata, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson), sb};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-500696024);
                if (obj4 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2363, (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1));
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    c((byte) 0, (short) -1, 0, objArr6);
                    obj4 = cls.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-500696024, obj4);
                }
                ((java.lang.StringBuilder) ((java.lang.reflect.Method) obj4).invoke(null, objArr5)).append(gettrack2constructiondata.values);
                gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                byte[] bArr4 = getAid;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i8 = 0; i8 < length2; i8++) {
                        bArr5[i8] = (byte) (bArr4[i8] ^ (-4897270311952305750L));
                    }
                    bArr4 = bArr5;
                }
                boolean z2 = bArr4 != null;
                gettrack2constructiondata.DigitizedCardProfile = 1;
                while (gettrack2constructiondata.DigitizedCardProfile < intValue) {
                    int i9 = $10 + 67;
                    $11 = i9 % 128;
                    if (i9 % 2 == 0) {
                        throw null;
                    }
                    if (z2) {
                        byte[] bArr6 = getAid;
                        gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                        gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((byte) (((byte) (bArr6[r8] ^ (-4897270311952305750L))) + s)) ^ b));
                    } else {
                        short[] sArr = SdkCoreAlternateContactlessPaymentDataImpl;
                        gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                        gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((short) (((short) (sArr[r8] ^ (-4897270311952305750L))) + s)) ^ b));
                    }
                    sb.append(gettrack2constructiondata.values);
                    gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                    gettrack2constructiondata.DigitizedCardProfile++;
                }
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
        getProfileVersion = 0;
        RecordsJson = 1;
        values = -1075351176;
        DigitizedCardProfile = 520368566;
        AlternateContactlessPaymentDataJson = -342994670;
        getAid = new byte[]{81, 86, -71, 91, -84, 85, -122, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, 16, -84, -93, 91, -84, 85, -90, -97, com.visa.cbp.getEncExpo.IResultReceiver2, 81, 80, 87, -92, 92, -89, 92, -93, 82, -113, 113, 85, -84, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -71, 84, 80, 87, 86, -86, -123, 103, -91, 84, -84, -93, 82, -113, 113, 85, -84, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -71, 84, 80, 87, 86, -86, -123, -71, 107, 87, -24, 16, -84, -93, 91, -84, 85, -90, -97, com.visa.cbp.getEncExpo.IResultReceiver2, 81, 80, 87, -92, 92, -89, 67, -90, -84, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -84, -86, 91, -18, 99, 83, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -85, 80, -86, 88, -71, 87, -85, -99, 99, 83, 85, -86, -105, 17, -95, 81, -81, -112, 102, 69, -91, -100, 91, 83, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -85, 80, -86, 88, -71, 87, -85, -100, com.google.common.base.Ascii.NAK, 87, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION};
    }

    static void init$1() {
        $$g = new byte[]{57, -61, -44, -120};
        $$h = 37;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x042c, code lost:
    
        if (r0.contains(r5.getField((java.lang.String) r14[0]).get(null)) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0722, code lost:
    
        if (r3 != false) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r20v10 */
    /* JADX WARN: Type inference failed for: r20v11 */
    /* JADX WARN: Type inference failed for: r20v12, types: [int] */
    /* JADX WARN: Type inference failed for: r20v15 */
    /* JADX WARN: Type inference failed for: r20v7, types: [int] */
    /* JADX WARN: Type inference failed for: r20v8 */
    /* JADX WARN: Type inference failed for: r20v9 */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] DigitizedCardProfile(android.content.Context context, int i, int i2) {
        java.lang.Object[] objArr;
        byte[] bArr;
        try {
            if (context == null) {
                java.lang.Object[] objArr2 = {new int[]{i}, new int[]{i}, null, new int[1]};
                java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf(((((~(i | (-432647829))) | 524292) * 336) - 319415784) + (((~(i | 572281156)) | (-1004404693)) * (-168)) + (((~((~i) | 572281156)) | (-432647829)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE))};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.os.Process.getGidForName("") + 51, 2713 - android.view.KeyEvent.keyCodeFromString(""), (char) (1 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))));
                    byte b = $$a[14];
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    a(34, (short) (b - 1), (byte) (-b), objArr4);
                    obj = cls.getMethod((java.lang.String) objArr4[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj);
                }
                ((int[]) objArr2[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr3)).intValue();
                return objArr2;
            }
            int i3 = getProfileVersion + 107;
            RecordsJson = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 5 / 5;
            }
            try {
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                b((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 192257961, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1595719471, (-29) - android.graphics.Color.blue(0), (byte) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1), (short) ((-16777216) - android.graphics.Color.rgb(0, 0, 0)), objArr5);
                java.lang.Class<?> cls2 = java.lang.Class.forName(((java.lang.String) objArr5[0]).intern());
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                b((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 192257967, 1595719493 - android.text.TextUtils.getCapsMode("", 0, 0), android.view.KeyEvent.normalizeMetaState(0) - 29, (byte) android.text.TextUtils.getOffsetAfter("", 0), (short) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr6);
                java.lang.Object invoke = cls2.getMethod(((java.lang.String) objArr6[0]).intern(), null).invoke(context, null);
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                b(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 192257962, (android.os.Process.myPid() >> 22) + 1595719511, android.view.KeyEvent.normalizeMetaState(0) - 29, (byte) android.graphics.Color.red(0), (short) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr7);
                java.lang.Class<?> cls3 = java.lang.Class.forName(((java.lang.String) objArr7[0]).intern());
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                ?? r20 = 192257966 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                b(r20, 1595719545 - android.text.TextUtils.getOffsetAfter("", 0), (-30) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (byte) android.view.KeyEvent.keyCodeFromString(""), (short) android.view.KeyEvent.normalizeMetaState(0), objArr8);
                if ((cls3.getField(((java.lang.String) objArr8[0]).intern()).getInt(invoke) & 2) != 0) {
                    objArr = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 1}, null, new int[1]};
                    int i5 = ~((-414921833) | (~i));
                    java.lang.Object[] objArr9 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf(((587254544 | i5 | (~(414921832 | i))) * (-338)) + 1928469240 + ((i5 | (~(1002176376 | i))) * 338))};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj2 == null) {
                        java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.green(0) + 50, 2713 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                        byte b2 = $$a[14];
                        java.lang.Object[] objArr10 = new java.lang.Object[1];
                        a(34, (short) (b2 - 1), (byte) (-b2), objArr10);
                        obj2 = cls4.getMethod((java.lang.String) objArr10[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj2);
                    }
                    ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr9)).intValue();
                } else {
                    objArr = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, new int[1]};
                    java.lang.Object[] objArr11 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf(((((~i) | (-2)) * (-490)) - 611286468) + (((~((-736392536) | i)) | 736392534) * 490) + 1561125676)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj3 == null) {
                        java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 2713, (char) (android.view.ViewConfiguration.getTapTimeout() >> 16));
                        byte b3 = $$a[14];
                        java.lang.Object[] objArr12 = new java.lang.Object[1];
                        a(34, (short) (b3 - 1), (byte) (-b3), objArr12);
                        obj3 = cls5.getMethod((java.lang.String) objArr12[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj3);
                    }
                    ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr11)).intValue();
                }
                if (((int[]) objArr[1])[0] != i) {
                    return objArr;
                }
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2058003131);
                if (obj4 == null) {
                    java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.ImageFormat.getBitsPerPixel(0) + 34, 1737 - android.view.MotionEvent.axisFromString(""), (char) (5827 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))));
                    byte b4 = $$a[14];
                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                    a(34, (short) (b4 - 1), (byte) (-b4), objArr13);
                    obj4 = cls6.getMethod((java.lang.String) objArr13[0], null);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2058003131, obj4);
                }
                java.util.Set set = (java.util.Set) ((java.lang.reflect.Method) obj4).invoke(null, null);
                java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 32, (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1738, (char) (android.view.KeyEvent.getDeadChar(0, 0) + 5826));
                byte[] bArr2 = $$a;
                byte b5 = bArr2[14];
                java.lang.Object[] objArr14 = new java.lang.Object[1];
                a(34, (short) (b5 - 1), (byte) (-b5), objArr14);
                if (!set.contains(cls7.getField((java.lang.String) objArr14[0]).get(null))) {
                    java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 33, android.text.TextUtils.indexOf("", "") + 1738, (char) (android.graphics.Color.red(0) + 5826));
                    byte b6 = (byte) (-bArr2[20]);
                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                    a(b6, (short) (b6 | 48), (byte) (-bArr2[23]), objArr15);
                }
                if (android.os.Build.VERSION.SDK_INT == 30) {
                    java.lang.Object[] objArr16 = {new int[]{i}, new int[]{i}, null, new int[1]};
                    java.lang.Object[] objArr17 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((~((-524299) | (~i))) | (-1004404687)) * (-591)) + 417106524 + ((i | (-524299)) * 591))};
                    java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj5 == null) {
                        java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2714, (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                        byte b7 = bArr2[14];
                        java.lang.Object[] objArr18 = new java.lang.Object[1];
                        a(34, (short) (b7 - 1), (byte) (-b7), objArr18);
                        obj5 = cls9.getMethod((java.lang.String) objArr18[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj5);
                    }
                    ((int[]) objArr16[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr17)).intValue();
                    return objArr16;
                }
                try {
                } catch (java.lang.Exception unused) {
                    r20 = 0;
                }
                if (android.os.Build.VERSION.SDK_INT > 33) {
                    RecordsJson = (getProfileVersion + 59) % 128;
                    int indexOf = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                    int indexOf2 = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                    java.lang.Object[] objArr19 = new java.lang.Object[1];
                    r20 = android.os.Process.getGidForName("") - 28;
                    b(indexOf + 192257912, indexOf2 + 1595719551, r20, (byte) ((-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (short) (android.os.Process.myTid() >> 22), objArr19);
                    try {
                        java.lang.Object[] objArr20 = {((java.lang.String) objArr19[0]).intern()};
                        java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                        if (obj6 == null) {
                            java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 35, 3162 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) ((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 33099));
                            byte b8 = (byte) (bArr2[14] - 1);
                            java.lang.Object[] objArr21 = new java.lang.Object[1];
                            a(b8, (short) (b8 | 653), (short) 38, objArr21);
                            obj6 = cls10.getMethod((java.lang.String) objArr21[0], java.lang.String.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, obj6);
                        }
                        long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr20)).longValue();
                        long j = ~i;
                        long j2 = (-434178397) | j;
                        bArr = bArr2;
                        long j3 = ~longValue;
                        r20 = 0;
                        long j4 = (((((53 * longValue) + 22143098247L) + ((~(j2 | longValue)) * 52)) + ((((~(j3 | j)) | (~(j3 | (-434178397)))) | (~j2)) * (-52))) + (((~(434178396 | longValue)) | (~(434178396 | j))) * 52)) - 903489711;
                        int i6 = ~i;
                        if (((((int) j4) & ((((~((-248843890) | i)) | (-1789553259)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE) + 1075633945 + (((~(i6 | (-248843890))) | (-1789553259)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE))) | (((int) (j4 >> 32)) & ((((~(2144042547 | i)) | (~((-713698338) | i6))) * (-318)) + 515064590 + (((~((-2122989106) | i)) | 1409290768) * (-318)) + (((~(2122989105 | i)) | 734751779) * 318)))) == 1) {
                            getProfileVersion = (RecordsJson + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                            getProfileVersion = (RecordsJson + 53) % 128;
                            java.lang.Object[] objArr22 = {new int[]{i}, new int[]{i ^ 10}, null, new int[1]};
                            int i7 = ~(i | 935218776);
                            java.lang.Object[] objArr23 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((865730520 | i7) * (-658)) - 648061432) + ((i7 | 110976) * 658))};
                            java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj7 == null) {
                                java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), android.view.View.MeasureSpec.getMode(0) + 2713, (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1));
                                byte b9 = bArr[14];
                                java.lang.Object[] objArr24 = new java.lang.Object[1];
                                a(34, (short) (b9 - 1), (byte) (-b9), objArr24);
                                obj7 = cls11.getMethod((java.lang.String) objArr24[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj7);
                            }
                            ((int[]) objArr22[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj7).invoke(null, objArr23)).intValue();
                            return objArr22;
                        }
                        java.lang.Object[] objArr25 = {new int[]{i}, new int[]{i}, null, new int[1]};
                        int i8 = ~i;
                        ?? r6 = {java.lang.Integer.valueOf(i2), r20, java.lang.Integer.valueOf((((~(i8 | (-938112794))) | 872445696 | (~(66816191 | i8))) * (-397)) + 548738666 + ((i | 873594790) * 397))};
                        java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                        if (obj8 == null) {
                            java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.combineMeasuredStates(0, 0), 2713 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                            byte b10 = $$a[14];
                            java.lang.Object[] objArr26 = new java.lang.Object[1];
                            a(34, (short) (b10 - 1), (byte) (-b10), objArr26);
                            obj8 = cls12.getMethod((java.lang.String) objArr26[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj8);
                        }
                        ((int[]) objArr25[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj8).invoke(null, r6)).intValue();
                        return objArr25;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                r20 = 0;
                bArr = bArr2;
                java.lang.Object[] objArr27 = new java.lang.Object[1];
                b(192257977 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 1595719578 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 28, (byte) android.view.View.resolveSize(0, 0), (short) android.view.KeyEvent.normalizeMetaState(0), objArr27);
                try {
                    java.lang.Object[] objArr28 = {((java.lang.String) objArr27[0]).intern()};
                    java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                    if (obj9 == null) {
                        java.lang.Class cls13 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(41 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 1921 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6));
                        byte b11 = (byte) (bArr[14] - 1);
                        java.lang.Object[] objArr29 = new java.lang.Object[1];
                        a(b11, (short) (b11 | 653), (short) 38, objArr29);
                        obj9 = cls13.getMethod((java.lang.String) objArr29[0], java.lang.String.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj9);
                    }
                    java.lang.Object invoke2 = ((java.lang.reflect.Method) obj9).invoke(null, objArr28);
                    java.lang.Object[] objArr30 = new java.lang.Object[1];
                    b((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 192257913, 1595719590 - android.widget.ExpandableListView.getPackedPositionChild(0L), (-29) - (android.os.Process.myPid() >> 22), (byte) android.view.View.resolveSizeAndState(0, 0, 0), (short) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), objArr30);
                    boolean equals = invoke2.equals(((java.lang.String) objArr30[0]).intern());
                    RecordsJson = (getProfileVersion + 115) % 128;
                } catch (java.lang.Throwable th2) {
                    java.lang.Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
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
    }

    static void init$0() {
        $$a = new byte[]{com.google.common.base.Ascii.US, -55, -84, 106, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1, -19, 13, com.google.common.base.Ascii.VT, -14, 16};
        $$b = 116;
    }
}
