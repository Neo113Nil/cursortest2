package org.bouncycastle.asn1.gm;

/* loaded from: classes17.dex */
public class GMNamedCurves {
    static final java.util.Hashtable Camera2StreamConfigurationMap;
    static final java.util.Hashtable getHighResolutionOutputSizeshNQ4ISI;
    static final java.util.Hashtable getHighSpeedVideoFpsRanges;
    static org.bouncycastle.asn1.x9.X9ECParametersHolder getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.x9.X9ECParametersHolder() { // from class: org.bouncycastle.asn1.gm.GMNamedCurves.1
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public final org.bouncycastle.asn1.x9.X9ECParameters createParameters() {
            java.math.BigInteger highSpeedVideoSizes = org.bouncycastle.asn1.gm.GMNamedCurves.getHighSpeedVideoSizes("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFF");
            java.math.BigInteger highSpeedVideoSizes2 = org.bouncycastle.asn1.gm.GMNamedCurves.getHighSpeedVideoSizes("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFC");
            java.math.BigInteger highSpeedVideoSizes3 = org.bouncycastle.asn1.gm.GMNamedCurves.getHighSpeedVideoSizes("28E9FA9E9D9F5E344D5A9E4BCF6509A7F39789F515AB8F92DDBCBD414D940E93");
            java.math.BigInteger highSpeedVideoSizes4 = org.bouncycastle.asn1.gm.GMNamedCurves.getHighSpeedVideoSizes("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFF7203DF6B21C6052B53BBF40939D54123");
            java.math.BigInteger valueOf = java.math.BigInteger.valueOf(1L);
            org.bouncycastle.math.ec.ECCurve highSpeedVideoFpsRangesFor = org.bouncycastle.asn1.gm.GMNamedCurves.getHighSpeedVideoFpsRangesFor(new org.bouncycastle.math.ec.ECCurve.Fp(highSpeedVideoSizes, highSpeedVideoSizes2, highSpeedVideoSizes3, highSpeedVideoSizes4, valueOf));
            return new org.bouncycastle.asn1.x9.X9ECParameters(highSpeedVideoFpsRangesFor, org.bouncycastle.asn1.gm.GMNamedCurves.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor, "0432C4AE2C1F1981195F9904466A39C9948FE30BBFF2660BE1715A4589334C74C7BC3736A2F4F6779C59BDCEE36B692153D0A9877CC62A474002DF32E52139F0A0"), highSpeedVideoSizes4, valueOf, null);
        }
    };
    static org.bouncycastle.asn1.x9.X9ECParametersHolder getHighSpeedVideoSizes = new org.bouncycastle.asn1.x9.X9ECParametersHolder() { // from class: org.bouncycastle.asn1.gm.GMNamedCurves.2
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public final org.bouncycastle.asn1.x9.X9ECParameters createParameters() {
            java.math.BigInteger highSpeedVideoSizes = org.bouncycastle.asn1.gm.GMNamedCurves.getHighSpeedVideoSizes("BDB6F4FE3E8B1D9E0DA8C0D46F4C318CEFE4AFE3B6B8551F");
            java.math.BigInteger highSpeedVideoSizes2 = org.bouncycastle.asn1.gm.GMNamedCurves.getHighSpeedVideoSizes("BB8E5E8FBC115E139FE6A814FE48AAA6F0ADA1AA5DF91985");
            java.math.BigInteger highSpeedVideoSizes3 = org.bouncycastle.asn1.gm.GMNamedCurves.getHighSpeedVideoSizes("1854BEBDC31B21B7AEFC80AB0ECD10D5B1B3308E6DBF11C1");
            java.math.BigInteger highSpeedVideoSizes4 = org.bouncycastle.asn1.gm.GMNamedCurves.getHighSpeedVideoSizes("BDB6F4FE3E8B1D9E0DA8C0D40FC962195DFAE76F56564677");
            java.math.BigInteger valueOf = java.math.BigInteger.valueOf(1L);
            org.bouncycastle.math.ec.ECCurve highSpeedVideoFpsRangesFor = org.bouncycastle.asn1.gm.GMNamedCurves.getHighSpeedVideoFpsRangesFor(new org.bouncycastle.math.ec.ECCurve.Fp(highSpeedVideoSizes, highSpeedVideoSizes2, highSpeedVideoSizes3, highSpeedVideoSizes4, valueOf));
            return new org.bouncycastle.asn1.x9.X9ECParameters(highSpeedVideoFpsRangesFor, org.bouncycastle.asn1.gm.GMNamedCurves.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor, "044AD5F7048DE709AD51236DE65E4D4B482C836DC6E410664002BB3A02D4AAADACAE24817A4CA3A1B014B5270432DB27D2"), highSpeedVideoSizes4, valueOf, null);
        }
    };

    static /* synthetic */ org.bouncycastle.math.ec.ECCurve getHighSpeedVideoFpsRangesFor(org.bouncycastle.math.ec.ECCurve eCCurve) {
        return eCCurve;
    }

    static {
        java.util.Hashtable hashtable = new java.util.Hashtable();
        getHighSpeedVideoFpsRanges = hashtable;
        java.util.Hashtable hashtable2 = new java.util.Hashtable();
        getHighResolutionOutputSizeshNQ4ISI = hashtable2;
        java.util.Hashtable hashtable3 = new java.util.Hashtable();
        Camera2StreamConfigurationMap = hashtable3;
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = org.bouncycastle.asn1.gm.GMObjectIdentifiers.wapip192v1;
        org.bouncycastle.asn1.x9.X9ECParametersHolder x9ECParametersHolder = getHighSpeedVideoSizes;
        hashtable.put(org.bouncycastle.util.Strings.toLowerCase("wapip192v1"), aSN1ObjectIdentifier);
        hashtable3.put(aSN1ObjectIdentifier, "wapip192v1");
        hashtable2.put(aSN1ObjectIdentifier, x9ECParametersHolder);
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier2 = org.bouncycastle.asn1.gm.GMObjectIdentifiers.sm2p256v1;
        org.bouncycastle.asn1.x9.X9ECParametersHolder x9ECParametersHolder2 = getHighSpeedVideoFpsRangesFor;
        hashtable.put(org.bouncycastle.util.Strings.toLowerCase("sm2p256v1"), aSN1ObjectIdentifier2);
        hashtable3.put(aSN1ObjectIdentifier2, "sm2p256v1");
        hashtable2.put(aSN1ObjectIdentifier2, x9ECParametersHolder2);
    }

    static /* synthetic */ java.math.BigInteger getHighSpeedVideoSizes(java.lang.String str) {
        return new java.math.BigInteger(1, org.bouncycastle.util.encoders.Hex.decodeStrict(str));
    }

    static /* synthetic */ org.bouncycastle.asn1.x9.X9ECPoint getHighSpeedVideoFpsRangesFor(org.bouncycastle.math.ec.ECCurve eCCurve, java.lang.String str) {
        org.bouncycastle.asn1.x9.X9ECPoint x9ECPoint = new org.bouncycastle.asn1.x9.X9ECPoint(eCCurve, org.bouncycastle.util.encoders.Hex.decodeStrict(str));
        org.bouncycastle.math.ec.WNafUtil.configureBasepoint(x9ECPoint.getPoint());
        return x9ECPoint;
    }

    public static org.bouncycastle.asn1.ASN1ObjectIdentifier getOID(java.lang.String str) {
        return (org.bouncycastle.asn1.ASN1ObjectIdentifier) getHighSpeedVideoFpsRanges.get(org.bouncycastle.util.Strings.toLowerCase(str));
    }

    public static java.util.Enumeration getNames() {
        return Camera2StreamConfigurationMap.elements();
    }

    public static java.lang.String getName(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (java.lang.String) Camera2StreamConfigurationMap.get(aSN1ObjectIdentifier);
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
