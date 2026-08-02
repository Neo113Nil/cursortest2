package com.google.android.gms.internal.ads;

import H2.c;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzdmb {
    private final zzcuo zza;
    private final zzcvx zzb;
    private final zzcwk zzc;
    private final zzcww zzd;
    private final zzczm zze;
    private final zzfaf zzf;
    private final zzfai zzg;
    private final zzcln zzh;

    public zzdmb(zzcuo zzcuoVar, zzcvx zzcvxVar, zzcwk zzcwkVar, zzcww zzcwwVar, zzczm zzczmVar, zzfaf zzfafVar, zzfai zzfaiVar, zzcln zzclnVar) {
        this.zza = zzcuoVar;
        this.zzb = zzcvxVar;
        this.zzc = zzcwkVar;
        this.zzd = zzcwwVar;
        this.zze = zzczmVar;
        this.zzf = zzfafVar;
        this.zzg = zzfaiVar;
        this.zzh = zzclnVar;
    }

    public final void zza(zzdmf zzdmfVar) {
        zzdls zzdlsVar;
        final zzcvx zzcvxVar = this.zzb;
        zzdlsVar = zzdmfVar.zza;
        Objects.requireNonNull(zzcvxVar);
        zzdlsVar.zzh(this.zza, this.zzc, this.zzd, this.zze, new c() { // from class: com.google.android.gms.internal.ads.zzdma
            @Override // H2.c
            public final void zzg() {
                zzcvx.this.zzb();
            }
        });
        zzdmfVar.zzh(this.zzf, this.zzg, this.zzh);
    }
}
