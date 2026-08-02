package O3;

import i4.InterfaceC2015a;

/* loaded from: classes.dex */
public final class i extends J2.d {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f4068k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f4069l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l f4070m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2015a f4071n;

    public i(int i, j jVar, l lVar, InterfaceC2015a interfaceC2015a) {
        this.f4068k = i;
        this.f4069l = jVar;
        this.f4070m = lVar;
        this.f4071n = interfaceC2015a;
    }

    @Override // J2.d
    public final void b(J2.m mVar) {
        if (this.f4068k == this.f4069l.f4074c) {
            this.f4070m.invoke();
        }
    }

    @Override // J2.d
    public final void z() {
        if (this.f4068k == this.f4069l.f4074c) {
            this.f4071n.invoke();
        }
    }
}
