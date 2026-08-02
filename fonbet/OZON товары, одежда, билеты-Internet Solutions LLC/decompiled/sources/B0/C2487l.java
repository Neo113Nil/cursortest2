package B0;

import F0.C2990k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: B0.l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2487l extends AbstractC7737t implements Function1<S0.N, S0.M> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2990k f1837b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2487l(C2990k c2990k) {
        super(1);
        this.f1837b = c2990k;
    }

    @Override // kotlin.jvm.functions.Function1
    public final S0.M invoke(S0.N n11) {
        return new C2484k(this.f1837b);
    }
}
