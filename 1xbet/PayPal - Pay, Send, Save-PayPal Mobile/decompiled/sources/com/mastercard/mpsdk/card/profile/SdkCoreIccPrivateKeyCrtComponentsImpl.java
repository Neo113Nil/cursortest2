package com.mastercard.mpsdk.card.profile;

/* loaded from: classes4.dex */
public class SdkCoreIccPrivateKeyCrtComponentsImpl implements com.payair.hce.createDisplayContext, java.io.Serializable {
    private static int AlternateContactlessPaymentDataJson = 1;
    private static final long serialVersionUID = 3223947988689463835L;
    private static int valueOf;
    private byte[] dp;
    private byte[] dq;
    private byte[] p;
    private byte[] q;
    private byte[] u;

    public SdkCoreIccPrivateKeyCrtComponentsImpl(com.payair.hce.createDisplayContext createdisplaycontext) {
        this.p = createdisplaycontext.getP();
        this.q = createdisplaycontext.getQ();
        this.u = createdisplaycontext.getU();
        this.dp = createdisplaycontext.getDp();
        this.dq = createdisplaycontext.getDq();
    }

    @Override // com.payair.hce.createDisplayContext
    public byte[] getP() {
        int i = AlternateContactlessPaymentDataJson;
        int i2 = i & 9;
        int i3 = -(-((i ^ 9) | i2));
        int i4 = (i2 & i3) + (i2 | i3);
        valueOf = i4 % 128;
        byte[] bArr = this.p;
        if (i4 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        int i5 = i & 49;
        int i6 = ((i ^ 49) | i5) << 1;
        int i7 = -((i | 49) & (~i5));
        valueOf = (((i6 | i7) << 1) - (i7 ^ i6)) % 128;
        return bArr;
    }

    @Override // com.payair.hce.createDisplayContext
    public byte[] getQ() {
        int i = valueOf + 57;
        AlternateContactlessPaymentDataJson = i % 128;
        byte[] bArr = this.q;
        if (i % 2 != 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.createDisplayContext
    public byte[] getDp() {
        int i = valueOf;
        int i2 = i & 21;
        int i3 = ((i ^ 21) | i2) << 1;
        int i4 = -((i | 21) & (~i2));
        int i5 = ((i3 ^ i4) + ((i4 & i3) << 1)) % 128;
        AlternateContactlessPaymentDataJson = i5;
        byte[] bArr = this.dp;
        valueOf = (i5 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        return bArr;
    }

    @Override // com.payair.hce.createDisplayContext
    public byte[] getDq() {
        int i = valueOf;
        int i2 = i & 97;
        AlternateContactlessPaymentDataJson = ((i2 - (~((i ^ 97) | i2))) - 1) % 128;
        byte[] bArr = this.dq;
        AlternateContactlessPaymentDataJson = ((i ^ 113) + ((i & 113) << 1)) % 128;
        return bArr;
    }

    @Override // com.payair.hce.createDisplayContext
    public byte[] getU() {
        int i = AlternateContactlessPaymentDataJson;
        valueOf = (((i & (-28)) | ((~i) & 27)) + ((i & 27) << 1)) % 128;
        byte[] bArr = this.u;
        int i2 = i & 19;
        int i3 = ((((i ^ 19) | i2) << 1) - (~(-((i | 19) & (~i2))))) - 1;
        valueOf = i3 % 128;
        if (i3 % 2 == 0) {
            return bArr;
        }
        throw null;
    }
}
