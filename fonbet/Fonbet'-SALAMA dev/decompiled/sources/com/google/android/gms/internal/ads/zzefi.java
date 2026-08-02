package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes.dex */
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
        zzdoc zzdocVar;
        zzdqp zza = this.zzc.zza();
        zza.zzd(zzfaiVar);
        zza.zzc(zzfafVar);
        zza.zzb("action", "adapter_status");
        zza.zzb("adapter_l", String.valueOf(j));
        zza.zzb("sc", Integer.toString(i7));
        if (zzebvVar != null) {
            zza.zzb("arec", Integer.toString(zzebvVar.zzb().f10720a));
            String zza2 = this.zza.zza(zzebvVar.getMessage());
            if (zza2 != null) {
                zza.zzb("areec", zza2);
            }
        }
        zzdod zzdodVar = this.zzb;
        Iterator it = zzfafVar.zzt.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzdocVar = null;
                break;
            } else {
                zzdocVar = zzdodVar.zza((String) it.next());
                if (zzdocVar != null) {
                    break;
                }
            }
        }
        if (zzdocVar != null) {
            zza.zzb("ancn", zzdocVar.zza);
            zzbrc zzbrcVar = zzdocVar.zzb;
            if (zzbrcVar != null) {
                zza.zzb("adapter_v", zzbrcVar.toString());
            }
            zzbrc zzbrcVar2 = zzdocVar.zzc;
            if (zzbrcVar2 != null) {
                zza.zzb("adapter_sv", zzbrcVar2.toString());
            }
        }
        zza.zzj();
    }
}
