package N;

import i4.InterfaceC2015a;
import u.r0;

/* loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.m implements InterfaceC2015a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f3687l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r0 f3688m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(r0 r0Var, int i) {
        super(0);
        this.f3687l = i;
        this.f3688m = r0Var;
    }

    @Override // i4.InterfaceC2015a
    public final Object invoke() {
        switch (this.f3687l) {
            case 0:
                return Boolean.valueOf(((Number) this.f3688m.f19908t.getValue()).floatValue() > 0.0f);
            default:
                return Boolean.valueOf(((Number) this.f3688m.f19908t.getValue()).floatValue() > 0.0f);
        }
    }
}
