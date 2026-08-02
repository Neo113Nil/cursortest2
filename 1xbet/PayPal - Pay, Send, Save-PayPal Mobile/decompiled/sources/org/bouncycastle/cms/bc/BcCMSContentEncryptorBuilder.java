package org.bouncycastle.cms.bc;

/* loaded from: classes17.dex */
public class BcCMSContentEncryptorBuilder {
    private static final org.bouncycastle.operator.SecretKeySizeProvider getHighSpeedVideoFpsRangesFor = org.bouncycastle.operator.DefaultSecretKeySizeProvider.INSTANCE;
    private java.security.SecureRandom Camera2StreamConfigurationMap;
    private org.bouncycastle.cms.bc.EnvelopedDataHelper getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRanges;
    private final org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoSizes;

    class CMSAuthOutputEncryptor extends org.bouncycastle.cms.bc.BcCMSContentEncryptorBuilder.CMSOutputEncryptor implements org.bouncycastle.operator.OutputAEADEncryptor {
        private org.bouncycastle.crypto.modes.AEADBlockCipher Camera2StreamConfigurationMap;
        private org.bouncycastle.operator.MacCaptureStream getHighResolutionOutputSizeshNQ4ISI;

        CMSAuthOutputEncryptor(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, int i, java.security.SecureRandom secureRandom) throws org.bouncycastle.cms.CMSException {
            super(aSN1ObjectIdentifier, secureRandom);
            if (!(this.getHighSpeedVideoSizes instanceof org.bouncycastle.crypto.modes.AEADBlockCipher)) {
                throw new java.lang.IllegalArgumentException("Unable to create Authenticated Output Encryptor without Authenticaed Data cipher!");
            }
            this.Camera2StreamConfigurationMap = (org.bouncycastle.crypto.modes.AEADBlockCipher) this.getHighSpeedVideoSizes;
        }

        @Override // org.bouncycastle.cms.bc.BcCMSContentEncryptorBuilder.CMSOutputEncryptor, org.bouncycastle.operator.OutputEncryptor
        public java.io.OutputStream getOutputStream(java.io.OutputStream outputStream) {
            org.bouncycastle.operator.MacCaptureStream macCaptureStream = new org.bouncycastle.operator.MacCaptureStream(outputStream, this.Camera2StreamConfigurationMap.getMac().length);
            this.getHighResolutionOutputSizeshNQ4ISI = macCaptureStream;
            return org.bouncycastle.crypto.util.CipherFactory.createOutputStream(macCaptureStream, this.getHighSpeedVideoSizes);
        }

        @Override // org.bouncycastle.operator.AADProcessor
        public byte[] getMAC() {
            return this.getHighResolutionOutputSizeshNQ4ISI.getMac();
        }

        @Override // org.bouncycastle.operator.AADProcessor
        public java.io.OutputStream getAADStream() {
            return new org.bouncycastle.cms.bc.BcCMSContentEncryptorBuilder.AADStream(this.Camera2StreamConfigurationMap);
        }
    }

    public org.bouncycastle.cms.bc.BcCMSContentEncryptorBuilder setSecureRandom(java.security.SecureRandom secureRandom) {
        this.Camera2StreamConfigurationMap = secureRandom;
        return this;
    }

    class CMSOutputEncryptor implements org.bouncycastle.operator.OutputEncryptor {
        private org.bouncycastle.crypto.params.KeyParameter Camera2StreamConfigurationMap;
        private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighResolutionOutputSizeshNQ4ISI;
        protected java.lang.Object getHighSpeedVideoSizes;

        @Override // org.bouncycastle.operator.OutputEncryptor
        public java.io.OutputStream getOutputStream(java.io.OutputStream outputStream) {
            return org.bouncycastle.crypto.util.CipherFactory.createOutputStream(outputStream, this.getHighSpeedVideoSizes);
        }

        @Override // org.bouncycastle.operator.OutputEncryptor
        public org.bouncycastle.operator.GenericKey getKey() {
            return new org.bouncycastle.operator.GenericKey(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap.getKey());
        }

