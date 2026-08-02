package Sf0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class i extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f26212b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f26213c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f26214d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Function1<Long, Unit> f26215e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(androidx.compose.ui.e eVar, String str, long j11, Function1 function1, int i11) {
        super(2);
        this.f26212b = eVar;
        this.f26213c = str;
        this.f26214d = j11;
        this.f26215e = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(3079);
        String str = this.f26213c;
        long j11 = this.f26214d;
        j.b(this.f26212b, str, j11, this.f26215e, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
