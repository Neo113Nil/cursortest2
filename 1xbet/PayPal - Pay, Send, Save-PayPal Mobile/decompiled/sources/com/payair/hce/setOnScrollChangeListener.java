package com.payair.hce;

/* loaded from: classes4.dex */
public final class setOnScrollChangeListener {
    private static int AlternateContactlessPaymentDataJson = 0;
    private static int SdkCoreAlternateContactlessPaymentDataImpl = 1;
    private final java.lang.String DigitizedCardProfile;
    private final byte[] valueOf;
    private final long values;
    private final long writeReplace;

    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~((~i) | i2);
        int i5 = ~i2;
        int i6 = ~(i | i5);
        int i7 = (i * (-523)) + (i2 * 263) + ((i4 | i6 | (~(i5 | i3))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE) + (i6 * (-786)) + (((~((~i3) | i5)) | i4 | i6) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE);
        if (i7 == 1) {
            return AlternateContactlessPaymentDataJson(objArr);
        }
        if (i7 != 2) {
            return i7 != 3 ? values(objArr) : valueOf(objArr);
        }
        com.payair.hce.setOnScrollChangeListener setonscrollchangelistener = (com.payair.hce.setOnScrollChangeListener) objArr[0];
        int i8 = AlternateContactlessPaymentDataJson;
        int i9 = (i8 | 73) << 1;
        SdkCoreAlternateContactlessPaymentDataImpl = (i9 - (i8 ^ 73)) % 128;
        long j = setonscrollchangelistener.writeReplace;
        SdkCoreAlternateContactlessPaymentDataImpl = (i9 - ((i8 & (-74)) | ((~i8) & 73))) % 128;
        return java.lang.Long.valueOf(j);
    }

    public setOnScrollChangeListener(java.lang.String str, byte[] bArr, long j, long j2) {
        this.DigitizedCardProfile = str;
        this.valueOf = bArr;
        this.values = j;
        this.writeReplace = j2;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setOnScrollChangeListener setonscrollchangelistener = (com.payair.hce.setOnScrollChangeListener) objArr[0];
        int i = AlternateContactlessPaymentDataJson;
        int i2 = i & 15;
        int i3 = (i ^ 15) | i2;
        int i4 = ((i2 & i3) + (i3 | i2)) % 128;
        SdkCoreAlternateContactlessPaymentDataImpl = i4;
        byte[] bArr = setonscrollchangelistener.valueOf;
        int i5 = i4 + 49;
        AlternateContactlessPaymentDataJson = i5 % 128;
        if (i5 % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setOnScrollChangeListener setonscrollchangelistener = (com.payair.hce.setOnScrollChangeListener) objArr[0];
        int i = SdkCoreAlternateContactlessPaymentDataImpl;
        int i2 = i & 23;
        int i3 = -(-((i ^ 23) | i2));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        int i5 = i4 % 128;
        AlternateContactlessPaymentDataJson = i5;
        java.lang.String str = setonscrollchangelistener.DigitizedCardProfile;
        if (i4 % 2 != 0) {
            throw null;
        }
        SdkCoreAlternateContactlessPaymentDataImpl = (i5 + 55) % 128;
        return str;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setOnScrollChangeListener setonscrollchangelistener = (com.payair.hce.setOnScrollChangeListener) objArr[0];
        int i = AlternateContactlessPaymentDataJson;
        int i2 = (i & (-50)) | ((~i) & 49);
        int i3 = -(-((i & 49) << 1));
        SdkCoreAlternateContactlessPaymentDataImpl = ((i2 & i3) + (i2 | i3)) % 128;
        long j = setonscrollchangelistener.values;
        int i4 = i + 45;
        SdkCoreAlternateContactlessPaymentDataImpl = i4 % 128;
        if (i4 % 2 != 0) {
            return java.lang.Long.valueOf(j);
        }
        throw null;
    }

    public final long writeReplace() {
        return ((java.lang.Long) values(new java.lang.Object[]{this}, 542292993, -542292991, java.lang.System.identityHashCode(this))).longValue();
    }

    public final long valueOf() {
        return ((java.lang.Long) values(new java.lang.Object[]{this}, 1490473312, -1490473309, java.lang.System.identityHashCode(this))).longValue();
    }

    public final java.lang.String DigitizedCardProfile() {
        return (java.lang.String) values(new java.lang.Object[]{this}, -1445857330, 1445857331, java.lang.System.identityHashCode(this));
    }

    public final byte[] AlternateContactlessPaymentDataJson() {
        return (byte[]) values(new java.lang.Object[]{this}, -121646331, 121646331, java.lang.System.identityHashCode(this));
    }
}
