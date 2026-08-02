package D4;

import B4.C2581j;
import Bl0.C2652m;
import S0.InterfaceC3967k;
import a1.C4912a;
import b1.InterfaceC5505h;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: D4.q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2842q extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2581j f5925b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC5505h f5926c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C4912a f5927d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2842q(C2581j c2581j, InterfaceC5505h interfaceC5505h, C4912a c4912a, int i11) {
        super(2);
        this.f5925b = c2581j;
        this.f5926c = interfaceC5505h;
        this.f5927d = c4912a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(385);
        InterfaceC5505h interfaceC5505h = this.f5926c;
        C4912a c4912a = this.f5927d;
        C2843s.a(this.f5925b, interfaceC5505h, c4912a, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
