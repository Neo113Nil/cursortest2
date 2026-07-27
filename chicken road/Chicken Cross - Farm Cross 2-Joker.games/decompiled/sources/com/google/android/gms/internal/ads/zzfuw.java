package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzfuw implements Runnable {
    final /* synthetic */ zzfvd zza;

    zzfuw(zzfvd zzfvdVar) {
        Objects.requireNonNull(zzfvdVar);
        this.zza = zzfvdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfvd zzfvdVar = this.zza;
        if (zzfvdVar.zzN() != null) {
            long currentTimeMillis = zzfvdVar.zzO().currentTimeMillis();
            int zzs = zzfvdVar.zzs();
            String zzM = zzfvdVar.zzM();
            zzfvdVar.zzN().zzj(currentTimeMillis, zzfvdVar.zzP(), zzs, zzM);
        }
    }
}
