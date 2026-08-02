package org.bouncycastle.asn1.tsp;

/* loaded from: classes17.dex */
public class EncryptionInfo extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1ObjectIdentifier Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.ASN1Encodable getHighResolutionOutputSizeshNQ4ISI;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        return new org.bouncycastle.asn1.DLSequence(aSN1EncodableVector);
    }

    public static org.bouncycastle.asn1.tsp.EncryptionInfo getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.tsp.EncryptionInfo getInstance(org.bouncycastle.asn1.ASN1Object aSN1Object) {
        if (aSN1Object instanceof org.bouncycastle.asn1.tsp.EncryptionInfo) {
            return (org.bouncycastle.asn1.tsp.EncryptionInfo) aSN1Object;
        }
        if (aSN1Object != null) {
            return new org.bouncycastle.asn1.tsp.EncryptionInfo(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1Object));
        }
        return null;
    }

    private EncryptionInfo(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() == 2) {
            this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
            this.getHighResolutionOutputSizeshNQ4ISI = aSN1Sequence.getObjectAt(1);
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("wrong sequence size in constructor: ");
            sb.append(aSN1Sequence.size());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }

    public EncryptionInfo(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.Camera2StreamConfigurationMap = aSN1ObjectIdentifier;
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1Encodable;
    }
}
