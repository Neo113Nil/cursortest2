package H6;

import i6.InterfaceC1287d;
import i6.InterfaceC1292i;
import k6.InterfaceC1357d;

/* loaded from: classes2.dex */
public final class s implements InterfaceC1287d, InterfaceC1357d {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1287d f3455a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1292i f3456b;

    public s(InterfaceC1287d interfaceC1287d, InterfaceC1292i interfaceC1292i) {
        this.f3455a = interfaceC1287d;
        this.f3456b = interfaceC1292i;
    }

    @Override // k6.InterfaceC1357d
    public final InterfaceC1357d getCallerFrame() {
        InterfaceC1287d interfaceC1287d = this.f3455a;
        if (interfaceC1287d instanceof InterfaceC1357d) {
            return (InterfaceC1357d) interfaceC1287d;
        }
        return null;
    }

    @Override // i6.InterfaceC1287d
    public final InterfaceC1292i getContext() {
        return this.f3456b;
    }

    @Override // i6.InterfaceC1287d
    public final void resumeWith(Object obj) {
        this.f3455a.resumeWith(obj);
    }
}
