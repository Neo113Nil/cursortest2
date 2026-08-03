package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes3.dex */
public enum k4 {
    INT(0),
    LONG(0L),
    FLOAT(java.lang.Float.valueOf(0.0f)),
    DOUBLE(java.lang.Double.valueOf(0.0d)),
    BOOLEAN(java.lang.Boolean.FALSE),
    STRING(""),
    BYTE_STRING(com.fyber.inneractive.sdk.protobuf.s.b),
    ENUM(null),
    MESSAGE(null);

    private final java.lang.Object defaultDefault;

    k4(java.io.Serializable serializable) {
        this.defaultDefault = serializable;
    }
}
