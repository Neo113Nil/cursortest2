package Kb0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: Kb0.j0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C3463j0 extends AbstractC7737t implements Function0<Jc0.j> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ K f15681b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3463j0(K k11) {
        super(0);
        this.f15681b = k11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Jc0.j invoke() {
        K k11 = this.f15681b;
        return new Jc0.j(k11.W().m(), k11.D(), k11.v().f(), k11.v().g(), k11.t().h().getValue(), k11.v().l());
    }
}
