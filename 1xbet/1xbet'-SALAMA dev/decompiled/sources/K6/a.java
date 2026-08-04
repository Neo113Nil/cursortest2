package K6;

import F2.W0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import t6.p;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends Thread {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f4138z = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f4139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f4140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f4142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f4143e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4144f;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile int workerCtl;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f4145x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ b f4146y;

    public a(b bVar, int i7) {
        this.f4146y = bVar;
        setDaemon(true);
        this.f4139a = new l();
        this.f4140b = new p();
        this.f4141c = 4;
        this.nextParkedWorker = b.f4148B;
        x6.d.f18100a.getClass();
        this.f4144f = x6.d.f18101b.a().nextInt();
        f(i7);
    }

    public final h a(boolean z4) {
        h hVarE;
        h hVarE2;
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
                        if (hVar2 == null || hVar2.f4164b.f12371a != 1) {
                            int i8 = l.f4177d.get(lVar);
                            int i9 = l.f4176c.get(lVar);
                            while (i8 != i9 && l.f4178e.get(lVar) != 0) {
                                i9--;
                                h hVarC = lVar.c(i9, true);
                                if (hVarC != null) {
                                    hVar = hVarC;
                                    break;
                                }
                            }
                            break;
                        }
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(lVar, hVar2, null)) {
                                hVar = hVar2;
                                break loop1;
                            }
                        } while (atomicReferenceFieldUpdater.get(lVar) == hVar2);
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
            if (z7 && (hVarE2 = e()) != null) {
                return hVarE2;
            }
            lVar.getClass();
            h hVarB = (h) l.f4175b.getAndSet(lVar, null);
            if (hVarB == null) {
                hVarB = lVar.b();
            }
            if (hVarB != null) {
                return hVarB;
            }
            if (!z7 && (hVarE = e()) != null) {
                return hVarE;
            }
        } else {
            h hVarE3 = e();
            if (hVarE3 != null) {
                return hVarE3;
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
        int iD = d(2);
        b bVar = this.f4146y;
        if (iD == 0) {
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

    /* JADX WARN: Code duplicated, block: B:53:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00df A[SYNTHETIC] */
    public final h i(int i7) {
        int i8;
        h hVarC;
        long j;
        AtomicLongFieldUpdater atomicLongFieldUpdater = b.f4150z;
        b bVar = this.f4146y;
        int i9 = (int) (atomicLongFieldUpdater.get(bVar) & 2097151);
        h hVar = null;
        if (i9 < 2) {
            return null;
        }
        int iD = d(i9);
        int i10 = 0;
        long jMin = Long.MAX_VALUE;
        while (i10 < i9) {
            int i11 = iD + 1;
            if (i11 > i9) {
                i11 = 1;
            }
            a aVar = (a) bVar.f4157x.b(i11);
            if (aVar == null || aVar == this) {
                i8 = i11;
            } else {
                l lVar = aVar.f4139a;
                if (i7 != 3) {
                    lVar.getClass();
                    int i12 = l.f4177d.get(lVar);
                    int i13 = l.f4176c.get(lVar);
                    boolean z4 = i7 == 1;
                    while (true) {
                        if (i12 != i13 && (!z4 || l.f4178e.get(lVar) != 0)) {
                            int i14 = i12 + 1;
                            hVarC = lVar.c(i12, z4);
                            if (hVarC != null) {
                                break;
                            }
                            i12 = i14;
                        } else {
                            hVarC = hVar;
                            break;
                        }
                    }
                } else {
                    hVarC = lVar.b();
                }
                p pVar = this.f4140b;
                if (hVarC != null) {
                    pVar.f16478a = hVarC;
                    i8 = i11;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l.f4175b;
                        h hVar2 = (h) atomicReferenceFieldUpdater.get(lVar);
                        if (hVar2 != null) {
                            if (((hVar2.f4164b.f12371a == 1 ? 1 : 2) & i7) != 0) {
                                j.f4171f.getClass();
                                i8 = i11;
                                long jNanoTime = System.nanoTime() - hVar2.f4163a;
                                long j3 = j.f4167b;
                                if (jNanoTime < j3) {
                                    j = j3 - jNanoTime;
                                    hVar = null;
                                    break;
                                }
                                while (true) {
                                    hVar = null;
                                    if (atomicReferenceFieldUpdater.compareAndSet(lVar, hVar2, null)) {
                                        pVar.f16478a = hVar2;
                                    } else if (atomicReferenceFieldUpdater.get(lVar) != hVar2) {
                                        i11 = i8;
                                        hVar = null;
                                    }
                                }
                            }
                        }
                        i8 = i11;
                        j = -2;
                        break;
                    }
                    if (j == -1) {
                        h hVar3 = (h) pVar.f16478a;
                        pVar.f16478a = hVar;
                        return hVar3;
                    }
                    if (j > 0) {
                        jMin = Math.min(jMin, j);
                    }
                }
                j = -1;
                if (j == -1) {
                    h hVar4 = (h) pVar.f16478a;
                    pVar.f16478a = hVar;
                    return hVar4;
                }
                if (j > 0) {
                    jMin = Math.min(jMin, j);
                }
            }
            i10++;
            iD = i8;
            hVar = null;
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.f4143e = jMin;
        return null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
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
                if (b.f4147A.get(bVar) != 0 || this.f4141c == 5) {
                    break loop0;
                }
                h hVarA = a(this.f4145x);
                int i9 = 3;
                if (hVarA == null) {
                    this.f4145x = false;
                    if (this.f4143e == 0) {
                        Object obj = this.nextParkedWorker;
                        W0 w7 = b.f4148B;
                        if (obj != w7) {
                            f4138z.set(this, -1);
                            while (this.nextParkedWorker != b.f4148B) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f4138z;
                                if (atomicIntegerFieldUpdater.get(this) != -1) {
                                    break;
                                }
                                b bVar2 = this.f4146y;
                                bVar2.getClass();
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = b.f4147A;
                                if (atomicIntegerFieldUpdater2.get(bVar2) != 0 || this.f4141c == i8) {
                                    break;
                                }
                                h(i9);
                                Thread.interrupted();
                                if (this.f4142d == 0) {
                                    this.f4142d = System.nanoTime() + this.f4146y.f4153c;
                                }
                                LockSupport.parkNanos(this.f4146y.f4153c);
                                if (System.nanoTime() - this.f4142d >= 0) {
                                    this.f4142d = 0L;
                                    b bVar3 = this.f4146y;
                                    synchronized (bVar3.f4157x) {
                                        try {
                                            if (!(atomicIntegerFieldUpdater2.get(bVar3) != 0)) {
                                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = b.f4150z;
                                                if (((int) (atomicLongFieldUpdater2.get(bVar3) & 2097151)) > bVar3.f4151a) {
                                                    if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                        int i10 = this.indexInArray;
                                                        f(0);
                                                        bVar3.d(this, i10, 0);
                                                        int andDecrement = (int) (atomicLongFieldUpdater2.getAndDecrement(bVar3) & 2097151);
                                                        if (andDecrement != i10) {
                                                            Object objB = bVar3.f4157x.b(andDecrement);
                                                            t6.h.b(objB);
                                                            a aVar = (a) objB;
                                                            bVar3.f4157x.c(i10, aVar);
                                                            aVar.f(i10);
                                                            bVar3.d(aVar, andDecrement, i10);
                                                        }
                                                        bVar3.f4157x.c(andDecrement, null);
                                                        this.f4141c = 5;
                                                    }
                                                }
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                }
                                i8 = 5;
                                i9 = 3;
                            }
                        } else {
                            b bVar4 = this.f4146y;
                            bVar4.getClass();
                            if (this.nextParkedWorker == w7) {
                                do {
                                    atomicLongFieldUpdater = b.f4149y;
                                    j = atomicLongFieldUpdater.get(bVar4);
                                    i7 = this.indexInArray;
                                    this.nextParkedWorker = bVar4.f4157x.b((int) (j & 2097151));
                                } while (!atomicLongFieldUpdater.compareAndSet(bVar4, j, ((j + 2097152) & (-2097152)) | ((long) i7)));
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
                } else {
                    this.f4143e = 0L;
                    int i11 = hVarA.f4164b.f12371a;
                    this.f4142d = 0L;
                    if (this.f4141c == 3) {
                        this.f4141c = 2;
                    }
                    b bVar5 = this.f4146y;
                    if (i11 != 0 && h(2) && !bVar5.f() && !bVar5.e(b.f4150z.get(bVar5))) {
                        bVar5.f();
                    }
                    bVar5.getClass();
                    try {
                        hVarA.run();
                    } catch (Throwable th2) {
                        Thread threadCurrentThread = Thread.currentThread();
                        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
                    }
                    if (i11 != 0) {
                        b.f4150z.addAndGet(bVar5, -2097152L);
                        if (this.f4141c == 5) {
                            break;
                        }
                        this.f4141c = 4;
                        break;
                    }
                    break;
                }
            }
        }
        h(5);
    }
}
