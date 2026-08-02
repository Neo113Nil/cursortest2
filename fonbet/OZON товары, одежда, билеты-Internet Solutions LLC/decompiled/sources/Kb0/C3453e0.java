package Kb0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: Kb0.e0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C3453e0 extends AbstractC7737t implements Function0<Nb0.i> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ K f15642b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3453e0(K k11) {
        super(0);
        this.f15642b = k11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Nb0.i invoke() {
        K k11 = this.f15642b;
        return new Nb0.i(k11.W().h(), k11.W().e(), k11.p(), k11.t().h().getValue());
    }
}
