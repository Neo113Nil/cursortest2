package J0;

import k1.C7464j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import n1.InterfaceC8412e;

/* loaded from: classes8.dex */
final class J1 extends AbstractC7737t implements Function1<InterfaceC8412e, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f12872b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f12873c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ float f12874d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ long f12875e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    J1(long j11, int i11, float f7, long j12) {
        super(1);
        this.f12872b = j11;
        this.f12873c = i11;
        this.f12874d = f7;
        this.f12875e = j12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC8412e interfaceC8412e) {
        InterfaceC8412e interfaceC8412e2 = interfaceC8412e;
        float d11 = C7464j.d(interfaceC8412e2.i());
        I1.f(interfaceC8412e2, this.f12872b, d11, this.f12873c);
        I1.i(interfaceC8412e2, this.f12874d, this.f12875e, d11, this.f12873c);
        return Unit.f71690a;
    }
}
