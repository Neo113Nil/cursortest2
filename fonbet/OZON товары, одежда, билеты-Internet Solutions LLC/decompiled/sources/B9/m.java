package B9;

/* loaded from: classes9.dex */
final class m {

    /* renamed from: a, reason: collision with root package name */
    private int f3080a = 0;

    /* renamed from: b, reason: collision with root package name */
    private a f3081b = a.NUMERIC;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a ALPHA;
        public static final a ISO_IEC_646;
        public static final a NUMERIC;

        static {
            a aVar = new a("NUMERIC", 0);
            NUMERIC = aVar;
            a aVar2 = new a("ALPHA", 1);
            ALPHA = aVar2;
            a aVar3 = new a("ISO_IEC_646", 2);
            ISO_IEC_646 = aVar3;
            $VALUES = new a[]{aVar, aVar2, aVar3};
        }

        private a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    m() {
    }

    final int a() {
        return this.f3080a;
    }

    final void b(int i11) {
        this.f3080a += i11;
    }

    final boolean c() {
        return this.f3081b == a.ALPHA;
    }

    final boolean d() {
        return this.f3081b == a.ISO_IEC_646;
    }

    final void e() {
        this.f3081b = a.ALPHA;
    }

    final void f() {
        this.f3081b = a.ISO_IEC_646;
    }

    final void g() {
        this.f3081b = a.NUMERIC;
    }

    final void h(int i11) {
        this.f3080a = i11;
    }
}
