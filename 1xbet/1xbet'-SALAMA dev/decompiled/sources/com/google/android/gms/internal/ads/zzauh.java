package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class zzauh implements Runnable {
    final /* synthetic */ zzaui zza;

    public zzauh(zzaui zzauiVar) {
        this.zza = zzauiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zBooleanValue;
        if (this.zza.zzb != null) {
            return;
        }
        synchronized (zzaui.zzc) {
            if (this.zza.zzb != null) {
                return;
            }
            boolean z4 = false;
            try {
                zBooleanValue = ((Boolean) zzbby.zzcJ.zze()).booleanValue();
            } catch (IllegalStateException unused) {
                zBooleanValue = false;
            }
            if (zBooleanValue) {
                try {
                    zzaui.zza = zzfoc.zzb(this.zza.zze.zza, "ADSHIELD", null);
                } catch (Throwable unused2) {
                }
            }
            z4 = zBooleanValue;
            this.zza.zzb = Boolean.valueOf(z4);
            zzaui.zzc.open();
        }
    }
}
