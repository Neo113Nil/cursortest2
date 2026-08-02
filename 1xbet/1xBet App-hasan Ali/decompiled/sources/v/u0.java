package v;

import i4.InterfaceC2015a;

/* loaded from: classes.dex */
public final class u0 extends kotlin.jvm.internal.m implements InterfaceC2015a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f20318l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v0 f20319m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(v0 v0Var, int i) {
        super(0);
        this.f20318l = i;
        this.f20319m = v0Var;
    }

    @Override // i4.InterfaceC2015a
    public final Object invoke() {
        switch (this.f20318l) {
            case 0:
                return Boolean.valueOf(this.f20319m.f20322a.h() > 0);
            default:
                v0 v0Var = this.f20319m;
                return Boolean.valueOf(v0Var.f20322a.h() < v0Var.f20325d.h());
        }
    }
}
