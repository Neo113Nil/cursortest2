package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
final class zzdwv implements zzcxn {
    private final Context zza;
    private final zzbxm zzb;

    public zzdwv(Context context, zzbxm zzbxmVar) {
        this.zza = context;
        this.zzb = zzbxmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcxn
    public final void zzdl(zzbuo zzbuoVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcxn
    public final void zzdm(zzfar zzfarVar) {
        if (TextUtils.isEmpty(zzfarVar.zzb.zzb.zze)) {
            return;
        }
        this.zzb.zzm(this.zza, zzfarVar.zza.zza.zzd);
        this.zzb.zzi(this.zza, zzfarVar.zzb.zzb.zze);
    }
}
