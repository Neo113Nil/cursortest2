package B9;

/* loaded from: classes9.dex */
final class o extends q {

    /* renamed from: b, reason: collision with root package name */
    private final String f3083b;

    /* renamed from: c, reason: collision with root package name */
    private final int f3084c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f3085d;

    o(int i11, String str) {
        super(i11);
        this.f3083b = str;
        this.f3085d = false;
        this.f3084c = 0;
    }

    final String b() {
        return this.f3083b;
    }

    final int c() {
        return this.f3084c;
    }

    final boolean d() {
        return this.f3085d;
    }

    o(int i11, String str, int i12) {
        super(i11);
        this.f3085d = true;
        this.f3084c = i12;
        this.f3083b = str;
    }
}
