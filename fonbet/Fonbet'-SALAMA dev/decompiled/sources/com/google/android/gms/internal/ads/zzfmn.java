package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* loaded from: classes.dex */
public final class zzfmn {
    private final Context zza;
    private final Looper zzb;

    public zzfmn(Context context, Looper looper) {
        this.zza = context;
        this.zzb = looper;
    }

    public final void zza(String str) {
        zzfmy zza = zzfnb.zza();
        zza.zza(this.zza.getPackageName());
        zza.zzc(2);
        zzfmv zza2 = zzfmx.zza();
        zza2.zza(str);
        zza2.zzb(2);
        zza.zzb(zza2);
        new zzfmo(this.zza, this.zzb, (zzfnb) zza.zzbr()).zza();
    }
}
