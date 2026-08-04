package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class zzfmn {
    private final Context zza;
    private final Looper zzb;

    public zzfmn(Context context, Looper looper) {
        this.zza = context;
        this.zzb = looper;
    }

    public final void zza(String str) {
        zzfmy zzfmyVarZza = zzfnb.zza();
        zzfmyVarZza.zza(this.zza.getPackageName());
        zzfmyVarZza.zzc(2);
        zzfmv zzfmvVarZza = zzfmx.zza();
        zzfmvVarZza.zza(str);
        zzfmvVarZza.zzb(2);
        zzfmyVarZza.zzb(zzfmvVarZza);
        new zzfmo(this.zza, this.zzb, (zzfnb) zzfmyVarZza.zzbr()).zza();
    }
}
