package org.bouncycastle.asn1.isismtt.x509;

/* loaded from: classes17.dex */
public class NamingAuthority extends org.bouncycastle.asn1.ASN1Object {
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier id_isismtt_at_namingAuthorities_RechtWirtschaftSteuern;
    private org.bouncycastle.asn1.x500.DirectoryString Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.ASN1ObjectIdentifier getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.String getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = this.getHighResolutionOutputSizeshNQ4ISI;
        if (aSN1ObjectIdentifier != null) {
            aSN1EncodableVector.add(aSN1ObjectIdentifier);
        }
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERIA5String(this.getHighSpeedVideoFpsRangesFor, true));
        }
        org.bouncycastle.asn1.x500.DirectoryString directoryString = this.Camera2StreamConfigurationMap;
        if (directoryString != null) {
            aSN1EncodableVector.add(directoryString);
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public java.lang.String getNamingAuthorityUrl() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.x500.DirectoryString getNamingAuthorityText() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getNamingAuthorityId() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.bouncycastle.asn1.isismtt.x509.NamingAuthority getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.isismtt.x509.NamingAuthority getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.isismtt.x509.NamingAuthority)) {
            return (org.bouncycastle.asn1.isismtt.x509.NamingAuthority) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1Sequence) {
            return new org.bouncycastle.asn1.isismtt.x509.NamingAuthority((org.bouncycastle.asn1.ASN1Sequence) obj);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("illegal object in getInstance: ");
        sb.append(obj.getClass().getName());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    private NamingAuthority(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() > 3) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Bad sequence size: ");
            sb.append(aSN1Sequence.size());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        if (objects.hasMoreElements()) {
            org.bouncycastle.asn1.ASN1Encodable aSN1Encodable = (org.bouncycastle.asn1.ASN1Encodable) objects.nextElement();
            if (aSN1Encodable instanceof org.bouncycastle.asn1.ASN1ObjectIdentifier) {
                this.getHighResolutionOutputSizeshNQ4ISI = (org.bouncycastle.asn1.ASN1ObjectIdentifier) aSN1Encodable;
            } else if (aSN1Encodable instanceof org.bouncycastle.asn1.ASN1IA5String) {
                this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1IA5String.getInstance(aSN1Encodable).getString();
            } else {
                if (!(aSN1Encodable instanceof org.bouncycastle.asn1.ASN1String)) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Bad object encountered: ");
                    sb2.append(aSN1Encodable.getClass());
                    throw new java.lang.IllegalArgumentException(sb2.toString());
                }
                this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.x500.DirectoryString.getInstance(aSN1Encodable);
            }
        }
        if (objects.hasMoreElements()) {
            org.bouncycastle.asn1.ASN1Encodable aSN1Encodable2 = (org.bouncycastle.asn1.ASN1Encodable) objects.nextElement();
            if (aSN1Encodable2 instanceof org.bouncycastle.asn1.ASN1IA5String) {
                this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1IA5String.getInstance(aSN1Encodable2).getString();
            } else {
                if (!(aSN1Encodable2 instanceof org.bouncycastle.asn1.ASN1String)) {
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Bad object encountered: ");
                    sb3.append(aSN1Encodable2.getClass());
                    throw new java.lang.IllegalArgumentException(sb3.toString());
                }
                this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.x500.DirectoryString.getInstance(aSN1Encodable2);
            }
        }
        if (objects.hasMoreElements()) {
            org.bouncycastle.asn1.ASN1Encodable aSN1Encodable3 = (org.bouncycastle.asn1.ASN1Encodable) objects.nextElement();
            if (aSN1Encodable3 instanceof org.bouncycastle.asn1.ASN1String) {
                this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.x500.DirectoryString.getInstance(aSN1Encodable3);
            } else {
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Bad object encountered: ");
                sb4.append(aSN1Encodable3.getClass());
                throw new java.lang.IllegalArgumentException(sb4.toString());
            }
        }
    }

    public NamingAuthority(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, java.lang.String str, org.bouncycastle.asn1.x500.DirectoryString directoryString) {
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1ObjectIdentifier;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.Camera2StreamConfigurationMap = directoryString;
    }

    static {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(org.bouncycastle.asn1.isismtt.ISISMTTObjectIdentifiers.id_isismtt_at_namingAuthorities);
        sb.append(".1");
        id_isismtt_at_namingAuthorities_RechtWirtschaftSteuern = new org.bouncycastle.asn1.ASN1ObjectIdentifier(sb.toString());
    }
}
