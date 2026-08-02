package com.mastercard.upgrade.profile;

/* loaded from: classes4.dex */
public final class IccPrivateKeyCrtComponents {
    private static int AlternateContactlessPaymentDataJson = 0;
    private static int writeReplace = 1;

    @com.payair.hce.setSelectionFromTop(valueOf = "dp")
    private com.payair.hce.isUiContext dp;

    @com.payair.hce.setSelectionFromTop(valueOf = "dq")
    private com.payair.hce.isUiContext dq;

    @com.payair.hce.setSelectionFromTop(valueOf = "p")
    private com.payair.hce.isUiContext p;

    @com.payair.hce.setSelectionFromTop(valueOf = "q")
    private com.payair.hce.isUiContext q;

    @com.payair.hce.setSelectionFromTop(valueOf = "u")
    private com.payair.hce.isUiContext u;

    public final com.payair.hce.isUiContext getP() {
        int i = AlternateContactlessPaymentDataJson;
        int i2 = (i & (-96)) | ((~i) & 95);
        int i3 = (i & 95) << 1;
        writeReplace = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        com.payair.hce.isUiContext isuicontext = this.p;
        AlternateContactlessPaymentDataJson = (((r2 & 21) - (~(r2 | 21))) - 1) % 128;
        return isuicontext;
    }

    public final void setP(com.payair.hce.isUiContext isuicontext) {
        int i = AlternateContactlessPaymentDataJson;
        int i2 = i + 111;
        writeReplace = i2 % 128;
        if (i2 % 2 != 0) {
            this.p = isuicontext;
            int i3 = i ^ 97;
            int i4 = ((i & 97) | i3) << 1;
            int i5 = -i3;
            writeReplace = (((i4 | i5) << 1) - (i5 ^ i4)) % 128;
            return;
        }
        this.p = isuicontext;
        throw null;
    }

    public final com.payair.hce.isUiContext getQ() {
        int i = writeReplace;
        int i2 = i ^ 33;
        int i3 = (i & 33) << 1;
        int i4 = (i2 & i3) + (i3 | i2);
        AlternateContactlessPaymentDataJson = i4 % 128;
        com.payair.hce.isUiContext isuicontext = this.q;
        if (i4 % 2 == 0) {
            return isuicontext;
        }
        throw new java.lang.ArithmeticException();
    }

    public final void setQ(com.payair.hce.isUiContext isuicontext) {
        int i = AlternateContactlessPaymentDataJson;
        int i2 = i & 91;
        int i3 = ((i ^ 91) | i2) << 1;
        int i4 = -((i | 91) & (~i2));
        int i5 = ((i3 ^ i4) + ((i4 & i3) << 1)) % 128;
        writeReplace = i5;
        this.q = isuicontext;
        int i6 = i5 & 5;
        int i7 = (i5 | 5) & (~i6);
        int i8 = i6 << 1;
        AlternateContactlessPaymentDataJson = (((i7 | i8) << 1) - (i8 ^ i7)) % 128;
    }

    public final com.payair.hce.isUiContext getDp() {
        int i = writeReplace;
        int i2 = i | 11;
        int i3 = i2 << 1;
        int i4 = -((~(i & 11)) & i2);
        int i5 = (((i3 | i4) << 1) - (i4 ^ i3)) % 128;
        AlternateContactlessPaymentDataJson = i5;
        com.payair.hce.isUiContext isuicontext = this.dp;
        int i6 = i5 & 57;
        writeReplace = (i6 + ((i5 ^ 57) | i6)) % 128;
        return isuicontext;
    }

    public final void setDp(com.payair.hce.isUiContext isuicontext) {
        int i = writeReplace;
        int i2 = (((i | 80) << 1) - (i ^ 80)) - 1;
        AlternateContactlessPaymentDataJson = i2 % 128;
        if (i2 % 2 == 0) {
            this.dp = isuicontext;
        } else {
            this.dp = isuicontext;
            throw null;
        }
    }

    public final com.payair.hce.isUiContext getDq() {
        int i = AlternateContactlessPaymentDataJson;
        int i2 = (i | 59) << 1;
        int i3 = -((i & (-60)) | ((~i) & 59));
        int i4 = (i2 & i3) + (i3 | i2);
        writeReplace = i4 % 128;
        if (i4 % 2 != 0) {
            return this.dq;
        }
        throw null;
    }

    public final void setDq(com.payair.hce.isUiContext isuicontext) {
        int i = AlternateContactlessPaymentDataJson;
        int i2 = i | 109;
        int i3 = ((i2 << 1) - (~(-(i2 & (~(i & 109)))))) - 1;
        writeReplace = i3 % 128;
        if (i3 % 2 != 0) {
            this.dq = isuicontext;
            int i4 = (-2) - (~(i + 90));
            writeReplace = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            return;
        }
        this.dq = isuicontext;
        throw null;
    }

