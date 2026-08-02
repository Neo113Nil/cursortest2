package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class PolicyConstraints extends org.bouncycastle.asn1.ASN1Object {
    private java.math.BigInteger Camera2StreamConfigurationMap;
    private java.math.BigInteger getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        if (this.Camera2StreamConfigurationMap != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 0, (org.bouncycastle.asn1.ASN1Encodable) new org.bouncycastle.asn1.ASN1Integer(this.Camera2StreamConfigurationMap)));
        }
        if (this.getHighSpeedVideoSizes != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 1, (org.bouncycastle.asn1.ASN1Encodable) new org.bouncycastle.asn1.ASN1Integer(this.getHighSpeedVideoSizes)));
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public java.math.BigInteger getRequireExplicitPolicyMapping() {
        return this.Camera2StreamConfigurationMap;
    }

    public java.math.BigInteger getInhibitPolicyMapping() {
        return this.getHighSpeedVideoSizes;
    }

    public static org.bouncycastle.asn1.x509.PolicyConstraints getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.x509.PolicyConstraints) {
            return (org.bouncycastle.asn1.x509.PolicyConstraints) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.x509.PolicyConstraints(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public static org.bouncycastle.asn1.x509.PolicyConstraints fromExtensions(org.bouncycastle.asn1.x509.Extensions extensions) {
        return getInstance(org.bouncycastle.asn1.x509.Extensions.getExtensionParsedValue(extensions, org.bouncycastle.asn1.x509.Extension.policyConstraints));
    }

    private PolicyConstraints(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        for (int i = 0; i != aSN1Sequence.size(); i++) {
            org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = org.bouncycastle.asn1.ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(i));
            if (aSN1TaggedObject.getTagNo() == 0) {
                this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1TaggedObject, false).getValue();
            } else {
                if (aSN1TaggedObject.getTagNo() != 1) {
                    throw new java.lang.IllegalArgumentException("Unknown tag encountered.");
                }
                this.getHighSpeedVideoSizes = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1TaggedObject, false).getValue();
            }
        }
    }

    public PolicyConstraints(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
        this.Camera2StreamConfigurationMap = bigInteger;
        this.getHighSpeedVideoSizes = bigInteger2;
    }
}
