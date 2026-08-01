package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzatd implements Runnable {
    final /* synthetic */ zzats zza;
    final /* synthetic */ zzate zzb;

    zzatd(zzate zzateVar, zzats zzatsVar) {
        this.zza = zzatsVar;
        Objects.requireNonNull(zzateVar);
        this.zzb = zzateVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzb.zzb().put(this.zza);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
