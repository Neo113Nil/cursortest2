package Kb0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: Kb0.t0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C3482t0 extends AbstractC7737t implements Function0<Sb0.b> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ K f15732b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3482t0(K k11) {
        super(0);
        this.f15732b = k11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Sb0.b invoke() {
        K k11 = this.f15732b;
        return new Sb0.b(k11.k(), td0.f.a(), k11.P(), k11.t().h().getValue());
    }
}
