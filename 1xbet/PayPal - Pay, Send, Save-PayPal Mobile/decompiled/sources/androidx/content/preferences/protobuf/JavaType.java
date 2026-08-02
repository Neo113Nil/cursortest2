package androidx.content.preferences.protobuf;

/* loaded from: classes3.dex */
public enum JavaType {
    VOID(java.lang.Void.class, java.lang.Void.class, null),
    INT(java.lang.Integer.TYPE, java.lang.Integer.class, 0),
    LONG(java.lang.Long.TYPE, java.lang.Long.class, 0L),
    FLOAT(java.lang.Float.TYPE, java.lang.Float.class, java.lang.Float.valueOf(0.0f)),
    DOUBLE(java.lang.Double.TYPE, java.lang.Double.class, java.lang.Double.valueOf(0.0d)),
    BOOLEAN(java.lang.Boolean.TYPE, java.lang.Boolean.class, java.lang.Boolean.FALSE),
    STRING(java.lang.String.class, java.lang.String.class, ""),
    BYTE_STRING(androidx.content.preferences.protobuf.ByteString.class, androidx.content.preferences.protobuf.ByteString.class, androidx.content.preferences.protobuf.ByteString.EMPTY),
    ENUM(java.lang.Integer.TYPE, java.lang.Integer.class, null),
    MESSAGE(java.lang.Object.class, java.lang.Object.class, null);

    private final java.lang.Class<?> getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.Object getHighSpeedVideoFpsRanges;
    private final java.lang.Class<?> getHighSpeedVideoSizes;

    JavaType(java.lang.Class cls, java.lang.Class cls2, java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = cls;
        this.getHighSpeedVideoSizes = cls2;
        this.getHighSpeedVideoFpsRanges = obj;
    }

    public final java.lang.Object getDefaultDefault() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final java.lang.Class<?> getType() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final java.lang.Class<?> getBoxedType() {
        return this.getHighSpeedVideoSizes;
    }

    public final boolean isValidType(java.lang.Class<?> cls) {
        return this.getHighResolutionOutputSizeshNQ4ISI.isAssignableFrom(cls);
    }
}
