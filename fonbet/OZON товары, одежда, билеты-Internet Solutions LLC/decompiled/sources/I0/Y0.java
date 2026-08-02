package I0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import q0.C8960o;
import q0.C8961p;

/* loaded from: classes8.dex */
public final class Y0 extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C8960o f11432b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ W0 f11433c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y0(W0 w02, C8960o c8960o) {
        super(0);
        this.f11432b = c8960o;
        this.f11433c = w02;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f11433c.r();
        C8961p.a(this.f11432b);
        return Unit.f71690a;
    }
}
