package org.bouncycastle.asn1.isismtt.x509;

/* loaded from: classes17.dex */
public class ProcurationSyntax extends org.bouncycastle.asn1.ASN1Object {
    private java.lang.String Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.x509.GeneralName getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.x500.DirectoryString getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.x509.IssuerSerial getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
        if (this.Camera2StreamConfigurationMap != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 1, (org.bouncycastle.asn1.ASN1Encodable) new org.bouncycastle.asn1.DERPrintableString(this.Camera2StreamConfigurationMap, true)));
        }
        org.bouncycastle.asn1.x500.DirectoryString directoryString = this.getHighSpeedVideoFpsRangesFor;
        if (directoryString != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 2, (org.bouncycastle.asn1.ASN1Encodable) directoryString));
        }
        org.bouncycastle.asn1.x509.GeneralName generalName = this.getHighSpeedVideoFpsRanges;
        aSN1EncodableVector.add(generalName != null ? new org.bouncycastle.asn1.DERTaggedObject(true, 3, (org.bouncycastle.asn1.ASN1Encodable) generalName) : new org.bouncycastle.asn1.DERTaggedObject(true, 3, (org.bouncycastle.asn1.ASN1Encodable) this.getHighSpeedVideoSizes));
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.x500.DirectoryString getTypeOfSubstitution() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.x509.GeneralName getThirdPerson() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public java.lang.String getCountry() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.x509.IssuerSerial getCertRef() {
        return this.getHighSpeedVideoSizes;
    }

    public static org.bouncycastle.asn1.isismtt.x509.ProcurationSyntax getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.isismtt.x509.ProcurationSyntax)) {
            return (org.bouncycastle.asn1.isismtt.x509.ProcurationSyntax) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1Sequence) {
            return new org.bouncycastle.asn1.isismtt.x509.ProcurationSyntax((org.bouncycastle.asn1.ASN1Sequence) obj);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("illegal object in getInstance: ");
        sb.append(obj.getClass().getName());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    private ProcurationSyntax(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() <= 0 || aSN1Sequence.size() > 3) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Bad sequence size: ");
            sb.append(aSN1Sequence.size());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        while (objects.hasMoreElements()) {
            org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = org.bouncycastle.asn1.ASN1TaggedObject.getInstance(objects.nextElement());
            int tagNo = aSN1TaggedObject.getTagNo();
            if (tagNo == 1) {
                this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.ASN1PrintableString.getInstance(aSN1TaggedObject, true).getString();
            } else if (tagNo == 2) {
                this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.x500.DirectoryString.getInstance(aSN1TaggedObject, true);
            } else {
                if (tagNo != 3) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Bad tag number: ");
                    sb2.append(aSN1TaggedObject.getTagNo());
                    throw new java.lang.IllegalArgumentException(sb2.toString());
                }
                org.bouncycastle.asn1.ASN1Primitive object = aSN1TaggedObject.getObject();
                if (object instanceof org.bouncycastle.asn1.ASN1TaggedObject) {
                    this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.x509.GeneralName.getInstance(object);
                } else {
                    this.getHighSpeedVideoSizes = org.bouncycastle.asn1.x509.IssuerSerial.getInstance(object);
                }
            }
        }
    }

    public ProcurationSyntax(java.lang.String str, org.bouncycastle.asn1.x500.DirectoryString directoryString, org.bouncycastle.asn1.x509.IssuerSerial issuerSerial) {
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoFpsRangesFor = directoryString;
        this.getHighSpeedVideoFpsRanges = null;
        this.getHighSpeedVideoSizes = issuerSerial;
    }

    public ProcurationSyntax(java.lang.String str, org.bouncycastle.asn1.x500.DirectoryString directoryString, org.bouncycastle.asn1.x509.GeneralName generalName) {
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoFpsRangesFor = directoryString;
        this.getHighSpeedVideoFpsRanges = generalName;
        this.getHighSpeedVideoSizes = null;
    }
}
