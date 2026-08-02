package org.bouncycastle.asn1.x509.qualified;

/* loaded from: classes17.dex */
public class SemanticsInformation extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.x509.GeneralName[] getHighSpeedVideoSizes;

    public SemanticsInformation(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.x509.GeneralName[] generalNameArr) {
        org.bouncycastle.asn1.x509.GeneralName[] generalNameArr2;
        this.getHighSpeedVideoFpsRanges = aSN1ObjectIdentifier;
        if (generalNameArr != null) {
            generalNameArr2 = new org.bouncycastle.asn1.x509.GeneralName[generalNameArr.length];
            java.lang.System.arraycopy(generalNameArr, 0, generalNameArr2, 0, generalNameArr.length);
        } else {
            generalNameArr2 = null;
        }
        this.getHighSpeedVideoSizes = generalNameArr2;
    }

    public SemanticsInformation(org.bouncycastle.asn1.x509.GeneralName[] generalNameArr) {
        org.bouncycastle.asn1.x509.GeneralName[] generalNameArr2 = null;
        this.getHighSpeedVideoFpsRanges = null;
        if (generalNameArr != null) {
            generalNameArr2 = new org.bouncycastle.asn1.x509.GeneralName[generalNameArr.length];
            java.lang.System.arraycopy(generalNameArr, 0, generalNameArr2, 0, generalNameArr.length);
        }
        this.getHighSpeedVideoSizes = generalNameArr2;
    }

    public org.bouncycastle.asn1.x509.GeneralName[] getNameRegistrationAuthorities() {
        org.bouncycastle.asn1.x509.GeneralName[] generalNameArr = this.getHighSpeedVideoSizes;
        if (generalNameArr == null) {
            return null;
        }
        org.bouncycastle.asn1.x509.GeneralName[] generalNameArr2 = new org.bouncycastle.asn1.x509.GeneralName[generalNameArr.length];
        java.lang.System.arraycopy(generalNameArr, 0, generalNameArr2, 0, generalNameArr.length);
        return generalNameArr2;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = this.getHighSpeedVideoFpsRanges;
        if (aSN1ObjectIdentifier != null) {
            aSN1EncodableVector.add(aSN1ObjectIdentifier);
        }
        if (this.getHighSpeedVideoSizes != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERSequence(this.getHighSpeedVideoSizes));
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getSemanticsIdentifier() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public static org.bouncycastle.asn1.x509.qualified.SemanticsInformation getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.x509.qualified.SemanticsInformation) {
            return (org.bouncycastle.asn1.x509.qualified.SemanticsInformation) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.x509.qualified.SemanticsInformation(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private SemanticsInformation(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        if (aSN1Sequence.size() <= 0) {
            throw new java.lang.IllegalArgumentException("no objects in SemanticsInformation");
        }
        java.lang.Object nextElement = objects.nextElement();
        if (nextElement instanceof org.bouncycastle.asn1.ASN1ObjectIdentifier) {
            this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(nextElement);
            nextElement = objects.hasMoreElements() ? objects.nextElement() : null;
        }
        if (nextElement != null) {
            org.bouncycastle.asn1.ASN1Sequence aSN1Sequence2 = org.bouncycastle.asn1.ASN1Sequence.getInstance(nextElement);
            this.getHighSpeedVideoSizes = new org.bouncycastle.asn1.x509.GeneralName[aSN1Sequence2.size()];
            for (int i = 0; i < aSN1Sequence2.size(); i++) {
                this.getHighSpeedVideoSizes[i] = org.bouncycastle.asn1.x509.GeneralName.getInstance(aSN1Sequence2.getObjectAt(i));
            }
        }
    }

    public SemanticsInformation(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.getHighSpeedVideoFpsRanges = aSN1ObjectIdentifier;
        this.getHighSpeedVideoSizes = null;
    }
}
