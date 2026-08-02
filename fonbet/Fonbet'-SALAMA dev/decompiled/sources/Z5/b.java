package Z5;

import e1.k;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final N6.f f7881d;

    /* renamed from: e, reason: collision with root package name */
    public static final N6.f f7882e;

    /* renamed from: f, reason: collision with root package name */
    public static final N6.f f7883f;

    /* renamed from: g, reason: collision with root package name */
    public static final N6.f f7884g;

    /* renamed from: h, reason: collision with root package name */
    public static final N6.f f7885h;

    /* renamed from: a, reason: collision with root package name */
    public final N6.f f7886a;

    /* renamed from: b, reason: collision with root package name */
    public final N6.f f7887b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7888c;

    static {
        N6.f fVar = N6.f.f4798d;
        f7881d = P6.b.k(":status");
        f7882e = P6.b.k(":method");
        f7883f = P6.b.k(":path");
        f7884g = P6.b.k(":scheme");
        f7885h = P6.b.k(":authority");
        P6.b.k(":host");
        P6.b.k(":version");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(N6.f fVar, String str) {
        this(fVar, P6.b.k(str));
        N6.f fVar2 = N6.f.f4798d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f7886a.equals(bVar.f7886a) && this.f7887b.equals(bVar.f7887b);
    }

    public final int hashCode() {
        return this.f7887b.hashCode() + ((this.f7886a.hashCode() + 527) * 31);
    }

    public final String toString() {
        return k.f(this.f7886a.y(), ": ", this.f7887b.y());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(String str, String str2) {
        this(P6.b.k(str), P6.b.k(str2));
        N6.f fVar = N6.f.f4798d;
    }

    public b(N6.f fVar, N6.f fVar2) {
        this.f7886a = fVar;
        this.f7887b = fVar2;
        this.f7888c = fVar2.b() + fVar.b() + 32;
    }
}
