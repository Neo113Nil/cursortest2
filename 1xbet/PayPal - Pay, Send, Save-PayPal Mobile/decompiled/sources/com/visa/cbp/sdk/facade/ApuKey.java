package com.visa.cbp.sdk.facade;

/* loaded from: classes5.dex */
public class ApuKey {
    java.lang.String agr_key_knd;
    com.visa.cbp.sdk.facade.JwkApu jwk;

    public ApuKey(java.security.interfaces.ECPublicKey eCPublicKey) {
        byte[] byteArray = eCPublicKey.getW().getAffineX().toByteArray();
        byte[] byteArray2 = eCPublicKey.getW().getAffineY().toByteArray();
        java.lang.String obj = com.nimbusds.jose.util.Base64URL.encode(byteConvert32Bytes(byteArray)).toString();
        java.lang.String obj2 = com.nimbusds.jose.util.Base64URL.encode(byteConvert32Bytes(byteArray2)).toString();
        this.agr_key_knd = "EPHEMERAL";
        this.jwk = new com.visa.cbp.sdk.facade.JwkApu("EC", org.jose4j.keys.EllipticCurves.P_256, obj, obj2);
    }

    private byte[] byteConvert32Bytes(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length >= 32) {
            return bArr;
        }
        byte[] bArr2 = new byte[32];
        for (int i = 0; i < 32 - bArr.length; i++) {
            bArr2[i] = 0;
        }
        java.lang.System.arraycopy(bArr, 0, bArr2, 32 - bArr.length, bArr.length);
        return bArr2;
    }

    public /* synthetic */ ApuKey() {
    }
}
