package D9;

/* loaded from: classes9.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    private final int f6173a;

    /* renamed from: b, reason: collision with root package name */
    private final int f6174b;

    /* renamed from: c, reason: collision with root package name */
    private final int f6175c;

    /* renamed from: d, reason: collision with root package name */
    private final int f6176d;

    /* renamed from: e, reason: collision with root package name */
    private int f6177e = -1;

    d(int i11, int i12, int i13, int i14) {
        this.f6173a = i11;
        this.f6174b = i12;
        this.f6175c = i13;
        this.f6176d = i14;
    }

    final int a() {
        return this.f6175c;
    }

    final int b() {
        return this.f6174b;
    }

    final int c() {
        return this.f6177e;
    }

    final int d() {
        return this.f6173a;
    }

    final int e() {
        return this.f6176d;
    }

    final int f() {
        return this.f6174b - this.f6173a;
    }

    final boolean g() {
        return h(this.f6177e);
    }

    final boolean h(int i11) {
        if (i11 != -1) {
            return this.f6175c == (i11 % 3) * 3;
        }
        return false;
    }

    final void i(int i11) {
        this.f6177e = i11;
    }

    final void j() {
        this.f6177e = (this.f6175c / 3) + ((this.f6176d / 30) * 3);
    }

    public final String toString() {
        return this.f6177e + "|" + this.f6176d;
    }
}
