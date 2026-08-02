package kotlinx.coroutines.scheduling;

import androidx.compose.runtime.u;
import androidx.media3.session.legacy.PlaybackStateCompat;
import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.O;
import kotlinx.coroutines.internal.s;
import kotlinx.coroutines.internal.x;

@SourceDebugExtension({"SMAP\nCoroutineScheduler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler\n+ 2 Tasks.kt\nkotlinx/coroutines/scheduling/TasksKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 5 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 6 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler$Worker\n*L\n1#1,1044:1\n286#1:1047\n284#1:1048\n284#1:1049\n286#1:1050\n281#1:1053\n282#1,5:1054\n292#1:1060\n284#1:1061\n285#1:1062\n284#1:1065\n285#1:1066\n281#1:1067\n289#1:1068\n284#1:1069\n284#1:1072\n285#1:1073\n286#1:1074\n77#2:1045\n77#2:1059\n77#2:1070\n1#3:1046\n27#4:1051\n27#4:1063\n16#5:1052\n16#5:1064\n622#6:1071\n*S KotlinDebug\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler\n*L\n282#1:1047\n289#1:1048\n290#1:1049\n299#1:1050\n348#1:1053\n377#1:1054,5\n400#1:1060\n447#1:1061\n448#1:1062\n484#1:1065\n485#1:1066\n491#1:1067\n500#1:1068\n500#1:1069\n581#1:1072\n582#1:1073\n583#1:1074\n120#1:1045\n397#1:1059\n517#1:1070\n348#1:1051\n480#1:1063\n348#1:1052\n480#1:1064\n524#1:1071\n*E\n"})
/* loaded from: classes5.dex */
public final class a implements Executor, Closeable {
    public static final C0162a Companion = new C0162a();
    public static final /* synthetic */ AtomicLongFieldUpdater j = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater k = AtomicLongFieldUpdater.newUpdater(a.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater l = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated$volatile");

    @JvmField
    public static final x m = new x("NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated$volatile;

    @JvmField
    public final int a;

    @JvmField
    public final int b;

    @JvmField
    public final long c;
    private volatile /* synthetic */ long controlState$volatile;

    @JvmField
    public final String d;

    @JvmField
    public final d e;

    @JvmField
    public final d f;

    @JvmField
    public final s<b> i;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* renamed from: kotlinx.coroutines.scheduling.a$a, reason: collision with other inner class name */
    public static final class C0162a {
    }

    @SourceDebugExtension({"SMAP\nCoroutineScheduler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler$Worker\n+ 2 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Tasks.kt\nkotlinx/coroutines/scheduling/TasksKt\n+ 5 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 6 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n*L\n1#1,1044:1\n298#2,2:1045\n286#2:1047\n300#2,4:1048\n305#2:1052\n295#2,2:1053\n295#2,2:1058\n281#2:1062\n290#2:1063\n284#2:1064\n281#2:1065\n1#3:1055\n77#4:1056\n77#4:1057\n27#5:1060\n16#6:1061\n*S KotlinDebug\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler$Worker\n*L\n687#1:1045,2\n687#1:1047\n687#1:1048,4\n702#1:1052\n776#1:1053,2\n824#1:1058,2\n875#1:1062\n901#1:1063\n901#1:1064\n974#1:1065\n815#1:1056\n818#1:1057\n871#1:1060\n871#1:1061\n*E\n"})
    public final class b extends Thread {
        public static final /* synthetic */ AtomicIntegerFieldUpdater k = AtomicIntegerFieldUpdater.newUpdater(b.class, "workerCtl$volatile");

        @JvmField
        public final k a;
        public final Ref.ObjectRef<g> b;

        @JvmField
        public c c;
        public long d;
        public long e;
        public int f;

        @JvmField
        public boolean i;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        private volatile /* synthetic */ int workerCtl$volatile;

        public b() {
            throw null;
        }

        public b(int i) {
            setDaemon(true);
            setContextClassLoader(a.class.getClassLoader());
            this.a = new k();
            this.b = new Ref.ObjectRef<>();
            this.c = c.d;
            this.nextParkedWorker = a.m;
            int nanoTime = (int) System.nanoTime();
            this.f = nanoTime == 0 ? 42 : nanoTime;
            f(i);
        }

        public final g a(boolean z) {
            g e;
            g e2;
            long j;
            c cVar = this.c;
            c cVar2 = c.a;
            a aVar = a.this;
            g gVar = null;
            k kVar = this.a;
            if (cVar != cVar2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater = a.k;
                do {
                    j = atomicLongFieldUpdater.get(aVar);
                    if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                        kVar.getClass();
                        loop1: while (true) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k.b;
                            g gVar2 = (g) atomicReferenceFieldUpdater.get(kVar);
                            if (gVar2 != null && gVar2.b) {
                                while (!atomicReferenceFieldUpdater.compareAndSet(kVar, gVar2, null)) {
                                    if (atomicReferenceFieldUpdater.get(kVar) != gVar2) {
                                        break;
                                    }
                                }
                                gVar = gVar2;
                                break loop1;
                            }
                        }
                        int i = k.d.get(kVar);
                        int i2 = k.c.get(kVar);
                        while (true) {
                            if (i == i2 || k.e.get(kVar) == 0) {
                                break;
                            }
                            i2--;
                            g c = kVar.c(i2, true);
                            if (c != null) {
                                gVar = c;
                                break;
                            }
                        }
                        if (gVar != null) {
                            return gVar;
                        }
                        g d = aVar.f.d();
                        return d == null ? i(1) : d;
                    }
                } while (!a.k.compareAndSet(aVar, j, j - 4398046511104L));
                this.c = c.a;
            }
            if (z) {
                boolean z2 = d(aVar.a * 2) == 0;
                if (z2 && (e2 = e()) != null) {
                    return e2;
                }
                kVar.getClass();
                g gVar3 = (g) k.b.getAndSet(kVar, null);
                if (gVar3 == null) {
                    gVar3 = kVar.b();
                }
                if (gVar3 != null) {
                    return gVar3;
                }
                if (!z2 && (e = e()) != null) {
                    return e;
                }
            } else {
                g e3 = e();
                if (e3 != null) {
                    return e3;
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

        public final int d(int i) {
            int i2 = this.f;
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >> 17);
            int i5 = i4 ^ (i4 << 5);
            this.f = i5;
            int i6 = i - 1;
            return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
        }

        public final g e() {
            int d = d(2);
            a aVar = a.this;
            if (d == 0) {
                g d2 = aVar.e.d();
                return d2 != null ? d2 : aVar.f.d();
            }
            g d3 = aVar.f.d();
            return d3 != null ? d3 : aVar.e.d();
        }

        public final void f(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(a.this.d);
            sb.append("-worker-");
            sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
            setName(sb.toString());
            this.indexInArray = i;
        }

        public final void g(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean h(c cVar) {
            c cVar2 = this.c;
            boolean z = cVar2 == c.a;
            if (z) {
                a.k.addAndGet(a.this, 4398046511104L);
            }
            if (cVar2 != cVar) {
                this.c = cVar;
            }
            return z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r14v1, types: [T, java.lang.Object, kotlinx.coroutines.scheduling.g] */
        /* JADX WARN: Type inference failed for: r7v14, types: [kotlinx.coroutines.scheduling.g] */
        /* JADX WARN: Type inference failed for: r7v4 */
        /* JADX WARN: Type inference failed for: r7v5, types: [kotlinx.coroutines.scheduling.g] */
        public final g i(int i) {
            long j;
            T t;
            long j2;
            long j3;
            T t2;
            AtomicLongFieldUpdater atomicLongFieldUpdater = a.k;
            a aVar = a.this;
            int i2 = (int) (atomicLongFieldUpdater.get(aVar) & 2097151);
            Object obj = null;
            if (i2 < 2) {
                return null;
            }
            int d = d(i2);
            int i3 = 0;
            long j4 = Long.MAX_VALUE;
            while (i3 < i2) {
                d++;
                if (d > i2) {
                    d = 1;
                }
                b b = aVar.i.b(d);
                if (b != null && b != this) {
                    k kVar = b.a;
                    if (i == 3) {
                        t = kVar.b();
                        j = 0;
                    } else {
                        kVar.getClass();
                        int i4 = k.d.get(kVar);
                        int i5 = k.c.get(kVar);
                        boolean z = i == 1;
                        while (true) {
                            if (i4 == i5) {
                                j = 0;
                                break;
                            }
                            j = 0;
                            if (!z || k.e.get(kVar) != 0) {
                                int i6 = i4 + 1;
                                t = kVar.c(i4, z);
                                if (t != 0) {
                                    break;
                                }
                                i4 = i6;
                            } else {
                                break;
                            }
                        }
                        t = obj;
                    }
                    Ref.ObjectRef<g> objectRef = this.b;
                    if (t != 0) {
                        objectRef.element = t;
                        t2 = obj;
                        j3 = -1;
                        j2 = -1;
                    } else {
                        while (true) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k.b;
                            ?? r14 = (g) atomicReferenceFieldUpdater.get(kVar);
                            if (r14 == 0) {
                                j2 = -1;
                                break;
                            }
                            j2 = -1;
                            if (((r14.b ? 1 : 2) & i) == 0) {
                                break;
                            }
                            i.f.getClass();
                            k kVar2 = kVar;
                            long nanoTime = System.nanoTime() - r14.a;
                            long j5 = i.b;
                            if (nanoTime < j5) {
                                j3 = j5 - nanoTime;
                                t2 = 0;
                                break;
                            }
                            do {
                                t2 = 0;
                                if (atomicReferenceFieldUpdater.compareAndSet(kVar2, r14, null)) {
                                    objectRef.element = r14;
                                    j3 = -1;
                                    break;
                                }
                            } while (atomicReferenceFieldUpdater.get(kVar2) == r14);
                            kVar = kVar2;
                            obj = null;
                        }
                        j3 = -2;
                        t2 = obj;
                    }
                    if (j3 == j2) {
                        g gVar = objectRef.element;
                        objectRef.element = t2;
                        return gVar;
                    }
                    if (j3 > j) {
                        j4 = Math.min(j4, j3);
                    }
                }
                i3++;
                obj = null;
            }
            if (j4 == Long.MAX_VALUE) {
                j4 = 0;
            }
            this.e = j4;
            return null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:80:0x0004, code lost:
        
            continue;
         */
        /* JADX WARN: Code restructure failed: missing block: B:81:0x0004, code lost:
        
            continue;
         */
        /* JADX WARN: Code restructure failed: missing block: B:82:0x0004, code lost:
        
            continue;
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void run() {
            long j;
            loop0: while (true) {
                boolean z = false;
                while (true) {
                    a aVar = a.this;
                    aVar.getClass();
                    if (a.l.get(aVar) == 0) {
                        c cVar = this.c;
                        c cVar2 = c.e;
                        if (cVar == cVar2) {
                            break loop0;
                        }
                        g a = a(this.i);
                        if (a != null) {
                            this.e = 0L;
                            a aVar2 = a.this;
                            this.d = 0L;
                            if (this.c == c.c) {
                                this.c = c.b;
                            }
                            if (a.b) {
                                if (h(c.b) && !aVar2.u() && !aVar2.t(a.k.get(aVar2))) {
                                    aVar2.u();
                                }
                                aVar2.getClass();
                                try {
                                    a.run();
                                } catch (Throwable th) {
                                    Thread currentThread = Thread.currentThread();
                                    currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                                }
                                a.k.addAndGet(aVar2, -2097152L);
                                if (this.c != cVar2) {
                                    this.c = c.d;
                                }
                            } else {
                                aVar2.getClass();
                                try {
                                    a.run();
                                } catch (Throwable th2) {
                                    Thread currentThread2 = Thread.currentThread();
                                    currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
                                }
                            }
                        } else {
                            this.i = false;
                            if (this.e == 0) {
                                Object obj = this.nextParkedWorker;
                                x xVar = a.m;
                                if (obj != xVar) {
                                    k.set(this, -1);
                                    while (this.nextParkedWorker != a.m) {
                                        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = k;
                                        if (atomicIntegerFieldUpdater.get(this) == -1) {
                                            a aVar3 = a.this;
                                            aVar3.getClass();
                                            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = a.l;
                                            if (atomicIntegerFieldUpdater2.get(aVar3) != 0) {
                                                break;
                                            }
                                            c cVar3 = this.c;
                                            c cVar4 = c.e;
                                            if (cVar3 == cVar4) {
                                                break;
                                            }
                                            h(c.c);
                                            Thread.interrupted();
                                            if (this.d == 0) {
                                                j = 2097151;
                                                this.d = System.nanoTime() + a.this.c;
                                            } else {
                                                j = 2097151;
                                            }
                                            LockSupport.parkNanos(a.this.c);
                                            if (System.nanoTime() - this.d >= 0) {
                                                this.d = 0L;
                                                a aVar4 = a.this;
                                                synchronized (aVar4.i) {
                                                    try {
                                                        if (!(atomicIntegerFieldUpdater2.get(aVar4) != 0)) {
                                                            AtomicLongFieldUpdater atomicLongFieldUpdater = a.k;
                                                            if (((int) (atomicLongFieldUpdater.get(aVar4) & j)) > aVar4.a) {
                                                                if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                                    int i = this.indexInArray;
                                                                    f(0);
                                                                    aVar4.s(this, i, 0);
                                                                    int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(aVar4) & j);
                                                                    if (andDecrement != i) {
                                                                        b b = aVar4.i.b(andDecrement);
                                                                        Intrinsics.checkNotNull(b);
                                                                        b bVar = b;
                                                                        aVar4.i.c(i, bVar);
                                                                        bVar.f(i);
                                                                        aVar4.s(bVar, andDecrement, i);
                                                                    }
                                                                    aVar4.i.c(andDecrement, null);
                                                                    Unit unit = Unit.INSTANCE;
                                                                    this.c = cVar4;
                                                                }
                                                            }
                                                        }
                                                    } catch (Throwable th3) {
                                                        throw th3;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    a aVar5 = a.this;
                                    aVar5.getClass();
                                    if (this.nextParkedWorker == xVar) {
                                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = a.j;
                                        while (true) {
                                            long j2 = atomicLongFieldUpdater2.get(aVar5);
                                            long j3 = (j2 + PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) & (-2097152);
                                            int i2 = this.indexInArray;
                                            this.nextParkedWorker = aVar5.i.b((int) (j2 & 2097151));
                                            a aVar6 = aVar5;
                                            if (a.j.compareAndSet(aVar6, j2, j3 | i2)) {
                                                break;
                                            } else {
                                                aVar5 = aVar6;
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (z) {
                                    h(c.c);
                                    Thread.interrupted();
                                    LockSupport.parkNanos(this.e);
                                    this.e = 0L;
                                    break;
                                }
                                z = true;
                            }
                        }
                    } else {
                        break loop0;
                    }
                }
            }
            h(c.e);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        public static final c a;
        public static final c b;
        public static final c c;
        public static final c d;
        public static final c e;
        public static final /* synthetic */ c[] f;
        public static final /* synthetic */ EnumEntries i;

        static {
            c cVar = new c("CPU_ACQUIRED", 0);
            a = cVar;
            c cVar2 = new c("BLOCKING", 1);
            b = cVar2;
            c cVar3 = new c("PARKING", 2);
            c = cVar3;
            c cVar4 = new c("DORMANT", 3);
            d = cVar4;
            c cVar5 = new c("TERMINATED", 4);
            e = cVar5;
            c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5};
            f = cVarArr;
            i = EnumEntriesKt.enumEntries(cVarArr);
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f.clone();
        }
    }

    public a(int i, int i2, long j2, String str) {
        this.a = i;
        this.b = i2;
        this.c = j2;
        this.d = str;
        if (i < 1) {
            throw new IllegalArgumentException(u.a(i, "Core pool size ", " should be at least 1").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.a.a("Max pool size ", i2, " should be greater than or equals to core pool size ", i).toString());
        }
        if (i2 > 2097150) {
            throw new IllegalArgumentException(u.a(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j2 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j2 + " must be positive").toString());
        }
        this.e = new d();
        this.f = new d();
        this.i = new s<>((i + 1) * 2);
        this.controlState$volatile = i << 42;
        this._isTerminated$volatile = 0;
    }

    public static /* synthetic */ void q(a aVar, Runnable runnable, int i) {
        aVar.l(runnable, false, (i & 4) == 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0088, code lost:
    
        if (r1 == null) goto L39;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        int i;
        g d;
        if (l.compareAndSet(this, 0, 1)) {
            Thread currentThread = Thread.currentThread();
            b bVar = currentThread instanceof b ? (b) currentThread : null;
            if (bVar == null || !Intrinsics.areEqual(a.this, this)) {
                bVar = null;
            }
            synchronized (this.i) {
                i = (int) (k.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    b b2 = this.i.b(i2);
                    Intrinsics.checkNotNull(b2);
                    b bVar2 = b2;
                    if (bVar2 != bVar) {
                        while (bVar2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(bVar2);
                            bVar2.join(10000L);
                        }
                        k kVar = bVar2.a;
                        d dVar = this.f;
                        kVar.getClass();
                        g gVar = (g) k.b.getAndSet(kVar, null);
                        if (gVar != null) {
                            dVar.a(gVar);
                        }
                        while (true) {
                            g b3 = kVar.b();
                            if (b3 == null) {
                                break;
                            } else {
                                dVar.a(b3);
                            }
                        }
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.f.b();
            this.e.b();
            while (true) {
                if (bVar != null) {
                    d = bVar.a(true);
                }
                d = this.e.d();
                if (d == null && (d = this.f.d()) == null) {
                    break;
                }
                try {
                    d.run();
                } catch (Throwable th) {
                    Thread currentThread2 = Thread.currentThread();
                    currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
                }
            }
            if (bVar != null) {
                bVar.h(c.e);
            }
            j.set(this, 0L);
            k.set(this, 0L);
        }
    }

    public final int d() {
        synchronized (this.i) {
            try {
                if (l.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = k;
                long j2 = atomicLongFieldUpdater.get(this);
                int i = (int) (j2 & 2097151);
                int coerceAtLeast = RangesKt.coerceAtLeast(i - ((int) ((j2 & 4398044413952L) >> 21)), 0);
                if (coerceAtLeast >= this.a) {
                    return 0;
                }
                if (i >= this.b) {
                    return 0;
                }
                int i2 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i2 <= 0 || this.i.b(i2) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                b bVar = new b(i2);
                this.i.c(i2, bVar);
                if (i2 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i3 = coerceAtLeast + 1;
                bVar.start();
                return i3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        q(this, runnable, 6);
    }

    public final void l(Runnable runnable, boolean z, boolean z2) {
        g hVar;
        c cVar;
        i.f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof g) {
            hVar = (g) runnable;
            hVar.a = nanoTime;
            hVar.b = z;
        } else {
            hVar = new h(runnable, nanoTime, z);
        }
        boolean z3 = hVar.b;
        AtomicLongFieldUpdater atomicLongFieldUpdater = k;
        long addAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) : 0L;
        Thread currentThread = Thread.currentThread();
        b bVar = currentThread instanceof b ? (b) currentThread : null;
        if (bVar == null || !Intrinsics.areEqual(a.this, this)) {
            bVar = null;
        }
        if (bVar != null && (cVar = bVar.c) != c.e && (hVar.b || cVar != c.b)) {
            bVar.i = true;
            k kVar = bVar.a;
            if (z2) {
                hVar = kVar.a(hVar);
            } else {
                kVar.getClass();
                g gVar = (g) k.b.getAndSet(kVar, hVar);
                hVar = gVar == null ? null : kVar.a(gVar);
            }
        }
        if (hVar != null) {
            if (!(hVar.b ? this.f.a(hVar) : this.e.a(hVar))) {
                throw new RejectedExecutionException(androidx.concurrent.futures.a.a(new StringBuilder(), this.d, " was terminated"));
            }
        }
        boolean z4 = z2 && bVar != null;
        if (z3) {
            if (z4 || u() || t(addAndGet)) {
                return;
            }
            u();
            return;
        }
        if (z4 || u() || t(atomicLongFieldUpdater.get(this))) {
            return;
        }
        u();
    }

    public final void s(b bVar, int i, int i2) {
        while (true) {
            long j2 = j.get(this);
            int i3 = (int) (2097151 & j2);
            long j3 = (PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j2) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object c2 = bVar.c();
                    while (true) {
                        if (c2 == m) {
                            i3 = -1;
                            break;
                        }
                        if (c2 == null) {
                            i3 = 0;
                            break;
                        }
                        b bVar2 = (b) c2;
                        int b2 = bVar2.b();
                        if (b2 != 0) {
                            i3 = b2;
                            break;
                        }
                        c2 = bVar2.c();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                if (j.compareAndSet(this, j2, i3 | j3)) {
                    return;
                }
            }
        }
    }

    public final boolean t(long j2) {
        int coerceAtLeast = RangesKt.coerceAtLeast(((int) (2097151 & j2)) - ((int) ((j2 & 4398044413952L) >> 21)), 0);
        int i = this.a;
        if (coerceAtLeast < i) {
            int d = d();
            if (d == 1 && i > 1) {
                d();
            }
            if (d > 0) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        s<b> sVar = this.i;
        int a = sVar.a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < a; i6++) {
            b b2 = sVar.b(i6);
            if (b2 != null) {
                k kVar = b2.a;
                kVar.getClass();
                int i7 = k.b.get(kVar) != null ? (k.c.get(kVar) - k.d.get(kVar)) + 1 : k.c.get(kVar) - k.d.get(kVar);
                int ordinal = b2.c.ordinal();
                if (ordinal == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i7);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (ordinal == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i7);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (ordinal == 2) {
                    i3++;
                } else if (ordinal == 3) {
                    i4++;
                    if (i7 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i7);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (ordinal != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i5++;
                }
            }
        }
        long j2 = k.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.d);
        sb4.append('@');
        sb4.append(O.a(this));
        sb4.append("[Pool Size {core = ");
        int i8 = this.a;
        sb4.append(i8);
        sb4.append(", max = ");
        sb4.append(this.b);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i);
        sb4.append(", blocking = ");
        sb4.append(i2);
        sb4.append(", parked = ");
        sb4.append(i3);
        sb4.append(", dormant = ");
        sb4.append(i4);
        sb4.append(", terminated = ");
        sb4.append(i5);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.e.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j2));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j2) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i8 - ((int) ((j2 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }

    public final boolean u() {
        x xVar;
        int i;
        while (true) {
            long j2 = j.get(this);
            b b2 = this.i.b((int) (2097151 & j2));
            if (b2 == null) {
                b2 = null;
            } else {
                long j3 = (PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j2) & (-2097152);
                Object c2 = b2.c();
                while (true) {
                    xVar = m;
                    if (c2 == xVar) {
                        i = -1;
                        break;
                    }
                    if (c2 == null) {
                        i = 0;
                        break;
                    }
                    b bVar = (b) c2;
                    i = bVar.b();
                    if (i != 0) {
                        break;
                    }
                    c2 = bVar.c();
                }
                if (i >= 0) {
                    if (j.compareAndSet(this, j2, i | j3)) {
                        b2.g(xVar);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (b2 == null) {
                return false;
            }
            if (b.k.compareAndSet(b2, -1, 0)) {
                LockSupport.unpark(b2);
                return true;
            }
        }
    }
}
