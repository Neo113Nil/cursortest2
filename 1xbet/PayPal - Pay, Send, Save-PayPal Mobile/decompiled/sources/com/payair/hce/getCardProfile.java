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
/* loaded from: classes10.dex */
public final class getCardProfile {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static com.payair.hce.getCardProfile AlternateContactlessPaymentDataJson;
    public static final com.payair.hce.getCardProfile DigitizedCardProfile;
    private static char IccPrivateKeyCrtComponentsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static int getAid;
    private static final /* synthetic */ com.payair.hce.getCardProfile[] valueOf;
    private static com.payair.hce.getCardProfile values;
    private static char[] writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, short s, byte b, java.lang.Object[] objArr) {
        int i2;
        byte[] bArr = $$a;
        int i3 = (i * 8) + 65;
        int i4 = 4 - (b * 4);
        int i5 = s * 2;
        byte[] bArr2 = new byte[1 - i5];
        if (bArr == null) {
            int i6 = i4;
            int i7 = 0;
            i3 += i4;
            i4 = i6 + 1;
            i2 = i7;
            bArr2[i2] = (byte) i3;
            if (i2 == 0 - i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i8 = i2 + 1;
            i6 = i4;
            i4 = bArr[i4];
            i7 = i8;
            i3 += i4;
            i4 = i6 + 1;
            i2 = i7;
            bArr2[i2] = (byte) i3;
            if (i2 == 0 - i5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            if (i2 == 0 - i5) {
            }
        }
    }

    private getCardProfile(java.lang.String str, int i) {
    }

    public static com.payair.hce.getCardProfile valueOf(java.lang.String str) {
        int i = getAid + 33;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        com.payair.hce.getCardProfile getcardprofile = (com.payair.hce.getCardProfile) java.lang.Enum.valueOf(com.payair.hce.getCardProfile.class, str);
        if (i % 2 != 0) {
            throw null;
        }
        int i2 = SdkCoreAlternateContactlessPaymentDataImpl + 39;
        getAid = i2 % 128;
        if (i2 % 2 != 0) {
            return getcardprofile;
        }
        throw null;
    }

    public static com.payair.hce.getCardProfile[] values() {
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 21;
        getAid = i % 128;
        com.payair.hce.getCardProfile[] getcardprofileArr = valueOf;
        if (i % 2 != 0) {
            return (com.payair.hce.getCardProfile[]) getcardprofileArr.clone();
        }
        throw new java.lang.ArithmeticException();
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        SdkCoreAlternateContactlessPaymentDataImpl = 0;
        getAid = 1;
        AlternateContactlessPaymentDataJson();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a((byte) (7 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), "\u0014\u0018\u0003\u0016\u0014\u0000\b\u0016\u0006\u000b\u0016\n\t\u000e\u0004\u000b\u0013\u0007\u0000\u0006\u0003\u0002\u0018\u0007\u0015\u0007㗝", 27 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr);
        com.payair.hce.getCardProfile getcardprofile = new com.payair.hce.getCardProfile(((java.lang.String) objArr[0]).intern(), 0);
        DigitizedCardProfile = getcardprofile;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a((byte) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), "\u0016\n\u000f\u0018\b\u0017\u0004\u0015\u0016\u0003\u0014\u0012\u0016\u0005\u0015\u0003\u0005\u0015\u000e\u0002\u0006\u0004\f\u0013㗞", android.os.Process.getGidForName("") + 26, objArr2);
        AlternateContactlessPaymentDataJson = new com.payair.hce.getCardProfile(((java.lang.String) objArr2[0]).intern(), 1);
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a((byte) (android.graphics.Color.rgb(0, 0, 0) + 16777294), "\u0016\n\u000f\u0018\b\u0017\u0004\u0015\u0016\u0003\u0014\u0012\u0016\u0005\u0015\u0003\u0014\u0000\u0004\u0007\u0007\u000f\u0004\u000b\u0013\u0007", android.text.TextUtils.getOffsetBefore("", 0) + 26, objArr3);
        com.payair.hce.getCardProfile getcardprofile2 = new com.payair.hce.getCardProfile(((java.lang.String) objArr3[0]).intern(), 2);
        values = getcardprofile2;
        valueOf = new com.payair.hce.getCardProfile[]{getcardprofile, AlternateContactlessPaymentDataJson, getcardprofile2};
        getAid = (SdkCoreAlternateContactlessPaymentDataImpl + 91) % 128;
    }

    private static void a(byte b, java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2;
        $10 = ($11 + 47) % 128;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.DigitizedCardJson12 digitizedCardJson12 = new com.payair.hce.DigitizedCardJson12();
        char[] cArr = writeReplace;
        float f = 0.0f;
        int i3 = 7;
        if (cArr != null) {
            $10 = ($11 + 75) % 128;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                $11 = ($10 + i3) % 128;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i4])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMaxVolume() > f ? 1 : (android.media.AudioTrack.getMaxVolume() == f ? 0 : -1)) + 48, (android.media.AudioTrack.getMaxVolume() > f ? 1 : (android.media.AudioTrack.getMaxVolume() == f ? 0 : -1)) + 2507, (char) (6802 - (android.os.Process.myTid() >> 22)));
                        byte b2 = (byte) ($$a[0] - 1);
                        byte b3 = b2;
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b(b2, b3, b3, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj);
                    }
                    cArr2[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i4++;
                    f = 0.0f;
                    i3 = 7;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(IccPrivateKeyCrtComponentsJson)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
        if (obj2 == null) {
            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), 2508 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (char) (android.text.TextUtils.getOffsetAfter("", 0) + 6802));
            byte b4 = (byte) ($$a[0] - 1);
            byte b5 = b4;
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            b(b4, b5, b5, objArr5);
            obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj2);
        }
        char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr3[i2] = (char) (charArray[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            $10 = ($11 + 21) % 128;
            digitizedCardJson12.values = 0;
            while (digitizedCardJson12.values < i2) {
                $11 = ($10 + 103) % 128;
                digitizedCardJson12.valueOf = charArray[digitizedCardJson12.values];
                digitizedCardJson12.writeReplace = charArray[digitizedCardJson12.values + 1];
                if (digitizedCardJson12.valueOf == digitizedCardJson12.writeReplace) {
                    cArr3[digitizedCardJson12.values] = (char) (digitizedCardJson12.valueOf - b);
                    cArr3[digitizedCardJson12.values + 1] = (char) (digitizedCardJson12.writeReplace - b);
                } else {
                    java.lang.Object[] objArr6 = {digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1553139325);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - android.view.View.combineMeasuredStates(0, 0), 3596 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24))).getMethod(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1553139325, obj3);
                    }
                    if (((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).intValue() == digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl) {
                        $10 = ($11 + 67) % 128;
                        java.lang.Object[] objArr7 = {digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12};
                        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(737480198);
                        if (obj4 == null) {
                            java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2664, (char) (18889 - android.graphics.Color.red(0)));
                            byte b6 = $$a[0];
                            byte b7 = (byte) (b6 - 1);
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            b(b6, b7, b7, objArr8);
                            obj4 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(737480198, obj4);
                        }
                        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).intValue();
                        int i5 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i6 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        cArr3[digitizedCardJson12.values] = cArr[intValue];
                        cArr3[digitizedCardJson12.values + 1] = cArr[(i5 * charValue) + i6];
                    } else if (digitizedCardJson12.DigitizedCardProfile == digitizedCardJson12.AlternateContactlessPaymentDataJson) {
                        digitizedCardJson12.RecordsJson = ((digitizedCardJson12.RecordsJson + charValue) - 1) % charValue;
                        digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl = ((digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl + charValue) - 1) % charValue;
                        int i7 = digitizedCardJson12.DigitizedCardProfile;
                        int i8 = digitizedCardJson12.RecordsJson;
                        int i9 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i10 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        cArr3[digitizedCardJson12.values] = cArr[(i7 * charValue) + i8];
                        cArr3[digitizedCardJson12.values + 1] = cArr[(i9 * charValue) + i10];
                    } else {
                        int i11 = digitizedCardJson12.DigitizedCardProfile;
                        int i12 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        int i13 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i14 = digitizedCardJson12.RecordsJson;
                        cArr3[digitizedCardJson12.values] = cArr[(i11 * charValue) + i12];
                        cArr3[digitizedCardJson12.values + 1] = cArr[(i13 * charValue) + i14];
                    }
                }
                digitizedCardJson12.values += 2;
            }
        }
        for (int i15 = 0; i15 < i; i15++) {
            cArr3[i15] = (char) (cArr3[i15] ^ 13722);
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static void AlternateContactlessPaymentDataJson() {
        writeReplace = new char[]{1493, 12309, 12292, 12307, 12291, 12293, 12316, 12318, 1491, 12302, 1490, 1495, 12294, 1492, 12319, 12312, 1489, 12295, 12313, 12317, 12299, 1494, 12297, 12303, 12301};
        IccPrivateKeyCrtComponentsJson = (char) 1493;
    }

    static void init$0() {
        $$a = new byte[]{1, 58, com.google.common.base.Ascii.FF, Byte.MIN_VALUE};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE;
    }
}
