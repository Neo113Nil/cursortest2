package com.payair.hce;

/* loaded from: classes4.dex */
public final class setTitleMarginEnd extends com.payair.hce.setEms {
    private static int DigitizedCardProfile = 0;
    private static int valueOf = 1;
    private final byte[] values;

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~((~i) | i2);
        int i5 = ~i2;
        int i6 = ~(i5 | i);
        switch ((i * 399) + (i2 * 399) + ((i4 | i6 | (~(i5 | i3))) * 398) + ((i | i2) * (-1194)) + (((~((~i3) | i5)) | i4 | i6) * 398)) {
            case 1:
                return DigitizedCardProfile(objArr);
            case 2:
                return values(objArr);
            case 3:
                com.payair.hce.setTitleMarginEnd settitlemarginend = (com.payair.hce.setTitleMarginEnd) objArr[0];
                com.payair.hce.setMaxLines setmaxlines = (com.payair.hce.setMaxLines) objArr[1];
                int i7 = valueOf;
                int i8 = i7 ^ 53;
                int i9 = ((i7 & 53) | i8) << 1;
                int i10 = -i8;
                DigitizedCardProfile = ((i9 ^ i10) + ((i9 & i10) << 1)) % 128;
                setmaxlines.AlternateContactlessPaymentDataJson(12, settitlemarginend.values);
                int i11 = valueOf;
                int i12 = i11 & 27;
                int i13 = -(-(i11 | 27));
                DigitizedCardProfile = ((i12 ^ i13) + ((i13 & i12) << 1)) % 128;
                return null;
            case 4:
                int i14 = DigitizedCardProfile;
                int i15 = i14 & 27;
                int i16 = ((i14 | 27) & (~i15)) + (i15 << 1);
                valueOf = i16 % 128;
                return java.lang.Boolean.valueOf(i16 % 2 == 0);
            case 5:
                return writeReplace(objArr);
            case 6:
                com.payair.hce.setTitleMarginEnd settitlemarginend2 = (com.payair.hce.setTitleMarginEnd) objArr[0];
                int i17 = DigitizedCardProfile;
                int i18 = ((i17 ^ 49) | (i17 & 49)) << 1;
                int i19 = -((i17 & (-50)) | ((~i17) & 49));
                valueOf = (((i18 | i19) << 1) - (i19 ^ i18)) % 128;
                java.lang.String str = (java.lang.String) writeReplace(new java.lang.Object[]{settitlemarginend2}, -1400460852, 1400460857, java.lang.System.identityHashCode(settitlemarginend2));
                valueOf = (DigitizedCardProfile + 95) % 128;
                return str;
            default:
                return AlternateContactlessPaymentDataJson(objArr);
        }
    }

    setTitleMarginEnd(byte[] bArr) {
        this.values = bArr;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setTitleMarginEnd settitlemarginend = (com.payair.hce.setTitleMarginEnd) objArr[0];
        int i = valueOf;
        int i2 = ((i | 109) << 1) - (i ^ 109);
        DigitizedCardProfile = i2 % 128;
        byte[] bArr = settitlemarginend.values;
        if (i2 % 2 == 0) {
            return com.payair.hce.isGooglePlayServicesUid.valueOf(bArr);
        }
        com.payair.hce.isGooglePlayServicesUid.valueOf(bArr);
        throw null;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setTitleMarginEnd settitlemarginend = (com.payair.hce.setTitleMarginEnd) objArr[0];
        int i = DigitizedCardProfile;
        valueOf = ((i & 23) + (i | 23)) % 128;
        int AlternateContactlessPaymentDataJson = com.payair.hce.getClientVersion.AlternateContactlessPaymentDataJson(settitlemarginend.values);
        int i2 = DigitizedCardProfile + 13;
        valueOf = i2 % 128;
        if (i2 % 2 != 0) {
            return java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson);
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setTitleMarginEnd settitlemarginend = (com.payair.hce.setTitleMarginEnd) objArr[0];
        com.payair.hce.setEms setems = (com.payair.hce.setEms) objArr[1];
        int i = (valueOf + 105) % 128;
        DigitizedCardProfile = i;
        if (setems instanceof com.payair.hce.setTitleMarginEnd) {
            boolean AlternateContactlessPaymentDataJson = com.payair.hce.getClientVersion.AlternateContactlessPaymentDataJson(settitlemarginend.values, ((com.payair.hce.setTitleMarginEnd) setems).values);
            int i2 = DigitizedCardProfile;
            valueOf = ((((i2 | 16) << 1) - (i2 ^ 16)) - 1) % 128;
            return java.lang.Boolean.valueOf(AlternateContactlessPaymentDataJson);
        }
        int i3 = i ^ 59;
        int i4 = (((((i & 59) | i3) << 1) - (~(-i3))) - 1) % 128;
        valueOf = i4;
        int i5 = i4 & 35;
        int i6 = (i4 | 35) & (~i5);
        int i7 = i5 << 1;
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        DigitizedCardProfile = i8 % 128;
        if (i8 % 2 == 0) {
            return java.lang.Boolean.FALSE;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        int i;
        com.payair.hce.setTitleMarginEnd settitlemarginend = (com.payair.hce.setTitleMarginEnd) objArr[0];
        int i2 = DigitizedCardProfile;
        int i3 = i2 & 35;
        int i4 = (i3 - (~((i2 ^ 35) | i3))) - 1;
        valueOf = i4 % 128;
        if (i4 % 2 == 0) {
            int length = settitlemarginend.values.length;
            int intValue = 1 << ((java.lang.Integer) com.payair.hce.setNavigationIcon.DigitizedCardProfile(new java.lang.Object[]{java.lang.Integer.valueOf(length)}, -1174070258, 1174070259, length)).intValue();
            int i5 = -(~settitlemarginend.values.length);
            i = ((intValue & i5) + (i5 | intValue)) - 1;
        } else {
            int length2 = settitlemarginend.values.length;
            int intValue2 = ((java.lang.Integer) com.payair.hce.setNavigationIcon.DigitizedCardProfile(new java.lang.Object[]{java.lang.Integer.valueOf(length2)}, -1174070258, 1174070259, length2)).intValue();
            int i6 = intValue2 & 1;
            int i7 = (intValue2 | 1) & (~i6);
            int i8 = i6 << 1;
            int i9 = (i7 & i8) + (i7 | i8);
            int length3 = settitlemarginend.values.length;
            i = (i9 ^ length3) + ((length3 & i9) << 1);
        }
        int i10 = valueOf;
        int i11 = ((i10 & 110) + (i10 | 110)) - 1;
        DigitizedCardProfile = i11 % 128;
        if (i11 % 2 == 0) {
            return java.lang.Integer.valueOf(i);
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.setEms
    final void values(com.payair.hce.setMaxLines setmaxlines) throws java.io.IOException {
        writeReplace(new java.lang.Object[]{this, setmaxlines}, 1783818741, -1783818738, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.setEms
    final int AlternateContactlessPaymentDataJson() throws java.io.IOException {
        return ((java.lang.Integer) writeReplace(new java.lang.Object[]{this}, 1651533966, -1651533965, java.lang.System.identityHashCode(this))).intValue();
    }

    @Override // com.payair.hce.setEms
    final boolean writeReplace() {
        return ((java.lang.Boolean) writeReplace(new java.lang.Object[]{this}, 841619075, -841619071, java.lang.System.identityHashCode(this))).booleanValue();
    }

    @Override // com.payair.hce.setEms
    final boolean AlternateContactlessPaymentDataJson(com.payair.hce.setEms setems) {
        return ((java.lang.Boolean) writeReplace(new java.lang.Object[]{this, setems}, -980386370, 980386370, java.lang.System.identityHashCode(this))).booleanValue();
    }

    @Override // com.payair.hce.setGravity
    public final int hashCode() {
        return ((java.lang.Integer) writeReplace(new java.lang.Object[]{this}, 1956690432, -1956690430, java.lang.System.identityHashCode(this))).intValue();
    }

    public final java.lang.String toString() {
        return (java.lang.String) writeReplace(new java.lang.Object[]{this}, -814933055, 814933061, java.lang.System.identityHashCode(this));
    }

    private java.lang.String valueOf() {
        return (java.lang.String) writeReplace(new java.lang.Object[]{this}, -1400460852, 1400460857, java.lang.System.identityHashCode(this));
    }
}
