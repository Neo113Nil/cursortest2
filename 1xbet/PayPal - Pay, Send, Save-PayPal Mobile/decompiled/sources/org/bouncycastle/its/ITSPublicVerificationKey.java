package org.bouncycastle.its;

/* loaded from: classes17.dex */
public class ITSPublicVerificationKey {
    protected final org.bouncycastle.oer.its.PublicVerificationKey verificationKey;

    public org.bouncycastle.oer.its.PublicVerificationKey toASN1Structure() {
        return this.verificationKey;
    }

    public ITSPublicVerificationKey(org.bouncycastle.oer.its.PublicVerificationKey publicVerificationKey) {
        this.verificationKey = publicVerificationKey;
    }
}
