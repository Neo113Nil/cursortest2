package P0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class T1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f20836b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> f20837c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C4912a f20838d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ l1.J0 f20839e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ long f20840f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ long f20841g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ long f20842h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ long f20843i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ C4912a f20844j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ int f20845k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ int f20846l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    T1(androidx.compose.ui.e eVar, Function2 function2, C4912a c4912a, l1.J0 j02, long j11, long j12, long j13, long j14, C4912a c4912a2, int i11, int i12) {
        super(2);
        this.f20836b = eVar;
        this.f20837c = function2;
        this.f20838d = c4912a;
        this.f20839e = j02;
        this.f20840f = j11;
        this.f20841g = j12;
        this.f20842h = j13;
        this.f20843i = j14;
        this.f20844j = c4912a2;
        this.f20845k = i11;
        this.f20846l = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f20845k | 1);
        C4912a c4912a = this.f20844j;
        long j11 = this.f20842h;
        int i11 = this.f20846l;
        b2.a(this.f20836b, this.f20837c, this.f20838d, this.f20839e, this.f20840f, this.f20841g, j11, this.f20843i, c4912a, interfaceC3967k, e11, i11);
        return Unit.f71690a;
    }
}
