package androidx.compose.foundation.gestures;

import D1.C2805i;
import S0.B1;
import androidx.compose.ui.platform.K0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import l0.l0;
import r0.C9129i;

/* loaded from: classes.dex */
final class T extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ N f39107b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    T(N n11) {
        super(0);
        this.f39107b = n11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C9129i c9129i;
        B1 e11 = K0.e();
        N n11 = this.f39107b;
        Z1.d dVar = (Z1.d) C2805i.a(n11, e11);
        c9129i = n11.f39064p;
        c9129i.e(m0.C.b(new l0(dVar)));
        return Unit.f71690a;
    }
}
