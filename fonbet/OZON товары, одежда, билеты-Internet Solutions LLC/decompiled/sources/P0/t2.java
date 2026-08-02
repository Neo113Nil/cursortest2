package P0;

import Bl0.C2652m;
import K1.C3422b;
import S0.InterfaceC3967k;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class t2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3422b f21363b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f21364c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f21365d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ long f21366e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ long f21367f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ V1.h f21368g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ long f21369h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ int f21370i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ boolean f21371j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ int f21372k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ int f21373l;

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ Map<String, B0.E0> f21374m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ Function1<K1.K, Unit> f21375n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ K1.T f21376o;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ int f21377p;

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ int f21378q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ int f21379r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t2(C3422b c3422b, androidx.compose.ui.e eVar, long j11, long j12, long j13, V1.h hVar, long j14, int i11, boolean z11, int i12, int i13, Map map, Function1 function1, K1.T t2, int i14, int i15, int i16) {
        super(2);
        this.f21363b = c3422b;
        this.f21364c = eVar;
        this.f21365d = j11;
        this.f21366e = j12;
        this.f21367f = j13;
        this.f21368g = hVar;
        this.f21369h = j14;
        this.f21370i = i11;
        this.f21371j = z11;
        this.f21372k = i12;
        this.f21373l = i13;
        this.f21374m = map;
        this.f21375n = function1;
        this.f21376o = t2;
        this.f21377p = i14;
        this.f21378q = i15;
        this.f21379r = i16;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f21377p | 1);
        int e12 = C2652m.e(this.f21378q);
        Map<String, B0.E0> map = this.f21374m;
        int i11 = this.f21379r;
        p2.c(this.f21363b, this.f21364c, this.f21365d, this.f21366e, this.f21367f, this.f21368g, this.f21369h, this.f21370i, this.f21371j, this.f21372k, this.f21373l, map, this.f21375n, this.f21376o, interfaceC3967k, e11, e12, i11);
        return Unit.f71690a;
    }
}
