package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzczf implements zzinw {
    private final zzczb zza;

    private zzczf(zzczb zzczbVar) {
        this.zza = zzczbVar;
    }

    public static zzczf zzc(zzczb zzczbVar) {
        return new zzczf(zzczbVar);
    }

    public static zzflo zzd(zzczb zzczbVar) {
        zzflo zza = zzczbVar.zza();
        zzioe.zzb(zza);
        return zza;
    }

    public final zzflo zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
