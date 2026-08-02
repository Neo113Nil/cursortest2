package I0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import q0.C8960o;
import q0.C8961p;

/* loaded from: classes8.dex */
public final class D0 extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C8960o f11302b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C3215w0 f11303c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D0(C3215w0 c3215w0, C8960o c8960o) {
        super(0);
        this.f11302b = c8960o;
        this.f11303c = c3215w0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f11303c.E();
        C8961p.a(this.f11302b);
        return Unit.f71690a;
    }
}
