package bb0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: bb0.A, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5617A extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ List<eb0.d> f55787b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ e.a f55788c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5617A(List list, e.a aVar, int i11) {
        super(2);
        this.f55787b = list;
        this.f55788c = aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(1);
        B.a(this.f55787b, this.f55788c, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
