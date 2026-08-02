package org.bouncycastle.pqc.crypto.gmss;

/* loaded from: classes17.dex */
public class GMSSPublicKeyParameters extends org.bouncycastle.pqc.crypto.gmss.GMSSKeyParameters {
    private byte[] getHighResolutionOutputSizeshNQ4ISI;

    public byte[] getPublicKey() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public GMSSPublicKeyParameters(byte[] bArr, org.bouncycastle.pqc.crypto.gmss.GMSSParameters gMSSParameters) {
        super(false, gMSSParameters);
        this.getHighResolutionOutputSizeshNQ4ISI = bArr;
    }
}
