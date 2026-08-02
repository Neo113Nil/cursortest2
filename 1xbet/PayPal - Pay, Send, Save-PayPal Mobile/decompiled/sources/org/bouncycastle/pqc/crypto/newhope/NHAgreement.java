package org.bouncycastle.pqc.crypto.newhope;

/* loaded from: classes17.dex */
public class NHAgreement {
    private org.bouncycastle.pqc.crypto.newhope.NHPrivateKeyParameters getHighResolutionOutputSizeshNQ4ISI;

    public void init(org.bouncycastle.crypto.CipherParameters cipherParameters) {
        this.getHighResolutionOutputSizeshNQ4ISI = (org.bouncycastle.pqc.crypto.newhope.NHPrivateKeyParameters) cipherParameters;
    }

    public byte[] calculateAgreement(org.bouncycastle.crypto.CipherParameters cipherParameters) {
        byte[] bArr = new byte[32];
        org.bouncycastle.pqc.crypto.newhope.NewHope.getHighSpeedVideoFpsRangesFor(bArr, this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor, ((org.bouncycastle.pqc.crypto.newhope.NHPublicKeyParameters) cipherParameters).Camera2StreamConfigurationMap);
        return bArr;
    }
}
