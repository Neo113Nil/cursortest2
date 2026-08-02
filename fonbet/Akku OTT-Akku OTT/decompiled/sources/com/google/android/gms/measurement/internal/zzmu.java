package com.google.android.gms.measurement.internal;

import androidx.collection.e;
import com.google.android.gms.common.internal.C0875q;
import java.util.Objects;

/* loaded from: classes4.dex */
final class zzmu implements Runnable {
    final /* synthetic */ zzr zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzah zzc;
    final /* synthetic */ zznl zzd;

    public zzmu(zznl zznlVar, boolean z, zzr zzrVar, boolean z2, zzah zzahVar, zzah zzahVar2) {
        this.zza = zzrVar;
        this.zzb = z2;
        this.zzc = zzahVar;
        Objects.requireNonNull(zznlVar);
        this.zzd = zznlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznl zznlVar = this.zzd;
        zzgb zzZ = zznlVar.zzZ();
        if (zzZ == null) {
            e.c(zznlVar.zzu, "Discarding data. Failed to send conditional user property to service");
            return;
        }
        zzr zzrVar = this.zza;
        C0875q.g(zzrVar);
        zznlVar.zzm(zzZ, this.zzb ? null : this.zzc, zzrVar);
        zznlVar.zzV();
    }
}
