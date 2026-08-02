package org.bouncycastle.asn1.x500.style;

/* loaded from: classes17.dex */
public class BCStyle extends org.bouncycastle.asn1.x500.style.AbstractX500NameStyle {
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier BUSINESS_CATEGORY;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier C;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier CN;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier COUNTRY_OF_CITIZENSHIP;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier COUNTRY_OF_RESIDENCE;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier DATE_OF_BIRTH;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier DC;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier DESCRIPTION;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier DMD_NAME;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier DN_QUALIFIER;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier E;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier EmailAddress;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier GENDER;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier GENERATION;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier GIVENNAME;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier INITIALS;
    public static final org.bouncycastle.asn1.x500.X500NameStyle INSTANCE;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier L;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier NAME;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier NAME_AT_BIRTH;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier O;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier ORGANIZATION_IDENTIFIER;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier OU;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier PLACE_OF_BIRTH;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier POSTAL_ADDRESS;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier POSTAL_CODE;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier PSEUDONYM;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier ROLE;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier SERIALNUMBER;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier SN;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier ST;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier STREET;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier SURNAME;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier T;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier TELEPHONE_NUMBER;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier UID;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier UNIQUE_IDENTIFIER;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier UnstructuredAddress;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier UnstructuredName;
    private static final java.util.Hashtable getHighSpeedVideoFpsRanges;
    private static final java.util.Hashtable getHighSpeedVideoSizes;
    protected final java.util.Hashtable defaultSymbols = copyHashTable(getHighSpeedVideoFpsRanges);
    protected final java.util.Hashtable defaultLookUp = copyHashTable(getHighSpeedVideoSizes);

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public java.lang.String toString(org.bouncycastle.asn1.x500.X500Name x500Name) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        boolean z = true;
        for (org.bouncycastle.asn1.x500.RDN rdn : x500Name.getRDNs()) {
            if (z) {
                z = false;
            } else {
                stringBuffer.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
            }
            org.bouncycastle.asn1.x500.style.IETFUtils.appendRDN(stringBuffer, rdn, this.defaultSymbols);
        }
        return stringBuffer.toString();
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public java.lang.String oidToDisplayName(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (java.lang.String) getHighSpeedVideoFpsRanges.get(aSN1ObjectIdentifier);
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public java.lang.String[] oidToAttrNames(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return org.bouncycastle.asn1.x500.style.IETFUtils.findAttrNamesForOID(aSN1ObjectIdentifier, this.defaultLookUp);
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public org.bouncycastle.asn1.x500.RDN[] fromString(java.lang.String str) {
        return org.bouncycastle.asn1.x500.style.IETFUtils.rDNsFromString(str, this);
    }

    @Override // org.bouncycastle.asn1.x500.style.AbstractX500NameStyle
    protected org.bouncycastle.asn1.ASN1Encodable encodeStringValue(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, java.lang.String str) {
        return (aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) EmailAddress) || aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) DC)) ? new org.bouncycastle.asn1.DERIA5String(str) : aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) DATE_OF_BIRTH) ? new org.bouncycastle.asn1.ASN1GeneralizedTime(str) : (aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) C) || aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) SN) || aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) DN_QUALIFIER) || aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) TELEPHONE_NUMBER)) ? new org.bouncycastle.asn1.DERPrintableString(str) : super.encodeStringValue(aSN1ObjectIdentifier, str);
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public org.bouncycastle.asn1.ASN1ObjectIdentifier attrNameToOID(java.lang.String str) {
        return org.bouncycastle.asn1.x500.style.IETFUtils.decodeAttrName(str, this.defaultLookUp);
    }

    protected BCStyle() {
    }

    static {
        org.bouncycastle.asn1.ASN1ObjectIdentifier intern = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.4.6").intern();
        C = intern;
        org.bouncycastle.asn1.ASN1ObjectIdentifier intern2 = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.4.10").intern();
        O = intern2;
        org.bouncycastle.asn1.ASN1ObjectIdentifier intern3 = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.4.11").intern();
        OU = intern3;
        org.bouncycastle.asn1.ASN1ObjectIdentifier intern4 = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.4.12").intern();
        T = intern4;
        org.bouncycastle.asn1.ASN1ObjectIdentifier intern5 = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.4.3").intern();
        CN = intern5;
        SN = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.4.5").intern();
        org.bouncycastle.asn1.ASN1ObjectIdentifier intern6 = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.4.9").intern();
        STREET = intern6;
        org.bouncycastle.asn1.ASN1ObjectIdentifier intern7 = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.4.5").intern();
        SERIALNUMBER = intern7;
        org.bouncycastle.asn1.ASN1ObjectIdentifier intern8 = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.4.7").intern();
        L = intern8;
        org.bouncycastle.asn1.ASN1ObjectIdentifier intern9 = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.4.8").intern();
        ST = intern9;
        org.bouncycastle.asn1.ASN1ObjectIdentifier intern10 = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.4.4").intern();
        SURNAME = intern10;
        org.bouncycastle.asn1.ASN1ObjectIdentifier intern11 = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.4.42").intern();
        GIVENNAME = intern11;
        org.bouncycastle.asn1.ASN1ObjectIdentifier intern12 = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.4.43").intern();
        INITIALS = intern12;
        org.bouncycastle.asn1.ASN1ObjectIdentifier intern13 = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.4.44").intern();
        GENERATION = intern13;
        org.bouncycastle.asn1.ASN1ObjectIdentifier intern14 = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.4.45").intern();
        UNIQUE_IDENTIFIER = intern14;
        org.bouncycastle.asn1.ASN1ObjectIdentifier intern15 = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.4.13").intern();
        DESCRIPTION = intern15;
        org.bouncycastle.asn1.ASN1ObjectIdentifier intern16 = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.4.15").intern();
        BUSINESS_CATEGORY = intern16;
        org.bouncycastle.asn1.ASN1ObjectIdentifier intern17 = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.4.17").intern();
        POSTAL_CODE = intern17;
        org.bouncycastle.asn1.ASN1ObjectIdentifier intern18 = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.4.46").intern();
        DN_QUALIFIER = intern18;
        org.bouncycastle.asn1.ASN1ObjectIdentifier intern19 = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.4.65").intern();
        PSEUDONYM = intern19;
        org.bouncycastle.asn1.ASN1ObjectIdentifier intern20 = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.4.72").intern();
        ROLE = intern20;
        org.bouncycastle.asn1.ASN1ObjectIdentifier intern21 = new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.3.6.1.5.5.7.9.1").intern();
        DATE_OF_BIRTH = intern21;
        org.bouncycastle.asn1.ASN1ObjectIdentifier intern22 = new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.3.6.1.5.5.7.9.2").intern();
        PLACE_OF_BIRTH = intern22;
        org.bouncycastle.asn1.ASN1ObjectIdentifier intern23 = new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.3.6.1.5.5.7.9.3").intern();
        GENDER = intern23;
        org.bouncycastle.asn1.ASN1ObjectIdentifier intern24 = new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.3.6.1.5.5.7.9.4").intern();
        COUNTRY_OF_CITIZENSHIP = intern24;
        org.bouncycastle.asn1.ASN1ObjectIdentifier intern25 = new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.3.6.1.5.5.7.9.5").intern();
        COUNTRY_OF_RESIDENCE = intern25;
        org.bouncycastle.asn1.ASN1ObjectIdentifier intern26 = new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.3.36.8.3.14").intern();
        NAME_AT_BIRTH = intern26;
        org.bouncycastle.asn1.ASN1ObjectIdentifier intern27 = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.4.16").intern();
        POSTAL_ADDRESS = intern27;
        DMD_NAME = new org.bouncycastle.asn1.ASN1ObjectIdentifier("2.5.4.54").intern();
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = org.bouncycastle.asn1.x509.X509ObjectIdentifiers.id_at_telephoneNumber;
        TELEPHONE_NUMBER = aSN1ObjectIdentifier;
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier2 = org.bouncycastle.asn1.x509.X509ObjectIdentifiers.id_at_name;
        NAME = aSN1ObjectIdentifier2;
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier3 = org.bouncycastle.asn1.x509.X509ObjectIdentifiers.id_at_organizationIdentifier;
        ORGANIZATION_IDENTIFIER = aSN1ObjectIdentifier3;
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier4 = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pkcs_9_at_emailAddress;
        EmailAddress = aSN1ObjectIdentifier4;
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier5 = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pkcs_9_at_unstructuredName;
        UnstructuredName = aSN1ObjectIdentifier5;
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier6 = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pkcs_9_at_unstructuredAddress;
        UnstructuredAddress = aSN1ObjectIdentifier6;
        E = aSN1ObjectIdentifier4;
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier7 = new org.bouncycastle.asn1.ASN1ObjectIdentifier("0.9.2342.19200300.100.1.25");
        DC = aSN1ObjectIdentifier7;
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier8 = new org.bouncycastle.asn1.ASN1ObjectIdentifier("0.9.2342.19200300.100.1.1");
        UID = aSN1ObjectIdentifier8;
        java.util.Hashtable hashtable = new java.util.Hashtable();
        getHighSpeedVideoFpsRanges = hashtable;
        java.util.Hashtable hashtable2 = new java.util.Hashtable();
        getHighSpeedVideoSizes = hashtable2;
        hashtable.put(intern, com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA);
        hashtable.put(intern2, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.ORDER_PREFIX_PAYMENT);
        hashtable.put(intern4, "T");
        hashtable.put(intern3, "OU");
        hashtable.put(intern5, "CN");
        hashtable.put(intern8, "L");
        hashtable.put(intern9, "ST");
        hashtable.put(intern7, "SERIALNUMBER");
        hashtable.put(aSN1ObjectIdentifier4, "E");
        hashtable.put(aSN1ObjectIdentifier7, "DC");
        hashtable.put(aSN1ObjectIdentifier8, "UID");
        hashtable.put(intern6, "STREET");
        hashtable.put(intern10, "SURNAME");
        hashtable.put(intern11, "GIVENNAME");
        hashtable.put(intern12, "INITIALS");
        hashtable.put(intern13, "GENERATION");
        hashtable.put(intern15, "DESCRIPTION");
        hashtable.put(intern20, "ROLE");
        hashtable.put(aSN1ObjectIdentifier6, "unstructuredAddress");
        hashtable.put(aSN1ObjectIdentifier5, "unstructuredName");
        hashtable.put(intern14, "UniqueIdentifier");
        hashtable.put(intern18, "DN");
        hashtable.put(intern19, "Pseudonym");
        hashtable.put(intern27, "PostalAddress");
        hashtable.put(intern26, "NameAtBirth");
        hashtable.put(intern24, "CountryOfCitizenship");
        hashtable.put(intern25, "CountryOfResidence");
        hashtable.put(intern23, "Gender");
        hashtable.put(intern22, "PlaceOfBirth");
        hashtable.put(intern21, "DateOfBirth");
        hashtable.put(intern17, "PostalCode");
        hashtable.put(intern16, "BusinessCategory");
        hashtable.put(aSN1ObjectIdentifier, "TelephoneNumber");
        hashtable.put(aSN1ObjectIdentifier2, "Name");
        hashtable.put(aSN1ObjectIdentifier3, "organizationIdentifier");
        hashtable2.put("c", intern);
        hashtable2.put("o", intern2);
        hashtable2.put("t", intern4);
        hashtable2.put("ou", intern3);
        hashtable2.put("cn", intern5);
        hashtable2.put("l", intern8);
        hashtable2.put("st", intern9);
        hashtable2.put("sn", intern10);
        hashtable2.put("serialnumber", intern7);
        hashtable2.put("street", intern6);
        hashtable2.put("emailaddress", aSN1ObjectIdentifier4);
        hashtable2.put("dc", aSN1ObjectIdentifier7);
        hashtable2.put("e", aSN1ObjectIdentifier4);
        hashtable2.put("uid", aSN1ObjectIdentifier8);
        hashtable2.put("surname", intern10);
        hashtable2.put("givenname", intern11);
        hashtable2.put("initials", intern12);
        hashtable2.put("generation", intern13);
        hashtable2.put(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, intern15);
        hashtable2.put("role", intern20);
        hashtable2.put("unstructuredaddress", aSN1ObjectIdentifier6);
        hashtable2.put("unstructuredname", aSN1ObjectIdentifier5);
        hashtable2.put("uniqueidentifier", intern14);
        hashtable2.put("dn", intern18);
        hashtable2.put("pseudonym", intern19);
        hashtable2.put("postaladdress", intern27);
        hashtable2.put("nameatbirth", intern26);
        hashtable2.put("countryofcitizenship", intern24);
        hashtable2.put("countryofresidence", intern25);
        hashtable2.put(androidx.autofill.HintConstants.AUTOFILL_HINT_GENDER, intern23);
        hashtable2.put("placeofbirth", intern22);
        hashtable2.put("dateofbirth", intern21);
        hashtable2.put("postalcode", intern17);
        hashtable2.put("businesscategory", intern16);
        hashtable2.put("telephonenumber", aSN1ObjectIdentifier);
        hashtable2.put("name", aSN1ObjectIdentifier2);
        hashtable2.put("organizationidentifier", aSN1ObjectIdentifier3);
        INSTANCE = new org.bouncycastle.asn1.x500.style.BCStyle();
    }
}
