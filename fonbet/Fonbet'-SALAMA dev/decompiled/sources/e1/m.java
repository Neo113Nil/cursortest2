package e1;

import H2.q;
import W5.AbstractC0486a1;
import android.content.Context;
import android.database.Cursor;
import android.support.v4.media.session.t;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import c5.C0820a;
import com.google.android.gms.common.internal.w;
import d1.AbstractC0956i;
import d1.C0949b;
import d1.C0954g;
import d1.C0957j;
import d1.n;
import d6.C0977k;
import e6.C1054c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import m1.C1430e;
import n1.AbstractC1451f;
import n1.C1458m;
import n1.C1459n;
import n1.ExecutorC1453h;
import n1.RunnableC1457l;
import o1.C1501k;
import w1.C1759x1;
import w1.L;

/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: K, reason: collision with root package name */
    public static final String f12550K = n.g("WorkerWrapper");

    /* renamed from: A, reason: collision with root package name */
    public C0995b f12551A;

    /* renamed from: B, reason: collision with root package name */
    public WorkDatabase f12552B;

    /* renamed from: C, reason: collision with root package name */
    public C0820a f12553C;

    /* renamed from: D, reason: collision with root package name */
    public C0977k f12554D;

    /* renamed from: E, reason: collision with root package name */
    public w f12555E;

    /* renamed from: F, reason: collision with root package name */
    public ArrayList f12556F;

    /* renamed from: G, reason: collision with root package name */
    public String f12557G;

    /* renamed from: H, reason: collision with root package name */
    public C1501k f12558H;

    /* renamed from: I, reason: collision with root package name */
    public I3.b f12559I;

    /* renamed from: J, reason: collision with root package name */
    public volatile boolean f12560J;

    /* renamed from: a, reason: collision with root package name */
    public Context f12561a;

    /* renamed from: b, reason: collision with root package name */
    public String f12562b;

    /* renamed from: c, reason: collision with root package name */
    public List f12563c;

    /* renamed from: d, reason: collision with root package name */
    public t f12564d;

    /* renamed from: e, reason: collision with root package name */
    public m1.i f12565e;

    /* renamed from: f, reason: collision with root package name */
    public ListenableWorker f12566f;

    /* renamed from: x, reason: collision with root package name */
    public C1759x1 f12567x;

    /* renamed from: y, reason: collision with root package name */
    public d1.m f12568y;

    /* renamed from: z, reason: collision with root package name */
    public C0949b f12569z;

    public final void a(d1.m mVar) {
        boolean z4 = mVar instanceof d1.l;
        String str = f12550K;
        if (!z4) {
            if (mVar instanceof d1.k) {
                n.d().e(str, L.i("Worker result RETRY for ", this.f12557G), new Throwable[0]);
                c();
                return;
            }
            n.d().e(str, L.i("Worker result FAILURE for ", this.f12557G), new Throwable[0]);
            if (this.f12565e.c()) {
                d();
                return;
            } else {
                g();
                return;
            }
        }
        n.d().e(str, L.i("Worker result SUCCESS for ", this.f12557G), new Throwable[0]);
        if (this.f12565e.c()) {
            d();
            return;
        }
        C0977k c0977k = this.f12554D;
        String str2 = this.f12562b;
        C0820a c0820a = this.f12553C;
        WorkDatabase workDatabase = this.f12552B;
        workDatabase.c();
        try {
            c0820a.u(3, str2);
            c0820a.s(str2, ((d1.l) this.f12568y).f12363a);
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it = c0977k.n(str2).iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                if (c0820a.h(str3) == 5) {
                    D0.k c3 = D0.k.c(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
                    if (str3 == null) {
                        c3.e(1);
                    } else {
                        c3.f(1, str3);
                    }
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) c0977k.f12441b;
                    workDatabase_Impl.b();
                    Cursor g3 = workDatabase_Impl.g(c3);
                    try {
                        if (g3.moveToFirst() && g3.getInt(0) != 0) {
                            n.d().e(str, "Setting status to enqueued for " + str3, new Throwable[0]);
                            c0820a.u(1, str3);
                            c0820a.t(str3, currentTimeMillis);
                        }
                    } finally {
                        g3.close();
                        c3.g();
                    }
                }
            }
            workDatabase.h();
            workDatabase.f();
            e(false);
        } catch (Throwable th) {
            workDatabase.f();
            e(false);
            throw th;
        }
    }

    public final void b() {
        boolean h6 = h();
        String str = this.f12562b;
        WorkDatabase workDatabase = this.f12552B;
        if (!h6) {
            workDatabase.c();
            try {
                int h7 = this.f12553C.h(str);
                k1.g m7 = workDatabase.m();
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) m7.f14674a;
                workDatabase_Impl.b();
                C1430e c1430e = (C1430e) m7.f14676c;
                K0.f a2 = c1430e.a();
                if (str == null) {
                    a2.d(1);
                } else {
                    a2.e(1, str);
                }
                workDatabase_Impl.c();
                try {
                    a2.k();
                    workDatabase_Impl.h();
                    if (h7 == 0) {
                        e(false);
                    } else if (h7 == 2) {
                        a(this.f12568y);
                    } else if (!AbstractC0486a1.b(h7)) {
                        c();
                    }
                    workDatabase.h();
                    workDatabase.f();
                } finally {
                    workDatabase_Impl.f();
                    c1430e.c(a2);
                }
            } catch (Throwable th) {
                workDatabase.f();
                throw th;
            }
        }
        List list = this.f12563c;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC0996c) it.next()).c(str);
            }
            AbstractC0997d.a(this.f12569z, workDatabase, list);
        }
    }

    public final void c() {
        String str = this.f12562b;
        C0820a c0820a = this.f12553C;
        WorkDatabase workDatabase = this.f12552B;
        workDatabase.c();
        try {
            c0820a.u(1, str);
            c0820a.t(str, System.currentTimeMillis());
            c0820a.p(str, -1L);
            workDatabase.h();
        } finally {
            workDatabase.f();
            e(true);
        }
    }

    public final void d() {
        String str = this.f12562b;
        C0820a c0820a = this.f12553C;
        WorkDatabase workDatabase = this.f12552B;
        workDatabase.c();
        try {
            c0820a.t(str, System.currentTimeMillis());
            c0820a.u(1, str);
            c0820a.r(str);
            c0820a.p(str, -1L);
            workDatabase.h();
        } finally {
            workDatabase.f();
            e(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:3:0x0005, B:10:0x0032, B:12:0x003a, B:14:0x0046, B:15:0x005a, B:17:0x005e, B:19:0x0062, B:21:0x0068, B:22:0x006e, B:30:0x007b, B:32:0x007c, B:38:0x0090, B:39:0x0096, B:24:0x006f, B:25:0x0077, B:5:0x0020, B:7:0x0027), top: B:2:0x0005, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0046 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:3:0x0005, B:10:0x0032, B:12:0x003a, B:14:0x0046, B:15:0x005a, B:17:0x005e, B:19:0x0062, B:21:0x0068, B:22:0x006e, B:30:0x007b, B:32:0x007c, B:38:0x0090, B:39:0x0096, B:24:0x006f, B:25:0x0077, B:5:0x0020, B:7:0x0027), top: B:2:0x0005, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(boolean z4) {
        boolean z7;
        ListenableWorker listenableWorker;
        C0995b c0995b;
        this.f12552B.c();
        try {
            C0820a n2 = this.f12552B.n();
            n2.getClass();
            D0.k c3 = D0.k.c(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) n2.f10433a;
            workDatabase_Impl.b();
            Cursor g3 = workDatabase_Impl.g(c3);
            try {
                if (g3.moveToFirst()) {
                    if (g3.getInt(0) != 0) {
                        z7 = true;
                        if (!z7) {
                            AbstractC1451f.a(this.f12561a, RescheduleReceiver.class, false);
                        }
                        if (z4) {
                            this.f12553C.u(1, this.f12562b);
                            this.f12553C.p(this.f12562b, -1L);
                        }
                        if (this.f12565e != null && (listenableWorker = this.f12566f) != null && listenableWorker.isRunInForeground()) {
                            c0995b = this.f12551A;
                            String str = this.f12562b;
                            synchronized (c0995b.f12510B) {
                                c0995b.f12516f.remove(str);
                                c0995b.h();
                            }
                        }
                        this.f12552B.h();
                        this.f12552B.f();
                        this.f12558H.i(Boolean.valueOf(z4));
                    }
                }
                z7 = false;
                if (!z7) {
                }
                if (z4) {
                }
                if (this.f12565e != null) {
                    c0995b = this.f12551A;
                    String str2 = this.f12562b;
                    synchronized (c0995b.f12510B) {
                    }
                }
                this.f12552B.h();
                this.f12552B.f();
                this.f12558H.i(Boolean.valueOf(z4));
            } finally {
                g3.close();
                c3.g();
            }
        } catch (Throwable th) {
            this.f12552B.f();
            throw th;
        }
    }

    public final void f() {
        C0820a c0820a = this.f12553C;
        String str = this.f12562b;
        int h6 = c0820a.h(str);
        String str2 = f12550K;
        if (h6 == 2) {
            n.d().b(str2, AbstractC0486a1.h("Status for ", str, " is RUNNING;not doing any work and rescheduling for later execution"), new Throwable[0]);
            e(true);
            return;
        }
        n d7 = n.d();
        StringBuilder k7 = k.k("Status for ", str, " is ");
        k7.append(AbstractC0486a1.z(h6));
        k7.append("; not doing any work");
        d7.b(str2, k7.toString(), new Throwable[0]);
        e(false);
    }

    public final void g() {
        String str = this.f12562b;
        WorkDatabase workDatabase = this.f12552B;
        workDatabase.c();
        try {
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            while (!linkedList.isEmpty()) {
                String str2 = (String) linkedList.remove();
                C0820a c0820a = this.f12553C;
                if (c0820a.h(str2) != 6) {
                    c0820a.u(4, str2);
                }
                linkedList.addAll(this.f12554D.n(str2));
            }
            this.f12553C.s(str, ((C0957j) this.f12568y).f12362a);
            workDatabase.h();
        } finally {
            workDatabase.f();
            e(false);
        }
    }

    public final boolean h() {
        if (!this.f12560J) {
            return false;
        }
        n.d().b(f12550K, L.i("Work interrupted for ", this.f12557G), new Throwable[0]);
        if (this.f12553C.h(this.f12562b) == 0) {
            e(false);
        } else {
            e(!AbstractC0486a1.b(r0));
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bb, code lost:
    
        if ((r5.f15217b == 1 && r5.f15225k > 0) != false) goto L33;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        AbstractC0956i abstractC0956i;
        C0954g a2;
        w wVar = this.f12555E;
        String str = this.f12562b;
        ArrayList G2 = wVar.G(str);
        this.f12556F = G2;
        StringBuilder k7 = k.k("Work [ id=", str, ", tags={ ");
        Iterator it = G2.iterator();
        boolean z4 = true;
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (z4) {
                z4 = false;
            } else {
                k7.append(", ");
            }
            k7.append(str2);
        }
        k7.append(" } ]");
        this.f12557G = k7.toString();
        C0820a c0820a = this.f12553C;
        if (h()) {
            return;
        }
        WorkDatabase workDatabase = this.f12552B;
        workDatabase.c();
        try {
            m1.i l7 = c0820a.l(str);
            this.f12565e = l7;
            String str3 = f12550K;
            if (l7 == null) {
                n.d().c(str3, "Didn't find WorkSpec for id " + str, new Throwable[0]);
                e(false);
                workDatabase.h();
            } else {
                if (l7.f15217b == 1) {
                    if (!l7.c()) {
                        m1.i iVar = this.f12565e;
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    m1.i iVar2 = this.f12565e;
                    if (iVar2.f15228n != 0 && currentTimeMillis < iVar2.a()) {
                        n.d().b(str3, "Delaying execution for " + this.f12565e.f15218c + " because it is being executed before schedule.", new Throwable[0]);
                        e(true);
                        workDatabase.h();
                    }
                    workDatabase.h();
                    workDatabase.f();
                    boolean c3 = this.f12565e.c();
                    C0949b c0949b = this.f12569z;
                    if (c3) {
                        a2 = this.f12565e.f15220e;
                    } else {
                        C1054c c1054c = c0949b.f12337d;
                        String str4 = this.f12565e.f15219d;
                        c1054c.getClass();
                        String str5 = AbstractC0956i.f12361a;
                        try {
                            abstractC0956i = (AbstractC0956i) Class.forName(str4).newInstance();
                        } catch (Exception e7) {
                            n.d().c(AbstractC0956i.f12361a, L.i("Trouble instantiating + ", str4), e7);
                            abstractC0956i = null;
                        }
                        if (abstractC0956i == null) {
                            n.d().c(str3, L.i("Could not create Input Merger ", this.f12565e.f15219d), new Throwable[0]);
                            g();
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(this.f12565e.f15220e);
                        D0.k c4 = D0.k.c(1, "SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
                        if (str == null) {
                            c4.e(1);
                        } else {
                            c4.f(1, str);
                        }
                        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) c0820a.f10433a;
                        workDatabase_Impl.b();
                        Cursor g3 = workDatabase_Impl.g(c4);
                        try {
                            ArrayList arrayList2 = new ArrayList(g3.getCount());
                            while (g3.moveToNext()) {
                                arrayList2.add(C0954g.a(g3.getBlob(0)));
                            }
                            g3.close();
                            c4.g();
                            arrayList.addAll(arrayList2);
                            a2 = abstractC0956i.a(arrayList);
                        } catch (Throwable th) {
                            g3.close();
                            c4.g();
                            throw th;
                        }
                    }
                    UUID fromString = UUID.fromString(str);
                    ArrayList arrayList3 = this.f12556F;
                    int i7 = this.f12565e.f15225k;
                    ExecutorService executorService = c0949b.f12334a;
                    C1759x1 c1759x1 = this.f12567x;
                    C1459n c1459n = new C1459n(workDatabase, c1759x1);
                    C1458m c1458m = new C1458m(workDatabase, this.f12551A, c1759x1);
                    WorkerParameters workerParameters = new WorkerParameters();
                    workerParameters.f9860a = fromString;
                    workerParameters.f9861b = a2;
                    workerParameters.f9862c = new HashSet(arrayList3);
                    workerParameters.f9863d = this.f12564d;
                    workerParameters.f9864e = i7;
                    workerParameters.f9865f = executorService;
                    workerParameters.f9866g = c1759x1;
                    d1.t tVar = c0949b.f12336c;
                    workerParameters.f9867h = tVar;
                    workerParameters.f9868i = c1459n;
                    workerParameters.j = c1458m;
                    if (this.f12566f == null) {
                        this.f12566f = tVar.a(this.f12561a, this.f12565e.f15218c, workerParameters);
                    }
                    ListenableWorker listenableWorker = this.f12566f;
                    if (listenableWorker == null) {
                        n.d().c(str3, L.i("Could not create Worker ", this.f12565e.f15218c), new Throwable[0]);
                        g();
                        return;
                    }
                    if (listenableWorker.isUsed()) {
                        n.d().c(str3, AbstractC0486a1.h("Received an already-used Worker ", this.f12565e.f15218c, "; WorkerFactory should return new instances"), new Throwable[0]);
                        g();
                        return;
                    }
                    this.f12566f.setUsed();
                    workDatabase.c();
                    try {
                        boolean z7 = true;
                        if (c0820a.h(str) == 1) {
                            c0820a.u(2, str);
                            c0820a.m(str);
                        } else {
                            z7 = false;
                        }
                        workDatabase.h();
                        if (!z7) {
                            f();
                            return;
                        }
                        if (h()) {
                            return;
                        }
                        C1501k c1501k = new C1501k();
                        RunnableC1457l runnableC1457l = new RunnableC1457l(this.f12561a, this.f12565e, this.f12566f, c1458m, this.f12567x);
                        ((L.f) c1759x1.f17927d).execute(runnableC1457l);
                        C1501k c1501k2 = runnableC1457l.f15325a;
                        c1501k2.addListener(new q(17, this, c1501k2, c1501k, false), (L.f) c1759x1.f17927d);
                        c1501k.addListener(new q(18, this, c1501k, this.f12557G, false), (ExecutorC1453h) c1759x1.f17925b);
                        return;
                    } finally {
                    }
                }
                f();
                workDatabase.h();
                n.d().b(str3, this.f12565e.f15218c + " is not in ENQUEUED state. Nothing more to do.", new Throwable[0]);
            }
        } finally {
            workDatabase.f();
        }
    }
}
