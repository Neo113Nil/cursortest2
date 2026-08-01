package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzhds implements Runnable {
    zzhdu zza;

    zzhds(zzhdu zzhduVar) {
        this.zza = zzhduVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture zzf;
        zzhdu zzhduVar = this.zza;
        if (zzhduVar == null || (zzf = zzhduVar.zzf()) == null) {
            return;
        }
        this.zza = null;
        if (zzf.isDone()) {
            zzhduVar.zzk(zzf);
            return;
        }
        try {
            ScheduledFuture zzx = zzhduVar.zzx();
            zzhduVar.zzy(null);
            String str = "Timed out";
            if (zzx != null) {
                try {
                    long abs = Math.abs(zzx.getDelay(TimeUnit.MILLISECONDS));
                    if (abs > 10) {
                        StringBuilder sb = new StringBuilder(String.valueOf(abs).length() + 55);
                        sb.append("Timed out (timeout delayed by ");
                        sb.append(abs);
                        sb.append(" ms after scheduled time)");
                        str = sb.toString();
                    }
                } catch (Throwable th) {
                    zzhduVar.zzb(new zzhdt(str, null));
                    throw th;
                }
            }
            String obj = zzf.toString();
            StringBuilder sb2 = new StringBuilder(str.length() + 2 + obj.length());
            sb2.append(str);
            sb2.append(": ");
            sb2.append(obj);
            zzhduVar.zzb(new zzhdt(sb2.toString(), null));
        } finally {
            zzf.cancel(true);
        }
    }
}
