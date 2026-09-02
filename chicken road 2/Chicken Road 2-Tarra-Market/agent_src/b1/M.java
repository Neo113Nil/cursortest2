package b1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class M extends S {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f632c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(J j2) {
        super(true);
        boolean z2 = true;
        A(j2);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = S.f647b;
        InterfaceC0020h interfaceC0020h = (InterfaceC0020h) atomicReferenceFieldUpdater.get(this);
        C0021i c0021i = interfaceC0020h instanceof C0021i ? (C0021i) interfaceC0020h : null;
        if (c0021i != null) {
            S j3 = c0021i.j();
            while (!j3.v()) {
                InterfaceC0020h interfaceC0020h2 = (InterfaceC0020h) atomicReferenceFieldUpdater.get(j3);
                C0021i c0021i2 = interfaceC0020h2 instanceof C0021i ? (C0021i) interfaceC0020h2 : null;
                if (c0021i2 != null) {
                    j3 = c0021i2.j();
                }
            }
            this.f632c = z2;
        }
        z2 = false;
        this.f632c = z2;
    }

    @Override // b1.S
    public final boolean v() {
        return this.f632c;
    }
}
