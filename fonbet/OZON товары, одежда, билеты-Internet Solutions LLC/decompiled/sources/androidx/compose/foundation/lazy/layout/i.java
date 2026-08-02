package androidx.compose.foundation.lazy.layout;

import B1.y0;
import S0.M;
import S0.N;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import x0.C10572A;
import x0.f0;

/* loaded from: classes.dex */
final class i extends AbstractC7737t implements Function1<N, M> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ o f39648b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ f f39649c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ y0 f39650d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ f0 f39651e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(o oVar, f fVar, y0 y0Var, f0 f0Var) {
        super(1);
        this.f39648b = oVar;
        this.f39649c = fVar;
        this.f39650d = y0Var;
        this.f39651e = f0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final M invoke(N n11) {
        t tVar = new t(this.f39649c, this.f39650d, this.f39651e);
        o oVar = this.f39648b;
        oVar.f(tVar);
        return new C10572A(oVar);
    }
}
