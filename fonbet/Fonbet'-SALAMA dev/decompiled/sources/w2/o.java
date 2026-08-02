package w2;

import A1.InterfaceC0027k;

/* loaded from: classes.dex */
public final class o implements InterfaceC0027k {

    /* renamed from: a, reason: collision with root package name */
    public final int f18042a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18043b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18044c;

    /* renamed from: d, reason: collision with root package name */
    public final float f18045d;

    public o(int i7, int i8, int i9, float f7) {
        this.f18042a = i7;
        this.f18043b = i8;
        this.f18044c = i9;
        this.f18045d = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f18042a == oVar.f18042a && this.f18043b == oVar.f18043b && this.f18044c == oVar.f18044c && this.f18045d == oVar.f18045d;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f18045d) + ((((((217 + this.f18042a) * 31) + this.f18043b) * 31) + this.f18044c) * 31);
    }
}
