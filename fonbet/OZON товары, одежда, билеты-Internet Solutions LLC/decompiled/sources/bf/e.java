package bf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class e {

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    public static final e f55976h = new e(new b(Ye.b.y(Ye.b.f34906g + " TaskRunner", true)));

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private static final Logger f55977i;

    /* renamed from: a, reason: collision with root package name */
    private int f55978a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f55979b;

    /* renamed from: c, reason: collision with root package name */
    private long f55980c;

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList f55981d;

    /* renamed from: e, reason: collision with root package name */
    private final ArrayList f55982e;

    /* renamed from: f, reason: collision with root package name */
    private final f f55983f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final b f55984g;

    public interface a {
    }

    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        private final ThreadPoolExecutor f55985a;

        public b(@NotNull ThreadFactory threadFactory) {
            Intrinsics.checkNotNullParameter(threadFactory, "threadFactory");
            this.f55985a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        public final void a(@NotNull f runnable) {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            this.f55985a.execute(runnable);
        }

        public final void b() {
            this.f55985a.shutdown();
        }
    }

    static {
        Logger logger = Logger.getLogger(e.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "Logger.getLogger(TaskRunner::class.java.name)");
        f55977i = logger;
    }

    public e(@NotNull b backend) {
        Intrinsics.checkNotNullParameter(backend, "backend");
        this.f55984g = backend;
        this.f55978a = 10000;
        this.f55981d = new ArrayList();
        this.f55982e = new ArrayList();
        this.f55983f = new f(this);
    }

    public static final void b(e eVar, AbstractC5657a abstractC5657a) {
        eVar.getClass();
        byte[] bArr = Ye.b.f34900a;
        Thread currentThread = Thread.currentThread();
        Intrinsics.checkNotNullExpressionValue(currentThread, "currentThread");
        String name = currentThread.getName();
        currentThread.setName(abstractC5657a.b());
        try {
            long f7 = abstractC5657a.f();
            synchronized (eVar) {
                eVar.d(abstractC5657a, f7);
                Unit unit = Unit.f71690a;
            }
            currentThread.setName(name);
        } catch (Throwable th2) {
            synchronized (eVar) {
                eVar.d(abstractC5657a, -1L);
                Unit unit2 = Unit.f71690a;
                currentThread.setName(name);
                throw th2;
            }
        }
    }

    private final void d(AbstractC5657a abstractC5657a, long j11) {
        byte[] bArr = Ye.b.f34900a;
        c d11 = abstractC5657a.d();
        Intrinsics.f(d11);
        if (d11.c() != abstractC5657a) {
            throw new IllegalStateException("Check failed.");
        }
        boolean d12 = d11.d();
        d11.n();
        d11.m(null);
        this.f55981d.remove(d11);
        if (j11 != -1 && !d12 && !d11.g()) {
            d11.l(abstractC5657a, j11, true);
        }
        if (d11.e().isEmpty()) {
            return;
        }
        this.f55982e.add(d11);
    }

    @NotNull
    public final ArrayList c() {
        ArrayList p02;
        synchronized (this) {
            p02 = C7714v.p0(this.f55982e, this.f55981d);
        }
        return p02;
    }

    public final AbstractC5657a e() {
        long j11;
        AbstractC5657a abstractC5657a;
        boolean z11;
        byte[] bArr = Ye.b.f34900a;
        while (true) {
            ArrayList arrayList = this.f55982e;
            if (arrayList.isEmpty()) {
                return null;
            }
            b bVar = this.f55984g;
            long nanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long j12 = Long.MAX_VALUE;
            AbstractC5657a abstractC5657a2 = null;
            while (true) {
                if (!it.hasNext()) {
                    j11 = nanoTime;
                    abstractC5657a = null;
                    z11 = false;
                    break;
                }
                AbstractC5657a abstractC5657a3 = (AbstractC5657a) ((c) it.next()).e().get(0);
                j11 = nanoTime;
                abstractC5657a = null;
                long max = Math.max(0L, abstractC5657a3.c() - j11);
                if (max > 0) {
                    j12 = Math.min(max, j12);
                } else {
                    if (abstractC5657a2 != null) {
                        z11 = true;
                        break;
                    }
                    abstractC5657a2 = abstractC5657a3;
                }
                nanoTime = j11;
            }
            ArrayList arrayList2 = this.f55981d;
            if (abstractC5657a2 != null) {
                byte[] bArr2 = Ye.b.f34900a;
                abstractC5657a2.g(-1L);
                c d11 = abstractC5657a2.d();
                Intrinsics.f(d11);
                d11.e().remove(abstractC5657a2);
                arrayList.remove(d11);
                d11.m(abstractC5657a2);
                arrayList2.add(d11);
                if (z11 || (!this.f55979b && !arrayList.isEmpty())) {
                    bVar.a(this.f55983f);
                }
                return abstractC5657a2;
            }
            if (this.f55979b) {
                if (j12 >= this.f55980c - j11) {
                    return abstractC5657a;
                }
                Intrinsics.checkNotNullParameter(this, "taskRunner");
                notify();
                return abstractC5657a;
            }
            this.f55979b = true;
            this.f55980c = j11 + j12;
            try {
                try {
                    Intrinsics.checkNotNullParameter(this, "taskRunner");
                    long j13 = j12 / 1000000;
                    long j14 = j12 - (1000000 * j13);
                    if (j13 > 0 || j12 > 0) {
                        wait(j13, (int) j14);
                    }
                } catch (InterruptedException unused) {
                    for (int size = arrayList2.size() - 1; size >= 0; size--) {
                        ((c) arrayList2.get(size)).b();
                    }
                    for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                        c cVar = (c) arrayList.get(size2);
                        cVar.b();
                        if (cVar.e().isEmpty()) {
                            arrayList.remove(size2);
                        }
                    }
                }
            } finally {
                this.f55979b = false;
            }
        }
    }

    @NotNull
    public final a f() {
        return this.f55984g;
    }

    public final void g(@NotNull c taskQueue) {
        Intrinsics.checkNotNullParameter(taskQueue, "taskQueue");
        byte[] bArr = Ye.b.f34900a;
        if (taskQueue.c() == null) {
            boolean isEmpty = taskQueue.e().isEmpty();
            ArrayList addIfAbsent = this.f55982e;
            if (isEmpty) {
                addIfAbsent.remove(taskQueue);
            } else {
                Intrinsics.checkNotNullParameter(addIfAbsent, "$this$addIfAbsent");
                if (!addIfAbsent.contains(taskQueue)) {
                    addIfAbsent.add(taskQueue);
                }
            }
        }
        boolean z11 = this.f55979b;
        b bVar = this.f55984g;
        if (!z11) {
            bVar.a(this.f55983f);
        } else {
            Intrinsics.checkNotNullParameter(this, "taskRunner");
            notify();
        }
    }

    @NotNull
    public final c h() {
        int i11;
        synchronized (this) {
            i11 = this.f55978a;
            this.f55978a = i11 + 1;
        }
        return new c(this, Ej.b.a(i11, "Q"));
    }
}
