package b1;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: b1.l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5509l extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C5506i f55454b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f55455c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C4912a f55456d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f55457e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5509l(C5506i c5506i, Object obj, C4912a c4912a, int i11) {
        super(2);
        this.f55454b = c5506i;
        this.f55455c = obj;
        this.f55456d = c4912a;
        this.f55457e = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f55457e | 1);
        C4912a c4912a = this.f55456d;
        this.f55454b.c(this.f55455c, c4912a, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
