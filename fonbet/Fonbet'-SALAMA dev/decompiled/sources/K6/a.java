package K6;

import F2.W0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import t6.p;

/* loaded from: classes2.dex */
public final class a extends Thread {

    /* renamed from: z, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f4138z = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl");

    /* renamed from: a, reason: collision with root package name */
    public final l f4139a;

    /* renamed from: b, reason: collision with root package name */
    public final p f4140b;

    /* renamed from: c, reason: collision with root package name */
    public int f4141c;

    /* renamed from: d, reason: collision with root package name */
    public long f4142d;

    /* renamed from: e, reason: collision with root package name */
    public long f4143e;

    /* renamed from: f, reason: collision with root package name */
    public int f4144f;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile int workerCtl;

    /* renamed from: x, reason: collision with root package name */
    public boolean f4145x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ b f4146y;

    public a(b bVar, int i7) {
        this.f4146y = bVar;
        setDaemon(true);
        this.f4139a = new l();
        this.f4140b = new p();
        this.f4141c = 4;
        this.nextParkedWorker = b.f4148B;
        x6.d.f18094a.getClass();
        this.f4144f = x6.d.f18095b.a().nextInt();
        f(i7);
    }

    public final h a(boolean z4) {
        h e7;
        h e8;
        b bVar;
        long j;
        int i7 = this.f4141c;
        h hVar = null;
        l lVar = this.f4139a;
        b bVar2 = this.f4146y;
        if (i7 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = b.f4150z;
            do {
                bVar = this.f4146y;
                j = atomicLongFieldUpdater.get(bVar);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    lVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l.f4175b;
                        h hVar2 = (h) atomicReferenceFieldUpdater.get(lVar);
                        if (hVar2 != null && hVar2.f4164b.f12365a == 1) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(lVar, hVar2, null)) {
                                if (atomicReferenceFieldUpdater.get(lVar) != hVar2) {
                                    break;
                                }
                            }
                            hVar = hVar2;
                            break loop1;
                        }
                    }
                    int i8 = l.f4177d.get(lVar);
                    int i9 = l.f4176c.get(lVar);
                    while (true) {
                        if (i8 == i9 || l.f4178e.get(lVar) == 0) {
                            break;
                        }
                        i9--;
                        h c3 = lVar.c(i9, true);
                        if (c3 != null) {
                            hVar = c3;
                            break;
                        }
                    }
                    if (hVar != null) {
                        return hVar;
                    }
                    h hVar3 = (h) bVar2.f4156f.d();
                    return hVar3 == null ? i(1) : hVar3;
                }
            } while (!b.f4150z.compareAndSet(bVar, j, j - 4398046511104L));
            this.f4141c = 1;
        }
        if (z4) {
            boolean z7 = d(bVar2.f4151a * 2) == 0;
            if (z7 && (e8 = e()) != null) {
                return e8;
            }
            lVar.getClass();
            h hVar4 = (h) l.f4175b.getAndSet(lVar, null);
            if (hVar4 == null) {
                hVar4 = lVar.b();
            }
            if (hVar4 != null) {
                return hVar4;
            }
            if (!z7 && (e7 = e()) != null) {
                return e7;
            }
        } else {
            h e9 = e();
            if (e9 != null) {
                return e9;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i7) {
        int i8 = this.f4144f;
        int i9 = i8 ^ (i8 << 13);
        int i10 = i9 ^ (i9 >> 17);
        int i11 = i10 ^ (i10 << 5);
        this.f4144f = i11;
        int i12 = i7 - 1;
        return (i12 & i7) == 0 ? i11 & i12 : (i11 & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) % i7;
    }

    public final h e() {
        int d7 = d(2);
        b bVar = this.f4146y;
        if (d7 == 0) {
            h hVar = (h) bVar.f4155e.d();
            return hVar != null ? hVar : (h) bVar.f4156f.d();
        }
        h hVar2 = (h) bVar.f4156f.d();
        return hVar2 != null ? hVar2 : (h) bVar.f4155e.d();
    }

    public final void f(int i7) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4146y.f4154d);
        sb.append("-worker-");
        sb.append(i7 == 0 ? "TERMINATED" : String.valueOf(i7));
        setName(sb.toString());
        this.indexInArray = i7;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(int i7) {
        int i8 = this.f4141c;
        boolean z4 = i8 == 1;
        if (z4) {
            b.f4150z.addAndGet(this.f4146y, 4398046511104L);
        }
        if (i8 != i7) {
            this.f4141c = i7;
        }
        return z4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0082, code lost:
    
        r19 = r6;
        r6 = -2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final h i(int i7) {
        int i8;
        h hVar;
        long j;
        AtomicLongFieldUpdater atomicLongFieldUpdater = b.f4150z;
        b bVar = this.f4146y;
        int i9 = (int) (atomicLongFieldUpdater.get(bVar) & 2097151);
        h hVar2 = null;
        if (i9 < 2) {
            return null;
        }
        int d7 = d(i9);
        int i10 = 0;
        long j3 = Long.MAX_VALUE;
        while (i10 < i9) {
            int i11 = d7 + 1;
            if (i11 > i9) {
                i11 = 1;
            }
            a aVar = (a) bVar.f4157x.b(i11);
            if (aVar == null || aVar == this) {
                i8 = i11;
            } else {
                l lVar = aVar.f4139a;
                if (i7 == 3) {
                    hVar = lVar.b();
                } else {
                    lVar.getClass();
                    int i12 = l.f4177d.get(lVar);
                    int i13 = l.f4176c.get(lVar);
                    boolean z4 = i7 == 1;
                    while (i12 != i13 && (!z4 || l.f4178e.get(lVar) != 0)) {
                        int i14 = i12 + 1;
                        hVar = lVar.c(i12, z4);
                        if (hVar != null) {
                            break;
                        }
                        i12 = i14;
                    }
                    hVar = hVar2;
                }
                p pVar = this.f4140b;
                if (hVar == null) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l.f4175b;
                        h hVar3 = (h) atomicReferenceFieldUpdater.get(lVar);
                        if (hVar3 == null) {
                            break;
                        }
                        if (((hVar3.f4164b.f12365a == 1 ? 1 : 2) & i7) == 0) {
                            break;
                        }
                        j.f4171f.getClass();
                        i8 = i11;
                        long nanoTime = System.nanoTime() - hVar3.f4163a;
                        long j7 = j.f4167b;
                        if (nanoTime < j7) {
                            j = j7 - nanoTime;
                            hVar2 = null;
                            break;
                        }
                        do {
                            hVar2 = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(lVar, hVar3, null)) {
                                pVar.f16472a = hVar3;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(lVar) == hVar3);
                        i11 = i8;
                        hVar2 = null;
                    }
                } else {
                    pVar.f16472a = hVar;
                    i8 = i11;
                }
                j = -1;
                if (j == -1) {
                    h hVar4 = (h) pVar.f16472a;
                    pVar.f16472a = hVar2;
                    return hVar4;
                }
                if (j > 0) {
                    j3 = Math.min(j3, j);
                }
            }
            i10++;
            d7 = i8;
            hVar2 = null;
        }
        if (j3 == Long.MAX_VALUE) {
            j3 = 0;
        }
        this.f4143e = j3;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        int i7;
        loop0: while (true) {
            boolean z4 = false;
            while (true) {
                b bVar = this.f4146y;
                bVar.getClass();
                int i8 = 5;
                if (b.f4147A.get(bVar) == 0 && this.f4141c != 5) {
                    h a2 = a(this.f4145x);
                    int i9 = 3;
                    if (a2 != null) {
                        this.f4143e = 0L;
                        int i10 = a2.f4164b.f12365a;
                        this.f4142d = 0L;
                        if (this.f4141c == 3) {
                            this.f4141c = 2;
                        }
                        b bVar2 = this.f4146y;
                        if (i10 != 0 && h(2) && !bVar2.f() && !bVar2.e(b.f4150z.get(bVar2))) {
                            bVar2.f();
                        }
                        bVar2.getClass();
                        try {
                            a2.run();
                        } catch (Throwable th) {
                            Thread currentThread = Thread.currentThread();
                            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                        }
                        if (i10 != 0) {
                            b.f4150z.addAndGet(bVar2, -2097152L);
                            if (this.f4141c != 5) {
                                this.f4141c = 4;
                            }
                        }
                    } else {
                        this.f4145x = false;
                        if (this.f4143e == 0) {
                            Object obj = this.nextParkedWorker;
                            W0 w02 = b.f4148B;
                            if (obj != w02) {
                                f4138z.set(this, -1);
                                while (this.nextParkedWorker != b.f4148B) {
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f4138z;
                                    if (atomicIntegerFieldUpdater.get(this) == -1) {
                                        b bVar3 = this.f4146y;
                                        bVar3.getClass();
                                        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = b.f4147A;
                                        if (atomicIntegerFieldUpdater2.get(bVar3) == 0 && this.f4141c != i8) {
                                            h(i9);
                                            Thread.interrupted();
                                            if (this.f4142d == 0) {
                                                this.f4142d = System.nanoTime() + this.f4146y.f4153c;
                                            }
                                            LockSupport.parkNanos(this.f4146y.f4153c);
                                            if (System.nanoTime() - this.f4142d >= 0) {
                                                this.f4142d = 0L;
                                                b bVar4 = this.f4146y;
                                                synchronized (bVar4.f4157x) {
                                                    try {
                                                        if (!(atomicIntegerFieldUpdater2.get(bVar4) != 0)) {
                                                            AtomicLongFieldUpdater atomicLongFieldUpdater2 = b.f4150z;
                                                            if (((int) (atomicLongFieldUpdater2.get(bVar4) & 2097151)) > bVar4.f4151a) {
                                                                if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                                    int i11 = this.indexInArray;
                                                                    f(0);
                                                                    bVar4.d(this, i11, 0);
                                                                    int andDecrement = (int) (atomicLongFieldUpdater2.getAndDecrement(bVar4) & 2097151);
                                                                    if (andDecrement != i11) {
                                                                        Object b7 = bVar4.f4157x.b(andDecrement);
                                                                        t6.h.b(b7);
                                                                        a aVar = (a) b7;
                                                                        bVar4.f4157x.c(i11, aVar);
                                                                        aVar.f(i11);
                                                                        bVar4.d(aVar, andDecrement, i11);
                                                                    }
                                                                    bVar4.f4157x.c(andDecrement, null);
                                                                    this.f4141c = 5;
                                                                }
                                                            }
                                                        }
                                                    } catch (Throwable th2) {
                                                        throw th2;
                                                    }
                                                }
                                            }
                                            i8 = 5;
                                            i9 = 3;
                                        }
                                    }
                                }
                            } else {
                                b bVar5 = this.f4146y;
                                bVar5.getClass();
                                if (this.nextParkedWorker == w02) {
                                    do {
                                        atomicLongFieldUpdater = b.f4149y;
                                        j = atomicLongFieldUpdater.get(bVar5);
                                        i7 = this.indexInArray;
                                        this.nextParkedWorker = bVar5.f4157x.b((int) (j & 2097151));
                                    } while (!atomicLongFieldUpdater.compareAndSet(bVar5, j, ((j + 2097152) & (-2097152)) | i7));
                                }
                            }
                        } else {
                            if (z4) {
                                h(3);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.f4143e);
                                this.f4143e = 0L;
                                break;
                            }
                            z4 = true;
                        }
                    }
                }
            }
        }
        h(5);
    }
}
