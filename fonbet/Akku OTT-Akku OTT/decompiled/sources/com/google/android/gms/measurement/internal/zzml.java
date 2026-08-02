package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import androidx.collection.f;
import com.google.android.gms.common.internal.C0875q;
import java.util.Objects;

/* loaded from: classes4.dex */
final class zzml implements Runnable {
    final /* synthetic */ zzr zza;
    final /* synthetic */ zznl zzb;

    public zzml(zznl zznlVar, zzr zzrVar) {
        this.zza = zzrVar;
        Objects.requireNonNull(zznlVar);
        this.zzb = zznlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznl zznlVar = this.zzb;
        zzgb zzZ = zznlVar.zzZ();
        if (zzZ == null) {
            f.c(zznlVar.zzu, "Failed to send app backgrounded");
            return;
        }
        try {
            zzr zzrVar = this.zza;
            C0875q.g(zzrVar);
            zzZ.zzA(zzrVar);
            zznlVar.zzV();
        } catch (RemoteException e) {
            this.zzb.zzu.zzaV().zzb().zzb("Failed to send app backgrounded to the service", e);
        }
    }
}
