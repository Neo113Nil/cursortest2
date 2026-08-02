package O20;

import B4.C2584m;
import a1.C4912a;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import v0.G;

/* loaded from: classes3.dex */
final class i extends AbstractC7737t implements Function1<G, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ k f19890b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C2584m f19891c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(k kVar, C2584m c2584m) {
        super(1);
        this.f19890b = kVar;
        this.f19891c = c2584m;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(G g10) {
        G LazyColumn = g10;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        G.e(LazyColumn, null, a.f19869a, 3);
        k kVar = this.f19890b;
        List<b> b11 = kVar.b();
        int size = b11.size();
        c cVar = c.f19877b;
        LazyColumn.a(size, cVar != null ? new f(cVar, b11) : null, new g(b11), new C4912a(true, -1091073711, new h(b11, kVar, this.f19891c)));
        G.e(LazyColumn, null, a.f19870b, 3);
        return Unit.f71690a;
    }
}
