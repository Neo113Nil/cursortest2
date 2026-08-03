package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzhap<V> extends com.google.android.gms.internal.ads.zzhaq<V> {

    /* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
    final class zza {
        static final com.google.android.gms.internal.ads.zzhap.zza zza;
        static final com.google.android.gms.internal.ads.zzhap.zza zzb;
        final boolean zzc;
        final java.lang.Throwable zzd;

        static {
            if (com.google.android.gms.internal.ads.zzhaq.zzg) {
                zzb = null;
                zza = null;
            } else {
                zzb = new com.google.android.gms.internal.ads.zzhap.zza(false, null);
                zza = new com.google.android.gms.internal.ads.zzhap.zza(true, null);
            }
        }

        zza(boolean z, java.lang.Throwable th) {
            this.zzc = z;
            this.zzd = th;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
    final class zzb<V> implements java.lang.Runnable {
        final com.google.android.gms.internal.ads.zzhap<V> zza;
        final com.google.common.util.concurrent.ListenableFuture<? extends V> zzb;

        zzb(com.google.android.gms.internal.ads.zzhap zzhapVar, com.google.common.util.concurrent.ListenableFuture listenableFuture) {
            this.zza = zzhapVar;
            this.zzb = listenableFuture;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.zza.valueField != this) {
                return;
            }
            if (com.google.android.gms.internal.ads.zzhaq.zzr(this.zza, this, com.google.android.gms.internal.ads.zzhap.zze(this.zzb))) {
                com.google.android.gms.internal.ads.zzhap.zzw(this.zza, false);
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
    final class zzc {
        static final com.google.android.gms.internal.ads.zzhap.zzc zza = new com.google.android.gms.internal.ads.zzhap.zzc(new java.lang.Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.android.gms.internal.ads.zzhap.zzc.1
            {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final java.lang.Throwable fillInStackTrace() {
                return this;
            }
        });
        final java.lang.Throwable zzb;

        zzc(java.lang.Throwable th) {
            th.getClass();
            this.zzb = th;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
    final class zzd {
        static final com.google.android.gms.internal.ads.zzhap.zzd zza = new com.google.android.gms.internal.ads.zzhap.zzd();
        com.google.android.gms.internal.ads.zzhap.zzd next;
        final java.lang.Runnable zzb;
        final java.util.concurrent.Executor zzc;

        zzd() {
            this.zzb = null;
            this.zzc = null;
        }

        zzd(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
            this.zzb = runnable;
            this.zzc = executor;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
    interface zze<V> extends com.google.common.util.concurrent.ListenableFuture<V> {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
    abstract class zzf<V> extends com.google.android.gms.internal.ads.zzhap<V> implements com.google.android.gms.internal.ads.zzhap.zze<V> {
        zzf() {
        }
    }

    protected zzhap() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static java.lang.Object zze(com.google.common.util.concurrent.ListenableFuture listenableFuture) {
        java.lang.Throwable zzl;
        if (listenableFuture instanceof com.google.android.gms.internal.ads.zzhap.zze) {
            java.lang.Object obj = ((com.google.android.gms.internal.ads.zzhap) listenableFuture).valueField;
            if (obj instanceof com.google.android.gms.internal.ads.zzhap.zza) {
                com.google.android.gms.internal.ads.zzhap.zza zzaVar = (com.google.android.gms.internal.ads.zzhap.zza) obj;
                if (zzaVar.zzc) {
                    java.lang.Throwable th = zzaVar.zzd;
                    obj = th != null ? new com.google.android.gms.internal.ads.zzhap.zza(false, th) : com.google.android.gms.internal.ads.zzhap.zza.zzb;
                }
            }
            return java.util.Objects.requireNonNull(obj);
        }
        if ((listenableFuture instanceof com.google.android.gms.internal.ads.zzhcy) && (zzl = ((com.google.android.gms.internal.ads.zzhcy) listenableFuture).zzl()) != null) {
            return new com.google.android.gms.internal.ads.zzhap.zzc(zzl);
        }
        boolean isCancelled = listenableFuture.isCancelled();
        if ((!zzg) && isCancelled) {
            return java.util.Objects.requireNonNull(com.google.android.gms.internal.ads.zzhap.zza.zzb);
        }
        try {
            java.lang.Object zzf2 = zzf(listenableFuture);
            if (!isCancelled) {
                return zzf2 == null ? zze : zzf2;
            }
            java.lang.String valueOf = java.lang.String.valueOf(listenableFuture);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 84);
            sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
            sb.append(valueOf);
            return new com.google.android.gms.internal.ads.zzhap.zza(false, new java.lang.IllegalArgumentException(sb.toString()));
        } catch (java.lang.Error e) {
            e = e;
            return new com.google.android.gms.internal.ads.zzhap.zzc(e);
        } catch (java.util.concurrent.CancellationException e2) {
            if (isCancelled) {
                return new com.google.android.gms.internal.ads.zzhap.zza(false, e2);
            }
            java.lang.String valueOf2 = java.lang.String.valueOf(listenableFuture);
            java.lang.String.valueOf(valueOf2);
            return new com.google.android.gms.internal.ads.zzhap.zzc(new java.lang.IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(java.lang.String.valueOf(valueOf2)), e2));
        } catch (java.util.concurrent.ExecutionException e3) {
            if (!isCancelled) {
                return new com.google.android.gms.internal.ads.zzhap.zzc(e3.getCause());
            }
            java.lang.String valueOf3 = java.lang.String.valueOf(listenableFuture);
            java.lang.String.valueOf(valueOf3);
            return new com.google.android.gms.internal.ads.zzhap.zza(false, new java.lang.IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(java.lang.String.valueOf(valueOf3)), e3));
        } catch (java.lang.Exception e4) {
            e = e4;
            return new com.google.android.gms.internal.ads.zzhap.zzc(e);
        }
    }

    private static java.lang.Object zzf(java.util.concurrent.Future future) throws java.util.concurrent.ExecutionException {
        java.lang.Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (java.lang.InterruptedException unused) {
                z = true;
            } catch (java.lang.Throwable th) {
                if (z) {
                    java.lang.Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            java.lang.Thread.currentThread().interrupt();
        }
        return obj;
    }

    static java.lang.Object zzg(java.lang.Object obj) throws java.util.concurrent.ExecutionException {
        if (obj instanceof com.google.android.gms.internal.ads.zzhap.zza) {
            java.lang.Throwable th = ((com.google.android.gms.internal.ads.zzhap.zza) obj).zzd;
            java.util.concurrent.CancellationException cancellationException = new java.util.concurrent.CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof com.google.android.gms.internal.ads.zzhap.zzc) {
            throw new java.util.concurrent.ExecutionException(((com.google.android.gms.internal.ads.zzhap.zzc) obj).zzb);
        }
        if (obj == zze) {
            return null;
        }
        return obj;
    }

    static boolean zzh(java.lang.Object obj) {
        return !(obj instanceof com.google.android.gms.internal.ads.zzhap.zzb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzw(com.google.android.gms.internal.ads.zzhap zzhapVar, boolean z) {
        com.google.android.gms.internal.ads.zzhap.zzd zzdVar = null;
        while (true) {
            zzhapVar.zzs();
            if (z) {
                zzhapVar.zzi();
            }
            zzhapVar.zzc();
            com.google.android.gms.internal.ads.zzhap.zzd zzdVar2 = zzdVar;
            com.google.android.gms.internal.ads.zzhap.zzd zzq = zzhapVar.zzq(com.google.android.gms.internal.ads.zzhap.zzd.zza);
            com.google.android.gms.internal.ads.zzhap.zzd zzdVar3 = zzdVar2;
            while (zzq != null) {
                com.google.android.gms.internal.ads.zzhap.zzd zzdVar4 = zzq.next;
                zzq.next = zzdVar3;
                zzdVar3 = zzq;
                zzq = zzdVar4;
            }
            while (zzdVar3 != null) {
                java.lang.Runnable runnable = zzdVar3.zzb;
                zzdVar = zzdVar3.next;
                java.lang.Runnable runnable2 = (java.lang.Runnable) java.util.Objects.requireNonNull(runnable);
                if (runnable2 instanceof com.google.android.gms.internal.ads.zzhap.zzb) {
                    com.google.android.gms.internal.ads.zzhap.zzb zzbVar = (com.google.android.gms.internal.ads.zzhap.zzb) runnable2;
                    zzhapVar = zzbVar.zza;
                    if (zzhapVar.valueField == zzbVar && zzr(zzhapVar, zzbVar, zze(zzbVar.zzb))) {
                        break;
                    }
                } else {
                    zzy(runnable2, (java.util.concurrent.Executor) java.util.Objects.requireNonNull(zzdVar3.zzc));
                }
                zzdVar3 = zzdVar;
            }
            return;
            z = false;
        }
    }

    private final void zzx(java.lang.StringBuilder sb) {
        try {
            java.lang.Object zzf2 = zzf(this);
            sb.append("SUCCESS, result=[");
            if (zzf2 == null) {
                sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.NULL);
            } else if (zzf2 == this) {
                sb.append("this future");
            } else {
                sb.append(zzf2.getClass().getName());
                sb.append("@");
                sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(zzf2)));
            }
            sb.append(com.ironsource.X3.j.e);
        } catch (java.util.concurrent.CancellationException unused) {
            sb.append("CANCELLED");
        } catch (java.util.concurrent.ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append(com.ironsource.X3.j.e);
        } catch (java.lang.Exception e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        }
    }

    private static void zzy(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        try {
            executor.execute(runnable);
        } catch (java.lang.Exception e) {
            java.util.logging.Logger zza2 = zzf.zza();
            java.util.logging.Level level = java.util.logging.Level.SEVERE;
            java.lang.String valueOf = java.lang.String.valueOf(runnable);
            java.lang.String valueOf2 = java.lang.String.valueOf(executor);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 57 + java.lang.String.valueOf(valueOf2).length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(valueOf);
            sb.append(" with executor ");
            sb.append(valueOf2);
            zza2.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", sb.toString(), (java.lang.Throwable) e);
        }
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        com.google.android.gms.internal.ads.zzhap.zzd zzdVar;
        com.google.android.gms.internal.ads.zzgtj.zzk(runnable, "Runnable was null.");
        com.google.android.gms.internal.ads.zzgtj.zzk(executor, "Executor was null.");
        if (!isDone() && (zzdVar = this.listenersField) != com.google.android.gms.internal.ads.zzhap.zzd.zza) {
            com.google.android.gms.internal.ads.zzhap.zzd zzdVar2 = new com.google.android.gms.internal.ads.zzhap.zzd(runnable, executor);
            do {
                zzdVar2.next = zzdVar;
                if (zzp(zzdVar, zzdVar2)) {
                    return;
                } else {
                    zzdVar = this.listenersField;
                }
            } while (zzdVar != com.google.android.gms.internal.ads.zzhap.zzd.zza);
        }
        zzy(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        java.lang.Object requireNonNull;
        java.lang.Object obj = this.valueField;
        if (!(obj instanceof com.google.android.gms.internal.ads.zzhap.zzb) && !(obj == null)) {
            return false;
        }
        if (zzg) {
            requireNonNull = new com.google.android.gms.internal.ads.zzhap.zza(z, new java.util.concurrent.CancellationException("Future.cancel() was called."));
        } else {
            requireNonNull = java.util.Objects.requireNonNull(z ? com.google.android.gms.internal.ads.zzhap.zza.zza : com.google.android.gms.internal.ads.zzhap.zza.zzb);
        }
        boolean z2 = false;
        com.google.android.gms.internal.ads.zzhap<V> zzhapVar = this;
        while (true) {
            if (zzr(zzhapVar, obj, requireNonNull)) {
                zzw(zzhapVar, z);
                if (!(obj instanceof com.google.android.gms.internal.ads.zzhap.zzb)) {
                    break;
                }
                com.google.common.util.concurrent.ListenableFuture<? extends V> listenableFuture = ((com.google.android.gms.internal.ads.zzhap.zzb) obj).zzb;
                if (!(listenableFuture instanceof com.google.android.gms.internal.ads.zzhap.zze)) {
                    listenableFuture.cancel(z);
                    break;
                }
                zzhapVar = (com.google.android.gms.internal.ads.zzhap) listenableFuture;
                obj = zzhapVar.valueField;
                if (!(obj == null) && !(obj instanceof com.google.android.gms.internal.ads.zzhap.zzb)) {
                    break;
                }
                z2 = true;
            } else {
                obj = zzhapVar.valueField;
                if (zzh(obj)) {
                    return z2;
                }
            }
        }
        return true;
    }

    public final java.lang.Throwable exceptionNow() {
        java.lang.Object obj = this.valueField;
        if (obj instanceof com.google.android.gms.internal.ads.zzhap.zzc) {
            return ((com.google.android.gms.internal.ads.zzhap.zzc) obj).zzb;
        }
        if ((obj == null) || (obj instanceof com.google.android.gms.internal.ads.zzhap.zzb)) {
            throw new java.lang.IllegalStateException("Task has not completed");
        }
        if (obj instanceof com.google.android.gms.internal.ads.zzhap.zza) {
            throw new java.lang.IllegalStateException("Task was cancelled");
        }
        throw new java.lang.IllegalStateException("Task completed with a result");
    }

    @Override // java.util.concurrent.Future
    public java.lang.Object get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
        return zzu();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.valueField instanceof com.google.android.gms.internal.ads.zzhap.zza;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        java.lang.Object obj = this.valueField;
        return (obj != null) & zzh(obj);
    }

    public final java.lang.Object resultNow() {
        java.lang.Object obj = this.valueField;
        if ((obj instanceof com.google.android.gms.internal.ads.zzhap.zzb) || (obj == null)) {
            throw new java.lang.IllegalStateException("Task has not completed");
        }
        if (obj instanceof com.google.android.gms.internal.ads.zzhap.zzc) {
            throw new java.lang.IllegalStateException("Task completed with exception");
        }
        if (obj instanceof com.google.android.gms.internal.ads.zzhap.zza) {
            throw new java.lang.IllegalStateException("Task was cancelled");
        }
        if (obj == zze) {
            return null;
        }
        return obj;
    }

    public java.lang.String toString() {
        java.lang.String concat;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            zzx(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            java.lang.Object obj = this.valueField;
            if (obj instanceof com.google.android.gms.internal.ads.zzhap.zzb) {
                sb.append(", setFuture=[");
                com.google.common.util.concurrent.ListenableFuture<? extends V> listenableFuture = ((com.google.android.gms.internal.ads.zzhap.zzb) obj).zzb;
                try {
                    if (listenableFuture == this) {
                        sb.append("this future");
                    } else {
                        sb.append(listenableFuture);
                    }
                } catch (java.lang.Throwable th) {
                    com.google.android.gms.internal.ads.zzhco.zzb(th);
                    sb.append("Exception thrown from implementation: ");
                    sb.append(th.getClass());
                }
                sb.append(com.ironsource.X3.j.e);
            } else {
                try {
                    concat = com.google.android.gms.internal.ads.zzgua.zzb(zzd());
                } catch (java.lang.Throwable th2) {
                    com.google.android.gms.internal.ads.zzhco.zzb(th2);
                    java.lang.String valueOf = java.lang.String.valueOf(th2.getClass());
                    java.lang.String.valueOf(valueOf);
                    concat = "Exception thrown from implementation: ".concat(java.lang.String.valueOf(valueOf));
                }
                if (concat != null) {
                    sb.append(", info=[");
                    sb.append(concat);
                    sb.append(com.ironsource.X3.j.e);
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                zzx(sb);
            }
        }
        sb.append(com.ironsource.X3.j.e);
        return sb.toString();
    }

    protected boolean zza(java.lang.Object obj) {
        if (obj == null) {
            obj = zze;
        }
        if (!zzr(this, null, obj)) {
            return false;
        }
        zzw(this, false);
        return true;
    }

    protected boolean zzb(java.lang.Throwable th) {
        th.getClass();
        if (!zzr(this, null, new com.google.android.gms.internal.ads.zzhap.zzc(th))) {
            return false;
        }
        zzw(this, false);
        return true;
    }

    protected void zzc() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected java.lang.String zzd() {
        if (!(this instanceof java.util.concurrent.ScheduledFuture)) {
            return null;
        }
        long delay = ((java.util.concurrent.ScheduledFuture) this).getDelay(java.util.concurrent.TimeUnit.MILLISECONDS);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(delay).length() + 21);
        sb.append("remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }

    protected void zzi() {
    }

    protected final boolean zzj() {
        java.lang.Object obj = this.valueField;
        return (obj instanceof com.google.android.gms.internal.ads.zzhap.zza) && ((com.google.android.gms.internal.ads.zzhap.zza) obj).zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhcy
    protected final java.lang.Throwable zzl() {
        if (!(this instanceof com.google.android.gms.internal.ads.zzhap.zze)) {
            return null;
        }
        java.lang.Object obj = this.valueField;
        if (obj instanceof com.google.android.gms.internal.ads.zzhap.zzc) {
            return ((com.google.android.gms.internal.ads.zzhap.zzc) obj).zzb;
        }
        return null;
    }

    final void zzm(java.util.concurrent.Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(zzj());
        }
    }

    @Override // java.util.concurrent.Future
    public java.lang.Object get(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException, java.util.concurrent.ExecutionException {
        return zzt(j, timeUnit);
    }

    protected final boolean zzk(com.google.common.util.concurrent.ListenableFuture listenableFuture) {
        com.google.android.gms.internal.ads.zzhap.zzc zzcVar;
        listenableFuture.getClass();
        java.lang.Object obj = this.valueField;
        if (obj == null) {
            if (listenableFuture.isDone()) {
                if (!zzr(this, null, zze(listenableFuture))) {
                    return false;
                }
                zzw(this, false);
                return true;
            }
            com.google.android.gms.internal.ads.zzhap.zzb zzbVar = new com.google.android.gms.internal.ads.zzhap.zzb(this, listenableFuture);
            if (zzr(this, null, zzbVar)) {
                try {
                    listenableFuture.addListener(zzbVar, com.google.android.gms.internal.ads.zzhbl.INSTANCE);
                } catch (java.lang.Throwable th) {
                    try {
                        zzcVar = new com.google.android.gms.internal.ads.zzhap.zzc(th);
                    } catch (java.lang.Error | java.lang.Exception unused) {
                        zzcVar = com.google.android.gms.internal.ads.zzhap.zzc.zza;
                    }
                    zzr(this, zzbVar, zzcVar);
                }
                return true;
            }
            obj = this.valueField;
        }
        if (obj instanceof com.google.android.gms.internal.ads.zzhap.zza) {
            listenableFuture.cancel(((com.google.android.gms.internal.ads.zzhap.zza) obj).zzc);
        }
        return false;
    }
}
