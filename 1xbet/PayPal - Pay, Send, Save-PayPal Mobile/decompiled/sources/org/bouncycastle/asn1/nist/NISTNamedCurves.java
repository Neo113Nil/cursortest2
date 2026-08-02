package org.bouncycastle.asn1.nist;

/* loaded from: classes17.dex */
public class NISTNamedCurves {
    static final java.util.Hashtable getHighSpeedVideoFpsRangesFor;
    static final java.util.Hashtable getHighSpeedVideoSizes;

    static {
        java.util.Hashtable hashtable = new java.util.Hashtable();
        getHighSpeedVideoSizes = hashtable;
        java.util.Hashtable hashtable2 = new java.util.Hashtable();
        getHighSpeedVideoFpsRangesFor = hashtable2;
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = org.bouncycastle.asn1.sec.SECObjectIdentifiers.sect571r1;
        hashtable.put("B-571", aSN1ObjectIdentifier);
        hashtable2.put(aSN1ObjectIdentifier, "B-571");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier2 = org.bouncycastle.asn1.sec.SECObjectIdentifiers.sect409r1;
        hashtable.put("B-409", aSN1ObjectIdentifier2);
        hashtable2.put(aSN1ObjectIdentifier2, "B-409");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier3 = org.bouncycastle.asn1.sec.SECObjectIdentifiers.sect283r1;
        hashtable.put("B-283", aSN1ObjectIdentifier3);
        hashtable2.put(aSN1ObjectIdentifier3, "B-283");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier4 = org.bouncycastle.asn1.sec.SECObjectIdentifiers.sect233r1;
        hashtable.put("B-233", aSN1ObjectIdentifier4);
        hashtable2.put(aSN1ObjectIdentifier4, "B-233");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier5 = org.bouncycastle.asn1.sec.SECObjectIdentifiers.sect163r2;
        hashtable.put("B-163", aSN1ObjectIdentifier5);
        hashtable2.put(aSN1ObjectIdentifier5, "B-163");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier6 = org.bouncycastle.asn1.sec.SECObjectIdentifiers.sect571k1;
        hashtable.put("K-571", aSN1ObjectIdentifier6);
        hashtable2.put(aSN1ObjectIdentifier6, "K-571");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier7 = org.bouncycastle.asn1.sec.SECObjectIdentifiers.sect409k1;
        hashtable.put("K-409", aSN1ObjectIdentifier7);
        hashtable2.put(aSN1ObjectIdentifier7, "K-409");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier8 = org.bouncycastle.asn1.sec.SECObjectIdentifiers.sect283k1;
        hashtable.put("K-283", aSN1ObjectIdentifier8);
        hashtable2.put(aSN1ObjectIdentifier8, "K-283");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier9 = org.bouncycastle.asn1.sec.SECObjectIdentifiers.sect233k1;
        hashtable.put("K-233", aSN1ObjectIdentifier9);
        hashtable2.put(aSN1ObjectIdentifier9, "K-233");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier10 = org.bouncycastle.asn1.sec.SECObjectIdentifiers.sect163k1;
        hashtable.put("K-163", aSN1ObjectIdentifier10);
        hashtable2.put(aSN1ObjectIdentifier10, "K-163");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier11 = org.bouncycastle.asn1.sec.SECObjectIdentifiers.secp521r1;
        hashtable.put(org.jose4j.keys.EllipticCurves.P_521, aSN1ObjectIdentifier11);
        hashtable2.put(aSN1ObjectIdentifier11, org.jose4j.keys.EllipticCurves.P_521);
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier12 = org.bouncycastle.asn1.sec.SECObjectIdentifiers.secp384r1;
        hashtable.put(org.jose4j.keys.EllipticCurves.P_384, aSN1ObjectIdentifier12);
        hashtable2.put(aSN1ObjectIdentifier12, org.jose4j.keys.EllipticCurves.P_384);
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier13 = org.bouncycastle.asn1.sec.SECObjectIdentifiers.secp256r1;
        hashtable.put(org.jose4j.keys.EllipticCurves.P_256, aSN1ObjectIdentifier13);
        hashtable2.put(aSN1ObjectIdentifier13, org.jose4j.keys.EllipticCurves.P_256);
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier14 = org.bouncycastle.asn1.sec.SECObjectIdentifiers.secp224r1;
        hashtable.put("P-224", aSN1ObjectIdentifier14);
        hashtable2.put(aSN1ObjectIdentifier14, "P-224");
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier15 = org.bouncycastle.asn1.sec.SECObjectIdentifiers.secp192r1;
        hashtable.put("P-192", aSN1ObjectIdentifier15);
        hashtable2.put(aSN1ObjectIdentifier15, "P-192");
    }

    public static org.bouncycastle.asn1.ASN1ObjectIdentifier getOID(java.lang.String str) {
        return (org.bouncycastle.asn1.ASN1ObjectIdentifier) getHighSpeedVideoSizes.get(org.bouncycastle.util.Strings.toUpperCase(str));
    }

    public static java.util.Enumeration getNames() {
        return getHighSpeedVideoSizes.keys();
    }

    public static java.lang.String getName(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (java.lang.String) getHighSpeedVideoFpsRangesFor.get(aSN1ObjectIdentifier);
    }

    public static org.bouncycastle.asn1.x9.X9ECParameters getByOID(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return org.bouncycastle.asn1.sec.SECNamedCurves.getByOID(aSN1ObjectIdentifier);
    }

    public static org.bouncycastle.asn1.x9.X9ECParameters getByName(java.lang.String str) {
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = (org.bouncycastle.asn1.ASN1ObjectIdentifier) getHighSpeedVideoSizes.get(org.bouncycastle.util.Strings.toUpperCase(str));
        if (aSN1ObjectIdentifier != null) {
            return getByOID(aSN1ObjectIdentifier);
        }
        return null;
    }
}
