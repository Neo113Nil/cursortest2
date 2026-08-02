package J0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import a1.C4912a;
import androidx.compose.ui.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: J0.q2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3335q2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3350u2 f13364b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ e.a f13365c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C4912a f13366d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f13367e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3335q2(C3350u2 c3350u2, e.a aVar, C4912a c4912a, int i11) {
        super(2);
        this.f13364b = c3350u2;
        this.f13365c = aVar;
        this.f13366d = c4912a;
        this.f13367e = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f13367e | 1);
        C4912a c4912a = this.f13366d;
        C3338r2.b(this.f13364b, this.f13365c, c4912a, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
