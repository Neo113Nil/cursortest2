package n4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class x implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f15494a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1473g f15495b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v4.r f15496c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f15497d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v4.r f15498e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f15499f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ D f15500g;

    public x(D d7, boolean z4, C1473g c1473g, v4.r rVar, long j, v4.r rVar2, boolean z7) {
        this.f15500g = d7;
        this.f15494a = z4;
        this.f15495b = c1473g;
        this.f15496c = rVar;
        this.f15497d = j;
        this.f15498e = rVar2;
        this.f15499f = z7;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        boolean z4 = this.f15494a;
        C1473g c1473g = this.f15495b;
        D d7 = this.f15500g;
        if (z4) {
            d7.f15365g.p(c1473g, this.f15496c, this.f15497d);
        }
        M m7 = d7.f15360b;
        long j = this.f15497d;
        Long valueOf = Long.valueOf(j);
        m7.getClass();
        q4.k.c(j > ((Long) m7.f15385c).longValue());
        ArrayList arrayList = (ArrayList) m7.f15384b;
        C1473g c1473g2 = this.f15495b;
        v4.r rVar = this.f15498e;
        boolean z7 = this.f15499f;
        arrayList.add(new H(j, c1473g2, rVar, z7));
        if (z7) {
            m7.f15383a = ((C1468b) m7.f15383a).l(c1473g2, rVar);
        }
        m7.f15385c = valueOf;
        return !this.f15499f ? Collections.emptyList() : D.a(d7, new o4.e(o4.d.f15605d, c1473g, this.f15498e));
    }
}
