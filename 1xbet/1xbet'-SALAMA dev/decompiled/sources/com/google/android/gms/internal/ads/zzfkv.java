package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes.dex */
final class zzfkv implements Runnable {
    final /* synthetic */ zzfkw zza;
    private final WebView zzb;

    public zzfkv(zzfkw zzfkwVar) {
        this.zza = zzfkwVar;
        this.zzb = zzfkwVar.zza;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.destroy();
    }
}
