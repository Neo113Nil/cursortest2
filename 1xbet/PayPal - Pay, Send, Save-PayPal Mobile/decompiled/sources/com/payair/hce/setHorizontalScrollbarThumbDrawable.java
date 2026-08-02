package com.payair.hce;

/* loaded from: classes4.dex */
public final class setHorizontalScrollbarThumbDrawable {
    private static int AlternateContactlessPaymentDataJson = 1;
    private static int values;
    private byte[] DigitizedCardProfile;
    private java.lang.String valueOf;
    private java.lang.String writeReplace;

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = (~i3) | i;
        int i5 = (i * (-494)) + (i2 * (-494)) + ((~(i | i2)) * (-495)) + (i4 * 495) + (((~((~i) | (~i2))) | (~i4)) * 495);
        if (i5 == 1) {
            return values(objArr);
        }
        if (i5 == 2) {
            return valueOf(objArr);
        }
        if (i5 == 3) {
            return DigitizedCardProfile(objArr);
        }
        if (i5 == 4) {
            return writeReplace(objArr);
        }
        if (i5 == 5) {
            return AlternateContactlessPaymentDataJson(objArr);
        }
        com.payair.hce.setHorizontalScrollbarThumbDrawable sethorizontalscrollbarthumbdrawable = (com.payair.hce.setHorizontalScrollbarThumbDrawable) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i6 = AlternateContactlessPaymentDataJson;
        int i7 = ((i6 ^ 75) + ((i6 & 75) << 1)) % 128;
        values = i7;
        sethorizontalscrollbarthumbdrawable.valueOf = str;
        AlternateContactlessPaymentDataJson = (((i7 & 16) + (i7 | 16)) - 1) % 128;
        return null;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setHorizontalScrollbarThumbDrawable sethorizontalscrollbarthumbdrawable = (com.payair.hce.setHorizontalScrollbarThumbDrawable) objArr[0];
        int i = values + 101;
        AlternateContactlessPaymentDataJson = i % 128;
        java.lang.String str = sethorizontalscrollbarthumbdrawable.valueOf;
        if (i % 2 != 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setHorizontalScrollbarThumbDrawable sethorizontalscrollbarthumbdrawable = (com.payair.hce.setHorizontalScrollbarThumbDrawable) objArr[0];
        int i = AlternateContactlessPaymentDataJson;
        int i2 = i & 15;
        int i3 = (i ^ 15) | i2;
        int i4 = ((i2 | i3) << 1) - (i2 ^ i3);
        values = i4 % 128;
        byte[] bArr = sethorizontalscrollbarthumbdrawable.DigitizedCardProfile;
        if (i4 % 2 != 0) {
            throw null;
        }
        values = ((i & 1) + (i | 1)) % 128;
        return bArr;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setHorizontalScrollbarThumbDrawable sethorizontalscrollbarthumbdrawable = (com.payair.hce.setHorizontalScrollbarThumbDrawable) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        int i = AlternateContactlessPaymentDataJson;
        int i2 = i + 21;
        values = i2 % 128;
        if (i2 % 2 == 0) {
            sethorizontalscrollbarthumbdrawable.DigitizedCardProfile = bArr;
            int i3 = (i & (-94)) | ((~i) & 93);
            int i4 = -(-((i & 93) << 1));
            values = ((i3 ^ i4) + ((i3 & i4) << 1)) % 128;
            return null;
        }
        sethorizontalscrollbarthumbdrawable.DigitizedCardProfile = bArr;
        throw null;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setHorizontalScrollbarThumbDrawable sethorizontalscrollbarthumbdrawable = (com.payair.hce.setHorizontalScrollbarThumbDrawable) objArr[0];
        int i = values;
        int i2 = (((i & 1) - (~(-(-(i | 1))))) - 1) % 128;
        AlternateContactlessPaymentDataJson = i2;
        java.lang.String str = sethorizontalscrollbarthumbdrawable.writeReplace;
        int i3 = (i2 & 13) + (i2 | 13);
        values = i3 % 128;
        if (i3 % 2 == 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setHorizontalScrollbarThumbDrawable sethorizontalscrollbarthumbdrawable = (com.payair.hce.setHorizontalScrollbarThumbDrawable) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = values;
        int i2 = (i & 3) + (i | 3);
        AlternateContactlessPaymentDataJson = i2 % 128;
        if (i2 % 2 != 0) {
            sethorizontalscrollbarthumbdrawable.writeReplace = str;
            return null;
        }
        sethorizontalscrollbarthumbdrawable.writeReplace = str;
        throw null;
    }

    public final void DigitizedCardProfile(java.lang.String str) {
        valueOf(new java.lang.Object[]{this, str}, -200038049, 200038054, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String valueOf() {
        return (java.lang.String) valueOf(new java.lang.Object[]{this}, 1650003916, -1650003914, java.lang.System.identityHashCode(this));
    }

    public final void DigitizedCardProfile(byte[] bArr) {
        valueOf(new java.lang.Object[]{this, bArr}, 1448723979, -1448723975, java.lang.System.identityHashCode(this));
    }

    public final byte[] AlternateContactlessPaymentDataJson() {
        return (byte[]) valueOf(new java.lang.Object[]{this}, -826368076, 826368077, java.lang.System.identityHashCode(this));
    }

    public final void AlternateContactlessPaymentDataJson(java.lang.String str) {
        valueOf(new java.lang.Object[]{this, str}, -937420877, 937420877, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String writeReplace() {
        return (java.lang.String) valueOf(new java.lang.Object[]{this}, 877778180, -877778177, java.lang.System.identityHashCode(this));
    }
}
