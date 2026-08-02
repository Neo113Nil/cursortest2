package org.bouncycastle.asn1.x500;

/* loaded from: classes17.dex */
public class DirectoryString extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.asn1.ASN1Choice, org.bouncycastle.asn1.ASN1String {
    private org.bouncycastle.asn1.ASN1String getHighSpeedVideoFpsRangesFor;

    public java.lang.String toString() {
        return this.getHighSpeedVideoFpsRangesFor.getString();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return ((org.bouncycastle.asn1.ASN1Encodable) this.getHighSpeedVideoFpsRangesFor).toASN1Primitive();
    }

    @Override // org.bouncycastle.asn1.ASN1String
    public java.lang.String getString() {
        return this.getHighSpeedVideoFpsRangesFor.getString();
    }

    public static org.bouncycastle.asn1.x500.DirectoryString getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        if (z) {
            return getInstance(aSN1TaggedObject.getObject());
        }
        throw new java.lang.IllegalArgumentException("choice item must be explicitly tagged");
    }

    public static org.bouncycastle.asn1.x500.DirectoryString getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.x500.DirectoryString)) {
            return (org.bouncycastle.asn1.x500.DirectoryString) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1T61String) {
            return new org.bouncycastle.asn1.x500.DirectoryString((org.bouncycastle.asn1.ASN1T61String) obj);
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1PrintableString) {
            return new org.bouncycastle.asn1.x500.DirectoryString((org.bouncycastle.asn1.ASN1PrintableString) obj);
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1UniversalString) {
            return new org.bouncycastle.asn1.x500.DirectoryString((org.bouncycastle.asn1.ASN1UniversalString) obj);
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1UTF8String) {
            return new org.bouncycastle.asn1.x500.DirectoryString((org.bouncycastle.asn1.ASN1UTF8String) obj);
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1BMPString) {
            return new org.bouncycastle.asn1.x500.DirectoryString((org.bouncycastle.asn1.ASN1BMPString) obj);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("illegal object in getInstance: ");
        sb.append(obj.getClass().getName());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    private DirectoryString(org.bouncycastle.asn1.ASN1UniversalString aSN1UniversalString) {
        this.getHighSpeedVideoFpsRangesFor = aSN1UniversalString;
    }

    private DirectoryString(org.bouncycastle.asn1.ASN1UTF8String aSN1UTF8String) {
        this.getHighSpeedVideoFpsRangesFor = aSN1UTF8String;
    }

    private DirectoryString(org.bouncycastle.asn1.ASN1T61String aSN1T61String) {
        this.getHighSpeedVideoFpsRangesFor = aSN1T61String;
    }

    private DirectoryString(org.bouncycastle.asn1.ASN1PrintableString aSN1PrintableString) {
        this.getHighSpeedVideoFpsRangesFor = aSN1PrintableString;
    }

    private DirectoryString(org.bouncycastle.asn1.ASN1BMPString aSN1BMPString) {
        this.getHighSpeedVideoFpsRangesFor = aSN1BMPString;
    }

    public DirectoryString(java.lang.String str) {
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.DERUTF8String(str);
    }
}
