package B0;

import Bl0.C2652m;
import F0.C2990k;
import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class H extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2990k f1398b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f1399c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C4912a f1400d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f1401e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    H(C2990k c2990k, boolean z11, C4912a c4912a, int i11) {
        super(2);
        this.f1398b = c2990k;
        this.f1399c = z11;
        this.f1400d = c4912a;
        this.f1401e = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f1401e | 1);
        C4912a c4912a = this.f1400d;
        L.a(this.f1398b, this.f1399c, c4912a, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
