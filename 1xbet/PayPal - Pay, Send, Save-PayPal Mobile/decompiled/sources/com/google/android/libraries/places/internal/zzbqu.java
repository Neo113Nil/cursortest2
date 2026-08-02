package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public class zzbqu extends com.google.android.libraries.places.internal.zzbix {
    private static final com.google.android.libraries.places.internal.zzbix zzj;

    @javax.annotation.Nullable
    private final java.util.concurrent.ScheduledFuture zza;
    private final java.util.concurrent.Executor zzb;
    private final com.google.android.libraries.places.internal.zzbjs zzc;
    private volatile boolean zzd;
    private com.google.android.libraries.places.internal.zzbiw zze;
    private com.google.android.libraries.places.internal.zzbix zzf;
    private com.google.android.libraries.places.internal.zzbnp zzg;
    private java.util.List zzh = new java.util.ArrayList();
    private com.google.android.libraries.places.internal.zzbqt zzi;

    static {
        java.util.logging.Logger.getLogger(com.google.android.libraries.places.internal.zzbqu.class.getName());
        zzj = new com.google.android.libraries.places.internal.zzbqn();
    }

    protected zzbqu(java.util.concurrent.Executor executor, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, @javax.annotation.Nullable com.google.android.libraries.places.internal.zzbjv zzbjvVar) {
        java.util.concurrent.ScheduledFuture<?> scheduledFuture;
        this.zzb = (java.util.concurrent.Executor) com.google.common.base.Preconditions.checkNotNull(executor, "callExecutor");
        com.google.common.base.Preconditions.checkNotNull(scheduledExecutorService, "scheduler");
        this.zzc = com.google.android.libraries.places.internal.zzbjs.zza();
        if (zzbjvVar != null) {
            long zzc = zzbjvVar.zzc(java.util.concurrent.TimeUnit.NANOSECONDS);
            scheduledFuture = scheduledExecutorService.schedule(new com.google.android.libraries.places.internal.zzbqg(this, zzc, "CallOptions"), zzc, java.util.concurrent.TimeUnit.NANOSECONDS);
        } else {
            scheduledFuture = null;
        }
        this.zza = scheduledFuture;
    }

    private final void zzl(com.google.android.libraries.places.internal.zzbnp zzbnpVar, boolean z) {
        com.google.android.libraries.places.internal.zzbiw zzbiwVar;
        boolean z2;
        synchronized (this) {
            if (this.zzf == null) {
                zzo(zzj);
                zzbiwVar = this.zze;
                this.zzg = zzbnpVar;
                z2 = false;
            } else {
                if (z) {
                    return;
                }
                zzbiwVar = null;
                z2 = true;
            }
            if (z2) {
                zzm(new com.google.android.libraries.places.internal.zzbqj(this, zzbnpVar));
            } else {
                if (zzbiwVar != null) {
                    this.zzb.execute(new com.google.android.libraries.places.internal.zzbqo(this, zzbiwVar, zzbnpVar));
                }
                zzi();
            }
            zzg();
        }
    }

    private final void zzm(java.lang.Runnable runnable) {
        synchronized (this) {
            if (this.zzd) {
                runnable.run();
            } else {
                this.zzh.add(runnable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        if (r0.hasNext() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* renamed from: zzn, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzi() {
        com.google.android.libraries.places.internal.zzbqt zzbqtVar;
        java.util.List list;
        java.util.List arrayList = new java.util.ArrayList();
        while (true) {
            synchronized (this) {
                if (this.zzh.isEmpty()) {
                    break;
                }
                list = this.zzh;
                this.zzh = arrayList;
            }
            if (zzbqtVar == null) {
                this.zzb.execute(new com.google.android.libraries.places.internal.zzbqh(this, zzbqtVar));
                return;
            }
            return;
            list.clear();
            arrayList = list;
        }
        this.zzh = null;
        this.zzd = true;
        zzbqtVar = this.zzi;
        if (zzbqtVar == null) {
        }
    }

    private final void zzo(com.google.android.libraries.places.internal.zzbix zzbixVar) {
        com.google.android.libraries.places.internal.zzbix zzbixVar2 = this.zzf;
        com.google.common.base.Preconditions.checkState(zzbixVar2 == null, "realCall already set to %s", zzbixVar2);
        java.util.concurrent.ScheduledFuture scheduledFuture = this.zza;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zzf = zzbixVar;
    }

    public final java.lang.String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).add("realCall", this.zzf).toString();
    }

    @Override // com.google.android.libraries.places.internal.zzbix
    public final void zza(com.google.android.libraries.places.internal.zzbiw zzbiwVar, com.google.android.libraries.places.internal.zzbmg zzbmgVar) {
        com.google.android.libraries.places.internal.zzbnp zzbnpVar;
        boolean z;
        com.google.common.base.Preconditions.checkState(this.zze == null, "already started");
        synchronized (this) {
            this.zze = (com.google.android.libraries.places.internal.zzbiw) com.google.common.base.Preconditions.checkNotNull(zzbiwVar, com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            zzbnpVar = this.zzg;
            z = this.zzd;
            if (!z) {
                com.google.android.libraries.places.internal.zzbqt zzbqtVar = new com.google.android.libraries.places.internal.zzbqt(zzbiwVar);
                this.zzi = zzbqtVar;
                zzbiwVar = zzbqtVar;
            }
        }
        if (zzbnpVar != null) {
            this.zzb.execute(new com.google.android.libraries.places.internal.zzbqo(this, zzbiwVar, zzbnpVar));
        } else if (z) {
            this.zzf.zza(zzbiwVar, zzbmgVar);
        } else {
            zzm(new com.google.android.libraries.places.internal.zzbqi(this, zzbiwVar, zzbmgVar));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbix
    public final void zzb(java.lang.Object obj) {
        if (this.zzd) {
            this.zzf.zzb(obj);
        } else {
            zzm(new com.google.android.libraries.places.internal.zzbqk(this, obj));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbix
    public final void zzc(int i) {
        if (this.zzd) {
            this.zzf.zzc(i);
        } else {
            zzm(new com.google.android.libraries.places.internal.zzbql(this, i));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbix
    public final void zzd() {
        zzm(new com.google.android.libraries.places.internal.zzbqm(this));
    }

    @Override // com.google.android.libraries.places.internal.zzbix
    public final void zze(@javax.annotation.Nullable java.lang.String str, @javax.annotation.Nullable java.lang.Throwable th) {
        com.google.android.libraries.places.internal.zzbnp zzbnpVar = com.google.android.libraries.places.internal.zzbnp.zzb;
        com.google.android.libraries.places.internal.zzbnp zze = str != null ? zzbnpVar.zze(str) : zzbnpVar.zze("Call cancelled without message");
        if (th != null) {
            zze = zze.zzd(th);
        }
        zzl(zze, false);
    }

    public final java.lang.Runnable zzf(com.google.android.libraries.places.internal.zzbix zzbixVar) {
        synchronized (this) {
            if (this.zzf != null) {
                return null;
            }
            zzo((com.google.android.libraries.places.internal.zzbix) com.google.common.base.Preconditions.checkNotNull(zzbixVar, androidx.core.app.NotificationCompat.CATEGORY_CALL));
            return new com.google.android.libraries.places.internal.zzbqf(this, this.zzc);
        }
    }

    protected void zzg() {
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbix zzk() {
        return this.zzf;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbjs zzj() {
        return this.zzc;
    }

    final /* synthetic */ void zzh(com.google.android.libraries.places.internal.zzbnp zzbnpVar, boolean z) {
        zzl(zzbnpVar, true);
    }
}
