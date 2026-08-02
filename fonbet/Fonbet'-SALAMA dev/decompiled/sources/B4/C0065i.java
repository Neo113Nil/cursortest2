package B4;

/* renamed from: B4.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0065i {

    /* renamed from: a, reason: collision with root package name */
    public final int f1162a;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f1163b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1164c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1165d;

    public C0065i(a0 a0Var, int i7, int i8, int i9) {
        this.f1162a = i7;
        this.f1163b = a0Var;
        this.f1164c = i8;
        this.f1165d = i9;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0065i)) {
            return false;
        }
        C0065i c0065i = (C0065i) obj;
        return t.e.b(this.f1162a, c0065i.f1162a) && this.f1163b.equals(c0065i.f1163b) && this.f1164c == c0065i.f1164c && this.f1165d == c0065i.f1165d;
    }

    public final int hashCode() {
        return ((((this.f1163b.hashCode() + (t.e.e(this.f1162a) * 31)) * 31) + this.f1164c) * 31) + this.f1165d;
    }
}
