package org.bouncycastle.cms.bc;

/* loaded from: classes17.dex */
public class BcPasswordRecipientInfoGenerator extends org.bouncycastle.cms.PasswordRecipientInfoGenerator {
    @Override // org.bouncycastle.cms.PasswordRecipientInfoGenerator
    public byte[] generateEncryptedBytes(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, byte[] bArr, org.bouncycastle.operator.GenericKey genericKey) throws org.bouncycastle.cms.CMSException {
        byte[] key = ((org.bouncycastle.crypto.params.KeyParameter) org.bouncycastle.cms.bc.CMSUtils.getHighResolutionOutputSizeshNQ4ISI(genericKey)).getKey();
        org.bouncycastle.crypto.Wrapper highSpeedVideoFpsRangesFor = org.bouncycastle.cms.bc.EnvelopedDataHelper.getHighSpeedVideoFpsRangesFor(algorithmIdentifier.getAlgorithm());
        highSpeedVideoFpsRangesFor.init(true, new org.bouncycastle.crypto.params.ParametersWithIV(new org.bouncycastle.crypto.params.KeyParameter(bArr), org.bouncycastle.asn1.ASN1OctetString.getInstance(algorithmIdentifier.getParameters()).getOctets()));
        return highSpeedVideoFpsRangesFor.wrap(key, 0, key.length);
    }

    @Override // org.bouncycastle.cms.PasswordRecipientInfoGenerator
    public byte[] calculateDerivedKey(int i, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, int i2) throws org.bouncycastle.cms.CMSException {
        org.bouncycastle.asn1.pkcs.PBKDF2Params pBKDF2Params = org.bouncycastle.asn1.pkcs.PBKDF2Params.getInstance(algorithmIdentifier.getParameters());
        byte[] PKCS5PasswordToBytes = i == 0 ? org.bouncycastle.crypto.PBEParametersGenerator.PKCS5PasswordToBytes(this.password) : org.bouncycastle.crypto.PBEParametersGenerator.PKCS5PasswordToUTF8Bytes(this.password);
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

    public BcPasswordRecipientInfoGenerator(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, char[] cArr) {
        super(aSN1ObjectIdentifier, cArr);
    }
}
