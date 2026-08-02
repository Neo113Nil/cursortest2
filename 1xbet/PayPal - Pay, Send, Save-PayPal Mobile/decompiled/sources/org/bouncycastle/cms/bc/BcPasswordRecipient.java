package org.bouncycastle.cms.bc;

/* loaded from: classes17.dex */
public abstract class BcPasswordRecipient implements org.bouncycastle.cms.PasswordRecipient {
    private int Camera2StreamConfigurationMap = 1;
    private final char[] getHighSpeedVideoFpsRangesFor;

    public org.bouncycastle.cms.bc.BcPasswordRecipient setPasswordConversionScheme(int i) {
        this.Camera2StreamConfigurationMap = i;
        return this;
    }

    @Override // org.bouncycastle.cms.PasswordRecipient
    public int getPasswordConversionScheme() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // org.bouncycastle.cms.PasswordRecipient
    public char[] getPassword() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    protected org.bouncycastle.crypto.params.KeyParameter extractSecretKey(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier2, byte[] bArr, byte[] bArr2) throws org.bouncycastle.cms.CMSException {
        org.bouncycastle.crypto.Wrapper highSpeedVideoFpsRangesFor = org.bouncycastle.cms.bc.EnvelopedDataHelper.getHighSpeedVideoFpsRangesFor(algorithmIdentifier.getAlgorithm());
        highSpeedVideoFpsRangesFor.init(false, new org.bouncycastle.crypto.params.ParametersWithIV(new org.bouncycastle.crypto.params.KeyParameter(bArr), org.bouncycastle.asn1.ASN1OctetString.getInstance(algorithmIdentifier.getParameters()).getOctets()));
        try {
            return new org.bouncycastle.crypto.params.KeyParameter(highSpeedVideoFpsRangesFor.unwrap(bArr2, 0, bArr2.length));
        } catch (org.bouncycastle.crypto.InvalidCipherTextException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to unwrap key: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cms.CMSException(sb.toString(), e);
        }
    }

    @Override // org.bouncycastle.cms.PasswordRecipient
    public byte[] calculateDerivedKey(int i, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, int i2) throws org.bouncycastle.cms.CMSException {
        org.bouncycastle.asn1.pkcs.PBKDF2Params pBKDF2Params = org.bouncycastle.asn1.pkcs.PBKDF2Params.getInstance(algorithmIdentifier.getParameters());
        byte[] PKCS5PasswordToBytes = i == 0 ? org.bouncycastle.crypto.PBEParametersGenerator.PKCS5PasswordToBytes(this.getHighSpeedVideoFpsRangesFor) : org.bouncycastle.crypto.PBEParametersGenerator.PKCS5PasswordToUTF8Bytes(this.getHighSpeedVideoFpsRangesFor);
        try {
            org.bouncycastle.crypto.generators.PKCS5S2ParametersGenerator pKCS5S2ParametersGenerator = new org.bouncycastle.crypto.generators.PKCS5S2ParametersGenerator(org.bouncycastle.cms.bc.EnvelopedDataHelper.getHighSpeedVideoSizes(pBKDF2Params.getPrf()));
            pKCS5S2ParametersGenerator.init(PKCS5PasswordToBytes, pBKDF2Params.getSalt(), pBKDF2Params.getIterationCount().intValue());
            return ((org.bouncycastle.crypto.params.KeyParameter) pKCS5S2ParametersGenerator.generateDerivedParameters(i2)).getKey();
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("exception creating derived key: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cms.CMSException(sb.toString(), e);
        }
    }

    BcPasswordRecipient(char[] cArr) {
        this.getHighSpeedVideoFpsRangesFor = cArr;
    }
}
