package O9;

/* loaded from: classes9.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private int f20111a = -1;

    /* renamed from: b, reason: collision with root package name */
    private a f20112b = a.AUTO;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a AUTO;
        public static final a CONTINUOUS;
        public static final a INFINITY;
        public static final a MACRO;

        static {
            a aVar = new a("AUTO", 0);
            AUTO = aVar;
            a aVar2 = new a("CONTINUOUS", 1);
            CONTINUOUS = aVar2;
            a aVar3 = new a("INFINITY", 2);
            INFINITY = aVar3;
            a aVar4 = new a("MACRO", 3);
            MACRO = aVar4;
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

    public final a a() {
        return this.f20112b;
    }

    public final int b() {
        return this.f20111a;
    }

    public final void c(int i11) {
        this.f20111a = i11;
    }
}
