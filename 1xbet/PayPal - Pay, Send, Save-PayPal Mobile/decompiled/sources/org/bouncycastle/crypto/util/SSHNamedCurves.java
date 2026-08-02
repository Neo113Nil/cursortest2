package org.bouncycastle.crypto.util;

/* loaded from: classes17.dex */
public class SSHNamedCurves {
    private static final java.util.Map<java.lang.String, org.bouncycastle.asn1.ASN1ObjectIdentifier> Camera2StreamConfigurationMap = java.util.Collections.unmodifiableMap(new java.util.HashMap<java.lang.String, org.bouncycastle.asn1.ASN1ObjectIdentifier>() { // from class: org.bouncycastle.crypto.util.SSHNamedCurves.1
        {
            put("nistp256", org.bouncycastle.asn1.sec.SECObjectIdentifiers.secp256r1);
            put("nistp384", org.bouncycastle.asn1.sec.SECObjectIdentifiers.secp384r1);
            put("nistp521", org.bouncycastle.asn1.sec.SECObjectIdentifiers.secp521r1);
            put("nistk163", org.bouncycastle.asn1.sec.SECObjectIdentifiers.sect163k1);
            put("nistp192", org.bouncycastle.asn1.sec.SECObjectIdentifiers.secp192r1);
            put("nistp224", org.bouncycastle.asn1.sec.SECObjectIdentifiers.secp224r1);
            put("nistk233", org.bouncycastle.asn1.sec.SECObjectIdentifiers.sect233k1);
            put("nistb233", org.bouncycastle.asn1.sec.SECObjectIdentifiers.sect233r1);
            put("nistk283", org.bouncycastle.asn1.sec.SECObjectIdentifiers.sect283k1);
            put("nistk409", org.bouncycastle.asn1.sec.SECObjectIdentifiers.sect409k1);
            put("nistb409", org.bouncycastle.asn1.sec.SECObjectIdentifiers.sect409r1);
            put("nistt571", org.bouncycastle.asn1.sec.SECObjectIdentifiers.sect571k1);
        }
    });
    private static final java.util.Map<java.lang.String, java.lang.String> getHighResolutionOutputSizeshNQ4ISI = java.util.Collections.unmodifiableMap(new java.util.HashMap<java.lang.String, java.lang.String>() { // from class: org.bouncycastle.crypto.util.SSHNamedCurves.2
        {
            java.lang.String[][] strArr = {new java.lang.String[]{"secp256r1", "nistp256"}, new java.lang.String[]{"secp384r1", "nistp384"}, new java.lang.String[]{"secp521r1", "nistp521"}, new java.lang.String[]{"sect163k1", "nistk163"}, new java.lang.String[]{"secp192r1", "nistp192"}, new java.lang.String[]{"secp224r1", "nistp224"}, new java.lang.String[]{"sect233k1", "nistk233"}, new java.lang.String[]{"sect233r1", "nistb233"}, new java.lang.String[]{"sect283k1", "nistk283"}, new java.lang.String[]{"sect409k1", "nistk409"}, new java.lang.String[]{"sect409r1", "nistb409"}, new java.lang.String[]{"sect571k1", "nistt571"}};
            for (int i = 0; i != 12; i++) {
                java.lang.String[] strArr2 = strArr[i];
                put(strArr2[0], strArr2[1]);
            }
        }
    });
    private static java.util.HashMap<org.bouncycastle.math.ec.ECCurve, java.lang.String> getHighSpeedVideoSizes = new java.util.HashMap<org.bouncycastle.math.ec.ECCurve, java.lang.String>() { // from class: org.bouncycastle.crypto.util.SSHNamedCurves.3
        {
            java.util.Enumeration names = org.bouncycastle.crypto.ec.CustomNamedCurves.getNames();
            while (names.hasMoreElements()) {
                java.lang.String str = (java.lang.String) names.nextElement();
                put(org.bouncycastle.crypto.ec.CustomNamedCurves.getByName(str).getCurve(), str);
            }
        }
    };
    private static final java.util.Map<org.bouncycastle.asn1.ASN1ObjectIdentifier, java.lang.String> getHighSpeedVideoFpsRanges = java.util.Collections.unmodifiableMap(new java.util.HashMap<org.bouncycastle.asn1.ASN1ObjectIdentifier, java.lang.String>() { // from class: org.bouncycastle.crypto.util.SSHNamedCurves.4
        {
            for (java.lang.String str : org.bouncycastle.crypto.util.SSHNamedCurves.Camera2StreamConfigurationMap.keySet()) {
                put(org.bouncycastle.crypto.util.SSHNamedCurves.Camera2StreamConfigurationMap.get(str), str);
            }
        }
    });

    public static org.bouncycastle.asn1.x9.X9ECParameters getParameters(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return org.bouncycastle.asn1.nist.NISTNamedCurves.getByOID(aSN1ObjectIdentifier);
    }

    public static org.bouncycastle.asn1.x9.X9ECParameters getParameters(java.lang.String str) {
        return org.bouncycastle.asn1.nist.NISTNamedCurves.getByOID(Camera2StreamConfigurationMap.get(org.bouncycastle.util.Strings.toLowerCase(str)));
    }

    public static java.lang.String getNameForParameters(org.bouncycastle.math.ec.ECCurve eCCurve) {
        return getHighResolutionOutputSizeshNQ4ISI.get(getHighSpeedVideoSizes.get(eCCurve));
    }

    public static java.lang.String getNameForParameters(org.bouncycastle.crypto.params.ECDomainParameters eCDomainParameters) {
        return eCDomainParameters instanceof org.bouncycastle.crypto.params.ECNamedDomainParameters ? getName(((org.bouncycastle.crypto.params.ECNamedDomainParameters) eCDomainParameters).getName()) : getNameForParameters(eCDomainParameters.getCurve());
    }

    public static java.lang.String getName(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return getHighSpeedVideoFpsRanges.get(aSN1ObjectIdentifier);
    }

    public static org.bouncycastle.asn1.ASN1ObjectIdentifier getByName(java.lang.String str) {
        return Camera2StreamConfigurationMap.get(str);
    }
}
