package org.bouncycastle.asn1.x500;

/* loaded from: classes17.dex */
public class RDN extends org.bouncycastle.asn1.ASN1Object {
    org.bouncycastle.asn1.ASN1Set Camera2StreamConfigurationMap;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.Camera2StreamConfigurationMap;
    }

    public int size() {
        return this.Camera2StreamConfigurationMap.size();
    }

    public boolean isMultiValued() {
        return this.Camera2StreamConfigurationMap.size() > 1;
    }

    public org.bouncycastle.asn1.x500.AttributeTypeAndValue[] getTypesAndValues() {
        int size = this.Camera2StreamConfigurationMap.size();
        org.bouncycastle.asn1.x500.AttributeTypeAndValue[] attributeTypeAndValueArr = new org.bouncycastle.asn1.x500.AttributeTypeAndValue[size];
        for (int i = 0; i != size; i++) {
            attributeTypeAndValueArr[i] = org.bouncycastle.asn1.x500.AttributeTypeAndValue.getInstance(this.Camera2StreamConfigurationMap.getObjectAt(i));
        }
        return attributeTypeAndValueArr;
    }

    public org.bouncycastle.asn1.x500.AttributeTypeAndValue getFirst() {
        if (this.Camera2StreamConfigurationMap.size() == 0) {
            return null;
        }
        return org.bouncycastle.asn1.x500.AttributeTypeAndValue.getInstance(this.Camera2StreamConfigurationMap.getObjectAt(0));
    }

    public static org.bouncycastle.asn1.x500.RDN getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.x500.RDN) {
            return (org.bouncycastle.asn1.x500.RDN) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.x500.RDN(org.bouncycastle.asn1.ASN1Set.getInstance(obj));
        }
        return null;
    }

    public RDN(org.bouncycastle.asn1.x500.AttributeTypeAndValue[] attributeTypeAndValueArr) {
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.DERSet(attributeTypeAndValueArr);
    }

    public RDN(org.bouncycastle.asn1.x500.AttributeTypeAndValue attributeTypeAndValue) {
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.DERSet(attributeTypeAndValue);
    }

    private RDN(org.bouncycastle.asn1.ASN1Set aSN1Set) {
        this.Camera2StreamConfigurationMap = aSN1Set;
    }

    public RDN(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(aSN1ObjectIdentifier);
        aSN1EncodableVector.add(aSN1Encodable);
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.DERSet(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector));
    }
}
