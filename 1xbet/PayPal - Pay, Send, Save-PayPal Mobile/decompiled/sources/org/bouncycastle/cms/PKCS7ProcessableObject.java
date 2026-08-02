package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public class PKCS7ProcessableObject implements org.bouncycastle.cms.CMSTypedData {
    private final org.bouncycastle.asn1.ASN1ObjectIdentifier getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.asn1.ASN1Encodable getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.cms.CMSProcessable
    public void write(java.io.OutputStream outputStream) throws java.io.IOException, org.bouncycastle.cms.CMSException {
        org.bouncycastle.asn1.ASN1Encodable aSN1Encodable = this.getHighSpeedVideoFpsRangesFor;
        if (aSN1Encodable instanceof org.bouncycastle.asn1.ASN1Sequence) {
            java.util.Iterator<org.bouncycastle.asn1.ASN1Encodable> it = org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1Encodable).iterator();
            while (it.hasNext()) {
                outputStream.write(it.next().toASN1Primitive().getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER));
            }
        } else {
            byte[] encoded = aSN1Encodable.toASN1Primitive().getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER);
            int i = 1;
            while ((encoded[i] & 255) > 127) {
                i++;
            }
            int i2 = i + 1;
            outputStream.write(encoded, i2, encoded.length - i2);
        }
    }

    @Override // org.bouncycastle.cms.CMSTypedData
    public org.bouncycastle.asn1.ASN1ObjectIdentifier getContentType() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // org.bouncycastle.cms.CMSProcessable
    public java.lang.Object getContent() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public PKCS7ProcessableObject(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1ObjectIdentifier;
        this.getHighSpeedVideoFpsRangesFor = aSN1Encodable;
    }
}
