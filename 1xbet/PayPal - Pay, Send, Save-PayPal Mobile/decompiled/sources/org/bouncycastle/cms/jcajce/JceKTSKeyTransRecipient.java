package org.bouncycastle.cms.jcajce;

/* loaded from: classes17.dex */
public abstract class JceKTSKeyTransRecipient implements org.bouncycastle.cms.KeyTransRecipient {
    private static final byte[] getHighSpeedVideoSizes = org.bouncycastle.util.encoders.Hex.decode("0c14416e6f6e796d6f75732053656e64657220202020");
    protected org.bouncycastle.cms.jcajce.EnvelopedDataHelper contentHelper;
    protected java.util.Map extraMappings;
    private java.security.PrivateKey getHighSpeedVideoFpsRanges;
    private final byte[] getHighSpeedVideoFpsRangesFor;
    protected org.bouncycastle.cms.jcajce.EnvelopedDataHelper helper;
    protected boolean unwrappedKeyMustBeEncodable;
    protected boolean validateKeySize;

    public org.bouncycastle.cms.jcajce.JceKTSKeyTransRecipient setProvider(java.security.Provider provider) {
        org.bouncycastle.cms.jcajce.EnvelopedDataHelper envelopedDataHelper = new org.bouncycastle.cms.jcajce.EnvelopedDataHelper(new org.bouncycastle.cms.jcajce.ProviderJcaJceExtHelper(provider));
        this.helper = envelopedDataHelper;
        this.contentHelper = envelopedDataHelper;
        return this;
    }

    public org.bouncycastle.cms.jcajce.JceKTSKeyTransRecipient setProvider(java.lang.String str) {
        org.bouncycastle.cms.jcajce.EnvelopedDataHelper envelopedDataHelper = new org.bouncycastle.cms.jcajce.EnvelopedDataHelper(new org.bouncycastle.cms.jcajce.NamedJcaJceExtHelper(str));
        this.helper = envelopedDataHelper;
        this.contentHelper = envelopedDataHelper;
        return this;
    }

    public org.bouncycastle.cms.jcajce.JceKTSKeyTransRecipient setKeySizeValidation(boolean z) {
        this.validateKeySize = z;
        return this;
    }

    public org.bouncycastle.cms.jcajce.JceKTSKeyTransRecipient setContentProvider(java.security.Provider provider) {
        this.contentHelper = org.bouncycastle.cms.jcajce.CMSUtils.getHighSpeedVideoFpsRanges(provider);
        return this;
    }

    public org.bouncycastle.cms.jcajce.JceKTSKeyTransRecipient setContentProvider(java.lang.String str) {
        this.contentHelper = org.bouncycastle.cms.jcajce.CMSUtils.getHighSpeedVideoFpsRangesFor(str);
        return this;
    }

    public org.bouncycastle.cms.jcajce.JceKTSKeyTransRecipient setAlgorithmMapping(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, java.lang.String str) {
        this.extraMappings.put(aSN1ObjectIdentifier, str);
        return this;
    }

    protected java.security.Key extractSecretKey(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier2, byte[] bArr) throws org.bouncycastle.cms.CMSException {
        try {
            java.security.Key jceKey = this.helper.getJceKey(algorithmIdentifier2.getAlgorithm(), this.helper.createAsymmetricUnwrapper(algorithmIdentifier, this.getHighSpeedVideoFpsRanges, getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor).generateUnwrappedKey(algorithmIdentifier2, bArr));
            if (this.validateKeySize) {
                this.helper.keySizeCheck(algorithmIdentifier2, jceKey);
            }
            return jceKey;
        } catch (org.bouncycastle.operator.OperatorException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("exception unwrapping key: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cms.CMSException(sb.toString(), e);
        }
    }

    protected static byte[] getPartyVInfoFromRID(org.bouncycastle.cms.KeyTransRecipientId keyTransRecipientId) throws java.io.IOException {
        return keyTransRecipientId.getSerialNumber() != null ? new org.bouncycastle.asn1.cms.IssuerAndSerialNumber(keyTransRecipientId.getIssuer(), keyTransRecipientId.getSerialNumber()).getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER) : new org.bouncycastle.asn1.DEROctetString(keyTransRecipientId.getSubjectKeyIdentifier()).getEncoded();
    }

    public JceKTSKeyTransRecipient(java.security.PrivateKey privateKey, byte[] bArr) {
        org.bouncycastle.cms.jcajce.EnvelopedDataHelper envelopedDataHelper = new org.bouncycastle.cms.jcajce.EnvelopedDataHelper(new org.bouncycastle.cms.jcajce.DefaultJcaJceExtHelper());
        this.helper = envelopedDataHelper;
        this.contentHelper = envelopedDataHelper;
        this.extraMappings = new java.util.HashMap();
        this.validateKeySize = false;
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.cms.jcajce.CMSUtils.getHighResolutionOutputSizeshNQ4ISI(privateKey);
        this.getHighSpeedVideoFpsRangesFor = bArr;
    }
}
