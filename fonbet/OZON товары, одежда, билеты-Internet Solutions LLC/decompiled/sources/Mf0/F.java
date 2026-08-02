package Mf0;

import S0.C3991w0;
import S0.D1;
import S0.InterfaceC3978p0;
import S0.n1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class F extends AbstractC7737t implements Function0<InterfaceC3978p0<String>> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ N f17951b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    F(N n11) {
        super(0);
        this.f17951b = n11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC3978p0<String> invoke() {
        C3991w0 f7;
        f7 = n1.f(this.f17951b.c().get("x-o3-meshversion"), D1.f25195a);
        return f7;
    }
}
