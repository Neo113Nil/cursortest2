package p156w2;

import A1.InterfaceC0027k;

/* JADX INFO: loaded from: classes.dex */
public final class o implements InterfaceC0027k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f18051d;

    public o(int i7, int i8, int i9, float f7) {
        this.f18048a = i7;
        this.f18049b = i8;
        this.f18050c = i9;
        this.f18051d = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f18048a == oVar.f18048a && this.f18049b == oVar.f18049b && this.f18050c == oVar.f18050c && this.f18051d == oVar.f18051d;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f18051d) + ((((((217 + this.f18048a) * 31) + this.f18049b) * 31) + this.f18050c) * 31);
    }
}
