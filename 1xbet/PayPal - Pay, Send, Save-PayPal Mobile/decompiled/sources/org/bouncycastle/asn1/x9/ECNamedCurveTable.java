package org.bouncycastle.asn1.x9;

/* loaded from: classes17.dex */
public class ECNamedCurveTable {
    public static java.util.Enumeration getNames() {
        java.util.Vector vector = new java.util.Vector();
        java.util.Enumeration names = org.bouncycastle.asn1.x9.X962NamedCurves.getNames();
        while (names.hasMoreElements()) {
            vector.addElement(names.nextElement());
        }
        java.util.Enumeration names2 = org.bouncycastle.asn1.sec.SECNamedCurves.getNames();
        while (names2.hasMoreElements()) {
            vector.addElement(names2.nextElement());
        }
        java.util.Enumeration names3 = org.bouncycastle.asn1.nist.NISTNamedCurves.getNames();
        while (names3.hasMoreElements()) {
            vector.addElement(names3.nextElement());
        }
        java.util.Enumeration names4 = org.bouncycastle.asn1.teletrust.TeleTrusTNamedCurves.getNames();
        while (names4.hasMoreElements()) {
            vector.addElement(names4.nextElement());
        }
        java.util.Enumeration names5 = org.bouncycastle.asn1.anssi.ANSSINamedCurves.getNames();
        while (names5.hasMoreElements()) {
            vector.addElement(names5.nextElement());
        }
        java.util.Enumeration names6 = org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves.getNames();
        while (names6.hasMoreElements()) {
            vector.addElement(names6.nextElement());
        }
        java.util.Enumeration names7 = org.bouncycastle.asn1.gm.GMNamedCurves.getNames();
        while (names7.hasMoreElements()) {
            vector.addElement(names7.nextElement());
        }
        return vector.elements();
    }

    public static org.bouncycastle.asn1.ASN1ObjectIdentifier getOID(java.lang.String str) {
        org.bouncycastle.asn1.ASN1ObjectIdentifier oid = org.bouncycastle.asn1.x9.X962NamedCurves.getOID(str);
        if (oid == null) {
            oid = org.bouncycastle.asn1.sec.SECNamedCurves.getOID(str);
        }
        if (oid == null) {
            oid = org.bouncycastle.asn1.nist.NISTNamedCurves.getOID(str);
        }
        if (oid == null) {
            oid = org.bouncycastle.asn1.teletrust.TeleTrusTNamedCurves.getOID(str);
        }
        if (oid == null) {
            oid = org.bouncycastle.asn1.anssi.ANSSINamedCurves.getOID(str);
        }
        if (oid == null) {
            oid = org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves.getOID(str);
        }
        if (oid == null) {
            oid = org.bouncycastle.asn1.gm.GMNamedCurves.getOID(str);
        }
        return (oid == null && str.equals("curve25519")) ? org.bouncycastle.asn1.cryptlib.CryptlibObjectIdentifiers.curvey25519 : oid;
    }

    public static java.lang.String getName(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        java.lang.String name2 = org.bouncycastle.asn1.x9.X962NamedCurves.getName(aSN1ObjectIdentifier);
        if (name2 == null) {
            name2 = org.bouncycastle.asn1.sec.SECNamedCurves.getName(aSN1ObjectIdentifier);
        }
        if (name2 == null) {
            name2 = org.bouncycastle.asn1.nist.NISTNamedCurves.getName(aSN1ObjectIdentifier);
        }
        if (name2 == null) {
            name2 = org.bouncycastle.asn1.teletrust.TeleTrusTNamedCurves.getName(aSN1ObjectIdentifier);
        }
        if (name2 == null) {
            name2 = org.bouncycastle.asn1.anssi.ANSSINamedCurves.getName(aSN1ObjectIdentifier);
        }
        if (name2 == null) {
            name2 = org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves.getName(aSN1ObjectIdentifier);
        }
        if (name2 == null) {
            name2 = org.bouncycastle.asn1.gm.GMNamedCurves.getName(aSN1ObjectIdentifier);
        }
        return name2 == null ? org.bouncycastle.crypto.ec.CustomNamedCurves.getName(aSN1ObjectIdentifier) : name2;
    }

    public static org.bouncycastle.asn1.x9.X9ECParameters getByOID(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        org.bouncycastle.asn1.x9.X9ECParameters byOID = org.bouncycastle.asn1.x9.X962NamedCurves.getByOID(aSN1ObjectIdentifier);
        if (byOID == null) {
            byOID = org.bouncycastle.asn1.sec.SECNamedCurves.getByOID(aSN1ObjectIdentifier);
        }
        if (byOID == null) {
            byOID = org.bouncycastle.asn1.teletrust.TeleTrusTNamedCurves.getByOID(aSN1ObjectIdentifier);
        }
        if (byOID == null) {
            byOID = org.bouncycastle.asn1.anssi.ANSSINamedCurves.getByOID(aSN1ObjectIdentifier);
        }
        if (byOID == null) {
            byOID = org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves.getByOIDX9(aSN1ObjectIdentifier);
        }
        return byOID == null ? org.bouncycastle.asn1.gm.GMNamedCurves.getByOID(aSN1ObjectIdentifier) : byOID;
    }

    public static org.bouncycastle.asn1.x9.X9ECParameters getByName(java.lang.String str) {
        org.bouncycastle.asn1.x9.X9ECParameters byName = org.bouncycastle.asn1.x9.X962NamedCurves.getByName(str);
        if (byName == null) {
            byName = org.bouncycastle.asn1.sec.SECNamedCurves.getByName(str);
        }
        if (byName == null) {
            byName = org.bouncycastle.asn1.nist.NISTNamedCurves.getByName(str);
        }
        if (byName == null) {
            byName = org.bouncycastle.asn1.teletrust.TeleTrusTNamedCurves.getByName(str);
        }
        if (byName == null) {
            byName = org.bouncycastle.asn1.anssi.ANSSINamedCurves.getByName(str);
        }
        if (byName == null) {
            byName = org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves.getByNameX9(str);
        }
        return byName == null ? org.bouncycastle.asn1.gm.GMNamedCurves.getByName(str) : byName;
    }
}
