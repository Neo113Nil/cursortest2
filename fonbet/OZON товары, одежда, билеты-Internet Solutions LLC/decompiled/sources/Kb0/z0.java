package Kb0;

import id0.C7051b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes7.dex */
final class z0 extends AbstractC7737t implements Function0<C7051b> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ K f15783b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z0(K k11) {
        super(0);
        this.f15783b = k11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C7051b invoke() {
        K k11 = this.f15783b;
        return new C7051b(k11.N(), k11.M().o());
    }
}
