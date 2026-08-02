package org.bouncycastle.jcajce.spec;

/* loaded from: classes17.dex */
public class GOST3410ParameterSpec implements java.security.spec.AlgorithmParameterSpec {
    private final org.bouncycastle.asn1.ASN1ObjectIdentifier Camera2StreamConfigurationMap;
    private final org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoFpsRanges;
    private final org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoSizes;

    public GOST3410ParameterSpec(java.lang.String str) {
        this(org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves.getOID(str), str.indexOf("12-512") > 0 ? org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_3411_12_512 : str.indexOf("12-256") > 0 ? org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_3411_12_256 : org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3411_94_CryptoProParamSet, null);
    }

    public java.lang.String getPublicKeyParamSetName() {
        return org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves.getName(getPublicKeyParamSet());
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getPublicKeyParamSet() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getEncryptionParamSet() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getDigestParamSet() {
        return this.Camera2StreamConfigurationMap;
    }

    public GOST3410ParameterSpec(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier2, org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier3) {
        this.getHighSpeedVideoFpsRanges = aSN1ObjectIdentifier;
        this.Camera2StreamConfigurationMap = aSN1ObjectIdentifier2;
        this.getHighSpeedVideoSizes = aSN1ObjectIdentifier3;
    }

    public GOST3410ParameterSpec(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier2) {
        this(aSN1ObjectIdentifier, aSN1ObjectIdentifier2, null);
    }
}
