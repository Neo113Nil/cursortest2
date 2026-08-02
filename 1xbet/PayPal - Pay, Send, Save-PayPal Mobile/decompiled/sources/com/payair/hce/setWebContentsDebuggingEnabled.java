package com.payair.hce;

/* loaded from: classes10.dex */
public final class setWebContentsDebuggingEnabled extends com.payair.hce.getMagstripeCvmIssuerOptions<java.lang.String> {
    private static int DigitizedCardProfile = 0;
    private static int valueOf = 1;

    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i3;
        int i5 = ~i;
        int i6 = ~i2;
        int i7 = i5 | i6;
        int i8 = i6 | i4;
        int i9 = (i * 193) + (i2 * 193) + ((i4 | (~(i5 | i2))) * (-192)) + (((~i8) | (~i7)) * (-384)) + (((~(i | i8)) | (~(i3 | i7)) | (~(i2 | i | i3))) * 192);
        if (i9 == 1) {
            return writeReplace(objArr);
        }
        if (i9 == 2) {
            return valueOf(objArr);
        }
        if (i9 == 3) {
            com.payair.hce.getRemotePaymentData getremotepaymentdata = (com.payair.hce.getRemotePaymentData) objArr[1];
            java.lang.Object obj = objArr[2];
            int i10 = DigitizedCardProfile;
            int i11 = i10 & 53;
            int i12 = (i10 ^ 53) | i11;
            valueOf = ((i11 ^ i12) + ((i12 & i11) << 1)) % 128;
            values(new java.lang.Object[]{getremotepaymentdata, (java.lang.String) obj}, 1328686604, -1328686602, (int) java.lang.System.currentTimeMillis());
            valueOf = (DigitizedCardProfile + 65) % 128;
            return null;
        }
        com.payair.hce.getAckAutomaticallyResetByApplication getackautomaticallyresetbyapplication = (com.payair.hce.getAckAutomaticallyResetByApplication) objArr[0];
        int i13 = valueOf;
        int i14 = i13 & 15;
        int i15 = ((i13 ^ 15) | i14) << 1;
        int i16 = -((i13 | 15) & (~i14));
        DigitizedCardProfile = ((i15 ^ i16) + ((i16 & i15) << 1)) % 128;
        java.lang.String obj2 = com.payair.hce.getCardLayoutDescription.AlternateContactlessPaymentDataJson(getackautomaticallyresetbyapplication).values().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
        int i17 = DigitizedCardProfile;
        int i18 = i17 & 103;
        valueOf = (((((i17 ^ 103) | i18) << 1) - (~(-((i17 | 103) & (~i18))))) - 1) % 128;
        return obj2;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.getAckAutomaticallyResetByApplication getackautomaticallyresetbyapplication = (com.payair.hce.getAckAutomaticallyResetByApplication) objArr[1];
        int i = DigitizedCardProfile;
        int i2 = i & 43;
        int i3 = -(-(i | 43));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        valueOf = i4 % 128;
        java.lang.Object[] objArr2 = {getackautomaticallyresetbyapplication};
        if (i4 % 2 == 0) {
            throw null;
        }
        java.lang.String str = (java.lang.String) values(objArr2, -184280979, 184280979, (int) java.lang.System.currentTimeMillis());
        int i5 = valueOf;
        int i6 = (i5 & (-116)) | ((~i5) & 115);
        int i7 = -(-((i5 & 115) << 1));
        int i8 = (i6 & i7) + (i7 | i6);
        DigitizedCardProfile = i8 % 128;
        if (i8 % 2 == 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.getRemotePaymentData getremotepaymentdata = (com.payair.hce.getRemotePaymentData) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = valueOf;
        int i2 = i ^ 91;
        int i3 = -(-((i & 91) << 1));
        int i4 = ((i2 | i3) << 1) - (i2 ^ i3);
        DigitizedCardProfile = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        if (getremotepaymentdata != null) {
            getremotepaymentdata.AlternateContactlessPaymentDataJson(str);
            int i5 = valueOf;
            DigitizedCardProfile = (((i5 ^ 6) + ((i5 & 6) << 1)) - 1) % 128;
            return null;
        }
        int i6 = i & 69;
        int i7 = (~i6) & (i | 69);
        int i8 = i6 << 1;
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        DigitizedCardProfile = i9 % 128;
        if (i9 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.lang.String] */
    @Override // com.payair.hce.getMagstripeCvmIssuerOptions
    public final /* synthetic */ java.lang.String AlternateContactlessPaymentDataJson(com.payair.hce.getAckAutomaticallyResetByApplication getackautomaticallyresetbyapplication) {
        ?? values = values(new java.lang.Object[]{this, getackautomaticallyresetbyapplication}, -502454685, 502454686, java.lang.System.identityHashCode(this));
        return values;
    }

    @Override // com.payair.hce.getMagstripeCvmIssuerOptions
    public final /* synthetic */ void writeReplace(com.payair.hce.getRemotePaymentData getremotepaymentdata, java.lang.String str) {
        values(new java.lang.Object[]{this, getremotepaymentdata, str}, 1559815686, -1559815683, java.lang.System.identityHashCode(this));
    }

    private static java.lang.String writeReplace(com.payair.hce.getAckAutomaticallyResetByApplication getackautomaticallyresetbyapplication) {
        return (java.lang.String) values(new java.lang.Object[]{getackautomaticallyresetbyapplication}, -184280979, 184280979, (int) java.lang.System.currentTimeMillis());
    }

    private static void valueOf(com.payair.hce.getRemotePaymentData getremotepaymentdata, java.lang.String str) {
        values(new java.lang.Object[]{getremotepaymentdata, str}, 1328686604, -1328686602, (int) java.lang.System.currentTimeMillis());
    }
}
