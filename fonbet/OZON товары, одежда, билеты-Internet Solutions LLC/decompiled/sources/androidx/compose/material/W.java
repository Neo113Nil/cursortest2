package androidx.compose.material;

import Bl0.C2652m;
import J0.S2;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class W extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f39961b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function1<Boolean, Unit> f39962c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f39963d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f39964e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ S2 f39965f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ int f39966g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ int f39967h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    W(boolean z11, Function1 function1, androidx.compose.ui.e eVar, boolean z12, S2 s22, int i11, int i12) {
        super(2);
        this.f39961b = z11;
        this.f39962c = function1;
        this.f39963d = eVar;
        this.f39964e = z12;
        this.f39965f = s22;
        this.f39966g = i11;
        this.f39967h = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f39966g | 1);
        S2 s22 = this.f39965f;
        boolean z11 = this.f39964e;
        e0.a(this.f39961b, this.f39962c, this.f39963d, z11, s22, interfaceC3967k, e11, this.f39967h);
        return Unit.f71690a;
    }
}
