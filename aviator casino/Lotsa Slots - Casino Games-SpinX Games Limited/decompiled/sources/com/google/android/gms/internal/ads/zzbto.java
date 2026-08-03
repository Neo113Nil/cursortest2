package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbto extends com.google.android.gms.internal.ads.zzcgd {
    private final java.lang.Object zza = new java.lang.Object();
    private final com.google.android.gms.internal.ads.zzbtt zzb;
    private boolean zzc;

    public zzbto(com.google.android.gms.internal.ads.zzbtt zzbttVar) {
        this.zzb = zzbttVar;
    }

    public final void zza() {
        com.google.android.gms.ads.internal.util.zze.zza("release: Trying to acquire lock");
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.util.zze.zza("release: Lock acquired");
            if (this.zzc) {
                com.google.android.gms.ads.internal.util.zze.zza("release: Lock already released");
                return;
            }
            this.zzc = true;
            zze(new com.google.android.gms.internal.ads.zzbtl(this), new com.google.android.gms.internal.ads.zzcfz());
            zze(new com.google.android.gms.internal.ads.zzbtm(this), new com.google.android.gms.internal.ads.zzbtn(this));
            com.google.android.gms.ads.internal.util.zze.zza("release: Lock released");
        }
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzbtt zzb() {
        return this.zzb;
    }
}
