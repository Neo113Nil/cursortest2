package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.O0;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.camera.core.impl.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5101k extends O0.f {

    /* renamed from: a, reason: collision with root package name */
    private final W f38332a;

    /* renamed from: b, reason: collision with root package name */
    private final List<W> f38333b;

    /* renamed from: c, reason: collision with root package name */
    private final int f38334c;

    /* renamed from: d, reason: collision with root package name */
    private final int f38335d;

    /* renamed from: e, reason: collision with root package name */
    private final C.A f38336e;

    /* renamed from: androidx.camera.core.impl.k$a */
    static final class a extends O0.f.a {

        /* renamed from: a, reason: collision with root package name */
        private W f38337a;

        /* renamed from: b, reason: collision with root package name */
        private List<W> f38338b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f38339c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f38340d;

        /* renamed from: e, reason: collision with root package name */
        private C.A f38341e;

        @Override // androidx.camera.core.impl.O0.f.a
        public final O0.f a() {
            String str = this.f38337a == null ? " surface" : "";
            if (this.f38338b == null) {
                str = str.concat(" sharedSurfaces");
            }
            if (this.f38339c == null) {
                str = U7.d.e(str, " mirrorMode");
            }
            if (this.f38340d == null) {
                str = U7.d.e(str, " surfaceGroupId");
            }
            if (this.f38341e == null) {
                str = U7.d.e(str, " dynamicRange");
            }
            if (str.isEmpty()) {
                return new C5101k(this.f38337a, this.f38338b, this.f38339c.intValue(), this.f38340d.intValue(), this.f38341e);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // androidx.camera.core.impl.O0.f.a
        public final O0.f.a b(C.A a11) {
            if (a11 == null) {
                throw new NullPointerException("Null dynamicRange");
            }
            this.f38341e = a11;
            return this;
        }

        @Override // androidx.camera.core.impl.O0.f.a
        public final O0.f.a c(int i11) {
            this.f38339c = Integer.valueOf(i11);
            return this;
        }

        public final O0.f.a d() {
            List<W> list = Collections.EMPTY_LIST;
            if (list == null) {
                throw new NullPointerException("Null sharedSurfaces");
            }
            this.f38338b = list;
            return this;
        }

        public final void e(W w11) {
            if (w11 == null) {
                throw new NullPointerException("Null surface");
            }
            this.f38337a = w11;
        }

        public final O0.f.a f() {
            this.f38340d = -1;
            return this;
        }
    }

    C5101k(W w11, List list, int i11, int i12, C.A a11) {
        this.f38332a = w11;
        this.f38333b = list;
        this.f38334c = i11;
        this.f38335d = i12;
        this.f38336e = a11;
    }

    @Override // androidx.camera.core.impl.O0.f
    @NonNull
    public final C.A b() {
        return this.f38336e;
    }

    @Override // androidx.camera.core.impl.O0.f
    public final int c() {
        return this.f38334c;
    }

    @Override // androidx.camera.core.impl.O0.f
    public final String d() {
        return null;
    }

    @Override // androidx.camera.core.impl.O0.f
    @NonNull
    public final List<W> e() {
        return this.f38333b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof O0.f)) {
            return false;
        }
        O0.f fVar = (O0.f) obj;
        return this.f38332a.equals(fVar.f()) && this.f38333b.equals(fVar.e()) && fVar.d() == null && this.f38334c == fVar.c() && this.f38335d == fVar.g() && this.f38336e.equals(fVar.b());
    }

    @Override // androidx.camera.core.impl.O0.f
    @NonNull
    public final W f() {
        return this.f38332a;
    }

    @Override // androidx.camera.core.impl.O0.f
    public final int g() {
        return this.f38335d;
    }

    public final int hashCode() {
        return ((((((((this.f38332a.hashCode() ^ 1000003) * 1000003) ^ this.f38333b.hashCode()) * (-721379959)) ^ this.f38334c) * 1000003) ^ this.f38335d) * 1000003) ^ this.f38336e.hashCode();
    }

    public final String toString() {
        return "OutputConfig{surface=" + this.f38332a + ", sharedSurfaces=" + this.f38333b + ", physicalCameraId=null, mirrorMode=" + this.f38334c + ", surfaceGroupId=" + this.f38335d + ", dynamicRange=" + this.f38336e + "}";
    }
}
