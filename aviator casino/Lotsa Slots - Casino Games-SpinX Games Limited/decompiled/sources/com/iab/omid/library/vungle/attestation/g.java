package com.iab.omid.library.vungle.attestation;

/* loaded from: classes5.dex */
public class g {
    public static boolean a(android.webkit.WebView webView) {
        try {
            if (androidx.webkit.WebViewFeature.isFeatureSupported("WEB_MESSAGE_LISTENER") && com.iab.omid.library.vungle.attestation.c.a(com.iab.omid.library.vungle.internal.g.b().a()).b()) {
                com.iab.omid.library.vungle.attestation.f.a(webView);
                return true;
            }
        } catch (java.lang.Exception e) {
            com.iab.omid.library.vungle.utils.d.a("Error during initialization of AttestationMessageListener", e);
        } catch (java.lang.NoClassDefFoundError unused) {
            com.iab.omid.library.vungle.utils.d.a("androidx.webkit not available, skipping attestation listener initialization");
        }
        return false;
    }
}
