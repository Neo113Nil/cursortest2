package Kb0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes7.dex */
final class y0 extends AbstractC7737t implements Function0<ob0.B> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ K f15782b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y0(K k11) {
        super(0);
        this.f15782b = k11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ob0.B invoke() {
        K k11 = this.f15782b;
        return new ob0.B(k11.N(), k11.M().o());
    }
}
