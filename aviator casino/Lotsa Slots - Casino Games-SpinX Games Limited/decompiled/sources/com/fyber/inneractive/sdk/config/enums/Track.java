package com.fyber.inneractive.sdk.config.enums;

/* loaded from: classes3.dex */
public enum Track {
    ERRORS("errors"),
    NETWORKING("networking"),
    VIEWABILITY("viewability");

    private static final java.util.Map<java.lang.String, com.fyber.inneractive.sdk.config.enums.Track> CONSTANTS = new java.util.HashMap();
    private final java.lang.String stringValue;

    static {
        for (com.fyber.inneractive.sdk.config.enums.Track track : values()) {
            CONSTANTS.put(track.stringValue, track);
        }
    }

    Track(java.lang.String str) {
        this.stringValue = str;
    }

    public static com.fyber.inneractive.sdk.config.enums.Track fromValue(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        return CONSTANTS.get(str);
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return this.stringValue;
    }

    public java.lang.String value() {
        return this.stringValue;
    }
}
