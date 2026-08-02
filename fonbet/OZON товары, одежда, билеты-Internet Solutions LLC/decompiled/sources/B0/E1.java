package B0;

import S0.InterfaceC3978p0;
import t0.s;

/* loaded from: classes.dex */
public final class E1 implements S0.M {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0 f1367a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ t0.q f1368b;

    public E1(InterfaceC3978p0 interfaceC3978p0, t0.q qVar) {
        this.f1367a = interfaceC3978p0;
        this.f1368b = qVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // S0.M
    public final void dispose() {
        InterfaceC3978p0 interfaceC3978p0 = this.f1367a;
        s.b bVar = (s.b) interfaceC3978p0.getValue();
        if (bVar != null) {
            s.a aVar = new s.a(bVar);
            t0.q qVar = this.f1368b;
            if (qVar != null) {
                qVar.tryEmit(aVar);
            }
            interfaceC3978p0.setValue(null);
        }
    }
}
