package androidx.compose.animation;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class o extends AbstractC7737t implements Function1<Z1.q, Z1.m> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1<Integer, Integer> f38785b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    o(Function1<? super Integer, Integer> function1) {
        super(1);
        this.f38785b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Z1.m invoke(Z1.q qVar) {
        return Z1.m.a(Z1.n.a(this.f38785b.invoke(Integer.valueOf((int) (qVar.e() >> 32))).intValue(), 0));
    }
}
