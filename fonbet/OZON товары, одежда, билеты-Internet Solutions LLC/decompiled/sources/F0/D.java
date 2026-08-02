package F0;

import Ae.InterfaceC2397i;
import k1.C7460f;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
final class D<T> implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2990k f8170a;

    D(C2990k c2990k) {
        this.f8170a = c2990k;
    }

    @Override // Ae.InterfaceC2397i
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        C7460f c7460f;
        C7460f c7460f2 = (C7460f) obj;
        c7460f = C7460f.f70279e;
        boolean d11 = Intrinsics.d(c7460f2, c7460f);
        C2990k c2990k = this.f8170a;
        if (d11) {
            c2990k.S();
        } else {
            C2990k.u(c2990k, c7460f2);
        }
        return Unit.f71690a;
    }
}
