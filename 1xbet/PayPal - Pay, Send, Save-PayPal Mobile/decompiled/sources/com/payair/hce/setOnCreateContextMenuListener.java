package com.payair.hce;

/* loaded from: classes4.dex */
public final class setOnCreateContextMenuListener {
    private static int getCvrMaskAnd = 0;
    private static int getPaymentFci = 1;
    private final byte[] AlternateContactlessPaymentDataJson;
    private final byte[] DigitizedCardProfile;
    private final byte[] IccPrivateKeyCrtComponentsJson;
    private final byte[] RecordsJson;
    private final byte[] SdkCoreAlternateContactlessPaymentDataImpl;
    private final java.lang.String getAid;
    private final byte[] getProfileVersion;
    private final java.lang.String valueOf;
    private final byte[] values;
    private final byte[] writeReplace;

    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i2;
        int i6 = ~i3;
        switch ((i * (-209)) + (i2 * (-209)) + ((~(i4 | i5)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) + (((~(i5 | i6)) | (~(i4 | i3))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) + (((~(i | i5 | i3)) | (~(i2 | i4 | i6))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE)) {
            case 1:
                return DigitizedCardProfile(objArr);
            case 2:
                com.payair.hce.setOnCreateContextMenuListener setoncreatecontextmenulistener = (com.payair.hce.setOnCreateContextMenuListener) objArr[0];
                int i7 = getPaymentFci;
                getCvrMaskAnd = (((i7 & 35) - (~(-(-(i7 | 35))))) - 1) % 128;
                byte[] bArr = setoncreatecontextmenulistener.getProfileVersion;
                int i8 = i7 & 61;
                getCvrMaskAnd = (i8 + ((i7 ^ 61) | i8)) % 128;
                return bArr;
            case 3:
                com.payair.hce.setOnCreateContextMenuListener setoncreatecontextmenulistener2 = (com.payair.hce.setOnCreateContextMenuListener) objArr[0];
                int i9 = getCvrMaskAnd;
                int i10 = i9 & 103;
                int i11 = ((i9 ^ 103) | i10) << 1;
                int i12 = -((~i10) & (i9 | 103));
                getPaymentFci = ((i11 ^ i12) + ((i12 & i11) << 1)) % 128;
                byte[] bArr2 = setoncreatecontextmenulistener2.RecordsJson;
                int i13 = i9 & 121;
                int i14 = (i9 | 121) & (~i13);
                int i15 = -(-(i13 << 1));
                getPaymentFci = ((i14 ^ i15) + ((i14 & i15) << 1)) % 128;
                return bArr2;
            case 4:
                com.payair.hce.setOnCreateContextMenuListener setoncreatecontextmenulistener3 = (com.payair.hce.setOnCreateContextMenuListener) objArr[0];
                getPaymentFci = (getCvrMaskAnd + 25) % 128;
                java.lang.String str = setoncreatecontextmenulistener3.getAid;
                getCvrMaskAnd = ((((r7 & (-42)) | ((~r7) & 41)) - (~((r7 & 41) << 1))) - 1) % 128;
                return str;
            case 5:
                return valueOf(objArr);
            case 6:
                com.payair.hce.setOnCreateContextMenuListener setoncreatecontextmenulistener4 = (com.payair.hce.setOnCreateContextMenuListener) objArr[0];
                int i16 = getPaymentFci;
                int i17 = (i16 | 69) << 1;
                int i18 = -((i16 & (-70)) | ((~i16) & 69));
                getCvrMaskAnd = ((i17 & i18) + (i17 | i18)) % 128;
                byte[] bArr3 = setoncreatecontextmenulistener4.IccPrivateKeyCrtComponentsJson;
                getCvrMaskAnd = (i16 + 77) % 128;
                return bArr3;
            case 7:
                return writeReplace(objArr);
            case 8:
                return AlternateContactlessPaymentDataJson(objArr);
            default:
                return values(objArr);
        }
    }

    public setOnCreateContextMenuListener(java.lang.String str, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, byte[] bArr8, java.lang.String str2) {
        this.valueOf = str;
        this.DigitizedCardProfile = bArr;
        this.values = bArr2;
        this.AlternateContactlessPaymentDataJson = bArr3;
        this.writeReplace = bArr4;
        this.IccPrivateKeyCrtComponentsJson = bArr5;
        this.SdkCoreAlternateContactlessPaymentDataImpl = bArr6;
        this.RecordsJson = bArr7;
        this.getProfileVersion = bArr8;
        this.getAid = str2;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setOnCreateContextMenuListener setoncreatecontextmenulistener = (com.payair.hce.setOnCreateContextMenuListener) objArr[0];
        int i = getPaymentFci + 27;
        getCvrMaskAnd = i % 128;
        byte[] bArr = setoncreatecontextmenulistener.DigitizedCardProfile;
        if (i % 2 == 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setOnCreateContextMenuListener setoncreatecontextmenulistener = (com.payair.hce.setOnCreateContextMenuListener) objArr[0];
        int i = getCvrMaskAnd;
        int i2 = i ^ 57;
        int i3 = ((((i & 57) | i2) << 1) - i2) % 128;
        getPaymentFci = i3;
        byte[] bArr = setoncreatecontextmenulistener.values;
        int i4 = (i3 ^ 37) + ((i3 & 37) << 1);
        getCvrMaskAnd = i4 % 128;
        if (i4 % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setOnCreateContextMenuListener setoncreatecontextmenulistener = (com.payair.hce.setOnCreateContextMenuListener) objArr[0];
        int i = getCvrMaskAnd;
        getPaymentFci = (i + 47) % 128;
        byte[] bArr = setoncreatecontextmenulistener.AlternateContactlessPaymentDataJson;
        int i2 = i + 19;
        getPaymentFci = i2 % 128;
        if (i2 % 2 != 0) {
            return bArr;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setOnCreateContextMenuListener setoncreatecontextmenulistener = (com.payair.hce.setOnCreateContextMenuListener) objArr[0];
        int i = getPaymentFci + 21;
        getCvrMaskAnd = i % 128;
        byte[] bArr = setoncreatecontextmenulistener.writeReplace;
        if (i % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setOnCreateContextMenuListener setoncreatecontextmenulistener = (com.payair.hce.setOnCreateContextMenuListener) objArr[0];
        int i = (getCvrMaskAnd + 9) % 128;
        getPaymentFci = i;
        byte[] bArr = setoncreatecontextmenulistener.SdkCoreAlternateContactlessPaymentDataImpl;
        int i2 = (i & 3) + (i | 3);
        getCvrMaskAnd = i2 % 128;
        if (i2 % 2 == 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    public final java.lang.String IccPrivateKeyCrtComponentsJson() {
        return (java.lang.String) values(new java.lang.Object[]{this}, -834776117, 834776121, java.lang.System.identityHashCode(this));
    }

    public final byte[] getAid() {
        return (byte[]) values(new java.lang.Object[]{this}, -2049754334, 2049754336, java.lang.System.identityHashCode(this));
    }

    public final byte[] RecordsJson() {
        return (byte[]) values(new java.lang.Object[]{this}, -69563458, 69563461, java.lang.System.identityHashCode(this));
    }

    public final byte[] getProfileVersion() {
        return (byte[]) values(new java.lang.Object[]{this}, -1894327132, 1894327133, java.lang.System.identityHashCode(this));
    }

    public final byte[] writeReplace() {
        return (byte[]) values(new java.lang.Object[]{this}, -1921969491, 1921969497, java.lang.System.identityHashCode(this));
    }

    public final byte[] valueOf() {
        return (byte[]) values(new java.lang.Object[]{this}, -1926816427, 1926816434, java.lang.System.identityHashCode(this));
    }

    public final byte[] AlternateContactlessPaymentDataJson() {
        return (byte[]) values(new java.lang.Object[]{this}, 753723666, -753723658, java.lang.System.identityHashCode(this));
    }

    public final byte[] values() {
        return (byte[]) values(new java.lang.Object[]{this}, -283626984, 283626989, java.lang.System.identityHashCode(this));
    }

    public final byte[] DigitizedCardProfile() {
        return (byte[]) values(new java.lang.Object[]{this}, 423750585, -423750585, java.lang.System.identityHashCode(this));
    }
}
