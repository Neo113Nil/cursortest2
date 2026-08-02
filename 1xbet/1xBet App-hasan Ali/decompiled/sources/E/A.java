package E;

import i4.InterfaceC2015a;

/* loaded from: classes.dex */
public final class A extends kotlin.jvm.internal.m implements InterfaceC2015a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f987l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ I.O f988m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A(I.O o5, int i) {
        super(0);
        this.f987l = i;
        this.f988m = o5;
    }

    @Override // i4.InterfaceC2015a
    public final Object invoke() {
        switch (this.f987l) {
            case 0:
                this.f988m.l();
                break;
            case 1:
                this.f988m.f(true);
                break;
            case 2:
                this.f988m.b(true);
                break;
            case 3:
                this.f988m.d();
                break;
            case 4:
                I.O o5 = this.f988m;
                o5.b(true);
                o5.k();
                break;
            case 5:
                I.O o6 = this.f988m;
                o6.d();
                o6.k();
                break;
            case 6:
                I.O o7 = this.f988m;
                o7.l();
                o7.k();
                break;
            default:
                this.f988m.m();
                break;
        }
        return W3.o.f6046a;
    }
}
