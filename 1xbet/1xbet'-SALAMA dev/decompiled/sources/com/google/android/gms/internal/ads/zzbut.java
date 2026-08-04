package com.google.android.gms.internal.ads;

import E2.o;
import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class zzbut implements Callable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbuv zzb;

    public zzbut(zzbuv zzbuvVar, Context context) {
        this.zza = context;
        this.zzb = zzbuvVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x003d  */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        zzbus zzbusVarZza;
        zzbuu zzbuuVar = (zzbuu) this.zzb.zza.get(this.zza);
        if (zzbuuVar != null) {
            long jLongValue = zzbuuVar.zza + ((Long) zzbdn.zzd.zze()).longValue();
            o.f1952C.j.getClass();
            if (jLongValue < System.currentTimeMillis()) {
                zzbusVarZza = new zzbur(this.zza).zza();
            } else {
                zzbusVarZza = new zzbur(this.zza, zzbuuVar.zzb).zza();
            }
        } else {
            zzbusVarZza = new zzbur(this.zza).zza();
        }
        zzbuv zzbuvVar = this.zzb;
        zzbuvVar.zza.put(this.zza, new zzbuu(zzbuvVar, zzbusVarZza));
        return zzbusVarZza;
    }
}
