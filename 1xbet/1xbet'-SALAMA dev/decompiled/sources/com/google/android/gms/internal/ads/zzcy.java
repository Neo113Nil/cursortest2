package com.google.android.gms.internal.ads;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class zzcy {
    private final zzdj zza;
    private final zzdj zzb;
    private Object zzc;
    private final zzix zzd;

    public zzcy(Object obj, Looper looper, Looper looper2, zzcz zzczVar, zzix zzixVar) {
        this.zza = zzczVar.zzd(looper, null);
        this.zzb = zzczVar.zzd(looper2, null);
        this.zzc = obj;
        this.zzd = zzixVar;
    }

    public static /* synthetic */ void zza(zzcy zzcyVar, Object obj) {
        Object obj2 = zzcyVar.zzc;
        zzcyVar.zzc = obj;
        if (obj2.equals(obj)) {
            return;
        }
        zzcyVar.zzd.zza(obj2, obj);
    }

    public final void zzb(Runnable runnable) {
        this.zza.zzh(runnable);
    }

    public final void zzc(final Object obj) {
        this.zzb.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcx
            @Override // java.lang.Runnable
            public final void run() {
                zzcy.zza(this.zza, obj);
            }
        });
    }
}
