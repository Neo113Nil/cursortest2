package e1;

import androidx.work.impl.WorkDatabase;
import c5.C0820a;
import d1.C0949b;
import d1.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: e1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0997d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f12520a = n.g("Schedulers");

    public static void a(C0949b c0949b, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        C0820a n2 = workDatabase.n();
        workDatabase.c();
        try {
            ArrayList e7 = n2.e(c0949b.f12341h);
            ArrayList d7 = n2.d();
            if (e7.size() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                Iterator it = e7.iterator();
                while (it.hasNext()) {
                    n2.p(((m1.i) it.next()).f15216a, currentTimeMillis);
                }
            }
            workDatabase.h();
            workDatabase.f();
            if (e7.size() > 0) {
                m1.i[] iVarArr = (m1.i[]) e7.toArray(new m1.i[e7.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    InterfaceC0996c interfaceC0996c = (InterfaceC0996c) it2.next();
                    if (interfaceC0996c.a()) {
                        interfaceC0996c.e(iVarArr);
                    }
                }
            }
            if (d7.size() > 0) {
                m1.i[] iVarArr2 = (m1.i[]) d7.toArray(new m1.i[d7.size()]);
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    InterfaceC0996c interfaceC0996c2 = (InterfaceC0996c) it3.next();
                    if (!interfaceC0996c2.a()) {
                        interfaceC0996c2.e(iVarArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.f();
            throw th;
        }
    }
}
