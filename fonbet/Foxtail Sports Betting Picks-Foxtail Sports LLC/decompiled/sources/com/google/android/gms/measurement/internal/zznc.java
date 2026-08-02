package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
final class zznc implements Runnable {
    private final /* synthetic */ boolean zza;
    private final /* synthetic */ zzp zzb;
    private final /* synthetic */ boolean zzc;
    private final /* synthetic */ zzbl zzd;
    private final /* synthetic */ String zze;
    private final /* synthetic */ zzme zzf;

    zznc(zzme zzmeVar, boolean z, zzp zzpVar, boolean z2, zzbl zzblVar, String str) {
        this.zza = z;
        this.zzb = zzpVar;
        this.zzc = z2;
        this.zzd = zzblVar;
        this.zze = str;
        this.zzf = zzmeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfz zzfzVar;
        long j;
        long j2;
        zzfzVar = this.zzf.zzb;
        if (zzfzVar == null) {
            this.zzf.zzj().zzg().zza("Discarding data. Failed to send event to service");
            return;
        }
        if (this.zza) {
            Preconditions.checkNotNull(this.zzb);
            this.zzf.zza(zzfzVar, this.zzc ? null : this.zzd, this.zzb);
        } else {
            boolean zza = this.zzf.zze().zza(zzbn.zzco);
            try {
                if (TextUtils.isEmpty(this.zze)) {
                    Preconditions.checkNotNull(this.zzb);
                    if (zza) {
                        long currentTimeMillis = this.zzf.zzu.zzb().currentTimeMillis();
                        try {
                            j2 = this.zzf.zzu.zzb().elapsedRealtime();
                            j = currentTimeMillis;
                        } catch (RemoteException e) {
                            e = e;
                            j2 = 0;
                            j = currentTimeMillis;
                            this.zzf.zzj().zzg().zza("Failed to send event to the service", e);
                            if (zza) {
                                zzgm.zza(this.zzf.zzu).zza(36301, 13, j, this.zzf.zzu.zzb().currentTimeMillis(), (int) (this.zzf.zzu.zzb().elapsedRealtime() - j2));
                            }
                            this.zzf.zzar();
                        }
                    } else {
                        j = 0;
                        j2 = 0;
                    }
                    try {
                        zzfzVar.zza(this.zzd, this.zzb);
                        if (zza) {
                            this.zzf.zzj().zzq().zza("Logging telemetry for logEvent");
                            zzgm.zza(this.zzf.zzu).zza(36301, 0, j, this.zzf.zzu.zzb().currentTimeMillis(), (int) (this.zzf.zzu.zzb().elapsedRealtime() - j2));
                        }
                    } catch (RemoteException e2) {
                        e = e2;
                        this.zzf.zzj().zzg().zza("Failed to send event to the service", e);
                        if (zza && j != 0) {
                            zzgm.zza(this.zzf.zzu).zza(36301, 13, j, this.zzf.zzu.zzb().currentTimeMillis(), (int) (this.zzf.zzu.zzb().elapsedRealtime() - j2));
                        }
                        this.zzf.zzar();
                    }
                } else {
                    zzfzVar.zza(this.zzd, this.zze, this.zzf.zzj().zzy());
                }
            } catch (RemoteException e3) {
                e = e3;
                j = 0;
                j2 = 0;
            }
        }
        this.zzf.zzar();
    }
}
