package B4;

import A0.C;
import A0.J0;
import j3.i;
import java.util.ArrayList;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import kotlin.jvm.internal.l;
import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: h, reason: collision with root package name */
    public static final i f765h = new i(1);
    public static final d i;

    /* renamed from: j, reason: collision with root package name */
    public static final Logger f766j;

    /* renamed from: a, reason: collision with root package name */
    public final J0 f767a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f769c;

    /* renamed from: d, reason: collision with root package name */
    public long f770d;

    /* renamed from: b, reason: collision with root package name */
    public int f768b = 10000;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f771e = new ArrayList();
    public final ArrayList f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final C f772g = new C(1, this);

    static {
        String str = z4.b.f21984g + " TaskRunner";
        l.f("name", str);
        z4.a aVar = new z4.a(str, true);
        J0 j02 = new J0();
        j02.f304k = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), aVar);
        i = new d(j02);
        Logger logger = Logger.getLogger(d.class.getName());
        l.e("getLogger(TaskRunner::class.java.name)", logger);
        f766j = logger;
    }

    public d(J0 j02) {
        this.f767a = j02;
    }

    public static final void a(d dVar, a aVar) {
        dVar.getClass();
        byte[] bArr = z4.b.f21979a;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(aVar.f755a);
        try {
            long a5 = aVar.a();
            synchronized (dVar) {
                dVar.b(aVar, a5);
            }
            currentThread.setName(name);
        } catch (Throwable th) {
            synchronized (dVar) {
                dVar.b(aVar, -1L);
                currentThread.setName(name);
                throw th;
            }
        }
    }

    public final void b(a aVar, long j5) {
        byte[] bArr = z4.b.f21979a;
        c cVar = aVar.f757c;
        l.c(cVar);
        if (cVar.f763d != aVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z3 = cVar.f;
        cVar.f = false;
        cVar.f763d = null;
        this.f771e.remove(cVar);
        if (j5 != -1 && !z3 && !cVar.f762c) {
            cVar.d(aVar, j5, true);
        }
        if (cVar.f764e.isEmpty()) {
            return;
        }
        this.f.add(cVar);
    }

    public final a c() {
        ArrayList arrayList;
        a aVar;
        boolean z3;
        byte[] bArr = z4.b.f21979a;
        while (true) {
            ArrayList arrayList2 = this.f;
            if (arrayList2.isEmpty()) {
                return null;
            }
            J0 j02 = this.f767a;
            long nanoTime = System.nanoTime();
            int size = arrayList2.size();
            long j5 = Long.MAX_VALUE;
            int i5 = 0;
            a aVar2 = null;
            while (true) {
                if (i5 >= size) {
                    arrayList = arrayList2;
                    aVar = null;
                    z3 = false;
                    break;
                }
                Object obj = arrayList2.get(i5);
                i5++;
                aVar = null;
                a aVar3 = (a) ((c) obj).f764e.get(0);
                arrayList = arrayList2;
                long max = Math.max(0L, aVar3.f758d - nanoTime);
                if (max > 0) {
                    j5 = Math.min(max, j5);
                } else {
                    if (aVar2 != null) {
                        z3 = true;
                        break;
                    }
                    aVar2 = aVar3;
                }
                arrayList2 = arrayList;
            }
            ArrayList arrayList3 = this.f771e;
            if (aVar2 != null) {
                byte[] bArr2 = z4.b.f21979a;
                aVar2.f758d = -1L;
                c cVar = aVar2.f757c;
                l.c(cVar);
                cVar.f764e.remove(aVar2);
                ArrayList arrayList4 = arrayList;
                arrayList4.remove(cVar);
                cVar.f763d = aVar2;
                arrayList3.add(cVar);
                if (z3 || (!this.f769c && !arrayList4.isEmpty())) {
                    C c5 = this.f772g;
                    l.f("runnable", c5);
                    ((ThreadPoolExecutor) j02.f304k).execute(c5);
                }
                return aVar2;
            }
            ArrayList arrayList5 = arrayList;
            if (this.f769c) {
                if (j5 >= this.f770d - nanoTime) {
                    return aVar;
                }
                notify();
                return aVar;
            }
            this.f769c = true;
            this.f770d = nanoTime + j5;
            try {
                try {
                    long j6 = j5 / 1000000;
                    Long.signum(j6);
                    long j7 = j5 - (1000000 * j6);
                    if (j6 > 0 || j5 > 0) {
                        wait(j6, (int) j7);
                    }
                } catch (InterruptedException unused) {
                    for (int size2 = arrayList3.size() - 1; -1 < size2; size2--) {
                        ((c) arrayList3.get(size2)).b();
                    }
                    int size3 = arrayList5.size() - 1;
                    for (int i6 = -1; i6 < size3; i6 = -1) {
                        c cVar2 = (c) arrayList5.get(size3);
                        cVar2.b();
                        if (cVar2.f764e.isEmpty()) {
                            arrayList5.remove(size3);
                        }
                        size3--;
                    }
                }
            } finally {
                this.f769c = false;
            }
        }
    }

    public final void d(c cVar) {
        l.f("taskQueue", cVar);
        byte[] bArr = z4.b.f21979a;
        if (cVar.f763d == null) {
            boolean isEmpty = cVar.f764e.isEmpty();
            ArrayList arrayList = this.f;
            if (isEmpty) {
                arrayList.remove(cVar);
            } else {
                l.f("<this>", arrayList);
                if (!arrayList.contains(cVar)) {
                    arrayList.add(cVar);
                }
            }
        }
        boolean z3 = this.f769c;
        J0 j02 = this.f767a;
        if (z3) {
            notify();
            return;
        }
        C c5 = this.f772g;
        l.f("runnable", c5);
        ((ThreadPoolExecutor) j02.f304k).execute(c5);
    }

    public final c e() {
        int i5;
        synchronized (this) {
            i5 = this.f768b;
            this.f768b = i5 + 1;
        }
        return new c(this, AbstractC2107A.q("Q", i5));
    }
}
