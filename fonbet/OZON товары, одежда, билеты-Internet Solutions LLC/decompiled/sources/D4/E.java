package D4;

import B4.C2581j;
import S0.A1;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class E implements S0.M {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ A1 f5800a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2830e f5801b;

    public E(A1 a12, C2830e c2830e) {
        this.f5800a = a12;
        this.f5801b = c2830e;
    }

    @Override // S0.M
    public final void dispose() {
        Iterator it = ((List) this.f5800a.getValue()).iterator();
        while (it.hasNext()) {
            this.f5801b.n((C2581j) it.next());
        }
    }
}
