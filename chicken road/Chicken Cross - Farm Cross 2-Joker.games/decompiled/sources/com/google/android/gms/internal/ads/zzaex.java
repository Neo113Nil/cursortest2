package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzaex {
    private final Handler zza;
    private final zzaey zzb;

    public zzaex(Handler handler, zzaey zzaeyVar) {
        if (zzaeyVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.zza = handler;
        this.zzb = zzaeyVar;
    }

    public final void zza(final zzje zzjeVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaew
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzaex.this.zzl(zzjeVar);
                }
            });
        }
    }

    public final void zzb(final String str, final long j, final long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaem
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzaex.this.zzm(str, j, j2);
                }
            });
        }
    }

    public final void zzc(final zzv zzvVar, final zzjf zzjfVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaen
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzaex.this.zzn(zzvVar, zzjfVar);
                }
            });
        }
    }

    public final void zzd(final int i, final long j) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaeo
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzaex.this.zzo(i, j);
                }
            });
        }
    }

    public final void zze(final long j, final int i) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaep
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzaex.this.zzp(j, i);
                }
            });
        }
    }

    public final void zzf(final zzbv zzbvVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaeq
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzaex.this.zzq(zzbvVar);
                }
            });
        }
    }

    public final void zzg(final Object obj) {
        Handler handler = this.zza;
        if (handler != null) {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaer
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzaex.this.zzr(obj, elapsedRealtime);
                }
            });
        }
    }

    public final void zzh(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaes
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzaex.this.zzs(str);
                }
            });
        }
    }

    public final void zzi(final zzje zzjeVar) {
        zzjeVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaet
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzaex.this.zzt(zzjeVar);
                }
            });
        }
    }

    public final void zzj(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaeu
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzaex.this.zzu(exc);
                }
            });
        }
    }

    public final void zzk(final zzjc zzjcVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaev
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzaex.this.zzv(zzjcVar);
                }
            });
        }
    }

    final /* synthetic */ void zzl(zzje zzjeVar) {
        String str = zzfm.zza;
        this.zzb.zzb(zzjeVar);
    }

    final /* synthetic */ void zzm(String str, long j, long j2) {
        String str2 = zzfm.zza;
        this.zzb.zzc(str, j, j2);
    }

    final /* synthetic */ void zzn(zzv zzvVar, zzjf zzjfVar) {
        String str = zzfm.zza;
        this.zzb.zzd(zzvVar, zzjfVar);
    }

    final /* synthetic */ void zzo(int i, long j) {
        String str = zzfm.zza;
        this.zzb.zze(i, j);
    }

    final /* synthetic */ void zzp(long j, int i) {
        String str = zzfm.zza;
        this.zzb.zzj(j, i);
    }

    final /* synthetic */ void zzq(zzbv zzbvVar) {
        String str = zzfm.zza;
        this.zzb.zzf(zzbvVar);
    }

    final /* synthetic */ void zzr(Object obj, long j) {
        String str = zzfm.zza;
        this.zzb.zzg(obj, j);
    }

    final /* synthetic */ void zzs(String str) {
        String str2 = zzfm.zza;
        this.zzb.zzh(str);
    }

    final /* synthetic */ void zzt(zzje zzjeVar) {
        zzjeVar.zza();
        String str = zzfm.zza;
        this.zzb.zzi(zzjeVar);
    }

    final /* synthetic */ void zzu(Exception exc) {
        String str = zzfm.zza;
        this.zzb.zzk(exc);
    }

    final /* synthetic */ void zzv(zzjc zzjcVar) {
        String str = zzfm.zza;
        this.zzb.zzz(zzjcVar);
    }
}
