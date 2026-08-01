package com.google.android.gms.internal.ads;

import com.ironsource.C4352c8;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzchp implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzcht zzb;

    zzchp(zzcht zzchtVar, boolean z) {
        this.zza = z;
        Objects.requireNonNull(zzchtVar);
        this.zzb = zzchtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzI("windowVisibilityChanged", new String[]{C4352c8.k, String.valueOf(this.zza)});
    }
}
