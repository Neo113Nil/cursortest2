package W4;

import U4.e;
import V0.j;
import e5.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.i;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final d f3426a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3427b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3428c;

    /* renamed from: d, reason: collision with root package name */
    public a f3429d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f3430e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3431f;

    public c(d taskRunner, String name) {
        i.e(taskRunner, "taskRunner");
        i.e(name, "name");
        this.f3426a = taskRunner;
        this.f3427b = name;
        this.f3430e = new ArrayList();
    }

    public static void c(c cVar, String name, InterfaceC1430a block) {
        cVar.getClass();
        i.e(name, "name");
        i.e(block, "block");
        cVar.d(new b(name, true, block), 0L);
    }

    public final void a() {
        d dVar = this.f3426a;
        TimeZone timeZone = e.f3179a;
        synchronized (dVar) {
            if (b()) {
                this.f3426a.c(this);
            }
        }
    }

    public final boolean b() {
        a aVar = this.f3429d;
        if (aVar != null && aVar.f3421b) {
            this.f3431f = true;
        }
        ArrayList arrayList = this.f3430e;
        boolean z = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((a) arrayList.get(size)).f3421b) {
                Logger logger = this.f3426a.f3435b;
                a aVar2 = (a) arrayList.get(size);
                if (logger.isLoggable(Level.FINE)) {
                    g.b(logger, aVar2, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }

    public final void d(a task, long j2) {
        i.e(task, "task");
        synchronized (this.f3426a) {
            if (!this.f3428c) {
                if (e(task, j2, false)) {
                    this.f3426a.c(this);
                }
            } else if (task.f3421b) {
                Logger logger = this.f3426a.f3435b;
                if (logger.isLoggable(Level.FINE)) {
                    g.b(logger, task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                Logger logger2 = this.f3426a.f3435b;
                if (logger2.isLoggable(Level.FINE)) {
                    g.b(logger2, task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean e(a task, long j2, boolean z) {
        i.e(task, "task");
        c cVar = task.f3422c;
        if (cVar != this) {
            if (cVar != null) {
                throw new IllegalStateException("task is in multiple queues");
            }
            task.f3422c = this;
        }
        d dVar = this.f3426a;
        j jVar = dVar.f3434a;
        long nanoTime = System.nanoTime();
        long j6 = nanoTime + j2;
        ArrayList arrayList = this.f3430e;
        int indexOf = arrayList.indexOf(task);
        Logger logger = dVar.f3435b;
        if (indexOf != -1) {
            if (task.f3423d <= j6) {
                if (logger.isLoggable(Level.FINE)) {
                    g.b(logger, task, this, "already scheduled");
                }
                return false;
            }
            arrayList.remove(indexOf);
        }
        task.f3423d = j6;
        if (logger.isLoggable(Level.FINE)) {
            g.b(logger, task, this, z ? "run again after ".concat(g.n(j6 - nanoTime)) : "scheduled after ".concat(g.n(j6 - nanoTime)));
        }
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (((a) it.next()).f3423d - nanoTime > j2) {
                break;
            }
            i2++;
        }
        if (i2 == -1) {
            i2 = arrayList.size();
        }
        arrayList.add(i2, task);
        return i2 == 0;
    }

    public final void f() {
        d dVar = this.f3426a;
        TimeZone timeZone = e.f3179a;
        synchronized (dVar) {
            this.f3428c = true;
            if (b()) {
                this.f3426a.c(this);
            }
        }
    }

    public final String toString() {
        return this.f3427b;
    }
}
