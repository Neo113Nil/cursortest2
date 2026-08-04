package P;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: P.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0359o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f5094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f5095b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f5096c = new HashMap();

    public C0359o(Runnable runnable) {
        this.f5094a = runnable;
    }

    public final boolean a() {
        Iterator it = this.f5095b.iterator();
        while (it.hasNext()) {
            if (((androidx.fragment.app.I) ((InterfaceC0361q) it.next())).f9360a.p()) {
                return true;
            }
        }
        return false;
    }

    public final void b(InterfaceC0361q interfaceC0361q) {
        this.f5095b.remove(interfaceC0361q);
        C0358n c0358n = (C0358n) this.f5096c.remove(interfaceC0361q);
        if (c0358n != null) {
            c0358n.f5092a.b(c0358n.f5093b);
            c0358n.f5093b = null;
        }
        this.f5094a.run();
    }
}
