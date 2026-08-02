package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public class CMSCompressedDataParser extends org.bouncycastle.cms.CMSContentInfoParser {
    public org.bouncycastle.cms.CMSTypedStream getContent(org.bouncycastle.operator.InputExpanderProvider inputExpanderProvider) throws org.bouncycastle.cms.CMSException {
        try {
            org.bouncycastle.asn1.cms.CompressedDataParser compressedDataParser = new org.bouncycastle.asn1.cms.CompressedDataParser((org.bouncycastle.asn1.ASN1SequenceParser) this._contentInfo.getContent(16));
            org.bouncycastle.asn1.cms.ContentInfoParser encapContentInfo = compressedDataParser.getEncapContentInfo();
            return new org.bouncycastle.cms.CMSTypedStream(encapContentInfo.getContentType(), inputExpanderProvider.get(compressedDataParser.getCompressionAlgorithmIdentifier()).getInputStream(((org.bouncycastle.asn1.ASN1OctetStringParser) encapContentInfo.getContent(4)).getOctetStream()));
        } catch (java.io.IOException e) {
            throw new org.bouncycastle.cms.CMSException("IOException reading compressed content.", e);
        }
    }

    public CMSCompressedDataParser(byte[] bArr) throws org.bouncycastle.cms.CMSException {
        this(new java.io.ByteArrayInputStream(bArr));
    }

    public CMSCompressedDataParser(java.io.InputStream inputStream) throws org.bouncycastle.cms.CMSException {
        super(inputStream);
    }
}
