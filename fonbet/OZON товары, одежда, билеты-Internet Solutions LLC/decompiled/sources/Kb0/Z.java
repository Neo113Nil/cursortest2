package Kb0;

import dc0.C6176v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes7.dex */
final class Z extends AbstractC7737t implements Function0<C6176v> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ K f15597b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Z(K k11) {
        super(0);
        this.f15597b = k11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C6176v invoke() {
        return new C6176v(this.f15597b.t().h().getValue());
    }
}
