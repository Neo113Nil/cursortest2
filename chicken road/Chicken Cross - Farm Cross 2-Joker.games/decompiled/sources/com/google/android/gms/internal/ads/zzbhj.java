package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzbhj implements Runnable {
    final /* synthetic */ zzbhn zza;

    zzbhj(zzbhn zzbhnVar) {
        Objects.requireNonNull(zzbhnVar);
        this.zza = zzbhnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzg();
    }
}
