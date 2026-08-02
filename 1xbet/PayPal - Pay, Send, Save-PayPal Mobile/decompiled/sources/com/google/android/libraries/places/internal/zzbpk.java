package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbpk extends com.google.android.libraries.places.internal.zzbix {
    private static final java.util.logging.Logger zza = java.util.logging.Logger.getLogger(com.google.android.libraries.places.internal.zzbpk.class.getName());
    private static final double zzb;
    private final com.google.android.libraries.places.internal.zzbml zzc;
    private final java.util.concurrent.Executor zzd;
    private final boolean zze;
    private final com.google.android.libraries.places.internal.zzbpb zzf;
    private final com.google.android.libraries.places.internal.zzbjs zzg;
    private com.google.android.libraries.places.internal.zzbpe zzh;
    private final boolean zzi;
    private com.google.android.libraries.places.internal.zzbis zzj;
    private com.google.android.libraries.places.internal.zzbpl zzk;
    private boolean zzl;
    private boolean zzm;
    private final java.util.concurrent.ScheduledExecutorService zzn;
    private com.google.android.libraries.places.internal.zzbjy zzo = com.google.android.libraries.places.internal.zzbjy.zza();
    private final com.google.android.libraries.places.internal.zzbur zzp;

    static {
        java.nio.charset.Charset.forName("US-ASCII");
        zzb = java.util.concurrent.TimeUnit.SECONDS.toNanos(1L);
    }

    zzbpk(com.google.android.libraries.places.internal.zzbml zzbmlVar, java.util.concurrent.Executor executor, com.google.android.libraries.places.internal.zzbis zzbisVar, com.google.android.libraries.places.internal.zzbur zzburVar, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.android.libraries.places.internal.zzbpb zzbpbVar, @javax.annotation.Nullable com.google.android.libraries.places.internal.zzbkq zzbkqVar) {
        this.zzc = zzbmlVar;
        zzbmlVar.zzb();
        boolean z = true;
        if (executor == com.google.common.util.concurrent.MoreExecutors.directExecutor()) {
            this.zzd = new com.google.android.libraries.places.internal.zzbzm();
            this.zze = true;
        } else {
            this.zzd = new com.google.android.libraries.places.internal.zzbzq(executor);
            this.zze = false;
        }
        this.zzf = zzbpbVar;
        this.zzg = com.google.android.libraries.places.internal.zzbjs.zza();
        if (zzbmlVar.zza() != com.google.android.libraries.places.internal.zzbmj.UNARY && zzbmlVar.zza() != com.google.android.libraries.places.internal.zzbmj.SERVER_STREAMING) {
            z = false;
        }
        this.zzi = z;
        this.zzj = zzbisVar;
        this.zzp = zzburVar;
        this.zzn = scheduledExecutorService;
    }

    static final /* synthetic */ void zzq(com.google.android.libraries.places.internal.zzbiw zzbiwVar, com.google.android.libraries.places.internal.zzbnp zzbnpVar, com.google.android.libraries.places.internal.zzbmg zzbmgVar) {
        try {
            zzbiwVar.zzc(zzbnpVar, zzbmgVar);
        } catch (java.lang.RuntimeException e) {
            zza.logp(java.util.logging.Level.WARNING, "io.grpc.internal.ClientCallImpl", "closeObserver", "Exception thrown by onClose() in ClientCall", (java.lang.Throwable) e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @javax.annotation.Nullable
    /* renamed from: zzr, reason: merged with bridge method [inline-methods] */
    public final com.google.android.libraries.places.internal.zzbjv zzg() {
        com.google.android.libraries.places.internal.zzbjv zzb2 = this.zzj.zzb();
        if (zzb2 == null) {
            return null;
        }
        return zzb2;
    }

    private final void zzs(java.lang.Object obj) {
        com.google.common.base.Preconditions.checkState(this.zzk != null, "Not started");
        com.google.common.base.Preconditions.checkState(!this.zzl, "call was cancelled");
        com.google.common.base.Preconditions.checkState(!this.zzm, "call was half-closed");
        try {
            com.google.android.libraries.places.internal.zzbpl zzbplVar = this.zzk;
            if (zzbplVar instanceof com.google.android.libraries.places.internal.zzbzf) {
                ((com.google.android.libraries.places.internal.zzbzf) zzbplVar).zzi(obj);
            } else {
                zzbplVar.zzt(this.zzc.zze(obj));
            }
            if (this.zzi) {
                return;
            }
            this.zzk.zzu();
        } catch (java.lang.Error e) {
            this.zzk.zzl(com.google.android.libraries.places.internal.zzbnp.zzb.zze("Client sendMessage() failed with Error"));
            throw e;
        } catch (java.lang.RuntimeException e2) {
            this.zzk.zzl(com.google.android.libraries.places.internal.zzbnp.zzb.zzd(e2).zze("Failed to stream message"));
        }
    }

    public final java.lang.String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).add("method", this.zzc).toString();
    }

    @Override // com.google.android.libraries.places.internal.zzbix
    public final void zza(com.google.android.libraries.places.internal.zzbiw zzbiwVar, com.google.android.libraries.places.internal.zzbmg zzbmgVar) {
        com.google.android.libraries.places.internal.zzbpl zzbuqVar;
        com.google.common.base.Preconditions.checkState(this.zzk == null, "Already started");
        com.google.common.base.Preconditions.checkState(!this.zzl, "call was cancelled");
        com.google.common.base.Preconditions.checkNotNull(zzbiwVar, "observer");
        com.google.common.base.Preconditions.checkNotNull(zzbmgVar, "headers");
        com.google.android.libraries.places.internal.zzbjs zzbjsVar = this.zzg;
        com.google.android.libraries.places.internal.zzbis zzbisVar = this.zzj;
        com.google.android.libraries.places.internal.zzbir zzbirVar = com.google.android.libraries.places.internal.zzbvz.zza;
        com.google.android.libraries.places.internal.zzbvz zzbvzVar = (com.google.android.libraries.places.internal.zzbvz) zzbisVar.zzi(zzbirVar);
        if (zzbvzVar != null) {
            java.lang.Long l = zzbvzVar.zzb;
            if (l != null) {
                com.google.android.libraries.places.internal.zzbjv zza2 = com.google.android.libraries.places.internal.zzbjv.zza(l.longValue(), java.util.concurrent.TimeUnit.NANOSECONDS);
                com.google.android.libraries.places.internal.zzbjv zzb2 = this.zzj.zzb();
                if (zzb2 == null || zza2.compareTo(zzb2) < 0) {
                    this.zzj = this.zzj.zza(zza2);
                }
            }
            java.lang.Boolean bool = zzbvzVar.zzc;
            if (bool != null) {
                this.zzj = bool.booleanValue() ? this.zzj.zzc() : this.zzj.zzd();
            }
            java.lang.Integer num = zzbvzVar.zzd;
            if (num != null) {
                java.lang.Integer zzn = this.zzj.zzn();
                if (zzn != null) {
                    this.zzj = this.zzj.zzl(java.lang.Math.min(zzn.intValue(), num.intValue()));
                } else {
                    this.zzj = this.zzj.zzl(num.intValue());
                }
            }
            java.lang.Integer num2 = zzbvzVar.zze;
            if (num2 != null) {
                java.lang.Integer zzo = this.zzj.zzo();
                if (zzo != null) {
                    this.zzj = this.zzj.zzm(java.lang.Math.min(zzo.intValue(), num2.intValue()));
                } else {
                    this.zzj = this.zzj.zzm(num2.intValue());
                }
            }
        }
        com.google.android.libraries.places.internal.zzbji zzbjiVar = com.google.android.libraries.places.internal.zzbjh.zza;
        com.google.android.libraries.places.internal.zzbjy zzbjyVar = this.zzo;
        zzbmgVar.zzd(com.google.android.libraries.places.internal.zzbsz.zzf);
        zzbmgVar.zzd(com.google.android.libraries.places.internal.zzbsz.zzb);
        com.google.android.libraries.places.internal.zzbmc zzbmcVar = com.google.android.libraries.places.internal.zzbsz.zzc;
        zzbmgVar.zzd(zzbmcVar);
        byte[] zza3 = com.google.android.libraries.places.internal.zzbks.zza(zzbjyVar);
        if (zza3.length != 0) {
            zzbmgVar.zzc(zzbmcVar, zza3);
        }
        zzbmgVar.zzd(com.google.android.libraries.places.internal.zzbsz.zzd);
        zzbmgVar.zzd(com.google.android.libraries.places.internal.zzbsz.zze);
        com.google.android.libraries.places.internal.zzbjv zzg = zzg();
        boolean z = zzg != null && zzg.equals(null);
        com.google.android.libraries.places.internal.zzbpe zzbpeVar = new com.google.android.libraries.places.internal.zzbpe(this, zzg, z);
        this.zzh = zzbpeVar;
        if (zzg == null || zzbpeVar.zzd() > 0) {
            com.google.android.libraries.places.internal.zzbur zzburVar = this.zzp;
            com.google.android.libraries.places.internal.zzbml zzbmlVar = this.zzc;
            com.google.android.libraries.places.internal.zzbis zzbisVar2 = this.zzj;
            com.google.android.libraries.places.internal.zzbvr zzbvrVar = zzburVar.zzb;
            if (zzbvrVar.zzah()) {
                com.google.android.libraries.places.internal.zzbvz zzbvzVar2 = (com.google.android.libraries.places.internal.zzbvz) zzbisVar2.zzi(zzbirVar);
                zzbuqVar = new com.google.android.libraries.places.internal.zzbuq(zzburVar, zzbmlVar, zzbmgVar, zzbisVar2, zzbvzVar2 == null ? null : zzbvzVar2.zzf, zzbvzVar2 != null ? zzbvzVar2.zzg : null, zzbjsVar);
            } else {
                com.google.android.libraries.places.internal.zzbje[] zzf = com.google.android.libraries.places.internal.zzbsz.zzf(zzbisVar2, zzbmgVar, 0, false, false);
                com.google.android.libraries.places.internal.zzbjs zzb3 = zzbjsVar.zzb();
                try {
                    zzbuqVar = zzbvrVar.zzL().zzb(zzbmlVar, zzbmgVar, zzbisVar2, zzf);
                } finally {
                    zzbjsVar.zzc(zzb3);
                }
            }
            this.zzk = zzbuqVar;
        } else {
            com.google.android.libraries.places.internal.zzbje[] zzf2 = com.google.android.libraries.places.internal.zzbsz.zzf(this.zzj, zzbmgVar, 0, false, false);
            java.lang.String str = true != z ? "CallOptions" : "Context";
            java.lang.Long l2 = (java.lang.Long) this.zzj.zzi(com.google.android.libraries.places.internal.zzbje.zza);
            double zzd = this.zzh.zzd();
            double d = zzb;
            this.zzk = new com.google.android.libraries.places.internal.zzbsi(com.google.android.libraries.places.internal.zzbnp.zzd.zze(java.lang.String.format("ClientCall started after %s deadline was exceeded %.9f seconds ago. Name resolution delay %.9f seconds.", str, java.lang.Double.valueOf(zzd / d), java.lang.Double.valueOf(l2 == null ? 0.0d : l2.longValue() / d))), com.google.android.libraries.places.internal.zzbpm.PROCESSED, zzf2);
        }
        if (this.zze) {
            this.zzk.zzr();
        }
        if (this.zzj.zzn() != null) {
            this.zzk.zzc(this.zzj.zzn().intValue());
        }
        if (this.zzj.zzo() != null) {
            this.zzk.zzb(this.zzj.zzo().intValue());
        }
        if (zzg != null) {
            this.zzk.zza(zzg);
        }
        this.zzk.zzv(zzbjiVar);
        this.zzk.zzd(this.zzo);
        this.zzf.zza();
        this.zzk.zzf(new com.google.android.libraries.places.internal.zzbpj(this, zzbiwVar));
        this.zzh.zza();
    }

    @Override // com.google.android.libraries.places.internal.zzbix
    public final void zzc(int i) {
        com.google.common.base.Preconditions.checkState(this.zzk != null, "Not started");
        com.google.common.base.Preconditions.checkArgument(true, "Number requested must be non-negative");
        this.zzk.zzs(i);
    }

    @Override // com.google.android.libraries.places.internal.zzbix
    public final void zzd() {
        com.google.common.base.Preconditions.checkState(this.zzk != null, "Not started");
        com.google.common.base.Preconditions.checkState(!this.zzl, "call was cancelled");
        com.google.common.base.Preconditions.checkState(!this.zzm, "call already half-closed");
        this.zzm = true;
        this.zzk.zzk();
    }

    @Override // com.google.android.libraries.places.internal.zzbix
    public final void zzb(java.lang.Object obj) {
        zzs(obj);
    }

    @Override // com.google.android.libraries.places.internal.zzbix
    public final void zze(@javax.annotation.Nullable java.lang.String str, @javax.annotation.Nullable java.lang.Throwable th) {
        if (str == null && th == null) {
            th = new java.util.concurrent.CancellationException("Cancelled without a message or cause");
            zza.logp(java.util.logging.Level.WARNING, "io.grpc.internal.ClientCallImpl", "cancelInternal", "Cancelling without a message or cause is suboptimal", th);
        }
        if (this.zzl) {
            return;
        }
        this.zzl = true;
        try {
            if (this.zzk != null) {
                com.google.android.libraries.places.internal.zzbnp zzbnpVar = com.google.android.libraries.places.internal.zzbnp.zzb;
                com.google.android.libraries.places.internal.zzbnp zze = str != null ? zzbnpVar.zze(str) : zzbnpVar.zze("Call cancelled without message");
                if (th != null) {
                    zze = zze.zzd(th);
                }
                this.zzk.zzl(zze);
            }
        } finally {
            com.google.android.libraries.places.internal.zzbpe zzbpeVar = this.zzh;
            if (zzbpeVar != null) {
                zzbpeVar.zzb();
            }
        }
    }

    final /* synthetic */ java.util.concurrent.ScheduledExecutorService zzp() {
        return this.zzn;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbpl zzo() {
        return this.zzk;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbis zzn() {
        return this.zzj;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbpe zzm() {
        return this.zzh;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbjs zzl() {
        return this.zzg;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbpb zzk() {
        return this.zzf;
    }

    final /* synthetic */ java.util.concurrent.Executor zzj() {
        return this.zzd;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbml zzi() {
        return this.zzc;
    }

    final com.google.android.libraries.places.internal.zzbpk zzf(com.google.android.libraries.places.internal.zzbjy zzbjyVar) {
        this.zzo = zzbjyVar;
        return this;
    }
}
