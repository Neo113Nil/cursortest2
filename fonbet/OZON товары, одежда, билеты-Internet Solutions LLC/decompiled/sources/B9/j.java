package B9;

import o9.C8659a;

/* loaded from: classes9.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    private final C8659a f3076a;

    /* renamed from: b, reason: collision with root package name */
    private final s f3077b;

    j(C8659a c8659a) {
        this.f3076a = c8659a;
        this.f3077b = new s(c8659a);
    }

    public static j a(C8659a c8659a) {
        if (c8659a.f(1)) {
            return new g(c8659a);
        }
        if (!c8659a.f(2)) {
            return new k(c8659a);
        }
        int d11 = s.d(1, 4, c8659a);
        if (d11 == 4) {
            return new a(c8659a);
        }
        if (d11 == 5) {
            return new b(c8659a);
        }
        int d12 = s.d(1, 5, c8659a);
        if (d12 == 12) {
            return new c(c8659a);
        }
        if (d12 == 13) {
            return new d(c8659a);
        }
        switch (s.d(1, 7, c8659a)) {
            case 56:
                return new e(c8659a, "310", "11");
            case 57:
                return new e(c8659a, "320", "11");
            case 58:
                return new e(c8659a, "310", "13");
            case 59:
                return new e(c8659a, "320", "13");
            case 60:
                return new e(c8659a, "310", "15");
            case 61:
                return new e(c8659a, "320", "15");
            case 62:
                return new e(c8659a, "310", "17");
            case 63:
                return new e(c8659a, "320", "17");
            default:
                throw new IllegalStateException("unknown decoder: ".concat(String.valueOf(c8659a)));
        }
    }

    protected final s b() {
        return this.f3077b;
    }

    protected final C8659a c() {
        return this.f3076a;
    }

    public abstract String d() throws h9.m, h9.h;
}
