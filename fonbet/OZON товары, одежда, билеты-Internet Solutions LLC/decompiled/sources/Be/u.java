package Be;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ee.C2968b;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class u implements InterfaceC2395h<Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlin.coroutines.jvm.internal.j f3688a;

    /* JADX WARN: Multi-variable type inference failed */
    public u(InterfaceC6511n interfaceC6511n) {
        this.f3688a = (kotlin.coroutines.jvm.internal.j) interfaceC6511n;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [fd.n, kotlin.coroutines.jvm.internal.j] */
    @Override // Ae.InterfaceC2395h
    public final Object collect(InterfaceC2397i<? super Object> interfaceC2397i, kotlin.coroutines.d<? super Unit> frame) {
        v vVar = new v(this.f3688a, interfaceC2397i, null);
        t tVar = new t(frame, frame.getContext());
        Object a11 = C2968b.a(tVar, tVar, vVar);
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (a11 == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return a11 == aVar ? a11 : Unit.f71690a;
    }
}
