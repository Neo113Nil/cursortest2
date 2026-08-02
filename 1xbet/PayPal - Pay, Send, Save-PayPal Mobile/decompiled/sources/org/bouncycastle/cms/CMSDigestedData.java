package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public class CMSDigestedData implements org.bouncycastle.util.Encodable {
    private org.bouncycastle.asn1.cms.ContentInfo Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.cms.DigestedData getHighSpeedVideoFpsRangesFor;

    public boolean verify(org.bouncycastle.operator.DigestCalculatorProvider digestCalculatorProvider) throws org.bouncycastle.cms.CMSException {
        try {
            org.bouncycastle.asn1.cms.ContentInfo encapContentInfo = this.getHighSpeedVideoFpsRangesFor.getEncapContentInfo();
            org.bouncycastle.operator.DigestCalculator digestCalculator = digestCalculatorProvider.get(this.getHighSpeedVideoFpsRangesFor.getDigestAlgorithm());
            digestCalculator.getOutputStream().write(((org.bouncycastle.asn1.ASN1OctetString) encapContentInfo.getContent()).getOctets());
            return org.bouncycastle.util.Arrays.areEqual(this.getHighSpeedVideoFpsRangesFor.getDigest(), digestCalculator.getDigest());
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable process content: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cms.CMSException(sb.toString(), e);
        } catch (org.bouncycastle.operator.OperatorCreationException e2) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("unable to create digest calculator: ");
            sb2.append(e2.getMessage());
            throw new org.bouncycastle.cms.CMSException(sb2.toString(), e2);
        }
    }

    public org.bouncycastle.asn1.cms.ContentInfo toASN1Structure() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() throws java.io.IOException {
        return this.Camera2StreamConfigurationMap.getEncoded();
    }

    public org.bouncycastle.cms.CMSProcessable getDigestedContent() throws org.bouncycastle.cms.CMSException {
        org.bouncycastle.asn1.cms.ContentInfo encapContentInfo = this.getHighSpeedVideoFpsRangesFor.getEncapContentInfo();
        try {
            return new org.bouncycastle.cms.CMSProcessableByteArray(encapContentInfo.getContentType(), ((org.bouncycastle.asn1.ASN1OctetString) encapContentInfo.getContent()).getOctets());
        } catch (java.lang.Exception e) {
            throw new org.bouncycastle.cms.CMSException("exception reading digested stream.", e);
        }
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getDigestAlgorithm() {
        return this.getHighSpeedVideoFpsRangesFor.getDigestAlgorithm();
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getContentType() {
        return this.Camera2StreamConfigurationMap.getContentType();
    }

    public CMSDigestedData(byte[] bArr) throws org.bouncycastle.cms.CMSException {
        this(org.bouncycastle.cms.CMSUtils.getHighSpeedVideoFpsRangesFor(bArr));
    }

    public CMSDigestedData(org.bouncycastle.asn1.cms.ContentInfo contentInfo) throws org.bouncycastle.cms.CMSException {
        this.Camera2StreamConfigurationMap = contentInfo;
        try {
            this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.cms.DigestedData.getInstance(contentInfo.getContent());
        } catch (java.lang.ClassCastException e) {
            throw new org.bouncycastle.cms.CMSException("Malformed content.", e);
        } catch (java.lang.IllegalArgumentException e2) {
            throw new org.bouncycastle.cms.CMSException("Malformed content.", e2);
        }
    }

    public CMSDigestedData(java.io.InputStream inputStream) throws org.bouncycastle.cms.CMSException {
        this(org.bouncycastle.cms.CMSUtils.getHighSpeedVideoFpsRangesFor(inputStream));
    }
}