    public final com.payair.hce.isUiContext getU() {
        int i = AlternateContactlessPaymentDataJson;
        int i2 = i & 63;
        writeReplace = ((((i ^ 63) | i2) << 1) - ((~i2) & (i | 63))) % 128;
        com.payair.hce.isUiContext isuicontext = this.u;
        int i3 = ((i ^ 43) | (i & 43)) << 1;
        int i4 = -((i & (-44)) | ((~i) & 43));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        writeReplace = i5 % 128;
        if (i5 % 2 != 0) {
            return isuicontext;
        }
        throw null;
    }

    public final void setU(com.payair.hce.isUiContext isuicontext) {
        int i = AlternateContactlessPaymentDataJson;
        int i2 = ((i ^ 117) | (i & 117)) << 1;
        int i3 = -((i & (-118)) | ((~i) & 117));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        writeReplace = i4 % 128;
        if (i4 % 2 != 0) {
            this.u = isuicontext;
            int identityHashCode = java.lang.System.identityHashCode(this);
            int i5 = ~identityHashCode;
            int i6 = ((~i5) & (-35308057)) | (35308056 & i5);
            int i7 = (-35308057) & i5;
            int i8 = -(-(((i6 ^ i7) | (i6 & i7)) * (-369)));
            int i9 = i8 ^ (-1420769662);
            int i10 = -(-((i8 & (-1420769662)) << 1));
            int i11 = (i5 | identityHashCode) & i5;
            int i12 = i11 & 654039837;
            int i13 = ~((i11 ^ 654039837) | i12);
            int i14 = i13 & 1021656551;
            int i15 = (i13 | 1021656551) & (~i14);
            int i16 = (((i9 ^ i10) + ((i10 & i9) << 1)) - (~(((i15 & i14) | (i15 ^ i14)) * (-369)))) - 1;
            int i17 = (identityHashCode & (-654039838)) | (i5 & (-654039838)) | (identityHashCode & 654039837);
            int i18 = ~i17;
            int i19 = (i17 | i18) & i18;
            int i20 = ((~i19) & 618731781) | ((-618731782) & i19);
            int i21 = i19 & 618731781;
            int i22 = (i21 ^ i20) | (i21 & i20);
            int i23 = (i11 & (-654039838)) | ((~i11) & 654039837);
            int i24 = (i23 ^ i12) | (i12 & i23);
            int i25 = i24 & 1021656551;
            int i26 = (i24 | 1021656551) & (~i25);
            int i27 = ~((i26 ^ i25) | (i26 & i25));
            int i28 = i22 & i27;
            int i29 = -(~(-(-((((i22 | i27) & (~i28)) | i28) * 369))));
            int identityHashCode2 = java.lang.System.identityHashCode(this);
            int i30 = identityHashCode2 & 1885084218;
            int i31 = (1885084218 | identityHashCode2) & (~i30);
            int i32 = (i31 ^ i30) | (i30 & i31);
            int i33 = ~i32;
            int i34 = (i32 | i33) & i33;
            int i35 = i34 & 69320961;
            int i36 = -(-((((i34 | 69320961) & (~i35)) | i35) * 992));
            int i37 = i36 ^ (-1034486832);
            int i38 = -(-((i36 & (-1034486832)) << 1));
            int i39 = (i37 & i38) + (i38 | i37);
            int i40 = ((~i33) & 69320961) | ((-69320962) & i33);
            int i41 = i33 & 69320961;
            int i42 = (i40 ^ i41) | (i41 & i40);
            int i43 = ~identityHashCode2;
            int i44 = i43 & (i43 | identityHashCode2);
            int i45 = i44 ^ (-1885084219);
            int i46 = i44 & (-1885084219);
            int i47 = (i46 ^ i45) | (i46 & i45);
            int i48 = i47 ^ 611698955;
            int i49 = i47 & 611698955;
            int i50 = ~((i49 ^ i48) | (i49 & i48));
            int i51 = i42 ^ i50;
            int i52 = i42 & i50;
            int i53 = -(-(((i52 ^ i51) | (i52 & i51)) * (-496)));
            int i54 = (identityHashCode2 | 611698955) & (~(identityHashCode2 & 611698955));
            if ((((i16 | i29) << 1) - (i29 ^ i16)) - 1 <= (((i39 & i53) + (i53 | i39)) - (~(((i54 ^ r2) | (i54 & r2)) * 496))) - 1) {
                throw new java.lang.ArithmeticException();
            }
            return;
        }
        this.u = isuicontext;
        throw null;
    }
}
