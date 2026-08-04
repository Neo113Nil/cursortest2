package W5;

import U5.C0450q;
import androidx.work.impl.WorkDatabase;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class D implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6755b;

    public /* synthetic */ D(Object obj, int i7) {
        this.f6754a = i7;
        this.f6755b = obj;
    }

    public static void a(p031e1.l lVar, String str) {
        WorkDatabase workDatabase = lVar.f12552f;
        p019c5.a aVarN = workDatabase.n();
        p028d6.k kVarI = workDatabase.i();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            int iH = aVarN.h(str2);
            if (iH != 3 && iH != 4) {
                aVarN.u(6, str2);
            }
            linkedList.addAll(kVarI.n(str2));
        }
        p031e1.b bVar = lVar.f12555z;
        synchronized (bVar.f12516B) {
            try {
                p023d1.n.d().b(p031e1.b.f12514C, "Processor cancelling " + str, new Throwable[0]);
                bVar.f12525z.add(str);
                p031e1.m mVar = (p031e1.m) bVar.f12522f.remove(str);
                boolean z4 = mVar != null;
                if (mVar == null) {
                    mVar = (p031e1.m) bVar.f12523x.remove(str);
                }
                p031e1.b.c(str, mVar);
                if (z4) {
                    bVar.h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = lVar.f12554y.iterator();
        while (it.hasNext()) {
            ((p031e1.c) it.next()).c(str);
        }
    }

    public abstract void b();

    public abstract void c();

    public abstract void d();

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6754a) {
            case 0:
                C0450q c0450q = (C0450q) this.f6755b;
                C0450q c0450qA = c0450q.a();
                try {
                    c();
                    return;
                } finally {
                    c0450q.c(c0450qA);
                }
            case 1:
                X5.c cVar = (X5.c) this.f6755b;
                try {
                    if (cVar.f7495z == null) {
                        throw new IOException("Unable to perform write due to unavailable sink.");
                    }
                    b();
                    return;
                } catch (Exception e7) {
                    cVar.f7490d.p(e7);
                    return;
                }
            default:
                com.google.android.gms.common.internal.w wVar = (com.google.android.gms.common.internal.w) this.f6755b;
                try {
                    d();
                    wVar.L(p023d1.s.f12376q);
                    return;
                } catch (Throwable th) {
                    wVar.L(new p023d1.p(th));
                    return;
                }
        }
    }

    public D() {
        this.f6754a = 2;
        this.f6755b = new com.google.android.gms.common.internal.w(2);
    }
}
