package I0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import q0.C8960o;
import q0.C8961p;

/* loaded from: classes8.dex */
public final class b1 extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C8960o f11450b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ W0 f11451c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(W0 w02, C8960o c8960o) {
        super(0);
        this.f11450b = c8960o;
        this.f11451c = w02;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f11451c.O();
        C8961p.a(this.f11450b);
        return Unit.f71690a;
    }
}
