package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzfqn implements zzinw {
    private final zziof zza;
    private final zziof zzb;
    private final zziof zzc;

    private zzfqn(zzfqm zzfqmVar, zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
        this.zzc = zziofVar3;
    }

    public static zzfqn zza(zzfqm zzfqmVar, zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        return new zzfqn(zzfqmVar, zziofVar, zziofVar2, zziofVar3);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbva zzb = new zzbur().zzb(((zzcok) this.zza).zza(), ((zzcpa) this.zzb).zza(), (zzfrj) this.zzc.zzb());
        zzioe.zzb(zzb);
        return zzb;
    }
}
