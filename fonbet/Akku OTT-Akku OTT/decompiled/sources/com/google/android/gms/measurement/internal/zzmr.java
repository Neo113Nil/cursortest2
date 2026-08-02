package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import androidx.collection.e;
import com.google.android.gms.common.internal.C0875q;
import java.util.Objects;

/* loaded from: classes4.dex */
final class zzmr implements Runnable {
    final /* synthetic */ zzr zza;
    final /* synthetic */ zznl zzb;

    public zzmr(zznl zznlVar, zzr zzrVar) {
        this.zza = zzrVar;
        Objects.requireNonNull(zznlVar);
        this.zzb = zznlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznl zznlVar = this.zzb;
        zzgb zzZ = zznlVar.zzZ();
        if (zzZ == null) {
            e.c(zznlVar.zzu, "Failed to send measurementEnabled to service");
            return;
        }
        try {
            zzr zzrVar = this.zza;
            C0875q.g(zzrVar);
            zzZ.zzi(zzrVar);
            zznlVar.zzV();
        } catch (RemoteException e) {
            this.zzb.zzu.zzaV().zzb().zzb("Failed to send measurementEnabled to the service", e);
        }
    }
}
