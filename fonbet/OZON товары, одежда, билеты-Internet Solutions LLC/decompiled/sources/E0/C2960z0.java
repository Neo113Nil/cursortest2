package E0;

import B1.m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: E0.z0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2960z0 extends AbstractC7737t implements Function1<m0.a, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ D0 f7333b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ B1.Y f7334c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f7335d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ B1.m0 f7336e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2960z0(D0 d02, B1.Y y11, int i11, B1.m0 m0Var) {
        super(1);
        this.f7333b = d02;
        this.f7334c = y11;
        this.f7335d = i11;
        this.f7336e = m0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(m0.a aVar) {
        c1 c1Var;
        n0.d0 d0Var;
        B1.m0 m0Var = this.f7336e;
        int u02 = m0Var.u0();
        D0 d02 = this.f7333b;
        c1Var = d02.f6960f;
        long d11 = c1Var.j().d();
        B1.Y y11 = this.f7334c;
        Z1.s layoutDirection = y11.getLayoutDirection();
        D0.R1(this.f7333b, y11, this.f7335d, u02, d11, layoutDirection);
        d0Var = d02.f6964j;
        aVar.h(m0Var, -d0Var.m(), 0, 0.0f);
        return Unit.f71690a;
    }
}
