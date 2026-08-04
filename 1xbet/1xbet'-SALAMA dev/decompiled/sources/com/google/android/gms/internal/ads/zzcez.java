package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class zzcez implements Runnable {
    final /* synthetic */ zzcfa zza;

    public zzcez(zzcfa zzcfaVar) {
        this.zza = zzcfaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        super/*android.webkit.WebView*/.destroy();
    }
}
