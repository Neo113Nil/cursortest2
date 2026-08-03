package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
abstract class zzhaq<V> extends com.google.android.gms.internal.ads.zzhcy implements com.google.common.util.concurrent.ListenableFuture<V> {
    private static final com.google.android.gms.internal.ads.zzhaq.zza zzbs;
    static final java.lang.Object zze = new java.lang.Object();
    static final com.google.android.gms.internal.ads.zzhce zzf = new com.google.android.gms.internal.ads.zzhce(com.google.android.gms.internal.ads.zzhap.class);
    static final boolean zzg;
    volatile com.google.android.gms.internal.ads.zzhap.zzd listenersField;
    volatile java.lang.Object valueField;
    volatile com.google.android.gms.internal.ads.zzhaq.zze waitersField;

    /* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
    abstract class zza {
        /* synthetic */ zza(byte[] bArr) {
        }

        abstract void zza(com.google.android.gms.internal.ads.zzhaq.zze zzeVar, java.lang.Thread thread);

        abstract void zzb(com.google.android.gms.internal.ads.zzhaq.zze zzeVar, com.google.android.gms.internal.ads.zzhaq.zze zzeVar2);

        abstract boolean zzc(com.google.android.gms.internal.ads.zzhaq zzhaqVar, com.google.android.gms.internal.ads.zzhaq.zze zzeVar, com.google.android.gms.internal.ads.zzhaq.zze zzeVar2);

        abstract boolean zzd(com.google.android.gms.internal.ads.zzhaq zzhaqVar, com.google.android.gms.internal.ads.zzhap.zzd zzdVar, com.google.android.gms.internal.ads.zzhap.zzd zzdVar2);

        abstract com.google.android.gms.internal.ads.zzhaq.zze zze(com.google.android.gms.internal.ads.zzhaq zzhaqVar, com.google.android.gms.internal.ads.zzhaq.zze zzeVar);

        abstract com.google.android.gms.internal.ads.zzhap.zzd zzf(com.google.android.gms.internal.ads.zzhaq zzhaqVar, com.google.android.gms.internal.ads.zzhap.zzd zzdVar);

