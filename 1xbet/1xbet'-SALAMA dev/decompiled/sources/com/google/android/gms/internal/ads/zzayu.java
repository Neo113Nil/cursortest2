package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes.dex */
final class zzayu implements Runnable {
    final ValueCallback zza;
    final /* synthetic */ zzaym zzb;
    final /* synthetic */ WebView zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzayw zze;

    public zzayu(zzayw zzaywVar, final zzaym zzaymVar, final WebView webView, final boolean z4) {
        this.zzb = zzaymVar;
        this.zzc = webView;
        this.zzd = z4;
        this.zze = zzaywVar;
        this.zza = new ValueCallback() { // from class: com.google.android.gms.internal.ads.zzayt
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                this.zza.zze.zzc(zzaymVar, webView, (String) obj, z4);
            }
        };
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzc.getSettings().getJavaScriptEnabled()) {
            try {
                this.zzc.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.zza);
            } catch (Throwable unused) {
                this.zza.onReceiveValue("");
            }
        }
    }
}
