package F0;

import B0.EnumC2526y0;
import k1.C7459e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import t1.InterfaceC9723a;

/* renamed from: F0.p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2995p extends AbstractC7737t implements Function2<x1.x, C7459e, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.L f8331b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C2990k f8332c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.L f8333d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2995p(C2990k c2990k, kotlin.jvm.internal.L l11, kotlin.jvm.internal.L l12) {
        super(2);
        this.f8331b = l11;
        this.f8332c = c2990k;
        this.f8333d = l12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(x1.x xVar, C7459e c7459e) {
        x1.x xVar2 = xVar;
        long n11 = c7459e.n();
        kotlin.jvm.internal.L l11 = this.f8331b;
        long k11 = C7459e.k(l11.f71786a, n11);
        l11.f71786a = k11;
        EnumC2526y0 enumC2526y0 = EnumC2526y0.Cursor;
        long k12 = C7459e.k(this.f8333d.f71786a, k11);
        C2990k c2990k = this.f8332c;
        c2990k.f0(enumC2526y0, k12);
        if (C2990k.p(c2990k, c2990k.O())) {
            xVar2.a();
            InterfaceC9723a interfaceC9723a = c2990k.f8256f;
            if (interfaceC9723a != null) {
                interfaceC9723a.a(9);
            }
        }
        return Unit.f71690a;
    }
}
