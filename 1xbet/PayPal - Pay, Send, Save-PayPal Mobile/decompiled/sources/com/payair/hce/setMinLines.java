package com.payair.hce;

/* loaded from: classes4.dex */
public final class setMinLines extends com.payair.hce.setEms {
    private static int DigitizedCardProfile = 0;
    private static int values = 1;
    private byte[] valueOf;

    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4;
        int i5 = ~i2;
        int i6 = ~((~i3) | i | i2);
        int i7 = (i * 471) + (i2 * 471) + ((i2 | i) * (-470)) + (((~((~i) | i5)) | (~(i5 | i3)) | i6) * (-470)) + (((~(i | i5 | i3)) | i6) * 470);
        if (i7 == 1) {
            return values(objArr);
        }
        if (i7 == 2) {
            return valueOf(objArr);
        }
        if (i7 == 3) {
            return writeReplace(objArr);
        }
        if (i7 == 4) {
            com.payair.hce.setMinLines setminlines = (com.payair.hce.setMinLines) objArr[0];
            com.payair.hce.setMaxLines setmaxlines = (com.payair.hce.setMaxLines) objArr[1];
            int i8 = DigitizedCardProfile;
            int i9 = i8 & 99;
            int i10 = (i8 | 99) & (~i9);
            int i11 = -(-(i9 << 1));
            int i12 = (i10 & i11) + (i11 | i10);
            values = i12 % 128;
            if (i12 % 2 == 0) {
                setmaxlines.AlternateContactlessPaymentDataJson(37, setminlines.valueOf);
            } else {
                setmaxlines.AlternateContactlessPaymentDataJson(24, setminlines.valueOf);
            }
            int i13 = DigitizedCardProfile;
            values = ((i13 & 37) + (i13 | 37)) % 128;
            return null;
        }
        com.payair.hce.setMinLines setminlines2 = (com.payair.hce.setMinLines) objArr[0];
        int i14 = values;
        int i15 = (((i14 | 105) << 1) - (~(-((i14 & (-106)) | ((~i14) & 105))))) - 1;
        DigitizedCardProfile = i15 % 128;
        if (i15 % 2 != 0) {
            int length = setminlines2.valueOf.length;
            i4 = 0 % length;
        } else {
            int length2 = setminlines2.valueOf.length;
            int intValue = ((java.lang.Integer) com.payair.hce.setNavigationIcon.DigitizedCardProfile(new java.lang.Object[]{java.lang.Integer.valueOf(length2)}, -1174070258, 1174070259, length2)).intValue();
            i4 = (((((intValue | 1) << 1) - (~(-(((~intValue) & 1) | (intValue & (-2)))))) - 1) - (~(-(-length2)))) - 1;
        }
        int i16 = DigitizedCardProfile;
        values = ((((i16 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE) << 1) - (i16 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE)) - 1) % 128;
        return java.lang.Integer.valueOf(i4);
    }

    setMinLines(byte[] bArr) {
        this.valueOf = bArr;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        int i = values;
        int i2 = i ^ 19;
        int i3 = ((i & 19) | i2) << 1;
        int i4 = -i2;
        int i5 = (((i3 | i4) << 1) - (i3 ^ i4)) % 128;
        DigitizedCardProfile = i5;
        int i6 = ((i5 ^ 118) + ((i5 & 118) << 1)) - 1;
        values = i6 % 128;
        if (i6 % 2 != 0) {
            return java.lang.Boolean.FALSE;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setMinLines setminlines = (com.payair.hce.setMinLines) objArr[0];
        com.payair.hce.setEms setems = (com.payair.hce.setEms) objArr[1];
        int i = values;
        int i2 = (i & 25) + (i | 25);
        DigitizedCardProfile = i2 % 128;
        if (i2 % 2 == 0) {
            if (setems instanceof com.payair.hce.setMinLines) {
                boolean AlternateContactlessPaymentDataJson = com.payair.hce.getClientVersion.AlternateContactlessPaymentDataJson(setminlines.valueOf, ((com.payair.hce.setMinLines) setems).valueOf);
                int i3 = DigitizedCardProfile;
                int i4 = (i3 ^ 31) + ((i3 & 31) << 1);
                values = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
                return java.lang.Boolean.valueOf(AlternateContactlessPaymentDataJson);
            }
            return java.lang.Boolean.FALSE;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setMinLines setminlines = (com.payair.hce.setMinLines) objArr[0];
        int i = values;
        DigitizedCardProfile = ((i & 91) + (i | 91)) % 128;
        int AlternateContactlessPaymentDataJson = com.payair.hce.getClientVersion.AlternateContactlessPaymentDataJson(setminlines.valueOf);
        int i2 = DigitizedCardProfile;
        int i3 = i2 & 19;
        int i4 = (i3 - (~(-(-((i2 ^ 19) | i3))))) - 1;
        values = i4 % 128;
        if (i4 % 2 != 0) {
            return java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson);
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.setGravity
    public final int hashCode() {
        return ((java.lang.Integer) values(new java.lang.Object[]{this}, 1765073885, -1765073883, java.lang.System.identityHashCode(this))).intValue();
    }

    @Override // com.payair.hce.setEms
    final boolean AlternateContactlessPaymentDataJson(com.payair.hce.setEms setems) {
        return ((java.lang.Boolean) values(new java.lang.Object[]{this, setems}, -453591009, 453591012, java.lang.System.identityHashCode(this))).booleanValue();
    }

    @Override // com.payair.hce.setEms
    final void values(com.payair.hce.setMaxLines setmaxlines) throws java.io.IOException {
        values(new java.lang.Object[]{this, setmaxlines}, -202500115, 202500119, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.setEms
    final int AlternateContactlessPaymentDataJson() {
        return ((java.lang.Integer) values(new java.lang.Object[]{this}, 163880675, -163880675, java.lang.System.identityHashCode(this))).intValue();
    }

    @Override // com.payair.hce.setEms
    final boolean writeReplace() {
        return ((java.lang.Boolean) values(new java.lang.Object[]{this}, -1784221923, 1784221924, java.lang.System.identityHashCode(this))).booleanValue();
    }
}
