package i0;

import android.graphics.Paint;
import android.graphics.Shader;
import e2.C1930k;
import h0.C1991e;

/* loaded from: classes.dex */
public abstract class H extends F {

    /* renamed from: e, reason: collision with root package name */
    public C1930k f17243e;
    public long f = 9205357640488583168L;

    public abstract Shader B(long j5);

    @Override // i0.F
    public final void h(float f, long j5, J2.b bVar) {
        C1930k c1930k = this.f17243e;
        if (c1930k == null || !C1991e.a(this.f, j5)) {
            if (C1991e.e(j5)) {
                this.f17243e = null;
                this.f = 9205357640488583168L;
                c1930k = null;
            } else {
                c1930k = this.f17243e;
                if (c1930k == null) {
                    c1930k = new C1930k(27, false);
                    this.f17243e = c1930k;
                }
                c1930k.f16910l = B(j5);
                this.f17243e = c1930k;
                this.f = j5;
            }
        }
        long c5 = F.c(((Paint) bVar.f2696c).getColor());
        long j6 = p.f17289b;
        if (!p.c(c5, j6)) {
            bVar.e(j6);
        }
        if (!kotlin.jvm.internal.l.a((Shader) bVar.f2697d, c1930k != null ? (Shader) c1930k.f16910l : null)) {
            bVar.h(c1930k != null ? (Shader) c1930k.f16910l : null);
        }
        if (((Paint) bVar.f2696c).getAlpha() / 255.0f == f) {
            return;
        }
        bVar.c(f);
    }
}
