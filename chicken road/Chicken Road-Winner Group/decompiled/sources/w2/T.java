package w2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class T extends Z {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10478c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T() {
        super(true);
        boolean z3 = true;
        F(null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Z.f10493b;
        InterfaceC1230i interfaceC1230i = (InterfaceC1230i) atomicReferenceFieldUpdater.get(this);
        C1231j c1231j = interfaceC1230i instanceof C1231j ? (C1231j) interfaceC1230i : null;
        if (c1231j != null) {
            Z i3 = c1231j.i();
            while (!i3.z()) {
                InterfaceC1230i interfaceC1230i2 = (InterfaceC1230i) atomicReferenceFieldUpdater.get(i3);
                C1231j c1231j2 = interfaceC1230i2 instanceof C1231j ? (C1231j) interfaceC1230i2 : null;
                if (c1231j2 != null) {
                    i3 = c1231j2.i();
                }
            }
            this.f10478c = z3;
        }
        z3 = false;
        this.f10478c = z3;
    }

    @Override // w2.Z
    public final boolean A() {
        return true;
    }

    @Override // w2.Z
    public final boolean z() {
        return this.f10478c;
    }
}
