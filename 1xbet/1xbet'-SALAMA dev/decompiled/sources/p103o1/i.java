package p103o1;

import I3.b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import p031e1.k;
import p097n3.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class i implements b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f15569d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f15570e = Logger.getLogger(i.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f15571f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Object f15572x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f15573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile d f15574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile h f15575c;

    static {
        a gVar;
        try {
            gVar = new e(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(i.class, h.class, "c"), AtomicReferenceFieldUpdater.newUpdater(i.class, d.class, "b"), AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            gVar = new g();
        }
        f15571f = gVar;
        if (th != null) {
            f15570e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f15572x = new Object();
    }

    public static void b(i iVar) {
        d dVar;
        d dVar2;
        d dVar3 = null;
        while (true) {
            h hVar = iVar.f15575c;
            if (f15571f.h(iVar, hVar, h.f15566c)) {
                while (hVar != null) {
                    Thread thread = hVar.f15567a;
                    if (thread != null) {
                        hVar.f15567a = null;
                        LockSupport.unpark(thread);
                    }
                    hVar = hVar.f15568b;
                }
                do {
                    dVar = iVar.f15574b;
                } while (!f15571f.f(iVar, dVar, d.f15556d));
                while (true) {
                    dVar2 = dVar3;
                    dVar3 = dVar;
                    if (dVar3 == null) {
                        break;
                    }
                    dVar = dVar3.f15559c;
                    dVar3.f15559c = dVar2;
                }
                while (dVar2 != null) {
                    dVar3 = dVar2.f15559c;
                    Runnable runnable = dVar2.f15557a;
                    if (runnable instanceof f) {
                        f fVar = (f) runnable;
                        iVar = fVar.f15564a;
                        if (iVar.f15573a == fVar) {
                            if (f15571f.g(iVar, fVar, e(fVar.f15565b))) {
                            }
                        } else {
                            continue;
                        }
                    } else {
                        c(runnable, dVar2.f15558b);
                    }
                    dVar2 = dVar3;
                }
                return;
            }
        }
    }

    public static void c(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e7) {
            f15570e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e7);
        }
    }

    public static Object d(Object obj) throws ExecutionException {
        if (obj instanceof a) {
            CancellationException cancellationException = ((a) obj).f15552b;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof c) {
            throw new ExecutionException(((c) obj).f15555a);
        }
        if (obj == f15572x) {
            return null;
        }
        return obj;
    }

    public static Object e(b bVar) {
        if (bVar instanceof i) {
            Object obj = ((i) bVar).f15573a;
            if (!(obj instanceof a)) {
                return obj;
            }
            a aVar = (a) obj;
            if (aVar.f15551a) {
                return aVar.f15552b != null ? new a(false, aVar.f15552b) : a.f15550d;
            }
            return obj;
        }
        boolean zIsCancelled = bVar.isCancelled();
        if ((!f15569d) && zIsCancelled) {
            return a.f15550d;
        }
        try {
            Object objF = f(bVar);
            return objF == null ? f15572x : objF;
        } catch (CancellationException e7) {
            if (zIsCancelled) {
                return new a(false, e7);
            }
            return new c(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + bVar, e7));
        } catch (ExecutionException e8) {
            return new c(e8.getCause());
        } catch (Throwable th) {
            return new c(th);
        }
    }

    public static Object f(b bVar) {
        Object obj;
        boolean z4 = false;
        while (true) {
            try {
                obj = bVar.get();
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

    public final void a(StringBuilder sb) {
        try {
            Object objF = f(this);
            sb.append("SUCCESS, result=[");
            sb.append(objF == this ? "this future" : String.valueOf(objF));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e7) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e7.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e8) {
            sb.append("FAILURE, cause=[");
            sb.append(e8.getCause());
            sb.append("]");
        }
    }

    @Override // I3.b
    public final void addListener(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        d dVar = this.f15574b;
        d dVar2 = d.f15556d;
        if (dVar != dVar2) {
            d dVar3 = new d(runnable, executor);
            do {
                dVar3.f15559c = dVar;
                if (f15571f.f(this, dVar, dVar3)) {
                    return;
                } else {
                    dVar = this.f15574b;
                }
            } while (dVar != dVar2);
        }
        c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z4) {
        a aVar;
        Object obj = this.f15573a;
        if (!(obj == null) && !(obj instanceof f)) {
            return false;
        }
        if (f15569d) {
            aVar = new a(z4, new CancellationException("Future.cancel() was called."));
        } else {
            aVar = z4 ? a.f15549c : a.f15550d;
        }
        i iVar = this;
        boolean z7 = false;
        while (true) {
            if (f15571f.g(iVar, obj, aVar)) {
                b(iVar);
                if (!(obj instanceof f)) {
                    return true;
                }
                b bVar = ((f) obj).f15565b;
                if (!(bVar instanceof i)) {
                    bVar.cancel(z4);
                    return true;
                }
                iVar = (i) bVar;
                obj = iVar.f15573a;
                if (!(obj == null) && !(obj instanceof f)) {
                    return true;
                }
                z7 = true;
            } else {
                obj = iVar.f15573a;
                if (!(obj instanceof f)) {
                    return z7;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String g() {
        Object obj = this.f15573a;
        if (obj instanceof f) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            b bVar = ((f) obj).f15565b;
            return k.i(sb, bVar == this ? "this future" : String.valueOf(bVar), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0090  */
    /* JADX WARN: Code duplicated, block: B:48:0x0094  */
    /* JADX WARN: Code duplicated, block: B:49:0x0096  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a8 A[EDGE_INSN: B:56:0x00a8->B:36:0x0074 BREAK  A[LOOP:0: B:21:0x0041->B:86:?]] */
    /* JADX WARN: Code duplicated, block: B:59:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:67:0x0100  */
    /* JADX WARN: Code duplicated, block: B:69:0x0104  */
    /* JADX WARN: Code duplicated, block: B:71:0x011b  */
    /* JADX WARN: Code duplicated, block: B:74:0x0127  */
    /* JADX WARN: Code duplicated, block: B:78:0x0147  */
    /* JADX WARN: Code duplicated, block: B:80:0x0153  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00a8 -> B:36:0x0074). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long r20, java.util.concurrent.TimeUnit r22) {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p103o1.i.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public final void h(h hVar) {
        hVar.f15567a = null;
        while (true) {
            h hVar2 = this.f15575c;
            if (hVar2 == h.f15566c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.f15568b;
                if (hVar2.f15567a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.f15568b = hVar4;
                    if (hVar3.f15567a == null) {
                    }
                } else if (!f15571f.h(this, hVar2, hVar4)) {
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f15573a instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f15573a;
        return (!(obj instanceof f)) & (obj != null);
    }

    public final String toString() {
        String strG;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f15573a instanceof a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                strG = g();
            } catch (RuntimeException e7) {
                strG = "Exception thrown from implementation: " + e7.getClass();
            }
            if (strG != null && !strG.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strG);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f15573a;
            if ((obj2 != null) & (!(obj2 instanceof f))) {
                return d(obj2);
            }
            h hVar = this.f15575c;
            h hVar2 = h.f15566c;
            if (hVar != hVar2) {
                h hVar3 = new h();
                do {
                    a aVar = f15571f;
                    aVar.N(hVar3, hVar);
                    if (aVar.h(this, hVar, hVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f15573a;
                            } else {
                                h(hVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return d(obj);
                    }
                    hVar = this.f15575c;
                } while (hVar != hVar2);
            }
            return d(this.f15573a);
        }
        throw new InterruptedException();
    }
}
