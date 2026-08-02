package org.bouncycastle.asn1.x9;

/* loaded from: classes17.dex */
public class DHValidationParms extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1BitString getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1BitString getSeed() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.ASN1Integer getPgenCounter() {
        return this.getHighSpeedVideoSizes;
    }

    public static org.bouncycastle.asn1.x9.DHValidationParms getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.x9.DHValidationParms getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.x9.DHValidationParms) {
            return (org.bouncycastle.asn1.x9.DHValidationParms) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.x9.DHValidationParms(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private DHValidationParms(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() == 2) {
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.DERBitString.getInstance((java.lang.Object) aSN1Sequence.getObjectAt(0));
            this.getHighSpeedVideoSizes = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(1));
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Bad sequence size: ");
            sb.append(aSN1Sequence.size());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }

    public DHValidationParms(org.bouncycastle.asn1.ASN1BitString aSN1BitString, org.bouncycastle.asn1.ASN1Integer aSN1Integer) {
        if (aSN1BitString == null) {
            throw new java.lang.IllegalArgumentException("'seed' cannot be null");
        }
        if (aSN1Integer == null) {
            throw new java.lang.IllegalArgumentException("'pgenCounter' cannot be null");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1BitString;
        this.getHighSpeedVideoSizes = aSN1Integer;
    }
}
