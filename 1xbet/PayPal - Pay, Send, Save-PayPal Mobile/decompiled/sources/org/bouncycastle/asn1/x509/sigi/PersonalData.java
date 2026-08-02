package org.bouncycastle.asn1.x509.sigi;

/* loaded from: classes17.dex */
public class PersonalData extends org.bouncycastle.asn1.ASN1Object {
    private java.lang.String Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.ASN1GeneralizedTime getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.x509.sigi.NameOrPseudonym getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.x500.DirectoryString getHighSpeedVideoFpsRangesFor;
    private java.math.BigInteger getHighSpeedVideoSizes;
    private org.bouncycastle.asn1.x500.DirectoryString getOutputFormats;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(6);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        if (this.getHighSpeedVideoSizes != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 0, (org.bouncycastle.asn1.ASN1Encodable) new org.bouncycastle.asn1.ASN1Integer(this.getHighSpeedVideoSizes)));
        }
        org.bouncycastle.asn1.ASN1GeneralizedTime aSN1GeneralizedTime = this.getHighResolutionOutputSizeshNQ4ISI;
        if (aSN1GeneralizedTime != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 1, (org.bouncycastle.asn1.ASN1Encodable) aSN1GeneralizedTime));
        }
        org.bouncycastle.asn1.x500.DirectoryString directoryString = this.getHighSpeedVideoFpsRangesFor;
        if (directoryString != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 2, (org.bouncycastle.asn1.ASN1Encodable) directoryString));
        }
        if (this.Camera2StreamConfigurationMap != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 3, (org.bouncycastle.asn1.ASN1Encodable) new org.bouncycastle.asn1.DERPrintableString(this.Camera2StreamConfigurationMap, true)));
        }
        org.bouncycastle.asn1.x500.DirectoryString directoryString2 = this.getOutputFormats;
        if (directoryString2 != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 4, (org.bouncycastle.asn1.ASN1Encodable) directoryString2));
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.x500.DirectoryString getPostalAddress() {
        return this.getOutputFormats;
    }

    public org.bouncycastle.asn1.x500.DirectoryString getPlaceOfBirth() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.x509.sigi.NameOrPseudonym getNameOrPseudonym() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public java.math.BigInteger getNameDistinguisher() {
        return this.getHighSpeedVideoSizes;
    }

    public java.lang.String getGender() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.ASN1GeneralizedTime getDateOfBirth() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.bouncycastle.asn1.x509.sigi.PersonalData getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.x509.sigi.PersonalData)) {
            return (org.bouncycastle.asn1.x509.sigi.PersonalData) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1Sequence) {
            return new org.bouncycastle.asn1.x509.sigi.PersonalData((org.bouncycastle.asn1.ASN1Sequence) obj);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("illegal object in getInstance: ");
        sb.append(obj.getClass().getName());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public PersonalData(org.bouncycastle.asn1.x509.sigi.NameOrPseudonym nameOrPseudonym, java.math.BigInteger bigInteger, org.bouncycastle.asn1.ASN1GeneralizedTime aSN1GeneralizedTime, org.bouncycastle.asn1.x500.DirectoryString directoryString, java.lang.String str, org.bouncycastle.asn1.x500.DirectoryString directoryString2) {
        this.getHighSpeedVideoFpsRanges = nameOrPseudonym;
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1GeneralizedTime;
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoSizes = bigInteger;
        this.getOutputFormats = directoryString2;
        this.getHighSpeedVideoFpsRangesFor = directoryString;
    }

    private PersonalData(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() <= 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Bad sequence size: ");
            sb.append(aSN1Sequence.size());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.x509.sigi.NameOrPseudonym.getInstance(objects.nextElement());
        while (objects.hasMoreElements()) {
            org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = org.bouncycastle.asn1.ASN1TaggedObject.getInstance(objects.nextElement());
            int tagNo = aSN1TaggedObject.getTagNo();
            if (tagNo == 0) {
                this.getHighSpeedVideoSizes = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1TaggedObject, false).getValue();
            } else if (tagNo == 1) {
                this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1GeneralizedTime.getInstance(aSN1TaggedObject, false);
            } else if (tagNo == 2) {
                this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.x500.DirectoryString.getInstance(aSN1TaggedObject, true);
            } else if (tagNo == 3) {
                this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.ASN1PrintableString.getInstance(aSN1TaggedObject, false).getString();
            } else {
                if (tagNo != 4) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Bad tag number: ");
                    sb2.append(aSN1TaggedObject.getTagNo());
                    throw new java.lang.IllegalArgumentException(sb2.toString());
                }
                this.getOutputFormats = org.bouncycastle.asn1.x500.DirectoryString.getInstance(aSN1TaggedObject, true);
            }
        }
    }
}
