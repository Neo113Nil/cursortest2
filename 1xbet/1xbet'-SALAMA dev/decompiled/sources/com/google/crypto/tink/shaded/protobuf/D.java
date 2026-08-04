package com.google.crypto.tink.shaded.protobuf;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public enum D {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(AbstractC0829i.class, AbstractC0829i.f11779b),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);

    D(Class cls, Serializable serializable) {
    }
}
