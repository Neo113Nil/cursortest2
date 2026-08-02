package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* loaded from: classes.dex */
final class zzfkv implements Runnable {
    final /* synthetic */ zzfkw zza;
    private final WebView zzb;

    public zzfkv(zzfkw zzfkwVar) {
        WebView webView;
        this.zza = zzfkwVar;
        webView = zzfkwVar.zza;
        this.zzb = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.destroy();
    }
}
