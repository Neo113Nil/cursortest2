package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzfwb implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfwc zza;
    private final android.webkit.WebView zzb;

    zzfwb(com.google.android.gms.internal.ads.zzfwc zzfwcVar) {
        java.util.Objects.requireNonNull(zzfwcVar);
        this.zza = zzfwcVar;
        this.zzb = zzfwcVar.zzq();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.destroy();
    }
}
