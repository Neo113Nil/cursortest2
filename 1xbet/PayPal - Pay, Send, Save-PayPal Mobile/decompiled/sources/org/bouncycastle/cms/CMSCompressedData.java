package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public class CMSCompressedData implements org.bouncycastle.util.Encodable {
    org.bouncycastle.asn1.cms.CompressedData Camera2StreamConfigurationMap;
    org.bouncycastle.asn1.cms.ContentInfo getHighSpeedVideoFpsRanges;

    public org.bouncycastle.asn1.cms.ContentInfo toASN1Structure() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() throws java.io.IOException {
        return this.getHighSpeedVideoFpsRanges.getEncoded();
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getContentType() {
        return this.getHighSpeedVideoFpsRanges.getContentType();
    }

    public org.bouncycastle.cms.CMSTypedStream getContentStream(org.bouncycastle.operator.InputExpanderProvider inputExpanderProvider) {
        org.bouncycastle.asn1.cms.ContentInfo encapContentInfo = this.Camera2StreamConfigurationMap.getEncapContentInfo();
        return new org.bouncycastle.cms.CMSTypedStream(encapContentInfo.getContentType(), inputExpanderProvider.get(this.Camera2StreamConfigurationMap.getCompressionAlgorithmIdentifier()).getInputStream(((org.bouncycastle.asn1.ASN1OctetString) encapContentInfo.getContent()).getOctetStream()));
    }

    public byte[] getContent(org.bouncycastle.operator.InputExpanderProvider inputExpanderProvider) throws org.bouncycastle.cms.CMSException {
        try {
            return org.bouncycastle.cms.CMSUtils.getHighSpeedVideoSizes(inputExpanderProvider.get(this.Camera2StreamConfigurationMap.getCompressionAlgorithmIdentifier()).getInputStream(((org.bouncycastle.asn1.ASN1OctetString) this.Camera2StreamConfigurationMap.getEncapContentInfo().getContent()).getOctetStream()));
        } catch (java.io.IOException e) {
            throw new org.bouncycastle.cms.CMSException("exception reading compressed stream.", e);
        }
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getCompressedContentType() {
        return this.Camera2StreamConfigurationMap.getEncapContentInfo().getContentType();
    }

    public CMSCompressedData(byte[] bArr) throws org.bouncycastle.cms.CMSException {
        this(org.bouncycastle.cms.CMSUtils.getHighSpeedVideoFpsRangesFor(bArr));
    }

    public CMSCompressedData(org.bouncycastle.asn1.cms.ContentInfo contentInfo) throws org.bouncycastle.cms.CMSException {
        this.getHighSpeedVideoFpsRanges = contentInfo;
        try {
            this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.cms.CompressedData.getInstance(contentInfo.getContent());
        } catch (java.lang.ClassCastException e) {
            throw new org.bouncycastle.cms.CMSException("Malformed content.", e);
        } catch (java.lang.IllegalArgumentException e2) {
            throw new org.bouncycastle.cms.CMSException("Malformed content.", e2);
        }
    }

    public CMSCompressedData(java.io.InputStream inputStream) throws org.bouncycastle.cms.CMSException {
        this(org.bouncycastle.cms.CMSUtils.getHighSpeedVideoFpsRangesFor(inputStream));
    }
}
