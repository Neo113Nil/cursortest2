package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzaeo {
    private final android.os.Handler zza;
    private final com.google.android.gms.internal.ads.zzaep zzb;

    public zzaeo(android.os.Handler handler, com.google.android.gms.internal.ads.zzaep zzaepVar) {
        if (zzaepVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.zza = handler;
        this.zzb = zzaepVar;
    }

    public final void zza(final com.google.android.gms.internal.ads.zzjb zzjbVar) {
        android.os.Handler handler = this.zza;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzaen
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzaeo.this.zzl(zzjbVar);
                }
            });
        }
    }

    public final void zzb(final java.lang.String str, final long j, final long j2) {
        android.os.Handler handler = this.zza;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzaed
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzaeo.this.zzm(str, j, j2);
                }
            });
        }
    }

    public final void zzc(final com.google.android.gms.internal.ads.zzv zzvVar, final com.google.android.gms.internal.ads.zzjc zzjcVar) {
        android.os.Handler handler = this.zza;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzaee
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzaeo.this.zzn(zzvVar, zzjcVar);
                }
            });
        }
    }

    public final void zzd(final int i, final long j) {
        android.os.Handler handler = this.zza;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzaef
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzaeo.this.zzo(i, j);
                }
            });
        }
    }

    public final void zze(final long j, final int i) {
        android.os.Handler handler = this.zza;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzaeg
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzaeo.this.zzp(j, i);
                }
            });
        }
    }

    public final void zzf(final com.google.android.gms.internal.ads.zzbv zzbvVar) {
        android.os.Handler handler = this.zza;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzaeh
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzaeo.this.zzq(zzbvVar);
                }
            });
        }
    }

    public final void zzg(final java.lang.Object obj) {
        android.os.Handler handler = this.zza;
        if (handler != null) {
            final long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzaei
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzaeo.this.zzr(obj, elapsedRealtime);
                }
            });
        }
    }

    public final void zzh(final java.lang.String str) {
        android.os.Handler handler = this.zza;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzaej
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzaeo.this.zzs(str);
                }
            });
        }
    }

    public final void zzi(final com.google.android.gms.internal.ads.zzjb zzjbVar) {
        zzjbVar.zza();
        android.os.Handler handler = this.zza;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzaek
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzaeo.this.zzt(zzjbVar);
                }
            });
        }
    }

    public final void zzj(final java.lang.Exception exc) {
        android.os.Handler handler = this.zza;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzael
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzaeo.this.zzu(exc);
                }
            });
        }
    }

    public final void zzk(final com.google.android.gms.internal.ads.zziz zzizVar) {
        android.os.Handler handler = this.zza;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzaem
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzaeo.this.zzv(zzizVar);
                }
            });
        }
    }

    final /* synthetic */ void zzl(com.google.android.gms.internal.ads.zzjb zzjbVar) {
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        this.zzb.zzb(zzjbVar);
    }

    final /* synthetic */ void zzm(java.lang.String str, long j, long j2) {
        java.lang.String str2 = com.google.android.gms.internal.ads.zzfl.zza;
        this.zzb.zzc(str, j, j2);
    }

    final /* synthetic */ void zzn(com.google.android.gms.internal.ads.zzv zzvVar, com.google.android.gms.internal.ads.zzjc zzjcVar) {
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        this.zzb.zzd(zzvVar, zzjcVar);
    }

    final /* synthetic */ void zzo(int i, long j) {
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        this.zzb.zze(i, j);
    }

    final /* synthetic */ void zzp(long j, int i) {
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        this.zzb.zzj(j, i);
    }

    final /* synthetic */ void zzq(com.google.android.gms.internal.ads.zzbv zzbvVar) {
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        this.zzb.zzf(zzbvVar);
    }

    final /* synthetic */ void zzr(java.lang.Object obj, long j) {
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        this.zzb.zzg(obj, j);
    }

    final /* synthetic */ void zzs(java.lang.String str) {
        java.lang.String str2 = com.google.android.gms.internal.ads.zzfl.zza;
        this.zzb.zzh(str);
    }

    final /* synthetic */ void zzt(com.google.android.gms.internal.ads.zzjb zzjbVar) {
        zzjbVar.zza();
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        this.zzb.zzi(zzjbVar);
    }

    final /* synthetic */ void zzu(java.lang.Exception exc) {
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        this.zzb.zzk(exc);
    }

    final /* synthetic */ void zzv(com.google.android.gms.internal.ads.zziz zzizVar) {
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        this.zzb.zzz(zzizVar);
    }
}
