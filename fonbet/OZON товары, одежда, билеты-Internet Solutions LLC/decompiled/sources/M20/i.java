package M20;

import B4.M;
import B4.P;
import D4.C2844t;
import a1.C4912a;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class i extends AbstractC7737t implements Function1<M, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ P f17282b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(P p11) {
        super(1);
        this.f17282b = p11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(M m11) {
        M NavHost = m11;
        Intrinsics.checkNotNullParameter(NavHost, "$this$NavHost");
        P p11 = this.f17282b;
        C4912a c4912a = new C4912a(true, -1766891561, new e(p11));
        K k11 = K.f71697a;
        C2844t.a(NavHost, "packages", k11, k11, c4912a);
        C4912a c4912a2 = new C4912a(true, 2056189312, new g(p11));
        K k12 = K.f71697a;
        C2844t.a(NavHost, "resources/{packageName}", k12, k12, c4912a2);
        C2844t.a(NavHost, "details/{sourceName}/{resourceKey}", k12, k12, new C4912a(true, 182975775, new h(p11)));
        return Unit.f71690a;
    }
}
