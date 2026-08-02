package Vb;

/* loaded from: classes9.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final Ub.p<a> f28492a = Ub.p.c("list-item-type");

    /* renamed from: b, reason: collision with root package name */
    public static final Ub.p<Integer> f28493b = Ub.p.c("bullet-list-item-level");

    /* renamed from: c, reason: collision with root package name */
    public static final Ub.p<Integer> f28494c = Ub.p.c("ordered-list-item-number");

    /* renamed from: d, reason: collision with root package name */
    public static final Ub.p<Integer> f28495d = Ub.p.c("heading-level");

    /* renamed from: e, reason: collision with root package name */
    public static final Ub.p<String> f28496e = Ub.p.c("link-destination");

    /* renamed from: f, reason: collision with root package name */
    public static final Ub.p<Boolean> f28497f = Ub.p.c("paragraph-is-in-tight-list");

    /* renamed from: g, reason: collision with root package name */
    public static final Ub.p<String> f28498g = Ub.p.c("code-block-info");

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a BULLET;
        public static final a ORDERED;

        static {
            a aVar = new a("BULLET", 0);
            BULLET = aVar;
            a aVar2 = new a("ORDERED", 1);
            ORDERED = aVar2;
            $VALUES = new a[]{aVar, aVar2};
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
}
