package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzcgi implements java.lang.Runnable {
    final /* synthetic */ android.media.MediaPlayer zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzcgr zzb;

    zzcgi(com.google.android.gms.internal.ads.zzcgr zzcgrVar, android.media.MediaPlayer mediaPlayer) {
        this.zza = mediaPlayer;
        java.util.Objects.requireNonNull(zzcgrVar);
        this.zzb = zzcgrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.ads.zzcgr zzcgrVar = this.zzb;
        zzcgrVar.zzs(this.zza);
        if (zzcgrVar.zzt() != null) {
            zzcgrVar.zzt().zzb();
        }
    }
}
