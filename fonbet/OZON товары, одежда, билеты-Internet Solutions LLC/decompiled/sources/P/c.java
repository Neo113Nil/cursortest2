package P;

import android.opengl.EGLSurface;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
final class c extends g {

    /* renamed from: a, reason: collision with root package name */
    private final EGLSurface f20568a;

    /* renamed from: b, reason: collision with root package name */
    private final int f20569b;

    /* renamed from: c, reason: collision with root package name */
    private final int f20570c;

    c(EGLSurface eGLSurface, int i11, int i12) {
        if (eGLSurface == null) {
            throw new NullPointerException("Null eglSurface");
        }
        this.f20568a = eGLSurface;
        this.f20569b = i11;
        this.f20570c = i12;
    }

    @Override // P.g
    @NonNull
    public final EGLSurface a() {
        return this.f20568a;
    }

    @Override // P.g
    public final int b() {
        return this.f20570c;
    }

    @Override // P.g
    public final int c() {
        return this.f20569b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f20568a.equals(gVar.a()) && this.f20569b == gVar.c() && this.f20570c == gVar.b();
    }

    public final int hashCode() {
        return ((((this.f20568a.hashCode() ^ 1000003) * 1000003) ^ this.f20569b) * 1000003) ^ this.f20570c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OutputSurface{eglSurface=");
        sb2.append(this.f20568a);
        sb2.append(", width=");
        sb2.append(this.f20569b);
        sb2.append(", height=");
        return K00.b.e(this.f20570c, "}", sb2);
    }
}
