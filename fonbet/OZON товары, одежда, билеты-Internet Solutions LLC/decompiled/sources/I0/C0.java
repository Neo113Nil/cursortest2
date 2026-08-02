package I0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import q0.C8960o;
import q0.C8961p;

/* loaded from: classes8.dex */
public final class C0 extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C8960o f11300b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C3215w0 f11301c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0(C3215w0 c3215w0, C8960o c8960o) {
        super(0);
        this.f11300b = c8960o;
        this.f11301c = c3215w0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f11301c.l();
        C8961p.a(this.f11300b);
        return Unit.f71690a;
    }
}
