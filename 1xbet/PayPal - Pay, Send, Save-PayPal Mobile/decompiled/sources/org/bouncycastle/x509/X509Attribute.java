package org.bouncycastle.x509;

/* loaded from: classes17.dex */
public class X509Attribute extends org.bouncycastle.asn1.ASN1Object {
    org.bouncycastle.asn1.x509.Attribute getHighResolutionOutputSizeshNQ4ISI;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.getHighResolutionOutputSizeshNQ4ISI.toASN1Primitive();
    }

    public org.bouncycastle.asn1.ASN1Encodable[] getValues() {
        org.bouncycastle.asn1.ASN1Set attrValues = this.getHighResolutionOutputSizeshNQ4ISI.getAttrValues();
        org.bouncycastle.asn1.ASN1Encodable[] aSN1EncodableArr = new org.bouncycastle.asn1.ASN1Encodable[attrValues.size()];
        for (int i = 0; i != attrValues.size(); i++) {
            aSN1EncodableArr[i] = attrValues.getObjectAt(i);
        }
        return aSN1EncodableArr;
    }

    public java.lang.String getOID() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getAttrType().getId();
    }

    X509Attribute(org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.x509.Attribute.getInstance(aSN1Encodable);
    }

    public X509Attribute(java.lang.String str, org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector) {
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.x509.Attribute(new org.bouncycastle.asn1.ASN1ObjectIdentifier(str), new org.bouncycastle.asn1.DERSet(aSN1EncodableVector));
    }

    public X509Attribute(java.lang.String str, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.x509.Attribute(new org.bouncycastle.asn1.ASN1ObjectIdentifier(str), new org.bouncycastle.asn1.DERSet(aSN1Encodable));
    }
}
