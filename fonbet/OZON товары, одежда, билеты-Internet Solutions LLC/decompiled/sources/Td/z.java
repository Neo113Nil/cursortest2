package Td;

/* loaded from: classes.dex */
public enum z {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(c.f27045a),
    ENUM(null),
    MESSAGE(null);

    private final Object defaultDefault;

    z(Object obj) {
        this.defaultDefault = obj;
    }
}
