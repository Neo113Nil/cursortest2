package org.bouncycastle.asn1.cryptopro;

/* loaded from: classes17.dex */
public class ECGOST3410NamedCurves {
    static final java.util.Hashtable Camera2StreamConfigurationMap;
    static final java.util.Hashtable getHighResolutionOutputSizeshNQ4ISI;
    static final java.util.Hashtable getHighSpeedVideoSizes;

    static {
        java.util.Hashtable hashtable = new java.util.Hashtable();
        getHighSpeedVideoSizes = hashtable;
        java.util.Hashtable hashtable2 = new java.util.Hashtable();
        getHighResolutionOutputSizeshNQ4ISI = hashtable2;
        java.util.Hashtable hashtable3 = new java.util.Hashtable();
        Camera2StreamConfigurationMap = hashtable3;
        java.math.BigInteger bigInteger = new java.math.BigInteger(1, org.bouncycastle.util.encoders.Hex.decodeStrict("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFD97"));
        java.math.BigInteger bigInteger2 = new java.math.BigInteger(1, org.bouncycastle.util.encoders.Hex.decodeStrict("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF6C611070995AD10045841B09B761B893"));
        org.bouncycastle.math.ec.ECCurve.Fp fp = new org.bouncycastle.math.ec.ECCurve.Fp(bigInteger, new java.math.BigInteger(1, org.bouncycastle.util.encoders.Hex.decodeStrict("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFD94")), new java.math.BigInteger(1, org.bouncycastle.util.encoders.Hex.decodeStrict("A6")), bigInteger2, org.bouncycastle.math.ec.ECConstants.ONE);
        org.bouncycastle.math.ec.ECPoint createPoint = fp.createPoint(org.bouncycastle.math.ec.ECConstants.ONE, new java.math.BigInteger(1, org.bouncycastle.util.encoders.Hex.decodeStrict("8D91E471E0989CDA27DF505A453F2B7635294F2DDF23E3B122ACC99C9E9F1E14")));
        org.bouncycastle.math.ec.WNafUtil.configureBasepoint(createPoint);
        hashtable2.put(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3410_2001_CryptoPro_A, new org.bouncycastle.crypto.params.ECDomainParameters(fp, createPoint, bigInteger2, org.bouncycastle.math.ec.ECConstants.ONE));
        java.math.BigInteger bigInteger3 = new java.math.BigInteger(1, org.bouncycastle.util.encoders.Hex.decodeStrict("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFD97"));
        java.math.BigInteger bigInteger4 = new java.math.BigInteger(1, org.bouncycastle.util.encoders.Hex.decodeStrict("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF6C611070995AD10045841B09B761B893"));
        org.bouncycastle.math.ec.ECCurve.Fp fp2 = new org.bouncycastle.math.ec.ECCurve.Fp(bigInteger3, new java.math.BigInteger(1, org.bouncycastle.util.encoders.Hex.decodeStrict("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFD94")), new java.math.BigInteger(1, org.bouncycastle.util.encoders.Hex.decodeStrict("A6")), bigInteger4, org.bouncycastle.math.ec.ECConstants.ONE);
        org.bouncycastle.math.ec.ECPoint createPoint2 = fp2.createPoint(org.bouncycastle.math.ec.ECConstants.ONE, new java.math.BigInteger(1, org.bouncycastle.util.encoders.Hex.decodeStrict("8D91E471E0989CDA27DF505A453F2B7635294F2DDF23E3B122ACC99C9E9F1E14")));
        org.bouncycastle.math.ec.WNafUtil.configureBasepoint(createPoint2);
        hashtable2.put(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3410_2001_CryptoPro_XchA, new org.bouncycastle.crypto.params.ECDomainParameters(fp2, createPoint2, bigInteger4, org.bouncycastle.math.ec.ECConstants.ONE));
        java.math.BigInteger bigInteger5 = new java.math.BigInteger(1, org.bouncycastle.util.encoders.Hex.decodeStrict("8000000000000000000000000000000000000000000000000000000000000C99"));
        java.math.BigInteger bigInteger6 = new java.math.BigInteger(1, org.bouncycastle.util.encoders.Hex.decodeStrict("800000000000000000000000000000015F700CFFF1A624E5E497161BCC8A198F"));
        org.bouncycastle.math.ec.ECCurve.Fp fp3 = new org.bouncycastle.math.ec.ECCurve.Fp(bigInteger5, new java.math.BigInteger(1, org.bouncycastle.util.encoders.Hex.decodeStrict("8000000000000000000000000000000000000000000000000000000000000C96")), new java.math.BigInteger(1, org.bouncycastle.util.encoders.Hex.decodeStrict("3E1AF419A269A5F866A7D3C25C3DF80AE979259373FF2B182F49D4CE7E1BBC8B")), bigInteger6, org.bouncycastle.math.ec.ECConstants.ONE);
        org.bouncycastle.math.ec.ECPoint createPoint3 = fp3.createPoint(org.bouncycastle.math.ec.ECConstants.ONE, new java.math.BigInteger(1, org.bouncycastle.util.encoders.Hex.decodeStrict("3FA8124359F96680B83D1C3EB2C070E5C545C9858D03ECFB744BF8D717717EFC")));
        org.bouncycastle.math.ec.WNafUtil.configureBasepoint(createPoint3);
        hashtable2.put(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3410_2001_CryptoPro_B, new org.bouncycastle.crypto.params.ECDomainParameters(fp3, createPoint3, bigInteger6, org.bouncycastle.math.ec.ECConstants.ONE));
        java.math.BigInteger bigInteger7 = new java.math.BigInteger(1, org.bouncycastle.util.encoders.Hex.decodeStrict("9B9F605F5A858107AB1EC85E6B41C8AACF846E86789051D37998F7B9022D759B"));
        java.math.BigInteger bigInteger8 = new java.math.BigInteger(1, org.bouncycastle.util.encoders.Hex.decodeStrict("9B9F605F5A858107AB1EC85E6B41C8AA582CA3511EDDFB74F02F3A6598980BB9"));
        org.bouncycastle.math.ec.ECCurve.Fp fp4 = new org.bouncycastle.math.ec.ECCurve.Fp(bigInteger7, new java.math.BigInteger(1, org.bouncycastle.util.encoders.Hex.decodeStrict("9B9F605F5A858107AB1EC85E6B41C8AACF846E86789051D37998F7B9022D7598")), new java.math.BigInteger(1, org.bouncycastle.util.encoders.Hex.decodeStrict("805A")), bigInteger8, org.bouncycastle.math.ec.ECConstants.ONE);
        org.bouncycastle.math.ec.ECPoint createPoint4 = fp4.createPoint(org.bouncycastle.math.ec.ECConstants.ZERO, new java.math.BigInteger(1, org.bouncycastle.util.encoders.Hex.decodeStrict("41ECE55743711A8C3CBF3783CD08C0EE4D4DC440D4641A8F366E550DFDB3BB67")));
        org.bouncycastle.math.ec.WNafUtil.configureBasepoint(createPoint4);
        hashtable2.put(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3410_2001_CryptoPro_XchB, new org.bouncycastle.crypto.params.ECDomainParameters(fp4, createPoint4, bigInteger8, org.bouncycastle.math.ec.ECConstants.ONE));
        java.math.BigInteger bigInteger9 = new java.math.BigInteger(1, org.bouncycastle.util.encoders.Hex.decodeStrict("9B9F605F5A858107AB1EC85E6B41C8AACF846E86789051D37998F7B9022D759B"));
        java.math.BigInteger bigInteger10 = new java.math.BigInteger(1, org.bouncycastle.util.encoders.Hex.decodeStrict("9B9F605F5A858107AB1EC85E6B41C8AA582CA3511EDDFB74F02F3A6598980BB9"));
        org.bouncycastle.math.ec.ECCurve.Fp fp5 = new org.bouncycastle.math.ec.ECCurve.Fp(bigInteger9, new java.math.BigInteger(1, org.bouncycastle.util.encoders.Hex.decodeStrict("9B9F605F5A858107AB1EC85E6B41C8AACF846E86789051D37998F7B9022D7598")), new java.math.BigInteger(1, org.bouncycastle.util.encoders.Hex.decodeStrict("805A")), bigInteger10, org.bouncycastle.math.ec.ECConstants.ONE);
        org.bouncycastle.math.ec.ECPoint createPoint5 = fp5.createPoint(org.bouncycastle.math.ec.ECConstants.ZERO, new java.math.BigInteger(1, org.bouncycastle.util.encoders.Hex.decodeStrict("41ECE55743711A8C3CBF3783CD08C0EE4D4DC440D4641A8F366E550DFDB3BB67")));
        org.bouncycastle.math.ec.WNafUtil.configureBasepoint(createPoint5);
        hashtable2.put(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3410_2001_CryptoPro_C, new org.bouncycastle.crypto.params.ECDomainParameters(fp5, createPoint5, bigInteger10, org.bouncycastle.math.ec.ECConstants.ONE));
        java.math.BigInteger bigInteger11 = new java.math.BigInteger(1, org.bouncycastle.util.encoders.Hex.decodeStrict("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFD97"));
        java.math.BigInteger bigInteger12 = new java.math.BigInteger(1, org.bouncycastle.util.encoders.Hex.decodeStrict("400000000000000000000000000000000FD8CDDFC87B6635C115AF556C360C67"));
        org.bouncycastle.math.ec.ECCurve.Fp fp6 = new org.bouncycastle.math.ec.ECCurve.Fp(bigInteger11, new java.math.BigInteger(1, org.bouncycastle.util.encoders.Hex.decodeStrict("C2173F1513981673AF4892C23035A27CE25E2013BF95AA33B22C656F277E7335")), new java.math.BigInteger(1, org.bouncycastle.util.encoders.Hex.decodeStrict("295F9BAE7428ED9CCC20E7C359A9D41A22FCCD9108E17BF7BA9337A6F8AE9513")), bigInteger12, org.bouncycastle.math.ec.ECConstants.FOUR);
        org.bouncycastle.math.ec.ECPoint createPoint6 = fp6.createPoint(new java.math.BigInteger(1, org.bouncycastle.util.encoders.Hex.decodeStrict("91E38443A5E82C0D880923425712B2BB658B9196932E02C78B2582FE742DAA28")), new java.math.BigInteger(1, org.bouncycastle.util.encoders.Hex.decodeStrict("32879423AB1A0375895786C4BB46E9565FDE0B5344766740AF268ADB32322E5C")));
        org.bouncycastle.math.ec.WNafUtil.configureBasepoint(createPoint6);
        hashtable2.put(org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_3410_12_256_paramSetA, new org.bouncycastle.crypto.params.ECDomainParameters(fp6, createPoint6, bigInteger12, org.bouncycastle.math.ec.ECConstants.FOUR));
        java.math.BigInteger bigInteger13 = new java.math.BigInteger(1, org.bouncycastle.util.encoders.Hex.decodeStrict("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFDC7"));
        java.math.BigInteger bigInteger14 = new java.math.BigInteger(1, org.bouncycastle.util.encoders.Hex.decodeStrict("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF27E69532F48D89116FF22B8D4E0560609B4B38ABFAD2B85DCACDB1411F10B275"));
        org.bouncycastle.math.ec.ECCurve.Fp fp7 = new org.bouncycastle.math.ec.ECCurve.Fp(bigInteger13, new java.math.BigInteger(1, org.bouncycastle.util.encoders.Hex.decodeStrict("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFDC4")), new java.math.BigInteger(1, org.bouncycastle.util.encoders.Hex.decodeStrict("E8C2505DEDFC86DDC1BD0B2B6667F1DA34B82574761CB0E879BD081CFD0B6265EE3CB090F30D27614CB4574010DA90DD862EF9D4EBEE4761503190785A71C760")), bigInteger14, org.bouncycastle.math.ec.ECConstants.ONE);
        org.bouncycastle.math.ec.ECPoint createPoint7 = fp7.createPoint(org.bouncycastle.math.ec.ECConstants.THREE, new java.math.BigInteger(1, org.bouncycastle.util.encoders.Hex.decodeStrict("7503CFE87A836AE3A61B8816E25450E6CE5E1C93ACF1ABC1778064FDCBEFA921DF1626BE4FD036E93D75E6A50E3A41E98028FE5FC235F5B889A589CB5215F2A4")));
        org.bouncycastle.math.ec.WNafUtil.configureBasepoint(createPoint7);
        hashtable2.put(org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_3410_12_512_paramSetA, new org.bouncycastle.crypto.params.ECDomainParameters(fp7, createPoint7, bigInteger14, org.bouncycastle.math.ec.ECConstants.ONE));
        java.math.BigInteger bigInteger15 = new java.math.BigInteger(1, org.bouncycastle.util.encoders.Hex.decodeStrict("8000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000006F"));
        java.math.BigInteger bigInteger16 = new java.math.BigInteger(1, org.bouncycastle.util.encoders.Hex.decodeStrict("800000000000000000000000000000000000000000000000000000000000000149A1EC142565A545ACFDB77BD9D40CFA8B996712101BEA0EC6346C54374F25BD"));
        org.bouncycastle.math.ec.ECCurve.Fp fp8 = new org.bouncycastle.math.ec.ECCurve.Fp(bigInteger15, new java.math.BigInteger(1, org.bouncycastle.util.encoders.Hex.decodeStrict("8000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000006C")), new java.math.BigInteger(1, org.bouncycastle.util.encoders.Hex.decodeStrict("687D1B459DC841457E3E06CF6F5E2517B97C7D614AF138BCBF85DC806C4B289F3E965D2DB1416D217F8B276FAD1AB69C50F78BEE1FA3106EFB8CCBC7C5140116")), bigInteger16, org.bouncycastle.math.ec.ECConstants.ONE);
        org.bouncycastle.math.ec.ECPoint createPoint8 = fp8.createPoint(org.bouncycastle.math.ec.ECConstants.TWO, new java.math.BigInteger(1, org.bouncycastle.util.encoders.Hex.decodeStrict("1A8F7EDA389B094C2C071E3647A8940F3C123B697578C213BE6DD9E6C8EC7335DCB228FD1EDF4A39152CBCAAF8C0398828041055F94CEEEC7E21340780FE41BD")));
        org.bouncycastle.math.ec.WNafUtil.configureBasepoint(createPoint8);
        hashtable2.put(org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_3410_12_512_paramSetB, new org.bouncycastle.crypto.params.ECDomainParameters(fp8, createPoint8, bigInteger16, org.bouncycastle.math.ec.ECConstants.ONE));
        java.math.BigInteger bigInteger17 = new java.math.BigInteger(1, org.bouncycastle.util.encoders.Hex.decodeStrict("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFDC7"));
        java.math.BigInteger bigInteger18 = new java.math.BigInteger(1, org.bouncycastle.util.encoders.Hex.decodeStrict("3FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC98CDBA46506AB004C33A9FF5147502CC8EDA9E7A769A12694623CEF47F023ED"));
        org.bouncycastle.math.ec.ECCurve.Fp fp9 = new org.bouncycastle.math.ec.ECCurve.Fp(bigInteger17, new java.math.BigInteger(1, org.bouncycastle.util.encoders.Hex.decodeStrict("DC9203E514A721875485A529D2C722FB187BC8980EB866644DE41C68E143064546E861C0E2C9EDD92ADE71F46FCF50FF2AD97F951FDA9F2A2EB6546F39689BD3")), new java.math.BigInteger(1, org.bouncycastle.util.encoders.Hex.decodeStrict("B4C4EE28CEBC6C2C8AC12952CF37F16AC7EFB6A9F69F4B57FFDA2E4F0DE5ADE038CBC2FFF719D2C18DE0284B8BFEF3B52B8CC7A5F5BF0A3C8D2319A5312557E1")), bigInteger18, org.bouncycastle.math.ec.ECConstants.FOUR);
        org.bouncycastle.math.ec.ECPoint createPoint9 = fp9.createPoint(new java.math.BigInteger(1, org.bouncycastle.util.encoders.Hex.decodeStrict("E2E31EDFC23DE7BDEBE241CE593EF5DE2295B7A9CBAEF021D385F7074CEA043AA27272A7AE602BF2A7B9033DB9ED3610C6FB85487EAE97AAC5BC7928C1950148")), new java.math.BigInteger(1, org.bouncycastle.util.encoders.Hex.decodeStrict("F5CE40D95B5EB899ABBCCFF5911CB8577939804D6527378B8C108C3D2090FF9BE18E2D33E3021ED2EF32D85822423B6304F726AA854BAE07D0396E9A9ADDC40F")));
        org.bouncycastle.math.ec.WNafUtil.configureBasepoint(createPoint9);
        hashtable2.put(org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_3410_12_512_paramSetC, new org.bouncycastle.crypto.params.ECDomainParameters(fp9, createPoint9, bigInteger18, org.bouncycastle.math.ec.ECConstants.FOUR));
        hashtable.put("GostR3410-2001-CryptoPro-A", org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3410_2001_CryptoPro_A);
        hashtable.put("GostR3410-2001-CryptoPro-B", org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3410_2001_CryptoPro_B);
        hashtable.put("GostR3410-2001-CryptoPro-C", org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3410_2001_CryptoPro_C);
        hashtable.put("GostR3410-2001-CryptoPro-XchA", org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3410_2001_CryptoPro_XchA);
        hashtable.put("GostR3410-2001-CryptoPro-XchB", org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3410_2001_CryptoPro_XchB);
        hashtable.put("Tc26-Gost-3410-12-256-paramSetA", org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_3410_12_256_paramSetA);
        hashtable.put("Tc26-Gost-3410-12-512-paramSetA", org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_3410_12_512_paramSetA);
        hashtable.put("Tc26-Gost-3410-12-512-paramSetB", org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_3410_12_512_paramSetB);
        hashtable.put("Tc26-Gost-3410-12-512-paramSetC", org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_3410_12_512_paramSetC);
        hashtable3.put(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3410_2001_CryptoPro_A, "GostR3410-2001-CryptoPro-A");
        hashtable3.put(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3410_2001_CryptoPro_B, "GostR3410-2001-CryptoPro-B");
        hashtable3.put(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3410_2001_CryptoPro_C, "GostR3410-2001-CryptoPro-C");
        hashtable3.put(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3410_2001_CryptoPro_XchA, "GostR3410-2001-CryptoPro-XchA");
        hashtable3.put(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3410_2001_CryptoPro_XchB, "GostR3410-2001-CryptoPro-XchB");
        hashtable3.put(org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_3410_12_256_paramSetA, "Tc26-Gost-3410-12-256-paramSetA");
        hashtable3.put(org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_3410_12_512_paramSetA, "Tc26-Gost-3410-12-512-paramSetA");
        hashtable3.put(org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_3410_12_512_paramSetB, "Tc26-Gost-3410-12-512-paramSetB");
        hashtable3.put(org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_3410_12_512_paramSetC, "Tc26-Gost-3410-12-512-paramSetC");
    }

