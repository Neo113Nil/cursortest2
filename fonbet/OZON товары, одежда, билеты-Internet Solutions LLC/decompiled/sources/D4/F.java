package D4;

import B4.C2581j;
import S0.A1;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class F extends AbstractC7737t implements Function1<S0.N, S0.M> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ A1<List<C2581j>> f5802b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C2830e f5803c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    F(A1<? extends List<C2581j>> a12, C2830e c2830e) {
        super(1);
        this.f5802b = a12;
        this.f5803c = c2830e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final S0.M invoke(S0.N n11) {
        return new E(this.f5802b, this.f5803c);
    }
}
