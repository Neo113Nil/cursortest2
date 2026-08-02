package J5;

/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final a f14027a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.h f14028b;

    /* renamed from: c, reason: collision with root package name */
    private final I5.d f14029c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f14030d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes.dex */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a MASK_MODE_ADD;
        public static final a MASK_MODE_INTERSECT;
        public static final a MASK_MODE_NONE;
        public static final a MASK_MODE_SUBTRACT;

        static {
            a aVar = new a("MASK_MODE_ADD", 0);
            MASK_MODE_ADD = aVar;
            a aVar2 = new a("MASK_MODE_SUBTRACT", 1);
            MASK_MODE_SUBTRACT = aVar2;
            a aVar3 = new a("MASK_MODE_INTERSECT", 2);
            MASK_MODE_INTERSECT = aVar3;
            a aVar4 = new a("MASK_MODE_NONE", 3);
            MASK_MODE_NONE = aVar4;
            $VALUES = new a[]{aVar, aVar2, aVar3, aVar4};
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

    public i(a aVar, I5.h hVar, I5.d dVar, boolean z11) {
        this.f14027a = aVar;
        this.f14028b = hVar;
        this.f14029c = dVar;
        this.f14030d = z11;
    }

    public final a a() {
        return this.f14027a;
    }

    public final I5.h b() {
        return this.f14028b;
    }

    public final I5.d c() {
        return this.f14029c;
    }

    public final boolean d() {
        return this.f14030d;
    }
}
