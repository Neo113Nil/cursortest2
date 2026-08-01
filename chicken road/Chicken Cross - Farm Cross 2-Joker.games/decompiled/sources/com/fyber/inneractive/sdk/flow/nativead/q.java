package com.fyber.inneractive.sdk.flow.nativead;

import androidx.webkit.ProxyConfig;
import com.fyber.inneractive.sdk.config.IAConfigManager;

/* loaded from: classes4.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final String f5376a;
    public static final String b;

    static {
        String b2 = com.fyber.inneractive.sdk.util.o.b("ia_js_load_monitor.txt");
        f5376a = "<html><head>" + b2 + "<script src='%s'></script></head><body></body></html>";
        b = "<html><head>" + b2 + "%s</head><body></body></html>";
    }

    public static boolean a(String str) {
        return (str == null || str.trim().isEmpty()) ? false : true;
    }

    public static String b(String str) {
        IAConfigManager iAConfigManager = IAConfigManager.R;
        if (str.startsWith(iAConfigManager.r ? "https" : ProxyConfig.MATCH_HTTP)) {
            return String.format(f5376a, str);
        }
        if (iAConfigManager.r && !str.startsWith("https")) {
            return null;
        }
        if (!str.startsWith("<script")) {
            str = "<script type='text/javascript'>".concat(str);
        }
        if (!str.endsWith("</script>")) {
            str = str.concat("</script>");
        }
        return String.format(b, str);
    }
}
