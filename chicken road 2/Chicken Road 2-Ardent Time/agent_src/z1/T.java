package z1;

/* loaded from: classes.dex */
public class T extends z1.Z {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8540c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(z1.P p2) {
        super(true);
        boolean z2 = true;
        G(p2);
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = z1.Z.f8556b;
        z1.InterfaceC1056i interfaceC1056i = (z1.InterfaceC1056i) atomicReferenceFieldUpdater.get(this);
        z1.C1057j c1057j = interfaceC1056i instanceof z1.C1057j ? (z1.C1057j) interfaceC1056i : null;
        if (c1057j != null) {
            z1.Z j2 = c1057j.j();
            while (!j2.A()) {
                z1.InterfaceC1056i interfaceC1056i2 = (z1.InterfaceC1056i) atomicReferenceFieldUpdater.get(j2);
                z1.C1057j c1057j2 = interfaceC1056i2 instanceof z1.C1057j ? (z1.C1057j) interfaceC1056i2 : null;
                if (c1057j2 != null) {
                    j2 = c1057j2.j();
                }
            }
            this.f8540c = z2;
        }
        z2 = false;
        this.f8540c = z2;
    }

    @Override // z1.Z
    public final boolean A() {
        return this.f8540c;
    }

    @Override // z1.Z
    public final boolean B() {
        return true;
    }
}
