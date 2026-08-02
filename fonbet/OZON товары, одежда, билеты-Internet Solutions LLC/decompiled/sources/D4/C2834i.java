package D4;

import B4.C2581j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: D4.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2834i extends AbstractC7737t implements Function1<S0.N, S0.M> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c1.u<C2581j> f5905b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C2581j f5906c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C2840o f5907d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2834i(C2581j c2581j, C2840o c2840o, c1.u uVar) {
        super(1);
        this.f5905b = uVar;
        this.f5906c = c2581j;
        this.f5907d = c2840o;
    }

    @Override // kotlin.jvm.functions.Function1
    public final S0.M invoke(S0.N n11) {
        C2581j c2581j = this.f5906c;
        c1.u<C2581j> uVar = this.f5905b;
        uVar.add(c2581j);
        return new C2833h(c2581j, this.f5907d, uVar);
    }
}
