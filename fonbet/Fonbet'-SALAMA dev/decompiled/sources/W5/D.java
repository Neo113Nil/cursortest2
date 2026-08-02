package W5;

import U5.C0450q;
import androidx.work.impl.WorkDatabase;
import c5.C0820a;
import d6.C0977k;
import e1.C0995b;
import e1.InterfaceC0996c;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes2.dex */
public abstract class D implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6754a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6755b;

    public /* synthetic */ D(Object obj, int i7) {
        this.f6754a = i7;
        this.f6755b = obj;
    }

    public static void a(e1.l lVar, String str) {
        WorkDatabase workDatabase = lVar.f12546f;
        C0820a n2 = workDatabase.n();
        C0977k i7 = workDatabase.i();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            int h6 = n2.h(str2);
            if (h6 != 3 && h6 != 4) {
                n2.u(6, str2);
            }
            linkedList.addAll(i7.n(str2));
        }
        C0995b c0995b = lVar.f12549z;
        synchronized (c0995b.f12510B) {
            try {
                d1.n.d().b(C0995b.f12508C, "Processor cancelling " + str, new Throwable[0]);
                c0995b.f12519z.add(str);
                e1.m mVar = (e1.m) c0995b.f12516f.remove(str);
                boolean z4 = mVar != null;
                if (mVar == null) {
                    mVar = (e1.m) c0995b.f12517x.remove(str);
                }
                C0995b.c(str, mVar);
                if (z4) {
                    c0995b.h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = lVar.f12548y.iterator();
        while (it.hasNext()) {
            ((InterfaceC0996c) it.next()).c(str);
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
                C0450q a2 = c0450q.a();
                try {
                    c();
                    return;
                } finally {
                    c0450q.c(a2);
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
                    wVar.L(d1.s.f12370q);
                    return;
                } catch (Throwable th) {
                    wVar.L(new d1.p(th));
                    return;
                }
        }
    }

    public D() {
        this.f6754a = 2;
        this.f6755b = new com.google.android.gms.common.internal.w(2);
    }
}
