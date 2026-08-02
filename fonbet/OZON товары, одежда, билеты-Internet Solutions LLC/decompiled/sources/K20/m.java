package K20;

import S0.InterfaceC3978p0;
import a1.C4912a;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import v0.G;

/* loaded from: classes3.dex */
final class m extends AbstractC7737t implements Function1<G, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0 f15148b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(InterfaceC3978p0 interfaceC3978p0) {
        super(1);
        this.f15148b = interfaceC3978p0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(G g10) {
        G LazyColumn = g10;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        List<L20.a> b11 = ((s) this.f15148b.getValue()).b();
        int size = b11.size();
        h hVar = h.f15141b;
        LazyColumn.a(size, hVar != null ? new j(hVar, b11) : null, new k(i.f15142b, b11), new C4912a(true, -632812321, new l(b11)));
        G.e(LazyColumn, null, a.f15123a, 3);
        return Unit.f71690a;
    }
}
