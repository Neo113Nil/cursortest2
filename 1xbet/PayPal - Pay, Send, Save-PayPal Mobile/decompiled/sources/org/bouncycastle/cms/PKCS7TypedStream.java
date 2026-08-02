package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public class PKCS7TypedStream extends org.bouncycastle.cms.CMSTypedStream {
    private final org.bouncycastle.asn1.ASN1Encodable getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.cms.CMSTypedStream
    public java.io.InputStream getContentStream() {
        byte b;
        try {
            byte[] encoded = this.getHighSpeedVideoFpsRanges.toASN1Primitive().getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER);
            int i = 1;
            if ((encoded[0] & com.google.common.base.Ascii.US) == 31) {
                do {
                    b = encoded[i];
                    i++;
                } while ((b & 128) != 0);
            }
            int i2 = i + 1;
            byte b2 = encoded[i];
            if ((b2 & 128) != 0) {
                i2 += b2 & Byte.MAX_VALUE;
            }
            return new java.io.ByteArrayInputStream(encoded, i2, encoded.length - i2);
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to convert content to stream: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cms.CMSRuntimeException(sb.toString(), e);
        }
    }

    public org.bouncycastle.asn1.ASN1Encodable getContent() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // org.bouncycastle.cms.CMSTypedStream
    public void drain() throws java.io.IOException {
        this.getHighSpeedVideoFpsRanges.toASN1Primitive();
    }

    public PKCS7TypedStream(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) throws java.io.IOException {
        super(aSN1ObjectIdentifier);
        this.getHighSpeedVideoFpsRanges = aSN1Encodable;
    }
}
