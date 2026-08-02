package O0;

import D1.C2805i;
import D1.C2820u;
import android.view.View;
import androidx.compose.material.ripple.RippleNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import hd.C6915b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.C7845v;
import l1.InterfaceC7802U;
import n1.InterfaceC8410c;
import org.jetbrains.annotations.NotNull;
import t0.s;

/* loaded from: classes8.dex */
public final class c extends RippleNode implements p {

    /* renamed from: j, reason: collision with root package name */
    private o f19741j;

    /* renamed from: k, reason: collision with root package name */
    private r f19742k;

    static final class a extends AbstractC7737t implements Function0<Unit> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            C2820u.a(c.this);
            return Unit.f71690a;
        }
    }

    @Override // androidx.compose.material.ripple.RippleNode
    public final void N1(@NotNull s.b bVar, long j11, float f7) {
        o oVar = this.f19741j;
        if (oVar == null) {
            oVar = v.a(v.b((View) C2805i.a(this, AndroidCompositionLocals_androidKt.h())));
            this.f19741j = oVar;
            Intrinsics.f(oVar);
        }
        r b11 = oVar.b(this);
        b11.b(bVar, getF40094b(), j11, C6915b.c(f7), R1(), Q1().invoke().d(), new a());
        this.f19742k = b11;
        C2820u.a(this);
    }

    @Override // androidx.compose.material.ripple.RippleNode
    public final void O1(@NotNull InterfaceC8410c interfaceC8410c) {
        InterfaceC7802U a11 = interfaceC8410c.w0().a();
        r rVar = this.f19742k;
        if (rVar != null) {
            rVar.e(getF40099g(), R1(), Q1().invoke().d());
            rVar.draw(C7845v.b(a11));
        }
    }

    @Override // androidx.compose.material.ripple.RippleNode
    public final void U1(@NotNull s.b bVar) {
        r rVar = this.f19742k;
        if (rVar != null) {
            rVar.d();
        }
    }

    @Override // O0.p
    public final void o1() {
        this.f19742k = null;
        C2820u.a(this);
    }

    @Override // androidx.compose.ui.e.c
    public final void onDetach() {
        o oVar = this.f19741j;
        if (oVar != null) {
            oVar.a(this);
        }
    }
}
