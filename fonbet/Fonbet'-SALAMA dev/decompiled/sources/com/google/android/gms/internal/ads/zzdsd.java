package com.google.android.gms.internal.ads;

import android.content.Context;
import o3.BinderC1507b;

/* loaded from: classes.dex */
public final class zzdsd implements zzdrr {
    private final long zza;
    private final zzejl zzb;

    public zzdsd(long j, Context context, zzdrw zzdrwVar, zzcgb zzcgbVar, String str) {
        this.zza = j;
        zzeyk zzu = zzcgbVar.zzu();
        zzu.zzc(context);
        zzu.zza(new com.google.android.gms.ads.internal.client.zzr());
        zzu.zzb(str);
        zzejl zza = zzu.zzd().zza();
        this.zzb = zza;
        zza.zzD(new zzdsc(this, zzdrwVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdrr
    public final void zza() {
        this.zzb.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzdrr
    public final void zzb(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        this.zzb.zzab(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdrr
    public final void zzc() {
        this.zzb.zzW(new BinderC1507b(null));
    }
}
