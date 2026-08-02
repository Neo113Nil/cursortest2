package J0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class f3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f13214b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ K1.T f13215c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C4912a f13216d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f13217e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f13218f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f3(long j11, K1.T t2, C4912a c4912a, int i11, int i12) {
        super(2);
        this.f13214b = j11;
        this.f13215c = t2;
        this.f13216d = c4912a;
        this.f13217e = i11;
        this.f13218f = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f13217e | 1);
        K1.T t2 = this.f13215c;
        j3.b(this.f13214b, t2, this.f13216d, interfaceC3967k, e11, this.f13218f);
        return Unit.f71690a;
    }
}
