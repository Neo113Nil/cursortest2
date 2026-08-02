package org.bouncycastle.pkcs.bc;

/* loaded from: classes17.dex */
public class BcPKCS12PBEInputDecryptorProviderBuilder {
    private org.bouncycastle.crypto.ExtendedDigest getHighSpeedVideoFpsRanges;

    public org.bouncycastle.operator.InputDecryptorProvider build(final char[] cArr) {
        return new org.bouncycastle.operator.InputDecryptorProvider() { // from class: org.bouncycastle.pkcs.bc.BcPKCS12PBEInputDecryptorProviderBuilder.1
            @Override // org.bouncycastle.operator.InputDecryptorProvider
            public org.bouncycastle.operator.InputDecryptor get(final org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
                final org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher highSpeedVideoFpsRanges = org.bouncycastle.pkcs.bc.PKCS12PBEUtils.getHighSpeedVideoFpsRanges(algorithmIdentifier.getAlgorithm());
                highSpeedVideoFpsRanges.init(false, org.bouncycastle.pkcs.bc.PKCS12PBEUtils.getHighSpeedVideoFpsRanges(algorithmIdentifier.getAlgorithm(), org.bouncycastle.pkcs.bc.BcPKCS12PBEInputDecryptorProviderBuilder.this.getHighSpeedVideoFpsRanges, highSpeedVideoFpsRanges.getBlockSize(), org.bouncycastle.asn1.pkcs.PKCS12PBEParams.getInstance(algorithmIdentifier.getParameters()), cArr));
                return new org.bouncycastle.operator.InputDecryptor() { // from class: org.bouncycastle.pkcs.bc.BcPKCS12PBEInputDecryptorProviderBuilder.1.1
                    @Override // org.bouncycastle.operator.InputDecryptor
                    public java.io.InputStream getInputStream(java.io.InputStream inputStream) {
                        return new org.bouncycastle.crypto.io.CipherInputStream(inputStream, highSpeedVideoFpsRanges);
                    }

                    @Override // org.bouncycastle.operator.InputDecryptor
                    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithmIdentifier() {
                        return algorithmIdentifier;
                    }
                };
            }
        };
    }

    public BcPKCS12PBEInputDecryptorProviderBuilder(org.bouncycastle.crypto.ExtendedDigest extendedDigest) {
        this.getHighSpeedVideoFpsRanges = extendedDigest;
    }

    public BcPKCS12PBEInputDecryptorProviderBuilder() {
        this(new org.bouncycastle.crypto.digests.SHA1Digest());
    }
}