        abstract boolean zzg(com.google.android.gms.internal.ads.zzhaq zzhaqVar, java.lang.Object obj, java.lang.Object obj2);
    }

    /* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
    final class zzb extends com.google.android.gms.internal.ads.zzhaq.zza {
        private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.google.android.gms.internal.ads.zzhaq.zze, java.lang.Thread> zza = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.android.gms.internal.ads.zzhaq.zze.class, java.lang.Thread.class, "thread");
        private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.google.android.gms.internal.ads.zzhaq.zze, com.google.android.gms.internal.ads.zzhaq.zze> zzb = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.android.gms.internal.ads.zzhaq.zze.class, com.google.android.gms.internal.ads.zzhaq.zze.class, io.ktor.http.LinkHeader.Rel.Next);
        private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<? super com.google.android.gms.internal.ads.zzhaq<?>, com.google.android.gms.internal.ads.zzhaq.zze> zzc = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.android.gms.internal.ads.zzhaq.class, com.google.android.gms.internal.ads.zzhaq.zze.class, "waitersField");
        private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<? super com.google.android.gms.internal.ads.zzhaq<?>, com.google.android.gms.internal.ads.zzhap.zzd> zzd = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.android.gms.internal.ads.zzhaq.class, com.google.android.gms.internal.ads.zzhap.zzd.class, "listenersField");
        private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<? super com.google.android.gms.internal.ads.zzhaq<?>, java.lang.Object> zze = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.android.gms.internal.ads.zzhaq.class, java.lang.Object.class, "valueField");

        private zzb() {
            throw null;
        }

        /* synthetic */ zzb(byte[] bArr) {
            super(null);
        }

        @Override // com.google.android.gms.internal.ads.zzhaq.zza
        final void zza(com.google.android.gms.internal.ads.zzhaq.zze zzeVar, java.lang.Thread thread) {
            zza.lazySet(zzeVar, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzhaq.zza
        final void zzb(com.google.android.gms.internal.ads.zzhaq.zze zzeVar, com.google.android.gms.internal.ads.zzhaq.zze zzeVar2) {
            zzb.lazySet(zzeVar, zzeVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzhaq.zza
        final boolean zzc(com.google.android.gms.internal.ads.zzhaq zzhaqVar, com.google.android.gms.internal.ads.zzhaq.zze zzeVar, com.google.android.gms.internal.ads.zzhaq.zze zzeVar2) {
            return androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(zzc, zzhaqVar, zzeVar, zzeVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzhaq.zza
        final boolean zzd(com.google.android.gms.internal.ads.zzhaq zzhaqVar, com.google.android.gms.internal.ads.zzhap.zzd zzdVar, com.google.android.gms.internal.ads.zzhap.zzd zzdVar2) {
            return androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(zzd, zzhaqVar, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzhaq.zza
        final com.google.android.gms.internal.ads.zzhaq.zze zze(com.google.android.gms.internal.ads.zzhaq zzhaqVar, com.google.android.gms.internal.ads.zzhaq.zze zzeVar) {
            return zzc.getAndSet(zzhaqVar, zzeVar);
        }

        @Override // com.google.android.gms.internal.ads.zzhaq.zza
        final com.google.android.gms.internal.ads.zzhap.zzd zzf(com.google.android.gms.internal.ads.zzhaq zzhaqVar, com.google.android.gms.internal.ads.zzhap.zzd zzdVar) {
            return zzd.getAndSet(zzhaqVar, zzdVar);
        }

        @Override // com.google.android.gms.internal.ads.zzhaq.zza
        final boolean zzg(com.google.android.gms.internal.ads.zzhaq zzhaqVar, java.lang.Object obj, java.lang.Object obj2) {
            return androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(zze, zzhaqVar, obj, obj2);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
    final class zzc extends com.google.android.gms.internal.ads.zzhaq.zza {
        private zzc() {
            throw null;
        }

        /* synthetic */ zzc(byte[] bArr) {
            super(null);
        }

        @Override // com.google.android.gms.internal.ads.zzhaq.zza
        final void zza(com.google.android.gms.internal.ads.zzhaq.zze zzeVar, java.lang.Thread thread) {
            zzeVar.thread = thread;
        }

        @Override // com.google.android.gms.internal.ads.zzhaq.zza
        final void zzb(com.google.android.gms.internal.ads.zzhaq.zze zzeVar, com.google.android.gms.internal.ads.zzhaq.zze zzeVar2) {
            zzeVar.next = zzeVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzhaq.zza
        final boolean zzc(com.google.android.gms.internal.ads.zzhaq zzhaqVar, com.google.android.gms.internal.ads.zzhaq.zze zzeVar, com.google.android.gms.internal.ads.zzhaq.zze zzeVar2) {
            synchronized (zzhaqVar) {
                if (zzhaqVar.waitersField != zzeVar) {
                    return false;
                }
                zzhaqVar.waitersField = zzeVar2;
                return true;
            }
        }

        @Override // com.google.android.gms.internal.ads.zzhaq.zza
        final boolean zzd(com.google.android.gms.internal.ads.zzhaq zzhaqVar, com.google.android.gms.internal.ads.zzhap.zzd zzdVar, com.google.android.gms.internal.ads.zzhap.zzd zzdVar2) {
            synchronized (zzhaqVar) {
                if (zzhaqVar.listenersField != zzdVar) {
                    return false;
                }
                zzhaqVar.listenersField = zzdVar2;
                return true;
            }
        }

        @Override // com.google.android.gms.internal.ads.zzhaq.zza
        final com.google.android.gms.internal.ads.zzhaq.zze zze(com.google.android.gms.internal.ads.zzhaq zzhaqVar, com.google.android.gms.internal.ads.zzhaq.zze zzeVar) {
            com.google.android.gms.internal.ads.zzhaq.zze zzeVar2;
            synchronized (zzhaqVar) {
                zzeVar2 = zzhaqVar.waitersField;
                if (zzeVar2 != zzeVar) {
                    zzhaqVar.waitersField = zzeVar;
                }
            }
            return zzeVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzhaq.zza
        final com.google.android.gms.internal.ads.zzhap.zzd zzf(com.google.android.gms.internal.ads.zzhaq zzhaqVar, com.google.android.gms.internal.ads.zzhap.zzd zzdVar) {
            com.google.android.gms.internal.ads.zzhap.zzd zzdVar2;
            synchronized (zzhaqVar) {
                zzdVar2 = zzhaqVar.listenersField;
                if (zzdVar2 != zzdVar) {
                    zzhaqVar.listenersField = zzdVar;
                }
            }
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzhaq.zza
        final boolean zzg(com.google.android.gms.internal.ads.zzhaq zzhaqVar, java.lang.Object obj, java.lang.Object obj2) {
            synchronized (zzhaqVar) {
                if (zzhaqVar.valueField != obj) {
                    return false;
                }
                zzhaqVar.valueField = obj2;
                return true;
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
    final class zzd extends com.google.android.gms.internal.ads.zzhaq.zza {
        static final sun.misc.Unsafe zza;
        static final long zzb;
        static final long zzc;
        static final long zzd;
        static final long zze;
        static final long zzf;
        public static final /* synthetic */ int zzg = 0;

        static {
            sun.misc.Unsafe unsafe;
            try {
                try {
                    unsafe = sun.misc.Unsafe.getUnsafe();
                } catch (java.lang.SecurityException unused) {
                    unsafe = (sun.misc.Unsafe) java.security.AccessController.doPrivileged(com.google.android.gms.internal.ads.zzhar.zza);
                }
                try {
                    zzc = unsafe.objectFieldOffset(com.google.android.gms.internal.ads.zzhaq.class.getDeclaredField("waitersField"));
                    zzb = unsafe.objectFieldOffset(com.google.android.gms.internal.ads.zzhaq.class.getDeclaredField("listenersField"));
                    zzd = unsafe.objectFieldOffset(com.google.android.gms.internal.ads.zzhaq.class.getDeclaredField("valueField"));
                    zze = unsafe.objectFieldOffset(com.google.android.gms.internal.ads.zzhaq.zze.class.getDeclaredField("thread"));
                    zzf = unsafe.objectFieldOffset(com.google.android.gms.internal.ads.zzhaq.zze.class.getDeclaredField(io.ktor.http.LinkHeader.Rel.Next));
                    zza = unsafe;
                } catch (java.lang.NoSuchFieldException e) {
                    throw new java.lang.RuntimeException(e);
                }
            } catch (java.security.PrivilegedActionException e2) {
                throw new java.lang.RuntimeException("Could not initialize intrinsics", e2.getCause());
            }
        }

        private zzd() {
            throw null;
        }

        /* synthetic */ zzd(byte[] bArr) {
            super(null);
        }

        @Override // com.google.android.gms.internal.ads.zzhaq.zza
        final void zza(com.google.android.gms.internal.ads.zzhaq.zze zzeVar, java.lang.Thread thread) {
            zza.putObject(zzeVar, zze, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzhaq.zza
        final void zzb(com.google.android.gms.internal.ads.zzhaq.zze zzeVar, com.google.android.gms.internal.ads.zzhaq.zze zzeVar2) {
            zza.putObject(zzeVar, zzf, zzeVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzhaq.zza
        final boolean zzc(com.google.android.gms.internal.ads.zzhaq zzhaqVar, com.google.android.gms.internal.ads.zzhaq.zze zzeVar, com.google.android.gms.internal.ads.zzhaq.zze zzeVar2) {
            return com.google.android.gms.internal.ads.zzet$$ExternalSyntheticBackport0.m(zza, zzhaqVar, zzc, zzeVar, zzeVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzhaq.zza
        final boolean zzd(com.google.android.gms.internal.ads.zzhaq zzhaqVar, com.google.android.gms.internal.ads.zzhap.zzd zzdVar, com.google.android.gms.internal.ads.zzhap.zzd zzdVar2) {
            return com.google.android.gms.internal.ads.zzet$$ExternalSyntheticBackport0.m(zza, zzhaqVar, zzb, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzhaq.zza
        final com.google.android.gms.internal.ads.zzhaq.zze zze(com.google.android.gms.internal.ads.zzhaq zzhaqVar, com.google.android.gms.internal.ads.zzhaq.zze zzeVar) {
            com.google.android.gms.internal.ads.zzhaq.zze zzeVar2;
            do {
                zzeVar2 = zzhaqVar.waitersField;
                if (zzeVar == zzeVar2) {
                    break;
                }
            } while (!zzc(zzhaqVar, zzeVar2, zzeVar));
            return zzeVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzhaq.zza
        final com.google.android.gms.internal.ads.zzhap.zzd zzf(com.google.android.gms.internal.ads.zzhaq zzhaqVar, com.google.android.gms.internal.ads.zzhap.zzd zzdVar) {
            com.google.android.gms.internal.ads.zzhap.zzd zzdVar2;
            do {
                zzdVar2 = zzhaqVar.listenersField;
                if (zzdVar == zzdVar2) {
                    break;
                }
            } while (!zzd(zzhaqVar, zzdVar2, zzdVar));
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzhaq.zza
        final boolean zzg(com.google.android.gms.internal.ads.zzhaq zzhaqVar, java.lang.Object obj, java.lang.Object obj2) {
            return com.google.android.gms.internal.ads.zzet$$ExternalSyntheticBackport0.m(zza, zzhaqVar, zzd, obj, obj2);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
    final class zze {
        static final com.google.android.gms.internal.ads.zzhaq.zze zza = new com.google.android.gms.internal.ads.zzhaq.zze(false);
        volatile com.google.android.gms.internal.ads.zzhaq.zze next;
        volatile java.lang.Thread thread;

        zze() {
            com.google.android.gms.internal.ads.zzhaq.zzv(this, java.lang.Thread.currentThread());
        }

        zze(boolean z) {
        }
    }

    static {
        boolean z;
        java.lang.Throwable th;
        java.lang.Throwable th2;
        com.google.android.gms.internal.ads.zzhaq.zza zzcVar;
        try {
            z = java.lang.Boolean.parseBoolean(java.lang.System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (java.lang.SecurityException unused) {
            z = false;
        }
        zzg = z;
        java.lang.String property = java.lang.System.getProperty("java.runtime.name", "");
        byte[] bArr = null;
        if (property == null || property.contains(com.ironsource.X3.d)) {
            try {
                zzcVar = new com.google.android.gms.internal.ads.zzhaq.zzd(bArr);
            } catch (java.lang.Error | java.lang.Exception e) {
                try {
                    th = e;
                    th2 = null;
                    zzcVar = new com.google.android.gms.internal.ads.zzhaq.zzb(bArr);
                } catch (java.lang.Error | java.lang.Exception e2) {
                    th = e;
                    th2 = e2;
                    zzcVar = new com.google.android.gms.internal.ads.zzhaq.zzc(bArr);
                }
            }
        } else {
            try {
                zzcVar = new com.google.android.gms.internal.ads.zzhaq.zzb(bArr);
            } catch (java.lang.NoClassDefFoundError unused2) {
                zzcVar = new com.google.android.gms.internal.ads.zzhaq.zzc(bArr);
            }
        }
        th2 = null;
        th = null;
        zzbs = zzcVar;
        if (th2 != null) {
            com.google.android.gms.internal.ads.zzhce zzhceVar = zzf;
            zzhceVar.zza().logp(java.util.logging.Level.SEVERE, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th);
            zzhceVar.zza().logp(java.util.logging.Level.SEVERE, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th2);
        }
    }

    zzhaq() {
    }

    private final void zza(com.google.android.gms.internal.ads.zzhaq.zze zzeVar) {
        zzeVar.thread = null;
        while (true) {
            com.google.android.gms.internal.ads.zzhaq.zze zzeVar2 = this.waitersField;
            if (zzeVar2 != com.google.android.gms.internal.ads.zzhaq.zze.zza) {
                com.google.android.gms.internal.ads.zzhaq.zze zzeVar3 = null;
                while (zzeVar2 != null) {
                    com.google.android.gms.internal.ads.zzhaq.zze zzeVar4 = zzeVar2.next;
                    if (zzeVar2.thread != null) {
                        zzeVar3 = zzeVar2;
                    } else if (zzeVar3 != null) {
                        zzeVar3.next = zzeVar4;
                        if (zzeVar3.thread == null) {
                            break;
                        }
                    } else if (!zzbs.zzc(this, zzeVar2, zzeVar4)) {
                        break;
                    }
                    zzeVar2 = zzeVar4;
                }
                return;
            }
            return;
        }
    }

    static boolean zzr(com.google.android.gms.internal.ads.zzhaq zzhaqVar, java.lang.Object obj, java.lang.Object obj2) {
        return zzbs.zzg(zzhaqVar, obj, obj2);
    }

    static /* synthetic */ void zzv(com.google.android.gms.internal.ads.zzhaq.zze zzeVar, java.lang.Thread thread) {
        zzbs.zza(zzeVar, thread);
    }

    final boolean zzp(com.google.android.gms.internal.ads.zzhap.zzd zzdVar, com.google.android.gms.internal.ads.zzhap.zzd zzdVar2) {
        return zzbs.zzd(this, zzdVar, zzdVar2);
    }

    final com.google.android.gms.internal.ads.zzhap.zzd zzq(com.google.android.gms.internal.ads.zzhap.zzd zzdVar) {
        return zzbs.zzf(this, zzdVar);
    }

    final void zzs() {
        for (com.google.android.gms.internal.ads.zzhaq.zze zze2 = zzbs.zze(this, com.google.android.gms.internal.ads.zzhaq.zze.zza); zze2 != null; zze2 = zze2.next) {
            java.lang.Thread thread = zze2.thread;
            if (thread != null) {
                zze2.thread = null;
                java.util.concurrent.locks.LockSupport.unpark(thread);
            }
        }
    }

    final java.lang.Object zzt(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException, java.util.concurrent.ExecutionException {
        long nanos = timeUnit.toNanos(j);
        if (java.lang.Thread.interrupted()) {
            throw new java.lang.InterruptedException();
        }
        java.lang.Object obj = this.valueField;
        if ((obj != null) && com.google.android.gms.internal.ads.zzhap.zzh(obj)) {
            return com.google.android.gms.internal.ads.zzhap.zzg(obj);
        }
        long nanoTime = nanos > 0 ? java.lang.System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            com.google.android.gms.internal.ads.zzhaq.zze zzeVar = this.waitersField;
            if (zzeVar != com.google.android.gms.internal.ads.zzhaq.zze.zza) {
                com.google.android.gms.internal.ads.zzhaq.zze zzeVar2 = new com.google.android.gms.internal.ads.zzhaq.zze();
                do {
                    com.google.android.gms.internal.ads.zzhaq.zza zzaVar = zzbs;
                    zzaVar.zzb(zzeVar2, zzeVar);
                    if (zzaVar.zzc(this, zzeVar, zzeVar2)) {
                        do {
                            java.util.concurrent.locks.LockSupport.parkNanos(this, java.lang.Math.min(nanos, 2147483647999999999L));
                            if (java.lang.Thread.interrupted()) {
                                zza(zzeVar2);
                                throw new java.lang.InterruptedException();
                            }
                            java.lang.Object obj2 = this.valueField;
                            if ((obj2 != null) && com.google.android.gms.internal.ads.zzhap.zzh(obj2)) {
                                return com.google.android.gms.internal.ads.zzhap.zzg(obj2);
                            }
                            nanos = nanoTime - java.lang.System.nanoTime();
                        } while (nanos >= 1000);
                        zza(zzeVar2);
                    } else {
                        zzeVar = this.waitersField;
                    }
                } while (zzeVar != com.google.android.gms.internal.ads.zzhaq.zze.zza);
            }
            return com.google.android.gms.internal.ads.zzhap.zzg(java.util.Objects.requireNonNull(this.valueField));
        }
        while (nanos > 0) {
            java.lang.Object obj3 = this.valueField;
            if ((obj3 != null) && com.google.android.gms.internal.ads.zzhap.zzh(obj3)) {
                return com.google.android.gms.internal.ads.zzhap.zzg(obj3);
            }
            if (java.lang.Thread.interrupted()) {
                throw new java.lang.InterruptedException();
            }
            nanos = nanoTime - java.lang.System.nanoTime();
        }
        java.lang.String obj4 = toString();
        java.lang.String lowerCase = timeUnit.toString().toLowerCase(java.util.Locale.ROOT);
        java.lang.String lowerCase2 = timeUnit.toString().toLowerCase(java.util.Locale.ROOT);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(j).length() + 8 + java.lang.String.valueOf(lowerCase2).length());
        sb.append("Waited ");
        sb.append(j);
        sb.append(io.ktor.sse.ServerSentEventKt.SPACE);
        sb.append(lowerCase2);
        java.lang.String sb2 = sb.toString();
        if (nanos + 1000 < 0) {
            java.lang.String concat = sb2.concat(" (plus ");
            long j2 = -nanos;
            long convert = timeUnit.convert(j2, java.util.concurrent.TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(convert);
            boolean z = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder(concat.length() + java.lang.String.valueOf(convert).length() + 1 + java.lang.String.valueOf(lowerCase).length());
                sb3.append(concat);
                sb3.append(convert);
                sb3.append(io.ktor.sse.ServerSentEventKt.SPACE);
                sb3.append(lowerCase);
                java.lang.String sb4 = sb3.toString();
                if (z) {
                    sb4 = sb4.concat(",");
                }
                concat = sb4.concat(io.ktor.sse.ServerSentEventKt.SPACE);
            }
            if (z) {
                java.lang.StringBuilder sb5 = new java.lang.StringBuilder(concat.length() + java.lang.String.valueOf(nanos2).length() + 13);
                sb5.append(concat);
                sb5.append(nanos2);
                sb5.append(" nanoseconds ");
                concat = sb5.toString();
            }
            sb2 = concat.concat("delay)");
        }
        if (isDone()) {
            throw new java.util.concurrent.TimeoutException(sb2.concat(" but future completed as timeout expired"));
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(sb2.length() + 5 + java.lang.String.valueOf(obj4).length());
        sb6.append(sb2);
        sb6.append(" for ");
        sb6.append(obj4);
        throw new java.util.concurrent.TimeoutException(sb6.toString());
    }

    final java.lang.Object zzu() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
        java.lang.Object obj;
        if (java.lang.Thread.interrupted()) {
            throw new java.lang.InterruptedException();
        }
        java.lang.Object obj2 = this.valueField;
        if ((obj2 != null) && com.google.android.gms.internal.ads.zzhap.zzh(obj2)) {
            return com.google.android.gms.internal.ads.zzhap.zzg(obj2);
        }
        com.google.android.gms.internal.ads.zzhaq.zze zzeVar = this.waitersField;
        if (zzeVar != com.google.android.gms.internal.ads.zzhaq.zze.zza) {
            com.google.android.gms.internal.ads.zzhaq.zze zzeVar2 = new com.google.android.gms.internal.ads.zzhaq.zze();
            do {
                com.google.android.gms.internal.ads.zzhaq.zza zzaVar = zzbs;
                zzaVar.zzb(zzeVar2, zzeVar);
                if (zzaVar.zzc(this, zzeVar, zzeVar2)) {
                    do {
                        java.util.concurrent.locks.LockSupport.park(this);
                        if (java.lang.Thread.interrupted()) {
                            zza(zzeVar2);
                            throw new java.lang.InterruptedException();
                        }
                        obj = this.valueField;
                    } while (!((obj != null) & com.google.android.gms.internal.ads.zzhap.zzh(obj)));
                    return com.google.android.gms.internal.ads.zzhap.zzg(obj);
                }
                zzeVar = this.waitersField;
            } while (zzeVar != com.google.android.gms.internal.ads.zzhaq.zze.zza);
        }
        return com.google.android.gms.internal.ads.zzhap.zzg(java.util.Objects.requireNonNull(this.valueField));
    }
}
