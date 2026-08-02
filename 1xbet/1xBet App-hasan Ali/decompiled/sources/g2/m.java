package g2;

import D3.n;
import G.v;
import S2.q;
import a3.AbstractC0467k;
import android.content.Context;
import android.database.Cursor;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import com.google.android.gms.internal.ads.C1071hd;
import com.google.android.gms.internal.ads.G7;
import f2.AbstractC1950h;
import f2.C1944b;
import f2.C1948f;
import f2.C1951i;
import f2.s;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import p2.AbstractC2249g;
import p2.C2256n;
import p2.C2257o;
import p2.ExecutorC2251i;
import p2.RunnableC2255m;
import q2.C2307j;

/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: D, reason: collision with root package name */
    public static final String f17137D = f2.m.f("WorkerWrapper");

    /* renamed from: A, reason: collision with root package name */
    public C2307j f17138A;

    /* renamed from: B, reason: collision with root package name */
    public E3.a f17139B;

    /* renamed from: C, reason: collision with root package name */
    public volatile boolean f17140C;

    /* renamed from: k, reason: collision with root package name */
    public Context f17141k;

    /* renamed from: l, reason: collision with root package name */
    public String f17142l;

    /* renamed from: m, reason: collision with root package name */
    public List f17143m;

    /* renamed from: n, reason: collision with root package name */
    public v3.e f17144n;

    /* renamed from: o, reason: collision with root package name */
    public o2.i f17145o;

    /* renamed from: p, reason: collision with root package name */
    public ListenableWorker f17146p;

    /* renamed from: q, reason: collision with root package name */
    public v3.e f17147q;

    /* renamed from: r, reason: collision with root package name */
    public f2.l f17148r;

    /* renamed from: s, reason: collision with root package name */
    public C1944b f17149s;

    /* renamed from: t, reason: collision with root package name */
    public C1978b f17150t;

    /* renamed from: u, reason: collision with root package name */
    public WorkDatabase f17151u;

    /* renamed from: v, reason: collision with root package name */
    public G7 f17152v;

    /* renamed from: w, reason: collision with root package name */
    public v3.g f17153w;

    /* renamed from: x, reason: collision with root package name */
    public v f17154x;

    /* renamed from: y, reason: collision with root package name */
    public ArrayList f17155y;

    /* renamed from: z, reason: collision with root package name */
    public String f17156z;

    public final void a(f2.l lVar) {
        boolean z3 = lVar instanceof f2.k;
        String str = f17137D;
        if (!z3) {
            if (lVar instanceof f2.j) {
                f2.m.d().e(str, L1.a.m("Worker result RETRY for ", this.f17156z), new Throwable[0]);
                c();
                return;
            }
            f2.m.d().e(str, L1.a.m("Worker result FAILURE for ", this.f17156z), new Throwable[0]);
            if (this.f17145o.c()) {
                d();
                return;
            } else {
                g();
                return;
            }
        }
        f2.m.d().e(str, L1.a.m("Worker result SUCCESS for ", this.f17156z), new Throwable[0]);
        if (this.f17145o.c()) {
            d();
            return;
        }
        v3.g gVar = this.f17153w;
        String str2 = this.f17142l;
        G7 g7 = this.f17152v;
        WorkDatabase workDatabase = this.f17151u;
        workDatabase.c();
        try {
            g7.n(3, str2);
            g7.l(str2, ((f2.k) this.f17148r).f17000a);
            long currentTimeMillis = System.currentTimeMillis();
            ArrayList x5 = gVar.x(str2);
            int size = x5.size();
            int i = 0;
            while (i < size) {
                Object obj = x5.get(i);
                i++;
                String str3 = (String) obj;
                if (g7.e(str3) == 5) {
                    R1.j b3 = R1.j.b("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
                    if (str3 == null) {
                        b3.i(1);
                    } else {
                        b3.k(str3, 1);
                    }
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) gVar.f20439l;
                    workDatabase_Impl.b();
                    Cursor g5 = workDatabase_Impl.g(b3);
                    try {
                        if (g5.moveToFirst() && g5.getInt(0) != 0) {
                            f2.m.d().e(str, "Setting status to enqueued for " + str3, new Throwable[0]);
                            g7.n(1, str3);
                            g7.m(str3, currentTimeMillis);
                        }
                    } finally {
                        g5.close();
                        b3.l();
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
        boolean h3 = h();
        String str = this.f17142l;
        WorkDatabase workDatabase = this.f17151u;
        if (!h3) {
            workDatabase.c();
            try {
                int e3 = this.f17152v.e(str);
                C1071hd m5 = workDatabase.m();
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) m5.f13761l;
                workDatabase_Impl.b();
                o2.e eVar = (o2.e) m5.f13763n;
                Y1.f a5 = eVar.a();
                if (str == null) {
                    a5.h(1);
                } else {
                    a5.i(str, 1);
                }
                workDatabase_Impl.c();
                try {
                    a5.r();
                    workDatabase_Impl.h();
                    if (e3 == 0) {
                        e(false);
                    } else if (e3 == 2) {
                        a(this.f17148r);
                    } else if (!AbstractC0467k.f(e3)) {
                        c();
                    }
                    workDatabase.h();
                    workDatabase.f();
                } finally {
                    workDatabase_Impl.f();
                    eVar.c(a5);
                }
            } catch (Throwable th) {
                workDatabase.f();
                throw th;
            }
        }
        List list = this.f17143m;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC1979c) it.next()).b(str);
            }
            AbstractC1980d.a(this.f17149s, workDatabase, list);
        }
    }

    public final void c() {
        String str = this.f17142l;
        G7 g7 = this.f17152v;
        WorkDatabase workDatabase = this.f17151u;
        workDatabase.c();
        try {
            g7.n(1, str);
            g7.m(str, System.currentTimeMillis());
            g7.j(str, -1L);
            workDatabase.h();
        } finally {
            workDatabase.f();
            e(true);
        }
    }

    public final void d() {
        String str = this.f17142l;
        G7 g7 = this.f17152v;
        WorkDatabase workDatabase = this.f17151u;
        workDatabase.c();
        try {
            g7.m(str, System.currentTimeMillis());
            g7.n(1, str);
            g7.k(str);
            g7.j(str, -1L);
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
    public final void e(boolean z3) {
        boolean z5;
        ListenableWorker listenableWorker;
        C1978b c1978b;
        this.f17151u.c();
        try {
            G7 n5 = this.f17151u.n();
            n5.getClass();
            R1.j b3 = R1.j.b("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) n5.f9170a;
            workDatabase_Impl.b();
            Cursor g5 = workDatabase_Impl.g(b3);
            try {
                if (g5.moveToFirst()) {
                    if (g5.getInt(0) != 0) {
                        z5 = true;
                        if (!z5) {
                            AbstractC2249g.a(this.f17141k, RescheduleReceiver.class, false);
                        }
                        if (z3) {
                            this.f17152v.n(1, this.f17142l);
                            this.f17152v.j(this.f17142l, -1L);
                        }
                        if (this.f17145o != null && (listenableWorker = this.f17146p) != null && listenableWorker.isRunInForeground()) {
                            c1978b = this.f17150t;
                            String str = this.f17142l;
                            synchronized (c1978b.f17105u) {
                                c1978b.f17100p.remove(str);
                                c1978b.i();
                            }
                        }
                        this.f17151u.h();
                        this.f17151u.f();
                        this.f17138A.j(Boolean.valueOf(z3));
                    }
                }
                z5 = false;
                if (!z5) {
                }
                if (z3) {
                }
                if (this.f17145o != null) {
                    c1978b = this.f17150t;
                    String str2 = this.f17142l;
                    synchronized (c1978b.f17105u) {
                    }
                }
                this.f17151u.h();
                this.f17151u.f();
                this.f17138A.j(Boolean.valueOf(z3));
            } finally {
                g5.close();
                b3.l();
            }
        } catch (Throwable th) {
            this.f17151u.f();
            throw th;
        }
    }

    public final void f() {
        G7 g7 = this.f17152v;
        String str = this.f17142l;
        int e3 = g7.e(str);
        String str2 = f17137D;
        if (e3 == 2) {
            f2.m.d().a(str2, L1.a.n("Status for ", str, " is RUNNING;not doing any work and rescheduling for later execution"), new Throwable[0]);
            e(true);
            return;
        }
        f2.m d5 = f2.m.d();
        StringBuilder w5 = AbstractC0467k.w("Status for ", str, " is ");
        w5.append(AbstractC0467k.F(e3));
        w5.append("; not doing any work");
        d5.a(str2, w5.toString(), new Throwable[0]);
        e(false);
    }

    public final void g() {
        String str = this.f17142l;
        WorkDatabase workDatabase = this.f17151u;
        workDatabase.c();
        try {
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            while (!linkedList.isEmpty()) {
                String str2 = (String) linkedList.remove();
                G7 g7 = this.f17152v;
                if (g7.e(str2) != 6) {
                    g7.n(4, str2);
                }
                linkedList.addAll(this.f17153w.x(str2));
            }
            this.f17152v.l(str, ((C1951i) this.f17148r).f16999a);
            workDatabase.h();
        } finally {
            workDatabase.f();
            e(false);
        }
    }

    public final boolean h() {
        if (!this.f17140C) {
            return false;
        }
        f2.m.d().a(f17137D, L1.a.m("Work interrupted for ", this.f17156z), new Throwable[0]);
        if (this.f17152v.e(this.f17142l) == 0) {
            e(false);
            return true;
        }
        e(!AbstractC0467k.f(r0));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bb, code lost:
    
        if ((r6.f18634b == 1 && r6.f18641k > 0) != false) goto L35;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        AbstractC1950h abstractC1950h;
        C1948f a5;
        v vVar = this.f17154x;
        String str = this.f17142l;
        ArrayList j5 = vVar.j(str);
        this.f17155y = j5;
        StringBuilder w5 = AbstractC0467k.w("Work [ id=", str, ", tags={ ");
        int size = j5.size();
        int i = 0;
        boolean z3 = true;
        while (i < size) {
            Object obj = j5.get(i);
            i++;
            String str2 = (String) obj;
            if (z3) {
                z3 = false;
            } else {
                w5.append(", ");
            }
            w5.append(str2);
        }
        w5.append(" } ]");
        this.f17156z = w5.toString();
        G7 g7 = this.f17152v;
        if (h()) {
            return;
        }
        WorkDatabase workDatabase = this.f17151u;
        workDatabase.c();
        try {
            o2.i h3 = g7.h(str);
            this.f17145o = h3;
            String str3 = f17137D;
            if (h3 == null) {
                f2.m.d().b(str3, "Didn't find WorkSpec for id " + str, new Throwable[0]);
                e(false);
                workDatabase.h();
                return;
            }
            if (h3.f18634b != 1) {
                f();
                workDatabase.h();
                f2.m.d().a(str3, this.f17145o.f18635c + " is not in ENQUEUED state. Nothing more to do.", new Throwable[0]);
                return;
            }
            if (!h3.c()) {
                o2.i iVar = this.f17145o;
            }
            long currentTimeMillis = System.currentTimeMillis();
            o2.i iVar2 = this.f17145o;
            if (iVar2.f18644n != 0 && currentTimeMillis < iVar2.a()) {
                f2.m.d().a(str3, "Delaying execution for " + this.f17145o.f18635c + " because it is being executed before schedule.", new Throwable[0]);
                e(true);
                workDatabase.h();
                return;
            }
            workDatabase.h();
            workDatabase.f();
            boolean c5 = this.f17145o.c();
            C1944b c1944b = this.f17149s;
            if (c5) {
                a5 = this.f17145o.f18637e;
            } else {
                Q1.j jVar = c1944b.f16978d;
                String str4 = this.f17145o.f18636d;
                jVar.getClass();
                String str5 = AbstractC1950h.f16998a;
                try {
                    abstractC1950h = (AbstractC1950h) Class.forName(str4).newInstance();
                } catch (Exception e3) {
                    f2.m.d().b(AbstractC1950h.f16998a, L1.a.m("Trouble instantiating + ", str4), e3);
                    abstractC1950h = null;
                }
                if (abstractC1950h == null) {
                    f2.m.d().b(str3, L1.a.m("Could not create Input Merger ", this.f17145o.f18636d), new Throwable[0]);
                    g();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.f17145o.f18637e);
                R1.j b3 = R1.j.b("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
                if (str == null) {
                    b3.i(1);
                } else {
                    b3.k(str, 1);
                }
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) g7.f9170a;
                workDatabase_Impl.b();
                Cursor g5 = workDatabase_Impl.g(b3);
                try {
                    ArrayList arrayList2 = new ArrayList(g5.getCount());
                    while (g5.moveToNext()) {
                        arrayList2.add(C1948f.a(g5.getBlob(0)));
                    }
                    g5.close();
                    b3.l();
                    arrayList.addAll(arrayList2);
                    a5 = abstractC1950h.a(arrayList);
                } catch (Throwable th) {
                    g5.close();
                    b3.l();
                    throw th;
                }
            }
            UUID fromString = UUID.fromString(str);
            ArrayList arrayList3 = this.f17155y;
            int i5 = this.f17145o.f18641k;
            ExecutorService executorService = c1944b.f16975a;
            v3.e eVar = this.f17147q;
            C2257o c2257o = new C2257o(workDatabase, eVar);
            C2256n c2256n = new C2256n(workDatabase, this.f17150t, eVar);
            WorkerParameters workerParameters = new WorkerParameters();
            workerParameters.f7090a = fromString;
            workerParameters.f7091b = a5;
            workerParameters.f7092c = new HashSet(arrayList3);
            workerParameters.f7093d = this.f17144n;
            workerParameters.f7094e = i5;
            workerParameters.f = executorService;
            workerParameters.f7095g = eVar;
            s sVar = c1944b.f16977c;
            workerParameters.f7096h = sVar;
            workerParameters.i = c2257o;
            workerParameters.f7097j = c2256n;
            if (this.f17146p == null) {
                this.f17146p = sVar.a(this.f17141k, this.f17145o.f18635c, workerParameters);
            }
            ListenableWorker listenableWorker = this.f17146p;
            if (listenableWorker == null) {
                f2.m.d().b(str3, L1.a.m("Could not create Worker ", this.f17145o.f18635c), new Throwable[0]);
                g();
                return;
            }
            if (listenableWorker.isUsed()) {
                f2.m.d().b(str3, L1.a.n("Received an already-used Worker ", this.f17145o.f18635c, "; WorkerFactory should return new instances"), new Throwable[0]);
                g();
                return;
            }
            this.f17146p.setUsed();
            workDatabase.c();
            try {
                boolean z5 = true;
                if (g7.e(str) == 1) {
                    g7.n(2, str);
                    g7.i(str);
                } else {
                    z5 = false;
                }
                workDatabase.h();
                if (!z5) {
                    f();
                    return;
                }
                if (h()) {
                    return;
                }
                C2307j c2307j = new C2307j();
                RunnableC2255m runnableC2255m = new RunnableC2255m(this.f17141k, this.f17145o, this.f17146p, c2256n, this.f17147q);
                ((n) eVar.f20434n).execute(runnableC2255m);
                C2307j c2307j2 = runnableC2255m.f18718k;
                c2307j2.a(new q(this, c2307j2, c2307j, 6, false), (n) eVar.f20434n);
                c2307j.a(new q(this, c2307j, this.f17156z, 7, false), (ExecutorC2251i) eVar.f20432l);
            } catch (Throwable th2) {
                throw th2;
            }
        } finally {
            workDatabase.f();
        }
    }
}
