package com.fyber.inneractive.sdk.config.enums;

/* loaded from: classes3.dex */
public enum Vendor {
    MOAT("moat");

    private static final java.util.Map<java.lang.String, com.fyber.inneractive.sdk.config.enums.Vendor> CONSTANTS = new java.util.HashMap();
    private final java.lang.String value;

    static {
        for (com.fyber.inneractive.sdk.config.enums.Vendor vendor : values()) {
            CONSTANTS.put(vendor.value, vendor);
        }
    }

    Vendor(java.lang.String str) {
        this.value = str;
    }

    public static com.fyber.inneractive.sdk.config.enums.Vendor fromValue(java.lang.String str) {
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
