package org.bouncycastle.asn1.esf;

/* loaded from: classes17.dex */
public class SignerLocation extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1Sequence getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.x500.DirectoryString getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.x500.DirectoryString getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
        org.bouncycastle.asn1.x500.DirectoryString directoryString = this.getHighSpeedVideoFpsRanges;
        if (directoryString != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 0, (org.bouncycastle.asn1.ASN1Encodable) directoryString));
        }
        org.bouncycastle.asn1.x500.DirectoryString directoryString2 = this.getHighSpeedVideoFpsRangesFor;
        if (directoryString2 != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 1, (org.bouncycastle.asn1.ASN1Encodable) directoryString2));
        }
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = this.getHighResolutionOutputSizeshNQ4ISI;
        if (aSN1Sequence != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 2, (org.bouncycastle.asn1.ASN1Encodable) aSN1Sequence));
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1Sequence getPostalAddress() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.x500.DirectoryString[] getPostal() {
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = this.getHighResolutionOutputSizeshNQ4ISI;
        if (aSN1Sequence == null) {
            return null;
        }
        int size = aSN1Sequence.size();
        org.bouncycastle.asn1.x500.DirectoryString[] directoryStringArr = new org.bouncycastle.asn1.x500.DirectoryString[size];
        for (int i = 0; i != size; i++) {
            directoryStringArr[i] = org.bouncycastle.asn1.x500.DirectoryString.getInstance(this.getHighResolutionOutputSizeshNQ4ISI.getObjectAt(i));
        }
        return directoryStringArr;
    }

    public org.bouncycastle.asn1.DERUTF8String getLocalityName() {
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            return null;
        }
        return new org.bouncycastle.asn1.DERUTF8String(getLocality().getString());
    }

    public org.bouncycastle.asn1.x500.DirectoryString getLocality() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.DERUTF8String getCountryName() {
        if (this.getHighSpeedVideoFpsRanges == null) {
            return null;
        }
        return new org.bouncycastle.asn1.DERUTF8String(getCountry().getString());
    }

    public org.bouncycastle.asn1.x500.DirectoryString getCountry() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public static org.bouncycastle.asn1.esf.SignerLocation getInstance(java.lang.Object obj) {
        return (obj == null || (obj instanceof org.bouncycastle.asn1.esf.SignerLocation)) ? (org.bouncycastle.asn1.esf.SignerLocation) obj : new org.bouncycastle.asn1.esf.SignerLocation(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
    }

    public SignerLocation(org.bouncycastle.asn1.x500.DirectoryString directoryString, org.bouncycastle.asn1.x500.DirectoryString directoryString2, org.bouncycastle.asn1.x500.DirectoryString[] directoryStringArr) {
        this(directoryString, directoryString2, new org.bouncycastle.asn1.DERSequence(directoryStringArr));
    }

    private SignerLocation(org.bouncycastle.asn1.x500.DirectoryString directoryString, org.bouncycastle.asn1.x500.DirectoryString directoryString2, org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence != null && aSN1Sequence.size() > 6) {
            throw new java.lang.IllegalArgumentException("postal address must contain less than 6 strings");
        }
        this.getHighSpeedVideoFpsRanges = directoryString;
        this.getHighSpeedVideoFpsRangesFor = directoryString2;
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1Sequence;
    }

    public SignerLocation(org.bouncycastle.asn1.ASN1UTF8String aSN1UTF8String, org.bouncycastle.asn1.ASN1UTF8String aSN1UTF8String2, org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this(org.bouncycastle.asn1.x500.DirectoryString.getInstance(aSN1UTF8String), org.bouncycastle.asn1.x500.DirectoryString.getInstance(aSN1UTF8String2), aSN1Sequence);
    }

    private SignerLocation(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        while (objects.hasMoreElements()) {
            org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = (org.bouncycastle.asn1.ASN1TaggedObject) objects.nextElement();
            int tagNo = aSN1TaggedObject.getTagNo();
            if (tagNo == 0) {
                this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.x500.DirectoryString.getInstance(aSN1TaggedObject, true);
            } else if (tagNo == 1) {
                this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.x500.DirectoryString.getInstance(aSN1TaggedObject, true);
            } else {
                if (tagNo != 2) {
                    throw new java.lang.IllegalArgumentException("illegal tag");
                }
                org.bouncycastle.asn1.ASN1Sequence aSN1Sequence2 = aSN1TaggedObject.isExplicit() ? org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, true) : org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, false);
                this.getHighResolutionOutputSizeshNQ4ISI = aSN1Sequence2;
                if (aSN1Sequence2 != null && aSN1Sequence2.size() > 6) {
                    throw new java.lang.IllegalArgumentException("postal address must contain less than 6 strings");
                }
            }
        }
    }
}
