package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzejo {
    private final zzcbo zza;

    zzejo(zzcbo zzcboVar) {
        this.zza = zzcboVar;
    }

    public final void zza() {
        ListenableFuture zza = this.zza.zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zziM)).booleanValue()) {
            zzcgm.zzb(zza, "persistFlags");
        } else {
            zzcgm.zza(zza, "persistFlags", zzcgj.zzh);
        }
    }
}
