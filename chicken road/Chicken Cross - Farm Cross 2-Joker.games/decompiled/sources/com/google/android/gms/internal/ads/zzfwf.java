package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzfwf implements Runnable {
    final /* synthetic */ zzfwg zza;

    zzfwf(zzfwg zzfwgVar) {
        Objects.requireNonNull(zzfwgVar);
        this.zza = zzfwgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfwg zzfwgVar = this.zza;
        AtomicBoolean zzf = zzfwgVar.zzf();
        float zzc = zzfwgVar.zzc();
        zzf.set(false);
        if (((Float) zzfwgVar.zze().getAndSet(Float.valueOf(zzc))).floatValue() != zzc) {
            zzfwgVar.zzd().post(new zzfwe(this, zzc));
        }
    }
}
