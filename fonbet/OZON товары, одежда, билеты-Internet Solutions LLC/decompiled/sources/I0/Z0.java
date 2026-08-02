package I0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import q0.C8960o;
import q0.C8961p;

/* loaded from: classes8.dex */
public final class Z0 extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C8960o f11436b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ W0 f11437c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z0(W0 w02, C8960o c8960o) {
        super(0);
        this.f11436b = c8960o;
        this.f11437c = w02;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f11437c.o(false);
        C8961p.a(this.f11436b);
        return Unit.f71690a;
    }
}
