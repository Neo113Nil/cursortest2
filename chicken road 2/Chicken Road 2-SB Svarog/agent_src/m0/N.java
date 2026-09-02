package m0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class N extends T {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f898d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N() {
        super(true);
        boolean z2 = true;
        B(null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = T.f913c;
        InterfaceC0051h interfaceC0051h = (InterfaceC0051h) atomicReferenceFieldUpdater.get(this);
        C0052i c0052i = interfaceC0051h instanceof C0052i ? (C0052i) interfaceC0051h : null;
        if (c0052i != null) {
            T n2 = c0052i.n();
            while (!n2.w()) {
                InterfaceC0051h interfaceC0051h2 = (InterfaceC0051h) atomicReferenceFieldUpdater.get(n2);
                C0052i c0052i2 = interfaceC0051h2 instanceof C0052i ? (C0052i) interfaceC0051h2 : null;
                if (c0052i2 != null) {
                    n2 = c0052i2.n();
                }
            }
            this.f898d = z2;
        }
        z2 = false;
        this.f898d = z2;
    }

    @Override // m0.T
    public final boolean w() {
        return this.f898d;
    }
}
