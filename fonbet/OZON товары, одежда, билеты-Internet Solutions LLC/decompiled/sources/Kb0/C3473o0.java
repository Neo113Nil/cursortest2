package Kb0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: Kb0.o0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C3473o0 extends AbstractC7737t implements Function0<Xb0.a> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ K f15722b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3473o0(K k11) {
        super(0);
        this.f15722b = k11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Xb0.a invoke() {
        K k11 = this.f15722b;
        return new Xb0.a(k11.p(), k11.t().h().getValue(), k11.R().getValue(), k11.m());
    }
}
