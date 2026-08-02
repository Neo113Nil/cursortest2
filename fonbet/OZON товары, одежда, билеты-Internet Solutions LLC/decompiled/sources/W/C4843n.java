package W;

import W.u0;
import android.util.Range;
import androidx.annotation.NonNull;

/* renamed from: W.n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C4843n extends u0 {

    /* renamed from: d, reason: collision with root package name */
    private final A f33093d;

    /* renamed from: e, reason: collision with root package name */
    private final Range<Integer> f33094e;

    /* renamed from: f, reason: collision with root package name */
    private final Range<Integer> f33095f;

    /* renamed from: g, reason: collision with root package name */
    private final int f33096g;

    /* renamed from: W.n$a */
    static final class a extends u0.a {

        /* renamed from: a, reason: collision with root package name */
        private A f33097a;

        /* renamed from: b, reason: collision with root package name */
        private Range<Integer> f33098b;

        /* renamed from: c, reason: collision with root package name */
        private Range<Integer> f33099c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f33100d;

        a(u0 u0Var) {
            this.f33097a = u0Var.d();
            this.f33098b = u0Var.c();
            this.f33099c = u0Var.b();
            this.f33100d = Integer.valueOf(u0Var.a());
        }

        @Override // W.u0.a
        public final u0 a() {
            String str = this.f33097a == null ? " qualitySelector" : "";
            if (this.f33098b == null) {
                str = str.concat(" frameRate");
            }
            if (this.f33099c == null) {
                str = U7.d.e(str, " bitrate");
            }
            if (this.f33100d == null) {
                str = U7.d.e(str, " aspectRatio");
            }
            if (str.isEmpty()) {
                return new C4843n(this.f33097a, this.f33098b, this.f33099c, this.f33100d.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // W.u0.a
        final u0.a b(int i11) {
            this.f33100d = Integer.valueOf(i11);
            return this;
        }

        @Override // W.u0.a
        public final u0.a c(A a11) {
            if (a11 == null) {
                throw new NullPointerException("Null qualitySelector");
            }
            this.f33097a = a11;
            return this;
        }

        public final u0.a d(Range<Integer> range) {
            if (range == null) {
                throw new NullPointerException("Null bitrate");
            }
            this.f33099c = range;
            return this;
        }

        public final u0.a e(Range<Integer> range) {
            if (range == null) {
                throw new NullPointerException("Null frameRate");
            }
            this.f33098b = range;
            return this;
        }
    }

    C4843n(A a11, Range range, Range range2, int i11) {
        this.f33093d = a11;
        this.f33094e = range;
        this.f33095f = range2;
        this.f33096g = i11;
    }

    @Override // W.u0
    final int a() {
        return this.f33096g;
    }

    @Override // W.u0
    @NonNull
    public final Range<Integer> b() {
        return this.f33095f;
    }

    @Override // W.u0
    @NonNull
    public final Range<Integer> c() {
        return this.f33094e;
    }

    @Override // W.u0
    @NonNull
    public final A d() {
        return this.f33093d;
    }

    @Override // W.u0
    public final u0.a e() {
        return new a(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return this.f33093d.equals(u0Var.d()) && this.f33094e.equals(u0Var.c()) && this.f33095f.equals(u0Var.b()) && this.f33096g == u0Var.a();
    }

    public final int hashCode() {
        return ((((((this.f33093d.hashCode() ^ 1000003) * 1000003) ^ this.f33094e.hashCode()) * 1000003) ^ this.f33095f.hashCode()) * 1000003) ^ this.f33096g;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VideoSpec{qualitySelector=");
        sb2.append(this.f33093d);
        sb2.append(", frameRate=");
        sb2.append(this.f33094e);
        sb2.append(", bitrate=");
        sb2.append(this.f33095f);
        sb2.append(", aspectRatio=");
        return K00.b.e(this.f33096g, "}", sb2);
    }
}
