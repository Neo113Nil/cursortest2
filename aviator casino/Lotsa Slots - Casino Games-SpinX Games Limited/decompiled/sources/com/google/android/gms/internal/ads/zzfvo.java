package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzfvo implements java.lang.Runnable {
    final /* synthetic */ android.webkit.WebView zza;
    final /* synthetic */ java.lang.String zzb;

    zzfvo(com.google.android.gms.internal.ads.zzfvp zzfvpVar, android.webkit.WebView webView, java.lang.String str) {
        this.zza = webView;
        this.zzb = str;
        java.util.Objects.requireNonNull(zzfvpVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.ads.zzfvp.zzk(this.zza, this.zzb);
    }
}
