package com.fyber.inneractive.sdk.ignite;

/* loaded from: classes3.dex */
public enum m {
    TRUE_SINGLE_TAP("tst"),
    SINGLE_TAP("st"),
    NONE("none");

    private static final java.util.Map<java.lang.String, com.fyber.inneractive.sdk.ignite.m> CONSTANTS = new java.util.HashMap();
    private final java.lang.String value;

    static {
        for (com.fyber.inneractive.sdk.ignite.m mVar : values()) {
            CONSTANTS.put(mVar.value, mVar);
        }
    }

    m(java.lang.String str) {
        this.value = str;
    }

    public final java.lang.String a() {
        return this.value;
    }

    public static com.fyber.inneractive.sdk.ignite.m a(java.lang.String str) {
        return CONSTANTS.get(str);
    }
}
