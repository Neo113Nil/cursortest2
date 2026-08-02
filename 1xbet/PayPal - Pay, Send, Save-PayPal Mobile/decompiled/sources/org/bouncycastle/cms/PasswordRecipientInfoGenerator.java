package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public abstract class PasswordRecipientInfoGenerator implements org.bouncycastle.cms.RecipientInfoGenerator {
    private int Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoSizes;
    private org.bouncycastle.cms.PasswordRecipient.PRF getInputFormats;
    private java.security.SecureRandom getInputSizeshNQ4ISI;
    private int getOutputFormats;
    private byte[] getOutputMinFrameDuration;
    protected char[] password;

    protected abstract byte[] calculateDerivedKey(int i, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, int i2) throws org.bouncycastle.cms.CMSException;

    protected abstract byte[] generateEncryptedBytes(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, byte[] bArr, org.bouncycastle.operator.GenericKey genericKey) throws org.bouncycastle.cms.CMSException;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PasswordRecipientInfoGenerator(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, char[] cArr) {
        this(aSN1ObjectIdentifier, cArr, r0.intValue(), ((java.lang.Integer) org.bouncycastle.cms.PasswordRecipientInformation.getHighSpeedVideoFpsRangesFor.get(aSN1ObjectIdentifier)).intValue());
        java.lang.Integer num = (java.lang.Integer) org.bouncycastle.cms.PasswordRecipientInformation.getHighSpeedVideoFpsRanges.get(aSN1ObjectIdentifier);
        if (num == null) {
            throw new java.lang.IllegalArgumentException("cannot find key size for algorithm: ".concat(java.lang.String.valueOf(aSN1ObjectIdentifier)));
        }
    }

    public org.bouncycastle.cms.PasswordRecipientInfoGenerator setSecureRandom(java.security.SecureRandom secureRandom) {
        this.getInputSizeshNQ4ISI = secureRandom;
        return this;
    }

    public org.bouncycastle.cms.PasswordRecipientInfoGenerator setSaltAndIterationCount(byte[] bArr, int i) {
        this.getOutputMinFrameDuration = org.bouncycastle.util.Arrays.clone(bArr);
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        return this;
    }

    public org.bouncycastle.cms.PasswordRecipientInfoGenerator setPasswordConversionScheme(int i) {
        this.getOutputFormats = i;
        return this;
    }

    public org.bouncycastle.cms.PasswordRecipientInfoGenerator setPRF(org.bouncycastle.cms.PasswordRecipient.PRF prf) {
        this.getInputFormats = prf;
        return this;
    }

    @Override // org.bouncycastle.cms.RecipientInfoGenerator
    public org.bouncycastle.asn1.cms.RecipientInfo generate(org.bouncycastle.operator.GenericKey genericKey) throws org.bouncycastle.cms.CMSException {
        byte[] bArr = new byte[this.Camera2StreamConfigurationMap];
        if (this.getInputSizeshNQ4ISI == null) {
            this.getInputSizeshNQ4ISI = new java.security.SecureRandom();
        }
        this.getInputSizeshNQ4ISI.nextBytes(bArr);
        if (this.getOutputMinFrameDuration == null) {
            byte[] bArr2 = new byte[20];
            this.getOutputMinFrameDuration = bArr2;
            this.getInputSizeshNQ4ISI.nextBytes(bArr2);
        }
        org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_PBKDF2, new org.bouncycastle.asn1.pkcs.PBKDF2Params(this.getOutputMinFrameDuration, this.getHighResolutionOutputSizeshNQ4ISI, this.getInputFormats.getHighSpeedVideoFpsRanges));
        this.getHighSpeedVideoSizes = algorithmIdentifier;
        org.bouncycastle.asn1.DEROctetString dEROctetString = new org.bouncycastle.asn1.DEROctetString(generateEncryptedBytes(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(this.getHighSpeedVideoFpsRangesFor, new org.bouncycastle.asn1.DEROctetString(bArr)), calculateDerivedKey(this.getOutputFormats, algorithmIdentifier, this.getHighSpeedVideoFpsRanges), genericKey));
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DEROctetString(bArr));
        return new org.bouncycastle.asn1.cms.RecipientInfo(new org.bouncycastle.asn1.cms.PasswordRecipientInfo(this.getHighSpeedVideoSizes, new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_alg_PWRI_KEK, new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector)), dEROctetString));
    }

    protected PasswordRecipientInfoGenerator(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, char[] cArr, int i, int i2) {
        this.password = cArr;
        this.getOutputFormats = 1;
        this.getHighSpeedVideoFpsRangesFor = aSN1ObjectIdentifier;
        this.getHighSpeedVideoFpsRanges = i;
        this.Camera2StreamConfigurationMap = i2;
        this.getInputFormats = org.bouncycastle.cms.PasswordRecipient.PRF.HMacSHA1;
        this.getHighResolutionOutputSizeshNQ4ISI = 1024;
    }
}
