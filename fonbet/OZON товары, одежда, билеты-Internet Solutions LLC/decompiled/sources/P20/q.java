package P20;

import B4.C2584m;
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
    final /* synthetic */ e f21725b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C2584m f21726c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(e eVar, C2584m c2584m) {
        super(1);
        this.f21725b = eVar;
        this.f21726c = c2584m;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(G g10) {
        G LazyColumn = g10;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        G.e(LazyColumn, null, a.f21692a, 3);
        e eVar = this.f21725b;
        List<b> c11 = eVar.c();
        int size = c11.size();
        g gVar = g.f21707b;
        k kVar = gVar != null ? new k(gVar, c11) : null;
        l lVar = new l(c11);
        C2584m c2584m = this.f21726c;
        LazyColumn.a(size, kVar, lVar, new C4912a(true, -1091073711, new m(c11, eVar, c2584m)));
        G.e(LazyColumn, null, a.f21693b, 3);
        List<b> b11 = eVar.b();
        int size2 = b11.size();
        i iVar = i.f21710b;
        LazyColumn.a(size2, iVar != null ? new n(iVar, b11) : null, new o(b11), new C4912a(true, -1091073711, new p(b11, eVar, c2584m)));
        G.e(LazyColumn, null, a.f21694c, 3);
        return Unit.f71690a;
    }
}
