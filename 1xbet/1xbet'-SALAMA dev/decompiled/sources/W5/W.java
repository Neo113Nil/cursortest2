package W5;

import U5.AbstractC0442i;

/* JADX INFO: loaded from: classes2.dex */
public final class W extends C0504g1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f7075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final U5.l0 f7076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final EnumC0543u f7077d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AbstractC0442i[] f7078e;

    public W(U5.l0 l0Var, EnumC0543u enumC0543u, AbstractC0442i[] abstractC0442iArr) {
        p113p3.f.d("error must not be OK", !l0Var.e());
        this.f7076c = l0Var;
        this.f7077d = enumC0543u;
        this.f7078e = abstractC0442iArr;
    }

    @Override // W5.C0504g1, W5.InterfaceC0540t
    public final void d(R4.c cVar) {
        cVar.y(this.f7076c, "error");
        cVar.y(this.f7077d, "progress");
    }

    @Override // W5.C0504g1, W5.InterfaceC0540t
    public final void e(InterfaceC0546v interfaceC0546v) {
        p113p3.f.q("already started", !this.f7075b);
        this.f7075b = true;
        AbstractC0442i[] abstractC0442iArr = this.f7078e;
        int length = abstractC0442iArr.length;
        int i7 = 0;
        while (true) {
            U5.l0 l0Var = this.f7076c;
            if (i7 >= length) {
                interfaceC0546v.F(l0Var, this.f7077d, new U5.b0());
                return;
            } else {
                abstractC0442iArr[i7].m(l0Var);
                i7++;
            }
        }
    }

    public W(U5.l0 l0Var, AbstractC0442i[] abstractC0442iArr) {
        this(l0Var, EnumC0543u.f7372a, abstractC0442iArr);
    }
}
