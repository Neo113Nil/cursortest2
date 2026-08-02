package v;

import i4.InterfaceC2015a;

/* loaded from: classes.dex */
public final class r0 extends kotlin.jvm.internal.m implements InterfaceC2015a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f20296l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ s0 f20297m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(s0 s0Var, int i) {
        super(0);
        this.f20296l = i;
        this.f20297m = s0Var;
    }

    @Override // i4.InterfaceC2015a
    public final Object invoke() {
        switch (this.f20296l) {
            case 0:
                return Float.valueOf(this.f20297m.f20302y.f20322a.h());
            default:
                return Float.valueOf(this.f20297m.f20302y.f20325d.h());
        }
    }
}