    public static org.bouncycastle.asn1.ASN1ObjectIdentifier getOID(java.lang.String str) {
        return (org.bouncycastle.asn1.ASN1ObjectIdentifier) getHighSpeedVideoSizes.get(str);
    }

    public static java.util.Enumeration getNames() {
        return Camera2StreamConfigurationMap.elements();
    }

    public static java.lang.String getName(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (java.lang.String) Camera2StreamConfigurationMap.get(aSN1ObjectIdentifier);
    }

    public static org.bouncycastle.asn1.x9.X9ECParameters getByOIDX9(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        org.bouncycastle.crypto.params.ECDomainParameters eCDomainParameters = (org.bouncycastle.crypto.params.ECDomainParameters) getHighResolutionOutputSizeshNQ4ISI.get(aSN1ObjectIdentifier);
        if (eCDomainParameters == null) {
            return null;
        }
        return new org.bouncycastle.asn1.x9.X9ECParameters(eCDomainParameters.getCurve(), new org.bouncycastle.asn1.x9.X9ECPoint(eCDomainParameters.getG(), false), eCDomainParameters.getN(), eCDomainParameters.getH(), eCDomainParameters.getSeed());
    }

    public static org.bouncycastle.crypto.params.ECDomainParameters getByOID(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (org.bouncycastle.crypto.params.ECDomainParameters) getHighResolutionOutputSizeshNQ4ISI.get(aSN1ObjectIdentifier);
    }

    public static org.bouncycastle.asn1.x9.X9ECParameters getByNameX9(java.lang.String str) {
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = (org.bouncycastle.asn1.ASN1ObjectIdentifier) getHighSpeedVideoSizes.get(str);
        if (aSN1ObjectIdentifier == null) {
            return null;
        }
        return getByOIDX9(aSN1ObjectIdentifier);
    }

    public static org.bouncycastle.crypto.params.ECDomainParameters getByName(java.lang.String str) {
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = (org.bouncycastle.asn1.ASN1ObjectIdentifier) getHighSpeedVideoSizes.get(str);
        if (aSN1ObjectIdentifier == null) {
            return null;
        }
        return (org.bouncycastle.crypto.params.ECDomainParameters) getHighResolutionOutputSizeshNQ4ISI.get(aSN1ObjectIdentifier);
    }
}
