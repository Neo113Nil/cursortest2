package org.bouncycastle.asn1.isismtt.x509;

/* loaded from: classes17.dex */
public class DeclarationOfMajority extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.asn1.ASN1Choice {
    public static final int dateOfBirth = 2;
    public static final int fullAgeAtCountry = 1;
    public static final int notYoungerThan = 0;
    private org.bouncycastle.asn1.ASN1TaggedObject getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public int notYoungerThan() {
        if (this.getHighSpeedVideoFpsRangesFor.getTagNo() != 0) {
            return -1;
        }
        return org.bouncycastle.asn1.ASN1Integer.getInstance(this.getHighSpeedVideoFpsRangesFor, false).intValueExact();
    }

    public int getType() {
        return this.getHighSpeedVideoFpsRangesFor.getTagNo();
    }

    public org.bouncycastle.asn1.ASN1GeneralizedTime getDateOfBirth() {
        if (this.getHighSpeedVideoFpsRangesFor.getTagNo() != 2) {
            return null;
        }
        return org.bouncycastle.asn1.ASN1GeneralizedTime.getInstance(this.getHighSpeedVideoFpsRangesFor, false);
    }

    public org.bouncycastle.asn1.ASN1Sequence fullAgeAtCountry() {
        if (this.getHighSpeedVideoFpsRangesFor.getTagNo() != 1) {
            return null;
        }
        return org.bouncycastle.asn1.ASN1Sequence.getInstance(this.getHighSpeedVideoFpsRangesFor, false);
    }

    public static org.bouncycastle.asn1.isismtt.x509.DeclarationOfMajority getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.isismtt.x509.DeclarationOfMajority)) {
            return (org.bouncycastle.asn1.isismtt.x509.DeclarationOfMajority) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1TaggedObject) {
            return new org.bouncycastle.asn1.isismtt.x509.DeclarationOfMajority((org.bouncycastle.asn1.ASN1TaggedObject) obj);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("illegal object in getInstance: ");
        sb.append(obj.getClass().getName());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public DeclarationOfMajority(boolean z, java.lang.String str) {
        if (str.length() > 2) {
            throw new java.lang.IllegalArgumentException("country can only be 2 characters");
        }
        if (z) {
            this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.DERTaggedObject(false, 1, (org.bouncycastle.asn1.ASN1Encodable) new org.bouncycastle.asn1.DERSequence(new org.bouncycastle.asn1.DERPrintableString(str, true)));
            return;
        }
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(org.bouncycastle.asn1.ASN1Boolean.FALSE);
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DERPrintableString(str, true));
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.DERTaggedObject(false, 1, (org.bouncycastle.asn1.ASN1Encodable) new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector));
    }

    private DeclarationOfMajority(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject) {
        if (aSN1TaggedObject.getTagNo() <= 2) {
            this.getHighSpeedVideoFpsRangesFor = aSN1TaggedObject;
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Bad tag number: ");
            sb.append(aSN1TaggedObject.getTagNo());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }

    public DeclarationOfMajority(org.bouncycastle.asn1.ASN1GeneralizedTime aSN1GeneralizedTime) {
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.DERTaggedObject(false, 2, (org.bouncycastle.asn1.ASN1Encodable) aSN1GeneralizedTime);
    }

    public DeclarationOfMajority(int i) {
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.DERTaggedObject(false, 0, (org.bouncycastle.asn1.ASN1Encodable) new org.bouncycastle.asn1.ASN1Integer(i));
    }
}
