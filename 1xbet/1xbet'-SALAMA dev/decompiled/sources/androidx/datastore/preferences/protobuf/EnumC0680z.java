package androidx.datastore.preferences.protobuf;

import java.io.Serializable;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0680z {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(C0662g.class, C0662g.f9182c),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);

    EnumC0680z(Class cls, Serializable serializable) {
    }
}
