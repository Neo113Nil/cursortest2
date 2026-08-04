package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class zzabk {
    private final Handler zza;
    private final zzabl zzb;

    public zzabk(Handler handler, zzabl zzablVar) {
        if (zzablVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.zza = handler;
        this.zzb = zzablVar;
    }

    public static /* synthetic */ void zza(zzabk zzabkVar, Exception exc) {
        int i7 = zzen.zza;
        zzabkVar.zzb.zzo(exc);
    }

    public static /* synthetic */ void zzb(zzabk zzabkVar, String str) {
        int i7 = zzen.zza;
        zzabkVar.zzb.zzq(str);
    }

    public static /* synthetic */ void zzc(zzabk zzabkVar, long j, int i7) {
        int i8 = zzen.zza;
        zzabkVar.zzb.zzt(j, i7);
    }

    public static /* synthetic */ void zzd(zzabk zzabkVar, int i7, long j) {
        int i8 = zzen.zza;
        zzabkVar.zzb.zzl(i7, j);
    }

    public static /* synthetic */ void zze(zzabk zzabkVar, zzcc zzccVar) {
        int i7 = zzen.zza;
        zzabkVar.zzb.zzv(zzccVar);
    }

    public static /* synthetic */ void zzf(zzabk zzabkVar, zzhq zzhqVar) {
        zzhqVar.zza();
        int i7 = zzen.zza;
        zzabkVar.zzb.zzr(zzhqVar);
    }

    public static /* synthetic */ void zzg(zzabk zzabkVar, zzz zzzVar, zzhr zzhrVar) {
        int i7 = zzen.zza;
        zzabkVar.zzb.zzu(zzzVar, zzhrVar);
    }

    public static /* synthetic */ void zzh(zzabk zzabkVar, Object obj, long j) {
        int i7 = zzen.zza;
        zzabkVar.zzb.zzm(obj, j);
    }

    public static /* synthetic */ void zzi(zzabk zzabkVar, zzhq zzhqVar) {
        int i7 = zzen.zza;
        zzabkVar.zzb.zzs(zzhqVar);
    }

    public static /* synthetic */ void zzj(zzabk zzabkVar, String str, long j, long j3) {
        int i7 = zzen.zza;
        zzabkVar.zzb.zzp(str, j, j3);
    }

    public final void zzk(final String str, final long j, final long j3) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaba
                @Override // java.lang.Runnable
                public final void run() {
                    zzabk.zzj(this.zza, str, j, j3);
                }
            });
        }
    }

    public final void zzl(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabj
                @Override // java.lang.Runnable
                public final void run() {
                    zzabk.zzb(this.zza, str);
                }
            });
        }
    }

    public final void zzm(final zzhq zzhqVar) {
        zzhqVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabi
                @Override // java.lang.Runnable
                public final void run() {
                    zzabk.zzf(this.zza, zzhqVar);
                }
            });
        }
    }

    public final void zzn(final int i7, final long j) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabc
                @Override // java.lang.Runnable
                public final void run() {
                    zzabk.zzd(this.zza, i7, j);
                }
            });
        }
    }

    public final void zzo(final zzhq zzhqVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabg
                @Override // java.lang.Runnable
                public final void run() {
                    zzabk.zzi(this.zza, zzhqVar);
                }
            });
        }
    }

    public final void zzp(final zzz zzzVar, final zzhr zzhrVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabh
                @Override // java.lang.Runnable
                public final void run() {
                    zzabk.zzg(this.zza, zzzVar, zzhrVar);
                }
            });
        }
    }

    public final void zzq(final Object obj) {
        Handler handler = this.zza;
        if (handler != null) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabd
                @Override // java.lang.Runnable
                public final void run() {
                    zzabk.zzh(this.zza, obj, jElapsedRealtime);
                }
            });
        }
    }

    public final void zzr(final long j, final int i7) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabe
                @Override // java.lang.Runnable
                public final void run() {
                    zzabk.zzc(this.zza, j, i7);
                }
            });
        }
    }

    public final void zzs(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabf
                @Override // java.lang.Runnable
                public final void run() {
                    zzabk.zza(this.zza, exc);
                }
            });
        }
    }

    public final void zzt(final zzcc zzccVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabb
                @Override // java.lang.Runnable
                public final void run() {
                    zzabk.zze(this.zza, zzccVar);
                }
            });
        }
    }
}
