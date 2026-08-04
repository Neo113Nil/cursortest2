package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class zzcra {
    private final zzdwg zza;
    private final zzfba zzb;
    private final zzffe zzc;
    private final zzckb zzd;
    private final zzefn zze;
    private final zzczx zzf;
    private zzfar zzg;
    private final zzdxo zzh;
    private final zzctt zzi;
    private final Executor zzj;
    private final zzdwz zzk;
    private final zzebw zzl;

    public zzcra(zzdwg zzdwgVar, zzfba zzfbaVar, zzffe zzffeVar, zzckb zzckbVar, zzefn zzefnVar, zzczx zzczxVar, zzfar zzfarVar, zzdxo zzdxoVar, zzctt zzcttVar, Executor executor, zzdwz zzdwzVar, zzebw zzebwVar) {
        this.zza = zzdwgVar;
        this.zzb = zzfbaVar;
        this.zzc = zzffeVar;
        this.zzd = zzckbVar;
        this.zze = zzefnVar;
        this.zzf = zzczxVar;
        this.zzg = zzfarVar;
        this.zzh = zzdxoVar;
        this.zzi = zzcttVar;
        this.zzj = executor;
        this.zzk = zzdwzVar;
        this.zzl = zzebwVar;
    }

    public static /* synthetic */ zzfar zzd(zzcra zzcraVar, zzfar zzfarVar) {
        zzcraVar.zzd.zza(zzfarVar);
        return zzfarVar;
    }

    public static /* synthetic */ I3.b zze(zzcra zzcraVar, zzfcu zzfcuVar, zzbuo zzbuoVar) {
        zzbuoVar.zzi = zzfcuVar;
        return zzcraVar.zzh.zze(zzbuoVar);
    }

    public final com.google.android.gms.ads.internal.client.zze zza(Throwable th) {
        return zzfcb.zzb(th, this.zzl);
    }

    public final zzczx zzc() {
        return this.zzf;
    }

    public final I3.b zzf(final zzfcu zzfcuVar) {
        zzfek zzfekVarZza = this.zzc.zzb(zzfey.GET_CACHE_KEY, this.zzi.zzc()).zzf(new zzgaj() { // from class: com.google.android.gms.internal.ads.zzcqw
            @Override // com.google.android.gms.internal.ads.zzgaj
            public final I3.b zza(Object obj) {
                return zzcra.zze(this.zza, zzfcuVar, (zzbuo) obj);
            }
        }).zza();
        zzgbc.zzr(zzfekVarZza, new zzcqy(this), this.zzj);
        return zzfekVarZza;
    }

    public final I3.b zzg(zzbuo zzbuoVar) {
        zzfek zzfekVarZza = this.zzc.zzb(zzfey.NOTIFY_CACHE_HIT, this.zzh.zzf(zzbuoVar)).zza();
        zzgbc.zzr(zzfekVarZza, new zzcqz(this), this.zzj);
        return zzfekVarZza;
    }

    public final I3.b zzh(I3.b bVar) {
        zzfeu zzfeuVarZzf = this.zzc.zzb(zzfey.RENDERER, bVar).zze(new zzfei() { // from class: com.google.android.gms.internal.ads.zzcqv
            @Override // com.google.android.gms.internal.ads.zzfei
            public final Object zza(Object obj) {
                zzfar zzfarVar = (zzfar) obj;
                zzcra.zzd(this.zza, zzfarVar);
                return zzfarVar;
            }
        }).zzf(this.zze);
        zzbbp zzbbpVar = zzbby.zzfC;
        C0254t c0254t = C0254t.f2723d;
        if (!((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            zzfeuVarZzf = zzfeuVarZzf.zzi(((Integer) c0254t.f2726c.zzb(zzbby.zzfD)).intValue(), TimeUnit.SECONDS);
        }
        return zzfeuVarZzf.zza();
    }

    public final I3.b zzi() {
        com.google.android.gms.ads.internal.client.zzm zzmVar = this.zzb.zzd;
        if (zzmVar.f10753O == null && zzmVar.f10748J == null) {
            return zzj(this.zzi.zzc());
        }
        zzffe zzffeVar = this.zzc;
        zzdwg zzdwgVar = this.zza;
        return zzfeo.zzc(zzdwgVar.zzc(), zzfey.PRELOADED_LOADER, zzffeVar).zza();
    }

    public final I3.b zzj(I3.b bVar) {
        zzfar zzfarVar = this.zzg;
        if (zzfarVar != null) {
            zzffe zzffeVar = this.zzc;
            return zzfeo.zzc(zzgbc.zzh(zzfarVar), zzfey.SERVER_TRANSACTION, zzffeVar).zza();
        }
        o.f1952C.f1963i.zzj();
        zzfeu zzfeuVarZzb = this.zzc.zzb(zzfey.SERVER_TRANSACTION, bVar);
        final zzdwz zzdwzVar = this.zzk;
        Objects.requireNonNull(zzdwzVar);
        return zzfeuVarZzb.zzf(new zzgaj() { // from class: com.google.android.gms.internal.ads.zzcqx
            @Override // com.google.android.gms.internal.ads.zzgaj
            public final I3.b zza(Object obj) {
                return zzdwzVar.zzc((zzbuo) obj);
            }
        }).zza();
    }

    public final void zzk(zzfar zzfarVar) {
        this.zzg = zzfarVar;
    }
}
