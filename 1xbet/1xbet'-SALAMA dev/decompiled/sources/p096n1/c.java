package p096n1;

import D0.k;
import W5.AbstractC0486a1;
import android.database.Cursor;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.android.gms.common.internal.w;
import io.sentry.protocol.SentryThread;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;
import p019c5.a;
import p023d1.g;
import p023d1.n;
import p023d1.o;
import p023d1.p;
import p023d1.s;
import p031e1.d;
import p031e1.e;
import p031e1.l;
import p088m1.b;
import p088m1.h;
import p088m1.i;
import p088m1.j;
import p113p3.f;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f15305c = n.g("EnqueueRunnable");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f15306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f15307b = new w(2);

    public c(e eVar) {
        this.f15306a = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:108:0x0231  */
    /* JADX WARN: Code duplicated, block: B:112:0x0243  */
    /* JADX WARN: Code duplicated, block: B:119:0x0275  */
    /* JADX WARN: Code duplicated, block: B:156:0x029f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x015a  */
    /* JADX WARN: Code duplicated, block: B:79:0x0179  */
    /* JADX WARN: Code duplicated, block: B:81:0x0181  */
    /* JADX WARN: Code duplicated, block: B:82:0x0184  */
    /* JADX WARN: Code duplicated, block: B:85:0x018e  */
    /* JADX WARN: Code duplicated, block: B:94:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:99:0x01f0  */
    public static boolean a(e eVar) throws Throwable {
        boolean z4;
        boolean z7;
        boolean z8;
        String[] strArr;
        boolean z9;
        boolean z10;
        Iterator it;
        boolean z11;
        i iVar;
        WorkDatabase_Impl workDatabase_Impl;
        UUID uuid;
        Iterator it2;
        long j;
        String[] strArr2;
        WorkDatabase_Impl workDatabase_Impl2;
        WorkDatabase_Impl workDatabase_Impl3;
        int length;
        int i7;
        WorkDatabase_Impl workDatabase_Impl4;
        String str;
        boolean z12;
        boolean z13 = false;
        String[] strArr3 = (String[]) e.i0(eVar).toArray(new String[0]);
        long jCurrentTimeMillis = System.currentTimeMillis();
        l lVar = eVar.f12528g;
        WorkDatabase workDatabase = lVar.f12552f;
        boolean z14 = strArr3 != null && strArr3.length > 0;
        if (z14) {
            int length2 = strArr3.length;
            int i8 = 0;
            z4 = false;
            z7 = false;
            z8 = true;
            while (true) {
                if (i8 < length2) {
                    String str2 = strArr3[i8];
                    i iVarL = workDatabase.n().l(str2);
                    if (iVarL == null) {
                        n.d().c(f15305c, AbstractC0486a1.h("Prerequisite ", str2, " doesn't exist; not enqueuing"), new Throwable[0]);
                    } else {
                        int i9 = iVarL.f15223b;
                        z8 &= i9 == 3;
                        if (i9 == 4) {
                            z7 = true;
                        } else if (i9 == 6) {
                            z4 = true;
                        }
                        i8++;
                    }
                }
                z12 = true;
                eVar.f12531k = z12;
                return z13;
            }
        }
        z4 = false;
        z7 = false;
        z8 = true;
        boolean zIsEmpty = TextUtils.isEmpty(null);
        if (!zIsEmpty && !z14) {
            a aVarN = workDatabase.n();
            aVarN.getClass();
            k kVarC = k.c(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
            kVarC.e(1);
            WorkDatabase_Impl workDatabase_Impl5 = (WorkDatabase_Impl) aVarN.f10433a;
            workDatabase_Impl5.b();
            Cursor cursorG = workDatabase_Impl5.g(kVarC);
            try {
                int iJ = f.J(cursorG, "id");
                int iJ2 = f.J(cursorG, SentryThread.JsonKeys.STATE);
                z9 = zIsEmpty;
                ArrayList arrayList = new ArrayList(cursorG.getCount());
                while (cursorG.moveToNext()) {
                    h hVar = new h();
                    String[] strArr4 = strArr3;
                    hVar.f15220a = cursorG.getString(iJ);
                    hVar.f15221b = p097n3.a.C(cursorG.getInt(iJ2));
                    arrayList.add(hVar);
                    strArr3 = strArr4;
                }
                strArr = strArr3;
                cursorG.close();
                kVarC.g();
                if (!arrayList.isEmpty()) {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        int i10 = ((h) it3.next()).f15221b;
                        if (i10 == 1 || i10 == 2) {
                            z12 = true;
                            z13 = false;
                            eVar.f12531k = z12;
                            return z13;
                        }
                    }
                    new b(lVar, 1).run();
                    a aVarN2 = workDatabase.n();
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        String str3 = ((h) it4.next()).f15220a;
                        WorkDatabase_Impl workDatabase_Impl6 = (WorkDatabase_Impl) aVarN2.f10433a;
                        workDatabase_Impl6.b();
                        p088m1.e eVar2 = (p088m1.e) aVarN2.f10435c;
                        K0.f fVarA = eVar2.a();
                        if (str3 == null) {
                            fVarA.d(1);
                        } else {
                            fVarA.e(1, str3);
                        }
                        workDatabase_Impl6.c();
                        try {
                            fVarA.k();
                            workDatabase_Impl6.h();
                            workDatabase_Impl6.f();
                            eVar2.c(fVarA);
                        } catch (Throwable th) {
                            workDatabase_Impl6.f();
                            eVar2.c(fVarA);
                            throw th;
                        }
                    }
                    z10 = true;
                }
                it = eVar.f12529h.iterator();
                z11 = z10;
                while (it.hasNext()) {
                    o oVar = (o) it.next();
                    iVar = oVar.f12373b;
                    if (z14 || z8) {
                        if (iVar.c()) {
                            iVar.f15234n = 0L;
                        } else {
                            iVar.f15234n = jCurrentTimeMillis;
                        }
                    } else if (z7) {
                        iVar.f15223b = 4;
                    } else if (z4) {
                        iVar.f15223b = 6;
                    } else {
                        iVar.f15223b = 5;
                    }
                    if (Build.VERSION.SDK_INT <= 25) {
                        p023d1.c cVar = iVar.j;
                        str = iVar.f15224c;
                        if (!str.equals(ConstraintTrackingWorker.class.getName()) && (cVar.f12352d || cVar.f12353e)) {
                            p023d1.f fVar = new p023d1.f();
                            fVar.b(iVar.f15226e.f12363a);
                            fVar.f12360a.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
                            iVar.f15224c = ConstraintTrackingWorker.class.getName();
                            g gVar = new g(fVar.f12360a);
                            g.c(gVar);
                            iVar.f15226e = gVar;
                        }
                    }
                    if (iVar.f15223b == 1) {
                        z11 = true;
                    }
                    a aVarN3 = workDatabase.n();
                    workDatabase_Impl = (WorkDatabase_Impl) aVarN3.f10433a;
                    workDatabase_Impl.b();
                    workDatabase_Impl.c();
                    try {
                        ((b) aVarN3.f10434b).e(iVar);
                        workDatabase_Impl.h();
                        workDatabase_Impl.f();
                        uuid = oVar.f12372a;
                        if (z14) {
                            strArr2 = strArr;
                            length = strArr2.length;
                            i7 = 0;
                            while (i7 < length) {
                                Iterator it5 = it;
                                long j3 = jCurrentTimeMillis;
                                p088m1.a aVar = new p088m1.a(uuid.toString(), strArr2[i7]);
                                p028d6.k kVarI = workDatabase.i();
                                workDatabase_Impl4 = (WorkDatabase_Impl) kVarI.f12447b;
                                workDatabase_Impl4.b();
                                workDatabase_Impl4.c();
                                try {
                                    ((b) kVarI.f12448c).e(aVar);
                                    workDatabase_Impl4.h();
                                    workDatabase_Impl4.f();
                                    i7++;
                                    it = it5;
                                    jCurrentTimeMillis = j3;
                                } catch (Throwable th2) {
                                    workDatabase_Impl4.f();
                                    throw th2;
                                }
                            }
                            it2 = it;
                            j = jCurrentTimeMillis;
                        } else {
                            it2 = it;
                            j = jCurrentTimeMillis;
                            strArr2 = strArr;
                        }
                        for (String str4 : oVar.f12374c) {
                            w wVarO = workDatabase.o();
                            j jVar = new j(str4, uuid.toString());
                            workDatabase_Impl3 = (WorkDatabase_Impl) wVarO.f11335b;
                            workDatabase_Impl3.b();
                            workDatabase_Impl3.c();
                            try {
                                ((b) wVarO.f11336c).e(jVar);
                                workDatabase_Impl3.h();
                                workDatabase_Impl3.f();
                            } catch (Throwable th3) {
                                workDatabase_Impl3.f();
                                throw th3;
                            }
                        }
                        if (!z9) {
                            p028d6.k kVarL = workDatabase.l();
                            p088m1.f fVar2 = new p088m1.f(uuid.toString());
                            workDatabase_Impl2 = (WorkDatabase_Impl) kVarL.f12447b;
                            workDatabase_Impl2.b();
                            workDatabase_Impl2.c();
                            try {
                                ((b) kVarL.f12448c).e(fVar2);
                                workDatabase_Impl2.h();
                                workDatabase_Impl2.f();
                            } catch (Throwable th4) {
                                workDatabase_Impl2.f();
                                throw th4;
                            }
                        }
                        strArr = strArr2;
                        it = it2;
                        jCurrentTimeMillis = j;
                    } catch (Throwable th5) {
                        workDatabase_Impl.f();
                        throw th5;
                    }
                }
                z13 = z11;
                z12 = true;
                eVar.f12531k = z12;
                return z13;
            } catch (Throwable th6) {
                cursorG.close();
                kVarC.g();
                throw th6;
            }
        }
        strArr = strArr3;
        z9 = zIsEmpty;
        z10 = false;
        it = eVar.f12529h.iterator();
        z11 = z10;
        while (it.hasNext()) {
            o oVar2 = (o) it.next();
            iVar = oVar2.f12373b;
            if (z14) {
                if (iVar.c()) {
                    iVar.f15234n = jCurrentTimeMillis;
                } else {
                    iVar.f15234n = 0L;
                }
            } else if (iVar.c()) {
                iVar.f15234n = jCurrentTimeMillis;
            } else {
                iVar.f15234n = 0L;
            }
            if (Build.VERSION.SDK_INT <= 25) {
                p023d1.c cVar2 = iVar.j;
                str = iVar.f15224c;
                if (!str.equals(ConstraintTrackingWorker.class.getName())) {
                    p023d1.f fVar3 = new p023d1.f();
                    fVar3.b(iVar.f15226e.f12363a);
                    fVar3.f12360a.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
                    iVar.f15224c = ConstraintTrackingWorker.class.getName();
                    g gVar2 = new g(fVar3.f12360a);
                    g.c(gVar2);
                    iVar.f15226e = gVar2;
                }
            }
            if (iVar.f15223b == 1) {
                z11 = true;
            }
            a aVarN4 = workDatabase.n();
            workDatabase_Impl = (WorkDatabase_Impl) aVarN4.f10433a;
            workDatabase_Impl.b();
            workDatabase_Impl.c();
            ((b) aVarN4.f10434b).e(iVar);
            workDatabase_Impl.h();
            workDatabase_Impl.f();
            uuid = oVar2.f12372a;
            if (z14) {
                strArr2 = strArr;
                length = strArr2.length;
                i7 = 0;
                while (i7 < length) {
                    Iterator it6 = it;
                    long j7 = jCurrentTimeMillis;
                    p088m1.a aVar2 = new p088m1.a(uuid.toString(), strArr2[i7]);
                    p028d6.k kVarI2 = workDatabase.i();
                    workDatabase_Impl4 = (WorkDatabase_Impl) kVarI2.f12447b;
                    workDatabase_Impl4.b();
                    workDatabase_Impl4.c();
                    ((b) kVarI2.f12448c).e(aVar2);
                    workDatabase_Impl4.h();
                    workDatabase_Impl4.f();
                    i7++;
                    it = it6;
                    jCurrentTimeMillis = j7;
                }
                it2 = it;
                j = jCurrentTimeMillis;
            } else {
                it2 = it;
                j = jCurrentTimeMillis;
                strArr2 = strArr;
            }
            while (r1.hasNext()) {
                w wVarO2 = workDatabase.o();
                j jVar2 = new j(str4, uuid.toString());
                workDatabase_Impl3 = (WorkDatabase_Impl) wVarO2.f11335b;
                workDatabase_Impl3.b();
                workDatabase_Impl3.c();
                ((b) wVarO2.f11336c).e(jVar2);
                workDatabase_Impl3.h();
                workDatabase_Impl3.f();
            }
            if (!z9) {
                p028d6.k kVarL2 = workDatabase.l();
                p088m1.f fVar4 = new p088m1.f(uuid.toString());
                workDatabase_Impl2 = (WorkDatabase_Impl) kVarL2.f12447b;
                workDatabase_Impl2.b();
                workDatabase_Impl2.c();
                ((b) kVarL2.f12448c).e(fVar4);
                workDatabase_Impl2.h();
                workDatabase_Impl2.f();
            }
            strArr = strArr2;
            it = it2;
            jCurrentTimeMillis = j;
        }
        z13 = z11;
        z12 = true;
        eVar.f12531k = z12;
        return z13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w wVar = this.f15307b;
        e eVar = this.f15306a;
        try {
            if (e.h0(eVar, new HashSet())) {
                throw new IllegalStateException("WorkContinuation has cycles (" + eVar + ")");
            }
            l lVar = eVar.f12528g;
            WorkDatabase workDatabase = lVar.f12552f;
            workDatabase.c();
            try {
                boolean zA = a(eVar);
                workDatabase.h();
                workDatabase.f();
                if (zA) {
                    f.a(lVar.f12550d, RescheduleReceiver.class, true);
                    d.a(lVar.f12551e, lVar.f12552f, lVar.f12554y);
                }
                wVar.L(s.f12376q);
            } catch (Throwable th) {
                workDatabase.f();
                throw th;
            }
        } catch (Throwable th2) {
            wVar.L(new p(th2));
        }
    }
}
