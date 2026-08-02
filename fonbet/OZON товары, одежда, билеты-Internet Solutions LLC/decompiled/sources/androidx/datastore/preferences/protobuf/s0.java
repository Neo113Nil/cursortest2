package androidx.datastore.preferences.protobuf;

import java.io.Serializable;

/* loaded from: classes.dex */
public enum s0 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(AbstractC5362h.f42524b),
    ENUM(null),
    MESSAGE(null);

    private final Object defaultDefault;

    s0(Serializable serializable) {
        this.defaultDefault = serializable;
    }
}
