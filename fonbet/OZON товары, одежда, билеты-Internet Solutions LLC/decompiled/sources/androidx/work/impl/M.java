package androidx.work.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.WorkerParameters;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.n;
import androidx.work.v;
import g5.C6627B;
import g5.C6643p;
import g5.InterfaceC6629b;
import g5.S;
import h5.C6801B;
import i5.C7009b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;

/* loaded from: classes8.dex */
public final class M implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    static final String f45324s = androidx.work.o.i("WorkerWrapper");

    /* renamed from: a, reason: collision with root package name */
    Context f45325a;

    /* renamed from: b, reason: collision with root package name */
    private final String f45326b;

    /* renamed from: c, reason: collision with root package name */
    private List<r> f45327c;

    /* renamed from: d, reason: collision with root package name */
    private WorkerParameters.a f45328d;

    /* renamed from: e, reason: collision with root package name */
    C6627B f45329e;

    /* renamed from: f, reason: collision with root package name */
    androidx.work.n f45330f;

    /* renamed from: g, reason: collision with root package name */
    C7009b f45331g;

    /* renamed from: i, reason: collision with root package name */
    private androidx.work.c f45333i;

    /* renamed from: j, reason: collision with root package name */
    private p f45334j;

    /* renamed from: k, reason: collision with root package name */
    private WorkDatabase f45335k;

    /* renamed from: l, reason: collision with root package name */
    private g5.C f45336l;

    /* renamed from: m, reason: collision with root package name */
    private InterfaceC6629b f45337m;

    /* renamed from: n, reason: collision with root package name */
    private List<String> f45338n;

    /* renamed from: o, reason: collision with root package name */
    private String f45339o;

    /* renamed from: r, reason: collision with root package name */
    private volatile boolean f45342r;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    n.a f45332h = new n.a.C0823a();

    /* renamed from: p, reason: collision with root package name */
    @NonNull
    androidx.work.impl.utils.futures.c<Boolean> f45340p = androidx.work.impl.utils.futures.c.k();

    /* renamed from: q, reason: collision with root package name */
    @NonNull
    final androidx.work.impl.utils.futures.c<n.a> f45341q = androidx.work.impl.utils.futures.c.k();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        Context f45343a;

        /* renamed from: b, reason: collision with root package name */
        @NonNull
        p f45344b;

        /* renamed from: c, reason: collision with root package name */
        @NonNull
        C7009b f45345c;

        /* renamed from: d, reason: collision with root package name */
        @NonNull
        androidx.work.c f45346d;

        /* renamed from: e, reason: collision with root package name */
        @NonNull
        WorkDatabase f45347e;

        /* renamed from: f, reason: collision with root package name */
        @NonNull
        C6627B f45348f;

        /* renamed from: g, reason: collision with root package name */
        List<r> f45349g;

        /* renamed from: h, reason: collision with root package name */
        private final ArrayList f45350h;

        /* renamed from: i, reason: collision with root package name */
        @NonNull
        WorkerParameters.a f45351i = new WorkerParameters.a();

        public a(@NonNull Context context, @NonNull androidx.work.c cVar, @NonNull C7009b c7009b, @NonNull p pVar, @NonNull WorkDatabase workDatabase, @NonNull C6627B c6627b, @NonNull ArrayList arrayList) {
            this.f45343a = context.getApplicationContext();
            this.f45345c = c7009b;
            this.f45344b = pVar;
            this.f45346d = cVar;
            this.f45347e = workDatabase;
            this.f45348f = c6627b;
            this.f45350h = arrayList;
        }

        @NonNull
        public final M b() {
            return new M(this);
        }

        @NonNull
        public final void c(WorkerParameters.a aVar) {
            if (aVar != null) {
                this.f45351i = aVar;
            }
        }

        @NonNull
        public final void d(@NonNull List list) {
            this.f45349g = list;
        }
    }

    M(@NonNull a aVar) {
        this.f45325a = aVar.f45343a;
        this.f45331g = aVar.f45345c;
        this.f45334j = aVar.f45344b;
        C6627B c6627b = aVar.f45348f;
        this.f45329e = c6627b;
        this.f45326b = c6627b.f63799a;
        this.f45327c = aVar.f45349g;
        this.f45328d = aVar.f45351i;
        this.f45330f = null;
        this.f45333i = aVar.f45346d;
        WorkDatabase workDatabase = aVar.f45347e;
        this.f45335k = workDatabase;
        this.f45336l = workDatabase.f();
        this.f45337m = workDatabase.a();
        this.f45338n = aVar.f45350h;
    }

    private void d(n.a aVar) {
        boolean z11 = aVar instanceof n.a.c;
        C6627B c6627b = this.f45329e;
        String str = f45324s;
        if (!z11) {
            if (aVar instanceof n.a.b) {
                androidx.work.o.e().f(str, "Worker result RETRY for " + this.f45339o);
                g();
                return;
            }
            androidx.work.o.e().f(str, "Worker result FAILURE for " + this.f45339o);
            if (c6627b.f()) {
                h();
                return;
            } else {
                k();
                return;
            }
        }
        androidx.work.o.e().f(str, "Worker result SUCCESS for " + this.f45339o);
        if (c6627b.f()) {
            h();
            return;
        }
        InterfaceC6629b interfaceC6629b = this.f45337m;
        String str2 = this.f45326b;
        g5.C c11 = this.f45336l;
        WorkDatabase workDatabase = this.f45335k;
        workDatabase.beginTransaction();
        try {
            c11.f(v.a.SUCCEEDED, str2);
            c11.r(str2, ((n.a.c) this.f45332h).c());
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it = interfaceC6629b.b(str2).iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                if (c11.d(str3) == v.a.BLOCKED && interfaceC6629b.c(str3)) {
                    androidx.work.o.e().f(str, "Setting status to enqueued for " + str3);
                    c11.f(v.a.ENQUEUED, str3);
                    c11.s(currentTimeMillis, str3);
                }
            }
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
            i(false);
        } catch (Throwable th2) {
            workDatabase.endTransaction();
            i(false);
            throw th2;
        }
    }

    private void g() {
        String str = this.f45326b;
        g5.C c11 = this.f45336l;
        WorkDatabase workDatabase = this.f45335k;
        workDatabase.beginTransaction();
        try {
            c11.f(v.a.ENQUEUED, str);
            c11.s(System.currentTimeMillis(), str);
            c11.j(-1L, str);
            workDatabase.setTransactionSuccessful();
        } finally {
            workDatabase.endTransaction();
            i(true);
        }
    }

    private void h() {
        String str = this.f45326b;
        g5.C c11 = this.f45336l;
        WorkDatabase workDatabase = this.f45335k;
        workDatabase.beginTransaction();
        try {
            c11.s(System.currentTimeMillis(), str);
            c11.f(v.a.ENQUEUED, str);
            c11.h(str);
            c11.i(str);
            c11.j(-1L, str);
            workDatabase.setTransactionSuccessful();
        } finally {
            workDatabase.endTransaction();
            i(false);
        }
    }

    private void i(boolean z11) {
        p pVar = this.f45334j;
        g5.C c11 = this.f45336l;
        WorkDatabase workDatabase = this.f45335k;
        workDatabase.beginTransaction();
        try {
            if (!workDatabase.f().g()) {
                h5.l.a(this.f45325a, RescheduleReceiver.class, false);
            }
            String str = this.f45326b;
            if (z11) {
                c11.f(v.a.ENQUEUED, str);
                c11.j(-1L, str);
            }
            if (this.f45329e != null && this.f45330f != null && pVar.h(str)) {
                pVar.m(str);
            }
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
            this.f45340p.j(Boolean.valueOf(z11));
        } catch (Throwable th2) {
            workDatabase.endTransaction();
            throw th2;
        }
    }

    private void j() {
        g5.C c11 = this.f45336l;
        String str = this.f45326b;
        v.a d11 = c11.d(str);
        v.a aVar = v.a.RUNNING;
        String str2 = f45324s;
        if (d11 == aVar) {
            androidx.work.o.e().a(str2, "Status for " + str + " is RUNNING; not doing any work and rescheduling for later execution");
            i(true);
            return;
        }
        androidx.work.o.e().a(str2, "Status for " + str + " is " + d11 + " ; not doing any work");
        i(false);
    }

    private boolean l() {
        if (!this.f45342r) {
            return false;
        }
        androidx.work.o.e().a(f45324s, "Work interrupted for " + this.f45339o);
        if (this.f45336l.d(this.f45326b) == null) {
            i(false);
            return true;
        }
        i(!r0.a());
        return true;
    }

    @NonNull
    public final androidx.work.impl.utils.futures.c a() {
        return this.f45340p;
    }

    @NonNull
    public final C6643p b() {
        return S.a(this.f45329e);
    }

    @NonNull
    public final C6627B c() {
        return this.f45329e;
    }

    public final void e() {
        this.f45342r = true;
        l();
        this.f45341q.cancel(true);
        if (this.f45330f != null && this.f45341q.isCancelled()) {
            this.f45330f.stop();
            return;
        }
        androidx.work.o.e().a(f45324s, "WorkSpec " + this.f45329e + " is already done. Not interrupting.");
    }

    final void f() {
        boolean l11 = l();
        WorkDatabase workDatabase = this.f45335k;
        String str = this.f45326b;
        if (!l11) {
            workDatabase.beginTransaction();
            try {
                v.a d11 = this.f45336l.d(str);
                workDatabase.e().delete(str);
                if (d11 == null) {
                    i(false);
                } else if (d11 == v.a.RUNNING) {
                    d(this.f45332h);
                } else if (!d11.a()) {
                    g();
                }
                workDatabase.setTransactionSuccessful();
                workDatabase.endTransaction();
            } catch (Throwable th2) {
                workDatabase.endTransaction();
                throw th2;
            }
        }
        List<r> list = this.f45327c;
        if (list != null) {
            Iterator<r> it = list.iterator();
            while (it.hasNext()) {
                it.next().d(str);
            }
            s.b(this.f45333i, workDatabase, list);
        }
    }

    final void k() {
        String str = this.f45326b;
        WorkDatabase workDatabase = this.f45335k;
        workDatabase.beginTransaction();
        try {
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            while (true) {
                boolean isEmpty = linkedList.isEmpty();
                g5.C c11 = this.f45336l;
                if (isEmpty) {
                    c11.r(str, ((n.a.C0823a) this.f45332h).c());
                    workDatabase.setTransactionSuccessful();
                    return;
                } else {
                    String str2 = (String) linkedList.remove();
                    if (c11.d(str2) != v.a.CANCELLED) {
                        c11.f(v.a.FAILED, str2);
                    }
                    linkedList.addAll(this.f45337m.b(str2));
                }
            }
        } finally {
            workDatabase.endTransaction();
            i(false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0090, code lost:
    
        if ((r0.f63800b == r8 && r0.f63809k > 0) != false) goto L31;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        androidx.work.e b11;
        boolean z11;
        StringBuilder sb2 = new StringBuilder("Work [ id=");
        String str = this.f45326b;
        sb2.append(str);
        sb2.append(", tags={ ");
        boolean z12 = true;
        for (String str2 : this.f45338n) {
            if (z12) {
                z12 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(str2);
        }
        sb2.append(" } ]");
        this.f45339o = sb2.toString();
        C6627B c6627b = this.f45329e;
        if (l()) {
            return;
        }
        WorkDatabase workDatabase = this.f45335k;
        workDatabase.beginTransaction();
        try {
            v.a aVar = c6627b.f63800b;
            v.a aVar2 = v.a.ENQUEUED;
            String str3 = c6627b.f63801c;
            String str4 = f45324s;
            if (aVar != aVar2) {
                j();
                workDatabase.setTransactionSuccessful();
                androidx.work.o.e().a(str4, str3 + " is not in ENQUEUED state. Nothing more to do");
                return;
            }
            if (!c6627b.f()) {
            }
            if (System.currentTimeMillis() < c6627b.a()) {
                androidx.work.o.e().a(str4, "Delaying execution for " + str3 + " because it is being executed before schedule.");
                i(true);
                workDatabase.setTransactionSuccessful();
                return;
            }
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
            boolean f7 = c6627b.f();
            g5.C c11 = this.f45336l;
            androidx.work.c cVar = this.f45333i;
            if (f7) {
                b11 = c6627b.f63803e;
            } else {
                He.g b12 = cVar.b();
                String str5 = c6627b.f63802d;
                b12.getClass();
                androidx.work.j a11 = androidx.work.j.a(str5);
                if (a11 == null) {
                    androidx.work.o.e().c(str4, "Could not create Input Merger " + c6627b.f63802d);
                    k();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(c6627b.f63803e);
                arrayList.addAll(c11.e(str));
                b11 = a11.b(arrayList);
            }
            androidx.work.e eVar = b11;
            UUID fromString = UUID.fromString(str);
            ExecutorService a12 = cVar.a();
            androidx.work.z h11 = cVar.h();
            C7009b c7009b = this.f45331g;
            WorkerParameters workerParameters = new WorkerParameters(fromString, eVar, this.f45338n, this.f45328d, c6627b.f63809k, a12, this.f45331g, h11, new C6801B(workDatabase, c7009b), new h5.z(workDatabase, this.f45334j, c7009b));
            if (this.f45330f == null) {
                this.f45330f = cVar.h().a(this.f45325a, str3, workerParameters);
            }
            androidx.work.n nVar = this.f45330f;
            if (nVar == null) {
                androidx.work.o.e().c(str4, "Could not create Worker " + str3);
                k();
                return;
            }
            if (nVar.isUsed()) {
                androidx.work.o.e().c(str4, "Received an already-used Worker " + str3 + "; Worker Factory should return new instances");
                k();
                return;
            }
            this.f45330f.setUsed();
            workDatabase.beginTransaction();
            try {
                if (c11.d(str) == aVar2) {
                    c11.f(v.a.RUNNING, str);
                    c11.v(str);
                    z11 = true;
                } else {
                    z11 = false;
                }
                workDatabase.setTransactionSuccessful();
                if (!z11) {
                    j();
                    return;
                }
                if (l()) {
                    return;
                }
                h5.x xVar = new h5.x(this.f45325a, this.f45329e, this.f45330f, workerParameters.b(), this.f45331g);
                c7009b.b().execute(xVar);
                final androidx.work.impl.utils.futures.c a13 = xVar.a();
                Runnable runnable = new Runnable() { // from class: androidx.work.impl.J
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (M.this.f45341q.isCancelled()) {
                            a13.cancel(true);
                        }
                    }
                };
                h5.t tVar = new h5.t();
                androidx.work.impl.utils.futures.c<n.a> cVar2 = this.f45341q;
                cVar2.a(runnable, tVar);
                a13.a(new K(this, a13), c7009b.b());
                cVar2.a(new L(this, this.f45339o), c7009b.c());
            } catch (Throwable th2) {
                throw th2;
            }
        } finally {
            workDatabase.endTransaction();
        }
    }
}
