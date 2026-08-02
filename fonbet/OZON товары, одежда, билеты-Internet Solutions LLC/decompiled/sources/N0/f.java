package N0;

import J0.Y;
import S0.M;
import S0.N;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class f extends AbstractC7737t implements Function1<N, M> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ s f18301b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Y f18302c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(s sVar, Y y11) {
        super(1);
        this.f18301b = sVar;
        this.f18302c = y11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final M invoke(N n11) {
        Y y11 = this.f18302c;
        s sVar = this.f18301b;
        sVar.i(y11);
        sVar.l();
        return new e();
    }
}
