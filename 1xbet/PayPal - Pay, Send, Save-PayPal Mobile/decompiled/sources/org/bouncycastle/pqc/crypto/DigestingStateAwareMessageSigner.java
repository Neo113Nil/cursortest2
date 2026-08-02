package org.bouncycastle.pqc.crypto;

/* loaded from: classes17.dex */
public class DigestingStateAwareMessageSigner extends org.bouncycastle.pqc.crypto.DigestingMessageSigner {
    private final org.bouncycastle.pqc.crypto.StateAwareMessageSigner getHighSpeedVideoSizes;

    public org.bouncycastle.crypto.params.AsymmetricKeyParameter getUpdatedPrivateKey() {
        return this.getHighSpeedVideoSizes.getUpdatedPrivateKey();
    }

    public DigestingStateAwareMessageSigner(org.bouncycastle.pqc.crypto.StateAwareMessageSigner stateAwareMessageSigner, org.bouncycastle.crypto.Digest digest) {
        super(stateAwareMessageSigner, digest);
        this.getHighSpeedVideoSizes = stateAwareMessageSigner;
    }
}
