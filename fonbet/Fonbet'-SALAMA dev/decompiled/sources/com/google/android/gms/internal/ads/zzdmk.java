package com.google.android.gms.internal.ads;

import F2.C0254t;
import H2.c;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzdmk {
    private final zzcuo zza;
    private final zzcvx zzb;
    private final zzcwk zzc;
    private final zzcww zzd;
    private final zzczm zze;
    private final zzdcn zzf;
    private final zzdqq zzg;
    private final zzfia zzh;
    private final zzeaf zzi;
    private final zzcln zzj;

    public zzdmk(zzcuo zzcuoVar, zzcvx zzcvxVar, zzcwk zzcwkVar, zzcww zzcwwVar, zzczm zzczmVar, zzdcn zzdcnVar, zzdqq zzdqqVar, zzfia zzfiaVar, zzeaf zzeafVar, zzcln zzclnVar) {
        this.zza = zzcuoVar;
        this.zzb = zzcvxVar;
        this.zzc = zzcwkVar;
        this.zzd = zzcwwVar;
        this.zze = zzczmVar;
        this.zzf = zzdcnVar;
        this.zzg = zzdqqVar;
        this.zzh = zzfiaVar;
        this.zzi = zzeafVar;
        this.zzj = zzclnVar;
    }

    public final void zza(zzdml zzdmlVar, zzceb zzcebVar) {
        zzdmi zzdmiVar;
        zzdmiVar = zzdmlVar.zza;
        final zzcvx zzcvxVar = this.zzb;
        Objects.requireNonNull(zzcvxVar);
        zzdmiVar.zzi(this.zza, this.zzc, this.zzd, this.zze, new c() { // from class: com.google.android.gms.internal.ads.zzdmj
            @Override // H2.c
            public final void zzg() {
                zzcvx.this.zzb();
            }
        }, this.zzf);
        if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzkg)).booleanValue() || zzcebVar == null || zzcebVar.zzN() == null) {
            return;
        }
        zzcft zzN = zzcebVar.zzN();
        zzN.zzK(this.zzj, this.zzi, this.zzh);
        zzN.zzM(this.zzj, this.zzi, this.zzg);
    }
}
