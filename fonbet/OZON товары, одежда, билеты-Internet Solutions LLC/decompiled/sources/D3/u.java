package D3;

import J3.k;
import java.io.IOException;
import m3.AbstractRunnableFutureC8051D;

/* loaded from: classes8.dex */
final class u extends AbstractRunnableFutureC8051D<r<Object>, IOException> {

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ q3.c f5732h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ p3.i f5733i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ v f5734j;

    u(v vVar, q3.c cVar, p3.i iVar) {
        this.f5734j = vVar;
        this.f5732h = cVar;
        this.f5733i = iVar;
    }

    @Override // m3.AbstractRunnableFutureC8051D
    protected final r<Object> e() throws Exception {
        k.a aVar;
        aVar = this.f5734j.f5738d;
        return (r) J3.k.e(this.f5732h, aVar, this.f5733i);
    }
}
