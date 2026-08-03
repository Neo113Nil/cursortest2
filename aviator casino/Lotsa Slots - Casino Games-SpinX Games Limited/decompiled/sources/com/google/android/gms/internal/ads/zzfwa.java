package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzfwa extends android.webkit.WebViewClient {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfwc zza;

    zzfwa(com.google.android.gms.internal.ads.zzfwc zzfwcVar) {
        java.util.Objects.requireNonNull(zzfwcVar);
        this.zza = zzfwcVar;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(android.webkit.WebView webView, android.webkit.RenderProcessGoneDetail renderProcessGoneDetail) {
        java.lang.String obj = renderProcessGoneDetail.toString();
        java.lang.String valueOf = java.lang.String.valueOf(webView);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(obj).length() + 36 + java.lang.String.valueOf(valueOf).length());
        sb.append("WebView renderer gone: ");
        sb.append(obj);
        sb.append("for WebView: ");
        sb.append(valueOf);
        android.util.Log.w("NativeBridge", sb.toString());
        com.google.android.gms.internal.ads.zzfwc zzfwcVar = this.zza;
        if (zzfwcVar.zzd() == webView) {
            android.util.Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
            zzfwcVar.zzc(null);
        }
        webView.destroy();
        return true;
    }
}
