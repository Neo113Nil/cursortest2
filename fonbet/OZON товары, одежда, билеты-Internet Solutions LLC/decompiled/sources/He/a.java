package He;

import B0.A0;
import C.o0;
import De.C2857A;
import De.v;
import Sc.o;
import T7.E;
import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;
import org.jetbrains.annotations.NotNull;
import xe.Q;

/* loaded from: classes.dex */
public final class a implements Executor, Closeable {

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f10858h = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack$volatile");

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f10859i = AtomicLongFieldUpdater.newUpdater(a.class, "controlState$volatile");

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f10860j = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated$volatile");

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    public static final C2857A f10861k = new C2857A("NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f10862a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10863b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10864c;
    private volatile /* synthetic */ long controlState$volatile;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f10865d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public final d f10866e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public final d f10867f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    public final v<b> f10868g;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* renamed from: He.a$a, reason: collision with other inner class name */
    /* loaded from: classes10.dex */
    public /* synthetic */ class C0220a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10869a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.PARKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.BLOCKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.CPU_ACQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c.DORMANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[c.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f10869a = iArr;
        }
    }

    public final class b extends Thread {

        /* renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ AtomicIntegerFieldUpdater f10870i = AtomicIntegerFieldUpdater.newUpdater(b.class, "workerCtl$volatile");

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final l f10871a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final M<h> f10872b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public c f10873c;

        /* renamed from: d, reason: collision with root package name */
        private long f10874d;

        /* renamed from: e, reason: collision with root package name */
        private long f10875e;

        /* renamed from: f, reason: collision with root package name */
        private int f10876f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f10877g;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        private volatile /* synthetic */ int workerCtl$volatile;

        private b() {
            throw null;
        }

        public b(int i11) {
            setDaemon(true);
            setContextClassLoader(a.this.getClass().getClassLoader());
            this.f10871a = new l();
            this.f10872b = new M<>();
            this.f10873c = c.DORMANT;
            this.nextParkedWorker = a.f10861k;
            int nanoTime = (int) System.nanoTime();
            this.f10876f = nanoTime == 0 ? 42 : nanoTime;
            g(i11);
        }

        private final h f() {
            int e11 = e(2);
            a aVar = a.this;
            if (e11 == 0) {
                h d11 = aVar.f10866e.d();
                return d11 != null ? d11 : aVar.f10867f.d();
            }
            h d12 = aVar.f10867f.d();
            return d12 != null ? d12 : aVar.f10866e.d();
        }

        private final h j(int i11) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = a.f10859i;
            a aVar = a.this;
            int i12 = (int) (atomicLongFieldUpdater.get(aVar) & 2097151);
            if (i12 < 2) {
                return null;
            }
            int e11 = e(i12);
            long j11 = Long.MAX_VALUE;
            for (int i13 = 0; i13 < i12; i13++) {
                e11++;
                if (e11 > i12) {
                    e11 = 1;
                }
                b b11 = aVar.f10868g.b(e11);
                if (b11 != null && b11 != this) {
                    l lVar = b11.f10871a;
                    M<h> m11 = this.f10872b;
                    long i14 = lVar.i(i11, m11);
                    if (i14 == -1) {
                        h hVar = m11.f71787a;
                        m11.f71787a = null;
                        return hVar;
                    }
                    if (i14 > 0) {
                        j11 = Math.min(j11, i14);
                    }
                }
            }
            if (j11 == Long.MAX_VALUE) {
                j11 = 0;
            }
            this.f10875e = j11;
            return null;
        }

