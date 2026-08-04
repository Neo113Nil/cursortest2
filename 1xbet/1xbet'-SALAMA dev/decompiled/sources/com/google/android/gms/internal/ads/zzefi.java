package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class zzefi {
    private final zzfbs zza;
    private final zzdod zzb;
    private final zzdqq zzc;

    public zzefi(zzfbs zzfbsVar, zzdod zzdodVar, zzdqq zzdqqVar) {
        this.zza = zzfbsVar;
        this.zzb = zzdodVar;
        this.zzc = zzdqqVar;
    }

    public final void zza(zzfai zzfaiVar, zzfaf zzfafVar, int i7, zzebv zzebvVar, long j) {
        zzdoc zzdocVarZza;
        zzdqp zzdqpVarZza = this.zzc.zza();
        zzdqpVarZza.zzd(zzfaiVar);
        zzdqpVarZza.zzc(zzfafVar);
        zzdqpVarZza.zzb("action", "adapter_status");
        zzdqpVarZza.zzb("adapter_l", String.valueOf(j));
        zzdqpVarZza.zzb("sc", Integer.toString(i7));
        if (zzebvVar != null) {
            zzdqpVarZza.zzb("arec", Integer.toString(zzebvVar.zzb().f10720a));
            String strZza = this.zza.zza(zzebvVar.getMessage());
            if (strZza != null) {
                zzdqpVarZza.zzb("areec", strZza);
            }
        }
        zzdod zzdodVar = this.zzb;
        Iterator it = zzfafVar.zzt.iterator();
        do {
            if (!it.hasNext()) {
                zzdocVarZza = null;
                break;
            }
            zzdocVarZza = zzdodVar.zza((String) it.next());
        } while (zzdocVarZza == null);
        if (zzdocVarZza != null) {
            zzdqpVarZza.zzb("ancn", zzdocVarZza.zza);
            zzbrc zzbrcVar = zzdocVarZza.zzb;
            if (zzbrcVar != null) {
                zzdqpVarZza.zzb("adapter_v", zzbrcVar.toString());
            }
            zzbrc zzbrcVar2 = zzdocVarZza.zzc;
            if (zzbrcVar2 != null) {
                zzdqpVarZza.zzb("adapter_sv", zzbrcVar2.toString());
            }
        }
        zzdqpVarZza.zzj();
    }
}
