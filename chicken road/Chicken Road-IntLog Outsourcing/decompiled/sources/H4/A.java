package H4;

import k4.InterfaceC1218d;
import k4.InterfaceC1223i;

/* loaded from: classes.dex */
public final class A implements InterfaceC1218d, m4.d {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1218d f1156a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1223i f1157b;

    public A(InterfaceC1218d interfaceC1218d, InterfaceC1223i interfaceC1223i) {
        this.f1156a = interfaceC1218d;
        this.f1157b = interfaceC1223i;
    }

    @Override // m4.d
    public final m4.d getCallerFrame() {
        InterfaceC1218d interfaceC1218d = this.f1156a;
        if (interfaceC1218d instanceof m4.d) {
            return (m4.d) interfaceC1218d;
        }
        return null;
    }

    @Override // k4.InterfaceC1218d
    public final InterfaceC1223i getContext() {
        return this.f1157b;
    }

    @Override // k4.InterfaceC1218d
    public final void resumeWith(Object obj) {
        this.f1156a.resumeWith(obj);
    }
}
