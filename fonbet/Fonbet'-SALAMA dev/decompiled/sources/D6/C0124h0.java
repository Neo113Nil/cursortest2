package D6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: D6.h0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0124h0 extends s0 {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1840c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0124h0(InterfaceC0118e0 interfaceC0118e0) {
        super(true);
        boolean z4 = true;
        A(interfaceC0118e0);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = s0.f1875b;
        InterfaceC0133p interfaceC0133p = (InterfaceC0133p) atomicReferenceFieldUpdater.get(this);
        C0134q c0134q = interfaceC0133p instanceof C0134q ? (C0134q) interfaceC0133p : null;
        if (c0134q != null) {
            s0 i7 = c0134q.i();
            while (!i7.u()) {
                InterfaceC0133p interfaceC0133p2 = (InterfaceC0133p) atomicReferenceFieldUpdater.get(i7);
                C0134q c0134q2 = interfaceC0133p2 instanceof C0134q ? (C0134q) interfaceC0133p2 : null;
                if (c0134q2 != null) {
                    i7 = c0134q2.i();
                }
            }
            this.f1840c = z4;
        }
        z4 = false;
        this.f1840c = z4;
    }

    @Override // D6.s0
    public final boolean u() {
        return this.f1840c;
    }

    @Override // D6.s0
    public final boolean v() {
        return true;
    }
}
