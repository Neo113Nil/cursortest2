package com.payair.hce;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DigitizedCardProfile' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes4.dex */
public final class reInitialize {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    public static final com.payair.hce.reInitialize DigitizedCardProfile;
    private static byte[] IccPrivateKeyCrtComponentsJson;
    private static int RecordsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static int getAid;
    private static int getCvrMaskAnd;
    private static short[] getProfileVersion;
    public static final com.payair.hce.reInitialize valueOf;
    private static final /* synthetic */ com.payair.hce.reInitialize[] values;
    public static final com.payair.hce.reInitialize writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, byte b, byte b2, java.lang.Object[] objArr) {
        int i;
        int i2;
        int i3 = (s * 2) + 1;
        int i4 = 104 - (b * 2);
        int i5 = b2 + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i3];
        if (bArr == null) {
            int i6 = i3;
            int i7 = i5;
            i2 = 0;
            int i8 = i5 + i6;
            i = i2;
            i5 = i7;
            i4 = i8;
            int i9 = i5 + 1;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i3) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = bArr[i9];
            i5 = i4;
            i7 = i9;
            int i82 = i5 + i6;
            i = i2;
            i5 = i7;
            i4 = i82;
            int i92 = i5 + 1;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i3) {
            }
        } else {
            i = 0;
            int i922 = i5 + 1;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i3) {
            }
        }
    }

    private reInitialize(java.lang.String str, int i) {
    }

    public static com.payair.hce.reInitialize valueOf(java.lang.String str) {
        SdkCoreAlternateContactlessPaymentDataImpl = (getCvrMaskAnd + 69) % 128;
        com.payair.hce.reInitialize reinitialize = (com.payair.hce.reInitialize) java.lang.Enum.valueOf(com.payair.hce.reInitialize.class, str);
        int i = getCvrMaskAnd + 105;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 == 0) {
            return reinitialize;
        }
        throw null;
    }

    public static com.payair.hce.reInitialize[] values() {
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 45;
        getCvrMaskAnd = i % 128;
        com.payair.hce.reInitialize[] reinitializeArr = values;
        if (i % 2 != 0) {
            return (com.payair.hce.reInitialize[]) reinitializeArr.clone();
        }
        throw new java.lang.ArithmeticException();
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        SdkCoreAlternateContactlessPaymentDataImpl = 0;
        getCvrMaskAnd = 1;
        AlternateContactlessPaymentDataJson();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a((short) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), android.text.TextUtils.getTrimmedLength("") - 368239268, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1799010437, (-18) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (byte) ((-25) - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), objArr);
        com.payair.hce.reInitialize reinitialize = new com.payair.hce.reInitialize(((java.lang.String) objArr[0]).intern(), 0);
        DigitizedCardProfile = reinitialize;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a((short) (android.view.KeyEvent.getMaxKeyCode() >> 16), android.text.TextUtils.getOffsetBefore("", 0) - 368239252, 1799010443 - android.os.Process.getGidForName(""), android.text.TextUtils.indexOf("", "") - 15, (byte) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 20), objArr2);
        com.payair.hce.reInitialize reinitialize2 = new com.payair.hce.reInitialize(((java.lang.String) objArr2[0]).intern(), 1);
        writeReplace = reinitialize2;
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a((short) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (-368239257) - android.graphics.ImageFormat.getBitsPerPixel(0), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1799010451, (-17) - android.view.View.MeasureSpec.getSize(0), (byte) (30 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), objArr3);
        com.payair.hce.reInitialize reinitialize3 = new com.payair.hce.reInitialize(((java.lang.String) objArr3[0]).intern(), 2);
        valueOf = reinitialize3;
        values = new com.payair.hce.reInitialize[]{reinitialize, reinitialize2, reinitialize3};
        SdkCoreAlternateContactlessPaymentDataImpl = (getCvrMaskAnd + 13) % 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x018b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, int i, int i2, int i3, byte b, java.lang.Object[] objArr) {
        int i4;
        long j;
        boolean z;
        com.payair.hce.getTrack2ConstructionData gettrack2constructiondata = new com.payair.hce.getTrack2ConstructionData();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(getAid)};
            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
            if (obj == null) {
                obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 26, 29 - android.text.TextUtils.getOffsetBefore("", 0), (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj);
            }
            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
            if (intValue == -1) {
                $11 = ($10 + 113) % 128;
                i4 = 1;
            } else {
                i4 = 0;
            }
            if (i4 != 0) {
                byte[] bArr = IccPrivateKeyCrtComponentsJson;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i5 = 0; i5 < length; i5++) {
                        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(bArr[i5])};
                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609478628);
                        if (obj2 == null) {
                            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), 5089 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1))).getMethod("e", java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609478628, obj2);
                        }
                        bArr2[i5] = ((java.lang.Byte) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr == null) {
                    j = -4897270311952305750L;
                    intValue = (short) (((short) (getProfileVersion[i2 + ((int) (AlternateContactlessPaymentDataJson ^ (-4897270311952305750L)))] ^ (-4897270311952305750L))) + ((int) (getAid ^ (-4897270311952305750L))));
                    if (intValue > 0) {
                        gettrack2constructiondata.writeReplace = ((i2 + intValue) - 2) + ((int) (AlternateContactlessPaymentDataJson ^ j)) + i4;
                        java.lang.Object[] objArr4 = {gettrack2constructiondata, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(RecordsJson), sb};
                        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-500696024);
                        if (obj3 == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 28, 2363 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (char) android.view.View.getDefaultSize(0, 0));
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            b((short) 0, (byte) 0, (byte) -1, objArr5);
                            obj3 = cls.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-500696024, obj3);
                        }
                        ((java.lang.StringBuilder) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).append(gettrack2constructiondata.values);
                        gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                        byte[] bArr3 = IccPrivateKeyCrtComponentsJson;
                        if (bArr3 != null) {
                            int length2 = bArr3.length;
                            byte[] bArr4 = new byte[length2];
                            for (int i6 = 0; i6 < length2; i6++) {
                                bArr4[i6] = (byte) (bArr3[i6] ^ (-4897270311952305750L));
                            }
                            bArr3 = bArr4;
                        }
                        if (bArr3 != null) {
                            $10 = ($11 + 59) % 128;
                            z = true;
                        } else {
                            z = false;
                        }
                        gettrack2constructiondata.DigitizedCardProfile = 1;
                        while (gettrack2constructiondata.DigitizedCardProfile < intValue) {
                            int i7 = ($10 + 77) % 128;
                            $11 = i7;
                            if (z) {
                                $10 = (i7 + 105) % 128;
                                byte[] bArr5 = IccPrivateKeyCrtComponentsJson;
                                gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                                gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((byte) (((byte) (bArr5[r7] ^ (-4897270311952305750L))) + s)) ^ b));
                            } else {
                                short[] sArr = getProfileVersion;
                                gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                                gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((short) (((short) (sArr[r7] ^ (-4897270311952305750L))) + s)) ^ b));
                            }
                            sb.append(gettrack2constructiondata.values);
                            gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                            gettrack2constructiondata.DigitizedCardProfile++;
                        }
                    }
                    objArr[0] = sb.toString();
                }
                byte[] bArr6 = IccPrivateKeyCrtComponentsJson;
                java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson)};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                if (obj4 == null) {
                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.view.View.getDefaultSize(0, 0), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 29, (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj4);
                }
                intValue = (byte) (((byte) (bArr6[((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr6)).intValue()] ^ (-4897270311952305750L))) + ((int) (getAid ^ (-4897270311952305750L))));
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

    static void AlternateContactlessPaymentDataJson() {
        AlternateContactlessPaymentDataJson = -1950255408;
        getAid = 520368562;
        RecordsJson = 183948098;
        IccPrivateKeyCrtComponentsJson = new byte[]{-69, 73, -79, 69, -78, 77, 66, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, -67, 65, -91, 65, 64, -71, 75, -76, -74, 64, 73, -74, -86, -86, -86};
    }

    static void init$0() {
        $$a = new byte[]{16, -36, 67, -117};
        $$b = 247;
    }
}
