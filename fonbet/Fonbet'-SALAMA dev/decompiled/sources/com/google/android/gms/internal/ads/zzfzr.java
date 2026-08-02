package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfzr;
import e1.k;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;
import v0.AbstractC1663a;

/* loaded from: classes.dex */
public abstract class zzfzr<V> extends zzgcg implements I3.b {
    private static final zza zza;
    private static final Object zzbe;
    static final boolean zze;
    static final zzgbl zzf;
    public static final /* synthetic */ int zzg = 0;
    private volatile zze listeners;
    private volatile Object value;
    private volatile zzk waiters;

    abstract class zza {
        public /* synthetic */ zza(zzfzv zzfzvVar) {
        }

        public abstract zze zza(zzfzr zzfzrVar, zze zzeVar);

        public abstract zzk zzb(zzfzr zzfzrVar, zzk zzkVar);

        public abstract void zzc(zzk zzkVar, zzk zzkVar2);

        public abstract void zzd(zzk zzkVar, Thread thread);

        public abstract boolean zze(zzfzr zzfzrVar, zze zzeVar, zze zzeVar2);

        public abstract boolean zzf(zzfzr zzfzrVar, Object obj, Object obj2);

        public abstract boolean zzg(zzfzr zzfzrVar, zzk zzkVar, zzk zzkVar2);
    }

    final class zzb extends zza {
        private static final AtomicReferenceFieldUpdater<zzk, Thread> zza = AtomicReferenceFieldUpdater.newUpdater(zzk.class, Thread.class, "thread");
        private static final AtomicReferenceFieldUpdater<zzk, zzk> zzb = AtomicReferenceFieldUpdater.newUpdater(zzk.class, zzk.class, "next");
        private static final AtomicReferenceFieldUpdater<? super zzfzr<?>, zzk> zzc;
        private static final AtomicReferenceFieldUpdater<? super zzfzr<?>, zze> zzd;
        private static final AtomicReferenceFieldUpdater<? super zzfzr<?>, Object> zze;

        static {
            int i7 = zzfzr.zzg;
            zzc = AtomicReferenceFieldUpdater.newUpdater(zzfzr.class, zzk.class, "waiters");
            zzd = AtomicReferenceFieldUpdater.newUpdater(zzfzr.class, zze.class, "listeners");
            zze = AtomicReferenceFieldUpdater.newUpdater(zzfzr.class, Object.class, "value");
        }

        private zzb() {
            throw null;
        }

        @Override // com.google.android.gms.internal.ads.zzfzr.zza
        public final zze zza(zzfzr zzfzrVar, zze zzeVar) {
            return zzd.getAndSet(zzfzrVar, zzeVar);
        }

        @Override // com.google.android.gms.internal.ads.zzfzr.zza
        public final zzk zzb(zzfzr zzfzrVar, zzk zzkVar) {
            return zzc.getAndSet(zzfzrVar, zzkVar);
        }

