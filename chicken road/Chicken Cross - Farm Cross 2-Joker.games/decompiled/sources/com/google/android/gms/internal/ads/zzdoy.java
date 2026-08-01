package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzdoy implements zzinw {
    private final zzdov zza;

    private zzdoy(zzdov zzdovVar) {
        this.zza = zzdovVar;
    }

    public static zzdoy zzc(zzdov zzdovVar) {
        return new zzdoy(zzdovVar);
    }

    public static zzdrb zzd(zzdov zzdovVar) {
        zzdrb zza = zzdovVar.zza();
        zzioe.zzb(zza);
        return zza;
    }

    public final zzdrb zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
