package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzcgk implements java.lang.Runnable {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzcgr zzc;

    zzcgk(com.google.android.gms.internal.ads.zzcgr zzcgrVar, java.lang.String str, java.lang.String str2) {
        this.zza = str;
        this.zzb = str2;
        java.util.Objects.requireNonNull(zzcgrVar);
        this.zzc = zzcgrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.ads.zzcgr zzcgrVar = this.zzc;
        if (zzcgrVar.zzt() != null) {
            zzcgrVar.zzt().zzf(this.zza, this.zzb);
        }
    }
}
