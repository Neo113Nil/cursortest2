package J0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes.dex */
final class O2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f12921b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ l1.J0 f12922c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f12923d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ long f12924e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ float f12925f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C4912a f12926g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ int f12927h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ int f12928i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    O2(androidx.compose.ui.e eVar, l1.J0 j02, long j11, long j12, float f7, C4912a c4912a, int i11, int i12) {
        super(2);
        this.f12921b = eVar;
        this.f12922c = j02;
        this.f12923d = j11;
        this.f12924e = j12;
        this.f12925f = f7;
        this.f12926g = c4912a;
        this.f12927h = i11;
        this.f12928i = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f12927h | 1);
        C4912a c4912a = this.f12926g;
        long j11 = this.f12924e;
        R2.a(this.f12921b, this.f12922c, this.f12923d, j11, this.f12925f, c4912a, interfaceC3967k, e11, this.f12928i);
        return Unit.f71690a;
    }
}
