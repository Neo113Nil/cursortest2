package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public enum B {
    VOID(java.lang.Void.class, null),
    INT(java.lang.Integer.class, 0),
    LONG(java.lang.Long.class, 0L),
    FLOAT(java.lang.Float.class, java.lang.Float.valueOf(0.0f)),
    DOUBLE(java.lang.Double.class, java.lang.Double.valueOf(com.yandex.varioqub.config.model.ConfigValue.DOUBLE_DEFAULT_VALUE)),
    BOOLEAN(java.lang.Boolean.class, java.lang.Boolean.FALSE),
    STRING(java.lang.String.class, ""),
    BYTE_STRING(androidx.datastore.preferences.protobuf.C0071g.class, androidx.datastore.preferences.protobuf.C0071g.f2301c),
    ENUM(java.lang.Integer.class, null),
    MESSAGE(java.lang.Object.class, null);

    B(java.lang.Class cls, java.io.Serializable serializable) {
    }
}
