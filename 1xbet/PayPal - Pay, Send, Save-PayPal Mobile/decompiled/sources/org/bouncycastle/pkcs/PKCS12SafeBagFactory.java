package org.bouncycastle.pkcs;

/* loaded from: classes17.dex */
public class PKCS12SafeBagFactory {
    private org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoFpsRanges;

    public org.bouncycastle.pkcs.PKCS12SafeBag[] getSafeBags() {
        org.bouncycastle.pkcs.PKCS12SafeBag[] pKCS12SafeBagArr = new org.bouncycastle.pkcs.PKCS12SafeBag[this.getHighSpeedVideoFpsRanges.size()];
        for (int i = 0; i != this.getHighSpeedVideoFpsRanges.size(); i++) {
            pKCS12SafeBagArr[i] = new org.bouncycastle.pkcs.PKCS12SafeBag(org.bouncycastle.asn1.pkcs.SafeBag.getInstance(this.getHighSpeedVideoFpsRanges.getObjectAt(i)));
        }
        return pKCS12SafeBagArr;
    }

    public PKCS12SafeBagFactory(org.bouncycastle.asn1.pkcs.ContentInfo contentInfo, org.bouncycastle.operator.InputDecryptorProvider inputDecryptorProvider) throws org.bouncycastle.pkcs.PKCSException {
        if (!contentInfo.getContentType().equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.encryptedData)) {
            throw new java.lang.IllegalArgumentException("encryptedData requires constructor with decryptor.");
        }
        try {
            this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.ASN1Sequence.getInstance(new org.bouncycastle.cms.CMSEncryptedData(org.bouncycastle.asn1.cms.ContentInfo.getInstance(contentInfo)).getContent(inputDecryptorProvider));
        } catch (org.bouncycastle.cms.CMSException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to extract data: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.pkcs.PKCSException(sb.toString(), e);
        }
    }

    public PKCS12SafeBagFactory(org.bouncycastle.asn1.pkcs.ContentInfo contentInfo) {
        if (contentInfo.getContentType().equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.encryptedData)) {
            throw new java.lang.IllegalArgumentException("encryptedData requires constructor with decryptor.");
        }
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.ASN1Sequence.getInstance(org.bouncycastle.asn1.ASN1OctetString.getInstance(contentInfo.getContent()).getOctets());
    }
}
