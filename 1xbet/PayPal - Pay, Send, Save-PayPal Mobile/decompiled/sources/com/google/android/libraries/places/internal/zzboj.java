package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public abstract class zzboj implements com.google.android.libraries.places.internal.zzbom, com.google.android.libraries.places.internal.zzbwe {
    private com.google.android.libraries.places.internal.zzbqe zzr;
    private final java.lang.Object zzs = new java.lang.Object();
    private final com.google.android.libraries.places.internal.zzcal zzt;
    private final com.google.android.libraries.places.internal.zzbwh zzu;
    private int zzv;
    private boolean zzw;
    private boolean zzx;
    private final int zzy;

    protected zzboj(int i, com.google.android.libraries.places.internal.zzcaa zzcaaVar, com.google.android.libraries.places.internal.zzcal zzcalVar) {
        this.zzt = (com.google.android.libraries.places.internal.zzcal) com.google.common.base.Preconditions.checkNotNull(zzcalVar, "transportTracer");
        com.google.android.libraries.places.internal.zzbwh zzbwhVar = new com.google.android.libraries.places.internal.zzbwh(this, com.google.android.libraries.places.internal.zzbjh.zza, i, zzcaaVar, zzcalVar);
        this.zzu = zzbwhVar;
        this.zzr = zzbwhVar;
        this.zzy = 32768;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final boolean zzv() {
        boolean z;
        synchronized (this.zzs) {
            z = false;
            if (this.zzw && this.zzv < this.zzy) {
                if (!this.zzx) {
                    z = true;
                }
            }
        }
        return z;
    }

    private final void zzc() {
        boolean zzv;
        java.util.logging.Logger logger;
        java.util.logging.Logger logger2;
        synchronized (this.zzs) {
            zzv = zzv();
            if (!zzv) {
                logger = com.google.android.libraries.places.internal.zzbok.zza;
                if (logger.isLoggable(java.util.logging.Level.FINEST)) {
                    logger2 = com.google.android.libraries.places.internal.zzbok.zza;
                    logger2.logp(java.util.logging.Level.FINEST, "io.grpc.internal.AbstractStream$TransportState", "notifyIfReady", "Stream not ready so skip notifying listener.\ndetails: allocated/deallocated:{0}/{3}, sent queued: {1}, ready thresh: {2}", new java.lang.Object[]{java.lang.Boolean.valueOf(this.zzw), java.lang.Integer.valueOf(this.zzv), java.lang.Integer.valueOf(this.zzy), java.lang.Boolean.valueOf(this.zzx)});
                }
            }
        }
        if (zzv) {
            zzh().zzd();
        }
    }

    protected abstract com.google.android.libraries.places.internal.zzcad zzh();

    final void zzl() {
        com.google.android.libraries.places.internal.zzbwh zzbwhVar = this.zzu;
        zzbwhVar.zzf(this);
        this.zzr = zzbwhVar;
    }

    final void zzm(int i) {
        this.zzr.zza(i);
    }

    @Override // com.google.android.libraries.places.internal.zzbwe
    public final void zzn(com.google.android.libraries.places.internal.zzcac zzcacVar) {
        zzh().zzb(zzcacVar);
    }

    protected final void zzo(boolean z) {
        if (z) {
            this.zzr.close();
        } else {
            this.zzr.zze();
        }
    }

    protected final void zzp(com.google.android.libraries.places.internal.zzbxo zzbxoVar) {
        try {
            this.zzr.zzd(zzbxoVar);
        } catch (java.lang.Throwable th) {
            zzE(th);
        }
    }

    protected final void zzq(com.google.android.libraries.places.internal.zzbjw zzbjwVar) {
        this.zzr.zzb(zzbjwVar);
    }

    protected final void zzr() {
        com.google.common.base.Preconditions.checkState(zzh() != null);
        synchronized (this.zzs) {
            com.google.common.base.Preconditions.checkState(!this.zzw, "Already allocated");
            this.zzw = true;
        }
        zzc();
    }

    protected final void zzs() {
        synchronized (this.zzs) {
            this.zzx = true;
        }
    }

    public final void zzt(int i) {
        boolean z;
        synchronized (this.zzs) {
            com.google.common.base.Preconditions.checkState(this.zzw, "onStreamAllocated was not called, but it seems the stream is active");
            int i2 = this.zzv;
            int i3 = this.zzy;
            int i4 = i2 - i;
            this.zzv = i4;
            z = false;
            if (i2 >= i3 && i4 < i3) {
                z = true;
            }
        }
        if (z) {
            zzc();
        }
    }

    final /* synthetic */ void zzw(int i) {
        synchronized (this.zzs) {
            this.zzv += i;
        }
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbqe zzx() {
        return this.zzr;
    }

    protected final com.google.android.libraries.places.internal.zzcal zzu() {
        return this.zzt;
    }
}
