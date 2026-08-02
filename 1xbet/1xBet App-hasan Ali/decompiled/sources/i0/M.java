package i0;

import android.graphics.Shader;

/* loaded from: classes.dex */
public final class M extends F {

    /* renamed from: e, reason: collision with root package name */
    public final long f17262e;

    public M(long j5) {
        this.f17262e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof M) {
            return p.c(this.f17262e, ((M) obj).f17262e);
        }
        return false;
    }

    @Override // i0.F
    public final void h(float f, long j5, J2.b bVar) {
        bVar.c(1.0f);
        long j6 = this.f17262e;
        if (f != 1.0f) {
            j6 = p.b(p.d(j6) * f, j6);
        }
        bVar.e(j6);
        if (((Shader) bVar.f2697d) != null) {
            bVar.h(null);
        }
    }

    public final int hashCode() {
        return p.i(this.f17262e);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) p.j(this.f17262e)) + ')';
    }
}
