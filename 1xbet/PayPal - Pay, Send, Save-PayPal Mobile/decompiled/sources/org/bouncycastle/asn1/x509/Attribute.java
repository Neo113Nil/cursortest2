package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class Attribute extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1Set Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.ASN1ObjectIdentifier getHighResolutionOutputSizeshNQ4ISI;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1Encodable[] getAttributeValues() {
        return this.Camera2StreamConfigurationMap.toArray();
    }

    public org.bouncycastle.asn1.ASN1Set getAttrValues() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getAttrType() {
        return new org.bouncycastle.asn1.ASN1ObjectIdentifier(this.getHighResolutionOutputSizeshNQ4ISI.getId());
    }

    public static org.bouncycastle.asn1.x509.Attribute getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.x509.Attribute) {
            return (org.bouncycastle.asn1.x509.Attribute) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.x509.Attribute(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private Attribute(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() == 2) {
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
            this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.ASN1Set.getInstance(aSN1Sequence.getObjectAt(1));
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Bad sequence size: ");
            sb.append(aSN1Sequence.size());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }

    public Attribute(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Set aSN1Set) {
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1ObjectIdentifier;
        this.Camera2StreamConfigurationMap = aSN1Set;
    }
}
