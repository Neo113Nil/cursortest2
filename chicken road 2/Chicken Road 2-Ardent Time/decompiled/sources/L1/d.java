package L1;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: h, reason: collision with root package name */
    public static final L1.d f997h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.logging.Logger f998i;

    /* renamed from: a, reason: collision with root package name */
    public final C.j f999a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1001c;

    /* renamed from: d, reason: collision with root package name */
    public long f1002d;

    /* renamed from: b, reason: collision with root package name */
    public int f1000b = io.appmetrica.analytics.AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f1003e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f1004f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final C.b f1005g = new C.b(3, this);

    static {
        java.lang.String name = kotlin.jvm.internal.i.h(" TaskRunner", J1.b.f937f);
        kotlin.jvm.internal.i.e(name, "name");
        f997h = new L1.d(new C.j(new J1.a(name, true)));
        java.util.logging.Logger logger = java.util.logging.Logger.getLogger(L1.d.class.getName());
        kotlin.jvm.internal.i.d(logger, "getLogger(TaskRunner::class.java.name)");
        f998i = logger;
    }

    public d(C.j jVar) {
        this.f999a = jVar;
    }

    public static final void a(L1.d dVar, L1.a aVar) {
        dVar.getClass();
        byte[] bArr = J1.b.f932a;
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        java.lang.String name = currentThread.getName();
        currentThread.setName(aVar.f985a);
        try {
            long a2 = aVar.a();
            synchronized (dVar) {
                dVar.b(aVar, a2);
            }
            currentThread.setName(name);
        } catch (java.lang.Throwable th) {
            synchronized (dVar) {
                dVar.b(aVar, -1L);
                currentThread.setName(name);
                throw th;
            }
        }
    }

    public final void b(L1.a aVar, long j2) {
        byte[] bArr = J1.b.f932a;
        L1.c cVar = aVar.f987c;
        kotlin.jvm.internal.i.b(cVar);
        if (cVar.f994d != aVar) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
        boolean z2 = cVar.f996f;
        cVar.f996f = false;
        cVar.f994d = null;
        this.f1003e.remove(cVar);
        if (j2 != -1 && !z2 && !cVar.f993c) {
            cVar.d(aVar, j2, true);
        }
        if (cVar.f995e.isEmpty()) {
            return;
        }
        this.f1004f.add(cVar);
    }

    public final L1.a c() {
        boolean z2;
        long j2;
        long j3;
        byte[] bArr = J1.b.f932a;
        while (true) {
            java.util.ArrayList arrayList = this.f1004f;
            if (arrayList.isEmpty()) {
                return null;
            }
            C.j jVar = this.f999a;
            long nanoTime = java.lang.System.nanoTime();
            java.util.Iterator it = arrayList.iterator();
            long j4 = Long.MAX_VALUE;
            L1.a aVar = null;
            while (true) {
                if (!it.hasNext()) {
                    z2 = false;
                    break;
                }
                L1.a aVar2 = (L1.a) ((L1.c) it.next()).f995e.get(0);
                long max = java.lang.Math.max(0L, aVar2.f988d - nanoTime);
                if (max > 0) {
                    j4 = java.lang.Math.min(max, j4);
                } else {
                    if (aVar != null) {
                        z2 = true;
                        break;
                    }
                    aVar = aVar2;
                }
            }
            java.util.ArrayList arrayList2 = this.f1003e;
            if (aVar != null) {
                byte[] bArr2 = J1.b.f932a;
                aVar.f988d = -1L;
                L1.c cVar = aVar.f987c;
                kotlin.jvm.internal.i.b(cVar);
                cVar.f995e.remove(aVar);
                arrayList.remove(cVar);
                cVar.f994d = aVar;
                arrayList2.add(cVar);
                if (z2 || (!this.f1001c && !arrayList.isEmpty())) {
                    C.b runnable = this.f1005g;
                    kotlin.jvm.internal.i.e(runnable, "runnable");
                    ((java.util.concurrent.ThreadPoolExecutor) jVar.f88b).execute(runnable);
                }
                return aVar;
            }
            if (this.f1001c) {
                if (j4 < this.f1002d - nanoTime) {
                    notify();
                }
                return null;
            }
            this.f1001c = true;
            this.f1002d = nanoTime + j4;
            try {
                try {
                    j2 = j4 / 1000000;
                    j3 = j4 - (1000000 * j2);
                } catch (java.lang.InterruptedException unused) {
                    int size = arrayList2.size() - 1;
                    if (size >= 0) {
                        while (true) {
                            int i2 = size - 1;
                            ((L1.c) arrayList2.get(size)).b();
                            if (i2 < 0) {
                                break;
                            }
                            size = i2;
                        }
                    }
                    int size2 = arrayList.size() - 1;
                    if (size2 >= 0) {
                        while (true) {
                            int i3 = size2 - 1;
                            L1.c cVar2 = (L1.c) arrayList.get(size2);
                            cVar2.b();
                            if (cVar2.f995e.isEmpty()) {
                                arrayList.remove(size2);
                            }
                            if (i3 < 0) {
                                break;
                            }
                            size2 = i3;
                        }
                    }
                }
                if (j2 <= 0) {
                    if (j4 > 0) {
                    }
                    this.f1001c = false;
                }
                wait(j2, (int) j3);
                this.f1001c = false;
            } catch (java.lang.Throwable th) {
                this.f1001c = false;
                throw th;
            }
        }
    }

    public final void d(L1.c taskQueue) {
        kotlin.jvm.internal.i.e(taskQueue, "taskQueue");
        byte[] bArr = J1.b.f932a;
        if (taskQueue.f994d == null) {
            boolean isEmpty = taskQueue.f995e.isEmpty();
            java.util.ArrayList arrayList = this.f1004f;
            if (isEmpty) {
                arrayList.remove(taskQueue);
            } else {
                kotlin.jvm.internal.i.e(arrayList, "<this>");
                if (!arrayList.contains(taskQueue)) {
                    arrayList.add(taskQueue);
                }
            }
        }
        boolean z2 = this.f1001c;
        C.j jVar = this.f999a;
        if (z2) {
            notify();
            return;
        }
        C.b runnable = this.f1005g;
        kotlin.jvm.internal.i.e(runnable, "runnable");
        ((java.util.concurrent.ThreadPoolExecutor) jVar.f88b).execute(runnable);
    }

    public final L1.c e() {
        int i2;
        synchronized (this) {
            i2 = this.f1000b;
            this.f1000b = i2 + 1;
        }
        return new L1.c(this, kotlin.jvm.internal.i.h(java.lang.Integer.valueOf(i2), "Q"));
    }
}
