package org.bouncycastle.cert.crmf.bc;

/* loaded from: classes17.dex */
public class BcCRMFEncryptorBuilder {
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoFpsRanges;
    private org.bouncycastle.cert.crmf.bc.CRMFHelper getHighSpeedVideoFpsRangesFor;
    private java.security.SecureRandom getHighSpeedVideoSizes;

    class CRMFOutputEncryptor implements org.bouncycastle.operator.OutputEncryptor {
        private org.bouncycastle.crypto.params.KeyParameter Camera2StreamConfigurationMap;
        private java.lang.Object getHighSpeedVideoFpsRanges;
        private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRangesFor;

        @Override // org.bouncycastle.operator.OutputEncryptor
        public java.io.OutputStream getOutputStream(java.io.OutputStream outputStream) {
            return org.bouncycastle.crypto.util.CipherFactory.createOutputStream(outputStream, this.getHighSpeedVideoFpsRanges);
        }

        @Override // org.bouncycastle.operator.OutputEncryptor
        public org.bouncycastle.operator.GenericKey getKey() {
            return new org.bouncycastle.operator.GenericKey(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap.getKey());
        }

        @Override // org.bouncycastle.operator.OutputEncryptor
        public org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithmIdentifier() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        CRMFOutputEncryptor(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, java.security.SecureRandom secureRandom) throws org.bouncycastle.cert.crmf.CRMFException {
            java.security.SecureRandom secureRandom2 = org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom(secureRandom);
            org.bouncycastle.cert.crmf.bc.CRMFHelper unused = org.bouncycastle.cert.crmf.bc.BcCRMFEncryptorBuilder.this.getHighSpeedVideoFpsRangesFor;
            this.Camera2StreamConfigurationMap = new org.bouncycastle.crypto.params.KeyParameter(org.bouncycastle.cert.crmf.bc.CRMFHelper.getHighSpeedVideoSizes(aSN1ObjectIdentifier, secureRandom2).generateKey());
            org.bouncycastle.cert.crmf.bc.CRMFHelper unused2 = org.bouncycastle.cert.crmf.bc.BcCRMFEncryptorBuilder.this.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.cert.crmf.bc.CRMFHelper.getHighResolutionOutputSizeshNQ4ISI(aSN1ObjectIdentifier, this.Camera2StreamConfigurationMap, secureRandom2);
            org.bouncycastle.cert.crmf.bc.CRMFHelper unused3 = org.bouncycastle.cert.crmf.bc.BcCRMFEncryptorBuilder.this.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoFpsRanges = org.bouncycastle.cert.crmf.bc.CRMFHelper.getHighSpeedVideoFpsRangesFor(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor);
        }
    }

    public org.bouncycastle.cert.crmf.bc.BcCRMFEncryptorBuilder setSecureRandom(java.security.SecureRandom secureRandom) {
        this.getHighSpeedVideoSizes = secureRandom;
        return this;
    }

    public org.bouncycastle.operator.OutputEncryptor build() throws org.bouncycastle.cert.crmf.CRMFException {
        return new org.bouncycastle.cert.crmf.bc.BcCRMFEncryptorBuilder.CRMFOutputEncryptor(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes);
    }

    public BcCRMFEncryptorBuilder(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, int i) {
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.cert.crmf.bc.CRMFHelper();
        this.getHighSpeedVideoFpsRanges = aSN1ObjectIdentifier;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    public BcCRMFEncryptorBuilder(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this(aSN1ObjectIdentifier, -1);
    }
}
