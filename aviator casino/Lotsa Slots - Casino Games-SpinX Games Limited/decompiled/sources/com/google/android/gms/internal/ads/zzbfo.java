package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbfo implements java.lang.Runnable {
    final android.webkit.ValueCallback zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbfg zzb;
    final /* synthetic */ android.webkit.WebView zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbfq zze;

    zzbfo(com.google.android.gms.internal.ads.zzbfq zzbfqVar, final com.google.android.gms.internal.ads.zzbfg zzbfgVar, final android.webkit.WebView webView, final boolean z) {
        this.zzb = zzbfgVar;
        this.zzc = webView;
        this.zzd = z;
        java.util.Objects.requireNonNull(zzbfqVar);
        this.zze = zzbfqVar;
        this.zza = new android.webkit.ValueCallback() { // from class: com.google.android.gms.internal.ads.zzbfn
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(java.lang.Object obj) {
                com.google.android.gms.internal.ads.zzbfo.this.zze.zzd(zzbfgVar, webView, (java.lang.String) obj, z);
            }
        };
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.webkit.WebView webView = this.zzc;
        if (webView.getSettings().getJavaScriptEnabled()) {
            try {
                webView.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.zza);
            } catch (java.lang.Throwable unused) {
                this.zza.onReceiveValue("");
            }
        }
    }
}
