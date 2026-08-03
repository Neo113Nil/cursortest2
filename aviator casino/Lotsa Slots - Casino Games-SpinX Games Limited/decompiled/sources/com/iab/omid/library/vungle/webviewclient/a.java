package com.iab.omid.library.vungle.webviewclient;

/* loaded from: classes5.dex */
public class a {
    public static void a(android.webkit.WebView webView) {
        if (android.os.Build.VERSION.SDK_INT < 26 || !com.iab.omid.library.vungle.attestation.c.a(com.iab.omid.library.vungle.internal.g.b().a()).b()) {
            return;
        }
        webView.setWebViewClient(new com.iab.omid.library.vungle.webviewclient.b(webView.getWebViewClient()));
    }

    public static boolean a(java.lang.String str) {
        if (str != null && str.startsWith("omid-native")) {
            try {
                android.net.Uri parse = android.net.Uri.parse(str);
                if ("omid-native".equals(parse.getScheme())) {
                    com.iab.omid.library.vungle.internal.j.b(parse);
                    return true;
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return false;
    }
}
