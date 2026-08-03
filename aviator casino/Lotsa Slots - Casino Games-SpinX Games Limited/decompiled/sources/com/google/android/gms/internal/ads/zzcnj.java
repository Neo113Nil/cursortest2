package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzcnj implements com.google.android.gms.internal.ads.zzcrq {

    @javax.annotation.Nullable
    private static com.google.android.gms.internal.ads.zzcnj zza;

    private static synchronized com.google.android.gms.internal.ads.zzcnj zzH(android.content.Context context, @javax.annotation.Nullable com.google.android.gms.internal.ads.zzbvc zzbvcVar, int i, boolean z, int i2, com.google.android.gms.internal.ads.zzcot zzcotVar) {
        synchronized (com.google.android.gms.internal.ads.zzcnj.class) {
            com.google.android.gms.internal.ads.zzcnj zzcnjVar = zza;
            if (zzcnjVar != null) {
                return zzcnjVar;
            }
            long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            com.google.android.gms.internal.ads.zzbiq.zza(context);
            if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbki.zze.zze()).booleanValue()) {
                com.google.android.gms.internal.ads.zzbib.zza(context);
            }
            com.google.android.gms.internal.ads.zzflu zza2 = com.google.android.gms.internal.ads.zzflu.zza(context);
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzb = zza2.zzb(com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor.MODULE_VERSION, false, i2);
            zza2.zzc(zzbvcVar);
            com.google.android.gms.internal.ads.zzcpi zzcpiVar = new com.google.android.gms.internal.ads.zzcpi(null);
            com.google.android.gms.internal.ads.zzcnk zzcnkVar = new com.google.android.gms.internal.ads.zzcnk();
            zzcnkVar.zza(zzb);
            zzcnkVar.zzb(context);
            zzcnkVar.zzc(currentTimeMillis);
            zzcpiVar.zza(new com.google.android.gms.internal.ads.zzcnl(zzcnkVar, null));
            zzcpiVar.zzb(new com.google.android.gms.internal.ads.zzcqf(zzcotVar));
            com.google.android.gms.internal.ads.zzcnj zzc = zzcpiVar.zzc();
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzpl)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zze().zza(com.google.android.gms.internal.ads.zzfoa.zzc(), zzc.zzD(), context);
                com.google.android.gms.ads.internal.zzt.zze().zzb();
            }
            ((com.google.android.gms.internal.ads.zzeeb) ((com.google.android.gms.internal.ads.zzcox) zzc).zzs.zzb()).zza();
            ((com.google.android.gms.internal.ads.zzcnc) ((com.google.android.gms.internal.ads.zzcox) zzc).zzr.zzb()).zza(context, zzb);
            com.google.android.gms.ads.internal.zzt.zzh().zze(context, zzb, zzc.zzD());
            com.google.android.gms.ads.internal.zzt.zzj().zza(context);
            com.google.android.gms.ads.internal.zzt.zzc().zzc(context);
            com.google.android.gms.ads.internal.zzt.zzc().zzd(context);
            com.google.android.gms.ads.internal.util.zzd.zza(context);
            com.google.android.gms.ads.internal.zzt.zzg().zza(context);
            com.google.android.gms.ads.internal.zzt.zzA().zza(context);
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzpH)).booleanValue()) {
                java.lang.String str = (java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzpI);
                if (!str.isEmpty()) {
                    if (java.util.Arrays.asList(str.split(",")).contains(context.getPackageName())) {
                        zzc.zzE().zza(com.google.android.gms.ads.internal.zzt.zzg());
                    }
                }
            } else {
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzpG)).booleanValue()) {
                    zzc.zzE().zza(com.google.android.gms.ads.internal.zzt.zzg());
                }
            }
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzpR)).booleanValue()) {
                ((com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager) ((com.google.android.gms.internal.ads.zzcox) zzc).zzm.zzb()).initialize();
            }
            ((com.google.android.gms.ads.internal.util.zzbz) ((com.google.android.gms.internal.ads.zzcox) zzc).zzay.zzb()).zza();
            com.google.android.gms.internal.ads.zzcea.zzb(context);
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhh)).booleanValue()) {
                if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzbi)).booleanValue()) {
                    new com.google.android.gms.internal.ads.zzeju(context, zzb, new com.google.android.gms.internal.ads.zzbhp(new com.google.android.gms.internal.ads.zzbhu(context)), new com.google.android.gms.internal.ads.zzeiz(new com.google.android.gms.internal.ads.zzeiv(context), (com.google.android.gms.internal.ads.zzhcg) ((com.google.android.gms.internal.ads.zzcox) zzc).zzd.zzb())).zza(com.google.android.gms.ads.internal.zzt.zzh().zzo().zzx());
                }
            }
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzpA)).booleanValue()) {
                zzc.zzg().zza();
            }
            zza = zzc;
            return zzc;
        }
    }

    public static com.google.android.gms.internal.ads.zzcnj zza(android.content.Context context, @javax.annotation.Nullable com.google.android.gms.internal.ads.zzbvc zzbvcVar, int i) {
        return zzH(context, zzbvcVar, com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor.MODULE_VERSION, false, i, new com.google.android.gms.internal.ads.zzcot());
    }

    public abstract com.google.android.gms.internal.ads.zzebc zzA();

    public abstract com.google.android.gms.internal.ads.zzflo zzB();

    public abstract com.google.android.gms.internal.ads.zzedo zzC();

    public abstract com.google.android.gms.internal.ads.zzdzl zzD();

    abstract com.google.android.gms.internal.ads.zzdwu zzE();

    @Override // com.google.android.gms.internal.ads.zzcrq
    public final com.google.android.gms.internal.ads.zzcet zzF() {
        return zzG();
    }

    public abstract com.google.android.gms.internal.ads.zzcet zzG();

    public abstract java.util.concurrent.Executor zzb();

    public abstract java.util.concurrent.ScheduledExecutorService zzc();

    public abstract com.google.android.gms.internal.ads.zzdfs zzd();

    public abstract com.google.android.gms.internal.ads.zzcqr zze();

    public abstract com.google.android.gms.internal.ads.zzftb zzf();

    public abstract com.google.android.gms.internal.ads.zzehg zzg();

    public abstract com.google.android.gms.internal.ads.zzehi zzh();

    public abstract com.google.android.gms.internal.ads.zzcwp zzi();

    public abstract com.google.android.gms.internal.ads.zzfgu zzj();

    public abstract com.google.android.gms.internal.ads.zzcuy zzk();

    public abstract com.google.android.gms.internal.ads.zzffg zzl();

    public abstract com.google.android.gms.internal.ads.zzdnf zzm();

    public abstract com.google.android.gms.internal.ads.zzfik zzn();

    public abstract com.google.android.gms.internal.ads.zzdob zzo();

    public abstract com.google.android.gms.internal.ads.zzdvq zzp();

    public abstract com.google.android.gms.internal.ads.zzfjy zzq();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzw zzr();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzap zzs();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzq zzt();

    public abstract com.google.android.gms.internal.ads.zzekr zzu();

    public abstract com.google.android.gms.internal.ads.zzflx zzv();

    public abstract com.google.android.gms.internal.ads.zzecr zzw();

    public abstract com.google.android.gms.internal.ads.zzfqj zzx();

    @Override // com.google.android.gms.internal.ads.zzcrq
    public final com.google.android.gms.internal.ads.zzfdm zzy(com.google.android.gms.internal.ads.zzcbd zzcbdVar, int i) {
        return zzz(new com.google.android.gms.internal.ads.zzfep(zzcbdVar, i));
    }

    protected abstract com.google.android.gms.internal.ads.zzfdm zzz(com.google.android.gms.internal.ads.zzfep zzfepVar);
}
