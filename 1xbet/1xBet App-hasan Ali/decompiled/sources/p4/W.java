package p4;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class W extends b0 {

    /* renamed from: m, reason: collision with root package name */
    public final boolean f18767m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(U u5) {
        super(true);
        boolean z3 = true;
        N(u5);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b0.f18781l;
        InterfaceC2271k interfaceC2271k = (InterfaceC2271k) atomicReferenceFieldUpdater.get(this);
        C2272l c2272l = interfaceC2271k instanceof C2272l ? (C2272l) interfaceC2271k : null;
        if (c2272l != null) {
            b0 j5 = c2272l.j();
            while (!j5.I()) {
                InterfaceC2271k interfaceC2271k2 = (InterfaceC2271k) atomicReferenceFieldUpdater.get(j5);
                C2272l c2272l2 = interfaceC2271k2 instanceof C2272l ? (C2272l) interfaceC2271k2 : null;
                if (c2272l2 != null) {
                    j5 = c2272l2.j();
                }
            }
            this.f18767m = z3;
        }
        z3 = false;
        this.f18767m = z3;
    }

    @Override // p4.b0
    public final boolean I() {
        return this.f18767m;
    }

    @Override // p4.b0
    public final boolean J() {
        return true;
    }
}
