package com.fyber.inneractive.sdk.config.enums;

/* loaded from: classes3.dex */
public enum Orientation {
    LANDSCAPE("landscape", false),
    PORTRAIT("portrait", false),
    USER("user", true),
    NONE("none", true);

    private static final java.util.Map<java.lang.String, com.fyber.inneractive.sdk.config.enums.Orientation> CONSTANTS = new java.util.HashMap();
    public boolean allowOrientationChange;
    private final java.lang.String value;

    static {
        for (com.fyber.inneractive.sdk.config.enums.Orientation orientation : values()) {
            CONSTANTS.put(orientation.value, orientation);
        }
    }

    Orientation(java.lang.String str, boolean z) {
        this.value = str;
        this.allowOrientationChange = z;
    }

    public static com.fyber.inneractive.sdk.config.enums.Orientation fromValue(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        return CONSTANTS.get(str);
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return this.value;
    }

    public java.lang.String value() {
        return this.value;
    }
}
