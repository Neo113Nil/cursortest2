package androidx.camera.core.impl;

import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;

/* renamed from: androidx.camera.core.impl.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5097i extends B0 {

    /* renamed from: a, reason: collision with root package name */
    private final Surface f38310a;

    /* renamed from: b, reason: collision with root package name */
    private final Size f38311b;

    /* renamed from: c, reason: collision with root package name */
    private final int f38312c;

    C5097i(Surface surface, Size size, int i11) {
        if (surface == null) {
            throw new NullPointerException("Null surface");
        }
        this.f38310a = surface;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f38311b = size;
        this.f38312c = i11;
    }

    @Override // androidx.camera.core.impl.B0
    public final int b() {
        return this.f38312c;
    }

    @Override // androidx.camera.core.impl.B0
    @NonNull
    public final Size c() {
        return this.f38311b;
    }

    @Override // androidx.camera.core.impl.B0
    @NonNull
    public final Surface d() {
        return this.f38310a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B0)) {
            return false;
        }
        B0 b02 = (B0) obj;
        return this.f38310a.equals(b02.d()) && this.f38311b.equals(b02.c()) && this.f38312c == b02.b();
    }

    public final int hashCode() {
        return ((((this.f38310a.hashCode() ^ 1000003) * 1000003) ^ this.f38311b.hashCode()) * 1000003) ^ this.f38312c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OutputSurface{surface=");
        sb2.append(this.f38310a);
        sb2.append(", size=");
        sb2.append(this.f38311b);
        sb2.append(", imageFormat=");
        return K00.b.e(this.f38312c, "}", sb2);
    }
}
