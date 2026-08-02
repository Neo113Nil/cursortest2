package org.bouncycastle.asn1.isismtt.x509;

/* loaded from: classes17.dex */
public class AdmissionSyntax extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.x509.GeneralName getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        org.bouncycastle.asn1.x509.GeneralName generalName = this.getHighResolutionOutputSizeshNQ4ISI;
        if (generalName != null) {
            aSN1EncodableVector.add(generalName);
        }
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.isismtt.x509.Admissions[] getContentsOfAdmissions() {
        org.bouncycastle.asn1.isismtt.x509.Admissions[] admissionsArr = new org.bouncycastle.asn1.isismtt.x509.Admissions[this.getHighSpeedVideoSizes.size()];
        java.util.Enumeration objects = this.getHighSpeedVideoSizes.getObjects();
        int i = 0;
        while (objects.hasMoreElements()) {
            admissionsArr[i] = org.bouncycastle.asn1.isismtt.x509.Admissions.getInstance(objects.nextElement());
            i++;
        }
        return admissionsArr;
    }

    public org.bouncycastle.asn1.x509.GeneralName getAdmissionAuthority() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.bouncycastle.asn1.isismtt.x509.AdmissionSyntax getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.isismtt.x509.AdmissionSyntax)) {
            return (org.bouncycastle.asn1.isismtt.x509.AdmissionSyntax) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1Sequence) {
            return new org.bouncycastle.asn1.isismtt.x509.AdmissionSyntax((org.bouncycastle.asn1.ASN1Sequence) obj);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("illegal object in getInstance: ");
        sb.append(obj.getClass().getName());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public AdmissionSyntax(org.bouncycastle.asn1.x509.GeneralName generalName, org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighResolutionOutputSizeshNQ4ISI = generalName;
        this.getHighSpeedVideoSizes = aSN1Sequence;
    }

    private AdmissionSyntax(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        org.bouncycastle.asn1.ASN1Encodable objectAt;
        int size = aSN1Sequence.size();
        if (size == 1) {
            objectAt = aSN1Sequence.getObjectAt(0);
        } else {
            if (size != 2) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Bad sequence size: ");
                sb.append(aSN1Sequence.size());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.x509.GeneralName.getInstance(aSN1Sequence.getObjectAt(0));
            objectAt = aSN1Sequence.getObjectAt(1);
        }
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.DERSequence.getInstance(objectAt);
    }
}
