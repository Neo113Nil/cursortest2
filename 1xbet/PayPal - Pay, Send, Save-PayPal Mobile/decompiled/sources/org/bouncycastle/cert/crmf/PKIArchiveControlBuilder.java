package org.bouncycastle.cert.crmf;

/* loaded from: classes17.dex */
public class PKIArchiveControlBuilder {
    private org.bouncycastle.cms.CMSEnvelopedDataGenerator Camera2StreamConfigurationMap;
    private org.bouncycastle.cms.CMSProcessableByteArray getHighSpeedVideoFpsRangesFor;

    public org.bouncycastle.cert.crmf.PKIArchiveControl build(org.bouncycastle.operator.OutputEncryptor outputEncryptor) throws org.bouncycastle.cms.CMSException {
        return new org.bouncycastle.cert.crmf.PKIArchiveControl(new org.bouncycastle.asn1.crmf.PKIArchiveOptions(new org.bouncycastle.asn1.crmf.EncryptedKey(org.bouncycastle.asn1.cms.EnvelopedData.getInstance(this.Camera2StreamConfigurationMap.generate(this.getHighSpeedVideoFpsRangesFor, outputEncryptor).toASN1Structure().getContent()))));
    }

    public org.bouncycastle.cert.crmf.PKIArchiveControlBuilder addRecipientGenerator(org.bouncycastle.cms.RecipientInfoGenerator recipientInfoGenerator) {
        this.Camera2StreamConfigurationMap.addRecipientInfoGenerator(recipientInfoGenerator);
        return this;
    }

    public PKIArchiveControlBuilder(org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo, org.bouncycastle.asn1.x509.GeneralName generalName) {
        try {
            this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.cms.CMSProcessableByteArray(org.bouncycastle.asn1.crmf.CRMFObjectIdentifiers.id_ct_encKeyWithID, new org.bouncycastle.asn1.crmf.EncKeyWithID(privateKeyInfo, generalName).getEncoded());
            this.Camera2StreamConfigurationMap = new org.bouncycastle.cms.CMSEnvelopedDataGenerator();
        } catch (java.io.IOException unused) {
            throw new java.lang.IllegalStateException("unable to encode key and general name info");
        }
    }
}
