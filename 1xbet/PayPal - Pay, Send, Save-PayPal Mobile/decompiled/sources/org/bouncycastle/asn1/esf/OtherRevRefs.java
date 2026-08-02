package org.bouncycastle.asn1.esf;

/* loaded from: classes17.dex */
public class OtherRevRefs extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1Encodable Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.ASN1ObjectIdentifier getHighResolutionOutputSizeshNQ4ISI;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1Encodable getOtherRevRefs() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getOtherRevRefType() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.bouncycastle.asn1.esf.OtherRevRefs getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.esf.OtherRevRefs) {
            return (org.bouncycastle.asn1.esf.OtherRevRefs) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.esf.OtherRevRefs(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private OtherRevRefs(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Bad sequence size: ");
            sb.append(aSN1Sequence.size());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.ASN1ObjectIdentifier(((org.bouncycastle.asn1.ASN1ObjectIdentifier) aSN1Sequence.getObjectAt(0)).getId());
        try {
            this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.ASN1Primitive.fromByteArray(aSN1Sequence.getObjectAt(1).toASN1Primitive().getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER));
        } catch (java.io.IOException unused) {
            throw new java.lang.IllegalStateException();
        }
    }

    public OtherRevRefs(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1ObjectIdentifier;
        this.Camera2StreamConfigurationMap = aSN1Encodable;
    }
}
