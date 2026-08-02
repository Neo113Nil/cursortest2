package com.google.android.gms.internal.ads;

import E2.o;
import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class zzbut implements Callable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbuv zzb;

    public zzbut(zzbuv zzbuvVar, Context context) {
        this.zza = context;
        this.zzb = zzbuvVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        WeakHashMap weakHashMap;
        zzbus zza;
        WeakHashMap weakHashMap2;
        weakHashMap = this.zzb.zza;
        zzbuu zzbuuVar = (zzbuu) weakHashMap.get(this.zza);
        if (zzbuuVar != null) {
            long longValue = zzbuuVar.zza + ((Long) zzbdn.zzd.zze()).longValue();
            o.f1952C.j.getClass();
            if (longValue >= System.currentTimeMillis()) {
                zza = new zzbur(this.zza, zzbuuVar.zzb).zza();
                zzbuv zzbuvVar = this.zzb;
                Context context = this.zza;
                weakHashMap2 = zzbuvVar.zza;
                weakHashMap2.put(context, new zzbuu(zzbuvVar, zza));
                return zza;
            }
        }
        zza = new zzbur(this.zza).zza();
        zzbuv zzbuvVar2 = this.zzb;
        Context context2 = this.zza;
        weakHashMap2 = zzbuvVar2.zza;
        weakHashMap2.put(context2, new zzbuu(zzbuvVar2, zza));
        return zza;
    }
}
