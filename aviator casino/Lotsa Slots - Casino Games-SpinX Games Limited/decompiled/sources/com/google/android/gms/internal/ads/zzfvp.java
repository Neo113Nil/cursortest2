package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfvp {
    private static final com.google.android.gms.internal.ads.zzfvp zza = new com.google.android.gms.internal.ads.zzfvp();

    private zzfvp() {
    }

    public static final com.google.android.gms.internal.ads.zzfvp zza() {
        return zza;
    }

    public static final boolean zzk(android.webkit.WebView webView, java.lang.String str) {
        if (webView != null && !android.text.TextUtils.isEmpty(str)) {
            try {
                try {
                    webView.evaluateJavascript(str, null);
                    return true;
                } catch (java.lang.IllegalStateException unused) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 12);
                    sb.append("javascript: ");
                    sb.append(str);
                    webView.loadUrl(sb.toString());
                    return true;
                }
            } catch (java.lang.Exception e) {
                java.lang.String.valueOf(e.getMessage());
                com.google.android.gms.internal.ads.zzfuh.zza.booleanValue();
            }
        }
        return false;
    }

    public final void zzb(android.webkit.WebView webView, java.lang.String str, org.json.JSONObject jSONObject) {
        zzj(webView, com.ironsource.X3.a.f, jSONObject, str);
    }

    public final void zzc(android.webkit.WebView webView, java.lang.String str, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, org.json.JSONObject jSONObject3) {
        zzj(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    public final void zzd(android.webkit.WebView webView, java.lang.String str) {
        zzj(webView, "finishSession", str);
    }

    public final void zze(android.webkit.WebView webView, java.lang.String str, java.lang.String str2) {
        zzj(webView, "setNativeViewHierarchy", str2, str);
    }

    public final void zzf(android.webkit.WebView webView, java.lang.String str, java.lang.String str2) {
        zzj(webView, "setState", str2, str);
    }

    public final void zzg(android.webkit.WebView webView, java.lang.String str, java.lang.String str2) {
        zzj(webView, "setDeviceLockState", str2);
    }

    public final void zzh(android.webkit.WebView webView, java.lang.String str, float f) {
        zzj(webView, "setDeviceVolume", java.lang.Float.valueOf(f), str);
    }

    public final void zzi(android.webkit.WebView webView, org.json.JSONObject jSONObject) {
        zzj(webView, "setLastActivity", jSONObject);
    }

    final void zzj(android.webkit.WebView webView, java.lang.String str, java.lang.Object... objArr) {
        if (webView == null) {
            com.google.android.gms.internal.ads.zzfuh.zza.booleanValue();
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(128);
        sb.append("if(window.omidBridge!==undefined){omidBridge.");
        sb.append(str);
        sb.append("(");
        for (java.lang.Object obj : objArr) {
            if (obj == null) {
                sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.NULL);
            } else if (obj instanceof java.lang.String) {
                java.lang.String obj2 = obj.toString();
                if (obj2.startsWith("{")) {
                    sb.append(obj2);
                } else {
                    sb.append('\"');
                    sb.append(obj2);
                    sb.append('\"');
                }
            } else {
                sb.append(obj);
            }
            sb.append(",");
        }
        sb.setLength(sb.length() - 1);
        sb.append(")}");
        java.lang.String sb2 = sb.toString();
        android.os.Handler handler = webView.getHandler();
        if (handler == null) {
            handler = new android.os.Handler(android.os.Looper.getMainLooper());
        }
        if (android.os.Looper.myLooper() == handler.getLooper()) {
            zzk(webView, sb2);
        } else {
            handler.post(new com.google.android.gms.internal.ads.zzfvo(this, webView, sb2));
        }
    }
}
