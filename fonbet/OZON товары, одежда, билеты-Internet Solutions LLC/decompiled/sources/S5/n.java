package S5;

/* loaded from: classes8.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    public static final n f25836b;

    /* renamed from: c, reason: collision with root package name */
    public static final n f25837c;

    /* renamed from: a, reason: collision with root package name */
    private b f25838a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private b f25839a;

        public final void b() {
            this.f25839a = b.CACHE_ALL;
        }

        public final void c() {
            this.f25839a = b.CACHE_AUTO;
        }

        public final void d() {
            this.f25839a = b.CACHE_NONE;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b CACHE_ALL;
        public static final b CACHE_AUTO;
        public static final b CACHE_LIMITED;
        public static final b CACHE_NONE;

        static {
            b bVar = new b("CACHE_NONE", 0);
            CACHE_NONE = bVar;
            b bVar2 = new b("CACHE_LIMITED", 1);
            CACHE_LIMITED = bVar2;
            b bVar3 = new b("CACHE_AUTO", 2);
            CACHE_AUTO = bVar3;
            b bVar4 = new b("CACHE_ALL", 3);
            CACHE_ALL = bVar4;
            $VALUES = new b[]{bVar, bVar2, bVar3, bVar4};
        }

        private b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    static {
        a aVar = new a();
        aVar.d();
        f25836b = new n(aVar);
        a aVar2 = new a();
        aVar2.c();
        f25837c = new n(aVar2);
        a aVar3 = new a();
        aVar3.b();
        new n(aVar3);
    }

    n(a aVar) {
        this.f25838a = aVar.f25839a;
    }

    public final boolean a() {
        return this.f25838a == b.CACHE_ALL;
    }

    public final boolean b() {
        return this.f25838a == b.CACHE_NONE;
    }
}
