package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzcek {
    private final Clock zza;
    private final zzcei zzb;

    zzcek(Clock clock, zzcei zzceiVar) {
        this.zza = clock;
        this.zzb = zzceiVar;
    }

    public static zzcek zza(Context context) {
        return zzces.zzb(context).zza();
    }

    public final void zzb() {
        this.zzb.zza(-1, this.zza.currentTimeMillis());
    }

    public final void zzc(com.google.android.gms.ads.internal.client.zzfr zzfrVar) {
        this.zzb.zza(-1, this.zza.currentTimeMillis());
    }

    public final void zzd(int i, long j) {
        this.zzb.zza(i, j);
    }
}
