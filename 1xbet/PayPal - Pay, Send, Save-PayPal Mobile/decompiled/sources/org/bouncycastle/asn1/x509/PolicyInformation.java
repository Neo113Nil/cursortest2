package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class PolicyInformation extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1ObjectIdentifier getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoFpsRangesFor;

    public java.lang.String toString() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Policy information: ");
        stringBuffer.append(this.getHighResolutionOutputSizeshNQ4ISI);
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer();
            for (int i = 0; i < this.getHighSpeedVideoFpsRangesFor.size(); i++) {
                if (stringBuffer2.length() != 0) {
                    stringBuffer2.append(", ");
                }
                stringBuffer2.append(org.bouncycastle.asn1.x509.PolicyQualifierInfo.getInstance(this.getHighSpeedVideoFpsRangesFor.getObjectAt(i)));
            }
            stringBuffer.append("[");
            stringBuffer.append(stringBuffer2);
            stringBuffer.append("]");
        }
        return stringBuffer.toString();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = this.getHighSpeedVideoFpsRangesFor;
        if (aSN1Sequence != null) {
            aSN1EncodableVector.add(aSN1Sequence);
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1Sequence getPolicyQualifiers() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getPolicyIdentifier() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.bouncycastle.asn1.x509.PolicyInformation getInstance(java.lang.Object obj) {
        return (obj == null || (obj instanceof org.bouncycastle.asn1.x509.PolicyInformation)) ? (org.bouncycastle.asn1.x509.PolicyInformation) obj : new org.bouncycastle.asn1.x509.PolicyInformation(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
    }

    private PolicyInformation(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() <= 0 || aSN1Sequence.size() > 2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Bad sequence size: ");
            sb.append(aSN1Sequence.size());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        if (aSN1Sequence.size() > 1) {
            this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(1));
        }
    }

    public PolicyInformation(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1ObjectIdentifier;
        this.getHighSpeedVideoFpsRangesFor = aSN1Sequence;
    }

    public PolicyInformation(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1ObjectIdentifier;
    }
}
