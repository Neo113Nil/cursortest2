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
public final class getjSONObject {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    public static final com.payair.hce.getjSONObject AlternateContactlessPaymentDataJson;
    private static final /* synthetic */ com.payair.hce.getjSONObject[] DigitizedCardProfile;
    private static int IccPrivateKeyCrtComponentsJson;
    private static byte[] RecordsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static int getAid;
    private static int getCvrMaskAnd;
    private static short[] getProfileVersion;
    public static final com.payair.hce.getjSONObject valueOf;
    public static final com.payair.hce.getjSONObject values;
    private static int writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:4:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, byte b2, int i, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = 3 - (i * 3);
        byte[] bArr = $$a;
        int i5 = b * 3;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        if (bArr == null) {
            int i7 = i6;
            i3 = i4;
            i2 = 0;
            i4 += i7;
            i3++;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i2++;
            i7 = bArr[i3];
            i4 += i7;
            i3++;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            i4 = (b2 * 3) + 104;
            i3 = i4;
            i3++;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
            }
        }
    }

    private getjSONObject(java.lang.String str, int i) {
    }

    public static com.payair.hce.getjSONObject valueOf(java.lang.String str) {
        getCvrMaskAnd = (IccPrivateKeyCrtComponentsJson + 67) % 128;
        com.payair.hce.getjSONObject getjsonobject = (com.payair.hce.getjSONObject) java.lang.Enum.valueOf(com.payair.hce.getjSONObject.class, str);
        int i = getCvrMaskAnd + 51;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 == 0) {
            return getjsonobject;
        }
        throw null;
    }

    public static com.payair.hce.getjSONObject[] values() {
        getCvrMaskAnd = (IccPrivateKeyCrtComponentsJson + 69) % 128;
        com.payair.hce.getjSONObject[] getjsonobjectArr = (com.payair.hce.getjSONObject[]) DigitizedCardProfile.clone();
        int i = getCvrMaskAnd + 75;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 == 0) {
            return getjsonobjectArr;
        }
        throw null;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        IccPrivateKeyCrtComponentsJson = 0;
        getCvrMaskAnd = 1;
        DigitizedCardProfile();
        int trimmedLength = android.text.TextUtils.getTrimmedLength("");
        long packedPositionForGroup = android.widget.ExpandableListView.getPackedPositionForGroup(0);
        java.lang.Object[] objArr = new java.lang.Object[1];
        a((short) (android.text.TextUtils.indexOf("", "") - 59), trimmedLength - 223763526, (packedPositionForGroup > 0L ? 1 : (packedPositionForGroup == 0L ? 0 : -1)) - 697244274, (-33) - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (byte) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 79), objArr);
        com.payair.hce.getjSONObject getjsonobject = new com.payair.hce.getjSONObject(((java.lang.String) objArr[0]).intern(), 0);
        AlternateContactlessPaymentDataJson = getjsonobject;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a((short) ((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 24), (-223763527) - android.view.Gravity.getAbsoluteGravity(0, 0), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 697244268, (-33) - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (byte) (57 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), objArr2);
        com.payair.hce.getjSONObject getjsonobject2 = new com.payair.hce.getjSONObject(((java.lang.String) objArr2[0]).intern(), 1);
        values = getjsonobject2;
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a((short) (android.os.Process.getGidForName("") + 72), (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 223763510, (-697244264) - android.os.Process.getGidForName(""), (-32) - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (byte) (102 - android.view.View.MeasureSpec.getMode(0)), objArr3);
        com.payair.hce.getjSONObject getjsonobject3 = new com.payair.hce.getjSONObject(((java.lang.String) objArr3[0]).intern(), 2);
        valueOf = getjsonobject3;
        DigitizedCardProfile = new com.payair.hce.getjSONObject[]{getjsonobject, getjsonobject2, getjsonobject3};
        int i = IccPrivateKeyCrtComponentsJson + 83;
        getCvrMaskAnd = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static void a(short s, int i, int i2, int i3, byte b, java.lang.Object[] objArr) {
        boolean z;
        int i4;
        int i5;
        com.payair.hce.getTrack2ConstructionData gettrack2constructiondata = new com.payair.hce.getTrack2ConstructionData();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(SdkCoreAlternateContactlessPaymentDataImpl)};
            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
            if (obj == null) {
                obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), 29 - android.text.TextUtils.indexOf("", ""), (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj);
            }
            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
            if (intValue == -1) {
                int i6 = $11 + 89;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 3 / 2;
                }
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int i8 = $11 + 91;
                int i9 = i8 % 128;
                $10 = i9;
                if (i8 % 2 != 0) {
                    throw null;
                }
                byte[] bArr = RecordsJson;
                long j = 0;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    $11 = (i9 + 7) % 128;
                    int i10 = 0;
                    while (i10 < length) {
                        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(bArr[i10])};
                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609478628);
                        if (obj2 == null) {
                            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 31, 5089 - (android.os.SystemClock.elapsedRealtime() > j ? 1 : (android.os.SystemClock.elapsedRealtime() == j ? 0 : -1)), (char) android.text.TextUtils.getOffsetAfter("", 0))).getMethod("e", java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609478628, obj2);
                        }
                        bArr2[i10] = ((java.lang.Byte) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).byteValue();
                        i10++;
                        j = 0;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i11 = $11 + 77;
                    $10 = i11 % 128;
                    if (i11 % 2 != 0) {
                        byte[] bArr3 = RecordsJson;
                        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(writeReplace)};
                        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                        if (obj3 == null) {
                            obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), 29 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) android.view.View.combineMeasuredStates(0, 0))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj3);
                        }
                        i5 = ((byte) (bArr3[((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue()] ^ (-4897270311952305750L))) % ((int) (SdkCoreAlternateContactlessPaymentDataImpl / (-4897270311952305750L)));
                    } else {
                        byte[] bArr4 = RecordsJson;
                        java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(writeReplace)};
                        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                        if (obj4 == null) {
                            obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 28, 29 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) android.view.View.MeasureSpec.getMode(0))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj4);
                        }
                        i5 = ((byte) (bArr4[((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr5)).intValue()] ^ (-4897270311952305750L))) + ((int) (SdkCoreAlternateContactlessPaymentDataImpl ^ (-4897270311952305750L)));
                    }
                    intValue = (byte) i5;
                } else {
                    intValue = (short) (((short) (getProfileVersion[i2 + ((int) (writeReplace ^ (-4897270311952305750L)))] ^ (-4897270311952305750L))) + ((int) (SdkCoreAlternateContactlessPaymentDataImpl ^ (-4897270311952305750L))));
                    $10 = ($11 + 103) % 128;
                }
            }
            if (intValue > 0) {
                int i12 = (int) (writeReplace ^ (-4897270311952305750L));
                if (z) {
                    $10 = ($11 + 117) % 128;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                gettrack2constructiondata.writeReplace = ((i2 + intValue) - 2) + i12 + i4;
                java.lang.Object[] objArr6 = {gettrack2constructiondata, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(getAid), sb};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-500696024);
                if (obj5 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 27, android.text.TextUtils.getTrimmedLength("") + 2364, (char) android.graphics.Color.argb(0, 0, 0, 0));
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    b((byte) 0, (byte) 0, 0, objArr7);
                    obj5 = cls.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-500696024, obj5);
                }
                ((java.lang.StringBuilder) ((java.lang.reflect.Method) obj5).invoke(null, objArr6)).append(gettrack2constructiondata.values);
                gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                byte[] bArr5 = RecordsJson;
                if (bArr5 != null) {
                    int length2 = bArr5.length;
                    byte[] bArr6 = new byte[length2];
                    for (int i13 = 0; i13 < length2; i13++) {
                        bArr6[i13] = (byte) (bArr5[i13] ^ (-4897270311952305750L));
                    }
                    bArr5 = bArr6;
                }
                boolean z2 = bArr5 != null;
                gettrack2constructiondata.DigitizedCardProfile = 1;
                while (gettrack2constructiondata.DigitizedCardProfile < intValue) {
                    if (z2) {
                        byte[] bArr7 = RecordsJson;
                        gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                        gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((byte) (((byte) (bArr7[r7] ^ (-4897270311952305750L))) + s)) ^ b));
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
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    static void DigitizedCardProfile() {
        writeReplace = 915090392;
        SdkCoreAlternateContactlessPaymentDataImpl = 520368522;
        getAid = 307391776;
        RecordsJson = new byte[]{com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 60, 56, 66, 38, 76, -77, -115, 7, com.google.common.base.Ascii.ESC, -73, 77, -32, -115, -118, -76, -2, -14};
    }

    static void init$0() {
        $$a = new byte[]{com.google.common.base.Ascii.FF, 9, 103, -116};
        $$b = 127;
    }
}
