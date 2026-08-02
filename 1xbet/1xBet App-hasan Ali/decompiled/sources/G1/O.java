package G1;

import S3.C0416t;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public abstract class O {

    /* renamed from: a, reason: collision with root package name */
    public C0143n f1874a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1875b;

    public abstract y a();

    public final C0143n b() {
        C0143n c0143n = this.f1874a;
        if (c0143n != null) {
            return c0143n;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    public void d(List list, H h3) {
        n4.e eVar = new n4.e(new n4.f(new n4.l(new X3.t(0, list), new A.B(this, h3), 1), new C0416t(12), 0));
        while (eVar.hasNext()) {
            b().f((C0140k) eVar.next());
        }
    }

    public void e(C0140k c0140k, boolean z3) {
        kotlin.jvm.internal.l.f("popUpTo", c0140k);
        List list = (List) ((s4.M) b().f1920e.f19316k).getValue();
        if (!list.contains(c0140k)) {
            throw new IllegalStateException(("popBackStack was called with " + c0140k + " which does not exist in back stack " + list).toString());
        }
        ListIterator listIterator = list.listIterator(list.size());
        C0140k c0140k2 = null;
        while (f()) {
            c0140k2 = (C0140k) listIterator.previous();
            if (kotlin.jvm.internal.l.a(c0140k2, c0140k)) {
                break;
            }
        }
        if (c0140k2 != null) {
            b().c(c0140k2, z3);
        }
    }

    public boolean f() {
        return true;
    }

    public y c(y yVar) {
        return yVar;
    }
}
