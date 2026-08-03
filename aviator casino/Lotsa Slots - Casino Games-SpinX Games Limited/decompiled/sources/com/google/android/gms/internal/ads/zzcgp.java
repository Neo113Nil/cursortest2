package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzcgp implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.internal.ads.zzcgr zza;

    zzcgp(com.google.android.gms.internal.ads.zzcgr zzcgrVar) {
        java.util.Objects.requireNonNull(zzcgrVar);
        this.zza = zzcgrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.ads.zzcgr zzcgrVar = this.zza;
        if (zzcgrVar.zzt() != null) {
            zzcgrVar.zzt().zzd();
        }
    }
}
