package org.bouncycastle.operator.jcajce;

/* loaded from: classes17.dex */
public class JcaDigestCalculatorProviderBuilder {
    private org.bouncycastle.operator.jcajce.OperatorHelper getHighSpeedVideoSizes = new org.bouncycastle.operator.jcajce.OperatorHelper(new org.bouncycastle.jcajce.util.DefaultJcaJceHelper());

    public org.bouncycastle.operator.jcajce.JcaDigestCalculatorProviderBuilder setProvider(java.security.Provider provider) {
        this.getHighSpeedVideoSizes = new org.bouncycastle.operator.jcajce.OperatorHelper(new org.bouncycastle.jcajce.util.ProviderJcaJceHelper(provider));
        return this;
    }

    class DigestOutputStream extends java.io.OutputStream {
        java.security.MessageDigest getHighSpeedVideoSizes;

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws java.io.IOException {
            this.getHighSpeedVideoSizes.update(bArr, i, i2);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws java.io.IOException {
            this.getHighSpeedVideoSizes.update(bArr);
        }

        @Override // java.io.OutputStream
        public void write(int i) throws java.io.IOException {
            this.getHighSpeedVideoSizes.update((byte) i);
        }

        DigestOutputStream(java.security.MessageDigest messageDigest) {
            this.getHighSpeedVideoSizes = messageDigest;
        }
    }

    public org.bouncycastle.operator.jcajce.JcaDigestCalculatorProviderBuilder setProvider(java.lang.String str) {
        this.getHighSpeedVideoSizes = new org.bouncycastle.operator.jcajce.OperatorHelper(new org.bouncycastle.jcajce.util.NamedJcaJceHelper(str));
        return this;
    }

    public org.bouncycastle.operator.jcajce.JcaDigestCalculatorProviderBuilder setHelper(org.bouncycastle.jcajce.util.JcaJceHelper jcaJceHelper) {
        this.getHighSpeedVideoSizes = new org.bouncycastle.operator.jcajce.OperatorHelper(jcaJceHelper);
        return this;
    }

    public org.bouncycastle.operator.DigestCalculatorProvider build() throws org.bouncycastle.operator.OperatorCreationException {
        return new org.bouncycastle.operator.DigestCalculatorProvider() { // from class: org.bouncycastle.operator.jcajce.JcaDigestCalculatorProviderBuilder.1
            @Override // org.bouncycastle.operator.DigestCalculatorProvider
            public org.bouncycastle.operator.DigestCalculator get(final org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) throws org.bouncycastle.operator.OperatorCreationException {
                try {
                    final org.bouncycastle.operator.jcajce.JcaDigestCalculatorProviderBuilder.DigestOutputStream digestOutputStream = org.bouncycastle.operator.jcajce.JcaDigestCalculatorProviderBuilder.this.new DigestOutputStream(org.bouncycastle.operator.jcajce.JcaDigestCalculatorProviderBuilder.this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI(algorithmIdentifier));
                    return new org.bouncycastle.operator.DigestCalculator() { // from class: org.bouncycastle.operator.jcajce.JcaDigestCalculatorProviderBuilder.1.1
                        @Override // org.bouncycastle.operator.DigestCalculator
                        public byte[] getDigest() {
                            return digestOutputStream.getHighSpeedVideoSizes.digest();
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
                } catch (java.security.GeneralSecurityException e) {
                    throw new org.bouncycastle.operator.OperatorCreationException("exception on setup: ".concat(java.lang.String.valueOf(e)), e);
                }
            }
        };
    }
}
