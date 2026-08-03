package com.fyber.inneractive.sdk.config.enums;

/* loaded from: classes3.dex */
public enum UnitDisplayType {
    INTERSTITIAL("interstitial", false),
    LANDSCAPE("landscape", true),
    MRECT("mrect", false),
    BANNER("banner", false),
    REWARDED("rewarded", false),
    NATIVE("typenative", false),
    SQUARE("square", true),
    VERTICAL(com.helpshift.proactive.InAppViewConstants.ORIENTATION_VERTICAL, true),
    DEFAULT(com.unity3d.ads.BuildConfig.FLAVOR, false);

    private static final java.util.Map<java.lang.String, com.fyber.inneractive.sdk.config.enums.UnitDisplayType> CONSTANTS = new java.util.HashMap();
    private final boolean deprecated;
    private java.lang.String stringValue;

    static {
        for (com.fyber.inneractive.sdk.config.enums.UnitDisplayType unitDisplayType : values()) {
            CONSTANTS.put(unitDisplayType.stringValue, unitDisplayType);
        }
    }

    UnitDisplayType(java.lang.String str, boolean z) {
        this.stringValue = str;
        this.deprecated = z;
    }

    public static com.fyber.inneractive.sdk.config.enums.UnitDisplayType fromValue(java.lang.String str) {
        com.fyber.inneractive.sdk.config.enums.UnitDisplayType unitDisplayType = str != null ? CONSTANTS.get(str.toLowerCase(java.util.Locale.US)) : null;
        return unitDisplayType != null ? unitDisplayType : DEFAULT;
    }

    public boolean isDeprecated() {
        return this.deprecated;
    }

    public boolean isFullscreenUnit() {
        return this == INTERSTITIAL || this == REWARDED;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return this.stringValue;
    }

    public java.lang.String value() {
        return this.stringValue;
    }
}
