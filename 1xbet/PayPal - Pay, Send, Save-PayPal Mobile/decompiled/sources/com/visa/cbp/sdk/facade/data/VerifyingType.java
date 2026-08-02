package com.visa.cbp.sdk.facade.data;

/* loaded from: classes5.dex */
public enum VerifyingType {
    NO_CD_CVM((byte) 0),
    PASSCODE((byte) 1),
    BIOMETRIC_FINGERPRINT((byte) 16),
    MOBILE_DEVICE_PATTERN((byte) 17),
    FINGER_BIOMETRIC((byte) 2),
    MOBILE_DEVICE_PATTERN_LOCK((byte) 3),
    FACIAL_BIOMETRIC((byte) 4),
    IRIS_BIOMETRIC((byte) 5),
    VOICE_BIOMETRIC((byte) 6),
    OTHER_CD_CVM((byte) 1),
    MOBILE_DEVICE((byte) 1);

    private final byte value;

    VerifyingType(byte b) {
        this.value = b;
    }

    public final byte getValue() {
        return this.value;
    }
}
