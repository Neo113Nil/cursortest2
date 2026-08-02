package org.bouncycastle.pkcs.bc;

/* loaded from: classes17.dex */
public class BcPKCS12PBEOutputEncryptorBuilder {
    private org.bouncycastle.asn1.ASN1ObjectIdentifier Camera2StreamConfigurationMap;
    private org.bouncycastle.crypto.ExtendedDigest getHighResolutionOutputSizeshNQ4ISI;
    private java.security.SecureRandom getHighSpeedVideoFpsRanges;
    private org.bouncycastle.crypto.BufferedBlockCipher getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;

    public org.bouncycastle.pkcs.bc.BcPKCS12PBEOutputEncryptorBuilder setIterationCount(int i) {
        this.getHighSpeedVideoSizes = i;
        return this;
    }

    public org.bouncycastle.operator.OutputEncryptor build(final char[] cArr) {
        if (this.getHighSpeedVideoFpsRanges == null) {
            this.getHighSpeedVideoFpsRanges = new java.security.SecureRandom();
        }
        byte[] bArr = new byte[20];
        this.getHighSpeedVideoFpsRanges.nextBytes(bArr);
        final org.bouncycastle.asn1.pkcs.PKCS12PBEParams pKCS12PBEParams = new org.bouncycastle.asn1.pkcs.PKCS12PBEParams(bArr, this.getHighSpeedVideoSizes);
        this.getHighSpeedVideoFpsRangesFor.init(true, org.bouncycastle.pkcs.bc.PKCS12PBEUtils.getHighSpeedVideoFpsRanges(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor.getBlockSize(), pKCS12PBEParams, cArr));
        return new org.bouncycastle.operator.OutputEncryptor() { // from class: org.bouncycastle.pkcs.bc.BcPKCS12PBEOutputEncryptorBuilder.1
            @Override // org.bouncycastle.operator.OutputEncryptor
            public java.io.OutputStream getOutputStream(java.io.OutputStream outputStream) {
                return new org.bouncycastle.crypto.io.CipherOutputStream(outputStream, org.bouncycastle.pkcs.bc.BcPKCS12PBEOutputEncryptorBuilder.this.getHighSpeedVideoFpsRangesFor);
            }

            @Override // org.bouncycastle.operator.OutputEncryptor
            public org.bouncycastle.operator.GenericKey getKey() {
                return new org.bouncycastle.operator.GenericKey(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.pkcs.bc.BcPKCS12PBEOutputEncryptorBuilder.this.Camera2StreamConfigurationMap, pKCS12PBEParams), org.bouncycastle.crypto.generators.PKCS12ParametersGenerator.PKCS12PasswordToBytes(cArr));
            }

            @Override // org.bouncycastle.operator.OutputEncryptor
            public org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithmIdentifier() {
                return new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.pkcs.bc.BcPKCS12PBEOutputEncryptorBuilder.this.Camera2StreamConfigurationMap, pKCS12PBEParams);
            }
        };
    }

    public BcPKCS12PBEOutputEncryptorBuilder(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.crypto.BlockCipher blockCipher, org.bouncycastle.crypto.ExtendedDigest extendedDigest) {
        this.getHighSpeedVideoSizes = 1024;
        this.Camera2StreamConfigurationMap = aSN1ObjectIdentifier;
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher(blockCipher, new org.bouncycastle.crypto.paddings.PKCS7Padding());
        this.getHighResolutionOutputSizeshNQ4ISI = extendedDigest;
    }

    public BcPKCS12PBEOutputEncryptorBuilder(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.crypto.BlockCipher blockCipher) {
        this(aSN1ObjectIdentifier, blockCipher, new org.bouncycastle.crypto.digests.SHA1Digest());
    }
}
