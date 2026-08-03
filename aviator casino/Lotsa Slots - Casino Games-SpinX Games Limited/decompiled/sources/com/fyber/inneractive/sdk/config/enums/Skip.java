package com.fyber.inneractive.sdk.config.enums;

/* loaded from: classes3.dex */
public enum Skip {
    DEFAULT(-1),
    _0(0),
    _10(10),
    _15(15),
    _5(5);

    private static final java.util.Map<java.lang.Integer, com.fyber.inneractive.sdk.config.enums.Skip> CONSTANTS = new java.util.HashMap();
    private final java.lang.Integer value;

    static {
        for (com.fyber.inneractive.sdk.config.enums.Skip skip : values()) {
            CONSTANTS.put(skip.value, skip);
        }
    }

    Skip(java.lang.Integer num) {
        this.value = num;
    }

    public static com.fyber.inneractive.sdk.config.enums.Skip fromValue(java.lang.Integer num) {
        if (num == null) {
            return null;
        }
        return CONSTANTS.get(num);
    }

    public java.lang.Integer value() {
        return this.value;
    }
}
