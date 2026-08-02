package androidx.compose.material3;

import Bl0.C2652m;
import P0.j2;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import l1.J0;
import t0.q;

/* loaded from: classes8.dex */
final class g extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f40183b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f40184c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f40185d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ j2 f40186e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ q f40187f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ J0 f40188g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ int f40189h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(androidx.compose.ui.e eVar, boolean z11, boolean z12, j2 j2Var, q qVar, J0 j02, int i11) {
        super(2);
        this.f40183b = eVar;
        this.f40184c = z11;
        this.f40185d = z12;
        this.f40186e = j2Var;
        this.f40187f = qVar;
        this.f40188g = j02;
        this.f40189h = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f40189h | 1);
        boolean z11 = this.f40185d;
        j2 j2Var = this.f40186e;
        h.b(this.f40183b, this.f40184c, z11, j2Var, this.f40187f, this.f40188g, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
