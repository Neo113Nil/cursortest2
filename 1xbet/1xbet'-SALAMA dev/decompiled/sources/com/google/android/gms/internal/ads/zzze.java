package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import io.sentry.logger.LoggerBatchProcessor;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
final class zzze extends Handler implements Runnable {
    final /* synthetic */ zzzk zza;
    private final zzzf zzb;
    private final long zzc;
    private zzzc zzd;
    private IOException zze;
    private int zzf;
    private Thread zzg;
    private boolean zzh;
    private volatile boolean zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzze(zzzk zzzkVar, Looper looper, zzzf zzzfVar, zzzc zzzcVar, int i7, long j) {
        super(looper);
        this.zza = zzzkVar;
        this.zzb = zzzfVar;
        this.zzd = zzzcVar;
        this.zzc = j;
    }

    private final void zzd() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.zzc;
        zzzc zzzcVar = this.zzd;
        zzzcVar.getClass();
        zzzcVar.zzL(this.zzb, jElapsedRealtime, j, this.zzf);
        this.zze = null;
        zzzk zzzkVar = this.zza;
        zzzs zzzsVar = zzzkVar.zzc;
        zzze zzzeVar = zzzkVar.zzd;
        zzzeVar.getClass();
        zzzsVar.execute(zzzeVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.zzi) {
            return;
        }
        int i7 = message.what;
        if (i7 == 1) {
            zzd();
            return;
        }
        if (i7 == 4) {
            throw ((Error) message.obj);
        }
        this.zza.zzd = null;
        long j = this.zzc;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = jElapsedRealtime - j;
        zzzc zzzcVar = this.zzd;
        zzzcVar.getClass();
        if (this.zzh) {
            zzzcVar.zzJ(this.zzb, jElapsedRealtime, j3, false);
            return;
        }
        int i8 = message.what;
        if (i8 == 2) {
            try {
                zzzcVar.zzK(this.zzb, jElapsedRealtime, j3);
                return;
            } catch (RuntimeException e7) {
                zzdq.zzd("LoadTask", "Unexpected exception handling load completed", e7);
                this.zza.zze = new zzzi(e7);
                return;
            }
        }
        if (i8 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.zze = iOException;
        int i9 = this.zzf + 1;
        this.zzf = i9;
        zzzd zzzdVarZzu = zzzcVar.zzu(this.zzb, jElapsedRealtime, j3, iOException, i9);
        if (zzzdVarZzu.zza == 3) {
            this.zza.zze = this.zze;
        } else if (zzzdVarZzu.zza != 2) {
            if (zzzdVarZzu.zza == 1) {
                this.zzf = 1;
            }
            zzc(zzzdVarZzu.zzb != -9223372036854775807L ? zzzdVarZzu.zzb : Math.min((this.zzf - 1) * zzbbd.zzq.zzf, LoggerBatchProcessor.FLUSH_AFTER_MS));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4;
        try {
            synchronized (this) {
                z4 = this.zzh;
                this.zzg = Thread.currentThread();
            }
            if (!z4) {
                Trace.beginSection("load:".concat(this.zzb.getClass().getSimpleName()));
                try {
                    this.zzb.zzh();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.zzg = null;
                Thread.interrupted();
            }
            if (this.zzi) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e7) {
            if (this.zzi) {
                return;
            }
            obtainMessage(3, e7).sendToTarget();
        } catch (Exception e8) {
            if (this.zzi) {
                return;
            }
            zzdq.zzd("LoadTask", "Unexpected exception loading stream", e8);
            obtainMessage(3, new zzzi(e8)).sendToTarget();
        } catch (OutOfMemoryError e9) {
            if (this.zzi) {
                return;
            }
            zzdq.zzd("LoadTask", "OutOfMemory error loading stream", e9);
            obtainMessage(3, new zzzi(e9)).sendToTarget();
        } catch (Error e10) {
            if (!this.zzi) {
                zzdq.zzd("LoadTask", "Unexpected error loading stream", e10);
                obtainMessage(4, e10).sendToTarget();
            }
            throw e10;
        }
    }

    public final void zza(boolean z4) {
        this.zzi = z4;
        this.zze = null;
        if (hasMessages(1)) {
            this.zzh = true;
            removeMessages(1);
            if (!z4) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.zzh = true;
                    this.zzb.zzg();
                    Thread thread = this.zzg;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z4) {
            this.zza.zzd = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            zzzc zzzcVar = this.zzd;
            zzzcVar.getClass();
            zzzcVar.zzJ(this.zzb, jElapsedRealtime, jElapsedRealtime - this.zzc, true);
            this.zzd = null;
        }
    }

    public final void zzb(int i7) {
        IOException iOException = this.zze;
        if (iOException != null && this.zzf > i7) {
            throw iOException;
        }
    }

    public final void zzc(long j) {
        zzcv.zzf(this.zza.zzd == null);
        this.zza.zzd = this;
        if (j > 0) {
            sendEmptyMessageDelayed(1, j);
        } else {
            zzd();
        }
    }
}
