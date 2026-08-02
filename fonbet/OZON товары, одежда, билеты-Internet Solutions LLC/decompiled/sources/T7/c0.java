package T7;

import java.util.Objects;

/* loaded from: classes.dex */
public final class c0 extends AbstractC4021c {

    /* renamed from: a, reason: collision with root package name */
    private final a f26789a;

    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f26790b = new a("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final a f26791c = new a("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final a f26792d = new a("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        private final String f26793a;

        private a(String str) {
            this.f26793a = str;
        }

        public final String toString() {
            return this.f26793a;
        }
    }

    private c0(a aVar) {
        this.f26789a = aVar;
    }

    public static c0 b(a aVar) {
        return new c0(aVar);
    }

    @Override // S7.q
    public final boolean a() {
        return this.f26789a != a.f26792d;
    }

    public final a c() {
        return this.f26789a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof c0) && ((c0) obj).f26789a == this.f26789a;
    }

    public final int hashCode() {
        return Objects.hash(c0.class, this.f26789a);
    }

    public final String toString() {
        return "XChaCha20Poly1305 Parameters (variant: " + this.f26789a + ")";
    }
}
