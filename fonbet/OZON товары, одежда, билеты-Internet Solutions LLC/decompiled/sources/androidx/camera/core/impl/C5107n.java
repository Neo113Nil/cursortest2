package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.V0;

/* renamed from: androidx.camera.core.impl.n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5107n extends V0 {

    /* renamed from: a, reason: collision with root package name */
    private final V0.b f38364a;

    /* renamed from: b, reason: collision with root package name */
    private final V0.a f38365b;

    /* renamed from: c, reason: collision with root package name */
    private final long f38366c;

    C5107n(V0.b bVar, V0.a aVar, long j11) {
        if (bVar == null) {
            throw new NullPointerException("Null configType");
        }
        this.f38364a = bVar;
        if (aVar == null) {
            throw new NullPointerException("Null configSize");
        }
        this.f38365b = aVar;
        this.f38366c = j11;
    }

    @Override // androidx.camera.core.impl.V0
    @NonNull
    public final V0.a c() {
        return this.f38365b;
    }

    @Override // androidx.camera.core.impl.V0
    @NonNull
    public final V0.b d() {
        return this.f38364a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V0)) {
            return false;
        }
        V0 v02 = (V0) obj;
        return this.f38364a.equals(v02.d()) && this.f38365b.equals(v02.c()) && this.f38366c == v02.f();
    }

    @Override // androidx.camera.core.impl.V0
    public final long f() {
        return this.f38366c;
    }

    public final int hashCode() {
        int hashCode = (((this.f38364a.hashCode() ^ 1000003) * 1000003) ^ this.f38365b.hashCode()) * 1000003;
        long j11 = this.f38366c;
        return hashCode ^ ((int) ((j11 >>> 32) ^ j11));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SurfaceConfig{configType=");
        sb2.append(this.f38364a);
        sb2.append(", configSize=");
        sb2.append(this.f38365b);
        sb2.append(", streamUseCase=");
        return P4.f.a(this.f38366c, "}", sb2);
    }
}
