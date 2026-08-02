package Kb0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes7.dex */
final class S extends AbstractC7737t implements Function0<Cb0.k> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ K f15555b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    S(K k11) {
        super(0);
        this.f15555b = k11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Cb0.k invoke() {
        K k11 = this.f15555b;
        return new Cb0.k(k11.o(), k11.u());
    }
}
