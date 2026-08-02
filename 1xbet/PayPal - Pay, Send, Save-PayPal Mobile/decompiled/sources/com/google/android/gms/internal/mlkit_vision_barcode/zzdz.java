package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
public abstract class zzdz<V> extends com.google.android.gms.internal.mlkit_vision_barcode.zzex implements com.google.android.gms.internal.mlkit_vision_barcode.zzet<V> {
    static final boolean zza;
    static final com.google.android.gms.internal.mlkit_vision_barcode.zzes zzb;
    private static final com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza zzc;
    private static final java.lang.Object zzd;

    @javax.annotation.CheckForNull
    volatile com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzd listeners;

    @javax.annotation.CheckForNull
    volatile java.lang.Object value;

    @javax.annotation.CheckForNull
    volatile com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzj waiters;

    final class zzc {
        static final com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzc zza = new com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzc(new java.lang.Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzc.1
            {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final java.lang.Throwable fillInStackTrace() {
                synchronized (this) {
                }
                return this;
            }
        });
        final java.lang.Throwable zzb;

        zzc(java.lang.Throwable th) {
            th.getClass();
            this.zzb = th;
        }
    }

    interface zzh<V> extends com.google.android.gms.internal.mlkit_vision_barcode.zzet<V> {
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        boolean z;
        java.lang.Throwable th;
        java.lang.Throwable th2;
        com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza zzgVar;
        try {
            z = java.lang.Boolean.parseBoolean(java.lang.System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (java.lang.SecurityException unused) {
            z = false;
        }
        zza = z;
        zzb = new com.google.android.gms.internal.mlkit_vision_barcode.zzes(com.google.android.gms.internal.mlkit_vision_barcode.zzdz.class);
        java.lang.Object[] objArr = 0;
        try {
            zzgVar = new com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzi(null);
            th2 = null;
            th = null;
        } catch (java.lang.Error | java.lang.Exception e) {
            try {
                th2 = e;
                zzgVar = new com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zze(java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzj.class, java.lang.Thread.class, com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.THREAD_NAME), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzj.class, com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzj.class, io.ktor.http.LinkHeader.Rel.Next), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.android.gms.internal.mlkit_vision_barcode.zzdz.class, com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzj.class, "waiters"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.android.gms.internal.mlkit_vision_barcode.zzdz.class, com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzd.class, "listeners"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.android.gms.internal.mlkit_vision_barcode.zzdz.class, java.lang.Object.class, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE));
                th = null;
            } catch (java.lang.Error | java.lang.Exception e2) {
                th = e2;
                th2 = e;
                zzgVar = new com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzg(objArr == true ? 1 : 0);
            }
        }
        zzc = zzgVar;
        if (th != null) {
            com.google.android.gms.internal.mlkit_vision_barcode.zzes zzesVar = zzb;
            zzesVar.zza().logp(java.util.logging.Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            zzesVar.zza().logp(java.util.logging.Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        zzd = new java.lang.Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static java.lang.Object zzq(com.google.android.gms.internal.mlkit_vision_barcode.zzet zzetVar) {
        java.lang.Throwable zzg2;
        if (zzetVar instanceof com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzh) {
            java.lang.Object obj = ((com.google.android.gms.internal.mlkit_vision_barcode.zzdz) zzetVar).value;
            if (obj instanceof com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzb) {
                com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzb zzbVar = (com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzb) obj;
                if (zzbVar.zzc) {
                    java.lang.Throwable th = zzbVar.zzd;
                    obj = th != null ? new com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzb(false, th) : com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzb.zzb;
                }
            }
            return java.util.Objects.requireNonNull(obj);
        }
        if ((zzetVar instanceof com.google.android.gms.internal.mlkit_vision_barcode.zzex) && (zzg2 = ((com.google.android.gms.internal.mlkit_vision_barcode.zzex) zzetVar).zzg()) != null) {
            return new com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzc(zzg2);
        }
        boolean isCancelled = zzetVar.isCancelled();
        if ((!zza) && isCancelled) {
            return java.util.Objects.requireNonNull(com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzb.zzb);
        }
        try {
            java.lang.Object zzr = zzr(zzetVar);
            if (!isCancelled) {
                return zzr == null ? zzd : zzr;
            }
            return new com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzb(false, new java.lang.IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + java.lang.String.valueOf(zzetVar)));
        } catch (java.lang.Error e) {
            e = e;
            return new com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzc(e);
        } catch (java.util.concurrent.CancellationException e2) {
            return !isCancelled ? new com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzc(new java.lang.IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(zzetVar))), e2)) : new com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzb(false, e2);
        } catch (java.util.concurrent.ExecutionException e3) {
            return isCancelled ? new com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzb(false, new java.lang.IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(zzetVar))), e3)) : new com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzc(e3.getCause());
        } catch (java.lang.Exception e4) {
            e = e4;
            return new com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzc(e);
        }
    }

    private static java.lang.Object zzr(java.util.concurrent.Future future) throws java.util.concurrent.ExecutionException {
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

    private final void zzs(java.lang.StringBuilder sb) {
        try {
            java.lang.Object zzr = zzr(this);
            sb.append("SUCCESS, result=[");
            if (zzr == null) {
                sb.append("null");
            } else if (zzr == this) {
                sb.append("this future");
            } else {
                sb.append(zzr.getClass().getName());
                sb.append("@");
                sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(zzr)));
            }
            sb.append("]");
        } catch (java.util.concurrent.CancellationException unused) {
            sb.append(com.paypal.oslo.downloads.impl.DownloadStateValue.CANCELLED);
        } catch (java.util.concurrent.ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append("]");
        } catch (java.lang.Exception e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        }
    }

    private final void zzt(java.lang.StringBuilder sb) {
        java.lang.String concat;
        int length = sb.length();
        sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS);
        java.lang.Object obj = this.value;
        if (obj instanceof com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzf) {
            sb.append(", setFuture=[");
            zzu(sb, ((com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzf) obj).zzb);
            sb.append("]");
        } else {
            try {
                concat = com.google.android.gms.internal.mlkit_vision_barcode.zzba.zza(zzf());
            } catch (java.lang.Exception | java.lang.StackOverflowError e) {
                concat = "Exception thrown from implementation: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(e.getClass())));
            }
            if (concat != null) {
                sb.append(", info=[");
                sb.append(concat);
                sb.append("]");
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            zzs(sb);
        }
    }

    private final void zzu(java.lang.StringBuilder sb, @javax.annotation.CheckForNull java.lang.Object obj) {
        try {
            if (obj == this) {
                sb.append("this future");
            } else {
                sb.append(obj);
            }
        } catch (java.lang.Exception | java.lang.StackOverflowError e) {
            sb.append("Exception thrown from implementation: ");
            sb.append(e.getClass());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzv(com.google.android.gms.internal.mlkit_vision_barcode.zzdz zzdzVar, boolean z) {
        com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzd zzdVar;
        com.google.android.gms.internal.mlkit_vision_barcode.zzdz<V> zzdzVar2;
        com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzd zzdVar2 = null;
        while (true) {
            for (com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzj zzb2 = zzc.zzb(zzdzVar, com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzj.zza); zzb2 != null; zzb2 = zzb2.next) {
                java.lang.Thread thread = zzb2.thread;
                if (thread != null) {
                    zzb2.thread = null;
                    java.util.concurrent.locks.LockSupport.unpark(thread);
                }
            }
            zzdzVar.zzm();
            com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzd zza2 = zzc.zza(zzdzVar, com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzd.zza);
            while (zza2 != null) {
                com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzd zzdVar3 = zza2.next;
                zza2.next = zzdVar2;
                zzdVar2 = zza2;
                zza2 = zzdVar3;
            }
            while (zzdVar2 != null) {
                java.lang.Runnable runnable = zzdVar2.zzb;
                zzdVar = zzdVar2.next;
                java.lang.Runnable runnable2 = (java.lang.Runnable) java.util.Objects.requireNonNull(runnable);
                if (runnable2 instanceof com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzf) {
                    com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzf zzfVar = (com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzf) runnable2;
                    zzdzVar2 = zzfVar.zza;
                    if (zzdzVar2.value == zzfVar) {
                        if (zzc.zzf(zzdzVar2, zzfVar, zzq(zzfVar.zzb))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    zzw(runnable2, (java.util.concurrent.Executor) java.util.Objects.requireNonNull(zzdVar2.zzc));
                }
                zzdVar2 = zzdVar;
            }
            return;
            zzdzVar = zzdzVar2;
            zzdVar2 = zzdVar;
        }
    }

    private static void zzw(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        try {
            executor.execute(runnable);
        } catch (java.lang.Exception e) {
            zzb.zza().logp(java.util.logging.Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + java.lang.String.valueOf(runnable) + " with executor " + java.lang.String.valueOf(executor), (java.lang.Throwable) e);
        }
    }

    private final void zzx(com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzj zzjVar) {
        zzjVar.thread = null;
        while (true) {
            com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzj zzjVar2 = this.waiters;
            if (zzjVar2 != com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzj.zza) {
                com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzj zzjVar3 = null;
                while (zzjVar2 != null) {
                    com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzj zzjVar4 = zzjVar2.next;
                    if (zzjVar2.thread != null) {
                        zzjVar3 = zzjVar2;
                    } else if (zzjVar3 != null) {
                        zzjVar3.next = zzjVar4;
                        if (zzjVar3.thread == null) {
                            break;
                        }
                    } else if (!zzc.zzg(this, zzjVar2, zzjVar4)) {
                        break;
                    }
                    zzjVar2 = zzjVar4;
                }
                return;
            }
            return;
        }
    }

    private static final java.lang.Object zzy(java.lang.Object obj) throws java.util.concurrent.ExecutionException {
        if (obj instanceof com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzb) {
            java.lang.Throwable th = ((com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzb) obj).zzd;
            java.util.concurrent.CancellationException cancellationException = new java.util.concurrent.CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzc) {
            throw new java.util.concurrent.ExecutionException(((com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzc) obj).zzb);
        }
        if (obj == zzd) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0058, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean cancel(boolean z) {
        java.lang.Object requireNonNull;
        java.lang.Object obj = this.value;
        if (!(obj instanceof com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzf) && !(obj == null)) {
            return false;
        }
        if (zza) {
            requireNonNull = new com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzb(z, new java.util.concurrent.CancellationException("Future.cancel() was called."));
        } else {
            requireNonNull = java.util.Objects.requireNonNull(z ? com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzb.zza : com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzb.zzb);
        }
        com.google.android.gms.internal.mlkit_vision_barcode.zzdz<V> zzdzVar = this;
        boolean z2 = false;
        while (true) {
            if (zzc.zzf(zzdzVar, obj, requireNonNull)) {
                zzv(zzdzVar, z);
                if (!(obj instanceof com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzf)) {
                    break;
                }
                com.google.android.gms.internal.mlkit_vision_barcode.zzet<? extends V> zzetVar = ((com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzf) obj).zzb;
                if (!(zzetVar instanceof com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzh)) {
                    zzetVar.cancel(z);
                    break;
                }
                zzdzVar = (com.google.android.gms.internal.mlkit_vision_barcode.zzdz) zzetVar;
                obj = zzdzVar.value;
                if (!(obj == null) && !(obj instanceof com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzf)) {
                    return true;
                }
                z2 = true;
            } else {
                obj = zzdzVar.value;
                if (!(obj instanceof com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzf)) {
                    return z2;
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
        java.lang.Object obj;
        if (java.lang.Thread.interrupted()) {
            throw new java.lang.InterruptedException();
        }
        java.lang.Object obj2 = this.value;
        if ((obj2 != null) && (!(obj2 instanceof com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzf))) {
            return zzy(obj2);
        }
        com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzj zzjVar = this.waiters;
        if (zzjVar != com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzj.zza) {
            com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzj zzjVar2 = new com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzj();
            do {
                com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza zzaVar = zzc;
                zzaVar.zzc(zzjVar2, zzjVar);
                if (zzaVar.zzg(this, zzjVar, zzjVar2)) {
                    do {
                        java.util.concurrent.locks.LockSupport.park(this);
                        if (java.lang.Thread.interrupted()) {
                            zzx(zzjVar2);
                            throw new java.lang.InterruptedException();
                        }
                        obj = this.value;
                    } while (!((obj != null) & (!(obj instanceof com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzf))));
                    return zzy(obj);
                }
                zzjVar = this.waiters;
            } while (zzjVar != com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzj.zza);
        }
        return zzy(java.util.Objects.requireNonNull(this.value));
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb.append("[status=");
        if (this.value instanceof com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzb) {
            sb.append(com.paypal.oslo.downloads.impl.DownloadStateValue.CANCELLED);
        } else if (isDone()) {
            zzs(sb);
        } else {
            zzt(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @javax.annotation.CheckForNull
    protected java.lang.String zzf() {
        if (!(this instanceof java.util.concurrent.ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((java.util.concurrent.ScheduledFuture) this).getDelay(java.util.concurrent.TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzex
    @javax.annotation.CheckForNull
    protected final java.lang.Throwable zzg() {
        if (!(this instanceof com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzh)) {
            return null;
        }
        java.lang.Object obj = this.value;
        if (obj instanceof com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzc) {
            return ((com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzc) obj).zzb;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzet
    public final void zzl(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzd zzdVar;
        com.google.android.gms.internal.mlkit_vision_barcode.zzaz.zzc(executor, "Executor was null.");
        if (!isDone() && (zzdVar = this.listeners) != com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzd.zza) {
            com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzd zzdVar2 = new com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzd(runnable, executor);
            do {
                zzdVar2.next = zzdVar;
                if (zzc.zze(this, zzdVar, zzdVar2)) {
                    return;
                } else {
                    zzdVar = this.listeners;
                }
            } while (zzdVar != com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzd.zza);
        }
        zzw(runnable, executor);
    }

    protected void zzm() {
    }

    protected final boolean zzn(java.lang.Throwable th) {
        if (!zzc.zzf(this, null, new com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzc(th))) {
            return false;
        }
        zzv(this, false);
        return true;
    }

    protected final boolean zzp() {
        java.lang.Object obj = this.value;
        return (obj instanceof com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzb) && ((com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzb) obj).zzc;
    }

    protected final boolean zzo(com.google.android.gms.internal.mlkit_vision_barcode.zzet zzetVar) {
        com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzc zzcVar;
        zzetVar.getClass();
        java.lang.Object obj = this.value;
        if (obj == null) {
            if (zzetVar.isDone()) {
                if (!zzc.zzf(this, null, zzq(zzetVar))) {
                    return false;
                }
                zzv(this, false);
                return true;
            }
            com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzf zzfVar = new com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzf(this, zzetVar);
            if (zzc.zzf(this, null, zzfVar)) {
                try {
                    zzetVar.zzl(zzfVar, com.google.android.gms.internal.mlkit_vision_barcode.zzee.INSTANCE);
                } catch (java.lang.Throwable th) {
                    try {
                        zzcVar = new com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzc(th);
                    } catch (java.lang.Error | java.lang.Exception unused) {
                        zzcVar = com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzc.zza;
                    }
                    zzc.zzf(this, zzfVar, zzcVar);
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzb) {
            zzetVar.cancel(((com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzb) obj).zzc);
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException, java.util.concurrent.ExecutionException {
        long nanos = timeUnit.toNanos(j);
        if (!java.lang.Thread.interrupted()) {
            java.lang.Object obj = this.value;
            if ((obj != null) & (!(obj instanceof com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzf))) {
                return zzy(obj);
            }
            long nanoTime = nanos > 0 ? java.lang.System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzj zzjVar = this.waiters;
                if (zzjVar != com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzj.zza) {
                    com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzj zzjVar2 = new com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzj();
                    do {
                        com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza zzaVar = zzc;
                        zzaVar.zzc(zzjVar2, zzjVar);
                        if (zzaVar.zzg(this, zzjVar, zzjVar2)) {
                            do {
                                java.util.concurrent.locks.LockSupport.parkNanos(this, java.lang.Math.min(nanos, 2147483647999999999L));
                                if (java.lang.Thread.interrupted()) {
                                    zzx(zzjVar2);
                                    throw new java.lang.InterruptedException();
                                }
                                java.lang.Object obj2 = this.value;
                                if (!((obj2 != null) & (!(obj2 instanceof com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzf)))) {
                                    nanos = nanoTime - java.lang.System.nanoTime();
                                } else {
                                    return zzy(obj2);
                                }
                            } while (nanos >= 1000);
                            zzx(zzjVar2);
                        } else {
                            zzjVar = this.waiters;
                        }
                    } while (zzjVar != com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzj.zza);
                }
                return zzy(java.util.Objects.requireNonNull(this.value));
            }
            while (nanos > 0) {
                java.lang.Object obj3 = this.value;
                if (!((obj3 != null) & (!(obj3 instanceof com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzf)))) {
                    if (!java.lang.Thread.interrupted()) {
                        nanos = nanoTime - java.lang.System.nanoTime();
                    } else {
                        throw new java.lang.InterruptedException();
                    }
                } else {
                    return zzy(obj3);
                }
            }
            java.lang.String zzdzVar = toString();
            java.lang.String lowerCase = timeUnit.toString().toLowerCase(java.util.Locale.ROOT);
            java.lang.String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(java.util.Locale.ROOT);
            if (nanos + 1000 < 0) {
                java.lang.String concat = str.concat(" (plus ");
                long j2 = -nanos;
                long convert = timeUnit.convert(j2, java.util.concurrent.TimeUnit.NANOSECONDS);
                long nanos2 = j2 - timeUnit.toNanos(convert);
                boolean z = convert == 0 || nanos2 > 1000;
                if (convert > 0) {
                    java.lang.String str2 = concat + convert + " " + lowerCase;
                    if (z) {
                        str2 = str2.concat(",");
                    }
                    concat = str2.concat(" ");
                }
                if (z) {
                    concat = concat + nanos2 + " nanoseconds ";
                }
                str = concat.concat("delay)");
            }
            if (isDone()) {
                throw new java.util.concurrent.TimeoutException(str.concat(" but future completed as timeout expired"));
            }
            throw new java.util.concurrent.TimeoutException(str + " for " + zzdzVar);
        }
        throw new java.lang.InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (this.value != null) & (!(r0 instanceof com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzf));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.value instanceof com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzb;
    }

    final class zzg extends com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza {
        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        final com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzd zza(com.google.android.gms.internal.mlkit_vision_barcode.zzdz zzdzVar, com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzd zzdVar) {
            com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzd zzdVar2;
            synchronized (zzdzVar) {
                zzdVar2 = zzdzVar.listeners;
                if (zzdVar2 != zzdVar) {
                    zzdzVar.listeners = zzdVar;
                }
            }
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        final com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzj zzb(com.google.android.gms.internal.mlkit_vision_barcode.zzdz zzdzVar, com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzj zzjVar) {
            com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzj zzjVar2;
            synchronized (zzdzVar) {
                zzjVar2 = zzdzVar.waiters;
                if (zzjVar2 != zzjVar) {
                    zzdzVar.waiters = zzjVar;
                }
            }
            return zzjVar2;
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        final boolean zze(com.google.android.gms.internal.mlkit_vision_barcode.zzdz zzdzVar, @javax.annotation.CheckForNull com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzd zzdVar, com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzd zzdVar2) {
            synchronized (zzdzVar) {
                if (zzdzVar.listeners != zzdVar) {
                    return false;
                }
                zzdzVar.listeners = zzdVar2;
                return true;
            }
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        final boolean zzf(com.google.android.gms.internal.mlkit_vision_barcode.zzdz zzdzVar, @javax.annotation.CheckForNull java.lang.Object obj, java.lang.Object obj2) {
            synchronized (zzdzVar) {
                if (zzdzVar.value != obj) {
                    return false;
                }
                zzdzVar.value = obj2;
                return true;
            }
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        final boolean zzg(com.google.android.gms.internal.mlkit_vision_barcode.zzdz zzdzVar, @javax.annotation.CheckForNull com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzj zzjVar, @javax.annotation.CheckForNull com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzj zzjVar2) {
            synchronized (zzdzVar) {
                if (zzdzVar.waiters != zzjVar) {
                    return false;
                }
                zzdzVar.waiters = zzjVar2;
                return true;
            }
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        final void zzd(com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzj zzjVar, java.lang.Thread thread) {
            zzjVar.thread = thread;
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        final void zzc(com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzj zzjVar, @javax.annotation.CheckForNull com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzj zzjVar2) {
            zzjVar.next = zzjVar2;
        }

        /* synthetic */ zzg(com.google.android.gms.internal.mlkit_vision_barcode.zzeb zzebVar) {
            super(null);
        }

        private zzg() {
            throw null;
        }
    }

    final class zzd {
        static final com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzd zza = new com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzd();

        @javax.annotation.CheckForNull
        com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzd next;

        @javax.annotation.CheckForNull
        final java.lang.Runnable zzb;

        @javax.annotation.CheckForNull
        final java.util.concurrent.Executor zzc;

        zzd(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
            this.zzb = runnable;
            this.zzc = executor;
        }

        zzd() {
            this.zzb = null;
            this.zzc = null;
        }
    }

    final class zzi extends com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza {
        static final sun.misc.Unsafe zza;
        static final long zzb;
        static final long zzc;
        static final long zzd;
        static final long zze;
        static final long zzf;

        static {
            sun.misc.Unsafe unsafe;
            try {
                try {
                    unsafe = sun.misc.Unsafe.getUnsafe();
                } catch (java.security.PrivilegedActionException e) {
                    throw new java.lang.RuntimeException("Could not initialize intrinsics", e.getCause());
                }
            } catch (java.lang.SecurityException unused) {
                unsafe = (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new java.security.PrivilegedExceptionAction<sun.misc.Unsafe>() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzi.1
                    @Override // java.security.PrivilegedExceptionAction
                    public final /* synthetic */ sun.misc.Unsafe run() throws java.lang.Exception {
                        for (java.lang.reflect.Field field : sun.misc.Unsafe.class.getDeclaredFields()) {
                            field.setAccessible(true);
                            java.lang.Object obj = field.get(null);
                            if (sun.misc.Unsafe.class.isInstance(obj)) {
                                return (sun.misc.Unsafe) sun.misc.Unsafe.class.cast(obj);
                            }
                        }
                        throw new java.lang.NoSuchFieldError("the Unsafe");
                    }
                });
            }
            try {
                zzc = unsafe.objectFieldOffset(com.google.android.gms.internal.mlkit_vision_barcode.zzdz.class.getDeclaredField("waiters"));
                zzb = unsafe.objectFieldOffset(com.google.android.gms.internal.mlkit_vision_barcode.zzdz.class.getDeclaredField("listeners"));
                zzd = unsafe.objectFieldOffset(com.google.android.gms.internal.mlkit_vision_barcode.zzdz.class.getDeclaredField(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE));
                zze = unsafe.objectFieldOffset(com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzj.class.getDeclaredField(com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.THREAD_NAME));
                zzf = unsafe.objectFieldOffset(com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzj.class.getDeclaredField(io.ktor.http.LinkHeader.Rel.Next));
                zza = unsafe;
            } catch (java.lang.NoSuchFieldException e2) {
                throw new java.lang.RuntimeException(e2);
            }
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        final com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzd zza(com.google.android.gms.internal.mlkit_vision_barcode.zzdz zzdzVar, com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzd zzdVar) {
            com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzd zzdVar2;
            do {
                zzdVar2 = zzdzVar.listeners;
                if (zzdVar == zzdVar2) {
                    break;
                }
            } while (!zze(zzdzVar, zzdVar2, zzdVar));
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        final com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzj zzb(com.google.android.gms.internal.mlkit_vision_barcode.zzdz zzdzVar, com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzj zzjVar) {
            com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzj zzjVar2;
            do {
                zzjVar2 = zzdzVar.waiters;
                if (zzjVar == zzjVar2) {
                    break;
                }
            } while (!zzg(zzdzVar, zzjVar2, zzjVar));
            return zzjVar2;
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        final void zzc(com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzj zzjVar, @javax.annotation.CheckForNull com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzj zzjVar2) {
            zza.putObject(zzjVar, zzf, zzjVar2);
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        final void zzd(com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzj zzjVar, java.lang.Thread thread) {
            zza.putObject(zzjVar, zze, thread);
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        final boolean zze(com.google.android.gms.internal.mlkit_vision_barcode.zzdz zzdzVar, @javax.annotation.CheckForNull com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzd zzdVar, com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzd zzdVar2) {
            return com.google.android.gms.internal.mlkit_vision_barcode.zzec.zza(zza, zzdzVar, zzb, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        final boolean zzf(com.google.android.gms.internal.mlkit_vision_barcode.zzdz zzdzVar, @javax.annotation.CheckForNull java.lang.Object obj, java.lang.Object obj2) {
            return com.google.android.gms.internal.mlkit_vision_barcode.zzec.zza(zza, zzdzVar, zzd, obj, obj2);
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        final boolean zzg(com.google.android.gms.internal.mlkit_vision_barcode.zzdz zzdzVar, @javax.annotation.CheckForNull com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzj zzjVar, @javax.annotation.CheckForNull com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzj zzjVar2) {
            return com.google.android.gms.internal.mlkit_vision_barcode.zzec.zza(zza, zzdzVar, zzc, zzjVar, zzjVar2);
        }

        /* synthetic */ zzi(com.google.android.gms.internal.mlkit_vision_barcode.zzed zzedVar) {
            super(null);
        }

        private zzi() {
            throw null;
        }
    }

    final class zzj {
        static final com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzj zza = new com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzj(false);

        @javax.annotation.CheckForNull
        volatile com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzj next;

        @javax.annotation.CheckForNull
        volatile java.lang.Thread thread;

        zzj() {
            com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzc.zzd(this, java.lang.Thread.currentThread());
        }

        zzj(boolean z) {
        }
    }

    abstract class zza {
        abstract com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzd zza(com.google.android.gms.internal.mlkit_vision_barcode.zzdz zzdzVar, com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzd zzdVar);

        abstract com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzj zzb(com.google.android.gms.internal.mlkit_vision_barcode.zzdz zzdzVar, com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzj zzjVar);

        abstract void zzc(com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzj zzjVar, @javax.annotation.CheckForNull com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzj zzjVar2);

        abstract void zzd(com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzj zzjVar, java.lang.Thread thread);

        abstract boolean zze(com.google.android.gms.internal.mlkit_vision_barcode.zzdz zzdzVar, @javax.annotation.CheckForNull com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzd zzdVar, com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzd zzdVar2);

        abstract boolean zzf(com.google.android.gms.internal.mlkit_vision_barcode.zzdz zzdzVar, @javax.annotation.CheckForNull java.lang.Object obj, java.lang.Object obj2);

        abstract boolean zzg(com.google.android.gms.internal.mlkit_vision_barcode.zzdz zzdzVar, @javax.annotation.CheckForNull com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzj zzjVar, @javax.annotation.CheckForNull com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzj zzjVar2);

        /* synthetic */ zza(com.google.android.gms.internal.mlkit_vision_barcode.zzdy zzdyVar) {
        }
    }

    final class zzb {

        @javax.annotation.CheckForNull
        static final com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzb zza;

        @javax.annotation.CheckForNull
        static final com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzb zzb;
        final boolean zzc;

        @javax.annotation.CheckForNull
        final java.lang.Throwable zzd;

        static {
            if (com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza) {
                zzb = null;
                zza = null;
            } else {
                zzb = new com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzb(false, null);
                zza = new com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzb(true, null);
            }
        }

        zzb(boolean z, @javax.annotation.CheckForNull java.lang.Throwable th) {
            this.zzc = z;
            this.zzd = th;
        }
    }

    final class zze extends com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza {
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzj, java.lang.Thread> zza;
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzj, com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzj> zzb;
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<? super com.google.android.gms.internal.mlkit_vision_barcode.zzdz<?>, com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzj> zzc;
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<? super com.google.android.gms.internal.mlkit_vision_barcode.zzdz<?>, com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzd> zzd;
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<? super com.google.android.gms.internal.mlkit_vision_barcode.zzdz<?>, java.lang.Object> zze;

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        final com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzd zza(com.google.android.gms.internal.mlkit_vision_barcode.zzdz zzdzVar, com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzd zzdVar) {
            return this.zzd.getAndSet(zzdzVar, zzdVar);
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        final com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzj zzb(com.google.android.gms.internal.mlkit_vision_barcode.zzdz zzdzVar, com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzj zzjVar) {
            return this.zzc.getAndSet(zzdzVar, zzjVar);
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        final void zzc(com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzj zzjVar, @javax.annotation.CheckForNull com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzj zzjVar2) {
            this.zzb.lazySet(zzjVar, zzjVar2);
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        final void zzd(com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzj zzjVar, java.lang.Thread thread) {
            this.zza.lazySet(zzjVar, thread);
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        final boolean zze(com.google.android.gms.internal.mlkit_vision_barcode.zzdz zzdzVar, @javax.annotation.CheckForNull com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzd zzdVar, com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzd zzdVar2) {
            return com.google.android.gms.internal.mlkit_vision_barcode.zzea.zza(this.zzd, zzdzVar, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        final boolean zzf(com.google.android.gms.internal.mlkit_vision_barcode.zzdz zzdzVar, @javax.annotation.CheckForNull java.lang.Object obj, java.lang.Object obj2) {
            return com.google.android.gms.internal.mlkit_vision_barcode.zzea.zza(this.zze, zzdzVar, obj, obj2);
        }

        @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zza
        final boolean zzg(com.google.android.gms.internal.mlkit_vision_barcode.zzdz zzdzVar, @javax.annotation.CheckForNull com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzj zzjVar, @javax.annotation.CheckForNull com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzj zzjVar2) {
            return com.google.android.gms.internal.mlkit_vision_barcode.zzea.zza(this.zzc, zzdzVar, zzjVar, zzjVar2);
        }

        zze(java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super(null);
            this.zza = atomicReferenceFieldUpdater;
            this.zzb = atomicReferenceFieldUpdater2;
            this.zzc = atomicReferenceFieldUpdater3;
            this.zzd = atomicReferenceFieldUpdater4;
            this.zze = atomicReferenceFieldUpdater5;
        }
    }

    final class zzf<V> implements java.lang.Runnable {
        final com.google.android.gms.internal.mlkit_vision_barcode.zzdz<V> zza;
        final com.google.android.gms.internal.mlkit_vision_barcode.zzet<? extends V> zzb;

        @Override // java.lang.Runnable
        public final void run() {
            if (this.zza.value != this) {
                return;
            }
            com.google.android.gms.internal.mlkit_vision_barcode.zzet<? extends V> zzetVar = this.zzb;
            if (com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzc.zzf(this.zza, this, com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzq(zzetVar))) {
                com.google.android.gms.internal.mlkit_vision_barcode.zzdz.zzv(this.zza, false);
            }
        }

        zzf(com.google.android.gms.internal.mlkit_vision_barcode.zzdz zzdzVar, com.google.android.gms.internal.mlkit_vision_barcode.zzet zzetVar) {
            this.zza = zzdzVar;
            this.zzb = zzetVar;
        }
    }

    protected zzdz() {
    }
}