        public final h a(boolean z11) {
            h f7;
            h f11;
            a aVar;
            long j11;
            c cVar = this.f10873c;
            c cVar2 = c.CPU_ACQUIRED;
            l lVar = this.f10871a;
            a aVar2 = a.this;
            if (cVar != cVar2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater = a.f10859i;
                do {
                    aVar = a.this;
                    j11 = atomicLongFieldUpdater.get(aVar);
                    if (((int) ((9223367638808264704L & j11) >> 42)) == 0) {
                        h f12 = lVar.f();
                        if (f12 != null) {
                            return f12;
                        }
                        h d11 = aVar2.f10867f.d();
                        return d11 == null ? j(1) : d11;
                    }
                } while (!a.f10859i.compareAndSet(aVar, j11, j11 - 4398046511104L));
                this.f10873c = c.CPU_ACQUIRED;
            }
            if (z11) {
                boolean z12 = e(aVar2.f10862a * 2) == 0;
                if (z12 && (f11 = f()) != null) {
                    return f11;
                }
                h e11 = lVar.e();
                if (e11 != null) {
                    return e11;
                }
                if (!z12 && (f7 = f()) != null) {
                    return f7;
                }
            } else {
                h f13 = f();
                if (f13 != null) {
                    return f13;
                }
            }
            return j(3);
        }

        public final int b() {
            return this.indexInArray;
        }

        public final Object c() {
            return this.nextParkedWorker;
        }

        public final int e(int i11) {
            int i12 = this.f10876f;
            int i13 = i12 ^ (i12 << 13);
            int i14 = i13 ^ (i13 >> 17);
            int i15 = i14 ^ (i14 << 5);
            this.f10876f = i15;
            int i16 = i11 - 1;
            return (i16 & i11) == 0 ? i15 & i16 : (i15 & Integer.MAX_VALUE) % i11;
        }

