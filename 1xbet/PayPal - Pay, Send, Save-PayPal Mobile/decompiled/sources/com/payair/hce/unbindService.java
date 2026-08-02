package com.payair.hce;

/* loaded from: classes4.dex */
public final class unbindService<T> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static int DigitizedCardProfile;
    private static short[] IccPrivateKeyCrtComponentsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static int getAid;
    private static byte[] valueOf;
    private static int writeReplace;
    private java.lang.Class values;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, byte b2, int i, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = (i * 3) + 104;
        int i5 = 1 - (b * 3);
        byte[] bArr = $$a;
        int i6 = (b2 * 2) + 4;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i7 = i4;
            i3 = 0;
            i4 = i6;
            i6++;
            i4 += -i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = bArr[i6];
            i6++;
            i4 += -i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
            }
        }
    }

    public unbindService(java.lang.Class cls) {
        this.values = cls;
    }

    public static java.lang.String writeReplace(T t) {
        com.payair.hce.setChildDivider setchilddivider = new com.payair.hce.setChildDivider();
        int keyCodeFromString = android.view.KeyEvent.keyCodeFromString("");
        int absoluteGravity = android.view.Gravity.getAbsoluteGravity(0, 0);
        float length = android.graphics.PointF.length(0.0f, 0.0f);
        java.lang.Object[] objArr = new java.lang.Object[1];
        a((-1502840899) - keyCodeFromString, absoluteGravity - 901587076, (length > 0.0f ? 1 : (length == 0.0f ? 0 : -1)) - 118, (byte) android.widget.ExpandableListView.getPackedPositionGroup(0L), (short) ((-79) - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), objArr);
        setchilddivider.valueOf(((java.lang.String) objArr[0]).intern());
        setchilddivider.AlternateContactlessPaymentDataJson(new com.payair.hce.updateServiceGroup(), com.payair.hce.bindIsolatedService.class);
        setchilddivider.AlternateContactlessPaymentDataJson(new com.payair.hce.getSystemService(), java.lang.Byte.TYPE);
        setchilddivider.AlternateContactlessPaymentDataJson(new com.payair.hce.getSystemServiceName(), java.lang.Void.TYPE);
        java.lang.String DigitizedCardProfile2 = setchilddivider.DigitizedCardProfile(t);
        SdkCoreAlternateContactlessPaymentDataImpl = (getAid + 15) % 128;
        return DigitizedCardProfile2;
    }

    private static void a(int i, int i2, int i3, byte b, short s, java.lang.Object[] objArr) {
        boolean z;
        int i4;
        boolean z2;
        int length;
        byte[] bArr;
        int i5;
        com.payair.hce.getTrack2ConstructionData gettrack2constructiondata = new com.payair.hce.getTrack2ConstructionData();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(writeReplace)};
            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
            if (obj == null) {
                obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetBefore("", 0) + 27, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 30, (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj);
            }
            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
            if (intValue == -1) {
                $11 = ($10 + 49) % 128;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int i6 = $10 + 79;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
                    throw new java.lang.ArithmeticException();
                }
                byte[] bArr2 = valueOf;
                long j = -1;
                if (bArr2 != null) {
                    int length2 = bArr2.length;
                    byte[] bArr3 = new byte[length2];
                    int i7 = 0;
                    while (i7 < length2) {
                        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(bArr2[i7])};
                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609478628);
                        if (obj2 == null) {
                            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.currentThreadTimeMillis() > j ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == j ? 0 : -1)) + 30, android.view.KeyEvent.getDeadChar(0, 0) + 5088, (char) ((android.os.SystemClock.currentThreadTimeMillis() > j ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == j ? 0 : -1)) - 1))).getMethod("e", java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609478628, obj2);
                        }
                        bArr3[i7] = ((java.lang.Byte) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).byteValue();
                        i7++;
                        $11 = ($10 + 9) % 128;
                        j = -1;
                    }
                    bArr2 = bArr3;
                }
                if (bArr2 != null) {
                    byte[] bArr4 = valueOf;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), android.graphics.Color.rgb(0, 0, 0) + 16777245, (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj3);
                    }
                    intValue = (byte) (((byte) (bArr4[((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue()] ^ (-4897270311952305750L))) + ((int) (writeReplace ^ (-4897270311952305750L))));
                } else {
                    intValue = (short) (((short) (IccPrivateKeyCrtComponentsJson[i2 + ((int) (AlternateContactlessPaymentDataJson ^ (-4897270311952305750L)))] ^ (-4897270311952305750L))) + ((int) (writeReplace ^ (-4897270311952305750L))));
                }
            }
            if (intValue > 0) {
                int i8 = $11;
                $10 = (i8 + 87) % 128;
                int i9 = (int) (AlternateContactlessPaymentDataJson ^ (-4897270311952305750L));
                if (z) {
                    $10 = (i8 + 99) % 128;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                gettrack2constructiondata.writeReplace = ((i2 + intValue) - 2) + i9 + i4;
                java.lang.Object[] objArr5 = {gettrack2constructiondata, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(DigitizedCardProfile), sb};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-500696024);
                if (obj4 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - android.os.Process.getGidForName(""), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2363, (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    b((byte) 0, (byte) 0, 0, objArr6);
                    obj4 = cls.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-500696024, obj4);
                }
                ((java.lang.StringBuilder) ((java.lang.reflect.Method) obj4).invoke(null, objArr5)).append(gettrack2constructiondata.values);
                gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                byte[] bArr5 = valueOf;
                if (bArr5 != null) {
                    int i10 = $11 + 125;
                    $10 = i10 % 128;
                    if (i10 % 2 != 0) {
                        length = bArr5.length;
                        bArr = new byte[length];
                        i5 = 1;
                    } else {
                        length = bArr5.length;
                        bArr = new byte[length];
                        i5 = 0;
                    }
                    while (i5 < length) {
                        bArr[i5] = (byte) (bArr5[i5] ^ (-4897270311952305750L));
                        i5++;
                    }
                    bArr5 = bArr;
                }
                if (bArr5 != null) {
                    $10 = ($11 + 35) % 128;
                    z2 = true;
                } else {
                    z2 = false;
                }
                gettrack2constructiondata.DigitizedCardProfile = 1;
                while (gettrack2constructiondata.DigitizedCardProfile < intValue) {
                    if (z2) {
                        byte[] bArr6 = valueOf;
                        gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                        gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((byte) (((byte) (bArr6[r7] ^ (-4897270311952305750L))) + s)) ^ b));
                    } else {
                        short[] sArr = IccPrivateKeyCrtComponentsJson;
                        gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                        gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((short) (((short) (sArr[r7] ^ (-4897270311952305750L))) + s)) ^ b));
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
        init$0();
        $10 = 0;
        $11 = 1;
        getAid = 0;
        SdkCoreAlternateContactlessPaymentDataImpl = 1;
        AlternateContactlessPaymentDataJson = 716771630;
        writeReplace = 520368607;
        DigitizedCardProfile = 1184348615;
        valueOf = new byte[]{56, -27, -53, -18, -14, 46, -7};
    }

    static void init$0() {
        $$a = new byte[]{76, 91, 9, -2};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_CONFIRMED_VALUE;
    }
}
