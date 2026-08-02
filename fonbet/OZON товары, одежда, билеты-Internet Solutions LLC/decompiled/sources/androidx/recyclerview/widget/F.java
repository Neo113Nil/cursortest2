package androidx.recyclerview.widget;

import androidx.collection.C5153w;
import androidx.collection.C5154x;
import androidx.collection.Z;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
final class F {

    /* renamed from: a, reason: collision with root package name */
    final Z<RecyclerView.C, a> f44672a = new Z<>();

    /* renamed from: b, reason: collision with root package name */
    final C5153w<RecyclerView.C> f44673b = new C5153w<>();

    static class a {

        /* renamed from: d, reason: collision with root package name */
        static x2.g f44674d = new x2.g(20);

        /* renamed from: a, reason: collision with root package name */
        int f44675a;

        /* renamed from: b, reason: collision with root package name */
        RecyclerView.l.c f44676b;

        /* renamed from: c, reason: collision with root package name */
        RecyclerView.l.c f44677c;

        private a() {
        }

        static a a() {
            a aVar = (a) f44674d.a();
            return aVar == null ? new a() : aVar;
        }
    }

    interface b {
    }

    F() {
    }

    private RecyclerView.l.c b(RecyclerView.C c11, int i11) {
        a n11;
        RecyclerView.l.c cVar;
        Z<RecyclerView.C, a> z11 = this.f44672a;
        int h11 = z11.h(c11);
        if (h11 >= 0 && (n11 = z11.n(h11)) != null) {
            int i12 = n11.f44675a;
            if ((i12 & i11) != 0) {
                int i13 = i12 & (~i11);
                n11.f44675a = i13;
                if (i11 == 4) {
                    cVar = n11.f44676b;
                } else {
                    if (i11 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    cVar = n11.f44677c;
                }
                if ((i13 & 12) == 0) {
                    z11.l(h11);
                    n11.f44675a = 0;
                    n11.f44676b = null;
                    n11.f44677c = null;
                    a.f44674d.b(n11);
                }
                return cVar;
            }
        }
        return null;
    }

    final void a(RecyclerView.C c11, RecyclerView.l.c cVar) {
        Z<RecyclerView.C, a> z11 = this.f44672a;
        a aVar = z11.get(c11);
        if (aVar == null) {
            aVar = a.a();
            z11.put(c11, aVar);
        }
        aVar.f44677c = cVar;
        aVar.f44675a |= 8;
    }

    final RecyclerView.l.c c(RecyclerView.C c11) {
        return b(c11, 8);
    }

    final RecyclerView.l.c d(RecyclerView.C c11) {
        return b(c11, 4);
    }

    final void e(RecyclerView.C c11) {
        a aVar = this.f44672a.get(c11);
        if (aVar == null) {
            return;
        }
        aVar.f44675a &= -2;
    }

    final void f(RecyclerView.C c11) {
        Object obj;
        Object obj2;
        C5153w<RecyclerView.C> c5153w = this.f44673b;
        int h11 = c5153w.h() - 1;
        while (true) {
            if (h11 < 0) {
                break;
            }
            if (c11 == c5153w.i(h11)) {
                Object obj3 = c5153w.f38750c[h11];
                obj = C5154x.f38752a;
                if (obj3 != obj) {
                    Object[] objArr = c5153w.f38750c;
                    obj2 = C5154x.f38752a;
                    objArr[h11] = obj2;
                    c5153w.f38748a = true;
                }
            } else {
                h11--;
            }
        }
        a remove = this.f44672a.remove(c11);
        if (remove != null) {
            remove.f44675a = 0;
            remove.f44676b = null;
            remove.f44677c = null;
            a.f44674d.b(remove);
        }
    }
}
