package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzchn implements Runnable {
    final /* synthetic */ zzcht zza;

    zzchn(zzcht zzchtVar) {
        Objects.requireNonNull(zzchtVar);
        this.zza = zzchtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzI("surfaceCreated", new String[0]);
    }
}
