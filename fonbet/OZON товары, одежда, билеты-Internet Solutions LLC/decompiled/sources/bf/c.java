package bf;

import C.o0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private boolean f55968a;

    /* renamed from: b, reason: collision with root package name */
    private AbstractC5657a f55969b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ArrayList f55970c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f55971d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final e f55972e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final String f55973f;

    /* loaded from: classes10.dex */
    private static final class a extends AbstractC5657a {

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        private final CountDownLatch f55974e;

        public a() {
            super(o0.c(new StringBuilder(), Ye.b.f34906g, " awaitIdle"), false);
            this.f55974e = new CountDownLatch(1);
        }

        @Override // bf.AbstractC5657a
        public final long f() {
            this.f55974e.countDown();
            return -1L;
        }

        @NotNull
        public final CountDownLatch h() {
            return this.f55974e;
        }
    }

    public c(@NotNull e taskRunner, @NotNull String name) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f55972e = taskRunner;
        this.f55973f = name;
        this.f55970c = new ArrayList();
    }

    public final void a() {
        byte[] bArr = Ye.b.f34900a;
        synchronized (this.f55972e) {
            try {
                if (b()) {
                    this.f55972e.g(this);
                }
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean b() {
        Logger logger;
        AbstractC5657a abstractC5657a = this.f55969b;
        if (abstractC5657a != null && abstractC5657a.a()) {
            this.f55971d = true;
        }
        ArrayList arrayList = this.f55970c;
        boolean z11 = false;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((AbstractC5657a) arrayList.get(size)).a()) {
                AbstractC5657a abstractC5657a2 = (AbstractC5657a) arrayList.get(size);
                logger = e.f55977i;
                if (logger.isLoggable(Level.FINE)) {
                    C5658b.a(abstractC5657a2, this, "canceled");
                }
                arrayList.remove(size);
                z11 = true;
            }
        }
        return z11;
    }

    public final AbstractC5657a c() {
        return this.f55969b;
    }

    public final boolean d() {
        return this.f55971d;
    }

    @NotNull
    public final ArrayList e() {
        return this.f55970c;
    }

    @NotNull
    public final String f() {
        return this.f55973f;
    }

    public final boolean g() {
        return this.f55968a;
    }

    @NotNull
    public final e h() {
        return this.f55972e;
    }

    @NotNull
    public final CountDownLatch i() {
        synchronized (this.f55972e) {
            if (this.f55969b == null && this.f55970c.isEmpty()) {
                return new CountDownLatch(0);
            }
            AbstractC5657a abstractC5657a = this.f55969b;
            if (abstractC5657a instanceof a) {
                return ((a) abstractC5657a).h();
            }
            Iterator it = this.f55970c.iterator();
            while (it.hasNext()) {
                AbstractC5657a abstractC5657a2 = (AbstractC5657a) it.next();
                if (abstractC5657a2 instanceof a) {
                    return ((a) abstractC5657a2).h();
                }
            }
            a aVar = new a();
            if (l(aVar, 0L, false)) {
                this.f55972e.g(this);
            }
            return aVar.h();
        }
    }

    public final void j(@NotNull AbstractC5657a task, long j11) {
        Logger logger;
        Logger logger2;
        Intrinsics.checkNotNullParameter(task, "task");
        synchronized (this.f55972e) {
            if (!this.f55968a) {
                if (l(task, j11, false)) {
                    this.f55972e.g(this);
                }
                Unit unit = Unit.f71690a;
            } else if (task.a()) {
                logger2 = e.f55977i;
                if (logger2.isLoggable(Level.FINE)) {
                    C5658b.a(task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                logger = e.f55977i;
                if (logger.isLoggable(Level.FINE)) {
                    C5658b.a(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean l(@NotNull AbstractC5657a task, long j11, boolean z11) {
        Logger logger;
        Logger logger2;
        Intrinsics.checkNotNullParameter(task, "task");
        task.e(this);
        this.f55972e.getClass();
        long nanoTime = System.nanoTime();
        long j12 = nanoTime + j11;
        ArrayList arrayList = this.f55970c;
        int indexOf = arrayList.indexOf(task);
        if (indexOf != -1) {
            if (task.c() <= j12) {
                logger2 = e.f55977i;
                if (logger2.isLoggable(Level.FINE)) {
                    C5658b.a(task, this, "already scheduled");
                    return false;
                }
            }
            arrayList.remove(indexOf);
        }
        task.g(j12);
        logger = e.f55977i;
        if (logger.isLoggable(Level.FINE)) {
            C5658b.a(task, this, z11 ? "run again after ".concat(C5658b.b(j12 - nanoTime)) : "scheduled after ".concat(C5658b.b(j12 - nanoTime)));
        }
        Iterator it = arrayList.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            if (((AbstractC5657a) it.next()).c() - nanoTime > j11) {
                break;
            }
            i11++;
        }
        if (i11 == -1) {
            i11 = arrayList.size();
        }
        arrayList.add(i11, task);
        return i11 == 0;
    }

    public final void m(AbstractC5657a abstractC5657a) {
        this.f55969b = abstractC5657a;
    }

    public final void n() {
        this.f55971d = false;
    }

    public final void o() {
        byte[] bArr = Ye.b.f34900a;
        synchronized (this.f55972e) {
            try {
                this.f55968a = true;
                if (b()) {
                    this.f55972e.g(this);
                }
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NotNull
    public final String toString() {
        return this.f55973f;
    }
}
