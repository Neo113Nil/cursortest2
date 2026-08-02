package B0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: B0.t0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2511t0 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ I0.W0 f1966b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f1967c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f1968d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2511t0(I0.W0 w02, boolean z11, int i11) {
        super(2);
        this.f1966b = w02;
        this.f1967c = z11;
        this.f1968d = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f1968d | 1);
        C2514u0.e(this.f1966b, this.f1967c, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
