package org.bouncycastle.asn1.anssi;

/* loaded from: classes17.dex */
public class ANSSINamedCurves {
    static final java.util.Hashtable getHighResolutionOutputSizeshNQ4ISI;
    static org.bouncycastle.asn1.x9.X9ECParametersHolder getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.x9.X9ECParametersHolder() { // from class: org.bouncycastle.asn1.anssi.ANSSINamedCurves.1
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public final org.bouncycastle.asn1.x9.X9ECParameters createParameters() {
            java.math.BigInteger highResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.anssi.ANSSINamedCurves.getHighResolutionOutputSizeshNQ4ISI("F1FD178C0B3AD58F10126DE8CE42435B3961ADBCABC8CA6DE8FCF353D86E9C03");
            java.math.BigInteger highResolutionOutputSizeshNQ4ISI2 = org.bouncycastle.asn1.anssi.ANSSINamedCurves.getHighResolutionOutputSizeshNQ4ISI("F1FD178C0B3AD58F10126DE8CE42435B3961ADBCABC8CA6DE8FCF353D86E9C00");
            java.math.BigInteger highResolutionOutputSizeshNQ4ISI3 = org.bouncycastle.asn1.anssi.ANSSINamedCurves.getHighResolutionOutputSizeshNQ4ISI("EE353FCA5428A9300D4ABA754A44C00FDFEC0C9AE4B1A1803075ED967B7BB73F");
            java.math.BigInteger highResolutionOutputSizeshNQ4ISI4 = org.bouncycastle.asn1.anssi.ANSSINamedCurves.getHighResolutionOutputSizeshNQ4ISI("F1FD178C0B3AD58F10126DE8CE42435B53DC67E140D2BF941FFDD459C6D655E1");
            java.math.BigInteger valueOf = java.math.BigInteger.valueOf(1L);
            org.bouncycastle.math.ec.ECCurve highSpeedVideoFpsRanges = org.bouncycastle.asn1.anssi.ANSSINamedCurves.getHighSpeedVideoFpsRanges(new org.bouncycastle.math.ec.ECCurve.Fp(highResolutionOutputSizeshNQ4ISI, highResolutionOutputSizeshNQ4ISI2, highResolutionOutputSizeshNQ4ISI3, highResolutionOutputSizeshNQ4ISI4, valueOf));
            return new org.bouncycastle.asn1.x9.X9ECParameters(highSpeedVideoFpsRanges, org.bouncycastle.asn1.anssi.ANSSINamedCurves.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRanges, "04B6B3D4C356C139EB31183D4749D423958C27D2DCAF98B70164C97A2DD98F5CFF6142E0F7C8B204911F9271F0F3ECEF8C2701C307E8E4C9E183115A1554062CFB"), highResolutionOutputSizeshNQ4ISI4, valueOf, null);
        }
    };
    static final java.util.Hashtable getHighSpeedVideoFpsRangesFor;
    static final java.util.Hashtable getHighSpeedVideoSizes;

    static /* synthetic */ org.bouncycastle.math.ec.ECCurve getHighSpeedVideoFpsRanges(org.bouncycastle.math.ec.ECCurve eCCurve) {
        return eCCurve;
    }

    static {
        java.util.Hashtable hashtable = new java.util.Hashtable();
        getHighSpeedVideoFpsRangesFor = hashtable;
        java.util.Hashtable hashtable2 = new java.util.Hashtable();
        getHighResolutionOutputSizeshNQ4ISI = hashtable2;
        java.util.Hashtable hashtable3 = new java.util.Hashtable();
        getHighSpeedVideoSizes = hashtable3;
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = org.bouncycastle.asn1.anssi.ANSSIObjectIdentifiers.FRP256v1;
        org.bouncycastle.asn1.x9.X9ECParametersHolder x9ECParametersHolder = getHighSpeedVideoFpsRanges;
        hashtable.put(org.bouncycastle.util.Strings.toLowerCase("FRP256v1"), aSN1ObjectIdentifier);
        hashtable3.put(aSN1ObjectIdentifier, "FRP256v1");
        hashtable2.put(aSN1ObjectIdentifier, x9ECParametersHolder);
    }

    static /* synthetic */ java.math.BigInteger getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        return new java.math.BigInteger(1, org.bouncycastle.util.encoders.Hex.decodeStrict(str));
    }

    static /* synthetic */ org.bouncycastle.asn1.x9.X9ECPoint getHighSpeedVideoFpsRangesFor(org.bouncycastle.math.ec.ECCurve eCCurve, java.lang.String str) {
        org.bouncycastle.asn1.x9.X9ECPoint x9ECPoint = new org.bouncycastle.asn1.x9.X9ECPoint(eCCurve, org.bouncycastle.util.encoders.Hex.decodeStrict(str));
        org.bouncycastle.math.ec.WNafUtil.configureBasepoint(x9ECPoint.getPoint());
        return x9ECPoint;
    }

    public static org.bouncycastle.asn1.ASN1ObjectIdentifier getOID(java.lang.String str) {
        return (org.bouncycastle.asn1.ASN1ObjectIdentifier) getHighSpeedVideoFpsRangesFor.get(org.bouncycastle.util.Strings.toLowerCase(str));
    }

    public static java.util.Enumeration getNames() {
        return getHighSpeedVideoSizes.elements();
    }

    public static java.lang.String getName(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (java.lang.String) getHighSpeedVideoSizes.get(aSN1ObjectIdentifier);
    }

    public static org.bouncycastle.asn1.x9.X9ECParameters getByOID(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        org.bouncycastle.asn1.x9.X9ECParametersHolder x9ECParametersHolder = (org.bouncycastle.asn1.x9.X9ECParametersHolder) getHighResolutionOutputSizeshNQ4ISI.get(aSN1ObjectIdentifier);
        if (x9ECParametersHolder == null) {
            return null;
        }
        return x9ECParametersHolder.getParameters();
    }

    public static org.bouncycastle.asn1.x9.X9ECParameters getByName(java.lang.String str) {
        org.bouncycastle.asn1.ASN1ObjectIdentifier oid = getOID(str);
        if (oid == null) {
            return null;
        }
        return getByOID(oid);
    }
}
