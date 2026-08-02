package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;

/* loaded from: classes.dex */
final class zzauh implements Runnable {
    final /* synthetic */ zzaui zza;

    public zzauh(zzaui zzauiVar) {
        this.zza = zzauiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        boolean z4;
        zzavr zzavrVar;
        ConditionVariable conditionVariable2;
        if (this.zza.zzb != null) {
            return;
        }
        conditionVariable = zzaui.zzc;
        synchronized (conditionVariable) {
            if (this.zza.zzb != null) {
                return;
            }
            boolean z7 = false;
            try {
                z4 = ((Boolean) zzbby.zzcJ.zze()).booleanValue();
            } catch (IllegalStateException unused) {
                z4 = false;
            }
            if (z4) {
                try {
                    zzavrVar = this.zza.zze;
                    zzaui.zza = zzfoc.zzb(zzavrVar.zza, "ADSHIELD", null);
                } catch (Throwable unused2) {
                }
            }
            z7 = z4;
            this.zza.zzb = Boolean.valueOf(z7);
            conditionVariable2 = zzaui.zzc;
            conditionVariable2.open();
        }
    }
}
