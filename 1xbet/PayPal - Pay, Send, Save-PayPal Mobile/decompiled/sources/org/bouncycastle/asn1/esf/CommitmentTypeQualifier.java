package org.bouncycastle.asn1.esf;

/* loaded from: classes17.dex */
public class CommitmentTypeQualifier extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1Encodable Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.ASN1ObjectIdentifier getHighResolutionOutputSizeshNQ4ISI;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        org.bouncycastle.asn1.ASN1Encodable aSN1Encodable = this.Camera2StreamConfigurationMap;
        if (aSN1Encodable != null) {
            aSN1EncodableVector.add(aSN1Encodable);
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1Encodable getQualifier() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getCommitmentTypeIdentifier() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.bouncycastle.asn1.esf.CommitmentTypeQualifier getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.esf.CommitmentTypeQualifier) {
            return (org.bouncycastle.asn1.esf.CommitmentTypeQualifier) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.esf.CommitmentTypeQualifier(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private CommitmentTypeQualifier(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighResolutionOutputSizeshNQ4ISI = (org.bouncycastle.asn1.ASN1ObjectIdentifier) aSN1Sequence.getObjectAt(0);
        if (aSN1Sequence.size() > 1) {
            this.Camera2StreamConfigurationMap = aSN1Sequence.getObjectAt(1);
        }
    }

    public CommitmentTypeQualifier(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1ObjectIdentifier;
        this.Camera2StreamConfigurationMap = aSN1Encodable;
    }

    public CommitmentTypeQualifier(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this(aSN1ObjectIdentifier, null);
    }
}
