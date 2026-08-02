package P0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class V1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3793z1 f20869b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f20870c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ l1.J0 f20871d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ long f20872e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ long f20873f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ long f20874g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ long f20875h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ long f20876i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ int f20877j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    V1(InterfaceC3793z1 interfaceC3793z1, androidx.compose.ui.e eVar, l1.J0 j02, long j11, long j12, long j13, long j14, long j15, int i11) {
        super(2);
        this.f20869b = interfaceC3793z1;
        this.f20870c = eVar;
        this.f20871d = j02;
        this.f20872e = j11;
        this.f20873f = j12;
        this.f20874g = j13;
        this.f20875h = j14;
        this.f20876i = j15;
        this.f20877j = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f20877j | 1);
        long j11 = this.f20873f;
        long j12 = this.f20874g;
        b2.b(this.f20869b, this.f20870c, this.f20871d, this.f20872e, j11, j12, this.f20875h, this.f20876i, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
