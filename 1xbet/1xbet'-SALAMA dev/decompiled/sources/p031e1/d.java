package p031e1;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p019c5.a;
import p023d1.b;
import p023d1.n;
import p088m1.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f12526a = n.g("Schedulers");

    public static void a(b bVar, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        a aVarN = workDatabase.n();
        workDatabase.c();
        try {
            ArrayList arrayListE = aVarN.e(bVar.f12347h);
            ArrayList arrayListD = aVarN.d();
            if (arrayListE.size() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                Iterator it = arrayListE.iterator();
                while (it.hasNext()) {
                    aVarN.p(((i) it.next()).f15222a, jCurrentTimeMillis);
                }
            }
            workDatabase.h();
            workDatabase.f();
            if (arrayListE.size() > 0) {
                i[] iVarArr = (i[]) arrayListE.toArray(new i[arrayListE.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    c cVar = (c) it2.next();
                    if (cVar.a()) {
                        cVar.e(iVarArr);
                    }
                }
            }
            if (arrayListD.size() > 0) {
                i[] iVarArr2 = (i[]) arrayListD.toArray(new i[arrayListD.size()]);
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    c cVar2 = (c) it3.next();
                    if (!cVar2.a()) {
                        cVar2.e(iVarArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.f();
            throw th;
        }
    }
}
