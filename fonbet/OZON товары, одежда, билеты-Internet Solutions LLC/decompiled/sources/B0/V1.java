package B0;

import kotlin.jvm.functions.Function1;

/* loaded from: classes8.dex */
public final class V1 implements S0.M {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ U1 f1577a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1 f1578b;

    public V1(U1 u12, Function1 function1) {
        this.f1577a = u12;
        this.f1578b = function1;
    }

    @Override // S0.M
    public final void dispose() {
        this.f1577a.f1540d.remove(this.f1578b);
    }
}
