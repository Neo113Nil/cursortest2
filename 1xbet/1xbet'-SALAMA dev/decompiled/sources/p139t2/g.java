package p139t2;

import A1.X;
import E3.AbstractC0161t;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f16330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f16331b;

    public g(X x4, int i7) {
        this.f16330a = (x4.f307d & 1) != 0;
        this.f16331b = p.e(i7, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        return AbstractC0161t.f2068a.c(this.f16331b, gVar.f16331b).c(this.f16330a, gVar.f16330a).e();
    }
}
