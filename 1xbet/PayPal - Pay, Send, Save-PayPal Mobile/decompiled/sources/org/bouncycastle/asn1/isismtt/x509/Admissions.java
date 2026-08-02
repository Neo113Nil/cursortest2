package org.bouncycastle.asn1.isismtt.x509;

/* loaded from: classes17.dex */
public class Admissions extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1Sequence getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.x509.GeneralName getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.isismtt.x509.NamingAuthority getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
        org.bouncycastle.asn1.x509.GeneralName generalName = this.getHighSpeedVideoFpsRanges;
        if (generalName != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 0, (org.bouncycastle.asn1.ASN1Encodable) generalName));
        }
        org.bouncycastle.asn1.isismtt.x509.NamingAuthority namingAuthority = this.getHighSpeedVideoSizes;
        if (namingAuthority != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 1, (org.bouncycastle.asn1.ASN1Encodable) namingAuthority));
        }
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.isismtt.x509.ProfessionInfo[] getProfessionInfos() {
        org.bouncycastle.asn1.isismtt.x509.ProfessionInfo[] professionInfoArr = new org.bouncycastle.asn1.isismtt.x509.ProfessionInfo[this.getHighResolutionOutputSizeshNQ4ISI.size()];
        java.util.Enumeration objects = this.getHighResolutionOutputSizeshNQ4ISI.getObjects();
        int i = 0;
        while (objects.hasMoreElements()) {
            professionInfoArr[i] = org.bouncycastle.asn1.isismtt.x509.ProfessionInfo.getInstance(objects.nextElement());
            i++;
        }
        return professionInfoArr;
    }

    public org.bouncycastle.asn1.isismtt.x509.NamingAuthority getNamingAuthority() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.x509.GeneralName getAdmissionAuthority() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public static org.bouncycastle.asn1.isismtt.x509.Admissions getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.isismtt.x509.Admissions)) {
            return (org.bouncycastle.asn1.isismtt.x509.Admissions) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1Sequence) {
            return new org.bouncycastle.asn1.isismtt.x509.Admissions((org.bouncycastle.asn1.ASN1Sequence) obj);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("illegal object in getInstance: ");
        sb.append(obj.getClass().getName());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public Admissions(org.bouncycastle.asn1.x509.GeneralName generalName, org.bouncycastle.asn1.isismtt.x509.NamingAuthority namingAuthority, org.bouncycastle.asn1.isismtt.x509.ProfessionInfo[] professionInfoArr) {
        this.getHighSpeedVideoFpsRanges = generalName;
        this.getHighSpeedVideoSizes = namingAuthority;
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.DERSequence(professionInfoArr);
    }

    private Admissions(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() > 3) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Bad sequence size: ");
            sb.append(aSN1Sequence.size());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        org.bouncycastle.asn1.ASN1Encodable aSN1Encodable = (org.bouncycastle.asn1.ASN1Encodable) objects.nextElement();
        if (aSN1Encodable instanceof org.bouncycastle.asn1.ASN1TaggedObject) {
            org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = (org.bouncycastle.asn1.ASN1TaggedObject) aSN1Encodable;
            int tagNo = aSN1TaggedObject.getTagNo();
            if (tagNo == 0) {
                this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.x509.GeneralName.getInstance(aSN1TaggedObject, true);
            } else {
                if (tagNo != 1) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Bad tag number: ");
                    sb2.append(aSN1TaggedObject.getTagNo());
                    throw new java.lang.IllegalArgumentException(sb2.toString());
                }
                this.getHighSpeedVideoSizes = org.bouncycastle.asn1.isismtt.x509.NamingAuthority.getInstance(aSN1TaggedObject, true);
            }
            aSN1Encodable = (org.bouncycastle.asn1.ASN1Encodable) objects.nextElement();
        }
        if (aSN1Encodable instanceof org.bouncycastle.asn1.ASN1TaggedObject) {
            org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject2 = (org.bouncycastle.asn1.ASN1TaggedObject) aSN1Encodable;
            if (aSN1TaggedObject2.getTagNo() != 1) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Bad tag number: ");
                sb3.append(aSN1TaggedObject2.getTagNo());
                throw new java.lang.IllegalArgumentException(sb3.toString());
            }
            this.getHighSpeedVideoSizes = org.bouncycastle.asn1.isismtt.x509.NamingAuthority.getInstance(aSN1TaggedObject2, true);
            aSN1Encodable = (org.bouncycastle.asn1.ASN1Encodable) objects.nextElement();
        }
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1Encodable);
        if (objects.hasMoreElements()) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Bad object encountered: ");
            sb4.append(objects.nextElement().getClass());
            throw new java.lang.IllegalArgumentException(sb4.toString());
        }
    }
}
