package org.jose4j.jwa;

/* loaded from: classes18.dex */
public class CryptoPrimitive {
    private final javax.crypto.Mac Camera2StreamConfigurationMap;
    private final java.security.Key getHighResolutionOutputSizeshNQ4ISI;
    private final javax.crypto.Cipher getHighSpeedVideoFpsRanges;
    private final javax.crypto.KeyAgreement getHighSpeedVideoFpsRangesFor;
    private final java.security.Signature getHighSpeedVideoSizes;

    public CryptoPrimitive(java.security.Signature signature) {
        this(signature, null, null, null, null);
    }

    public CryptoPrimitive(javax.crypto.Cipher cipher) {
        this(null, cipher, null, null, null);
    }

    public CryptoPrimitive(javax.crypto.Mac mac) {
        this(null, null, mac, null, null);
    }

    public CryptoPrimitive(java.security.Key key) {
        this(null, null, null, key, null);
    }

    public CryptoPrimitive(javax.crypto.KeyAgreement keyAgreement) {
        this(null, null, null, null, keyAgreement);
    }

    private CryptoPrimitive(java.security.Signature signature, javax.crypto.Cipher cipher, javax.crypto.Mac mac, java.security.Key key, javax.crypto.KeyAgreement keyAgreement) {
        this.getHighSpeedVideoSizes = signature;
        this.getHighSpeedVideoFpsRanges = cipher;
        this.Camera2StreamConfigurationMap = mac;
        this.getHighResolutionOutputSizeshNQ4ISI = key;
        this.getHighSpeedVideoFpsRangesFor = keyAgreement;
    }

    public java.security.Signature getSignature() {
        return this.getHighSpeedVideoSizes;
    }

    public javax.crypto.Cipher getCipher() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public javax.crypto.Mac getMac() {
        return this.Camera2StreamConfigurationMap;
    }

    public java.security.Key getKey() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public javax.crypto.KeyAgreement getKeyAgreement() {
        return this.getHighSpeedVideoFpsRangesFor;
    }
}
