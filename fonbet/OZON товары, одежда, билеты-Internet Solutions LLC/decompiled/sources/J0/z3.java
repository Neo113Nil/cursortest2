package J0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class z3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e.a f13541b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f13542c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f13543d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ long f13544e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ long f13545f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ int f13546g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ boolean f13547h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ int f13548i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ Function1<K1.K, Unit> f13549j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ K1.T f13550k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z3(e.a aVar, long j11, long j12, long j13, long j14, int i11, boolean z11, int i12, Function1 function1, K1.T t2, int i13) {
        super(2);
        this.f13541b = aVar;
        this.f13542c = j11;
        this.f13543d = j12;
        this.f13544e = j13;
        this.f13545f = j14;
        this.f13546g = i11;
        this.f13547h = z11;
        this.f13548i = i12;
        this.f13549j = function1;
        this.f13550k = t2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(7);
        Function1<K1.K, Unit> function1 = this.f13549j;
        boolean z11 = this.f13547h;
        int i11 = this.f13548i;
        u3.d(this.f13541b, this.f13542c, this.f13543d, this.f13544e, this.f13545f, this.f13546g, z11, i11, function1, this.f13550k, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
