package org.bouncycastle.pqc.crypto.gmss;

/* loaded from: classes17.dex */
public class GMSSStateAwareSigner implements org.bouncycastle.pqc.crypto.StateAwareMessageSigner {
    private final org.bouncycastle.pqc.crypto.gmss.GMSSSigner Camera2StreamConfigurationMap;
    private org.bouncycastle.pqc.crypto.gmss.GMSSPrivateKeyParameters getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public boolean verifySignature(byte[] bArr, byte[] bArr2) {
        return this.Camera2StreamConfigurationMap.verifySignature(bArr, bArr2);
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        if (z) {
            this.getHighSpeedVideoFpsRangesFor = cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithRandom ? (org.bouncycastle.pqc.crypto.gmss.GMSSPrivateKeyParameters) ((org.bouncycastle.crypto.params.ParametersWithRandom) cipherParameters).getParameters() : (org.bouncycastle.pqc.crypto.gmss.GMSSPrivateKeyParameters) cipherParameters;
        }
        this.Camera2StreamConfigurationMap.init(z, cipherParameters);
    }

    @Override // org.bouncycastle.pqc.crypto.StateAwareMessageSigner
    public org.bouncycastle.crypto.params.AsymmetricKeyParameter getUpdatedPrivateKey() {
        org.bouncycastle.pqc.crypto.gmss.GMSSPrivateKeyParameters gMSSPrivateKeyParameters = this.getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoFpsRangesFor = null;
        return gMSSPrivateKeyParameters;
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public byte[] generateSignature(byte[] bArr) {
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            throw new java.lang.IllegalStateException("signing key no longer usable");
        }
        byte[] generateSignature = this.Camera2StreamConfigurationMap.generateSignature(bArr);
        this.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRangesFor.nextKey();
        return generateSignature;
    }

    public GMSSStateAwareSigner(org.bouncycastle.crypto.Digest digest) {
        if (!(digest instanceof org.bouncycastle.util.Memoable)) {
            throw new java.lang.IllegalArgumentException("digest must implement Memoable");
        }
        final org.bouncycastle.util.Memoable copy = ((org.bouncycastle.util.Memoable) digest).copy();
        this.Camera2StreamConfigurationMap = new org.bouncycastle.pqc.crypto.gmss.GMSSSigner(new org.bouncycastle.pqc.crypto.gmss.GMSSDigestProvider() { // from class: org.bouncycastle.pqc.crypto.gmss.GMSSStateAwareSigner.1
            @Override // org.bouncycastle.pqc.crypto.gmss.GMSSDigestProvider
            public org.bouncycastle.crypto.Digest get() {
                return (org.bouncycastle.crypto.Digest) copy.copy();
            }
        });
    }
}
