package I;

import i4.InterfaceC2015a;

/* loaded from: classes.dex */
public final class T extends kotlin.jvm.internal.m implements InterfaceC2015a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2448l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ w.m f2449m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ O f2450n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ T(w.m mVar, O o5, int i) {
        super(0);
        this.f2448l = i;
        this.f2449m = mVar;
        this.f2450n = o5;
    }

    @Override // i4.InterfaceC2015a
    public final Object invoke() {
        switch (this.f2448l) {
            case 0:
                this.f2450n.d();
                this.f2449m.f20478a.setValue(w.j.f20476a);
                break;
            case 1:
                this.f2450n.b(false);
                this.f2449m.f20478a.setValue(w.j.f20476a);
                break;
            case 2:
                this.f2450n.l();
                this.f2449m.f20478a.setValue(w.j.f20476a);
                break;
            default:
                this.f2450n.m();
                this.f2449m.f20478a.setValue(w.j.f20476a);
                break;
        }
        return W3.o.f6046a;
    }
}
