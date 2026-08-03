package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzaby extends android.os.Handler implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.internal.ads.zzacd zza;
    private final com.google.android.gms.internal.ads.zzabz zzb;
    private final long zzc;
    private com.google.android.gms.internal.ads.zzabv zzd;
    private java.io.IOException zze;
    private int zzf;
    private java.lang.Thread zzg;
    private boolean zzh;
    private volatile boolean zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaby(com.google.android.gms.internal.ads.zzacd zzacdVar, android.os.Looper looper, com.google.android.gms.internal.ads.zzabz zzabzVar, com.google.android.gms.internal.ads.zzabv zzabvVar, int i, long j) {
        super(looper);
        java.util.Objects.requireNonNull(zzacdVar);
        this.zza = zzacdVar;
        this.zzb = zzabzVar;
        this.zzd = zzabvVar;
        this.zzc = j;
    }

    private final void zzd() {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.zzc;
        com.google.android.gms.internal.ads.zzabv zzabvVar = this.zzd;
        zzabvVar.getClass();
        zzabvVar.zzC(this.zzb, elapsedRealtime, j, this.zzf);
        this.zze = null;
        com.google.android.gms.internal.ads.zzacd zzacdVar = this.zza;
        com.google.android.gms.internal.ads.zzaby zzj = zzacdVar.zzj();
        zzj.getClass();
        zzacdVar.zzi().execute(zzj);
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        if (this.zzi) {
            return;
        }
        if (message.what == 1) {
            zzd();
            return;
        }
        if (message.what == 4) {
            throw ((java.lang.Error) message.obj);
        }
        com.google.android.gms.internal.ads.zzacd zzacdVar = this.zza;
        zzacdVar.zzk(null);
        long j = this.zzc;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long j2 = elapsedRealtime - j;
        com.google.android.gms.internal.ads.zzabv zzabvVar = this.zzd;
        zzabvVar.getClass();
        if (this.zzh) {
            zzabvVar.zzA(this.zzb, elapsedRealtime, j2, false);
            return;
        }
        int i = message.what;
        if (i == 2) {
            try {
                zzabvVar.zzB(this.zzb, elapsedRealtime, j2);
                return;
            } catch (java.lang.RuntimeException e) {
                com.google.android.gms.internal.ads.zzeg.zzf("LoadTask", "Unexpected exception handling load completed", e);
                this.zza.zzl(new com.google.android.gms.internal.ads.zzacc(e));
                return;
            }
        }
        if (i != 3) {
            return;
        }
        java.io.IOException iOException = (java.io.IOException) message.obj;
        this.zze = iOException;
        int i2 = this.zzf + 1;
        this.zzf = i2;
        com.google.android.gms.internal.ads.zzabx zzz = zzabvVar.zzz(this.zzb, elapsedRealtime, j2, iOException, i2);
        if (zzz.zzb() == 3) {
            zzacdVar.zzl(this.zze);
        } else if (zzz.zzb() != 2) {
            if (zzz.zzb() == 1) {
                this.zzf = 1;
            }
            zzb(zzz.zzc() != -9223372036854775807L ? zzz.zzc() : java.lang.Math.min((this.zzf - 1) * 1000, 5000));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = !this.zzh;
                this.zzg = java.lang.Thread.currentThread();
            }
            if (z) {
                com.google.android.gms.internal.ads.zzabz zzabzVar = this.zzb;
                java.lang.String simpleName = zzabzVar.getClass().getSimpleName();
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(simpleName).length() + 5);
                sb.append("load:");
                sb.append(simpleName);
                android.os.Trace.beginSection(sb.toString());
                try {
                    zzabzVar.zzc();
                    android.os.Trace.endSection();
                } catch (java.lang.Throwable th) {
                    android.os.Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.zzg = null;
                java.lang.Thread.interrupted();
            }
            if (this.zzi) {
                return;
            }
            sendEmptyMessage(2);
        } catch (java.io.IOException e) {
            if (this.zzi) {
                return;
            }
            obtainMessage(3, e).sendToTarget();
        } catch (java.lang.OutOfMemoryError e2) {
            if (this.zzi) {
                return;
            }
            com.google.android.gms.internal.ads.zzeg.zzf("LoadTask", "OutOfMemory error loading stream", e2);
            obtainMessage(3, new com.google.android.gms.internal.ads.zzacc(e2)).sendToTarget();
        } catch (java.lang.Error e3) {
            if (!this.zzi) {
                com.google.android.gms.internal.ads.zzeg.zzf("LoadTask", "Unexpected error loading stream", e3);
                obtainMessage(4, e3).sendToTarget();
            }
            throw e3;
        } catch (java.lang.Exception e4) {
            if (this.zzi) {
                return;
            }
            com.google.android.gms.internal.ads.zzeg.zzf("LoadTask", "Unexpected exception loading stream", e4);
            obtainMessage(3, new com.google.android.gms.internal.ads.zzacc(e4)).sendToTarget();
        }
    }

    public final void zza(int i) throws java.io.IOException {
        java.io.IOException iOException = this.zze;
        if (iOException != null && this.zzf > i) {
            throw iOException;
        }
    }

    public final void zzb(long j) {
        com.google.android.gms.internal.ads.zzacd zzacdVar = this.zza;
        com.google.android.gms.internal.ads.zzgtj.zzi(zzacdVar.zzj() == null);
        zzacdVar.zzk(this);
        if (j > 0) {
            sendEmptyMessageDelayed(1, j);
        } else {
            zzd();
        }
    }

    public final void zzc(boolean z) {
        this.zzi = z;
        this.zze = null;
        if (hasMessages(1)) {
            this.zzh = true;
            removeMessages(1);
            if (!z) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                this.zzh = true;
                this.zzb.zzb();
                java.lang.Thread thread = this.zzg;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z) {
            this.zza.zzk(null);
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            com.google.android.gms.internal.ads.zzabv zzabvVar = this.zzd;
            zzabvVar.getClass();
            zzabvVar.zzA(this.zzb, elapsedRealtime, elapsedRealtime - this.zzc, true);
            this.zzd = null;
        }
    }
}
