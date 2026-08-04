package p031e1;

import H2.q;
import I3.b;
import K0.f;
import W5.AbstractC0486a1;
import android.content.Context;
import android.database.Cursor;
import android.support.v4.media.session.t;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import com.google.android.gms.common.internal.w;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import p019c5.a;
import p023d1.j;
import p023d1.l;
import p023d1.n;
import p028d6.k;
import p036e6.c;
import p072k1.g;
import p088m1.e;
import p088m1.i;
import p096n1.h;
import p155w1.C1050x1;
import p155w1.L;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Runnable {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final String f12556K = n.g("WorkerWrapper");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public b f12557A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public WorkDatabase f12558B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public a f12559C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public k f12560D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public w f12561E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public ArrayList f12562F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public String f12563G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public p103o1.k f12564H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public b f12565I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public volatile boolean f12566J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f12567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f12568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f12569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public t f12570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i f12571e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ListenableWorker f12572f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public C1050x1 f12573x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public p023d1.m f12574y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public p023d1.b f12575z;

    public final void a(p023d1.m mVar) {
        boolean z4 = mVar instanceof l;
        String str = f12556K;
        if (!z4) {
            if (mVar instanceof p023d1.k) {
                n.d().e(str, L.i("Worker result RETRY for ", this.f12563G), new Throwable[0]);
                c();
                return;
            }
            n.d().e(str, L.i("Worker result FAILURE for ", this.f12563G), new Throwable[0]);
            if (this.f12571e.c()) {
                d();
                return;
            } else {
                g();
                return;
            }
        }
        n.d().e(str, L.i("Worker result SUCCESS for ", this.f12563G), new Throwable[0]);
        if (this.f12571e.c()) {
            d();
            return;
        }
        k kVar = this.f12560D;
        String str2 = this.f12568b;
        a aVar = this.f12559C;
        WorkDatabase workDatabase = this.f12558B;
        workDatabase.c();
        try {
            aVar.u(3, str2);
            aVar.s(str2, ((l) this.f12574y).f12369a);
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (String str3 : kVar.n(str2)) {
                if (aVar.h(str3) == 5) {
                    D0.k kVarC = D0.k.c(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
                    if (str3 == null) {
                        kVarC.e(1);
                    } else {
                        kVarC.f(1, str3);
                    }
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) kVar.f12447b;
                    workDatabase_Impl.b();
                    Cursor cursorG = workDatabase_Impl.g(kVarC);
                    try {
                        boolean z7 = cursorG.moveToFirst() && cursorG.getInt(0) != 0;
                        cursorG.close();
                        kVarC.g();
                        if (z7) {
                            n.d().e(str, "Setting status to enqueued for " + str3, new Throwable[0]);
                            aVar.u(1, str3);
                            aVar.t(str3, jCurrentTimeMillis);
                        }
                    } catch (Throwable th) {
                        cursorG.close();
                        kVarC.g();
                        throw th;
                    }
                }
            }
            workDatabase.h();
            workDatabase.f();
            e(false);
        } catch (Throwable th2) {
            workDatabase.f();
            e(false);
            throw th2;
        }
    }

    public final void b() {
        boolean zH = h();
        String str = this.f12568b;
        WorkDatabase workDatabase = this.f12558B;
        if (!zH) {
            workDatabase.c();
            try {
                int iH = this.f12559C.h(str);
                g gVarM = workDatabase.m();
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) gVarM.f14680a;
                workDatabase_Impl.b();
                e eVar = (e) gVarM.f14682c;
                f fVarA = eVar.a();
                if (str == null) {
                    fVarA.d(1);
                } else {
                    fVarA.e(1, str);
                }
                workDatabase_Impl.c();
                try {
                    fVarA.k();
                    workDatabase_Impl.h();
                    workDatabase_Impl.f();
                    eVar.c(fVarA);
                    if (iH == 0) {
                        e(false);
                    } else if (iH == 2) {
                        a(this.f12574y);
                    } else if (!AbstractC0486a1.b(iH)) {
                        c();
                    }
                    workDatabase.h();
                    workDatabase.f();
                } catch (Throwable th) {
                    workDatabase_Impl.f();
                    eVar.c(fVarA);
                    throw th;
                }
            } catch (Throwable th2) {
                workDatabase.f();
                throw th2;
            }
        }
        List list = this.f12569c;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((c) it.next()).c(str);
            }
            d.a(this.f12575z, workDatabase, list);
        }
    }

    public final void c() {
        String str = this.f12568b;
        a aVar = this.f12559C;
        WorkDatabase workDatabase = this.f12558B;
        workDatabase.c();
        try {
            aVar.u(1, str);
            aVar.t(str, System.currentTimeMillis());
            aVar.p(str, -1L);
            workDatabase.h();
        } finally {
            workDatabase.f();
            e(true);
        }
    }

    public final void d() {
        String str = this.f12568b;
        a aVar = this.f12559C;
        WorkDatabase workDatabase = this.f12558B;
        workDatabase.c();
        try {
            aVar.t(str, System.currentTimeMillis());
            aVar.u(1, str);
            aVar.r(str);
            aVar.p(str, -1L);
            workDatabase.h();
        } finally {
            workDatabase.f();
            e(false);
        }
    }

    public final void e(boolean z4) {
        ListenableWorker listenableWorker;
        this.f12558B.c();
        try {
            a aVarN = this.f12558B.n();
            aVarN.getClass();
            D0.k kVarC = D0.k.c(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) aVarN.f10433a;
            workDatabase_Impl.b();
            Cursor cursorG = workDatabase_Impl.g(kVarC);
            try {
                boolean z7 = cursorG.moveToFirst() && cursorG.getInt(0) != 0;
                cursorG.close();
                kVarC.g();
                if (!z7) {
                    p096n1.f.a(this.f12567a, RescheduleReceiver.class, false);
                }
                if (z4) {
                    this.f12559C.u(1, this.f12568b);
                    this.f12559C.p(this.f12568b, -1L);
                }
                if (this.f12571e != null && (listenableWorker = this.f12572f) != null && listenableWorker.isRunInForeground()) {
                    b bVar = this.f12557A;
                    String str = this.f12568b;
                    synchronized (bVar.f12516B) {
                        bVar.f12522f.remove(str);
                        bVar.h();
                    }
                }
                this.f12558B.h();
                this.f12558B.f();
                this.f12564H.i(Boolean.valueOf(z4));
            } catch (Throwable th) {
                cursorG.close();
                kVarC.g();
                throw th;
            }
        } catch (Throwable th2) {
            this.f12558B.f();
            throw th2;
        }
    }

    public final void f() {
        a aVar = this.f12559C;
        String str = this.f12568b;
        int iH = aVar.h(str);
        String str2 = f12556K;
        if (iH == 2) {
            n.d().b(str2, AbstractC0486a1.h("Status for ", str, " is RUNNING;not doing any work and rescheduling for later execution"), new Throwable[0]);
            e(true);
            return;
        }
        n nVarD = n.d();
        StringBuilder sbK = k.k("Status for ", str, " is ");
        sbK.append(AbstractC0486a1.z(iH));
        sbK.append("; not doing any work");
        nVarD.b(str2, sbK.toString(), new Throwable[0]);
        e(false);
    }

    public final void g() {
        String str = this.f12568b;
        WorkDatabase workDatabase = this.f12558B;
        workDatabase.c();
        try {
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            while (!linkedList.isEmpty()) {
                String str2 = (String) linkedList.remove();
                a aVar = this.f12559C;
                if (aVar.h(str2) != 6) {
                    aVar.u(4, str2);
                }
                linkedList.addAll(this.f12560D.n(str2));
            }
            this.f12559C.s(str, ((j) this.f12574y).f12368a);
            workDatabase.h();
        } finally {
            workDatabase.f();
            e(false);
        }
    }

    public final boolean h() {
        if (!this.f12566J) {
            return false;
        }
        n.d().b(f12556K, L.i("Work interrupted for ", this.f12563G), new Throwable[0]);
        int iH = this.f12559C.h(this.f12568b);
        if (iH == 0) {
            e(false);
        } else {
            e(!AbstractC0486a1.b(iH));
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00bd A[Catch: all -> 0x007c, TryCatch #3 {all -> 0x007c, blocks: (B:14:0x0052, B:17:0x005c, B:21:0x007f, B:23:0x0083, B:24:0x00a8, B:26:0x00ae, B:28:0x00b4, B:39:0x00fa, B:33:0x00bd, B:36:0x00cc, B:38:0x00d4), top: B:100:0x0052 }] */
    @Override // java.lang.Runnable
    public final void run() {
        i iVar;
        p023d1.i iVar2;
        p023d1.g gVarA;
        w wVar = this.f12561E;
        String str = this.f12568b;
        ArrayList<String> arrayListG = wVar.G(str);
        this.f12562F = arrayListG;
        StringBuilder sbK = k.k("Work [ id=", str, ", tags={ ");
        boolean z4 = true;
        for (String str2 : arrayListG) {
            if (z4) {
                z4 = false;
            } else {
                sbK.append(", ");
            }
            sbK.append(str2);
        }
        sbK.append(" } ]");
        this.f12563G = sbK.toString();
        a aVar = this.f12559C;
        if (h()) {
            return;
        }
        WorkDatabase workDatabase = this.f12558B;
        workDatabase.c();
        try {
            i iVarL = aVar.l(str);
            this.f12571e = iVarL;
            String str3 = f12556K;
            if (iVarL == null) {
                n.d().c(str3, "Didn't find WorkSpec for id " + str, new Throwable[0]);
                e(false);
                workDatabase.h();
            } else {
                if (iVarL.f15223b == 1) {
                    if (iVarL.c()) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        iVar = this.f12571e;
                        if (iVar.f15234n != 0) {
                            n.d().b(str3, "Delaying execution for " + this.f12571e.f15224c + " because it is being executed before schedule.", new Throwable[0]);
                            e(true);
                            workDatabase.h();
                        }
                    } else {
                        i iVar3 = this.f12571e;
                        if (iVar3.f15223b == 1 && iVar3.f15231k > 0) {
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            iVar = this.f12571e;
                            if (iVar.f15234n != 0 && jCurrentTimeMillis2 < iVar.a()) {
                                n.d().b(str3, "Delaying execution for " + this.f12571e.f15224c + " because it is being executed before schedule.", new Throwable[0]);
                                e(true);
                                workDatabase.h();
                            }
                        }
                    }
                    workDatabase.h();
                    workDatabase.f();
                    boolean zC = this.f12571e.c();
                    p023d1.b bVar = this.f12575z;
                    if (zC) {
                        gVarA = this.f12571e.f15226e;
                    } else {
                        c cVar = bVar.f12343d;
                        String str4 = this.f12571e.f15225d;
                        cVar.getClass();
                        String str5 = p023d1.i.f12367a;
                        try {
                            iVar2 = (p023d1.i) Class.forName(str4).newInstance();
                        } catch (Exception e7) {
                            n.d().c(p023d1.i.f12367a, L.i("Trouble instantiating + ", str4), e7);
                            iVar2 = null;
                        }
                        if (iVar2 == null) {
                            n.d().c(str3, L.i("Could not create Input Merger ", this.f12571e.f15225d), new Throwable[0]);
                            g();
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(this.f12571e.f15226e);
                        D0.k kVarC = D0.k.c(1, "SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
                        if (str == null) {
                            kVarC.e(1);
                        } else {
                            kVarC.f(1, str);
                        }
                        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) aVar.f10433a;
                        workDatabase_Impl.b();
                        Cursor cursorG = workDatabase_Impl.g(kVarC);
                        try {
                            ArrayList arrayList2 = new ArrayList(cursorG.getCount());
                            while (cursorG.moveToNext()) {
                                arrayList2.add(p023d1.g.a(cursorG.getBlob(0)));
                            }
                            cursorG.close();
                            kVarC.g();
                            arrayList.addAll(arrayList2);
                            gVarA = iVar2.a(arrayList);
                        } catch (Throwable th) {
                            cursorG.close();
                            kVarC.g();
                            throw th;
                        }
                    }
                    UUID uuidFromString = UUID.fromString(str);
                    ArrayList arrayList3 = this.f12562F;
                    int i7 = this.f12571e.f15231k;
                    ExecutorService executorService = bVar.f12340a;
                    C1050x1 c1050x1 = this.f12573x;
                    p096n1.n nVar = new p096n1.n(workDatabase, c1050x1);
                    p096n1.m mVar = new p096n1.m(workDatabase, this.f12557A, c1050x1);
                    WorkerParameters workerParameters = new WorkerParameters();
                    workerParameters.f9860a = uuidFromString;
                    workerParameters.f9861b = gVarA;
                    workerParameters.f9862c = new HashSet(arrayList3);
                    workerParameters.f9863d = this.f12570d;
                    workerParameters.f9864e = i7;
                    workerParameters.f9865f = executorService;
                    workerParameters.f9866g = c1050x1;
                    p023d1.t tVar = bVar.f12342c;
                    workerParameters.f9867h = tVar;
                    workerParameters.f9868i = nVar;
                    workerParameters.j = mVar;
                    if (this.f12572f == null) {
                        this.f12572f = tVar.a(this.f12567a, this.f12571e.f15224c, workerParameters);
                    }
                    ListenableWorker listenableWorker = this.f12572f;
                    if (listenableWorker == null) {
                        n.d().c(str3, L.i("Could not create Worker ", this.f12571e.f15224c), new Throwable[0]);
                        g();
                        return;
                    }
                    if (listenableWorker.isUsed()) {
                        n.d().c(str3, AbstractC0486a1.h("Received an already-used Worker ", this.f12571e.f15224c, "; WorkerFactory should return new instances"), new Throwable[0]);
                        g();
                        return;
                    }
                    this.f12572f.setUsed();
                    workDatabase.c();
                    try {
                        boolean z7 = true;
                        if (aVar.h(str) == 1) {
                            aVar.u(2, str);
                            aVar.m(str);
                        } else {
                            z7 = false;
                        }
                        workDatabase.h();
                        workDatabase.f();
                        if (!z7) {
                            f();
                            return;
                        }
                        if (h()) {
                            return;
                        }
                        p103o1.k kVar = new p103o1.k();
                        p096n1.l lVar = new p096n1.l(this.f12567a, this.f12571e, this.f12572f, mVar, this.f12573x);
                        ((L.f) c1050x1.f17933d).execute(lVar);
                        p103o1.k kVar2 = lVar.f15331a;
                        kVar2.addListener(new q(17, this, kVar2, kVar, false), (L.f) c1050x1.f17933d);
                        kVar.addListener(new q(18, this, kVar, this.f12563G, false), (h) c1050x1.f17931b);
                        return;
                    } catch (Throwable th2) {
                        workDatabase.f();
                        throw th2;
                    }
                }
                f();
                workDatabase.h();
                n.d().b(str3, this.f12571e.f15224c + " is not in ENQUEUED state. Nothing more to do.", new Throwable[0]);
            }
            workDatabase.f();
        } catch (Throwable th3) {
            workDatabase.f();
            throw th3;
        }
    }
}
