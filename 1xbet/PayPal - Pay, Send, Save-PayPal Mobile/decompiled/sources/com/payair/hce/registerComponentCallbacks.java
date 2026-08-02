package com.payair.hce;

/* loaded from: classes4.dex */
public class registerComponentCallbacks implements com.payair.hce.getClassLoader {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static short[] RecordsJson;
    private static int getAid;
    private static byte[] getProfileVersion;
    private static int valueOf;
    private com.payair.hce.getMainLooper DigitizedCardProfile;
    private com.payair.hce.getClassLoader values;
    private com.payair.hce.checkPermission writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, byte b, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4;
        int i5 = (i * 2) + 1;
        int i6 = 104 - (b * 4);
        int i7 = 4 - (i2 * 4);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i8 = i7;
            i4 = 0;
            i7++;
            i6 += i8;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i8 = i6;
            i6 = bArr[i7];
            i7++;
            i6 += i8;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i5) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i5) {
            }
        }
    }

    public registerComponentCallbacks(com.payair.hce.getClassLoader getclassloader, com.payair.hce.getMainLooper getmainlooper) {
        int maximumDrawingCacheSize = android.view.ViewConfiguration.getMaximumDrawingCacheSize();
        int keyRepeatTimeout = android.view.ViewConfiguration.getKeyRepeatTimeout();
        float maxVolume = android.media.AudioTrack.getMaxVolume();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a((maximumDrawingCacheSize >> 24) - 1993769689, (keyRepeatTimeout >> 16) - 1992008997, (maxVolume > 0.0f ? 1 : (maxVolume == 0.0f ? 0 : -1)) - 41, (byte) (95 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16)), (short) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1), objArr);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(((java.lang.String) objArr[0]).intern());
        sb.append(com.payair.hce.registerComponentCallbacks.class.getName());
        this.writeReplace = com.payair.hce.checkPermission.DigitizedCardProfile(sb.toString());
        this.values = getclassloader;
        this.DigitizedCardProfile = getmainlooper;
    }

    private static void a(int i, int i2, int i3, byte b, short s, java.lang.Object[] objArr) {
        int i4;
        boolean z;
        int i5;
        com.payair.hce.getTrack2ConstructionData gettrack2constructiondata = new com.payair.hce.getTrack2ConstructionData();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(valueOf)};
            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
            if (obj == null) {
                obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), android.view.MotionEvent.axisFromString("") + 30, (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj);
            }
            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
            if (intValue == -1) {
                $10 = ($11 + 25) % 128;
                i4 = 1;
            } else {
                i4 = 0;
            }
            char c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
            if (i4 != 0) {
                int i6 = $10 + 85;
                int i7 = i6 % 128;
                $11 = i7;
                if (i6 % 2 == 0) {
                    throw null;
                }
                byte[] bArr = getProfileVersion;
                if (bArr != null) {
                    $10 = (i7 + 13) % 128;
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i8 = 0;
                    while (i8 < length) {
                        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(bArr[i8])};
                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609478628);
                        if (obj2 == null) {
                            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), android.text.TextUtils.indexOf("", c, 0) + 5089, (char) android.view.View.MeasureSpec.getSize(0))).getMethod("e", java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609478628, obj2);
                        }
                        bArr2[i8] = ((java.lang.Byte) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).byteValue();
                        i8++;
                        c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i9 = $11 + 59;
                    $10 = i9 % 128;
                    if (i9 % 2 != 0) {
                        byte[] bArr3 = getProfileVersion;
                        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson)};
                        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                        if (obj3 == null) {
                            obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "") + 27, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 29, (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj3);
                        }
                        i5 = ((byte) (bArr3[((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue()] + 4897270311952305750L)) << ((int) (valueOf * (-4897270311952305750L)));
                    } else {
                        byte[] bArr4 = getProfileVersion;
                        java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson)};
                        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                        if (obj4 == null) {
                            obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), android.graphics.Color.blue(0) + 29, (char) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj4);
                        }
                        i5 = ((byte) (bArr4[((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr5)).intValue()] ^ (-4897270311952305750L))) + ((int) (valueOf ^ (-4897270311952305750L)));
                    }
                    intValue = (byte) i5;
                } else {
                    intValue = (short) (((short) (RecordsJson[i2 + ((int) (AlternateContactlessPaymentDataJson ^ (-4897270311952305750L)))] ^ (-4897270311952305750L))) + ((int) (valueOf ^ (-4897270311952305750L))));
                }
            }
            if (intValue > 0) {
                gettrack2constructiondata.writeReplace = ((i2 + intValue) - 2) + ((int) (AlternateContactlessPaymentDataJson ^ (-4897270311952305750L))) + i4;
                java.lang.Object[] objArr6 = {gettrack2constructiondata, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(getAid), sb};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-500696024);
                if (obj5 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 2363 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    b(0, (byte) 0, 0, objArr7);
                    obj5 = cls.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-500696024, obj5);
                }
                ((java.lang.StringBuilder) ((java.lang.reflect.Method) obj5).invoke(null, objArr6)).append(gettrack2constructiondata.values);
                gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                byte[] bArr5 = getProfileVersion;
                if (bArr5 != null) {
                    int length2 = bArr5.length;
                    byte[] bArr6 = new byte[length2];
                    int i10 = 0;
                    while (i10 < length2) {
                        int i11 = $11 + 121;
                        $10 = i11 % 128;
                        if (i11 % 2 != 0) {
                            bArr6[i10] = (byte) (bArr5[i10] - 4897270311952305750L);
                            i10 <<= 1;
                        } else {
                            bArr6[i10] = (byte) (bArr5[i10] ^ (-4897270311952305750L));
                            i10++;
                        }
                    }
                    bArr5 = bArr6;
                }
                if (bArr5 != null) {
                    $10 = ($11 + 37) % 128;
                    z = true;
                } else {
                    z = false;
                }
                gettrack2constructiondata.DigitizedCardProfile = 1;
                while (gettrack2constructiondata.DigitizedCardProfile < intValue) {
                    $10 = ($11 + 35) % 128;
                    if (z) {
                        byte[] bArr7 = getProfileVersion;
                        gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                        gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((byte) (((byte) (bArr7[r7] ^ (-4897270311952305750L))) + s)) ^ b));
                    } else {
                        short[] sArr = RecordsJson;
                        gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                        gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((short) (((short) (sArr[r7] ^ (-4897270311952305750L))) + s)) ^ b));
                    }
                    sb.append(gettrack2constructiondata.values);
                    gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                    gettrack2constructiondata.DigitizedCardProfile++;
                }
            }
            java.lang.String obj6 = sb.toString();
            $10 = ($11 + 35) % 128;
            objArr[0] = obj6;
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
        AlternateContactlessPaymentDataJson = 1774163087;
        valueOf = 520368525;
        getAid = 1775415942;
        getProfileVersion = new byte[]{117, 81, -87, 32, -14, 4};
    }

    static void init$0() {
        $$a = new byte[]{47, 64, -76, com.visa.cbp.getEncExpo.IResultReceiver};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE;
    }
}
