package P0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import n1.InterfaceC8412e;

/* renamed from: P0.v0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3780v0 extends AbstractC7737t implements Function1<InterfaceC8412e, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f21416b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ S0.A1<Float> f21417c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3780v0(long j11, S0.A1<Float> a12) {
        super(1);
        this.f21416b = j11;
        this.f21417c = a12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC8412e interfaceC8412e) {
        InterfaceC8412e.Q(interfaceC8412e, this.f21416b, 0L, 0L, kotlin.ranges.h.d(this.f21417c.getValue().floatValue(), 0.0f, 1.0f), null, 118);
        return Unit.f71690a;
    }
}
