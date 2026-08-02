package n4;

import java.util.ArrayList;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class y implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f15501a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1473g f15502b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1468b f15503c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f15504d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1468b f15505e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ D f15506f;

    public y(D d7, boolean z4, C1473g c1473g, C1468b c1468b, long j, C1468b c1468b2) {
        this.f15506f = d7;
        this.f15501a = z4;
        this.f15502b = c1473g;
        this.f15503c = c1468b;
        this.f15504d = j;
        this.f15505e = c1468b2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        boolean z4 = this.f15501a;
        long j = this.f15504d;
        C1473g c1473g = this.f15502b;
        D d7 = this.f15506f;
        if (z4) {
            d7.f15365g.k(j, this.f15503c, c1473g);
        }
        M m7 = d7.f15360b;
        Long valueOf = Long.valueOf(j);
        m7.getClass();
        q4.k.c(j > ((Long) m7.f15385c).longValue());
        ArrayList arrayList = (ArrayList) m7.f15384b;
        C1468b c1468b = this.f15505e;
        arrayList.add(new H(j, c1468b, c1473g));
        m7.f15383a = ((C1468b) m7.f15383a).m(c1473g, c1468b);
        m7.f15385c = valueOf;
        return D.a(d7, new o4.c(o4.d.f15605d, c1473g, c1468b));
    }
}
