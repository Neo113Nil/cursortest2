package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public abstract class zzbof extends com.google.android.libraries.places.internal.zzboj {
    private final com.google.android.libraries.places.internal.zzcaa zza;
    private boolean zzb;
    private com.google.android.libraries.places.internal.zzbpn zzc;
    private com.google.android.libraries.places.internal.zzbjy zzd;
    private boolean zze;
    private java.lang.Runnable zzf;
    private volatile boolean zzg;
    private boolean zzh;
    private boolean zzi;

    protected zzbof(int i, com.google.android.libraries.places.internal.zzcaa zzcaaVar, com.google.android.libraries.places.internal.zzcal zzcalVar, com.google.android.libraries.places.internal.zzbis zzbisVar) {
        super(i, zzcaaVar, zzcalVar);
        this.zzd = com.google.android.libraries.places.internal.zzbjy.zza();
        this.zze = false;
        this.zza = (com.google.android.libraries.places.internal.zzcaa) com.google.common.base.Preconditions.checkNotNull(zzcaaVar, "statsTraceCtx");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzz, reason: merged with bridge method [inline-methods] */
    public final void zzk(com.google.android.libraries.places.internal.zzbnp zzbnpVar, com.google.android.libraries.places.internal.zzbpm zzbpmVar, com.google.android.libraries.places.internal.zzbmg zzbmgVar) {
        if (this.zzb) {
            return;
        }
        this.zzb = true;
        this.zza.zze(zzbnpVar);
        if (zzu() != null) {
            zzu().zzb(zzbnpVar.zzj());
        }
        this.zzc.zzc(zzbnpVar, zzbpmVar, zzbmgVar);
    }

    public final void zza(com.google.android.libraries.places.internal.zzbpn zzbpnVar) {
        com.google.common.base.Preconditions.checkState(this.zzc == null, "Already called setListener");
        this.zzc = (com.google.android.libraries.places.internal.zzbpn) com.google.common.base.Preconditions.checkNotNull(zzbpnVar, com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
    }

    @Override // com.google.android.libraries.places.internal.zzbwe
    public void zzb(boolean z) {
        com.google.common.base.Preconditions.checkState(this.zzh, "status should have been reported on deframer closed");
        this.zze = true;
        if (this.zzi && z) {
            zzg(com.google.android.libraries.places.internal.zzbnp.zzh.zze("Encountered end-of-stream mid-frame"), com.google.android.libraries.places.internal.zzbpm.PROCESSED, true, new com.google.android.libraries.places.internal.zzbmg());
        }
        java.lang.Runnable runnable = this.zzf;
        if (runnable != null) {
            runnable.run();
            this.zzf = null;
        }
    }

    protected final void zzd(com.google.android.libraries.places.internal.zzbmg zzbmgVar) {
        com.google.common.base.Preconditions.checkState(!this.zzh, "Received headers on closed stream");
        this.zza.zzc(zzbmgVar);
        java.lang.String str = (java.lang.String) zzbmgVar.zzb(com.google.android.libraries.places.internal.zzbsz.zzb);
        if (str != null) {
            com.google.android.libraries.places.internal.zzbjw zzc = this.zzd.zzc(str);
            if (zzc == null) {
                zzE(new com.google.android.libraries.places.internal.zzbns(com.google.android.libraries.places.internal.zzbnp.zzh.zze(java.lang.String.format("Can't find decompressor for %s", str)), null));
                return;
            } else if (zzc != com.google.android.libraries.places.internal.zzbjh.zza) {
                zzq(zzc);
            }
        }
        this.zzc.zza(zzbmgVar);
    }

    protected final void zze(com.google.android.libraries.places.internal.zzbxo zzbxoVar) {
        boolean z;
        java.util.logging.Logger logger;
        com.google.common.base.Preconditions.checkNotNull(zzbxoVar, androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_FRAME);
        try {
            if (this.zzh) {
                logger = com.google.android.libraries.places.internal.zzbog.zzb;
                logger.logp(java.util.logging.Level.INFO, "io.grpc.internal.AbstractClientStream$TransportState", "inboundDataReceived", "Received data on closed stream");
                zzbxoVar.close();
            } else {
                try {
                    zzp(zzbxoVar);
                } catch (java.lang.Throwable th) {
                    th = th;
                    z = false;
                    if (z) {
                        zzbxoVar.close();
                    }
                    throw th;
                }
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            z = true;
        }
    }

    protected final void zzf(com.google.android.libraries.places.internal.zzbmg zzbmgVar, com.google.android.libraries.places.internal.zzbnp zzbnpVar) {
        java.util.logging.Logger logger;
        com.google.common.base.Preconditions.checkNotNull(zzbnpVar, "status");
        com.google.common.base.Preconditions.checkNotNull(zzbmgVar, "trailers");
        if (this.zzh) {
            logger = com.google.android.libraries.places.internal.zzbog.zzb;
            logger.logp(java.util.logging.Level.INFO, "io.grpc.internal.AbstractClientStream$TransportState", "inboundTrailersReceived", "Received trailers on closed stream:\n {1}\n {2}", new java.lang.Object[]{zzbnpVar, zzbmgVar});
        } else {
            this.zza.zzd(zzbmgVar);
            zzg(zzbnpVar, com.google.android.libraries.places.internal.zzbpm.PROCESSED, false, zzbmgVar);
        }
    }

    public final void zzg(com.google.android.libraries.places.internal.zzbnp zzbnpVar, com.google.android.libraries.places.internal.zzbpm zzbpmVar, boolean z, com.google.android.libraries.places.internal.zzbmg zzbmgVar) {
        com.google.common.base.Preconditions.checkNotNull(zzbnpVar, "status");
        com.google.common.base.Preconditions.checkNotNull(zzbmgVar, "trailers");
        if (this.zzh) {
            if (!z) {
                return;
            } else {
                z = true;
            }
        }
        this.zzh = true;
        this.zzi = zzbnpVar.zzj();
        zzs();
        if (this.zze) {
            this.zzf = null;
            zzk(zzbnpVar, zzbpmVar, zzbmgVar);
        } else {
            this.zzf = new com.google.android.libraries.places.internal.zzboe(this, zzbnpVar, zzbpmVar, zzbmgVar);
            zzo(z);
        }
    }

    final /* synthetic */ void zzi(com.google.android.libraries.places.internal.zzbjy zzbjyVar) {
        com.google.common.base.Preconditions.checkState(this.zzc == null, "Already called start");
        this.zzd = (com.google.android.libraries.places.internal.zzbjy) com.google.common.base.Preconditions.checkNotNull(zzbjyVar, "decompressorRegistry");
    }

    final /* synthetic */ void zzj() {
        this.zzg = true;
    }

    @Override // com.google.android.libraries.places.internal.zzboj
    protected final /* synthetic */ com.google.android.libraries.places.internal.zzcad zzh() {
        return this.zzc;
    }

    protected final boolean zzc() {
        return this.zzg;
    }
}
