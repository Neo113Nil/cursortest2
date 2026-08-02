package org.bouncycastle.cert.dane;

/* loaded from: classes17.dex */
public class TruncatingDigestCalculator implements org.bouncycastle.operator.DigestCalculator {
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.operator.DigestCalculator getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.operator.DigestCalculator
    public java.io.OutputStream getOutputStream() {
        return this.getHighSpeedVideoFpsRangesFor.getOutputStream();
    }

    @Override // org.bouncycastle.operator.DigestCalculator
    public byte[] getDigest() {
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        byte[] bArr = new byte[i];
        java.lang.System.arraycopy(this.getHighSpeedVideoFpsRangesFor.getDigest(), 0, bArr, 0, i);
        return bArr;
    }

    @Override // org.bouncycastle.operator.DigestCalculator
    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithmIdentifier() {
        return this.getHighSpeedVideoFpsRangesFor.getAlgorithmIdentifier();
    }

    public TruncatingDigestCalculator(org.bouncycastle.operator.DigestCalculator digestCalculator, int i) {
        this.getHighSpeedVideoFpsRangesFor = digestCalculator;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    public TruncatingDigestCalculator(org.bouncycastle.operator.DigestCalculator digestCalculator) {
        this(digestCalculator, 28);
    }
}
