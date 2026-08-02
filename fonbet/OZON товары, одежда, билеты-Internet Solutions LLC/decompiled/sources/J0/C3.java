package J0;

import Bl0.C2652m;
import K1.C3422b;
import S0.InterfaceC3967k;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes.dex */
final class C3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3422b f12700b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f12701c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f12702d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ long f12703e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ long f12704f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ V1.h f12705g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ long f12706h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ int f12707i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ boolean f12708j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ int f12709k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ int f12710l;

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ Map<String, B0.E0> f12711m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ Function1<K1.K, Unit> f12712n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ K1.T f12713o;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ int f12714p;

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ int f12715q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ int f12716r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3(C3422b c3422b, androidx.compose.ui.e eVar, long j11, long j12, long j13, V1.h hVar, long j14, int i11, boolean z11, int i12, int i13, Map map, Function1 function1, K1.T t2, int i14, int i15, int i16) {
        super(2);
        this.f12700b = c3422b;
        this.f12701c = eVar;
        this.f12702d = j11;
        this.f12703e = j12;
        this.f12704f = j13;
        this.f12705g = hVar;
        this.f12706h = j14;
        this.f12707i = i11;
        this.f12708j = z11;
        this.f12709k = i12;
        this.f12710l = i13;
        this.f12711m = map;
        this.f12712n = function1;
        this.f12713o = t2;
        this.f12714p = i14;
        this.f12715q = i15;
        this.f12716r = i16;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f12714p | 1);
        int e12 = C2652m.e(this.f12715q);
        Map<String, B0.E0> map = this.f12711m;
        int i11 = this.f12716r;
        u3.c(this.f12700b, this.f12701c, this.f12702d, this.f12703e, this.f12704f, this.f12705g, this.f12706h, this.f12707i, this.f12708j, this.f12709k, this.f12710l, map, this.f12712n, this.f12713o, interfaceC3967k, e11, e12, i11);
        return Unit.f71690a;
    }
}
