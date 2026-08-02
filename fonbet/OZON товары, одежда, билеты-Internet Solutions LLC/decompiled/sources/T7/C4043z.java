package T7;

import java.util.Objects;

/* renamed from: T7.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4043z extends AbstractC4021c {

    /* renamed from: a, reason: collision with root package name */
    private final a f26909a;

    /* renamed from: T7.z$a */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f26910b = new a("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final a f26911c = new a("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final a f26912d = new a("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        private final String f26913a;

        private a(String str) {
            this.f26913a = str;
        }

        public final String toString() {
            return this.f26913a;
        }
    }

    private C4043z(a aVar) {
        this.f26909a = aVar;
    }

    public static C4043z b(a aVar) {
        return new C4043z(aVar);
    }

    @Override // S7.q
    public final boolean a() {
        return this.f26909a != a.f26912d;
    }

    public final a c() {
        return this.f26909a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C4043z) && ((C4043z) obj).f26909a == this.f26909a;
    }

    public final int hashCode() {
        return Objects.hash(C4043z.class, this.f26909a);
    }

    public final String toString() {
        return "ChaCha20Poly1305 Parameters (variant: " + this.f26909a + ")";
    }
}
