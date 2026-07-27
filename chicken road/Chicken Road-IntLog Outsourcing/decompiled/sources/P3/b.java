package P3;

import M3.p;
import X2.h;
import X2.l;
import X2.q;
import X2.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public static final Logger f2291o = Logger.getLogger(b.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final l f2292a;

    /* renamed from: b, reason: collision with root package name */
    public final Q2.a f2293b;

    /* renamed from: c, reason: collision with root package name */
    public final Q2.a f2294c;

    /* renamed from: d, reason: collision with root package name */
    public final e f2295d;

    /* renamed from: e, reason: collision with root package name */
    public final long f2296e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2297f;

    /* renamed from: g, reason: collision with root package name */
    public final long f2298g;

    /* renamed from: h, reason: collision with root package name */
    public long f2299h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayBlockingQueue f2300i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicInteger f2301j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayBlockingQueue f2302k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicReference f2303l;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f2304m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f2305n;

    public b(e eVar, long j2, int i2, long j6, ArrayBlockingQueue arrayBlockingQueue) {
        s sVar = h.f3518a;
        this.f2301j = new AtomicInteger(Integer.MAX_VALUE);
        this.f2303l = new AtomicReference();
        this.f2304m = true;
        this.f2295d = eVar;
        this.f2296e = j2;
        this.f2297f = i2;
        this.f2298g = j6;
        this.f2300i = arrayBlockingQueue;
        this.f2302k = new ArrayBlockingQueue(1);
        q build = sVar.a("io.opentelemetry.sdk.logs").build();
        build.b("queueSize").b().mo3b().mo4e().f(new a(arrayBlockingQueue));
        this.f2292a = build.d("processedLogs").c("1").a("The number of logs processed by the BatchLogRecordProcessor. [dropped=true if they were dropped due to high throughput]").build();
        V2.e eVar2 = c.f2307d;
        String str = c.f2309f;
        V2.e eVar3 = c.f2308e;
        this.f2293b = Q2.c.a(eVar2, str, eVar3, Boolean.TRUE);
        this.f2294c = Q2.c.a(eVar2, str, eVar3, Boolean.FALSE);
        this.f2305n = new ArrayList(i2);
    }

    public final void a() {
        Logger logger = f2291o;
        ArrayList arrayList = this.f2305n;
        if (arrayList.isEmpty()) {
            return;
        }
        try {
            try {
                J3.c export = this.f2295d.export(Collections.unmodifiableList(arrayList));
                export.c(this.f2298g, TimeUnit.NANOSECONDS);
                if (export.b()) {
                    this.f2292a.d(arrayList.size(), this.f2294c);
                } else {
                    logger.log(Level.FINE, "Exporter failed");
                }
            } catch (RuntimeException e3) {
                logger.log(Level.WARNING, "Exporter threw an Exception", (Throwable) e3);
            }
            arrayList.clear();
        } catch (Throwable th) {
            arrayList.clear();
            throw th;
        }
    }

    public final J3.c b() {
        J3.c cVar = new J3.c();
        AtomicReference atomicReference = this.f2303l;
        while (true) {
            if (atomicReference.compareAndSet(null, cVar)) {
                this.f2302k.offer(Boolean.TRUE);
                break;
            }
            if (atomicReference.get() != null) {
                break;
            }
        }
        J3.c cVar2 = (J3.c) atomicReference.get();
        return cVar2 == null ? J3.c.f1361e : cVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2299h = System.nanoTime() + this.f2296e;
        while (this.f2304m) {
            if (this.f2303l.get() != null) {
                ArrayBlockingQueue arrayBlockingQueue = this.f2300i;
                int size = arrayBlockingQueue.size();
                while (size > 0) {
                    p pVar = (p) arrayBlockingQueue.poll();
                    ArrayList arrayList = this.f2305n;
                    arrayList.add(pVar.b());
                    size--;
                    if (arrayList.size() >= this.f2297f) {
                        a();
                    }
                }
                a();
                AtomicReference atomicReference = this.f2303l;
                J3.c cVar = (J3.c) atomicReference.get();
                if (cVar != null) {
                    cVar.e();
                    atomicReference.set(null);
                }
            }
            while (!this.f2300i.isEmpty() && this.f2305n.size() < this.f2297f) {
                this.f2305n.add(((p) this.f2300i.poll()).b());
            }
            if (this.f2305n.size() >= this.f2297f || System.nanoTime() >= this.f2299h) {
                a();
                this.f2299h = System.nanoTime() + this.f2296e;
            }
            if (this.f2300i.isEmpty()) {
                try {
                    long nanoTime = this.f2299h - System.nanoTime();
                    if (nanoTime > 0) {
                        this.f2301j.set(this.f2297f - this.f2305n.size());
                        this.f2302k.poll(nanoTime, TimeUnit.NANOSECONDS);
                        this.f2301j.set(Integer.MAX_VALUE);
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }
    }
}
