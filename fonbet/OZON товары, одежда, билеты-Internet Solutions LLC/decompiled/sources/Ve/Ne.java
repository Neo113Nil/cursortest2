package Ve;

import Ae.InterfaceC2397i;
import kotlin.Unit;

/* loaded from: classes10.dex */
public final class Ne implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4474ng f29556a;

    public Ne(C4474ng c4474ng) {
        this.f29556a = c4474ng;
    }

    @Override // Ae.InterfaceC2397i
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        Wb wb2 = (Wb) obj;
        X4.a aVar = this.f29556a.f28693b;
        if (aVar == null) {
            throw M7.f29463a;
        }
        C4137bp c4137bp = (C4137bp) aVar;
        c4137bp.f30747c.setText(wb2.f30256a);
        c4137bp.f30746b.setText(wb2.f30257b);
        c4137bp.f30749e.setText(wb2.f30259d);
        c4137bp.f30748d.setText(wb2.f30260e);
        return Unit.f71690a;
    }
}
