package S;

/* loaded from: classes8.dex */
final class a extends e {

    /* renamed from: d, reason: collision with root package name */
    private final int f25175d;

    /* renamed from: e, reason: collision with root package name */
    private final int f25176e;

    /* renamed from: f, reason: collision with root package name */
    private final int f25177f;

    /* renamed from: g, reason: collision with root package name */
    private final String f25178g;

    a(int i11, int i12, int i13, String str) {
        this.f25175d = i11;
        this.f25176e = i12;
        this.f25177f = i13;
        if (str == null) {
            throw new NullPointerException("Null description");
        }
        this.f25178g = str;
    }

    @Override // S.e
    final String b() {
        return this.f25178g;
    }

    @Override // S.e
    public final int c() {
        return this.f25175d;
    }

    @Override // S.e
    final int d() {
        return this.f25176e;
    }

    @Override // S.e
    final int e() {
        return this.f25177f;
    }
}
