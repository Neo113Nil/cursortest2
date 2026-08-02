package D1;

import B1.m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
final class O extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ L f5370b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ x0 f5371c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f5372d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    O(L l11, x0 x0Var, long j11) {
        super(0);
        this.f5370b = l11;
        this.f5371c = x0Var;
        this.f5372d = j11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Y c22;
        L l11 = this.f5370b;
        m0.a aVar = null;
        if (T.a(l11.f5282a)) {
            AbstractC2810k0 g22 = l11.K().g2();
            if (g22 != null) {
                aVar = g22.i1();
            }
        } else {
            AbstractC2810k0 g23 = l11.K().g2();
            if (g23 != null && (c22 = g23.c2()) != null) {
                aVar = c22.i1();
            }
        }
        if (aVar == null) {
            aVar = this.f5371c.t();
        }
        Y c23 = l11.K().c2();
        Intrinsics.f(c23);
        aVar.f(c23, this.f5372d, 0.0f);
        return Unit.f71690a;
    }
}
