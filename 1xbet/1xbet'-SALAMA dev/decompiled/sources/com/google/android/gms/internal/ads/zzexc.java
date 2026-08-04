package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class zzexc implements zzexw {
    private final zzexw zza;
    private final zzexw zzb;
    private final zzfdj zzc;
    private final String zzd;
    private zzctw zze;
    private final Executor zzf;

    public zzexc(zzexw zzexwVar, zzexw zzexwVar2, zzfdj zzfdjVar, String str, Executor executor) {
        this.zza = zzexwVar;
        this.zzb = zzexwVar2;
        this.zzc = zzfdjVar;
        this.zzd = str;
        this.zzf = executor;
    }

    public static /* synthetic */ I3.b zzb(final zzexc zzexcVar, zzexx zzexxVar, zzexb zzexbVar, zzexv zzexvVar, zzctw zzctwVar, zzexh zzexhVar) {
        if (zzexhVar != null) {
            zzexb zzexbVar2 = new zzexb(zzexbVar.zza, zzexbVar.zzb, zzexbVar.zzc, zzexbVar.zzd, zzexbVar.zze, zzexbVar.zzf, zzexhVar.zza);
            if (zzexhVar.zzc != null) {
                zzexcVar.zze = null;
                zzexcVar.zzc.zzf(zzexbVar2);
                return zzexcVar.zzg(zzexhVar.zzc, zzexxVar);
            }
            I3.b bVarZza = zzexcVar.zzc.zza(zzexbVar2);
            if (bVarZza != null) {
                zzexcVar.zze = null;
                return zzgbc.zzn(bVarZza, new zzgaj() { // from class: com.google.android.gms.internal.ads.zzewy
                    @Override // com.google.android.gms.internal.ads.zzgaj
                    public final I3.b zza(Object obj) {
                        return zzexc.zze(this.zza, (zzfdg) obj);
                    }
                }, zzexcVar.zzf);
            }
            zzexcVar.zzc.zzf(zzexbVar2);
            zzexxVar = new zzexx(zzexxVar.zzb, zzexhVar.zzb);
        }
        I3.b bVarZzb = ((zzexm) zzexcVar.zza).zzb(zzexxVar, zzexvVar, zzctwVar);
        zzexcVar.zze = zzctwVar;
        return bVarZzb;
    }

    public static /* synthetic */ I3.b zze(zzexc zzexcVar, zzfdg zzfdgVar) throws zzdus {
        zzfdi zzfdiVar;
        if (zzfdgVar == null || zzfdgVar.zza == null || (zzfdiVar = zzfdgVar.zzb) == null) {
            throw new zzdus(1, "Empty prefetch");
        }
        zzbbd.zzb.zzc zzcVarZzd = zzbbd.zzb.zzd();
        zzbbd.zzb.zza.C0003zza c0003zzaZza = zzbbd.zzb.zza.zza();
        c0003zzaZza.zzf(zzbbd.zzb.zzd.IN_MEMORY);
        c0003zzaZza.zzh(zzbbd.zzb.zze.zzi());
        zzcVarZzd.zzd(c0003zzaZza);
        zzfdgVar.zza.zza.zzb().zzc().zzm(zzcVarZzd.zzbr());
        return zzexcVar.zzg(zzfdgVar.zza, ((zzexb) zzfdiVar).zzb);
    }

    private final I3.b zzg(zzfcw zzfcwVar, zzexx zzexxVar) {
        zzctw zzctwVar = zzfcwVar.zza;
        this.zze = zzctwVar;
        if (zzfcwVar.zzc != null) {
            if (zzctwVar.zze() != null) {
                zzfcwVar.zzc.zzo().zzl(zzfcwVar.zza.zze());
            }
            return zzgbc.zzh(zzfcwVar.zzc);
        }
        zzctwVar.zzb().zzk(zzfcwVar.zzb);
        return ((zzexm) this.zza).zzb(zzexxVar, null, zzfcwVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzctw zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final /* bridge */ /* synthetic */ I3.b zzc(zzexx zzexxVar, zzexv zzexvVar, Object obj) {
        return zzf(zzexxVar, zzexvVar, null);
    }

    public final synchronized I3.b zzf(final zzexx zzexxVar, final zzexv zzexvVar, zzctw zzctwVar) {
        zzctv zzctvVarZza = zzexvVar.zza(zzexxVar.zzb);
        zzctvVarZza.zza(new zzexd(this.zzd));
        final zzctw zzctwVar2 = (zzctw) zzctvVarZza.zzh();
        zzctwVar2.zzf();
        zzctwVar2.zzf();
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzctwVar2.zzf().zzd;
        if (zzmVar.f10748J == null && zzmVar.f10753O == null) {
            zzfba zzfbaVarZzf = zzctwVar2.zzf();
            final zzexb zzexbVar = new zzexb(zzexvVar, zzexxVar, zzfbaVarZzf.zzd, zzfbaVarZzf.zzf, this.zzf, zzfbaVarZzf.zzj, null);
            return (zzgat) zzgbc.zzn(zzgat.zzu(((zzexi) this.zzb).zzb(zzexxVar, zzexvVar, zzctwVar2)), new zzgaj() { // from class: com.google.android.gms.internal.ads.zzewz
                @Override // com.google.android.gms.internal.ads.zzgaj
                public final I3.b zza(Object obj) {
                    return zzexc.zzb(this.zza, zzexxVar, zzexbVar, zzexvVar, zzctwVar2, (zzexh) obj);
                }
            }, this.zzf);
        }
        this.zze = zzctwVar2;
        return ((zzexm) this.zza).zzb(zzexxVar, zzexvVar, zzctwVar2);
    }
}
