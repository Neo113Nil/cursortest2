package R20;

import S0.InterfaceC3978p0;
import a1.C4912a;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import v0.G;

/* loaded from: classes3.dex */
final class q extends AbstractC7737t implements Function1<G, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0 f24531b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ u f24532c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(InterfaceC3978p0 interfaceC3978p0, u uVar) {
        super(1);
        this.f24531b = interfaceC3978p0;
        this.f24532c = uVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(G g10) {
        G LazyColumn = g10;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        List list = (List) this.f24531b.getValue();
        int size = list.size();
        i iVar = i.f24517b;
        LazyColumn.a(size, iVar != null ? new n(iVar, list) : null, new o(j.f24518b, list), new C4912a(true, -632812321, new p(list, this.f24532c)));
        G.e(LazyColumn, null, b.f24502a, 3);
        G.e(LazyColumn, null, b.f24503b, 3);
        return Unit.f71690a;
    }
}
