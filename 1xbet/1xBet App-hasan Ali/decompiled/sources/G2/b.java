package G2;

import E2.j;
import E2.o;
import u2.C2498m;
import x2.C2643a;

/* loaded from: classes.dex */
public final class b implements f {

    /* renamed from: a, reason: collision with root package name */
    public final C2498m f1978a;

    /* renamed from: b, reason: collision with root package name */
    public final j f1979b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1980c;

    public b(C2498m c2498m, j jVar, int i) {
        this.f1978a = c2498m;
        this.f1979b = jVar;
        this.f1980c = i;
        if (i <= 0) {
            throw new IllegalArgumentException("durationMillis must be > 0.");
        }
    }

    @Override // G2.f
    public final void a() {
        this.f1978a.getClass();
        j jVar = this.f1979b;
        boolean z3 = jVar instanceof o;
        new C2643a(jVar.a(), jVar.b().f1457w, this.f1980c, (z3 && ((o) jVar).f1482g) ? false : true);
        if (!z3 && !(jVar instanceof E2.e)) {
            throw new D2.e();
        }
    }
}
