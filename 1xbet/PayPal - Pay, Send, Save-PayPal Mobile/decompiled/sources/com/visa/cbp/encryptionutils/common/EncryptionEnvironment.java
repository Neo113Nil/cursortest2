package com.visa.cbp.encryptionutils.common;

/* loaded from: classes16.dex */
public enum EncryptionEnvironment {
    SBX(1),
    PROD(2),
    CEMA_PROD(3);

    public static final java.util.HashMap<java.lang.Integer, com.visa.cbp.encryptionutils.common.EncryptionEnvironment> map = new java.util.HashMap<>();
    private int getHighSpeedVideoFpsRanges;

    static {
        for (com.visa.cbp.encryptionutils.common.EncryptionEnvironment encryptionEnvironment : values()) {
            map.put(java.lang.Integer.valueOf(encryptionEnvironment.getHighSpeedVideoFpsRanges), encryptionEnvironment);
        }
    }

    EncryptionEnvironment(int i) {
        this.getHighSpeedVideoFpsRanges = i;
    }

    public final int getCode() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public static com.visa.cbp.encryptionutils.common.EncryptionEnvironment get(int i) {
        return map.get(java.lang.Integer.valueOf(i));
    }
}
