package androidx.compose.material3;

import Bl0.C2652m;
import P0.j2;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class f extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f40178b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function1<Boolean, Unit> f40179c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f40180d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f40181e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ j2 f40182f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(boolean z11, Function1 function1, androidx.compose.ui.e eVar, boolean z12, j2 j2Var, int i11) {
        super(2);
        this.f40178b = z11;
        this.f40179c = function1;
        this.f40180d = eVar;
        this.f40181e = z12;
        this.f40182f = j2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(1);
        androidx.compose.ui.e eVar = this.f40180d;
        boolean z11 = this.f40181e;
        h.a(this.f40178b, this.f40179c, eVar, z11, this.f40182f, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
