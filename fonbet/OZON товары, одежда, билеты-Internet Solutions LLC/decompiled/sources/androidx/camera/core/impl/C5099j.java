package androidx.camera.core.impl;

import androidx.annotation.NonNull;

/* renamed from: androidx.camera.core.impl.j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5099j extends C0 {

    /* renamed from: a, reason: collision with root package name */
    private final B0 f38326a;

    /* renamed from: b, reason: collision with root package name */
    private final B0 f38327b;

    /* renamed from: c, reason: collision with root package name */
    private final B0 f38328c;

    /* renamed from: d, reason: collision with root package name */
    private final B0 f38329d;

    C5099j(B0 b02, B0 b03, B0 b04, B0 b05) {
        if (b02 == null) {
            throw new NullPointerException("Null previewOutputSurface");
        }
        this.f38326a = b02;
        if (b03 == null) {
            throw new NullPointerException("Null imageCaptureOutputSurface");
        }
        this.f38327b = b03;
        this.f38328c = b04;
        this.f38329d = b05;
    }

    @Override // androidx.camera.core.impl.C0
    public final B0 b() {
        return this.f38328c;
    }

    @Override // androidx.camera.core.impl.C0
    @NonNull
    public final B0 c() {
        return this.f38327b;
    }

    @Override // androidx.camera.core.impl.C0
    public final B0 d() {
        return this.f38329d;
    }

    @Override // androidx.camera.core.impl.C0
    @NonNull
    public final B0 e() {
        return this.f38326a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0)) {
            return false;
        }
        C0 c02 = (C0) obj;
        if (!this.f38326a.equals(c02.e()) || !this.f38327b.equals(c02.c())) {
            return false;
        }
        B0 b02 = this.f38328c;
        if (b02 == null) {
            if (c02.b() != null) {
                return false;
            }
        } else if (!b02.equals(c02.b())) {
            return false;
        }
        B0 b03 = this.f38329d;
        return b03 == null ? c02.d() == null : b03.equals(c02.d());
    }

    public final int hashCode() {
        int hashCode = (((this.f38326a.hashCode() ^ 1000003) * 1000003) ^ this.f38327b.hashCode()) * 1000003;
        B0 b02 = this.f38328c;
        int hashCode2 = (hashCode ^ (b02 == null ? 0 : b02.hashCode())) * 1000003;
        B0 b03 = this.f38329d;
        return hashCode2 ^ (b03 != null ? b03.hashCode() : 0);
    }

    public final String toString() {
        return "OutputSurfaceConfiguration{previewOutputSurface=" + this.f38326a + ", imageCaptureOutputSurface=" + this.f38327b + ", imageAnalysisOutputSurface=" + this.f38328c + ", postviewOutputSurface=" + this.f38329d + "}";
    }
}