        @Override // org.bouncycastle.operator.OutputEncryptor
        public org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithmIdentifier() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        CMSOutputEncryptor(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, java.security.SecureRandom secureRandom) throws org.bouncycastle.cms.CMSException {
            secureRandom = secureRandom == null ? new java.security.SecureRandom() : secureRandom;
            org.bouncycastle.cms.bc.EnvelopedDataHelper unused = org.bouncycastle.cms.bc.BcCMSContentEncryptorBuilder.this.getHighResolutionOutputSizeshNQ4ISI;
            this.Camera2StreamConfigurationMap = new org.bouncycastle.crypto.params.KeyParameter(org.bouncycastle.cms.bc.EnvelopedDataHelper.getHighResolutionOutputSizeshNQ4ISI(aSN1ObjectIdentifier, secureRandom).generateKey());
            org.bouncycastle.cms.bc.EnvelopedDataHelper unused2 = org.bouncycastle.cms.bc.BcCMSContentEncryptorBuilder.this.getHighResolutionOutputSizeshNQ4ISI;
            org.bouncycastle.asn1.x509.AlgorithmIdentifier highSpeedVideoFpsRangesFor = org.bouncycastle.cms.bc.EnvelopedDataHelper.getHighSpeedVideoFpsRangesFor(aSN1ObjectIdentifier, this.Camera2StreamConfigurationMap, secureRandom);
            this.getHighResolutionOutputSizeshNQ4ISI = highSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoSizes = org.bouncycastle.cms.bc.EnvelopedDataHelper.getHighSpeedVideoFpsRanges(true, this.Camera2StreamConfigurationMap, highSpeedVideoFpsRangesFor);
        }
    }

    public org.bouncycastle.operator.OutputEncryptor build() throws org.bouncycastle.cms.CMSException {
        return org.bouncycastle.cms.bc.EnvelopedDataHelper.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes) ? new org.bouncycastle.cms.bc.BcCMSContentEncryptorBuilder.CMSAuthOutputEncryptor(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap) : new org.bouncycastle.cms.bc.BcCMSContentEncryptorBuilder.CMSOutputEncryptor(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap);
    }

    static class AADStream extends java.io.OutputStream {
        private org.bouncycastle.crypto.modes.AEADBlockCipher getHighSpeedVideoFpsRanges;

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws java.io.IOException {
            this.getHighSpeedVideoFpsRanges.processAADBytes(bArr, i, i2);
        }

        @Override // java.io.OutputStream
        public void write(int i) throws java.io.IOException {
            this.getHighSpeedVideoFpsRanges.processAADByte((byte) i);
        }

        public AADStream(org.bouncycastle.crypto.modes.AEADBlockCipher aEADBlockCipher) {
            this.getHighSpeedVideoFpsRanges = aEADBlockCipher;
        }
    }

    public BcCMSContentEncryptorBuilder(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.cms.bc.EnvelopedDataHelper();
        this.getHighSpeedVideoSizes = aSN1ObjectIdentifier;
        int keySize = getHighSpeedVideoFpsRangesFor.getKeySize(aSN1ObjectIdentifier);
        if (aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.des_EDE3_CBC)) {
            if (i != 168 && i != keySize) {
                throw new java.lang.IllegalArgumentException("incorrect keySize for encryptionOID passed to builder.");
            }
            this.getHighSpeedVideoFpsRanges = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE;
            return;
        }
        if (aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.desCBC)) {
            if (i != 56 && i != keySize) {
                throw new java.lang.IllegalArgumentException("incorrect keySize for encryptionOID passed to builder.");
            }
            this.getHighSpeedVideoFpsRanges = 56;
            return;
        }
        if (keySize > 0 && keySize != i) {
            throw new java.lang.IllegalArgumentException("incorrect keySize for encryptionOID passed to builder.");
        }
        this.getHighSpeedVideoFpsRanges = i;
    }

    public BcCMSContentEncryptorBuilder(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this(aSN1ObjectIdentifier, getHighSpeedVideoFpsRangesFor.getKeySize(aSN1ObjectIdentifier));
    }
}
