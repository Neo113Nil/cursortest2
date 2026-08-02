package M3;

/* loaded from: classes8.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    public final a f17302a;

    /* renamed from: b, reason: collision with root package name */
    public final a f17303b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17304c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f17305d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final b[] f17306a;

        public a(b... bVarArr) {
            this.f17306a = bVarArr;
        }

        public final b a() {
            return this.f17306a[0];
        }

        public final int b() {
            return this.f17306a.length;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f17307a;

        /* renamed from: b, reason: collision with root package name */
        public final int f17308b;

        /* renamed from: c, reason: collision with root package name */
        public final float[] f17309c;

        /* renamed from: d, reason: collision with root package name */
        public final float[] f17310d;

        public b(int i11, int i12, float[] fArr, float[] fArr2) {
            this.f17307a = i11;
            G10.a.c(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.f17309c = fArr;
            this.f17310d = fArr2;
            this.f17308b = i12;
        }
    }

    public e(a aVar, a aVar2, int i11) {
        this.f17302a = aVar;
        this.f17303b = aVar2;
        this.f17304c = i11;
        this.f17305d = aVar == aVar2;
    }
}
