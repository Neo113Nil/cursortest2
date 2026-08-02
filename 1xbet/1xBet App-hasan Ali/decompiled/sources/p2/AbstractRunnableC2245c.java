package p2;

import androidx.work.impl.WorkDatabase;
import com.google.android.gms.internal.ads.G7;
import g2.C1978b;
import g2.InterfaceC1979c;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: p2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC2245c implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final v3.g f18692k = new v3.g(14);

    public static void a(g2.l lVar, String str) {
        WorkDatabase workDatabase = lVar.f17130m;
        G7 n5 = workDatabase.n();
        v3.g i = workDatabase.i();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            int e3 = n5.e(str2);
            if (e3 != 3 && e3 != 4) {
                n5.n(6, str2);
            }
            linkedList.addAll(i.x(str2));
        }
        C1978b c1978b = lVar.f17133p;
        synchronized (c1978b.f17105u) {
            try {
                f2.m.d().a(C1978b.f17094v, "Processor cancelling " + str, new Throwable[0]);
                c1978b.f17103s.add(str);
                g2.m mVar = (g2.m) c1978b.f17100p.remove(str);
                boolean z3 = mVar != null;
                if (mVar == null) {
                    mVar = (g2.m) c1978b.f17101q.remove(str);
                }
                C1978b.c(str, mVar);
                if (z3) {
                    c1978b.i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = lVar.f17132o.iterator();
        while (it.hasNext()) {
            ((InterfaceC1979c) it.next()).b(str);
        }
    }

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        v3.g gVar = this.f18692k;
        try {
            b();
            gVar.E(f2.r.f17007g);
        } catch (Throwable th) {
            gVar.E(new f2.o(th));
        }
    }
}
