package B9;

/* loaded from: classes9.dex */
final class p extends q {

    /* renamed from: b, reason: collision with root package name */
    private final int f3086b;

    /* renamed from: c, reason: collision with root package name */
    private final int f3087c;

    p(int i11, int i12, int i13) throws h9.h {
        super(i11);
        if (i12 < 0 || i12 > 10 || i13 < 0 || i13 > 10) {
            throw h9.h.a();
        }
        this.f3086b = i12;
        this.f3087c = i13;
    }

    final int b() {
        return this.f3086b;
    }

    final int c() {
        return this.f3087c;
    }

    final boolean d() {
        return this.f3086b == 10;
    }

    final boolean e() {
        return this.f3087c == 10;
    }
}
