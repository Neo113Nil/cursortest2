package org.bouncycastle.jce.spec;

/* loaded from: classes17.dex */
public class GOST3410ParameterSpec implements java.security.spec.AlgorithmParameterSpec, org.bouncycastle.jce.interfaces.GOST3410Params {
    private java.lang.String Camera2StreamConfigurationMap;
    private java.lang.String getHighSpeedVideoFpsRanges;
    private java.lang.String getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.jce.spec.GOST3410PublicKeyParameterSetSpec getHighSpeedVideoSizes;

    public int hashCode() {
        int hashCode = this.getHighSpeedVideoSizes.hashCode();
        int hashCode2 = this.Camera2StreamConfigurationMap.hashCode();
        java.lang.String str = this.getHighSpeedVideoFpsRanges;
        return (hashCode ^ hashCode2) ^ (str != null ? str.hashCode() : 0);
    }

    @Override // org.bouncycastle.jce.interfaces.GOST3410Params
    public org.bouncycastle.jce.spec.GOST3410PublicKeyParameterSetSpec getPublicKeyParameters() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // org.bouncycastle.jce.interfaces.GOST3410Params
    public java.lang.String getPublicKeyParamSetOID() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // org.bouncycastle.jce.interfaces.GOST3410Params
    public java.lang.String getEncryptionParamSetOID() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // org.bouncycastle.jce.interfaces.GOST3410Params
    public java.lang.String getDigestParamSetOID() {
        return this.Camera2StreamConfigurationMap;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof org.bouncycastle.jce.spec.GOST3410ParameterSpec)) {
            return false;
        }
        org.bouncycastle.jce.spec.GOST3410ParameterSpec gOST3410ParameterSpec = (org.bouncycastle.jce.spec.GOST3410ParameterSpec) obj;
        if (!this.getHighSpeedVideoSizes.equals(gOST3410ParameterSpec.getHighSpeedVideoSizes) || !this.Camera2StreamConfigurationMap.equals(gOST3410ParameterSpec.Camera2StreamConfigurationMap)) {
            return false;
        }
        java.lang.String str = this.getHighSpeedVideoFpsRanges;
        java.lang.String str2 = gOST3410ParameterSpec.getHighSpeedVideoFpsRanges;
        if (str != str2) {
            return str != null && str.equals(str2);
        }
        return true;
    }

    public static org.bouncycastle.jce.spec.GOST3410ParameterSpec fromPublicKeyAlg(org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters gOST3410PublicKeyAlgParameters) {
        return gOST3410PublicKeyAlgParameters.getEncryptionParamSet() != null ? new org.bouncycastle.jce.spec.GOST3410ParameterSpec(gOST3410PublicKeyAlgParameters.getPublicKeyParamSet().getId(), gOST3410PublicKeyAlgParameters.getDigestParamSet().getId(), gOST3410PublicKeyAlgParameters.getEncryptionParamSet().getId()) : new org.bouncycastle.jce.spec.GOST3410ParameterSpec(gOST3410PublicKeyAlgParameters.getPublicKeyParamSet().getId(), gOST3410PublicKeyAlgParameters.getDigestParamSet().getId());
    }

    public GOST3410ParameterSpec(org.bouncycastle.jce.spec.GOST3410PublicKeyParameterSetSpec gOST3410PublicKeyParameterSetSpec) {
        this.getHighSpeedVideoSizes = gOST3410PublicKeyParameterSetSpec;
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3411_94_CryptoProParamSet.getId();
        this.getHighSpeedVideoFpsRanges = null;
    }

    public GOST3410ParameterSpec(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        org.bouncycastle.asn1.cryptopro.GOST3410ParamSetParameters gOST3410ParamSetParameters;
        try {
            gOST3410ParamSetParameters = org.bouncycastle.asn1.cryptopro.GOST3410NamedParameters.getByOID(new org.bouncycastle.asn1.ASN1ObjectIdentifier(str));
        } catch (java.lang.IllegalArgumentException unused) {
            org.bouncycastle.asn1.ASN1ObjectIdentifier oid = org.bouncycastle.asn1.cryptopro.GOST3410NamedParameters.getOID(str);
            if (oid != null) {
                str = oid.getId();
                gOST3410ParamSetParameters = org.bouncycastle.asn1.cryptopro.GOST3410NamedParameters.getByOID(oid);
            } else {
                gOST3410ParamSetParameters = null;
            }
        }
        if (gOST3410ParamSetParameters == null) {
            throw new java.lang.IllegalArgumentException("no key parameter set for passed in name/OID.");
        }
        this.getHighSpeedVideoSizes = new org.bouncycastle.jce.spec.GOST3410PublicKeyParameterSetSpec(gOST3410ParamSetParameters.getP(), gOST3410ParamSetParameters.getQ(), gOST3410ParamSetParameters.getA());
        this.getHighSpeedVideoFpsRangesFor = str;
        this.Camera2StreamConfigurationMap = str2;
        this.getHighSpeedVideoFpsRanges = str3;
    }

    public GOST3410ParameterSpec(java.lang.String str, java.lang.String str2) {
        this(str, str2, null);
    }

    public GOST3410ParameterSpec(java.lang.String str) {
        this(str, org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3411_94_CryptoProParamSet.getId(), null);
    }
}
