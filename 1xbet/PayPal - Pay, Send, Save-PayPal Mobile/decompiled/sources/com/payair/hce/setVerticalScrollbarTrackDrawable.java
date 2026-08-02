package com.payair.hce;

/* loaded from: classes4.dex */
public final class setVerticalScrollbarTrackDrawable {
    private static int RecordsJson = 1;
    private static int getProfileVersion;
    private byte[] AlternateContactlessPaymentDataJson;
    private java.lang.String DigitizedCardProfile;
    private java.lang.String IccPrivateKeyCrtComponentsJson;
    private java.lang.String valueOf;
    private int values;
    private int writeReplace;

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i3;
        int i6 = ~i2;
        int i7 = i4 | i6;
        switch ((i * 868) + (i2 * 868) + (((~(i4 | i5)) | (~(i6 | i5))) * (-867)) + (((~i7) | (~(i4 | i3)) | (~(i6 | i3))) * (-1734)) + (((~(i | i6 | i3)) | (~(i2 | i4 | i3)) | (~(i5 | i7))) * 867)) {
            case 1:
                com.payair.hce.setVerticalScrollbarTrackDrawable setverticalscrollbartrackdrawable = (com.payair.hce.setVerticalScrollbarTrackDrawable) objArr[0];
                int i8 = RecordsJson;
                getProfileVersion = (i8 + 65) % 128;
                int i9 = setverticalscrollbartrackdrawable.values;
                getProfileVersion = (i8 + 125) % 128;
                return java.lang.Integer.valueOf(i9);
            case 2:
                return writeReplace(objArr);
            case 3:
                com.payair.hce.setVerticalScrollbarTrackDrawable setverticalscrollbartrackdrawable2 = (com.payair.hce.setVerticalScrollbarTrackDrawable) objArr[0];
                int i10 = getProfileVersion;
                int i11 = i10 & 113;
                int i12 = (i11 + ((i10 ^ 113) | i11)) % 128;
                RecordsJson = i12;
                java.lang.String str = setverticalscrollbartrackdrawable2.DigitizedCardProfile;
                getProfileVersion = (i12 + 37) % 128;
                return str;
            case 4:
                return values(objArr);
            case 5:
                com.payair.hce.setVerticalScrollbarTrackDrawable setverticalscrollbartrackdrawable3 = (com.payair.hce.setVerticalScrollbarTrackDrawable) objArr[0];
                java.lang.String str2 = (java.lang.String) objArr[1];
                int i13 = getProfileVersion;
                int i14 = (i13 | 59) << 1;
                int i15 = -((i13 & (-60)) | ((~i13) & 59));
                int i16 = (((i14 | i15) << 1) - (i15 ^ i14)) % 128;
                RecordsJson = i16;
                setverticalscrollbartrackdrawable3.IccPrivateKeyCrtComponentsJson = str2;
                getProfileVersion = (i16 + 89) % 128;
                return null;
            case 6:
                return AlternateContactlessPaymentDataJson(objArr);
            case 7:
                return DigitizedCardProfile(objArr);
            case 8:
                return getProfileVersion(objArr);
            case 9:
                return IccPrivateKeyCrtComponentsJson(objArr);
            case 10:
                com.payair.hce.setVerticalScrollbarTrackDrawable setverticalscrollbartrackdrawable4 = (com.payair.hce.setVerticalScrollbarTrackDrawable) objArr[0];
                int i17 = RecordsJson + 82;
                int i18 = ((~i17) + (i17 << 1)) % 128;
                getProfileVersion = i18;
                java.lang.String str3 = setverticalscrollbartrackdrawable4.valueOf;
                RecordsJson = (((i18 | 71) << 1) - (i18 ^ 71)) % 128;
                return str3;
            case 11:
                com.payair.hce.setVerticalScrollbarTrackDrawable setverticalscrollbartrackdrawable5 = (com.payair.hce.setVerticalScrollbarTrackDrawable) objArr[0];
                int i19 = RecordsJson;
                int i20 = ((i19 ^ 29) | (i19 & 29)) << 1;
                int i21 = -((i19 & (-30)) | ((~i19) & 29));
                getProfileVersion = ((i20 ^ i21) + ((i20 & i21) << 1)) % 128;
                int i22 = setverticalscrollbartrackdrawable5.writeReplace;
                int i23 = i19 & 25;
                getProfileVersion = (i23 + ((i19 ^ 25) | i23)) % 128;
                return java.lang.Integer.valueOf(i22);
            default:
                return valueOf(objArr);
        }
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setVerticalScrollbarTrackDrawable setverticalscrollbartrackdrawable = (com.payair.hce.setVerticalScrollbarTrackDrawable) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = RecordsJson;
        int i2 = (i & (-68)) | ((~i) & 67);
        int i3 = -(-((i & 67) << 1));
        int i4 = ((i2 | i3) << 1) - (i2 ^ i3);
        getProfileVersion = i4 % 128;
        if (i4 % 2 == 0) {
            setverticalscrollbartrackdrawable.DigitizedCardProfile = str;
            getProfileVersion = (((i ^ 56) + ((i & 56) << 1)) - 1) % 128;
            return null;
        }
        setverticalscrollbartrackdrawable.DigitizedCardProfile = str;
        throw null;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setVerticalScrollbarTrackDrawable setverticalscrollbartrackdrawable = (com.payair.hce.setVerticalScrollbarTrackDrawable) objArr[0];
        int i = RecordsJson;
        int i2 = i & 75;
        int i3 = (i ^ 75) | i2;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        int i5 = i4 % 128;
        getProfileVersion = i5;
        byte[] bArr = setverticalscrollbartrackdrawable.AlternateContactlessPaymentDataJson;
        if (i4 % 2 != 0) {
            throw null;
        }
        int i6 = (i5 | 109) << 1;
        int i7 = -((i5 & androidx.media3.common.PlaybackException.ERROR_CODE_CONTENT_ALREADY_PLAYING) | ((~i5) & 109));
        RecordsJson = (((i6 | i7) << 1) - (i7 ^ i6)) % 128;
        return bArr;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setVerticalScrollbarTrackDrawable setverticalscrollbartrackdrawable = (com.payair.hce.setVerticalScrollbarTrackDrawable) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        int i = (getProfileVersion + 3) % 128;
        RecordsJson = i;
        setverticalscrollbartrackdrawable.AlternateContactlessPaymentDataJson = bArr;
        int i2 = (i ^ 77) + ((i & 77) << 1);
        getProfileVersion = i2 % 128;
        if (i2 % 2 == 0) {
            return null;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object getProfileVersion(java.lang.Object[] objArr) {
        com.payair.hce.setVerticalScrollbarTrackDrawable setverticalscrollbartrackdrawable = (com.payair.hce.setVerticalScrollbarTrackDrawable) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = RecordsJson;
        int i2 = i & 15;
        int i3 = (i2 - (~(-(-((i ^ 15) | i2))))) - 1;
        getProfileVersion = i3 % 128;
        if (i3 % 2 == 0) {
            setverticalscrollbartrackdrawable.valueOf = str;
            return null;
        }
        setverticalscrollbartrackdrawable.valueOf = str;
        throw null;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setVerticalScrollbarTrackDrawable setverticalscrollbartrackdrawable = (com.payair.hce.setVerticalScrollbarTrackDrawable) objArr[0];
        int intValue = ((java.lang.Number) objArr[1]).intValue();
        int i = getProfileVersion;
        int i2 = i & 35;
        int i3 = -(-((i ^ 35) | i2));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        int i5 = i4 % 128;
        RecordsJson = i5;
        if (i4 % 2 != 0) {
            setverticalscrollbartrackdrawable.values = intValue;
            int i6 = i5 | 95;
            int i7 = i6 << 1;
            int i8 = -(i6 & (~(i5 & 95)));
            getProfileVersion = ((i7 & i8) + (i8 | i7)) % 128;
            return null;
        }
        setverticalscrollbartrackdrawable.values = intValue;
        throw null;
    }

    private static /* synthetic */ java.lang.Object IccPrivateKeyCrtComponentsJson(java.lang.Object[] objArr) {
        com.payair.hce.setVerticalScrollbarTrackDrawable setverticalscrollbartrackdrawable = (com.payair.hce.setVerticalScrollbarTrackDrawable) objArr[0];
        int intValue = ((java.lang.Number) objArr[1]).intValue();
        int i = RecordsJson;
        int i2 = i & 7;
        int i3 = ((i ^ 7) | i2) << 1;
        int i4 = -((i | 7) & (~i2));
        int i5 = (i3 & i4) + (i4 | i3);
        int i6 = i5 % 128;
        getProfileVersion = i6;
        if (i5 % 2 == 0) {
            setverticalscrollbartrackdrawable.writeReplace = intValue;
            RecordsJson = (((i6 ^ 30) + ((i6 & 30) << 1)) - 1) % 128;
            return null;
        }
        setverticalscrollbartrackdrawable.writeReplace = intValue;
        throw null;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setVerticalScrollbarTrackDrawable setverticalscrollbartrackdrawable = (com.payair.hce.setVerticalScrollbarTrackDrawable) objArr[0];
        int i = RecordsJson;
        int i2 = (((i | 79) << 1) - (~(-((i & (-80)) | ((~i) & 79))))) - 1;
        int i3 = i2 % 128;
        getProfileVersion = i3;
        java.lang.String str = setverticalscrollbartrackdrawable.IccPrivateKeyCrtComponentsJson;
        if (i2 % 2 != 0) {
            throw null;
        }
        RecordsJson = ((-2) - (~((i3 & 46) + (i3 | 46)))) % 128;
        return str;
    }

    public final void values(java.lang.String str) {
        writeReplace(new java.lang.Object[]{this, str}, 423067722, -423067717, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String SdkCoreAlternateContactlessPaymentDataImpl() {
        return (java.lang.String) writeReplace(new java.lang.Object[]{this}, 576422058, -576422058, java.lang.System.identityHashCode(this));
    }

    public final void AlternateContactlessPaymentDataJson(int i) {
        writeReplace(new java.lang.Object[]{this, java.lang.Integer.valueOf(i)}, 1902543276, -1902543267, i);
    }

    public final int writeReplace() {
        return ((java.lang.Integer) writeReplace(new java.lang.Object[]{this}, -1875399274, 1875399285, java.lang.System.identityHashCode(this))).intValue();
    }

    public final void writeReplace(int i) {
        writeReplace(new java.lang.Object[]{this, java.lang.Integer.valueOf(i)}, -602606447, 602606453, i);
    }

    public final int DigitizedCardProfile() {
        return ((java.lang.Integer) writeReplace(new java.lang.Object[]{this}, 1785326060, -1785326059, java.lang.System.identityHashCode(this))).intValue();
    }

    public final void DigitizedCardProfile(java.lang.String str) {
        writeReplace(new java.lang.Object[]{this, str}, -1708549458, 1708549466, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String values() {
        return (java.lang.String) writeReplace(new java.lang.Object[]{this}, 1524141635, -1524141625, java.lang.System.identityHashCode(this));
    }

    public final void AlternateContactlessPaymentDataJson(byte[] bArr) {
        writeReplace(new java.lang.Object[]{this, bArr}, 90061512, -90061508, java.lang.System.identityHashCode(this));
    }

    public final byte[] valueOf() {
        return (byte[]) writeReplace(new java.lang.Object[]{this}, -166009349, 166009356, java.lang.System.identityHashCode(this));
    }

    public final void AlternateContactlessPaymentDataJson(java.lang.String str) {
        writeReplace(new java.lang.Object[]{this, str}, -747296564, 747296566, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String AlternateContactlessPaymentDataJson() {
        return (java.lang.String) writeReplace(new java.lang.Object[]{this}, -1941847074, 1941847077, java.lang.System.identityHashCode(this));
    }
}
