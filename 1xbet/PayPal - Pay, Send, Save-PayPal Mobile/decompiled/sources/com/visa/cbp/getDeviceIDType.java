package com.visa.cbp;

/* loaded from: classes5.dex */
public class getDeviceIDType {
    public static byte[] ReplenishAckRequest(java.security.PrivateKey privateKey, java.security.PublicKey publicKey) {
        try {
            Camera2StreamConfigurationMap(privateKey, publicKey);
            javax.crypto.KeyAgreement keyAgreement = javax.crypto.KeyAgreement.getInstance("ECDH");
            keyAgreement.init(privateKey);
            keyAgreement.doPhase(publicKey, true);
            return keyAgreement.generateSecret();
        } catch (java.security.InvalidKeyException | java.security.NoSuchAlgorithmException unused) {
            throw new com.visa.cbp.sdk.facade.exception.IncompatibleKeysException();
        }
    }

    private static void Camera2StreamConfigurationMap(java.security.PrivateKey privateKey, java.security.PublicKey publicKey) throws java.security.InvalidKeyException {
        try {
            if (((java.security.interfaces.ECKey) publicKey).getParams().getCurve().getField().getFieldSize() == ((java.security.interfaces.ECKey) privateKey).getParams().getCurve().getField().getFieldSize()) {
            } else {
                throw new java.security.InvalidKeyException();
            }
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            throw new java.security.InvalidKeyException();
        }
    }
}
