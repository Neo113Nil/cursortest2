package T7;

import java.util.Objects;

/* loaded from: classes.dex */
public final class H extends AbstractC4021c {

    /* renamed from: a, reason: collision with root package name */
    private final String f26722a;

    /* renamed from: b, reason: collision with root package name */
    private final a f26723b;

    /* loaded from: classes9.dex */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f26724b = new a("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final a f26725c = new a("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        private final String f26726a;

        private a(String str) {
            this.f26726a = str;
        }

        public final String toString() {
            return this.f26726a;
        }
    }

    private H(String str, a aVar) {
        this.f26722a = str;
        this.f26723b = aVar;
    }

    public static H b(String str, a aVar) {
        return new H(str, aVar);
    }

    @Override // S7.q
    public final boolean a() {
        return this.f26723b != a.f26725c;
    }

    public final String c() {
        return this.f26722a;
    }

    public final a d() {
        return this.f26723b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof H)) {
            return false;
        }
        H h11 = (H) obj;
        return h11.f26722a.equals(this.f26722a) && h11.f26723b.equals(this.f26723b);
    }

    public final int hashCode() {
        return Objects.hash(H.class, this.f26722a, this.f26723b);
    }

    public final String toString() {
        return "LegacyKmsAead Parameters (keyUri: " + this.f26722a + ", variant: " + this.f26723b + ")";
    }
}
