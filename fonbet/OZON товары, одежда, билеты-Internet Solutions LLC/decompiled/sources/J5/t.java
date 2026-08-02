package J5;

import D5.u;

/* loaded from: classes8.dex */
public final class t implements c {

    /* renamed from: a, reason: collision with root package name */
    private final a f14083a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.b f14084b;

    /* renamed from: c, reason: collision with root package name */
    private final I5.b f14085c;

    /* renamed from: d, reason: collision with root package name */
    private final I5.b f14086d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f14087e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a INDIVIDUALLY;
        public static final a SIMULTANEOUSLY;

        static {
            a aVar = new a("SIMULTANEOUSLY", 0);
            SIMULTANEOUSLY = aVar;
            a aVar2 = new a("INDIVIDUALLY", 1);
            INDIVIDUALLY = aVar2;
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

    public t(String str, a aVar, I5.b bVar, I5.b bVar2, I5.b bVar3, boolean z11) {
        this.f14083a = aVar;
        this.f14084b = bVar;
        this.f14085c = bVar2;
        this.f14086d = bVar3;
        this.f14087e = z11;
    }

    @Override // J5.c
    public final D5.c a(com.airbnb.lottie.g gVar, B5.g gVar2, K5.b bVar) {
        return new u(bVar, this);
    }

    public final I5.b b() {
        return this.f14085c;
    }

    public final I5.b c() {
        return this.f14086d;
    }

    public final I5.b d() {
        return this.f14084b;
    }

    public final a e() {
        return this.f14083a;
    }

    public final boolean f() {
        return this.f14087e;
    }

    public final String toString() {
        return "Trim Path: {start: " + this.f14084b + ", end: " + this.f14085c + ", offset: " + this.f14086d + "}";
    }
}
