package S0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: S0.p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3977p extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3964i0<Object> f25499b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f25500c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3977p(C3964i0<Object> c3964i0, Object obj) {
        super(2);
        this.f25499b = c3964i0;
        this.f25500c = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
            return Unit.f71690a;
        }
        this.f25499b.getClass();
        throw null;
    }
}
