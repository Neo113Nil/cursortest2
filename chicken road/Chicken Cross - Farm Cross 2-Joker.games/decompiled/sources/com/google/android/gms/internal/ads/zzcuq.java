package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzcuq implements zzbqh {
    final /* synthetic */ zzcut zza;

    zzcuq(zzcut zzcutVar) {
        Objects.requireNonNull(zzcutVar);
        this.zza = zzcutVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final void zza(Object obj, Map map) {
        zzcut zzcutVar = this.zza;
        if (zzcutVar.zze(map)) {
            zzcutVar.zzf().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcup
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcuq.this.zza.zzg().zzl();
                }
            });
        }
    }
}
