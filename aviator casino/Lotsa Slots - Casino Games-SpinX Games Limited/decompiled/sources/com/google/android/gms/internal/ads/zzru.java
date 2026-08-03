package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzru {
    private final android.os.Handler zza;
    private final com.google.android.gms.internal.ads.zzrv zzb;

    public zzru(android.os.Handler handler, com.google.android.gms.internal.ads.zzrv zzrvVar) {
        if (zzrvVar == null) {
            handler = null;
        }
        this.zza = handler;
        this.zzb = zzrvVar;
    }

    final /* synthetic */ void zzA(int i) {
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        this.zzb.zzx(i);
    }

    final /* synthetic */ void zzB(com.google.android.gms.internal.ads.zziz zzizVar) {
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        this.zzb.zzy(zzizVar);
    }

    public final void zza(final com.google.android.gms.internal.ads.zzjb zzjbVar) {
        android.os.Handler handler = this.zza;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzrt
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzru.this.zzo(zzjbVar);
                }
            });
        }
    }

    public final void zzb(final java.lang.String str, final long j, final long j2) {
        android.os.Handler handler = this.zza;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzrg
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzru.this.zzp(str, j, j2);
                }
            });
        }
    }

    public final void zzc(final com.google.android.gms.internal.ads.zzv zzvVar, final com.google.android.gms.internal.ads.zzjc zzjcVar) {
        android.os.Handler handler = this.zza;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzrk
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzru.this.zzq(zzvVar, zzjcVar);
                }
            });
        }
    }

    public final void zzd(final long j) {
        android.os.Handler handler = this.zza;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzrl
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzru.this.zzr(j);
                }
            });
        }
    }

    public final void zze(final int i, final long j, final long j2) {
        android.os.Handler handler = this.zza;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzrm
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzru.this.zzs(i, j, j2);
                }
            });
        }
    }

    public final void zzf(final java.lang.String str) {
        android.os.Handler handler = this.zza;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzrn
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzru.this.zzt(str);
                }
            });
        }
    }

    public final void zzg(final com.google.android.gms.internal.ads.zzjb zzjbVar) {
        zzjbVar.zza();
        android.os.Handler handler = this.zza;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzro
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzru.this.zzu(zzjbVar);
                }
            });
        }
    }

    public final void zzh(final boolean z) {
        android.os.Handler handler = this.zza;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzrp
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzru.this.zzv(z);
                }
            });
        }
    }

    public final void zzi(final java.lang.Exception exc) {
        android.os.Handler handler = this.zza;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzrq
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzru.this.zzw(exc);
                }
            });
        }
    }

    public final void zzj(final java.lang.Exception exc) {
        android.os.Handler handler = this.zza;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzrr
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzru.this.zzx(exc);
                }
            });
        }
    }

    public final void zzk(final com.google.android.gms.internal.ads.zzry zzryVar) {
        android.os.Handler handler = this.zza;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzrs
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzru.this.zzy(zzryVar);
                }
            });
        }
    }

    public final void zzl(final com.google.android.gms.internal.ads.zzry zzryVar) {
        android.os.Handler handler = this.zza;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzrh
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzru.this.zzz(zzryVar);
                }
            });
        }
    }

    public final void zzm(final int i) {
        android.os.Handler handler = this.zza;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzri
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzru.this.zzA(i);
                }
            });
        }
    }

    public final void zzn(final com.google.android.gms.internal.ads.zziz zzizVar) {
        android.os.Handler handler = this.zza;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzrj
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzru.this.zzB(zzizVar);
                }
            });
        }
    }

    final /* synthetic */ void zzo(com.google.android.gms.internal.ads.zzjb zzjbVar) {
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        this.zzb.zzl(zzjbVar);
    }

    final /* synthetic */ void zzp(java.lang.String str, long j, long j2) {
        java.lang.String str2 = com.google.android.gms.internal.ads.zzfl.zza;
        this.zzb.zzm(str, j, j2);
    }

    final /* synthetic */ void zzq(com.google.android.gms.internal.ads.zzv zzvVar, com.google.android.gms.internal.ads.zzjc zzjcVar) {
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        this.zzb.zzn(zzvVar, zzjcVar);
    }

    final /* synthetic */ void zzr(long j) {
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        this.zzb.zzo(j);
    }

    final /* synthetic */ void zzs(int i, long j, long j2) {
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        this.zzb.zzp(i, j, j2);
    }

    final /* synthetic */ void zzt(java.lang.String str) {
        java.lang.String str2 = com.google.android.gms.internal.ads.zzfl.zza;
        this.zzb.zzq(str);
    }

    final /* synthetic */ void zzu(com.google.android.gms.internal.ads.zzjb zzjbVar) {
        zzjbVar.zza();
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        this.zzb.zzr(zzjbVar);
    }

    final /* synthetic */ void zzv(boolean z) {
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        this.zzb.zzs(z);
    }

    final /* synthetic */ void zzw(java.lang.Exception exc) {
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        this.zzb.zzt(exc);
    }

    final /* synthetic */ void zzx(java.lang.Exception exc) {
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        this.zzb.zzu(exc);
    }

    final /* synthetic */ void zzy(com.google.android.gms.internal.ads.zzry zzryVar) {
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        this.zzb.zzv(zzryVar);
    }

    final /* synthetic */ void zzz(com.google.android.gms.internal.ads.zzry zzryVar) {
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        this.zzb.zzw(zzryVar);
    }
}
