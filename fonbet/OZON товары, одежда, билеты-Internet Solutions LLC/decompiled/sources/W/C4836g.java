package W;

import W.AbstractC4847s;
import androidx.annotation.NonNull;

/* renamed from: W.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C4836g extends AbstractC4847s {

    /* renamed from: a, reason: collision with root package name */
    private final u0 f33057a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC4830a f33058b;

    /* renamed from: c, reason: collision with root package name */
    private final int f33059c;

    /* renamed from: W.g$a */
    static final class a extends AbstractC4847s.a {

        /* renamed from: a, reason: collision with root package name */
        private u0 f33060a;

        /* renamed from: b, reason: collision with root package name */
        private AbstractC4830a f33061b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f33062c;

        a(AbstractC4847s abstractC4847s) {
            this.f33060a = abstractC4847s.c();
            this.f33061b = abstractC4847s.a();
            this.f33062c = Integer.valueOf(abstractC4847s.b());
        }

        @Override // W.AbstractC4847s.a
        public final AbstractC4847s a() {
            String str = this.f33060a == null ? " videoSpec" : "";
            if (this.f33061b == null) {
                str = str.concat(" audioSpec");
            }
            if (this.f33062c == null) {
                str = U7.d.e(str, " outputFormat");
            }
            if (str.isEmpty()) {
                return new C4836g(this.f33060a, this.f33061b, this.f33062c.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // W.AbstractC4847s.a
        final u0 b() {
            u0 u0Var = this.f33060a;
            if (u0Var != null) {
                return u0Var;
            }
            throw new IllegalStateException("Property \"videoSpec\" has not been set");
        }

        @Override // W.AbstractC4847s.a
        public final AbstractC4847s.a c(u0 u0Var) {
            if (u0Var == null) {
                throw new NullPointerException("Null videoSpec");
            }
            this.f33060a = u0Var;
            return this;
        }

        public final AbstractC4847s.a d(AbstractC4830a abstractC4830a) {
            this.f33061b = abstractC4830a;
            return this;
        }

        public final AbstractC4847s.a e() {
            this.f33062c = -1;
            return this;
        }
    }

    C4836g(u0 u0Var, AbstractC4830a abstractC4830a, int i11) {
        this.f33057a = u0Var;
        this.f33058b = abstractC4830a;
        this.f33059c = i11;
    }

    @Override // W.AbstractC4847s
    @NonNull
    public final AbstractC4830a a() {
        return this.f33058b;
    }

    @Override // W.AbstractC4847s
    public final int b() {
        return this.f33059c;
    }

    @Override // W.AbstractC4847s
    @NonNull
    public final u0 c() {
        return this.f33057a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4847s)) {
            return false;
        }
        AbstractC4847s abstractC4847s = (AbstractC4847s) obj;
        return this.f33057a.equals(abstractC4847s.c()) && this.f33058b.equals(abstractC4847s.a()) && this.f33059c == abstractC4847s.b();
    }

    public final int hashCode() {
        return ((((this.f33057a.hashCode() ^ 1000003) * 1000003) ^ this.f33058b.hashCode()) * 1000003) ^ this.f33059c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MediaSpec{videoSpec=");
        sb2.append(this.f33057a);
        sb2.append(", audioSpec=");
        sb2.append(this.f33058b);
        sb2.append(", outputFormat=");
        return K00.b.e(this.f33059c, "}", sb2);
    }
}
