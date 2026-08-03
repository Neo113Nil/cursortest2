package m;

/* loaded from: classes.dex */
public abstract class g implements java.util.concurrent.Future {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f8032d = java.lang.Boolean.parseBoolean(java.lang.System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.logging.Logger f8033e = java.util.logging.Logger.getLogger(m.g.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final Q1.d f8034f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.Object f8035g;

    /* renamed from: a, reason: collision with root package name */
    public volatile java.lang.Object f8036a;

    /* renamed from: b, reason: collision with root package name */
    public volatile m.c f8037b;

    /* renamed from: c, reason: collision with root package name */
    public volatile m.f f8038c;

    static {
        Q1.d eVar;
        try {
            eVar = new m.d(java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(m.f.class, java.lang.Thread.class, "a"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(m.f.class, m.f.class, "b"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(m.g.class, m.f.class, "c"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(m.g.class, m.c.class, "b"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(m.g.class, java.lang.Object.class, "a"));
            th = null;
        } catch (java.lang.Throwable th) {
            th = th;
            eVar = new m.e();
        }
        f8034f = eVar;
        if (th != null) {
            f8033e.log(java.util.logging.Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f8035g = new java.lang.Object();
    }

    public static void b(m.g gVar) {
        m.f fVar;
        m.c cVar;
        do {
            fVar = gVar.f8038c;
        } while (!f8034f.f(gVar, fVar, m.f.f8029c));
        while (fVar != null) {
            java.lang.Thread thread = fVar.f8030a;
            if (thread != null) {
                fVar.f8030a = null;
                java.util.concurrent.locks.LockSupport.unpark(thread);
            }
            fVar = fVar.f8031b;
        }
        do {
            cVar = gVar.f8037b;
        } while (!f8034f.d(gVar, cVar));
        m.c cVar2 = null;
        while (cVar != null) {
            m.c cVar3 = cVar.f8023a;
            cVar.f8023a = cVar2;
            cVar2 = cVar;
            cVar = cVar3;
        }
        while (cVar2 != null) {
            cVar2 = cVar2.f8023a;
            try {
                throw null;
            } catch (java.lang.RuntimeException e2) {
                f8033e.log(java.util.logging.Level.SEVERE, "RuntimeException while executing runnable null with executor null", (java.lang.Throwable) e2);
            }
        }
    }

    public static java.lang.Object c(java.lang.Object obj) {
        if (obj instanceof m.C0928a) {
            java.util.concurrent.CancellationException cancellationException = ((m.C0928a) obj).f8021a;
            java.util.concurrent.CancellationException cancellationException2 = new java.util.concurrent.CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof m.b) {
            ((m.b) obj).getClass();
            throw new java.util.concurrent.ExecutionException((java.lang.Throwable) null);
        }
        if (obj == f8035g) {
            return null;
        }
        return obj;
    }

    public static java.lang.Object d(m.g gVar) {
        java.lang.Object obj;
        boolean z2 = false;
        while (true) {
            try {
                obj = gVar.get();
                break;
            } catch (java.lang.InterruptedException unused) {
                z2 = true;
            } catch (java.lang.Throwable th) {
                if (z2) {
                    java.lang.Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            java.lang.Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(java.lang.StringBuilder sb) {
        try {
            java.lang.Object d2 = d(this);
            sb.append("SUCCESS, result=[");
            sb.append(d2 == this ? "this future" : java.lang.String.valueOf(d2));
            sb.append("]");
        } catch (java.util.concurrent.CancellationException unused) {
            sb.append("CANCELLED");
        } catch (java.lang.RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (java.util.concurrent.ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        java.lang.Object obj = this.f8036a;
        if (obj != null) {
            return false;
        }
        if (!f8034f.e(this, obj, f8032d ? new m.C0928a(z2, new java.util.concurrent.CancellationException("Future.cancel() was called.")) : z2 ? m.C0928a.f8019b : m.C0928a.f8020c)) {
            return false;
        }
        b(this);
        return true;
    }

    public final void e(m.f fVar) {
        fVar.f8030a = null;
        while (true) {
            m.f fVar2 = this.f8038c;
            if (fVar2 == m.f.f8029c) {
                return;
            }
            m.f fVar3 = null;
            while (fVar2 != null) {
                m.f fVar4 = fVar2.f8031b;
                if (fVar2.f8030a != null) {
                    fVar3 = fVar2;
                } else if (fVar3 != null) {
                    fVar3.f8031b = fVar4;
                    if (fVar3.f8030a == null) {
                        break;
                    }
                } else if (!f8034f.f(this, fVar2, fVar4)) {
                    break;
                }
                fVar2 = fVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long j2, java.util.concurrent.TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j2);
        if (java.lang.Thread.interrupted()) {
            throw new java.lang.InterruptedException();
        }
        java.lang.Object obj = this.f8036a;
        if (obj != null) {
            return c(obj);
        }
        long nanoTime = nanos > 0 ? java.lang.System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            m.f fVar = this.f8038c;
            m.f fVar2 = m.f.f8029c;
            if (fVar != fVar2) {
                m.f fVar3 = new m.f();
                do {
                    Q1.d dVar = f8034f;
                    dVar.w(fVar3, fVar);
                    if (dVar.f(this, fVar, fVar3)) {
                        do {
                            java.util.concurrent.locks.LockSupport.parkNanos(this, nanos);
                            if (java.lang.Thread.interrupted()) {
                                e(fVar3);
                                throw new java.lang.InterruptedException();
                            }
                            java.lang.Object obj2 = this.f8036a;
                            if (obj2 != null) {
                                return c(obj2);
                            }
                            nanos = nanoTime - java.lang.System.nanoTime();
                        } while (nanos >= 1000);
                        e(fVar3);
                    } else {
                        fVar = this.f8038c;
                    }
                } while (fVar != fVar2);
            }
            return c(this.f8036a);
        }
        while (nanos > 0) {
            java.lang.Object obj3 = this.f8036a;
            if (obj3 != null) {
                return c(obj3);
            }
            if (java.lang.Thread.interrupted()) {
                throw new java.lang.InterruptedException();
            }
            nanos = nanoTime - java.lang.System.nanoTime();
        }
        java.lang.String gVar = toString();
        java.lang.String obj4 = timeUnit.toString();
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String lowerCase = obj4.toLowerCase(locale);
        java.lang.String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            java.lang.String str2 = str + " (plus ";
            long j3 = -nanos;
            long convert = timeUnit.convert(j3, java.util.concurrent.TimeUnit.NANOSECONDS);
            long nanos2 = j3 - timeUnit.toNanos(convert);
            boolean z2 = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                java.lang.String str3 = str2 + convert + " " + lowerCase;
                if (z2) {
                    str3 = str3 + io.appmetrica.analytics.coreutils.internal.StringUtils.COMMA;
                }
                str2 = str3 + " ";
            }
            if (z2) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new java.util.concurrent.TimeoutException(str + " but future completed as timeout expired");
        }
        throw new java.util.concurrent.TimeoutException(str + " for " + gVar);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f8036a instanceof m.C0928a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f8036a != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f8036a instanceof m.C0928a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                if (this instanceof java.util.concurrent.ScheduledFuture) {
                    str = "remaining delay=[" + ((java.util.concurrent.ScheduledFuture) this).getDelay(java.util.concurrent.TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (java.lang.RuntimeException e2) {
                str = "Exception thrown from implementation: " + e2.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
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
    public final java.lang.Object get() {
        java.lang.Object obj;
        if (!java.lang.Thread.interrupted()) {
            java.lang.Object obj2 = this.f8036a;
            if (obj2 != null) {
                return c(obj2);
            }
            m.f fVar = this.f8038c;
            m.f fVar2 = m.f.f8029c;
            if (fVar != fVar2) {
                m.f fVar3 = new m.f();
                do {
                    Q1.d dVar = f8034f;
                    dVar.w(fVar3, fVar);
                    if (dVar.f(this, fVar, fVar3)) {
                        do {
                            java.util.concurrent.locks.LockSupport.park(this);
                            if (!java.lang.Thread.interrupted()) {
                                obj = this.f8036a;
                            } else {
                                e(fVar3);
                                throw new java.lang.InterruptedException();
                            }
                        } while (obj == null);
                        return c(obj);
                    }
                    fVar = this.f8038c;
                } while (fVar != fVar2);
            }
            return c(this.f8036a);
        }
        throw new java.lang.InterruptedException();
    }
}
