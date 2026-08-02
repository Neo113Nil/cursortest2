package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* loaded from: classes.dex */
final class zzfki implements Runnable {
    final /* synthetic */ WebView zza;
    final /* synthetic */ String zzb;

    public zzfki(zzfkj zzfkjVar, WebView webView, String str) {
        this.zza = webView;
        this.zzb = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfkj.zzk(this.zza, this.zzb);
    }
}
