package com.fyber.inneractive.sdk.flow.nativead;

/* loaded from: classes3.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f3723a;
    public static final java.lang.String b;

    static {
        java.lang.String b2 = com.fyber.inneractive.sdk.util.o.b("ia_js_load_monitor.txt");
        f3723a = "<html><head>" + b2 + "<script src='%s'></script></head><body></body></html>";
        b = "<html><head>" + b2 + "%s</head><body></body></html>";
    }

    public static boolean a(java.lang.String str) {
        return (str == null || str.trim().isEmpty()) ? false : true;
    }

    public static java.lang.String b(java.lang.String str) {
        com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager = com.fyber.inneractive.sdk.config.IAConfigManager.N;
        if (str.startsWith(iAConfigManager.q ? "https" : androidx.webkit.ProxyConfig.MATCH_HTTP)) {
            return java.lang.String.format(f3723a, str);
        }
        if (iAConfigManager.q && !str.startsWith("https")) {
            return null;
        }
        if (!str.startsWith("<script")) {
            str = "<script type='text/javascript'>".concat(str);
        }
        if (!str.endsWith("</script>")) {
            str = str.concat("</script>");
        }
        return java.lang.String.format(b, str);
    }
}
