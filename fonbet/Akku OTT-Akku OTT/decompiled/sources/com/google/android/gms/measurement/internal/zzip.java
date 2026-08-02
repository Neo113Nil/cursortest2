package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C0875q;
import java.util.Objects;

/* loaded from: classes4.dex */
final class zzip implements Runnable {
    final /* synthetic */ zzr zza;
    final /* synthetic */ zzjd zzb;

    public zzip(zzjd zzjdVar, zzr zzrVar) {
        this.zza = zzrVar;
        Objects.requireNonNull(zzjdVar);
        this.zzb = zzjdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjd zzjdVar = this.zzb;
        zzjdVar.zzL().zzZ();
        zzpg zzL = zzjdVar.zzL();
        zzL.zzaW().zzg();
        zzL.zzu();
        zzr zzrVar = this.zza;
        C0875q.d(zzrVar.zza);
        zzL.zzv(zzrVar);
        zzL.zzw(zzrVar);
    }
}
