package M;

import java.util.List;
import java.util.NoSuchElementException;
import n.AbstractC2107A;
import x0.InterfaceC2632s;

/* renamed from: M.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0246q implements x0.O {

    /* renamed from: a, reason: collision with root package name */
    public static final C0246q f3441a = new C0246q();

    @Override // x0.O
    public final /* synthetic */ int a(InterfaceC2632s interfaceC2632s, List list, int i) {
        return AbstractC2107A.h(this, interfaceC2632s, list, i);
    }

    @Override // x0.O
    public final /* synthetic */ int b(InterfaceC2632s interfaceC2632s, List list, int i) {
        return AbstractC2107A.k(this, interfaceC2632s, list, i);
    }

    @Override // x0.O
    public final x0.P c(x0.Q q5, List list, long j5) {
        Object obj;
        Object obj2;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (kotlin.jvm.internal.l.a(androidx.compose.ui.layout.a.a((x0.N) obj), "leadingIcon")) {
                break;
            }
            i++;
        }
        x0.N n5 = (x0.N) obj;
        x0.Z e3 = n5 != null ? n5.e(W0.a.a(j5, 0, 0, 0, 0, 10)) : null;
        float f = N.n.f3709b;
        int i5 = e3 != null ? e3.f20973k : 0;
        int i6 = e3 != null ? e3.f20974l : 0;
        int size2 = list.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i7);
            if (kotlin.jvm.internal.l.a(androidx.compose.ui.layout.a.a((x0.N) obj2), "trailingIcon")) {
                break;
            }
            i7++;
        }
        x0.N n6 = (x0.N) obj2;
        x0.Z e5 = n6 != null ? n6.e(W0.a.a(j5, 0, 0, 0, 0, 10)) : null;
        int i8 = e5 != null ? e5.f20973k : 0;
        int i9 = e5 != null ? e5.f20974l : 0;
        int size3 = list.size();
        int i10 = 0;
        while (i10 < size3) {
            x0.N n7 = (x0.N) list.get(i10);
            if (kotlin.jvm.internal.l.a(androidx.compose.ui.layout.a.a(n7), "label")) {
                x0.Z e6 = n7.e(W0.b.j(-(i5 + i8), 0, 2, j5));
                int i11 = e6.f20973k + i5 + i8;
                int max = Math.max(i6, Math.max(e6.f20974l, i9));
                return q5.i(i11, max, X3.w.f6091k, new C0245p(e3, i6, max, e6, i5, e5, i9));
            }
            i10++;
            e3 = e3;
            i5 = i5;
            i6 = i6;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // x0.O
    public final /* synthetic */ int h(InterfaceC2632s interfaceC2632s, List list, int i) {
        return AbstractC2107A.b(this, interfaceC2632s, list, i);
    }

    @Override // x0.O
    public final /* synthetic */ int j(InterfaceC2632s interfaceC2632s, List list, int i) {
        return AbstractC2107A.e(this, interfaceC2632s, list, i);
    }
}
