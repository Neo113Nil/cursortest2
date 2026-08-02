package E0;

import B1.m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class A0 extends AbstractC7737t implements Function1<m0.a, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ D0 f6938b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ B1.Y f6939c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f6940d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ B1.m0 f6941e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    A0(D0 d02, B1.Y y11, int i11, B1.m0 m0Var) {
        super(1);
        this.f6938b = d02;
        this.f6939c = y11;
        this.f6940d = i11;
        this.f6941e = m0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(m0.a aVar) {
        c1 c1Var;
        n0.d0 d0Var;
        B1.m0 m0Var = this.f6941e;
        int l02 = m0Var.l0();
        D0 d02 = this.f6938b;
        c1Var = d02.f6960f;
        long d11 = c1Var.j().d();
        B1.Y y11 = this.f6939c;
        Z1.s layoutDirection = y11.getLayoutDirection();
        D0.R1(this.f6938b, y11, this.f6940d, l02, d11, layoutDirection);
        d0Var = d02.f6964j;
        aVar.h(m0Var, 0, -d0Var.m(), 0.0f);
        return Unit.f71690a;
    }
}
