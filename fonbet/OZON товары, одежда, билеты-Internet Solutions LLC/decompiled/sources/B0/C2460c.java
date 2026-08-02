package B0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: B0.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2460c extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f1684b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f1685c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f1686d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2460c(androidx.compose.ui.e eVar, int i11, int i12) {
        super(2);
        this.f1684b = eVar;
        this.f1685c = i11;
        this.f1686d = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f1685c | 1);
        int i11 = this.f1686d;
        C2457b.b(this.f1684b, interfaceC3967k, e11, i11);
        return Unit.f71690a;
    }
}
