package androidx.compose.animation;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class j extends AbstractC7737t implements Function1<Z1.q, Z1.q> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1<Integer, Integer> f38780b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    j(Function1<? super Integer, Integer> function1) {
        super(1);
        this.f38780b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Z1.q invoke(Z1.q qVar) {
        long e11 = qVar.e();
        return Z1.q.a(Z1.r.a(this.f38780b.invoke(Integer.valueOf((int) (e11 >> 32))).intValue(), (int) (e11 & 4294967295L)));
    }
}
