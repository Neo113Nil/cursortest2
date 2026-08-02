package g2;

import android.os.Build;
import androidx.work.impl.WorkDatabase;
import com.google.android.gms.internal.ads.G7;
import f2.C1944b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: g2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1980d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f17106a = f2.m.f("Schedulers");

    public static void a(C1944b c1944b, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        G7 n5 = workDatabase.n();
        workDatabase.c();
        try {
            int i = Build.VERSION.SDK_INT;
            int i5 = c1944b.f16981h;
            if (i == 23) {
                i5 /= 2;
            }
            ArrayList b3 = n5.b(i5);
            ArrayList a5 = n5.a();
            if (b3.size() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                int size = b3.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj = b3.get(i6);
                    i6++;
                    n5.j(((o2.i) obj).f18633a, currentTimeMillis);
                }
            }
            workDatabase.h();
            workDatabase.f();
            if (b3.size() > 0) {
                o2.i[] iVarArr = (o2.i[]) b3.toArray(new o2.i[b3.size()]);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    InterfaceC1979c interfaceC1979c = (InterfaceC1979c) it.next();
                    if (interfaceC1979c.f()) {
                        interfaceC1979c.d(iVarArr);
                    }
                }
            }
            if (a5.size() > 0) {
                o2.i[] iVarArr2 = (o2.i[]) a5.toArray(new o2.i[a5.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    InterfaceC1979c interfaceC1979c2 = (InterfaceC1979c) it2.next();
                    if (!interfaceC1979c2.f()) {
                        interfaceC1979c2.d(iVarArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.f();
            throw th;
        }
    }
}
