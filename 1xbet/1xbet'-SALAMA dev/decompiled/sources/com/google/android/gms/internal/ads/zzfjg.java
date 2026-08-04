package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class zzfjg {
    private boolean zza;

    public final void zza(Context context) {
        zzflc.zzc(context, "Application Context cannot be null");
        if (this.zza) {
            return;
        }
        this.zza = true;
        zzfkk.zzb().zzd(context);
        zzfkb.zza().zzd(context);
        zzfkx.zzb(context);
        zzfky.zzd(context);
        zzflb.zza(context);
        zzfkh.zzb().zzc(context);
        zzfka.zza().zzd(context);
        zzfkm.zza().zze(context);
    }

    public final boolean zzb() {
        return this.zza;
    }
}
