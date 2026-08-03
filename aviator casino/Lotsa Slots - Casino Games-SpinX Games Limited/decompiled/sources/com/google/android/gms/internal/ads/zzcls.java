package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzcls implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.internal.ads.zzclx zza;

    zzcls(com.google.android.gms.internal.ads.zzclx zzclxVar) {
        java.util.Objects.requireNonNull(zzclxVar);
        this.zza = zzclxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        super/*android.webkit.WebView*/.destroy();
    }
}
