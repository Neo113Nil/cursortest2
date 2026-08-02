package org.bouncycastle.operator.bc;

/* loaded from: classes17.dex */
public class BcDigestCalculatorProvider implements org.bouncycastle.operator.DigestCalculatorProvider {
    private org.bouncycastle.operator.bc.BcDigestProvider getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.operator.bc.BcDefaultDigestProvider.INSTANCE;

    class DigestOutputStream extends java.io.OutputStream {
        org.bouncycastle.crypto.Digest getHighSpeedVideoFpsRanges;

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws java.io.IOException {
            this.getHighSpeedVideoFpsRanges.update(bArr, i, i2);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws java.io.IOException {
            this.getHighSpeedVideoFpsRanges.update(bArr, 0, bArr.length);
        }

        @Override // java.io.OutputStream
        public void write(int i) throws java.io.IOException {
            this.getHighSpeedVideoFpsRanges.update((byte) i);
        }

        DigestOutputStream(org.bouncycastle.crypto.Digest digest) {
            this.getHighSpeedVideoFpsRanges = digest;
        }
    }

    @Override // org.bouncycastle.operator.DigestCalculatorProvider
    public org.bouncycastle.operator.DigestCalculator get(final org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) throws org.bouncycastle.operator.OperatorCreationException {
        final org.bouncycastle.operator.bc.BcDigestCalculatorProvider.DigestOutputStream digestOutputStream = new org.bouncycastle.operator.bc.BcDigestCalculatorProvider.DigestOutputStream(this.getHighResolutionOutputSizeshNQ4ISI.get(algorithmIdentifier));
        return new org.bouncycastle.operator.DigestCalculator() { // from class: org.bouncycastle.operator.bc.BcDigestCalculatorProvider.1
            @Override // org.bouncycastle.operator.DigestCalculator
            public byte[] getDigest() {
                org.bouncycastle.operator.bc.BcDigestCalculatorProvider.DigestOutputStream digestOutputStream2 = digestOutputStream;
                byte[] bArr = new byte[digestOutputStream2.getHighSpeedVideoFpsRanges.getDigestSize()];
                digestOutputStream2.getHighSpeedVideoFpsRanges.doFinal(bArr, 0);
                return bArr;
            }

            @Override // org.bouncycastle.operator.DigestCalculator
            public java.io.OutputStream getOutputStream() {
                return digestOutputStream;
            }

            @Override // org.bouncycastle.operator.DigestCalculator
            public org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithmIdentifier() {
                return algorithmIdentifier;
            }
        };
    }
}
