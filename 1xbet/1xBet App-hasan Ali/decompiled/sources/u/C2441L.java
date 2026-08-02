package u;

import P.AbstractC0329z;
import P.C0305m0;

/* renamed from: u.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2441L extends J2.a {

    /* renamed from: b, reason: collision with root package name */
    public final C0305m0 f19686b;

    /* renamed from: c, reason: collision with root package name */
    public final C0305m0 f19687c;

    public C2441L(Enum r22) {
        super(4);
        this.f19686b = AbstractC0329z.t(r22);
        this.f19687c = AbstractC0329z.t(r22);
    }

    @Override // J2.a
    public final Object e() {
        return this.f19686b.getValue();
    }

    @Override // J2.a
    public final Object f() {
        return this.f19687c.getValue();
    }

    @Override // J2.a
    public final void h(Object obj) {
        this.f19686b.setValue(obj);
    }

    @Override // J2.a
    public final void j() {
    }

    @Override // J2.a
    public final void i(t0 t0Var) {
    }
}
