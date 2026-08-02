package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C0875q;
import java.util.Objects;

/* loaded from: classes4.dex */
final class zzmj implements Runnable {
    final /* synthetic */ zzr zza;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcu zzb;
    final /* synthetic */ zznl zzc;

    public zzmj(zznl zznlVar, zzr zzrVar, com.google.android.gms.internal.measurement.zzcu zzcuVar) {
        this.zza = zzrVar;
        this.zzb = zzcuVar;
        Objects.requireNonNull(zznlVar);
        this.zzc = zznlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.measurement.zzcu zzcuVar;
        zzpp zzk;
        zznl zznlVar;
        zzic zzicVar;
        String str = null;
        try {
            try {
                zznlVar = this.zzc;
                zzicVar = zznlVar.zzu;
            } catch (RemoteException e) {
                this.zzc.zzu.zzaV().zzb().zzb("Failed to get app instance id", e);
            }
            if (zzicVar.zzd().zzl().zzo(zzjk.ANALYTICS_STORAGE)) {
                zzgb zzZ = zznlVar.zzZ();
                if (zzZ != null) {
                    zzr zzrVar = this.zza;
                    C0875q.g(zzrVar);
                    str = zzZ.zzm(zzrVar);
                    if (str != null) {
                        zznlVar.zzu.zzj().zzR(str);
                        zzicVar.zzd().zze.zzb(str);
                    }
                    zznlVar.zzV();
                    zznl zznlVar2 = this.zzc;
                    zzcuVar = this.zzb;
                    zzk = zznlVar2.zzu.zzk();
                    zzk.zzal(zzcuVar, str);
                }
                zzicVar.zzaV().zzb().zza("Failed to get app instance id");
            } else {
                zzicVar.zzaV().zzh().zza("Analytics storage consent denied; will not get app instance id");
                zznlVar.zzu.zzj().zzR(null);
                zzicVar.zzd().zze.zzb(null);
            }
            zzk = zzicVar.zzk();
            zzcuVar = this.zzb;
            zzk.zzal(zzcuVar, str);
        } catch (Throwable th) {
            zznl zznlVar3 = this.zzc;
            zznlVar3.zzu.zzk().zzal(this.zzb, null);
            throw th;
        }
    }
}
