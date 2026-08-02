package S9;

import B0.C2454a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f26049a;

    /* renamed from: b, reason: collision with root package name */
    private final int f26050b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final AbstractC0516a f26051c;

    /* renamed from: S9.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0516a {

        /* renamed from: S9.a$a$a, reason: collision with other inner class name */
        public static final class C0517a extends AbstractC0516a {

            /* renamed from: a, reason: collision with root package name */
            private final boolean f26052a;

            public C0517a(boolean z11) {
                super(0);
                this.f26052a = z11;
            }

            public final boolean a() {
                return this.f26052a;
            }
        }

        /* renamed from: S9.a$a$b */
        public static final class b extends AbstractC0516a {

            /* renamed from: a, reason: collision with root package name */
            private final boolean f26053a;

            public b(boolean z11) {
                super(0);
                this.f26053a = z11;
            }

            public final boolean a() {
                return this.f26053a;
            }
        }

        public AbstractC0516a(int i11) {
        }
    }

    public a(@NotNull String string, int i11, @NotNull AbstractC0516a caretGravity) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(caretGravity, "caretGravity");
        this.f26049a = string;
        this.f26050b = i11;
        this.f26051c = caretGravity;
    }

    @NotNull
    public final AbstractC0516a a() {
        return this.f26051c;
    }

    public final int b() {
        return this.f26050b;
    }

    @NotNull
    public final String c() {
        return this.f26049a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f26049a, aVar.f26049a) && this.f26050b == aVar.f26050b && Intrinsics.d(this.f26051c, aVar.f26051c);
    }

    public final int hashCode() {
        return this.f26051c.hashCode() + C2454a.a(this.f26050b, this.f26049a.hashCode() * 31, 31);
    }

    @NotNull
    public final String toString() {
        return "CaretString(string=" + this.f26049a + ", caretPosition=" + this.f26050b + ", caretGravity=" + this.f26051c + ')';
    }
}
