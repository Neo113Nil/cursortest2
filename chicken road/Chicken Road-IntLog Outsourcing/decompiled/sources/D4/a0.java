package D4;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class a0 extends g0 implements InterfaceC0014n {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f487c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(X x5) {
        super(true);
        boolean z = true;
        G(x5);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g0.f514b;
        InterfaceC0010j interfaceC0010j = (InterfaceC0010j) atomicReferenceFieldUpdater.get(this);
        C0011k c0011k = interfaceC0010j instanceof C0011k ? (C0011k) interfaceC0010j : null;
        if (c0011k != null) {
            g0 j2 = c0011k.j();
            while (!j2.z()) {
                InterfaceC0010j interfaceC0010j2 = (InterfaceC0010j) atomicReferenceFieldUpdater.get(j2);
                C0011k c0011k2 = interfaceC0010j2 instanceof C0011k ? (C0011k) interfaceC0010j2 : null;
                if (c0011k2 != null) {
                    j2 = c0011k2.j();
                }
            }
            this.f487c = z;
        }
        z = false;
        this.f487c = z;
    }

    @Override // D4.g0
    public final boolean B() {
        return true;
    }

    @Override // D4.g0
    public final boolean z() {
        return this.f487c;
    }
}
