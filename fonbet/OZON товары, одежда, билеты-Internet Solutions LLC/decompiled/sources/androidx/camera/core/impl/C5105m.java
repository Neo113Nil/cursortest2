package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.T0;

/* renamed from: androidx.camera.core.impl.m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5105m extends T0 {

    /* renamed from: b, reason: collision with root package name */
    private final Size f38353b;

    /* renamed from: c, reason: collision with root package name */
    private final C.A f38354c;

    /* renamed from: d, reason: collision with root package name */
    private final Range<Integer> f38355d;

    /* renamed from: e, reason: collision with root package name */
    private final T f38356e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f38357f;

    /* renamed from: androidx.camera.core.impl.m$a */
    static final class a extends T0.a {

        /* renamed from: a, reason: collision with root package name */
        private Size f38358a;

        /* renamed from: b, reason: collision with root package name */
        private C.A f38359b;

        /* renamed from: c, reason: collision with root package name */
        private Range<Integer> f38360c;

        /* renamed from: d, reason: collision with root package name */
        private T f38361d;

        /* renamed from: e, reason: collision with root package name */
        private Boolean f38362e;

        a(T0 t02) {
            this.f38358a = t02.e();
            this.f38359b = t02.b();
            this.f38360c = t02.c();
            this.f38361d = t02.d();
            this.f38362e = Boolean.valueOf(t02.f());
        }

        @Override // androidx.camera.core.impl.T0.a
        public final T0 a() {
            String str = this.f38358a == null ? " resolution" : "";
            if (this.f38359b == null) {
                str = str.concat(" dynamicRange");
            }
            if (this.f38360c == null) {
                str = U7.d.e(str, " expectedFrameRateRange");
            }
            if (this.f38362e == null) {
                str = U7.d.e(str, " zslDisabled");
            }
            if (str.isEmpty()) {
                return new C5105m(this.f38358a, this.f38359b, this.f38360c, this.f38361d, this.f38362e.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // androidx.camera.core.impl.T0.a
        public final T0.a b(C.A a11) {
            if (a11 == null) {
                throw new NullPointerException("Null dynamicRange");
            }
            this.f38359b = a11;
            return this;
        }

        @Override // androidx.camera.core.impl.T0.a
        public final T0.a c(Range<Integer> range) {
            if (range == null) {
                throw new NullPointerException("Null expectedFrameRateRange");
            }
            this.f38360c = range;
            return this;
        }

        @Override // androidx.camera.core.impl.T0.a
        public final T0.a d(T t2) {
            this.f38361d = t2;
            return this;
        }

        @Override // androidx.camera.core.impl.T0.a
        public final T0.a e(Size size) {
            if (size == null) {
                throw new NullPointerException("Null resolution");
            }
            this.f38358a = size;
            return this;
        }

        @Override // androidx.camera.core.impl.T0.a
        public final T0.a f(boolean z11) {
            this.f38362e = Boolean.valueOf(z11);
            return this;
        }
    }

    C5105m(Size size, C.A a11, Range range, T t2, boolean z11) {
        this.f38353b = size;
        this.f38354c = a11;
        this.f38355d = range;
        this.f38356e = t2;
        this.f38357f = z11;
    }

    @Override // androidx.camera.core.impl.T0
    @NonNull
    public final C.A b() {
        return this.f38354c;
    }

    @Override // androidx.camera.core.impl.T0
    @NonNull
    public final Range<Integer> c() {
        return this.f38355d;
    }

    @Override // androidx.camera.core.impl.T0
    public final T d() {
        return this.f38356e;
    }

    @Override // androidx.camera.core.impl.T0
    @NonNull
    public final Size e() {
        return this.f38353b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof T0)) {
            return false;
        }
        T0 t02 = (T0) obj;
        if (!this.f38353b.equals(t02.e()) || !this.f38354c.equals(t02.b()) || !this.f38355d.equals(t02.c())) {
            return false;
        }
        T t2 = this.f38356e;
        if (t2 == null) {
            if (t02.d() != null) {
                return false;
            }
        } else if (!t2.equals(t02.d())) {
            return false;
        }
        return this.f38357f == t02.f();
    }

    @Override // androidx.camera.core.impl.T0
    public final boolean f() {
        return this.f38357f;
    }

    @Override // androidx.camera.core.impl.T0
    public final T0.a g() {
        return new a(this);
    }

    public final int hashCode() {
        int hashCode = (((((this.f38353b.hashCode() ^ 1000003) * 1000003) ^ this.f38354c.hashCode()) * 1000003) ^ this.f38355d.hashCode()) * 1000003;
        T t2 = this.f38356e;
        return ((hashCode ^ (t2 == null ? 0 : t2.hashCode())) * 1000003) ^ (this.f38357f ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StreamSpec{resolution=");
        sb2.append(this.f38353b);
        sb2.append(", dynamicRange=");
        sb2.append(this.f38354c);
        sb2.append(", expectedFrameRateRange=");
        sb2.append(this.f38355d);
        sb2.append(", implementationOptions=");
        sb2.append(this.f38356e);
        sb2.append(", zslDisabled=");
        return Pk0.a.a("}", sb2, this.f38357f);
    }
}
