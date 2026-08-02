package org.bouncycastle.cmc;

/* loaded from: classes17.dex */
public class SimplePKIResponse implements org.bouncycastle.util.Encodable {
    private final org.bouncycastle.cms.CMSSignedData getHighSpeedVideoSizes;

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() throws java.io.IOException {
        return this.getHighSpeedVideoSizes.getEncoded();
    }

    public org.bouncycastle.util.Store<org.bouncycastle.cert.X509CertificateHolder> getCertificates() {
        return this.getHighSpeedVideoSizes.getCertificates();
    }

    public org.bouncycastle.util.Store<org.bouncycastle.cert.X509CRLHolder> getCRLs() {
        return this.getHighSpeedVideoSizes.getCRLs();
    }

    private static org.bouncycastle.asn1.cms.ContentInfo getHighResolutionOutputSizeshNQ4ISI(byte[] bArr) throws org.bouncycastle.cmc.CMCException {
        try {
            return org.bouncycastle.asn1.cms.ContentInfo.getInstance(org.bouncycastle.asn1.ASN1Primitive.fromByteArray(bArr));
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("malformed data: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cmc.CMCException(sb.toString(), e);
        }
    }

    public SimplePKIResponse(byte[] bArr) throws org.bouncycastle.cmc.CMCException {
        this(getHighResolutionOutputSizeshNQ4ISI(bArr));
    }

    public SimplePKIResponse(org.bouncycastle.asn1.cms.ContentInfo contentInfo) throws org.bouncycastle.cmc.CMCException {
        try {
            org.bouncycastle.cms.CMSSignedData cMSSignedData = new org.bouncycastle.cms.CMSSignedData(contentInfo);
            this.getHighSpeedVideoSizes = cMSSignedData;
            if (cMSSignedData.getSignerInfos().size() != 0) {
                throw new org.bouncycastle.cmc.CMCException("malformed response: SignerInfo structures found");
            }
            if (cMSSignedData.getSignedContent() != null) {
                throw new org.bouncycastle.cmc.CMCException("malformed response: Signed Content found");
            }
        } catch (org.bouncycastle.cms.CMSException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("malformed response: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cmc.CMCException(sb.toString(), e);
        }
    }
}