        @Override // com.google.android.gms.internal.ads.zzfzr.zza
        public final void zzc(zzk zzkVar, zzk zzkVar2) {
            zzb.lazySet(zzkVar, zzkVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzfzr.zza
        public final void zzd(zzk zzkVar, Thread thread) {
            zza.lazySet(zzkVar, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzfzr.zza
        public final boolean zze(zzfzr zzfzrVar, zze zzeVar, zze zzeVar2) {
            return zzfzs.zza(zzd, zzfzrVar, zzeVar, zzeVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzfzr.zza
        public final boolean zzf(zzfzr zzfzrVar, Object obj, Object obj2) {
            return zzfzs.zza(zze, zzfzrVar, obj, obj2);
        }

        @Override // com.google.android.gms.internal.ads.zzfzr.zza
        public final boolean zzg(zzfzr zzfzrVar, zzk zzkVar, zzk zzkVar2) {
            return zzfzs.zza(zzc, zzfzrVar, zzkVar, zzkVar2);
        }

        public /* synthetic */ zzb(zzfzv zzfzvVar) {
            super(null);
        }
    }

    final class zzc {
        static final zzc zza;
        static final zzc zzb;
        final boolean zzc;
        final Throwable zzd;

        static {
            if (zzfzr.zze) {
                zzb = null;
                zza = null;
            } else {
                zzb = new zzc(false, null);
                zza = new zzc(true, null);
            }
        }

        public zzc(boolean z4, Throwable th) {
            this.zzc = z4;
            this.zzd = th;
        }
    }

    final class zzd {
        static final zzd zza = new zzd(new Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.android.gms.internal.ads.zzfzr.zzd.1
            {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        });
        final Throwable zzb;

        public zzd(Throwable th) {
            th.getClass();
            this.zzb = th;
        }
    }

    final class zze {
        static final zze zza = new zze();
        zze next;
        final Runnable zzb;
        final Executor zzc;

        public zze() {
            this.zzb = null;
            this.zzc = null;
        }

        public zze(Runnable runnable, Executor executor) {
            this.zzb = runnable;
            this.zzc = executor;
        }
    }

    final class zzf<V> implements Runnable {
        final zzfzr<V> zza;
        final I3.b zzb;

        public zzf(zzfzr zzfzrVar, I3.b bVar) {
            this.zza = zzfzrVar;
            this.zzb = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (((zzfzr) this.zza).value != this) {
                return;
            }
            I3.b bVar = this.zzb;
            if (zzfzr.zza.zzf(this.zza, this, zzfzr.zze(bVar))) {
                zzfzr.zzx(this.zza, false);
            }
        }
    }

    final class zzg extends zza {
        private zzg() {
            throw null;
        }

        @Override // com.google.android.gms.internal.ads.zzfzr.zza
        public final zze zza(zzfzr zzfzrVar, zze zzeVar) {
            zze zzeVar2;
            synchronized (zzfzrVar) {
                try {
                    zzeVar2 = zzfzrVar.listeners;
                    if (zzeVar2 != zzeVar) {
                        zzfzrVar.listeners = zzeVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzeVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzfzr.zza
        public final zzk zzb(zzfzr zzfzrVar, zzk zzkVar) {
            zzk zzkVar2;
            synchronized (zzfzrVar) {
                try {
                    zzkVar2 = zzfzrVar.waiters;
                    if (zzkVar2 != zzkVar) {
                        zzfzrVar.waiters = zzkVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzkVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzfzr.zza
        public final void zzc(zzk zzkVar, zzk zzkVar2) {
            zzkVar.next = zzkVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzfzr.zza
        public final void zzd(zzk zzkVar, Thread thread) {
            zzkVar.thread = thread;
        }

        @Override // com.google.android.gms.internal.ads.zzfzr.zza
        public final boolean zze(zzfzr zzfzrVar, zze zzeVar, zze zzeVar2) {
            synchronized (zzfzrVar) {
                try {
                    if (zzfzrVar.listeners != zzeVar) {
                        return false;
                    }
                    zzfzrVar.listeners = zzeVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.android.gms.internal.ads.zzfzr.zza
        public final boolean zzf(zzfzr zzfzrVar, Object obj, Object obj2) {
            synchronized (zzfzrVar) {
                try {
                    if (zzfzrVar.value != obj) {
                        return false;
                    }
                    zzfzrVar.value = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.android.gms.internal.ads.zzfzr.zza
        public final boolean zzg(zzfzr zzfzrVar, zzk zzkVar, zzk zzkVar2) {
            synchronized (zzfzrVar) {
                try {
                    if (zzfzrVar.waiters != zzkVar) {
                        return false;
                    }
                    zzfzrVar.waiters = zzkVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public /* synthetic */ zzg(zzfzv zzfzvVar) {
            super(null);
        }
    }

    interface zzh<V> extends I3.b {
        @Override // I3.b
        /* synthetic */ void addListener(Runnable runnable, Executor executor);
    }

    abstract class zzi<V> extends zzfzr<V> implements zzh<V> {
    }

    final class zzj extends zza {
        static final Unsafe zza;
        static final long zzb;
        static final long zzc;
        static final long zzd;
        static final long zze;
        static final long zzf;
        public static final /* synthetic */ int zzg = 0;

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e7) {
                    throw new RuntimeException("Could not initialize intrinsics", e7.getCause());
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction() { // from class: com.google.android.gms.internal.ads.zzfzu
                    @Override // java.security.PrivilegedExceptionAction
                    public final Object run() {
                        int i7 = zzfzr.zzj.zzg;
                        for (Field field : Unsafe.class.getDeclaredFields()) {
                            field.setAccessible(true);
                            Object obj = field.get(null);
                            if (Unsafe.class.isInstance(obj)) {
                                return (Unsafe) Unsafe.class.cast(obj);
                            }
                        }
                        throw new NoSuchFieldError("the Unsafe");
                    }
                });
            }
            try {
                zzc = unsafe.objectFieldOffset(zzfzr.class.getDeclaredField("waiters"));
                zzb = unsafe.objectFieldOffset(zzfzr.class.getDeclaredField("listeners"));
                zzd = unsafe.objectFieldOffset(zzfzr.class.getDeclaredField("value"));
                zze = unsafe.objectFieldOffset(zzk.class.getDeclaredField("thread"));
                zzf = unsafe.objectFieldOffset(zzk.class.getDeclaredField("next"));
                zza = unsafe;
            } catch (NoSuchFieldException e8) {
                throw new RuntimeException(e8);
            }
        }

        private zzj() {
            throw null;
        }

        @Override // com.google.android.gms.internal.ads.zzfzr.zza
        public final zze zza(zzfzr zzfzrVar, zze zzeVar) {
            zze zzeVar2;
            do {
                zzeVar2 = zzfzrVar.listeners;
                if (zzeVar == zzeVar2) {
                    break;
                }
            } while (!zze(zzfzrVar, zzeVar2, zzeVar));
            return zzeVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzfzr.zza
        public final zzk zzb(zzfzr zzfzrVar, zzk zzkVar) {
            zzk zzkVar2;
            do {
                zzkVar2 = zzfzrVar.waiters;
                if (zzkVar == zzkVar2) {
                    break;
                }
            } while (!zzg(zzfzrVar, zzkVar2, zzkVar));
            return zzkVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzfzr.zza
        public final void zzc(zzk zzkVar, zzk zzkVar2) {
            zza.putObject(zzkVar, zzf, zzkVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzfzr.zza
        public final void zzd(zzk zzkVar, Thread thread) {
            zza.putObject(zzkVar, zze, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzfzr.zza
        public final boolean zze(zzfzr zzfzrVar, zze zzeVar, zze zzeVar2) {
            return zzfzt.zza(zza, zzfzrVar, zzb, zzeVar, zzeVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzfzr.zza
        public final boolean zzf(zzfzr zzfzrVar, Object obj, Object obj2) {
            return zzfzt.zza(zza, zzfzrVar, zzd, obj, obj2);
        }

        @Override // com.google.android.gms.internal.ads.zzfzr.zza
        public final boolean zzg(zzfzr zzfzrVar, zzk zzkVar, zzk zzkVar2) {
            return zzfzt.zza(zza, zzfzrVar, zzc, zzkVar, zzkVar2);
        }

        public /* synthetic */ zzj(zzfzv zzfzvVar) {
            super(null);
        }
    }

    final class zzk {
        static final zzk zza = new zzk(false);
        volatile zzk next;
        volatile Thread thread;

        public zzk(boolean z4) {
        }

        public zzk() {
            zzfzr.zza.zzd(this, Thread.currentThread());
        }
    }

    static {
        boolean z4;
        Throwable th;
        Throwable th2;
        zza zzgVar;
        try {
            z4 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z4 = false;
        }
        zze = z4;
        zzf = new zzgbl(zzfzr.class);
        zzfzv zzfzvVar = null;
        try {
            zzgVar = new zzj(zzfzvVar);
            th = null;
            th2 = null;
        } catch (Error | Exception e7) {
            try {
                th2 = null;
                th = e7;
                zzgVar = new zzb(zzfzvVar);
            } catch (Error | Exception e8) {
                th = e7;
                th2 = e8;
                zzgVar = new zzg(zzfzvVar);
            }
        }
        zza = zzgVar;
        if (th2 != null) {
            zzgbl zzgblVar = zzf;
            Logger zza2 = zzgblVar.zza();
            Level level = Level.SEVERE;
            zza2.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th);
            zzgblVar.zza().logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th2);
        }
        zzbe = new Object();
    }

    private static final Object zzA(Object obj) {
        if (obj instanceof zzc) {
            Throwable th = ((zzc) obj).zzd;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof zzd) {
            throw new ExecutionException(((zzd) obj).zzb);
        }
        if (obj == zzbe) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object zze(I3.b bVar) {
        Throwable zzl;
        if (bVar instanceof zzh) {
            Object obj = ((zzfzr) bVar).value;
            if (obj instanceof zzc) {
                zzc zzcVar = (zzc) obj;
                if (zzcVar.zzc) {
                    Throwable th = zzcVar.zzd;
                    obj = th != null ? new zzc(false, th) : zzc.zzb;
                }
            }
            Objects.requireNonNull(obj);
            return obj;
        }
        if ((bVar instanceof zzgcg) && (zzl = ((zzgcg) bVar).zzl()) != null) {
            return new zzd(zzl);
        }
        boolean isCancelled = bVar.isCancelled();
        if ((!zze) && isCancelled) {
            zzc zzcVar2 = zzc.zzb;
            Objects.requireNonNull(zzcVar2);
            return zzcVar2;
        }
        try {
            Object zzf2 = zzf(bVar);
            return isCancelled ? new zzc(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(bVar)))) : zzf2 == null ? zzbe : zzf2;
        } catch (Error e7) {
            e = e7;
            return new zzd(e);
        } catch (CancellationException e8) {
            return !isCancelled ? new zzd(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(bVar)), e8)) : new zzc(false, e8);
        } catch (ExecutionException e9) {
            return isCancelled ? new zzc(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(bVar)), e9)) : new zzd(e9.getCause());
        } catch (Exception e10) {
            e = e10;
            return new zzd(e);
        }
    }

    private static Object zzf(Future future) {
        Object obj;
        boolean z4 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z4 = true;
            } catch (Throwable th) {
                if (z4) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    private final void zzu(StringBuilder sb) {
        try {
            Object zzf2 = zzf(this);
            sb.append("SUCCESS, result=[");
            if (zzf2 == null) {
                sb.append("null");
            } else if (zzf2 == this) {
                sb.append("this future");
            } else {
                sb.append(zzf2.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(zzf2)));
            }
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (ExecutionException e7) {
            sb.append("FAILURE, cause=[");
            sb.append(e7.getCause());
            sb.append("]");
        } catch (Exception e8) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e8.getClass());
            sb.append(" thrown from get()]");
        }
    }

    private final void zzv(StringBuilder sb) {
        String concat;
        int length = sb.length();
        sb.append("PENDING");
        Object obj = this.value;
        if (obj instanceof zzf) {
            sb.append(", setFuture=[");
            zzw(sb, ((zzf) obj).zzb);
            sb.append("]");
        } else {
            try {
                concat = zzfty.zza(zza());
            } catch (Exception | StackOverflowError e7) {
                concat = "Exception thrown from implementation: ".concat(String.valueOf(e7.getClass()));
            }
            if (concat != null) {
                sb.append(", info=[");
                sb.append(concat);
                sb.append("]");
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            zzu(sb);
        }
    }

    private final void zzw(StringBuilder sb, Object obj) {
        try {
            if (obj == this) {
                sb.append("this future");
            } else {
                sb.append(obj);
            }
        } catch (Exception e7) {
            e = e7;
            sb.append("Exception thrown from implementation: ");
            sb.append(e.getClass());
        } catch (StackOverflowError e8) {
            e = e8;
            sb.append("Exception thrown from implementation: ");
            sb.append(e.getClass());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzx(zzfzr zzfzrVar, boolean z4) {
        zze zzeVar = null;
        while (true) {
            for (zzk zzb2 = zza.zzb(zzfzrVar, zzk.zza); zzb2 != null; zzb2 = zzb2.next) {
                Thread thread = zzb2.thread;
                if (thread != null) {
                    zzb2.thread = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z4) {
                zzfzrVar.zzq();
            }
            zzfzrVar.zzb();
            zze zzeVar2 = zzeVar;
            zze zza2 = zza.zza(zzfzrVar, zze.zza);
            zze zzeVar3 = zzeVar2;
            while (zza2 != null) {
                zze zzeVar4 = zza2.next;
                zza2.next = zzeVar3;
                zzeVar3 = zza2;
                zza2 = zzeVar4;
            }
            while (zzeVar3 != null) {
                zzeVar = zzeVar3.next;
                Runnable runnable = zzeVar3.zzb;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof zzf) {
                    zzf zzfVar = (zzf) runnable2;
                    zzfzrVar = zzfVar.zza;
                    if (zzfzrVar.value == zzfVar) {
                        if (zza.zzf(zzfzrVar, zzfVar, zze(zzfVar.zzb))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = zzeVar3.zzc;
                    Objects.requireNonNull(executor);
                    zzy(runnable2, executor);
                }
                zzeVar3 = zzeVar;
            }
            return;
            z4 = false;
        }
    }

    private static void zzy(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e7) {
            zzf.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", AbstractC1663a.f("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e7);
        }
    }

    private final void zzz(zzk zzkVar) {
        zzkVar.thread = null;
        while (true) {
            zzk zzkVar2 = this.waiters;
            if (zzkVar2 != zzk.zza) {
                zzk zzkVar3 = null;
                while (zzkVar2 != null) {
                    zzk zzkVar4 = zzkVar2.next;
                    if (zzkVar2.thread != null) {
                        zzkVar3 = zzkVar2;
                    } else if (zzkVar3 != null) {
                        zzkVar3.next = zzkVar4;
                        if (zzkVar3.thread == null) {
                            break;
                        }
                    } else if (!zza.zzg(this, zzkVar2, zzkVar4)) {
                        break;
                    }
                    zzkVar2 = zzkVar4;
                }
                return;
            }
            return;
        }
    }

    @Override // I3.b
    public void addListener(Runnable runnable, Executor executor) {
        zze zzeVar;
        zzfth.zzc(runnable, "Runnable was null.");
        zzfth.zzc(executor, "Executor was null.");
        if (!isDone() && (zzeVar = this.listeners) != zze.zza) {
            zze zzeVar2 = new zze(runnable, executor);
            do {
                zzeVar2.next = zzeVar;
                if (zza.zze(this, zzeVar, zzeVar2)) {
                    return;
                } else {
                    zzeVar = this.listeners;
                }
            } while (zzeVar != zze.zza);
        }
        zzy(runnable, executor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean cancel(boolean z4) {
        zzc zzcVar;
        Object obj = this.value;
        if (!(obj instanceof zzf) && !(obj == null)) {
            return false;
        }
        if (zze) {
            zzcVar = new zzc(z4, new CancellationException("Future.cancel() was called."));
        } else {
            zzcVar = z4 ? zzc.zza : zzc.zzb;
            Objects.requireNonNull(zzcVar);
        }
        zzfzr<V> zzfzrVar = this;
        boolean z7 = false;
        while (true) {
            if (zza.zzf(zzfzrVar, obj, zzcVar)) {
                zzx(zzfzrVar, z4);
                if (!(obj instanceof zzf)) {
                    break;
                }
                I3.b bVar = ((zzf) obj).zzb;
                if (!(bVar instanceof zzh)) {
                    bVar.cancel(z4);
                    break;
                }
                zzfzrVar = (zzfzr) bVar;
                obj = zzfzrVar.value;
                if (!(obj == null) && !(obj instanceof zzf)) {
                    break;
                }
                z7 = true;
            } else {
                obj = zzfzrVar.value;
                if (!(obj instanceof zzf)) {
                    return z7;
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.value;
        if ((obj2 != null) && (!(obj2 instanceof zzf))) {
            return zzA(obj2);
        }
        zzk zzkVar = this.waiters;
        if (zzkVar != zzk.zza) {
            zzk zzkVar2 = new zzk();
            do {
                zza zzaVar = zza;
                zzaVar.zzc(zzkVar2, zzkVar);
                if (zzaVar.zzg(this, zzkVar, zzkVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            zzz(zzkVar2);
                            throw new InterruptedException();
                        }
                        obj = this.value;
                    } while (!((obj != null) & (!(obj instanceof zzf))));
                    return zzA(obj);
                }
                zzkVar = this.waiters;
            } while (zzkVar != zzk.zza);
        }
        Object obj3 = this.value;
        Objects.requireNonNull(obj3);
        return zzA(obj3);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.value instanceof zzc;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (this.value != null) & (!(r0 instanceof zzf));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            zzu(sb);
        } else {
            zzv(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String zza() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public void zzb() {
    }

    public boolean zzc(Object obj) {
        if (obj == null) {
            obj = zzbe;
        }
        if (!zza.zzf(this, null, obj)) {
            return false;
        }
        zzx(this, false);
        return true;
    }

    public boolean zzd(Throwable th) {
        th.getClass();
        if (!zza.zzf(this, null, new zzd(th))) {
            return false;
        }
        zzx(this, false);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgcg
    public final Throwable zzl() {
        if (!(this instanceof zzh)) {
            return null;
        }
        Object obj = this.value;
        if (obj instanceof zzd) {
            return ((zzd) obj).zzb;
        }
        return null;
    }

    public void zzq() {
    }

    public final void zzr(Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(zzt());
        }
    }

    public final boolean zzs(I3.b bVar) {
        zzd zzdVar;
        bVar.getClass();
        Object obj = this.value;
        if (obj == null) {
            if (bVar.isDone()) {
                if (!zza.zzf(this, null, zze(bVar))) {
                    return false;
                }
                zzx(this, false);
                return true;
            }
            zzf zzfVar = new zzf(this, bVar);
            if (zza.zzf(this, null, zzfVar)) {
                try {
                    bVar.addListener(zzfVar, zzgaq.INSTANCE);
                } catch (Throwable th) {
                    try {
                        zzdVar = new zzd(th);
                    } catch (Error | Exception unused) {
                        zzdVar = zzd.zza;
                    }
                    zza.zzf(this, zzfVar, zzdVar);
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof zzc) {
            bVar.cancel(((zzc) obj).zzc);
        }
        return false;
    }

    public final boolean zzt() {
        Object obj = this.value;
        return (obj instanceof zzc) && ((zzc) obj).zzc;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.value;
            boolean z4 = true;
            if ((obj != null) & (!(obj instanceof zzf))) {
                return zzA(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                zzk zzkVar = this.waiters;
                if (zzkVar != zzk.zza) {
                    zzk zzkVar2 = new zzk();
                    do {
                        zza zzaVar = zza;
                        zzaVar.zzc(zzkVar2, zzkVar);
                        if (zzaVar.zzg(this, zzkVar, zzkVar2)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.value;
                                    if ((obj2 != null) & (!(obj2 instanceof zzf))) {
                                        return zzA(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    zzz(zzkVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            zzz(zzkVar2);
                        } else {
                            zzkVar = this.waiters;
                        }
                    } while (zzkVar != zzk.zza);
                }
                Object obj3 = this.value;
                Objects.requireNonNull(obj3);
                return zzA(obj3);
            }
            while (nanos > 0) {
                Object obj4 = this.value;
                if ((obj4 != null) & (!(obj4 instanceof zzf))) {
                    return zzA(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String zzfzrVar = toString();
            String obj5 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj5.toLowerCase(locale);
            String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String concat = str.concat(" (plus ");
                long j3 = -nanos;
                long convert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit.toNanos(convert);
                if (convert != 0 && nanos2 <= 1000) {
                    z4 = false;
                }
                if (convert > 0) {
                    String str2 = concat + convert + " " + lowerCase;
                    if (z4) {
                        str2 = str2.concat(",");
                    }
                    concat = str2.concat(" ");
                }
                if (z4) {
                    concat = concat + nanos2 + " nanoseconds ";
                }
                str = concat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(str.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(k.f(str, " for ", zzfzrVar));
        }
        throw new InterruptedException();
    }
}
