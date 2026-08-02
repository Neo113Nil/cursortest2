package com.payair.hce;

/* loaded from: classes4.dex */
public final class setMarqueeRepeatLimit extends com.payair.hce.setPaintFlags {
    public static final com.payair.hce.setMarqueeRepeatLimit AlternateContactlessPaymentDataJson = new com.payair.hce.setMarqueeRepeatLimit();
    private static final byte[] DigitizedCardProfile = new byte[0];
    private static int values = 0;
    private static int writeReplace = 1;

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i3;
        int i6 = (i * 784) + (i2 * (-782)) + ((~i2) * (-783)) + ((~(i4 | i5 | i2)) * (-783)) + (((~(i2 | i5)) | i4) * 783);
        if (i6 == 1) {
            int i7 = writeReplace;
            values = ((i7 & 61) + (i7 | 61)) % 128;
            return java.lang.Boolean.FALSE;
        }
        if (i6 == 2) {
            int i8 = writeReplace;
            int i9 = (i8 & (-114)) | ((~i8) & 113);
            int i10 = (i8 & 113) << 1;
            values = (((i9 | i10) << 1) - (i10 ^ i9)) % 128;
            return 2;
        }
        com.payair.hce.setMaxLines setmaxlines = (com.payair.hce.setMaxLines) objArr[1];
        int i11 = values;
        int i12 = i11 & 45;
        int i13 = -(-(i11 | 45));
        writeReplace = (((i12 | i13) << 1) - (i13 ^ i12)) % 128;
        setmaxlines.AlternateContactlessPaymentDataJson(5, DigitizedCardProfile);
        int i14 = writeReplace;
        values = (((i14 & (-124)) | ((~i14) & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE)) + ((i14 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1)) % 128;
        return null;
    }

    static {
        int i = values;
        int i2 = i & 31;
        int i3 = (i ^ 31) | i2;
        writeReplace = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
    }

    @Override // com.payair.hce.setPaintFlags, com.payair.hce.setEms
    final void values(com.payair.hce.setMaxLines setmaxlines) throws java.io.IOException {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, setmaxlines}, 41827459, -41827459, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.setEms
    final int AlternateContactlessPaymentDataJson() {
        return ((java.lang.Integer) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 590516903, -590516901, java.lang.System.identityHashCode(this))).intValue();
    }

    @Override // com.payair.hce.setEms
    final boolean writeReplace() {
        return ((java.lang.Boolean) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 1836188782, -1836188781, java.lang.System.identityHashCode(this))).booleanValue();
    }
}
