package n1;

import W5.AbstractC0486a1;
import android.database.Cursor;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import c5.C0820a;
import com.google.android.gms.common.internal.w;
import d1.C0950c;
import d1.C0953f;
import d1.C0954g;
import d1.s;
import d6.C0977k;
import e1.AbstractC0997d;
import e1.C0998e;
import io.sentry.protocol.SentryThread;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;
import m1.C1426a;
import m1.C1427b;
import m1.C1430e;
import m1.C1431f;
import m1.C1433h;
import n3.AbstractC1464a;

/* renamed from: n1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1448c implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    public static final String f15299c = d1.n.g("EnqueueRunnable");

    /* renamed from: a, reason: collision with root package name */
    public final C0998e f15300a;

    /* renamed from: b, reason: collision with root package name */
    public final w f15301b = new w(2);

    public RunnableC1448c(C0998e c0998e) {
        this.f15300a = c0998e;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(C0998e c0998e) {
        boolean z4;
        boolean z7;
        boolean z8;
        String[] strArr;
        boolean z9;
        boolean z10;
        Iterator it;
        Iterator it2;
        long j;
        String[] strArr2;
        boolean z11;
        boolean z12 = false;
        String[] strArr3 = (String[]) C0998e.i0(c0998e).toArray(new String[0]);
        long currentTimeMillis = System.currentTimeMillis();
        e1.l lVar = c0998e.f12522g;
        WorkDatabase workDatabase = lVar.f12546f;
        boolean z13 = strArr3 != null && strArr3.length > 0;
        if (z13) {
            z4 = false;
            z7 = false;
            z8 = true;
            for (String str : strArr3) {
                m1.i l7 = workDatabase.n().l(str);
                if (l7 == null) {
                    d1.n.d().c(f15299c, AbstractC0486a1.h("Prerequisite ", str, " doesn't exist; not enqueuing"), new Throwable[0]);
                    break;
                }
                int i7 = l7.f15217b;
                z8 &= i7 == 3;
                if (i7 == 4) {
                    z7 = true;
                } else if (i7 == 6) {
                    z4 = true;
                }
            }
        } else {
            z4 = false;
            z7 = false;
            z8 = true;
        }
        boolean isEmpty = TextUtils.isEmpty(null);
        if (isEmpty || z13) {
            strArr = strArr3;
            z9 = isEmpty;
        } else {
            C0820a n2 = workDatabase.n();
            n2.getClass();
            D0.k c3 = D0.k.c(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
            c3.e(1);
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) n2.f10433a;
            workDatabase_Impl.b();
            Cursor g3 = workDatabase_Impl.g(c3);
            try {
                int J5 = p3.f.J(g3, "id");
                int J6 = p3.f.J(g3, SentryThread.JsonKeys.STATE);
                z9 = isEmpty;
                ArrayList arrayList = new ArrayList(g3.getCount());
                while (g3.moveToNext()) {
                    C1433h c1433h = new C1433h();
                    String[] strArr4 = strArr3;
                    c1433h.f15214a = g3.getString(J5);
                    c1433h.f15215b = AbstractC1464a.C(g3.getInt(J6));
                    arrayList.add(c1433h);
                    strArr3 = strArr4;
                }
                strArr = strArr3;
                g3.close();
                c3.g();
                if (!arrayList.isEmpty()) {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        int i8 = ((C1433h) it3.next()).f15215b;
                        if (i8 == 1 || i8 == 2) {
                            z11 = true;
                            z12 = false;
                            break;
                        }
                    }
                    new C1447b(lVar, 1).run();
                    C0820a n7 = workDatabase.n();
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        String str2 = ((C1433h) it4.next()).f15214a;
                        WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) n7.f10433a;
                        workDatabase_Impl2.b();
                        C1430e c1430e = (C1430e) n7.f10435c;
                        K0.f a2 = c1430e.a();
                        if (str2 == null) {
                            a2.d(1);
                        } else {
                            a2.e(1, str2);
                        }
                        workDatabase_Impl2.c();
                        try {
                            a2.k();
                            workDatabase_Impl2.h();
                        } finally {
                            workDatabase_Impl2.f();
                            c1430e.c(a2);
                        }
                    }
                    z10 = true;
                    it = c0998e.f12523h.iterator();
                    boolean z14 = z10;
                    while (it.hasNext()) {
                        d1.o oVar = (d1.o) it.next();
                        m1.i iVar = oVar.f12367b;
                        if (!z13 || z8) {
                            if (iVar.c()) {
                                iVar.f15228n = 0L;
                            } else {
                                iVar.f15228n = currentTimeMillis;
                            }
                        } else if (z7) {
                            iVar.f15217b = 4;
                        } else if (z4) {
                            iVar.f15217b = 6;
                        } else {
                            iVar.f15217b = 5;
                        }
                        if (Build.VERSION.SDK_INT <= 25) {
                            C0950c c0950c = iVar.j;
                            String str3 = iVar.f15218c;
                            if (!str3.equals(ConstraintTrackingWorker.class.getName()) && (c0950c.f12346d || c0950c.f12347e)) {
                                C0953f c0953f = new C0953f();
                                c0953f.b(iVar.f15220e.f12357a);
                                c0953f.f12354a.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str3);
                                iVar.f15218c = ConstraintTrackingWorker.class.getName();
                                C0954g c0954g = new C0954g(c0953f.f12354a);
                                C0954g.c(c0954g);
                                iVar.f15220e = c0954g;
                            }
                        }
                        if (iVar.f15217b == 1) {
                            z14 = true;
                        }
                        C0820a n8 = workDatabase.n();
                        WorkDatabase_Impl workDatabase_Impl3 = (WorkDatabase_Impl) n8.f10433a;
                        workDatabase_Impl3.b();
                        workDatabase_Impl3.c();
                        try {
                            ((C1427b) n8.f10434b).e(iVar);
                            workDatabase_Impl3.h();
                            workDatabase_Impl3.f();
                            UUID uuid = oVar.f12366a;
                            if (z13) {
                                strArr2 = strArr;
                                int length = strArr2.length;
                                int i9 = 0;
                                while (i9 < length) {
                                    Iterator it5 = it;
                                    long j3 = currentTimeMillis;
                                    C1426a c1426a = new C1426a(uuid.toString(), strArr2[i9]);
                                    C0977k i10 = workDatabase.i();
                                    workDatabase_Impl3 = (WorkDatabase_Impl) i10.f12441b;
                                    workDatabase_Impl3.b();
                                    workDatabase_Impl3.c();
                                    try {
                                        ((C1427b) i10.f12442c).e(c1426a);
                                        workDatabase_Impl3.h();
                                        workDatabase_Impl3.f();
                                        i9++;
                                        it = it5;
                                        currentTimeMillis = j3;
                                    } finally {
                                    }
                                }
                                it2 = it;
                                j = currentTimeMillis;
                            } else {
                                it2 = it;
                                j = currentTimeMillis;
                                strArr2 = strArr;
                            }
                            Iterator it6 = oVar.f12368c.iterator();
                            while (it6.hasNext()) {
                                String str4 = (String) it6.next();
                                w o7 = workDatabase.o();
                                m1.j jVar = new m1.j(str4, uuid.toString());
                                workDatabase_Impl3 = (WorkDatabase_Impl) o7.f11335b;
                                workDatabase_Impl3.b();
                                workDatabase_Impl3.c();
                                try {
                                    ((C1427b) o7.f11336c).e(jVar);
                                    workDatabase_Impl3.h();
                                    workDatabase_Impl3.f();
                                } finally {
                                }
                            }
                            if (!z9) {
                                C0977k l8 = workDatabase.l();
                                C1431f c1431f = new C1431f(uuid.toString());
                                workDatabase_Impl3 = (WorkDatabase_Impl) l8.f12441b;
                                workDatabase_Impl3.b();
                                workDatabase_Impl3.c();
                                try {
                                    ((C1427b) l8.f12442c).e(c1431f);
                                    workDatabase_Impl3.h();
                                } finally {
                                }
                            }
                            strArr = strArr2;
                            it = it2;
                            currentTimeMillis = j;
                        } finally {
                        }
                    }
                    z12 = z14;
                    z11 = true;
                    c0998e.f12525k = z11;
                    return z12;
                }
            } catch (Throwable th) {
                g3.close();
                c3.g();
                throw th;
            }
        }
        z10 = false;
        it = c0998e.f12523h.iterator();
        boolean z142 = z10;
        while (it.hasNext()) {
        }
        z12 = z142;
        z11 = true;
        c0998e.f12525k = z11;
        return z12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w wVar = this.f15301b;
        C0998e c0998e = this.f15300a;
        try {
            if (C0998e.h0(c0998e, new HashSet())) {
                throw new IllegalStateException("WorkContinuation has cycles (" + c0998e + ")");
            }
            e1.l lVar = c0998e.f12522g;
            WorkDatabase workDatabase = lVar.f12546f;
            workDatabase.c();
            try {
                boolean a2 = a(c0998e);
                workDatabase.h();
                if (a2) {
                    AbstractC1451f.a(lVar.f12544d, RescheduleReceiver.class, true);
                    AbstractC0997d.a(lVar.f12545e, lVar.f12546f, lVar.f12548y);
                }
                wVar.L(s.f12370q);
            } finally {
                workDatabase.f();
            }
        } catch (Throwable th) {
            wVar.L(new d1.p(th));
        }
    }
}
