package ag;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final long f36768a;

    /* renamed from: b, reason: collision with root package name */
    private final int f36769b = 0;

    /* renamed from: c, reason: collision with root package name */
    private final float f36770c;

    /* renamed from: d, reason: collision with root package name */
    private final long f36771d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final long f36772a;

        /* renamed from: b, reason: collision with root package name */
        private float f36773b = 0.0f;

        /* renamed from: c, reason: collision with root package name */
        private long f36774c = 0;

        public a(long j11) {
            this.f36772a = j11;
        }

        public final e d() {
            return new e(this);
        }

        public final void e(float f7) {
            this.f36773b = f7;
        }

        public final void f() {
            this.f36774c = 1000L;
        }
    }

    e(a aVar) {
        this.f36768a = aVar.f36772a;
        this.f36770c = aVar.f36773b;
        this.f36771d = aVar.f36774c;
    }

    public final float a() {
        return this.f36770c;
    }

    public final long b() {
        return this.f36768a;
    }

    public final int c() {
        return this.f36769b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (this.f36768a == eVar.f36768a && this.f36769b == eVar.f36769b && Float.compare(eVar.f36770c, this.f36770c) == 0 && this.f36771d == eVar.f36771d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j11 = this.f36768a;
        int i11 = ((((int) (j11 ^ (j11 >>> 32))) * 31) + this.f36769b) * 31;
        float f7 = this.f36770c;
        int floatToIntBits = f7 != 0.0f ? Float.floatToIntBits(f7) : 0;
        long j12 = this.f36771d;
        return ((((i11 + floatToIntBits) * 31) + ((int) 0)) * 31) + ((int) ((j12 >>> 32) ^ j12));
    }
}
