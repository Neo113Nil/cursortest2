package t2;

import A1.X;
import E3.AbstractC0161t;

/* loaded from: classes.dex */
public final class g implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f16324a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f16325b;

    public g(X x4, int i7) {
        this.f16324a = (x4.f307d & 1) != 0;
        this.f16325b = p.e(i7, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        return AbstractC0161t.f2068a.c(this.f16325b, gVar.f16325b).c(this.f16324a, gVar.f16324a).e();
    }
}
