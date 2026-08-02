package P0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import m0.C7980b;
import m0.C8008p;

/* loaded from: classes8.dex */
final class G0 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f20635b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C0 f20636c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C7980b<Float, C8008p> f20637d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C4912a f20638e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f20639f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    G0(Function0 function0, C0 c02, C7980b c7980b, C4912a c4912a, int i11) {
        super(2);
        this.f20635b = function0;
        this.f20636c = c02;
        this.f20637d = c7980b;
        this.f20638e = c4912a;
        this.f20639f = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f20639f | 1);
        C4912a c4912a = this.f20638e;
        K0.a(this.f20635b, this.f20636c, this.f20637d, c4912a, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
