package P0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class J1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ N1 f20659b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f20660c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C4912a f20661d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f20662e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f20663f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    J1(N1 n12, androidx.compose.ui.e eVar, C4912a c4912a, int i11, int i12) {
        super(2);
        this.f20659b = n12;
        this.f20660c = eVar;
        this.f20661d = c4912a;
        this.f20662e = i11;
        this.f20663f = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f20662e | 1);
        N1 n12 = this.f20659b;
        K1.b(n12, this.f20660c, this.f20661d, interfaceC3967k, e11, this.f20663f);
        return Unit.f71690a;
    }
}
