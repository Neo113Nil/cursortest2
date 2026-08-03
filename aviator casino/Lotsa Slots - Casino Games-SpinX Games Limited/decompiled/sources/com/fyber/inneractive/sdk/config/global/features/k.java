package com.fyber.inneractive.sdk.config.global.features;

/* loaded from: classes3.dex */
public final class k extends com.fyber.inneractive.sdk.config.global.features.i {
    public k() {
        super("load_timeouts");
    }

    public static java.lang.String a(java.lang.String... strArr) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Iterator it = java.util.Arrays.asList(strArr).iterator();
        while (it.hasNext()) {
            sb.append((java.lang.String) it.next());
            if (it.hasNext()) {
                sb.append("_");
            }
        }
        return sb.toString();
    }

    public static boolean d(java.lang.String str) {
        return com.fyber.inneractive.sdk.config.enums.UnitDisplayType.INTERSTITIAL.name().equalsIgnoreCase(str) || com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED.name().equalsIgnoreCase(str);
    }

    public static java.lang.String e(java.lang.String str) {
        return android.text.TextUtils.isEmpty(str) ? "all_mediators" : str.toLowerCase(java.util.Locale.US);
    }

    public final int b(java.lang.String str, java.lang.String str2) {
        java.lang.String a2 = a(str, "bidding", "global_timeout", e(str2));
        java.lang.String a3 = a(str, "bidding", "global_timeout", "all_mediators");
        int i = d(str) ? 30000 : 10000;
        java.lang.Integer a4 = a(a(str, "global_timeout", "all_mediators"));
        if (a4 != null) {
            i = a4.intValue();
        }
        java.lang.Integer a5 = a(a3);
        if (a5 != null) {
            i = a5.intValue();
        }
        java.lang.Integer a6 = a(a2);
        return a6 != null ? a6.intValue() : i;
    }

    public final int c(java.lang.String str, java.lang.String str2) {
        java.lang.String a2 = a(str, "global_timeout", e(str2));
        java.lang.String a3 = a(str, "global_timeout", "all_mediators");
        int i = d(str) ? 30000 : 10000;
        java.lang.Integer a4 = a(a(str, "global_timeout", "all_mediators"));
        if (a4 != null) {
            i = a4.intValue();
        }
        java.lang.Integer a5 = a(a3);
        if (a5 != null) {
            i = a5.intValue();
        }
        java.lang.Integer a6 = a(a2);
        return a6 != null ? a6.intValue() : i;
    }

    @Override // com.fyber.inneractive.sdk.config.global.features.i
    public final com.fyber.inneractive.sdk.config.global.features.i b() {
        com.fyber.inneractive.sdk.config.global.features.k kVar = new com.fyber.inneractive.sdk.config.global.features.k();
        a(kVar);
        return kVar;
    }
}
