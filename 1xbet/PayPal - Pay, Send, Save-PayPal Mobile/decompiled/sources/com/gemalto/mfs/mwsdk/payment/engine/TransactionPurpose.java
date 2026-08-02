package com.gemalto.mfs.mwsdk.payment.engine;

/* loaded from: classes8.dex */
public enum TransactionPurpose {
    AUTHORIZE(Byte.MIN_VALUE),
    AUTHENTICATE((byte) 63),
    UNKNOWN((byte) -1);

    private int Camera2StreamConfigurationMap;

    TransactionPurpose(byte b) {
        this.Camera2StreamConfigurationMap = b;
    }

    public final int getValue() {
        return this.Camera2StreamConfigurationMap;
    }
}
