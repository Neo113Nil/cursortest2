package Kb0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: Kb0.v0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C3486v0 extends AbstractC7737t implements Function0<Sb0.e> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ K f15741b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3486v0(K k11) {
        super(0);
        this.f15741b = k11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Sb0.e invoke() {
        K k11 = this.f15741b;
        return new Sb0.e(k11.P(), k11.t().h().getValue());
    }
}
