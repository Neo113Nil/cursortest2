package P0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class Q1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C4912a f20768b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> f20769c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C4912a f20770d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ K1.T f20771e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ long f20772f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ long f20773g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ int f20774h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Q1(C4912a c4912a, Function2 function2, C4912a c4912a2, K1.T t2, long j11, long j12, int i11) {
        super(2);
        this.f20768b = c4912a;
        this.f20769c = function2;
        this.f20770d = c4912a2;
        this.f20771e = t2;
        this.f20772f = j11;
        this.f20773g = j12;
        this.f20774h = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f20774h | 1);
        C4912a c4912a = this.f20768b;
        C4912a c4912a2 = this.f20770d;
        K1.T t2 = this.f20771e;
        b2.c(c4912a, this.f20769c, c4912a2, t2, this.f20772f, this.f20773g, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
