package com.payair.hce;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'AlternateContactlessPaymentDataJson' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes4.dex */
public final class setOrderRef {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    public static final com.payair.hce.setOrderRef AlternateContactlessPaymentDataJson;
    private static int DigitizedCardProfile;
    private static int IccPrivateKeyCrtComponentsJson;
    private static short[] RecordsJson;
    private static byte[] SdkCoreAlternateContactlessPaymentDataImpl;
    private static int getAid;
    private static int getProfileVersion;
    private static final /* synthetic */ com.payair.hce.setOrderRef[] valueOf;
    private static int values;
    public static final com.payair.hce.setOrderRef writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, byte b, java.lang.Object[] objArr) {
        int i3;
        int i4 = (i * 3) + 4;
        int i5 = i2 * 3;
        int i6 = 104 - (b * 3);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i5];
        int i7 = 0 - i5;
        if (bArr == null) {
            int i8 = i7;
            i3 = 0;
            i4++;
            i6 += i8;
            bArr2[i3] = (byte) i6;
            if (i3 == i7) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i3++;
            i8 = bArr[i4];
            i4++;
            i6 += i8;
            bArr2[i3] = (byte) i6;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i6;
            if (i3 == i7) {
            }
        }
    }

    private setOrderRef(java.lang.String str, int i) {
    }

    public static com.payair.hce.setOrderRef valueOf(java.lang.String str) {
        IccPrivateKeyCrtComponentsJson = (getAid + 33) % 128;
        com.payair.hce.setOrderRef setorderref = (com.payair.hce.setOrderRef) java.lang.Enum.valueOf(com.payair.hce.setOrderRef.class, str);
        IccPrivateKeyCrtComponentsJson = (getAid + 5) % 128;
        return setorderref;
    }

    public static com.payair.hce.setOrderRef[] values() {
        IccPrivateKeyCrtComponentsJson = (getAid + 93) % 128;
        com.payair.hce.setOrderRef[] setorderrefArr = (com.payair.hce.setOrderRef[]) valueOf.clone();
        int i = IccPrivateKeyCrtComponentsJson + 85;
        getAid = i % 128;
        if (i % 2 == 0) {
            return setorderrefArr;
        }
        throw null;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getAid = 0;
        IccPrivateKeyCrtComponentsJson = 1;
        AlternateContactlessPaymentDataJson();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a((short) ('0' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), (-1740726835) - (android.os.Process.myTid() >> 22), 246849124 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (-95) - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (byte) (android.graphics.ImageFormat.getBitsPerPixel(0) + 1), objArr);
        com.payair.hce.setOrderRef setorderref = new com.payair.hce.setOrderRef(((java.lang.String) objArr[0]).intern(), 0);
        AlternateContactlessPaymentDataJson = setorderref;
        short s = (short) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1);
        int scrollBarSize = android.view.ViewConfiguration.getScrollBarSize();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(s, (scrollBarSize >> 8) - 1740726836, 40606 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), android.graphics.Color.red(0) - 96, (byte) android.graphics.Color.blue(0), objArr2);
        com.payair.hce.setOrderRef setorderref2 = new com.payair.hce.setOrderRef(((java.lang.String) objArr2[0]).intern(), 1);
        writeReplace = setorderref2;
        valueOf = new com.payair.hce.setOrderRef[]{setorderref, setorderref2};
        int i = getAid + 27;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static void a(short s, int i, int i2, int i3, byte b, java.lang.Object[] objArr) {
        boolean z;
        int i4;
        com.payair.hce.getTrack2ConstructionData gettrack2constructiondata = new com.payair.hce.getTrack2ConstructionData();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(values)};
            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
            if (obj == null) {
                obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 28, android.view.KeyEvent.keyCodeFromString("") + 29, (char) android.text.TextUtils.getOffsetAfter("", 0))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj);
            }
            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
            int i5 = intValue == -1 ? 1 : 0;
            if (i5 != 0) {
                byte[] bArr = SdkCoreAlternateContactlessPaymentDataImpl;
                float f = 0.0f;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i6 = 0;
                    while (i6 < length) {
                        $11 = ($10 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(bArr[i6])};
                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609478628);
                        if (obj2 == null) {
                            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - (android.util.TypedValue.complexToFraction(0, f, f) > f ? 1 : (android.util.TypedValue.complexToFraction(0, f, f) == f ? 0 : -1)), 5089 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) android.graphics.Color.argb(0, 0, 0, 0))).getMethod("e", java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609478628, obj2);
                        }
                        bArr2[i6] = ((java.lang.Byte) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).byteValue();
                        i6++;
                        f = 0.0f;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = SdkCoreAlternateContactlessPaymentDataImpl;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(DigitizedCardProfile)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 27, (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 28, (char) android.view.View.getDefaultSize(0, 0))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj3);
                    }
                    intValue = (byte) (((byte) (bArr3[((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue()] ^ (-4897270311952305750L))) + ((int) (values ^ (-4897270311952305750L))));
                } else {
                    intValue = (short) (((short) (RecordsJson[i2 + ((int) (DigitizedCardProfile ^ (-4897270311952305750L)))] ^ (-4897270311952305750L))) + ((int) (values ^ (-4897270311952305750L))));
                }
            }
            if (intValue > 0) {
                $10 = ($11 + 41) % 128;
                gettrack2constructiondata.writeReplace = ((i2 + intValue) - 2) + ((int) (DigitizedCardProfile ^ (-4897270311952305750L))) + i5;
                java.lang.Object[] objArr5 = {gettrack2constructiondata, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(getProfileVersion), sb};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-500696024);
                if (obj4 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (android.os.Process.myTid() >> 22) + 2364, (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    b(0, 0, (byte) 0, objArr6);
                    obj4 = cls.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-500696024, obj4);
                }
                ((java.lang.StringBuilder) ((java.lang.reflect.Method) obj4).invoke(null, objArr5)).append(gettrack2constructiondata.values);
                gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                byte[] bArr4 = SdkCoreAlternateContactlessPaymentDataImpl;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    int i7 = 0;
                    while (i7 < length2) {
                        bArr5[i7] = (byte) (bArr4[i7] ^ (-4897270311952305750L));
                        i7++;
                        $11 = ($10 + 65) % 128;
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    z = true;
                } else {
                    $11 = ($10 + 89) % 128;
                    z = false;
                }
                gettrack2constructiondata.DigitizedCardProfile = 1;
                while (gettrack2constructiondata.DigitizedCardProfile < intValue) {
                    if (z) {
                        int i8 = $11 + 3;
                        $10 = i8 % 128;
                        if (i8 % 2 != 0) {
                            byte[] bArr6 = SdkCoreAlternateContactlessPaymentDataImpl;
                            gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace;
                            i4 = gettrack2constructiondata.AlternateContactlessPaymentDataJson / (((byte) (((byte) (bArr6[r9] & (-4897270311952305750L))) >> s)) ^ b);
                        } else {
                            byte[] bArr7 = SdkCoreAlternateContactlessPaymentDataImpl;
                            gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                            i4 = gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((byte) (((byte) (bArr7[r9] ^ (-4897270311952305750L))) + s)) ^ b);
                        }
                        gettrack2constructiondata.values = (char) i4;
                    } else {
                        short[] sArr = RecordsJson;
                        gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                        gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((short) (((short) (sArr[r9] ^ (-4897270311952305750L))) + s)) ^ b));
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

    static void AlternateContactlessPaymentDataJson() {
        DigitizedCardProfile = -296923082;
        values = 520368629;
        getProfileVersion = 2026197802;
        SdkCoreAlternateContactlessPaymentDataImpl = new byte[]{1, -81, 83, 91, -80, 83, -87, -83, 89, -88, com.google.common.base.Ascii.GS, 93, -71, 85, -85, 78, -79, 85, 86, -87, 87, 93, -89, 69, 93, -84, -89, -86, -95, 84, 94, -87};
    }

    static void init$0() {
        $$a = new byte[]{82, -10, -24, -99};
        $$b = 63;
    }
}
