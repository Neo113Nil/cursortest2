package com.fyber.inneractive.sdk.config.enums;

/* loaded from: classes3.dex */
public enum TapAction {
    CTR(com.ironsource.M6.K0),
    FULLSCREEN(com.vungle.ads.internal.Constants.TEMPLATE_TYPE_FULLSCREEN),
    DO_NOTHING("noAction");

    private static final java.util.Map<java.lang.String, com.fyber.inneractive.sdk.config.enums.TapAction> CONSTANTS = new java.util.HashMap();
    private final java.lang.String value;

    static {
        for (com.fyber.inneractive.sdk.config.enums.TapAction tapAction : values()) {
            CONSTANTS.put(tapAction.value, tapAction);
        }
    }

    TapAction(java.lang.String str) {
        this.value = str;
    }

    public static com.fyber.inneractive.sdk.config.enums.TapAction fromValue(java.lang.String str) {
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
