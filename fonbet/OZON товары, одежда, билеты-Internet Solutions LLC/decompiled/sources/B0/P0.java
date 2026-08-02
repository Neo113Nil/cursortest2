package B0;

import Ae.InterfaceC2397i;
import S0.C3987u0;
import kotlin.Unit;
import t0.C9717f;
import t0.C9718g;
import t0.s;

/* loaded from: classes8.dex */
final class P0<T> implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ androidx.collection.J<t0.n> f1491a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Q0 f1492b;

    P0(androidx.collection.J<t0.n> j11, Q0 q02) {
        this.f1491a = j11;
        this.f1492b = q02;
    }

    @Override // Ae.InterfaceC2397i
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        C3987u0 c3987u0;
        t0.n nVar = (t0.n) obj;
        boolean z11 = nVar instanceof t0.j ? true : nVar instanceof C9717f ? true : nVar instanceof s.b;
        androidx.collection.J<t0.n> j11 = this.f1491a;
        if (z11) {
            j11.b(nVar);
        } else if (nVar instanceof t0.k) {
            j11.d(((t0.k) nVar).a());
        } else if (nVar instanceof C9718g) {
            j11.d(((C9718g) nVar).a());
        } else if (nVar instanceof s.c) {
            j11.d(((s.c) nVar).a());
        } else if (nVar instanceof s.a) {
            j11.d(((s.a) nVar).a());
        }
        Object[] objArr = j11.f38646a;
        int i11 = j11.f38647b;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            Q0 q02 = this.f1492b;
            if (i12 >= i11) {
                c3987u0 = q02.f1498a;
                c3987u0.d(i13);
                return Unit.f71690a;
            }
            t0.n nVar2 = (t0.n) objArr[i12];
            if (nVar2 instanceof t0.j) {
                q02.getClass();
                i13 |= 2;
            } else if (nVar2 instanceof C9717f) {
                q02.getClass();
                i13 |= 1;
            } else if (nVar2 instanceof s.b) {
                q02.getClass();
                i13 |= 4;
            }
            i12++;
        }
    }
}
