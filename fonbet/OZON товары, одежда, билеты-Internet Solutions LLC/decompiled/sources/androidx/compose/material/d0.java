package androidx.compose.material;

import Bl0.C2652m;
import J0.S2;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class d0 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f40010b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f40011c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ S2 f40012d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Function0<Float> f40013e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ t0.q f40014f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ int f40015g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d0(boolean z11, boolean z12, S2 s22, Function0 function0, t0.q qVar, int i11) {
        super(2);
        this.f40010b = z11;
        this.f40011c = z12;
        this.f40012d = s22;
        this.f40013e = function0;
        this.f40014f = qVar;
        this.f40015g = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f40015g | 1);
        S2 s22 = this.f40012d;
        e0.b(this.f40010b, this.f40011c, s22, this.f40013e, this.f40014f, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