        public final void g(int i11) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a.this.f10865d);
            sb2.append("-worker-");
            sb2.append(i11 == 0 ? "TERMINATED" : String.valueOf(i11));
            setName(sb2.toString());
            this.indexInArray = i11;
        }

        public final void h(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean i(@NotNull c cVar) {
            c cVar2 = this.f10873c;
            boolean z11 = cVar2 == c.CPU_ACQUIRED;
            if (z11) {
                a.f10859i.addAndGet(a.this, 4398046511104L);
            }
            if (cVar2 != cVar) {
                this.f10873c = cVar;
            }
            return z11;
        }

        /* JADX WARN: Code restructure failed: missing block: B:69:0x0002, code lost:
        
            continue;
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void run() {
            loop0: while (true) {
                boolean z11 = false;
                while (!a.this.isTerminated()) {
                    c cVar = this.f10873c;
                    c cVar2 = c.TERMINATED;
                    if (cVar == cVar2) {
                        break loop0;
                    }
                    h a11 = a(this.f10877g);
                    if (a11 != null) {
                        this.f10875e = 0L;
                        this.f10874d = 0L;
                        if (this.f10873c == c.PARKING) {
                            this.f10873c = c.BLOCKING;
                        }
                        boolean z12 = a11.f10885b;
                        a aVar = a.this;
                        if (z12) {
                            if (i(c.BLOCKING)) {
                                aVar.p();
                            }
                            aVar.getClass();
                            try {
                                a11.run();
                            } catch (Throwable th2) {
                                Thread currentThread = Thread.currentThread();
                                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th2);
                            }
                            a.f10859i.addAndGet(aVar, -2097152L);
                            if (this.f10873c != cVar2) {
                                this.f10873c = c.DORMANT;
                            }
                        } else {
                            aVar.getClass();
                            try {
                                a11.run();
                            } catch (Throwable th3) {
                                Thread currentThread2 = Thread.currentThread();
                                currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th3);
                            }
                        }
                    } else {
                        this.f10877g = false;
                        if (this.f10875e != 0) {
                            if (z11) {
                                i(c.PARKING);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.f10875e);
                                this.f10875e = 0L;
                            } else {
                                z11 = true;
                            }
                        } else if (this.nextParkedWorker != a.f10861k) {
                            f10870i.set(this, -1);
                            while (this.nextParkedWorker != a.f10861k) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f10870i;
                                if (atomicIntegerFieldUpdater.get(this) == -1 && !a.this.isTerminated()) {
                                    c cVar3 = this.f10873c;
                                    c cVar4 = c.TERMINATED;
                                    if (cVar3 == cVar4) {
                                        break;
                                    }
                                    i(c.PARKING);
                                    Thread.interrupted();
                                    if (this.f10874d == 0) {
                                        this.f10874d = System.nanoTime() + a.this.f10864c;
                                    }
                                    LockSupport.parkNanos(a.this.f10864c);
                                    if (System.nanoTime() - this.f10874d >= 0) {
                                        this.f10874d = 0L;
                                        a aVar2 = a.this;
                                        synchronized (aVar2.f10868g) {
                                            try {
                                                if (!aVar2.isTerminated()) {
                                                    if (((int) (a.f10859i.get(aVar2) & 2097151)) > aVar2.f10862a) {
                                                        if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                            int i11 = this.indexInArray;
                                                            g(0);
                                                            aVar2.o(this, i11, 0);
                                                            int andDecrement = (int) (a.f10859i.getAndDecrement(aVar2) & 2097151);
                                                            if (andDecrement != i11) {
                                                                b b11 = aVar2.f10868g.b(andDecrement);
                                                                Intrinsics.f(b11);
                                                                b bVar = b11;
                                                                aVar2.f10868g.c(i11, bVar);
                                                                bVar.g(i11);
                                                                aVar2.o(bVar, andDecrement, i11);
                                                            }
                                                            aVar2.f10868g.c(andDecrement, null);
                                                            Unit unit = Unit.f71690a;
                                                            this.f10873c = cVar4;
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th4) {
                                                throw th4;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            a.this.m(this);
                        }
                    }
                }
                break loop0;
            }
            i(c.TERMINATED);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        public static final c BLOCKING;
        public static final c CPU_ACQUIRED;
        public static final c DORMANT;
        public static final c PARKING;
        public static final c TERMINATED;

        static {
            c cVar = new c("CPU_ACQUIRED", 0);
            CPU_ACQUIRED = cVar;
            c cVar2 = new c("BLOCKING", 1);
            BLOCKING = cVar2;
            c cVar3 = new c("PARKING", 2);
            PARKING = cVar3;
            c cVar4 = new c("DORMANT", 3);
            DORMANT = cVar4;
            c cVar5 = new c("TERMINATED", 4);
            TERMINATED = cVar5;
            c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5};
            $VALUES = cVarArr;
            $ENTRIES = Xc.b.a(cVarArr);
        }

        private c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }
    }

    public a(long j11, int i11, int i12, @NotNull String str) {
        this.f10862a = i11;
        this.f10863b = i12;
        this.f10864c = j11;
        this.f10865d = str;
        if (i11 < 1) {
            throw new IllegalArgumentException(E.a(i11, "Core pool size ", " should be at least 1").toString());
        }
        if (i12 < i11) {
            throw new IllegalArgumentException(A0.a(i12, i11, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i12 > 2097150) {
            throw new IllegalArgumentException(E.a(i12, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j11 <= 0) {
            throw new IllegalArgumentException(Sh.b.b(j11, "Idle worker keep alive time ", " must be positive").toString());
        }
        this.f10866e = new d();
        this.f10867f = new d();
        this.f10868g = new v<>((i11 + 1) * 2);
        this.controlState$volatile = i11 << 42;
        this._isTerminated$volatile = 0;
    }

    private final int d() {
        synchronized (this.f10868g) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f10859i;
                long j11 = atomicLongFieldUpdater.get(this);
                int i11 = (int) (j11 & 2097151);
                int i12 = i11 - ((int) ((j11 & 4398044413952L) >> 21));
                if (i12 < 0) {
                    i12 = 0;
                }
                if (i12 >= this.f10862a) {
                    return 0;
                }
                if (i11 >= this.f10863b) {
                    return 0;
                }
                int i13 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i13 <= 0 || this.f10868g.b(i13) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                b bVar = new b(i13);
                this.f10868g.c(i13, bVar);
                if (i13 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i14 = i12 + 1;
                bVar.start();
                return i14;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static /* synthetic */ void k(a aVar, Runnable runnable, int i11) {
        aVar.j(runnable, false, (i11 & 4) == 0);
    }

    private final boolean q(long j11) {
        int i11 = ((int) (2097151 & j11)) - ((int) ((j11 & 4398044413952L) >> 21));
        if (i11 < 0) {
            i11 = 0;
        }
        int i12 = this.f10862a;
        if (i11 < i12) {
            int d11 = d();
            if (d11 == 1 && i12 > 1) {
                d();
            }
            if (d11 > 0) {
                return true;
            }
        }
        return false;
    }

    private final boolean r() {
        C2857A c2857a;
        int i11;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f10858h;
            long j11 = atomicLongFieldUpdater.get(this);
            b b11 = this.f10868g.b((int) (2097151 & j11));
            if (b11 == null) {
                b11 = null;
            } else {
                long j12 = (2097152 + j11) & (-2097152);
                Object c11 = b11.c();
                while (true) {
                    c2857a = f10861k;
                    if (c11 == c2857a) {
                        i11 = -1;
                        break;
                    }
                    if (c11 == null) {
                        i11 = 0;
                        break;
                    }
                    b bVar = (b) c11;
                    i11 = bVar.b();
                    if (i11 != 0) {
                        break;
                    }
                    c11 = bVar.c();
                }
                if (i11 >= 0 && atomicLongFieldUpdater.compareAndSet(this, j11, j12 | i11)) {
                    b11.h(c2857a);
                }
            }
            if (b11 == null) {
                return false;
            }
            if (b.f10870i.compareAndSet(b11, -1, 0)) {
                LockSupport.unpark(b11);
                return true;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x006f, code lost:
    
        if (r0 == null) goto L32;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        int i11;
        h d11;
        if (f10860j.compareAndSet(this, 0, 1)) {
            Thread currentThread = Thread.currentThread();
            b bVar = null;
            b bVar2 = currentThread instanceof b ? (b) currentThread : null;
            if (bVar2 != null && Intrinsics.d(a.this, this)) {
                bVar = bVar2;
            }
            synchronized (this.f10868g) {
                i11 = (int) (f10859i.get(this) & 2097151);
            }
            if (1 <= i11) {
                int i12 = 1;
                while (true) {
                    b b11 = this.f10868g.b(i12);
                    Intrinsics.f(b11);
                    b bVar3 = b11;
                    if (bVar3 != bVar) {
                        while (bVar3.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(bVar3);
                            bVar3.join(10000L);
                        }
                        bVar3.f10871a.d(this.f10867f);
                    }
                    if (i12 == i11) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
            this.f10867f.b();
            this.f10866e.b();
            while (true) {
                if (bVar != null) {
                    d11 = bVar.a(true);
                }
                d11 = this.f10866e.d();
                if (d11 == null && (d11 = this.f10867f.d()) == null) {
                    break;
                }
                try {
                    d11.run();
                } catch (Throwable th2) {
                    Thread currentThread2 = Thread.currentThread();
                    currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
                }
            }
            if (bVar != null) {
                bVar.i(c.TERMINATED);
            }
            f10858h.set(this, 0L);
            f10859i.set(this, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@NotNull Runnable runnable) {
        k(this, runnable, 6);
    }

    public final boolean isTerminated() {
        return f10860j.get(this) != 0;
    }

    public final void j(@NotNull Runnable runnable, boolean z11, boolean z12) {
        h iVar;
        c cVar;
        j.f10892f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof h) {
            iVar = (h) runnable;
            iVar.f10884a = nanoTime;
            iVar.f10885b = z11;
        } else {
            iVar = new i(runnable, nanoTime, z11);
        }
        boolean z13 = iVar.f10885b;
        long addAndGet = z13 ? f10859i.addAndGet(this, 2097152L) : 0L;
        Thread currentThread = Thread.currentThread();
        b bVar = null;
        b bVar2 = currentThread instanceof b ? (b) currentThread : null;
        if (bVar2 != null && Intrinsics.d(a.this, this)) {
            bVar = bVar2;
        }
        if (bVar != null && (cVar = bVar.f10873c) != c.TERMINATED && (iVar.f10885b || cVar != c.BLOCKING)) {
            bVar.f10877g = true;
            iVar = bVar.f10871a.a(iVar, z12);
        }
        if (iVar != null) {
            if (!(iVar.f10885b ? this.f10867f.a(iVar) : this.f10866e.a(iVar))) {
                throw new RejectedExecutionException(o0.c(new StringBuilder(), this.f10865d, " was terminated"));
            }
        }
        boolean z14 = z12 && bVar != null;
        if (!z13) {
            if (z14) {
                return;
            }
            p();
        } else {
            if (z14 || r() || q(addAndGet)) {
                return;
            }
            r();
        }
    }

    public final void m(@NotNull b bVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j11;
        int b11;
        if (bVar.c() != f10861k) {
            return;
        }
        do {
            atomicLongFieldUpdater = f10858h;
            j11 = atomicLongFieldUpdater.get(this);
            b11 = bVar.b();
            bVar.h(this.f10868g.b((int) (2097151 & j11)));
        } while (!atomicLongFieldUpdater.compareAndSet(this, j11, ((2097152 + j11) & (-2097152)) | b11));
    }

    public final void o(@NotNull b bVar, int i11, int i12) {
        while (true) {
            long j11 = f10858h.get(this);
            int i13 = (int) (2097151 & j11);
            long j12 = (2097152 + j11) & (-2097152);
            if (i13 == i11) {
                if (i12 == 0) {
                    Object c11 = bVar.c();
                    while (true) {
                        if (c11 == f10861k) {
                            i13 = -1;
                            break;
                        }
                        if (c11 == null) {
                            i13 = 0;
                            break;
                        }
                        b bVar2 = (b) c11;
                        int b11 = bVar2.b();
                        if (b11 != 0) {
                            i13 = b11;
                            break;
                        }
                        c11 = bVar2.c();
                    }
                } else {
                    i13 = i12;
                }
            }
            if (i13 >= 0) {
                if (f10858h.compareAndSet(this, j11, i13 | j12)) {
                    return;
                }
            }
        }
    }

    public final void p() {
        if (r() || q(f10859i.get(this))) {
            return;
        }
        r();
    }

    @NotNull
    public final String toString() {
        ArrayList arrayList = new ArrayList();
        v<b> vVar = this.f10868g;
        int a11 = vVar.a();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 1; i16 < a11; i16++) {
            b b11 = vVar.b(i16);
            if (b11 != null) {
                int c11 = b11.f10871a.c();
                int i17 = C0220a.f10869a[b11.f10873c.ordinal()];
                if (i17 == 1) {
                    i13++;
                } else if (i17 == 2) {
                    i12++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(c11);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (i17 == 3) {
                    i11++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(c11);
                    sb3.append('c');
                    arrayList.add(sb3.toString());
                } else if (i17 == 4) {
                    i14++;
                    if (c11 > 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(c11);
                        sb4.append('d');
                        arrayList.add(sb4.toString());
                    }
                } else {
                    if (i17 != 5) {
                        throw new o();
                    }
                    i15++;
                }
            }
        }
        long j11 = f10859i.get(this);
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.f10865d);
        sb5.append('@');
        sb5.append(Q.a(this));
        sb5.append("[Pool Size {core = ");
        int i18 = this.f10862a;
        sb5.append(i18);
        sb5.append(", max = ");
        Ek.a.f(this.f10863b, i11, "}, Worker States {CPU = ", ", blocking = ", sb5);
        Ek.a.f(i12, i13, ", parked = ", ", dormant = ", sb5);
        Ek.a.f(i14, i15, ", terminated = ", "}, running workers queues = ", sb5);
        sb5.append(arrayList);
        sb5.append(", global CPU queue size = ");
        sb5.append(this.f10866e.c());
        sb5.append(", global blocking queue size = ");
        sb5.append(this.f10867f.c());
        sb5.append(", Control State {created workers= ");
        sb5.append((int) (2097151 & j11));
        sb5.append(", blocking tasks = ");
        sb5.append((int) ((4398044413952L & j11) >> 21));
        sb5.append(", CPUs acquired = ");
        sb5.append(i18 - ((int) ((j11 & 9223367638808264704L) >> 42)));
        sb5.append("}]");
        return sb5.toString();
    }
}
