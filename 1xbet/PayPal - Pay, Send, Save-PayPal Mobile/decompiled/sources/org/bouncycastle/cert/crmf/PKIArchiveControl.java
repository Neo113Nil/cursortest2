package org.bouncycastle.cert.crmf;

/* loaded from: classes17.dex */
public class PKIArchiveControl implements org.bouncycastle.cert.crmf.Control {
    public static final int archiveRemGenPrivKey = 2;
    public static final int encryptedPrivKey = 0;
    private static final org.bouncycastle.asn1.ASN1ObjectIdentifier getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.crmf.CRMFObjectIdentifiers.id_regCtrl_pkiArchiveOptions;
    public static final int keyGenParameters = 1;
    private final org.bouncycastle.asn1.crmf.PKIArchiveOptions getHighSpeedVideoFpsRangesFor;

    public boolean isEnvelopedData() {
        return !org.bouncycastle.asn1.crmf.EncryptedKey.getInstance(this.getHighSpeedVideoFpsRangesFor.getValue()).isEncryptedValue();
    }

    @Override // org.bouncycastle.cert.crmf.Control
    public org.bouncycastle.asn1.ASN1Encodable getValue() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // org.bouncycastle.cert.crmf.Control
    public org.bouncycastle.asn1.ASN1ObjectIdentifier getType() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.cms.CMSEnvelopedData getEnvelopedData() throws org.bouncycastle.cert.crmf.CRMFException {
        try {
            return new org.bouncycastle.cms.CMSEnvelopedData(new org.bouncycastle.asn1.cms.ContentInfo(org.bouncycastle.asn1.cms.CMSObjectIdentifiers.envelopedData, org.bouncycastle.asn1.cms.EnvelopedData.getInstance(org.bouncycastle.asn1.crmf.EncryptedKey.getInstance(this.getHighSpeedVideoFpsRangesFor.getValue()).getValue())));
        } catch (org.bouncycastle.cms.CMSException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CMS parsing error: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cert.crmf.CRMFException(sb.toString(), e.getCause());
        } catch (java.lang.Exception e2) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("CRMF parsing error: ");
            sb2.append(e2.getMessage());
            throw new org.bouncycastle.cert.crmf.CRMFException(sb2.toString(), e2);
        }
    }

    public int getArchiveType() {
        return this.getHighSpeedVideoFpsRangesFor.getType();
    }

    public PKIArchiveControl(org.bouncycastle.asn1.crmf.PKIArchiveOptions pKIArchiveOptions) {
        this.getHighSpeedVideoFpsRangesFor = pKIArchiveOptions;
    }
}
