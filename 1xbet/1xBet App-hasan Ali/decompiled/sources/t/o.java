package t;

import i4.InterfaceC2015a;
import u.t0;

/* loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.m implements InterfaceC2015a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f19398l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ t0 f19399m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(t0 t0Var, int i) {
        super(0);
        this.f19398l = i;
        this.f19399m = t0Var;
    }

    @Override // i4.InterfaceC2015a
    public final Object invoke() {
        switch (this.f19398l) {
            case 0:
                t0 t0Var = this.f19399m;
                Object e3 = t0Var.f19937a.e();
                v vVar = v.f19417m;
                return Boolean.valueOf(e3 == vVar && t0Var.f19940d.getValue() == vVar);
            default:
                return Long.valueOf(this.f19399m.b());
        }
    }
}
