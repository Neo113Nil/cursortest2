package org.bouncycastle.asn1.isismtt.x509;

/* loaded from: classes17.dex */
public class ProfessionInfo extends org.bouncycastle.asn1.ASN1Object {
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier Notar;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier Notariatsverwalter;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier Notariatsverwalterin;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier Notarin;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier Notarvertreter;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier Notarvertreterin;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier Patentanwalt;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier Patentanwltin;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier Rechtsanwalt;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier Rechtsanwltin;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier Rechtsbeistand;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier Steuerberater;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier Steuerberaterin;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier Steuerbevollmchtigte;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier Steuerbevollmchtigter;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier VereidigteBuchprferin;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier VereidigterBuchprfer;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier Wirtschaftsprfer;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier Wirtschaftsprferin;
    private java.lang.String Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.ASN1Sequence getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.ASN1OctetString getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.isismtt.x509.NamingAuthority getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(5);
        org.bouncycastle.asn1.isismtt.x509.NamingAuthority namingAuthority = this.getHighSpeedVideoFpsRangesFor;
        if (namingAuthority != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 0, (org.bouncycastle.asn1.ASN1Encodable) namingAuthority));
        }
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = this.getHighSpeedVideoSizes;
        if (aSN1Sequence != null) {
            aSN1EncodableVector.add(aSN1Sequence);
        }
        if (this.Camera2StreamConfigurationMap != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERPrintableString(this.Camera2StreamConfigurationMap, true));
        }
        org.bouncycastle.asn1.ASN1OctetString aSN1OctetString = this.getHighSpeedVideoFpsRanges;
        if (aSN1OctetString != null) {
            aSN1EncodableVector.add(aSN1OctetString);
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public java.lang.String getRegistrationNumber() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier[] getProfessionOIDs() {
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = this.getHighSpeedVideoSizes;
        int i = 0;
        if (aSN1Sequence == null) {
            return new org.bouncycastle.asn1.ASN1ObjectIdentifier[0];
        }
        org.bouncycastle.asn1.ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = new org.bouncycastle.asn1.ASN1ObjectIdentifier[aSN1Sequence.size()];
        java.util.Enumeration objects = this.getHighSpeedVideoSizes.getObjects();
        while (objects.hasMoreElements()) {
            aSN1ObjectIdentifierArr[i] = org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(objects.nextElement());
            i++;
        }
        return aSN1ObjectIdentifierArr;
    }

    public org.bouncycastle.asn1.x500.DirectoryString[] getProfessionItems() {
        org.bouncycastle.asn1.x500.DirectoryString[] directoryStringArr = new org.bouncycastle.asn1.x500.DirectoryString[this.getHighResolutionOutputSizeshNQ4ISI.size()];
        java.util.Enumeration objects = this.getHighResolutionOutputSizeshNQ4ISI.getObjects();
        int i = 0;
        while (objects.hasMoreElements()) {
            directoryStringArr[i] = org.bouncycastle.asn1.x500.DirectoryString.getInstance(objects.nextElement());
            i++;
        }
        return directoryStringArr;
    }

    public org.bouncycastle.asn1.isismtt.x509.NamingAuthority getNamingAuthority() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.ASN1OctetString getAddProfessionInfo() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public static org.bouncycastle.asn1.isismtt.x509.ProfessionInfo getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.isismtt.x509.ProfessionInfo)) {
            return (org.bouncycastle.asn1.isismtt.x509.ProfessionInfo) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1Sequence) {
            return new org.bouncycastle.asn1.isismtt.x509.ProfessionInfo((org.bouncycastle.asn1.ASN1Sequence) obj);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("illegal object in getInstance: ");
        sb.append(obj.getClass().getName());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public ProfessionInfo(org.bouncycastle.asn1.isismtt.x509.NamingAuthority namingAuthority, org.bouncycastle.asn1.x500.DirectoryString[] directoryStringArr, org.bouncycastle.asn1.ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr, java.lang.String str, org.bouncycastle.asn1.ASN1OctetString aSN1OctetString) {
        this.getHighSpeedVideoFpsRangesFor = namingAuthority;
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.DERSequence(directoryStringArr);
        if (aSN1ObjectIdentifierArr != null) {
            this.getHighSpeedVideoSizes = new org.bouncycastle.asn1.DERSequence(aSN1ObjectIdentifierArr);
        }
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoFpsRanges = aSN1OctetString;
    }

    private ProfessionInfo(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() > 5) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Bad sequence size: ");
            sb.append(aSN1Sequence.size());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        org.bouncycastle.asn1.ASN1Encodable aSN1Encodable = (org.bouncycastle.asn1.ASN1Encodable) objects.nextElement();
        if (aSN1Encodable instanceof org.bouncycastle.asn1.ASN1TaggedObject) {
            org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = (org.bouncycastle.asn1.ASN1TaggedObject) aSN1Encodable;
            if (aSN1TaggedObject.getTagNo() != 0) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Bad tag number: ");
                sb2.append(aSN1TaggedObject.getTagNo());
                throw new java.lang.IllegalArgumentException(sb2.toString());
            }
            this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.isismtt.x509.NamingAuthority.getInstance(aSN1TaggedObject, true);
            aSN1Encodable = (org.bouncycastle.asn1.ASN1Encodable) objects.nextElement();
        }
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1Encodable);
        if (objects.hasMoreElements()) {
            org.bouncycastle.asn1.ASN1Encodable aSN1Encodable2 = (org.bouncycastle.asn1.ASN1Encodable) objects.nextElement();
            if (aSN1Encodable2 instanceof org.bouncycastle.asn1.ASN1Sequence) {
                this.getHighSpeedVideoSizes = org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1Encodable2);
            } else if (aSN1Encodable2 instanceof org.bouncycastle.asn1.ASN1PrintableString) {
                this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.ASN1PrintableString.getInstance(aSN1Encodable2).getString();
            } else {
                if (!(aSN1Encodable2 instanceof org.bouncycastle.asn1.ASN1OctetString)) {
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Bad object encountered: ");
                    sb3.append(aSN1Encodable2.getClass());
                    throw new java.lang.IllegalArgumentException(sb3.toString());
                }
                this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1Encodable2);
            }
        }
        if (objects.hasMoreElements()) {
            org.bouncycastle.asn1.ASN1Encodable aSN1Encodable3 = (org.bouncycastle.asn1.ASN1Encodable) objects.nextElement();
            if (aSN1Encodable3 instanceof org.bouncycastle.asn1.ASN1PrintableString) {
                this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.ASN1PrintableString.getInstance(aSN1Encodable3).getString();
            } else {
                if (!(aSN1Encodable3 instanceof org.bouncycastle.asn1.DEROctetString)) {
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Bad object encountered: ");
                    sb4.append(aSN1Encodable3.getClass());
                    throw new java.lang.IllegalArgumentException(sb4.toString());
                }
                this.getHighSpeedVideoFpsRanges = (org.bouncycastle.asn1.DEROctetString) aSN1Encodable3;
            }
        }
        if (objects.hasMoreElements()) {
            org.bouncycastle.asn1.ASN1Encodable aSN1Encodable4 = (org.bouncycastle.asn1.ASN1Encodable) objects.nextElement();
            if (aSN1Encodable4 instanceof org.bouncycastle.asn1.DEROctetString) {
                this.getHighSpeedVideoFpsRanges = (org.bouncycastle.asn1.DEROctetString) aSN1Encodable4;
            } else {
                java.lang.StringBuilder sb5 = new java.lang.StringBuilder("Bad object encountered: ");
                sb5.append(aSN1Encodable4.getClass());
                throw new java.lang.IllegalArgumentException(sb5.toString());
            }
        }
    }

    static {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(org.bouncycastle.asn1.isismtt.x509.NamingAuthority.id_isismtt_at_namingAuthorities_RechtWirtschaftSteuern);
        sb.append(".1");
        Rechtsanwltin = new org.bouncycastle.asn1.ASN1ObjectIdentifier(sb.toString());
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(org.bouncycastle.asn1.isismtt.x509.NamingAuthority.id_isismtt_at_namingAuthorities_RechtWirtschaftSteuern);
        sb2.append(".2");
        Rechtsanwalt = new org.bouncycastle.asn1.ASN1ObjectIdentifier(sb2.toString());
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        sb3.append(org.bouncycastle.asn1.isismtt.x509.NamingAuthority.id_isismtt_at_namingAuthorities_RechtWirtschaftSteuern);
        sb3.append(".3");
        Rechtsbeistand = new org.bouncycastle.asn1.ASN1ObjectIdentifier(sb3.toString());
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
        sb4.append(org.bouncycastle.asn1.isismtt.x509.NamingAuthority.id_isismtt_at_namingAuthorities_RechtWirtschaftSteuern);
        sb4.append(".4");
        Steuerberaterin = new org.bouncycastle.asn1.ASN1ObjectIdentifier(sb4.toString());
        java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
        sb5.append(org.bouncycastle.asn1.isismtt.x509.NamingAuthority.id_isismtt_at_namingAuthorities_RechtWirtschaftSteuern);
        sb5.append(".5");
        Steuerberater = new org.bouncycastle.asn1.ASN1ObjectIdentifier(sb5.toString());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(org.bouncycastle.asn1.isismtt.x509.NamingAuthority.id_isismtt_at_namingAuthorities_RechtWirtschaftSteuern);
        sb6.append(".6");
        Steuerbevollmchtigte = new org.bouncycastle.asn1.ASN1ObjectIdentifier(sb6.toString());
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(org.bouncycastle.asn1.isismtt.x509.NamingAuthority.id_isismtt_at_namingAuthorities_RechtWirtschaftSteuern);
        sb7.append(".7");
        Steuerbevollmchtigter = new org.bouncycastle.asn1.ASN1ObjectIdentifier(sb7.toString());
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        sb8.append(org.bouncycastle.asn1.isismtt.x509.NamingAuthority.id_isismtt_at_namingAuthorities_RechtWirtschaftSteuern);
        sb8.append(".8");
        Notarin = new org.bouncycastle.asn1.ASN1ObjectIdentifier(sb8.toString());
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
        sb9.append(org.bouncycastle.asn1.isismtt.x509.NamingAuthority.id_isismtt_at_namingAuthorities_RechtWirtschaftSteuern);
        sb9.append(".9");
        Notar = new org.bouncycastle.asn1.ASN1ObjectIdentifier(sb9.toString());
        java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
        sb10.append(org.bouncycastle.asn1.isismtt.x509.NamingAuthority.id_isismtt_at_namingAuthorities_RechtWirtschaftSteuern);
        sb10.append(".10");
        Notarvertreterin = new org.bouncycastle.asn1.ASN1ObjectIdentifier(sb10.toString());
        java.lang.StringBuilder sb11 = new java.lang.StringBuilder();
        sb11.append(org.bouncycastle.asn1.isismtt.x509.NamingAuthority.id_isismtt_at_namingAuthorities_RechtWirtschaftSteuern);
        sb11.append(".11");
        Notarvertreter = new org.bouncycastle.asn1.ASN1ObjectIdentifier(sb11.toString());
        java.lang.StringBuilder sb12 = new java.lang.StringBuilder();
        sb12.append(org.bouncycastle.asn1.isismtt.x509.NamingAuthority.id_isismtt_at_namingAuthorities_RechtWirtschaftSteuern);
        sb12.append(".12");
        Notariatsverwalterin = new org.bouncycastle.asn1.ASN1ObjectIdentifier(sb12.toString());
        java.lang.StringBuilder sb13 = new java.lang.StringBuilder();
        sb13.append(org.bouncycastle.asn1.isismtt.x509.NamingAuthority.id_isismtt_at_namingAuthorities_RechtWirtschaftSteuern);
        sb13.append(".13");
        Notariatsverwalter = new org.bouncycastle.asn1.ASN1ObjectIdentifier(sb13.toString());
        java.lang.StringBuilder sb14 = new java.lang.StringBuilder();
        sb14.append(org.bouncycastle.asn1.isismtt.x509.NamingAuthority.id_isismtt_at_namingAuthorities_RechtWirtschaftSteuern);
        sb14.append(".14");
        Wirtschaftsprferin = new org.bouncycastle.asn1.ASN1ObjectIdentifier(sb14.toString());
        java.lang.StringBuilder sb15 = new java.lang.StringBuilder();
        sb15.append(org.bouncycastle.asn1.isismtt.x509.NamingAuthority.id_isismtt_at_namingAuthorities_RechtWirtschaftSteuern);
        sb15.append(".15");
        Wirtschaftsprfer = new org.bouncycastle.asn1.ASN1ObjectIdentifier(sb15.toString());
        java.lang.StringBuilder sb16 = new java.lang.StringBuilder();
        sb16.append(org.bouncycastle.asn1.isismtt.x509.NamingAuthority.id_isismtt_at_namingAuthorities_RechtWirtschaftSteuern);
        sb16.append(".16");
        VereidigteBuchprferin = new org.bouncycastle.asn1.ASN1ObjectIdentifier(sb16.toString());
        java.lang.StringBuilder sb17 = new java.lang.StringBuilder();
        sb17.append(org.bouncycastle.asn1.isismtt.x509.NamingAuthority.id_isismtt_at_namingAuthorities_RechtWirtschaftSteuern);
        sb17.append(".17");
        VereidigterBuchprfer = new org.bouncycastle.asn1.ASN1ObjectIdentifier(sb17.toString());
        java.lang.StringBuilder sb18 = new java.lang.StringBuilder();
        sb18.append(org.bouncycastle.asn1.isismtt.x509.NamingAuthority.id_isismtt_at_namingAuthorities_RechtWirtschaftSteuern);
        sb18.append(".18");
        Patentanwltin = new org.bouncycastle.asn1.ASN1ObjectIdentifier(sb18.toString());
        java.lang.StringBuilder sb19 = new java.lang.StringBuilder();
        sb19.append(org.bouncycastle.asn1.isismtt.x509.NamingAuthority.id_isismtt_at_namingAuthorities_RechtWirtschaftSteuern);
        sb19.append(".19");
        Patentanwalt = new org.bouncycastle.asn1.ASN1ObjectIdentifier(sb19.toString());
    }
}
