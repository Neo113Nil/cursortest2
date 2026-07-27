package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzcca implements Callable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzccc zzb;

    zzcca(zzccc zzcccVar, Context context) {
        this.zza = context;
        Objects.requireNonNull(zzcccVar);
        this.zzb = zzcccVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzcbz zza;
        zzccc zzcccVar = this.zzb;
        WeakHashMap zzb = zzcccVar.zzb();
        Context context = this.zza;
        zzccb zzccbVar = (zzccb) zzb.get(context);
        if (zzccbVar != null) {
            if (zzccbVar.zza + ((Long) zzbkw.zzd.zze()).longValue() >= com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()) {
                zza = new zzcby(context, zzccbVar.zzb).zza();
                zzcccVar.zzb().put(context, new zzccb(zzcccVar, zza));
                return zza;
            }
        }
        zza = new zzcby(context).zza();
        zzcccVar.zzb().put(context, new zzccb(zzcccVar, zza));
        return zza;
    }
}
