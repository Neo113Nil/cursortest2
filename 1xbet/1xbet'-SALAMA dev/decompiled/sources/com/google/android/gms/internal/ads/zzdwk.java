package com.google.android.gms.internal.ads;

import I2.C0309q;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
final class zzdwk implements zzgay {
    final /* synthetic */ Context zza;

    public zzdwk(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final void zza(Throwable th) {
        if (((Boolean) zzbdq.zzh.zze()).booleanValue() && (th instanceof C0309q)) {
            zzbbi.zze(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        if (((Boolean) zzbdq.zzj.zze()).booleanValue()) {
            zzbbi.zze(this.zza);
        }
    }
}
