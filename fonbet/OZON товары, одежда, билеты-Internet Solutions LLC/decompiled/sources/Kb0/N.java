package Kb0;

import dc0.C6159e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes7.dex */
final class N extends AbstractC7737t implements Function0<C6159e> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ K f15551b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    N(K k11) {
        super(0);
        this.f15551b = k11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C6159e invoke() {
        K k11 = this.f15551b;
        return new C6159e(k11.N(), k11.i(), k11.z());
    }
}
