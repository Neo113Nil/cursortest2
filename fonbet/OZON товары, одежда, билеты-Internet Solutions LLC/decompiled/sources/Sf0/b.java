package Sf0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class b extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f26197b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C4912a f26198c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f26199d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f26200e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(androidx.compose.ui.e eVar, C4912a c4912a, int i11, int i12) {
        super(2);
        this.f26197b = eVar;
        this.f26198c = c4912a;
        this.f26199d = i11;
        this.f26200e = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f26199d | 1);
        C4912a c4912a = this.f26198c;
        int i11 = this.f26200e;
        c.a(this.f26197b, c4912a, interfaceC3967k, e11, i11);
        return Unit.f71690a;
    }
}
