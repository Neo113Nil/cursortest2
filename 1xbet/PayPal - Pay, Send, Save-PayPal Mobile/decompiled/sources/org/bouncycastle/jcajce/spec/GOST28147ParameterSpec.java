package org.bouncycastle.jcajce.spec;

/* loaded from: classes17.dex */
public class GOST28147ParameterSpec implements java.security.spec.AlgorithmParameterSpec {
    private static java.util.Map getHighSpeedVideoFpsRanges;
    private byte[] Camera2StreamConfigurationMap;
    private byte[] getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GOST28147ParameterSpec(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, byte[] bArr) {
        this(r0);
        java.lang.String str = (java.lang.String) getHighSpeedVideoFpsRanges.get(aSN1ObjectIdentifier);
        if (str == null) {
            throw new java.lang.IllegalArgumentException("unknown OID: ".concat(java.lang.String.valueOf(aSN1ObjectIdentifier)));
        }
        this.Camera2StreamConfigurationMap = org.bouncycastle.util.Arrays.clone(bArr);
    }

    public byte[] getSbox() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoFpsRangesFor);
    }

    public byte[] getSBox() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoFpsRangesFor);
    }

    public byte[] getIV() {
        return org.bouncycastle.util.Arrays.clone(this.Camera2StreamConfigurationMap);
    }

    public GOST28147ParameterSpec(byte[] bArr, byte[] bArr2) {
        this(bArr);
        byte[] bArr3 = new byte[bArr2.length];
        this.Camera2StreamConfigurationMap = bArr3;
        java.lang.System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
    }

    public GOST28147ParameterSpec(byte[] bArr) {
        this.Camera2StreamConfigurationMap = null;
        this.getHighSpeedVideoFpsRangesFor = null;
        byte[] bArr2 = new byte[bArr.length];
        this.getHighSpeedVideoFpsRangesFor = bArr2;
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
    }

    public GOST28147ParameterSpec(java.lang.String str, byte[] bArr) {
        this(str);
        byte[] bArr2 = new byte[bArr.length];
        this.Camera2StreamConfigurationMap = bArr2;
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
    }

    public GOST28147ParameterSpec(java.lang.String str) {
        this.Camera2StreamConfigurationMap = null;
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.crypto.engines.GOST28147Engine.getSBox(str);
    }

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        getHighSpeedVideoFpsRanges = hashMap;
        hashMap.put(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_A_ParamSet, "E-A");
        getHighSpeedVideoFpsRanges.put(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_B_ParamSet, "E-B");
        getHighSpeedVideoFpsRanges.put(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_C_ParamSet, "E-C");
        getHighSpeedVideoFpsRanges.put(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_D_ParamSet, "E-D");
        getHighSpeedVideoFpsRanges.put(org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_28147_param_Z, "Param-Z");
    }
}
