package F8;

import u8.d;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final F8.a f9145a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private F8.a f9146a = null;

        a() {
        }

        public final b a() {
            return new b(this.f9146a);
        }

        public final void b(F8.a aVar) {
            this.f9146a = aVar;
        }
    }

    static {
        new a().a();
    }

    b(F8.a aVar) {
        this.f9145a = aVar;
    }

    public static a b() {
        return new a();
    }

    @d
    public final F8.a a() {
        return this.f9145a;
    }
}
