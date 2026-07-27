package t0;

import B0.r;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import s0.C1414b;
import s0.s;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final String f11866a = s.f("Schedulers");

    public static void a(C1414b c1414b, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        r t5 = workDatabase.t();
        workDatabase.c();
        try {
            ArrayList b6 = t5.b(c1414b.f11758h);
            ArrayList a6 = t5.a();
            if (b6.size() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                Iterator it = b6.iterator();
                while (it.hasNext()) {
                    t5.h(currentTimeMillis, ((B0.q) it.next()).f173a);
                }
            }
            workDatabase.o();
            workDatabase.k();
            if (b6.size() > 0) {
                B0.q[] qVarArr = (B0.q[]) b6.toArray(new B0.q[b6.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    h hVar = (h) it2.next();
                    if (hVar.e()) {
                        hVar.f(qVarArr);
                    }
                }
            }
            if (a6.size() > 0) {
                B0.q[] qVarArr2 = (B0.q[]) a6.toArray(new B0.q[a6.size()]);
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    h hVar2 = (h) it3.next();
                    if (!hVar2.e()) {
                        hVar2.f(qVarArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.k();
            throw th;
        }
    }
}
