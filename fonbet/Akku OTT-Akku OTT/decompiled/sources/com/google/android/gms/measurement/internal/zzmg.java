package com.google.android.gms.measurement.internal;

import androidx.collection.e;
import com.google.android.gms.common.internal.C0875q;
import java.util.Objects;

/* loaded from: classes4.dex */
final class zzmg implements Runnable {
    final /* synthetic */ zzr zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzpl zzc;
    final /* synthetic */ zznl zzd;

    public zzmg(zznl zznlVar, zzr zzrVar, boolean z, zzpl zzplVar) {
        this.zza = zzrVar;
        this.zzb = z;
        this.zzc = zzplVar;
        Objects.requireNonNull(zznlVar);
        this.zzd = zznlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznl zznlVar = this.zzd;
        zzgb zzZ = zznlVar.zzZ();
        if (zzZ == null) {
            e.c(zznlVar.zzu, "Discarding data. Failed to set user property");
            return;
        }
        zzr zzrVar = this.zza;
        C0875q.g(zzrVar);
        zznlVar.zzm(zzZ, this.zzb ? null : this.zzc, zzrVar);
        zznlVar.zzV();
    }
}
