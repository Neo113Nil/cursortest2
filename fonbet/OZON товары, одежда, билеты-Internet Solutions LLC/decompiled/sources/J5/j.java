package J5;

/* loaded from: classes8.dex */
public final class j implements c {

    /* renamed from: a, reason: collision with root package name */
    private final a f14031a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f14032b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a ADD;
        public static final a EXCLUDE_INTERSECTIONS;
        public static final a INTERSECT;
        public static final a MERGE;
        public static final a SUBTRACT;

        static {
            a aVar = new a("MERGE", 0);
            MERGE = aVar;
            a aVar2 = new a("ADD", 1);
            ADD = aVar2;
            a aVar3 = new a("SUBTRACT", 2);
            SUBTRACT = aVar3;
            a aVar4 = new a("INTERSECT", 3);
            INTERSECT = aVar4;
            a aVar5 = new a("EXCLUDE_INTERSECTIONS", 4);
            EXCLUDE_INTERSECTIONS = aVar5;
            $VALUES = new a[]{aVar, aVar2, aVar3, aVar4, aVar5};
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

    public j(String str, a aVar, boolean z11) {
        this.f14031a = aVar;
        this.f14032b = z11;
    }

    @Override // J5.c
    public final D5.c a(com.airbnb.lottie.g gVar, B5.g gVar2, K5.b bVar) {
        if (gVar.n()) {
            return new D5.l(this);
        }
        O5.c.c("Animation contains merge paths but they are disabled.");
        return null;
    }

    public final a b() {
        return this.f14031a;
    }

    public final boolean c() {
        return this.f14032b;
    }

    public final String toString() {
        return "MergePaths{mode=" + this.f14031a + '}';
    }
}
