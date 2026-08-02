package com.google.android.gms.internal.consent_sdk;

import android.webkit.WebView;

/* loaded from: classes.dex */
public final class zzct {
    private static Boolean zza;

    private zzct() {
    }

    public static void zza(WebView webView, String str) {
        boolean booleanValue;
        synchronized (zzct.class) {
            if (zza == null) {
                try {
                    webView.evaluateJavascript("(function(){})()", null);
                    zza = Boolean.TRUE;
                } catch (IllegalStateException unused) {
                    zza = Boolean.FALSE;
                }
            }
            booleanValue = zza.booleanValue();
        }
        if (booleanValue) {
            webView.evaluateJavascript(str, null);
        } else {
            webView.loadUrl("javascript:".concat(str));
        }
    }
}
