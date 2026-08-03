package L1;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final L1.d f991a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f992b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f993c;

    /* renamed from: d, reason: collision with root package name */
    public L1.a f994d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f995e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f996f;

    public c(L1.d taskRunner, java.lang.String name) {
        kotlin.jvm.internal.i.e(taskRunner, "taskRunner");
        kotlin.jvm.internal.i.e(name, "name");
        this.f991a = taskRunner;
        this.f992b = name;
        this.f995e = new java.util.ArrayList();
    }

    public final void a() {
        byte[] bArr = J1.b.f932a;
        synchronized (this.f991a) {
            if (b()) {
                this.f991a.d(this);
            }
        }
    }

    public final boolean b() {
        L1.a aVar = this.f994d;
        if (aVar != null && aVar.f986b) {
            this.f996f = true;
        }
        java.util.ArrayList arrayList = this.f995e;
        int size = arrayList.size() - 1;
        boolean z2 = false;
        if (size >= 0) {
            while (true) {
                int i2 = size - 1;
                if (((L1.a) arrayList.get(size)).f986b) {
                    L1.a aVar2 = (L1.a) arrayList.get(size);
                    if (L1.d.f998i.isLoggable(java.util.logging.Level.FINE)) {
                        Q1.d.a(aVar2, this, "canceled");
                    }
                    arrayList.remove(size);
                    z2 = true;
                }
                if (i2 < 0) {
                    break;
                }
                size = i2;
            }
        }
        return z2;
    }

    public final void c(L1.a task, long j2) {
        kotlin.jvm.internal.i.e(task, "task");
        synchronized (this.f991a) {
            if (!this.f993c) {
                if (d(task, j2, false)) {
                    this.f991a.d(this);
                }
            } else if (task.f986b) {
                if (L1.d.f998i.isLoggable(java.util.logging.Level.FINE)) {
                    Q1.d.a(task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (L1.d.f998i.isLoggable(java.util.logging.Level.FINE)) {
                    Q1.d.a(task, this, "schedule failed (queue is shutdown)");
                }
                throw new java.util.concurrent.RejectedExecutionException();
            }
        }
    }

    public final boolean d(L1.a task, long j2, boolean z2) {
        kotlin.jvm.internal.i.e(task, "task");
        L1.c cVar = task.f987c;
        if (cVar != this) {
            if (cVar != null) {
                throw new java.lang.IllegalStateException("task is in multiple queues");
            }
            task.f987c = this;
        }
        C.j jVar = this.f991a.f999a;
        long nanoTime = java.lang.System.nanoTime();
        long j3 = nanoTime + j2;
        java.util.ArrayList arrayList = this.f995e;
        int indexOf = arrayList.indexOf(task);
        if (indexOf != -1) {
            if (task.f988d <= j3) {
                if (L1.d.f998i.isLoggable(java.util.logging.Level.FINE)) {
                    Q1.d.a(task, this, "already scheduled");
                }
                return false;
            }
            arrayList.remove(indexOf);
        }
        task.f988d = j3;
        if (L1.d.f998i.isLoggable(java.util.logging.Level.FINE)) {
            Q1.d.a(task, this, z2 ? kotlin.jvm.internal.i.h(Q1.d.j(j3 - nanoTime), "run again after ") : kotlin.jvm.internal.i.h(Q1.d.j(j3 - nanoTime), "scheduled after "));
        }
        java.util.Iterator it = arrayList.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (((L1.a) it.next()).f988d - nanoTime > j2) {
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

    public final void e() {
        byte[] bArr = J1.b.f932a;
        synchronized (this.f991a) {
            this.f993c = true;
            if (b()) {
                this.f991a.d(this);
            }
        }
    }

    public final java.lang.String toString() {
        return this.f992b;
    }
}
