package N0;

import S0.M;
import S0.N;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class c extends AbstractC7737t implements Function1<N, M> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ s f18295b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f18296c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Z1.s f18297d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(s sVar, Function0<Unit> function0, String str, Z1.s sVar2) {
        super(1);
        this.f18295b = sVar;
        this.f18296c = function0;
        this.f18297d = sVar2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final M invoke(N n11) {
        s sVar = this.f18295b;
        sVar.j();
        sVar.k(this.f18296c, this.f18297d);
        return new b(sVar);
    }
}
