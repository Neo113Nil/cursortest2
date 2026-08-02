package D4;

import B4.C2581j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: D4.m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2838m extends AbstractC7737t implements Function1<S0.N, S0.M> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2581j f5916b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f5917c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ c1.u f5918d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2838m(C2581j c2581j, c1.u uVar, boolean z11) {
        super(1);
        this.f5916b = c2581j;
        this.f5917c = z11;
        this.f5918d = uVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final S0.M invoke(S0.N n11) {
        C2581j c2581j = this.f5916b;
        C2836k c2836k = new C2836k(c2581j, this.f5918d, this.f5917c);
        c2581j.getLifecycle().a(c2836k);
        return new C2837l(c2581j, c2836k);
    }
}
