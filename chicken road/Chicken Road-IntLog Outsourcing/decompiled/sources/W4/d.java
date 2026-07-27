package W4;

import U4.e;
import V0.j;
import b2.AbstractC0279e;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: k, reason: collision with root package name */
    public static final Logger f3432k;

    /* renamed from: l, reason: collision with root package name */
    public static final d f3433l;

    /* renamed from: a, reason: collision with root package name */
    public final j f3434a;

    /* renamed from: b, reason: collision with root package name */
    public final Logger f3435b;

    /* renamed from: c, reason: collision with root package name */
    public int f3436c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3437d;

    /* renamed from: e, reason: collision with root package name */
    public long f3438e;

    /* renamed from: f, reason: collision with root package name */
    public int f3439f;

    /* renamed from: g, reason: collision with root package name */
    public int f3440g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f3441h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f3442i;

    /* renamed from: j, reason: collision with root package name */
    public final B.a f3443j;

    static {
        Logger logger = Logger.getLogger(d.class.getName());
        i.d(logger, "getLogger(...)");
        f3432k = logger;
        String name = e.f3180b + " TaskRunner";
        i.e(name, "name");
        f3433l = new d(new j(new U4.d(name, true)));
    }

    public d(j jVar) {
        Logger logger = f3432k;
        i.e(logger, "logger");
        this.f3434a = jVar;
        this.f3435b = logger;
        this.f3436c = AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND;
        this.f3441h = new ArrayList();
        this.f3442i = new ArrayList();
        this.f3443j = new B.a(11, this);
    }

    public static final void a(d dVar, a aVar, long j2, boolean z) {
        dVar.getClass();
        TimeZone timeZone = e.f3179a;
        c cVar = aVar.f3422c;
        i.b(cVar);
        if (cVar.f3429d != aVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z5 = cVar.f3431f;
        cVar.f3431f = false;
        cVar.f3429d = null;
        dVar.f3441h.remove(cVar);
        if (j2 != -1 && !z5 && !cVar.f3428c) {
            cVar.e(aVar, j2, true);
        }
        if (cVar.f3430e.isEmpty()) {
            return;
        }
        dVar.f3442i.add(cVar);
        if (z) {
            return;
        }
        dVar.e();
    }

    public final a b() {
        boolean z;
        TimeZone timeZone = e.f3179a;
        while (true) {
            ArrayList arrayList = this.f3442i;
            if (arrayList.isEmpty()) {
                return null;
            }
            long nanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long j2 = Long.MAX_VALUE;
            a aVar = null;
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                a aVar2 = (a) ((c) it.next()).f3430e.get(0);
                long max = Math.max(0L, aVar2.f3423d - nanoTime);
                if (max > 0) {
                    j2 = Math.min(max, j2);
                } else {
                    if (aVar != null) {
                        z = true;
                        break;
                    }
                    aVar = aVar2;
                }
            }
            ArrayList arrayList2 = this.f3441h;
            if (aVar != null) {
                TimeZone timeZone2 = e.f3179a;
                aVar.f3423d = -1L;
                c cVar = aVar.f3422c;
                i.b(cVar);
                cVar.f3430e.remove(aVar);
                arrayList.remove(cVar);
                cVar.f3429d = aVar;
                arrayList2.add(cVar);
                if (z || (!this.f3437d && !arrayList.isEmpty())) {
                    e();
                }
                return aVar;
            }
            if (this.f3437d) {
                if (j2 < this.f3438e - nanoTime) {
                    notify();
                }
                return null;
            }
            this.f3437d = true;
            this.f3438e = nanoTime + j2;
            try {
                try {
                    TimeZone timeZone3 = e.f3179a;
                    if (j2 > 0) {
                        long j6 = j2 / 1000000;
                        long j7 = j2 - (1000000 * j6);
                        if (j6 > 0 || j2 > 0) {
                            wait(j6, (int) j7);
                        }
                    }
                } catch (InterruptedException unused) {
                    TimeZone timeZone4 = e.f3179a;
                    for (int size = arrayList2.size() - 1; -1 < size; size--) {
                        ((c) arrayList2.get(size)).b();
                    }
                    for (int size2 = arrayList.size() - 1; -1 < size2; size2--) {
                        c cVar2 = (c) arrayList.get(size2);
                        cVar2.b();
                        if (cVar2.f3430e.isEmpty()) {
                            arrayList.remove(size2);
                        }
                    }
                }
            } finally {
                this.f3437d = false;
            }
        }
    }

    public final void c(c taskQueue) {
        i.e(taskQueue, "taskQueue");
        TimeZone timeZone = e.f3179a;
        if (taskQueue.f3429d == null) {
            boolean isEmpty = taskQueue.f3430e.isEmpty();
            ArrayList arrayList = this.f3442i;
            if (isEmpty) {
                arrayList.remove(taskQueue);
            } else {
                byte[] bArr = U4.c.f3176a;
                i.e(arrayList, "<this>");
                if (!arrayList.contains(taskQueue)) {
                    arrayList.add(taskQueue);
                }
            }
        }
        if (this.f3437d) {
            notify();
        } else {
            e();
        }
    }

    public final c d() {
        int i2;
        synchronized (this) {
            i2 = this.f3436c;
            this.f3436c = i2 + 1;
        }
        return new c(this, AbstractC0279e.d(i2, "Q"));
    }

    public final void e() {
        TimeZone timeZone = e.f3179a;
        int i2 = this.f3439f;
        if (i2 > this.f3440g) {
            return;
        }
        this.f3439f = i2 + 1;
        j jVar = this.f3434a;
        B.a runnable = this.f3443j;
        i.e(runnable, "runnable");
        ((ThreadPoolExecutor) jVar.f3212b).execute(runnable);
    }
}
