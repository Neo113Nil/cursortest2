package A0;

import android.view.Choreographer;
import c4.AbstractC0548i;
import p4.InterfaceC2280u;

/* renamed from: A0.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0050o0 extends AbstractC0548i implements i4.e {
    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new C0050o0(2, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0050o0) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        G4.l.N(obj);
        return Choreographer.getInstance();
    }
}
