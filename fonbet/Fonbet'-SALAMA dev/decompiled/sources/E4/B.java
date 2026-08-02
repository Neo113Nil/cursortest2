package E4;

import U5.j0;
import Y4.I0;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import v0.AbstractC1663a;

/* loaded from: classes2.dex */
public final class B implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2086a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2087b;

    public B(j0 j0Var) {
        this.f2087b = j0Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i7;
        int c3;
        int b7;
        switch (this.f2086a) {
            case 0:
                H4.k kVar = (H4.k) obj;
                H4.k kVar2 = (H4.k) obj2;
                Iterator it = ((List) this.f2087b).iterator();
                do {
                    i7 = 0;
                    if (it.hasNext()) {
                        A a2 = (A) it.next();
                        a2.getClass();
                        H4.j jVar = H4.j.f3321b;
                        H4.j jVar2 = a2.f2085b;
                        boolean equals = jVar2.equals(jVar);
                        int i8 = a2.f2084a;
                        if (equals) {
                            c3 = AbstractC1663a.c(i8);
                            b7 = kVar.f3323a.compareTo(kVar2.f3323a);
                        } else {
                            I0 f7 = kVar.f3327e.f(jVar2);
                            I0 f8 = kVar2.f3327e.f(jVar2);
                            p3.f.O("Trying to compare documents on fields that don't exist.", (f7 == null || f8 == null) ? false : true, new Object[0]);
                            c3 = AbstractC1663a.c(i8);
                            b7 = H4.o.b(f7, f8);
                        }
                        i7 = b7 * c3;
                    }
                    return i7;
                } while (i7 == 0);
                return i7;
            default:
                j0 j0Var = (j0) this.f2087b;
                int c4 = j0Var.c(obj) - j0Var.c(obj2);
                return c4 != 0 ? c4 : obj.getClass().getName().compareTo(obj2.getClass().getName());
        }
    }

    public B(List list) {
        boolean z4;
        Iterator it = list.iterator();
        loop0: while (true) {
            z4 = false;
            while (it.hasNext()) {
                z4 = (z4 || ((A) it.next()).f2085b.equals(H4.j.f3321b)) ? true : z4;
            }
        }
        if (!z4) {
            throw new IllegalArgumentException("QueryComparator needs to have a key ordering");
        }
        this.f2087b = list;
    }
}
