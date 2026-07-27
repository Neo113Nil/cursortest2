package com.bytedance.sdk.openadsdk.tz;

import com.ironsource.Q3;

/* loaded from: classes4.dex */
public enum oo {
    TYPE_2G("2g"),
    TYPE_3G(Q3.f7855a),
    TYPE_4G("4g"),
    TYPE_5G("5g"),
    TYPE_WIFI(Q3.b),
    TYPE_MOBILE("mobile"),
    TYPE_UNKNOWN("unknown");

    private String kj;

    oo(String str) {
        this.kj = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.kj;
    }
}
