package com.payair.hce;

/* loaded from: classes4.dex */
public final class setFadingEdgeLength extends java.lang.Enum<com.payair.hce.setFadingEdgeLength> {
    private static final /* synthetic */ int[] AlternateContactlessPaymentDataJson = {1, 2, 3};
    private static int DigitizedCardProfile = 93;
    public static final int valueOf = 2;
    private static int values = 0;
    public static final int writeReplace = 1;

    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        return values(objArr);
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        int i = values;
        int i2 = (i & (-124)) | ((~i) & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
        int i3 = (i & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        DigitizedCardProfile = i4 % 128;
        int i5 = i4 % 2;
        int[] iArr = (int[]) AlternateContactlessPaymentDataJson.clone();
        if (i5 != 0) {
            return iArr;
        }
        throw null;
    }

    public static int[] writeReplace() {
        return (int[]) values(new java.lang.Object[0], 923408680, -923408680, (int) java.lang.System.currentTimeMillis());
    }
}
