package E4;

import U5.j0;
import Y4.I0;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class B implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2086a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2087b;

    public B(j0 j0Var) {
        this.f2087b = j0Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i7;
        int iC;
        int iB;
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
                        boolean zEquals = jVar2.equals(jVar);
                        int i8 = a2.f2084a;
                        if (zEquals) {
                            iC = p150v0.a.c(i8);
                            iB = kVar.f3323a.compareTo(kVar2.f3323a);
                        } else {
                            I0 i0F = kVar.f3327e.f(jVar2);
                            I0 i0F2 = kVar2.f3327e.f(jVar2);
                            p113p3.f.O("Trying to compare documents on fields that don't exist.", (i0F == null || i0F2 == null) ? false : true, new Object[0]);
                            iC = p150v0.a.c(i8);
                            iB = H4.o.b(i0F, i0F2);
                        }
                        i7 = iB * iC;
                    }
                    return i7;
                } while (i7 == 0);
                return i7;
            default:
                j0 j0Var = (j0) this.f2087b;
                int iC2 = j0Var.c(obj) - j0Var.c(obj2);
                return iC2 != 0 ? iC2 : obj.getClass().getName().compareTo(obj2.getClass().getName());
        }
    }

    public B(List list) {
        boolean z4;
        Iterator it = list.iterator();
        loop0: while (true) {
            z4 = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                } else {
                    z4 = (z4 || ((A) it.next()).f2085b.equals(H4.j.f3321b)) ? true : z4;
                }
            }
        }
        if (!z4) {
            throw new IllegalArgumentException("QueryComparator needs to have a key ordering");
        }
        this.f2087b = list;
    }
}
