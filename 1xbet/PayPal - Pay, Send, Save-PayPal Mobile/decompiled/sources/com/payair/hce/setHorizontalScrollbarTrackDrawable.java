package com.payair.hce;

/* loaded from: classes4.dex */
public final class setHorizontalScrollbarTrackDrawable {
    private static int SdkCoreAlternateContactlessPaymentDataImpl = 1;
    private static int values;
    private java.lang.String AlternateContactlessPaymentDataJson;
    private java.lang.String DigitizedCardProfile;
    private java.lang.String valueOf;
    private byte[] writeReplace;

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i3;
        switch ((i * (-559)) + (i2 * 561) + ((~(i4 | i)) * (-560)) + ((~(i3 | (~i2) | i)) * (-560)) + (((~((~i) | i2)) | (~(i2 | i4))) * 560)) {
            case 1:
                return AlternateContactlessPaymentDataJson(objArr);
            case 2:
                return values(objArr);
            case 3:
                return writeReplace(objArr);
            case 4:
                return DigitizedCardProfile(objArr);
            case 5:
                return RecordsJson(objArr);
            case 6:
                com.payair.hce.setHorizontalScrollbarTrackDrawable sethorizontalscrollbartrackdrawable = (com.payair.hce.setHorizontalScrollbarTrackDrawable) objArr[0];
                int i5 = SdkCoreAlternateContactlessPaymentDataImpl;
                values = ((((i5 ^ 57) | (i5 & 57)) << 1) - ((i5 & (-58)) | ((~i5) & 57))) % 128;
                java.lang.String str = sethorizontalscrollbartrackdrawable.AlternateContactlessPaymentDataJson;
                int i6 = i5 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                int i7 = ((i5 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) | i6) << 1;
                int i8 = -((i5 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) & (~i6));
                values = (((i7 | i8) << 1) - (i8 ^ i7)) % 128;
                return str;
            case 7:
                ((com.payair.hce.setHorizontalScrollbarTrackDrawable) objArr[0]).valueOf = (java.lang.String) objArr[1];
                int i9 = values;
                int i10 = ((i9 ^ 27) | (i9 & 27)) << 1;
                int i11 = -((i9 & (-28)) | ((~i9) & 27));
                SdkCoreAlternateContactlessPaymentDataImpl = (((i10 | i11) << 1) - (i11 ^ i10)) % 128;
                return null;
            default:
                return valueOf(objArr);
        }
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setHorizontalScrollbarTrackDrawable sethorizontalscrollbartrackdrawable = (com.payair.hce.setHorizontalScrollbarTrackDrawable) objArr[0];
        int i = values;
        int i2 = ((i | 69) << 1) - (i ^ 69);
        SdkCoreAlternateContactlessPaymentDataImpl = i2 % 128;
        java.lang.String str = sethorizontalscrollbartrackdrawable.DigitizedCardProfile;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setHorizontalScrollbarTrackDrawable sethorizontalscrollbartrackdrawable = (com.payair.hce.setHorizontalScrollbarTrackDrawable) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = values;
        int i2 = i & 7;
        int i3 = (i2 - (~(-(-((i ^ 7) | i2))))) - 1;
        SdkCoreAlternateContactlessPaymentDataImpl = i3 % 128;
        if (i3 % 2 != 0) {
            sethorizontalscrollbartrackdrawable.DigitizedCardProfile = str;
            return null;
        }
        sethorizontalscrollbartrackdrawable.DigitizedCardProfile = str;
        throw null;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setHorizontalScrollbarTrackDrawable sethorizontalscrollbartrackdrawable = (com.payair.hce.setHorizontalScrollbarTrackDrawable) objArr[0];
        int i = values;
        int i2 = i & 25;
        int i3 = (i2 - (~((i ^ 25) | i2))) - 1;
        SdkCoreAlternateContactlessPaymentDataImpl = i3 % 128;
        java.lang.String str = sethorizontalscrollbartrackdrawable.valueOf;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = (i & (-80)) | ((~i) & 79);
        int i5 = -(-((i & 79) << 1));
        SdkCoreAlternateContactlessPaymentDataImpl = ((i4 ^ i5) + ((i5 & i4) << 1)) % 128;
        return str;
    }

    private static /* synthetic */ java.lang.Object RecordsJson(java.lang.Object[] objArr) {
        com.payair.hce.setHorizontalScrollbarTrackDrawable sethorizontalscrollbartrackdrawable = (com.payair.hce.setHorizontalScrollbarTrackDrawable) objArr[0];
        int i = values;
        SdkCoreAlternateContactlessPaymentDataImpl = (((i | 77) << 1) - (i ^ 77)) % 128;
        byte[] bArr = sethorizontalscrollbartrackdrawable.writeReplace;
        int i2 = i & 13;
        int i3 = ((i ^ 13) | i2) << 1;
        int i4 = -((i | 13) & (~i2));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        SdkCoreAlternateContactlessPaymentDataImpl = i5 % 128;
        if (i5 % 2 != 0) {
            return bArr;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setHorizontalScrollbarTrackDrawable sethorizontalscrollbartrackdrawable = (com.payair.hce.setHorizontalScrollbarTrackDrawable) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        int i = SdkCoreAlternateContactlessPaymentDataImpl;
        int i2 = i | 73;
        int i3 = i2 << 1;
        int i4 = -((~(i & 73)) & i2);
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = i5 % 128;
        values = i6;
        if (i5 % 2 == 0) {
            sethorizontalscrollbartrackdrawable.writeReplace = bArr;
            SdkCoreAlternateContactlessPaymentDataImpl = (((i6 | 3) << 1) - ((i6 & (-4)) | ((~i6) & 3))) % 128;
            return null;
        }
        sethorizontalscrollbartrackdrawable.writeReplace = bArr;
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setHorizontalScrollbarTrackDrawable sethorizontalscrollbartrackdrawable = (com.payair.hce.setHorizontalScrollbarTrackDrawable) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = SdkCoreAlternateContactlessPaymentDataImpl;
        int i2 = ((i ^ 103) | (i & 103)) << 1;
        int i3 = -((i & (-104)) | ((~i) & 103));
        int i4 = (i2 & i3) + (i2 | i3);
        values = i4 % 128;
        if (i4 % 2 == 0) {
            sethorizontalscrollbartrackdrawable.AlternateContactlessPaymentDataJson = str;
            int i5 = i + 73;
            values = i5 % 128;
            if (i5 % 2 == 0) {
                return null;
            }
            throw new java.lang.ArithmeticException();
        }
        sethorizontalscrollbartrackdrawable.AlternateContactlessPaymentDataJson = str;
        throw new java.lang.ArithmeticException();
    }

    public final void DigitizedCardProfile(java.lang.String str) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, str}, -1950013452, 1950013452, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String values() {
        return (java.lang.String) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 12770264, -12770258, java.lang.System.identityHashCode(this));
    }

    public final void writeReplace(byte[] bArr) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, bArr}, 1406095681, -1406095677, java.lang.System.identityHashCode(this));
    }

    public final byte[] writeReplace() {
        return (byte[]) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 839922222, -839922217, java.lang.System.identityHashCode(this));
    }

    public final void valueOf(java.lang.String str) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, str}, -2043115359, 2043115366, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String AlternateContactlessPaymentDataJson() {
        return (java.lang.String) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 33107195, -33107194, java.lang.System.identityHashCode(this));
    }

    public final void values(java.lang.String str) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, str}, -789567935, 789567937, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String valueOf() {
        return (java.lang.String) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 1204785699, -1204785696, java.lang.System.identityHashCode(this));
    }
}
