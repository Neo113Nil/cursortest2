package com.payair.hce;

/* loaded from: classes4.dex */
public final class setVisibility extends com.payair.hce.setFitsSystemWindows {
    private static int DigitizedCardProfile = 0;
    private static int values = 1;

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i2;
        int i6 = ~i3;
        switch ((i * (-183)) + (i2 * 185) + ((i2 | i4) * (-368)) + ((i | i5 | i6) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) + (((~(i | i6)) | (~(i4 | i5)) | (~(i2 | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE)) {
            case 1:
                return writeReplace(objArr);
            case 2:
                return values(objArr);
            case 3:
                return valueOf(objArr);
            case 4:
                return DigitizedCardProfile(objArr);
            case 5:
                return AlternateContactlessPaymentDataJson(objArr);
            case 6:
                return RecordsJson(objArr);
            case 7:
                super.valueOf();
                int i7 = values;
                int i8 = ((i7 ^ 15) | (i7 & 15)) << 1;
                int i9 = -((i7 & (-16)) | ((~i7) & 15));
                DigitizedCardProfile = ((i8 & i9) + (i9 | i8)) % 128;
                return null;
            default:
                com.payair.hce.setVisibility setvisibility = (com.payair.hce.setVisibility) objArr[0];
                byte[] bArr = (byte[]) objArr[1];
                byte[] bArr2 = (byte[]) objArr[2];
                byte[] bArr3 = (byte[]) objArr[3];
                byte[] bArr4 = (byte[]) objArr[4];
                boolean booleanValue = ((java.lang.Boolean) objArr[5]).booleanValue();
                int i10 = values;
                int i11 = i10 ^ 19;
                int i12 = -(-((i10 & 19) << 1));
                DigitizedCardProfile = ((i11 ^ i12) + ((i12 & i11) << 1)) % 128;
                byte[] valueOf = super.valueOf(bArr, bArr2, bArr3, bArr4, booleanValue);
                int i13 = values;
                int i14 = i13 & 23;
                int i15 = (i13 ^ 23) | i14;
                DigitizedCardProfile = (((i14 | i15) << 1) - (i15 ^ i14)) % 128;
                return valueOf;
        }
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setVisibility setvisibility = (com.payair.hce.setVisibility) objArr[0];
        int i = DigitizedCardProfile;
        int i2 = i & 13;
        int i3 = (i | 13) & (~i2);
        int i4 = i2 << 1;
        values = ((i3 & i4) + (i3 | i4)) % 128;
        byte[] values2 = super.values();
        int i5 = values;
        int i6 = i5 & 45;
        int i7 = -(-((i5 ^ 45) | i6));
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        DigitizedCardProfile = i8 % 128;
        if (i8 % 2 == 0) {
            return values2;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object RecordsJson(java.lang.Object[] objArr) {
        com.payair.hce.setVisibility setvisibility = (com.payair.hce.setVisibility) objArr[0];
        int i = values;
        int i2 = (-2) - (~(((i | 46) << 1) - (i ^ 46)));
        DigitizedCardProfile = i2 % 128;
        if (i2 % 2 != 0) {
            super.writeReplace();
            throw null;
        }
        byte[] writeReplace = super.writeReplace();
        int i3 = values & 107;
        DigitizedCardProfile = (((((r0 ^ 107) | i3) << 1) - (~(-((r0 | 107) & (~i3))))) - 1) % 128;
        return writeReplace;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setVisibility setvisibility = (com.payair.hce.setVisibility) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        byte[] bArr2 = (byte[]) objArr[2];
        byte[] bArr3 = (byte[]) objArr[3];
        int i = values + 11;
        DigitizedCardProfile = i % 128;
        com.payair.hce.setOnCapturedPointerListener AlternateContactlessPaymentDataJson = super.AlternateContactlessPaymentDataJson(bArr, bArr2, bArr3);
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        int i2 = values;
        DigitizedCardProfile = ((((i2 ^ 23) | (i2 & 23)) << 1) - ((i2 & (-24)) | ((~i2) & 23))) % 128;
        return AlternateContactlessPaymentDataJson;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setVisibility setvisibility = (com.payair.hce.setVisibility) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        byte[] bArr2 = (byte[]) objArr[2];
        byte[] bArr3 = (byte[]) objArr[3];
        boolean booleanValue = ((java.lang.Boolean) objArr[4]).booleanValue();
        int i = values + 111;
        DigitizedCardProfile = i % 128;
        if (i % 2 != 0) {
            super.DigitizedCardProfile(bArr, bArr2, bArr3, booleanValue);
            throw null;
        }
        com.payair.hce.setOnCapturedPointerListener DigitizedCardProfile2 = super.DigitizedCardProfile(bArr, bArr2, bArr3, booleanValue);
        int i2 = DigitizedCardProfile;
        int i3 = i2 & 121;
        int i4 = -(-(i2 | 121));
        values = ((i3 & i4) + (i4 | i3)) % 128;
        return DigitizedCardProfile2;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setVisibility setvisibility = (com.payair.hce.setVisibility) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        byte[] bArr2 = (byte[]) objArr[2];
        byte[] bArr3 = (byte[]) objArr[3];
        byte[] bArr4 = (byte[]) objArr[4];
        int i = DigitizedCardProfile;
        values = (((i & 52) + (i | 52)) - 1) % 128;
        byte[] DigitizedCardProfile2 = super.DigitizedCardProfile(bArr, bArr2, bArr3, bArr4);
        int i2 = DigitizedCardProfile;
        int i3 = (i2 ^ 11) + ((i2 & 11) << 1);
        values = i3 % 128;
        if (i3 % 2 != 0) {
            return DigitizedCardProfile2;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setVisibility setvisibility = (com.payair.hce.setVisibility) objArr[0];
        int i = values + 67;
        DigitizedCardProfile = i % 128;
        super.AlternateContactlessPaymentDataJson();
        if (i % 2 != 0) {
            throw null;
        }
        int i2 = DigitizedCardProfile;
        int i3 = i2 ^ 47;
        int i4 = ((i2 & 47) | i3) << 1;
        int i5 = -i3;
        values = ((i4 & i5) + (i4 | i5)) % 128;
        return null;
    }

    @Override // com.payair.hce.setFitsSystemWindows
    protected final void AlternateContactlessPaymentDataJson() {
        valueOf(new java.lang.Object[]{this}, -1510559080, 1510559083, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.setFitsSystemWindows
    protected final byte[] valueOf(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, boolean z) {
        return (byte[]) valueOf(new java.lang.Object[]{this, bArr, bArr2, bArr3, bArr4, java.lang.Boolean.valueOf(z)}, -56418723, 56418723, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.setFitsSystemWindows
    public final byte[] DigitizedCardProfile(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        return (byte[]) valueOf(new java.lang.Object[]{this, bArr, bArr2, bArr3, bArr4}, -583983272, 583983277, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.setFitsSystemWindows
    public final com.payair.hce.setOnCapturedPointerListener DigitizedCardProfile(byte[] bArr, byte[] bArr2, byte[] bArr3, boolean z) {
        return (com.payair.hce.setOnCapturedPointerListener) valueOf(new java.lang.Object[]{this, bArr, bArr2, bArr3, java.lang.Boolean.valueOf(z)}, -134871939, 134871943, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.setFitsSystemWindows
    public final com.payair.hce.setOnCapturedPointerListener AlternateContactlessPaymentDataJson(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return (com.payair.hce.setOnCapturedPointerListener) valueOf(new java.lang.Object[]{this, bArr, bArr2, bArr3}, -238998381, 238998382, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.setFitsSystemWindows
    protected final byte[] writeReplace() {
        return (byte[]) valueOf(new java.lang.Object[]{this}, 824066850, -824066844, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.setFitsSystemWindows
    public final byte[] values() {
        return (byte[]) valueOf(new java.lang.Object[]{this}, 337510966, -337510964, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.setFitsSystemWindows
    public final void valueOf() {
        valueOf(new java.lang.Object[]{this}, 360203072, -360203065, java.lang.System.identityHashCode(this));
    }
}
