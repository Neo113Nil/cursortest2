package s0;

import F.E;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
import m0.AbstractC0062t;
import o.AbstractC0071c;
import r0.t;

/* loaded from: classes.dex */
public final class b implements Executor, Closeable {

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1217i = AtomicLongFieldUpdater.newUpdater(b.class, "parkedWorkersStack");

    /* renamed from: j, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1218j = AtomicLongFieldUpdater.newUpdater(b.class, "controlState");

    /* renamed from: k, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1219k = AtomicIntegerFieldUpdater.newUpdater(b.class, "_isTerminated");

    /* renamed from: l, reason: collision with root package name */
    public static final io.flutter.plugin.platform.i f1220l = new io.flutter.plugin.platform.i(2, "NOT_IN_STACK");
    private volatile int _isTerminated;

    /* renamed from: b, reason: collision with root package name */
    public final int f1221b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1222c;
    private volatile long controlState;

    /* renamed from: d, reason: collision with root package name */
    public final long f1223d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1224e;

    /* renamed from: f, reason: collision with root package name */
    public final e f1225f;

    /* renamed from: g, reason: collision with root package name */
    public final e f1226g;

    /* renamed from: h, reason: collision with root package name */
    public final t f1227h;
    private volatile long parkedWorkersStack;

    public b(int i2, int i3, long j2, String str) {
        this.f1221b = i2;
        this.f1222c = i3;
        this.f1223d = j2;
        this.f1224e = str;
        if (i2 < 1) {
            throw new IllegalArgumentException(("Core pool size " + i2 + " should be at least 1").toString());
        }
        if (i3 < i2) {
            throw new IllegalArgumentException(("Max pool size " + i3 + " should be greater than or equals to core pool size " + i2).toString());
        }
        if (i3 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i3 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j2 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j2 + " must be positive").toString());
        }
        this.f1225f = new e();
        this.f1226g = new e();
        this.f1227h = new t((i2 + 1) * 2);
        this.controlState = i2 << 42;
        this._isTerminated = 0;
    }

    public final int a() {
        synchronized (this.f1227h) {
            try {
                if (f1219k.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f1218j;
                long j2 = atomicLongFieldUpdater.get(this);
                int i2 = (int) (j2 & 2097151);
                int i3 = i2 - ((int) ((j2 & 4398044413952L) >> 21));
                if (i3 < 0) {
                    i3 = 0;
                }
                if (i3 >= this.f1221b) {
                    return 0;
                }
                if (i2 >= this.f1222c) {
                    return 0;
                }
                int i4 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i4 <= 0 || this.f1227h.b(i4) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a aVar = new a(this, i4);
                this.f1227h.c(i4, aVar);
                if (i4 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i5 = i3 + 1;
                aVar.start();
                return i5;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Runnable runnable, E e2) {
        h iVar;
        int i2;
        j.f1241f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof h) {
            iVar = (h) runnable;
            iVar.f1233b = nanoTime;
            iVar.f1234c = e2;
        } else {
            iVar = new i(runnable, nanoTime, e2);
        }
        boolean z2 = iVar.f1234c.f38a == 1;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1218j;
        long addAndGet = z2 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread currentThread = Thread.currentThread();
        a aVar = currentThread instanceof a ? (a) currentThread : null;
        if (aVar == null || !g0.h.a(aVar.f1216i, this)) {
            aVar = null;
        }
        if (aVar != null && (i2 = aVar.f1211d) != 5 && (iVar.f1234c.f38a != 0 || i2 != 2)) {
            aVar.f1215h = true;
            l lVar = aVar.f1209b;
            lVar.getClass();
            iVar = (h) l.f1245b.getAndSet(lVar, iVar);
            if (iVar == null) {
                iVar = null;
            } else {
                AtomicReferenceArray atomicReferenceArray = lVar.f1249a;
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = l.f1246c;
                if (atomicIntegerFieldUpdater.get(lVar) - l.f1247d.get(lVar) != 127) {
                    if (iVar.f1234c.f38a == 1) {
                        l.f1248e.incrementAndGet(lVar);
                    }
                    int i3 = atomicIntegerFieldUpdater.get(lVar) & 127;
                    while (atomicReferenceArray.get(i3) != null) {
                        Thread.yield();
                    }
                    atomicReferenceArray.lazySet(i3, iVar);
                    atomicIntegerFieldUpdater.incrementAndGet(lVar);
                    iVar = null;
                }
            }
        }
        if (iVar != null) {
            if (!(iVar.f1234c.f38a == 1 ? this.f1226g.a(iVar) : this.f1225f.a(iVar))) {
                throw new RejectedExecutionException(this.f1224e + " was terminated");
            }
        }
        if (z2) {
            if (e() || d(addAndGet)) {
                return;
            }
            e();
            return;
        }
        if (e() || d(atomicLongFieldUpdater.get(this))) {
            return;
        }
        e();
    }

    public final void c(a aVar, int i2, int i3) {
        while (true) {
            long j2 = f1217i.get(this);
            int i4 = (int) (2097151 & j2);
            long j3 = (2097152 + j2) & (-2097152);
            if (i4 == i2) {
                if (i3 == 0) {
                    Object c2 = aVar.c();
                    while (true) {
                        if (c2 == f1220l) {
                            i4 = -1;
                            break;
                        }
                        if (c2 == null) {
                            i4 = 0;
                            break;
                        }
                        a aVar2 = (a) c2;
                        int b2 = aVar2.b();
                        if (b2 != 0) {
                            i4 = b2;
                            break;
                        }
                        c2 = aVar2.c();
                    }
                } else {
                    i4 = i3;
                }
            }
            if (i4 >= 0) {
                if (f1217i.compareAndSet(this, j2, i4 | j3)) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0086, code lost:
    
        if (r1 == null) goto L39;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        int i2;
        h hVar;
        if (f1219k.compareAndSet(this, 0, 1)) {
            Thread currentThread = Thread.currentThread();
            a aVar = currentThread instanceof a ? (a) currentThread : null;
            if (aVar == null || !g0.h.a(aVar.f1216i, this)) {
                aVar = null;
            }
            synchronized (this.f1227h) {
                i2 = (int) (f1218j.get(this) & 2097151);
            }
            if (1 <= i2) {
                int i3 = 1;
                while (true) {
                    Object b2 = this.f1227h.b(i3);
                    g0.h.b(b2);
                    a aVar2 = (a) b2;
                    if (aVar2 != aVar) {
                        while (aVar2.isAlive()) {
                            LockSupport.unpark(aVar2);
                            aVar2.join(10000L);
                        }
                        l lVar = aVar2.f1209b;
                        e eVar = this.f1226g;
                        lVar.getClass();
                        h hVar2 = (h) l.f1245b.getAndSet(lVar, null);
                        if (hVar2 != null) {
                            eVar.a(hVar2);
                        }
                        while (true) {
                            h a2 = lVar.a();
                            if (a2 == null) {
                                break;
                            } else {
                                eVar.a(a2);
                            }
                        }
                    }
                    if (i3 == i2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.f1226g.b();
            this.f1225f.b();
            while (true) {
                if (aVar != null) {
                    hVar = aVar.a(true);
                }
                hVar = (h) this.f1225f.d();
                if (hVar == null && (hVar = (h) this.f1226g.d()) == null) {
                    break;
                }
                try {
                    hVar.run();
                } catch (Throwable th) {
                    Thread currentThread2 = Thread.currentThread();
                    currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
                }
            }
            if (aVar != null) {
                aVar.h(5);
            }
            f1217i.set(this, 0L);
            f1218j.set(this, 0L);
        }
    }

    public final boolean d(long j2) {
        int i2 = ((int) (2097151 & j2)) - ((int) ((j2 & 4398044413952L) >> 21));
        if (i2 < 0) {
            i2 = 0;
        }
        int i3 = this.f1221b;
        if (i2 < i3) {
            int a2 = a();
            if (a2 == 1 && i3 > 1) {
                a();
            }
            if (a2 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean e() {
        io.flutter.plugin.platform.i iVar;
        int i2;
        while (true) {
            long j2 = f1217i.get(this);
            a aVar = (a) this.f1227h.b((int) (2097151 & j2));
            if (aVar == null) {
                aVar = null;
            } else {
                long j3 = (2097152 + j2) & (-2097152);
                Object c2 = aVar.c();
                while (true) {
                    iVar = f1220l;
                    if (c2 == iVar) {
                        i2 = -1;
                        break;
                    }
                    if (c2 == null) {
                        i2 = 0;
                        break;
                    }
                    a aVar2 = (a) c2;
                    i2 = aVar2.b();
                    if (i2 != 0) {
                        break;
                    }
                    c2 = aVar2.c();
                }
                if (i2 >= 0) {
                    if (f1217i.compareAndSet(this, j2, i2 | j3)) {
                        aVar.g(iVar);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.f1208j.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b(runnable, j.f1242g);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        t tVar = this.f1227h;
        int a2 = tVar.a();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 1; i7 < a2; i7++) {
            a aVar = (a) tVar.b(i7);
            if (aVar != null) {
                l lVar = aVar.f1209b;
                lVar.getClass();
                int i8 = l.f1245b.get(lVar) != null ? (l.f1246c.get(lVar) - l.f1247d.get(lVar)) + 1 : l.f1246c.get(lVar) - l.f1247d.get(lVar);
                int a3 = AbstractC0071c.a(aVar.f1211d);
                if (a3 == 0) {
                    i2++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i8);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (a3 == 1) {
                    i3++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i8);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (a3 == 2) {
                    i4++;
                } else if (a3 == 3) {
                    i5++;
                    if (i8 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i8);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (a3 == 4) {
                    i6++;
                }
            }
        }
        long j2 = f1218j.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f1224e);
        sb4.append('@');
        sb4.append(AbstractC0062t.a(this));
        sb4.append("[Pool Size {core = ");
        int i9 = this.f1221b;
        sb4.append(i9);
        sb4.append(", max = ");
        sb4.append(this.f1222c);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i2);
        sb4.append(", blocking = ");
        sb4.append(i3);
        sb4.append(", parked = ");
        sb4.append(i4);
        sb4.append(", dormant = ");
        sb4.append(i5);
        sb4.append(", terminated = ");
        sb4.append(i6);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f1225f.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f1226g.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j2));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j2) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i9 - ((int) ((j2 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
