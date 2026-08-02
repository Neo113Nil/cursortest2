package com.google.protobuf;

import java.io.Serializable;

/* loaded from: classes2.dex */
public enum O {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(AbstractC0911k.class, AbstractC0911k.f12212b),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);

    O(Class cls, Serializable serializable) {
    }
}
