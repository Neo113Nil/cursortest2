package p2;

import A0.J0;
import G.v;
import android.database.Cursor;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.android.gms.internal.ads.G7;
import f2.C1945c;
import f2.C1948f;
import g2.AbstractC1980d;
import g2.C1981e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;
import o2.C2219a;

/* renamed from: p2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2246d implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    public static final String f18693m = f2.m.f("EnqueueRunnable");

    /* renamed from: k, reason: collision with root package name */
    public final C1981e f18694k;

    /* renamed from: l, reason: collision with root package name */
    public final v3.g f18695l = new v3.g(14);

    public RunnableC2246d(C1981e c1981e) {
        this.f18694k = c1981e;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(C1981e c1981e) {
        boolean z3;
        boolean z5;
        boolean z6;
        WorkDatabase workDatabase;
        boolean z7;
        boolean z8;
        G7 g7;
        boolean z9 = false;
        String[] strArr = (String[]) C1981e.R(c1981e).toArray(new String[0]);
        long currentTimeMillis = System.currentTimeMillis();
        g2.l lVar = c1981e.f17108n;
        WorkDatabase workDatabase2 = lVar.f17130m;
        boolean z10 = strArr != null && strArr.length > 0;
        if (z10) {
            z3 = false;
            z5 = false;
            z6 = true;
            for (String str : strArr) {
                o2.i h3 = workDatabase2.n().h(str);
                if (h3 == null) {
                    f2.m.d().b(f18693m, L1.a.n("Prerequisite ", str, " doesn't exist; not enqueuing"), new Throwable[0]);
                    break;
                }
                int i = h3.f18634b;
                z6 &= i == 3;
                if (i == 4) {
                    z5 = true;
                } else if (i == 6) {
                    z3 = true;
                }
            }
        } else {
            z3 = false;
            z5 = false;
            z6 = true;
        }
        boolean isEmpty = TextUtils.isEmpty(null);
        if (isEmpty || z10) {
            workDatabase = workDatabase2;
            z7 = isEmpty;
        } else {
            G7 n5 = workDatabase2.n();
            n5.getClass();
            R1.j b3 = R1.j.b("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
            b3.i(1);
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) n5.f9170a;
            workDatabase_Impl.b();
            Cursor g5 = workDatabase_Impl.g(b3);
            try {
                int t5 = G4.d.t(g5, "id");
                int t6 = G4.d.t(g5, "state");
                workDatabase = workDatabase2;
                ArrayList arrayList = new ArrayList(g5.getCount());
                while (g5.moveToNext()) {
                    o2.h hVar = new o2.h();
                    boolean z11 = isEmpty;
                    hVar.f18631a = g5.getString(t5);
                    hVar.f18632b = N4.b.G(g5.getInt(t6));
                    arrayList.add(hVar);
                    isEmpty = z11;
                }
                z7 = isEmpty;
                g5.close();
                b3.l();
                if (!arrayList.isEmpty()) {
                    int size = arrayList.size();
                    int i5 = 0;
                    while (i5 < size) {
                        Object obj = arrayList.get(i5);
                        i5++;
                        int i6 = ((o2.h) obj).f18632b;
                        if (i6 == 1 || i6 == 2) {
                            z9 = false;
                            break;
                        }
                    }
                    new C2244b(lVar, 1).run();
                    G7 n6 = workDatabase.n();
                    int size2 = arrayList.size();
                    int i7 = 0;
                    while (i7 < size2) {
                        Object obj2 = arrayList.get(i7);
                        i7++;
                        String str2 = ((o2.h) obj2).f18631a;
                        WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) n6.f9170a;
                        workDatabase_Impl2.b();
                        o2.e eVar = (o2.e) n6.f9172c;
                        Y1.f a5 = eVar.a();
                        if (str2 == null) {
                            g7 = n6;
                            a5.h(1);
                        } else {
                            g7 = n6;
                            a5.i(str2, 1);
                        }
                        workDatabase_Impl2.c();
                        try {
                            a5.r();
                            workDatabase_Impl2.h();
                            workDatabase_Impl2.f();
                            eVar.c(a5);
                            n6 = g7;
                        } catch (Throwable th) {
                            workDatabase_Impl2.f();
                            eVar.c(a5);
                            throw th;
                        }
                    }
                    z8 = true;
                    boolean z12 = z8;
                    for (f2.n nVar : c1981e.f17109o) {
                        o2.i iVar = nVar.f17005b;
                        if (!z10 || z6) {
                            if (iVar.c()) {
                                iVar.f18644n = 0L;
                            } else {
                                iVar.f18644n = currentTimeMillis;
                            }
                        } else if (z5) {
                            iVar.f18634b = 4;
                        } else if (z3) {
                            iVar.f18634b = 6;
                        } else {
                            iVar.f18634b = 5;
                        }
                        if (Build.VERSION.SDK_INT <= 25) {
                            C1945c c1945c = iVar.f18640j;
                            String str3 = iVar.f18635c;
                            if (!str3.equals(ConstraintTrackingWorker.class.getName()) && (c1945c.f16985d || c1945c.f16986e)) {
                                J0 j02 = new J0(27);
                                j02.w(iVar.f18637e.f16994a);
                                ((HashMap) j02.f304k).put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str3);
                                iVar.f18635c = ConstraintTrackingWorker.class.getName();
                                C1948f c1948f = new C1948f((HashMap) j02.f304k);
                                C1948f.c(c1948f);
                                iVar.f18637e = c1948f;
                            }
                        }
                        if (iVar.f18634b == 1) {
                            z12 = true;
                        }
                        G7 n7 = workDatabase.n();
                        WorkDatabase_Impl workDatabase_Impl3 = (WorkDatabase_Impl) n7.f9170a;
                        workDatabase_Impl3.b();
                        workDatabase_Impl3.c();
                        try {
                            ((o2.b) n7.f9171b).e(iVar);
                            workDatabase_Impl3.h();
                            workDatabase_Impl3.f();
                            UUID uuid = nVar.f17004a;
                            if (z10) {
                                int length = strArr.length;
                                int i8 = 0;
                                while (i8 < length) {
                                    String[] strArr2 = strArr;
                                    C2219a c2219a = new C2219a(uuid.toString(), strArr[i8]);
                                    v3.g i9 = workDatabase.i();
                                    workDatabase_Impl3 = (WorkDatabase_Impl) i9.f20439l;
                                    workDatabase_Impl3.b();
                                    workDatabase_Impl3.c();
                                    try {
                                        ((o2.b) i9.f20440m).e(c2219a);
                                        workDatabase_Impl3.h();
                                        workDatabase_Impl3.f();
                                        i8++;
                                        strArr = strArr2;
                                    } finally {
                                    }
                                }
                            }
                            String[] strArr3 = strArr;
                            Iterator it = nVar.f17006c.iterator();
                            while (it.hasNext()) {
                                String str4 = (String) it.next();
                                v o5 = workDatabase.o();
                                o2.j jVar = new o2.j(str4, uuid.toString());
                                workDatabase_Impl3 = (WorkDatabase_Impl) o5.f1749l;
                                workDatabase_Impl3.b();
                                workDatabase_Impl3.c();
                                try {
                                    ((o2.b) o5.f1750m).e(jVar);
                                    workDatabase_Impl3.h();
                                    workDatabase_Impl3.f();
                                } finally {
                                }
                            }
                            if (!z7) {
                                v3.g l5 = workDatabase.l();
                                o2.f fVar = new o2.f(uuid.toString());
                                workDatabase_Impl3 = (WorkDatabase_Impl) l5.f20439l;
                                workDatabase_Impl3.b();
                                workDatabase_Impl3.c();
                                try {
                                    ((o2.b) l5.f20440m).e(fVar);
                                    workDatabase_Impl3.h();
                                } finally {
                                }
                            }
                            strArr = strArr3;
                        } finally {
                        }
                    }
                    z9 = z12;
                    c1981e.f17112r = true;
                    return z9;
                }
            } catch (Throwable th2) {
                g5.close();
                b3.l();
                throw th2;
            }
        }
        z8 = false;
        boolean z122 = z8;
        while (r5.hasNext()) {
        }
        z9 = z122;
        c1981e.f17112r = true;
        return z9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v3.g gVar = this.f18695l;
        C1981e c1981e = this.f18694k;
        try {
            if (C1981e.Q(c1981e, new HashSet())) {
                throw new IllegalStateException("WorkContinuation has cycles (" + c1981e + ")");
            }
            g2.l lVar = c1981e.f17108n;
            WorkDatabase workDatabase = lVar.f17130m;
            workDatabase.c();
            try {
                boolean a5 = a(c1981e);
                workDatabase.h();
                if (a5) {
                    AbstractC2249g.a(lVar.f17128k, RescheduleReceiver.class, true);
                    AbstractC1980d.a(lVar.f17129l, lVar.f17130m, lVar.f17132o);
                }
                gVar.E(f2.r.f17007g);
            } finally {
                workDatabase.f();
            }
        } catch (Throwable th) {
            gVar.E(new f2.o(th));
        }
    }
}
