package G2;

import E2.j;
import E2.o;
import android.graphics.drawable.Drawable;
import u2.C2498m;

/* loaded from: classes.dex */
public final class d implements f {

    /* renamed from: a, reason: collision with root package name */
    public final C2498m f1981a;

    /* renamed from: b, reason: collision with root package name */
    public final j f1982b;

    public d(C2498m c2498m, j jVar) {
        this.f1981a = c2498m;
        this.f1982b = jVar;
    }

    @Override // G2.f
    public final void a() {
        j jVar = this.f1982b;
        boolean z3 = jVar instanceof o;
        C2498m c2498m = this.f1981a;
        if (z3) {
            Drawable drawable = ((o) jVar).f1477a;
            c2498m.getClass();
        } else {
            if (!(jVar instanceof E2.e)) {
                throw new D2.e();
            }
            Drawable drawable2 = ((E2.e) jVar).f1418a;
            c2498m.getClass();
        }
    }
}
