package B0;

import b1.InterfaceC5518u;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class C extends AbstractC7737t implements Function2<InterfaceC5518u, Long, Long> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ I0.K0 f1346b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C(I0.K0 k02) {
        super(2);
        this.f1346b = k02;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Long invoke(InterfaceC5518u interfaceC5518u, Long l11) {
        long longValue = l11.longValue();
        if (I0.O0.b(this.f1346b, longValue)) {
            return Long.valueOf(longValue);
        }
        return null;
    }
}
