package androidx.camera.core.impl;

import android.util.Size;
import androidx.annotation.NonNull;
import java.util.Map;

/* renamed from: androidx.camera.core.impl.o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5109o extends W0 {

    /* renamed from: a, reason: collision with root package name */
    private final Size f38368a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<Integer, Size> f38369b;

    /* renamed from: c, reason: collision with root package name */
    private final Size f38370c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<Integer, Size> f38371d;

    /* renamed from: e, reason: collision with root package name */
    private final Size f38372e;

    /* renamed from: f, reason: collision with root package name */
    private final Map<Integer, Size> f38373f;

    /* renamed from: g, reason: collision with root package name */
    private final Map<Integer, Size> f38374g;

    C5109o(Size size, Map<Integer, Size> map, Size size2, Map<Integer, Size> map2, Size size3, Map<Integer, Size> map3, Map<Integer, Size> map4) {
        if (size == null) {
            throw new NullPointerException("Null analysisSize");
        }
        this.f38368a = size;
        if (map == null) {
            throw new NullPointerException("Null s720pSizeMap");
        }
        this.f38369b = map;
        if (size2 == null) {
            throw new NullPointerException("Null previewSize");
        }
        this.f38370c = size2;
        if (map2 == null) {
            throw new NullPointerException("Null s1440pSizeMap");
        }
        this.f38371d = map2;
        if (size3 == null) {
            throw new NullPointerException("Null recordSize");
        }
        this.f38372e = size3;
        if (map3 == null) {
            throw new NullPointerException("Null maximumSizeMap");
        }
        this.f38373f = map3;
        if (map4 == null) {
            throw new NullPointerException("Null ultraMaximumSizeMap");
        }
        this.f38374g = map4;
    }

    @Override // androidx.camera.core.impl.W0
    @NonNull
    public final Size b() {
        return this.f38368a;
    }

    @Override // androidx.camera.core.impl.W0
    @NonNull
    public final Map<Integer, Size> c() {
        return this.f38373f;
    }

    @Override // androidx.camera.core.impl.W0
    @NonNull
    public final Size d() {
        return this.f38370c;
    }

    @Override // androidx.camera.core.impl.W0
    @NonNull
    public final Size e() {
        return this.f38372e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof W0)) {
            return false;
        }
        W0 w02 = (W0) obj;
        return this.f38368a.equals(w02.b()) && this.f38369b.equals(w02.g()) && this.f38370c.equals(w02.d()) && this.f38371d.equals(w02.f()) && this.f38372e.equals(w02.e()) && this.f38373f.equals(w02.c()) && this.f38374g.equals(w02.h());
    }

    @Override // androidx.camera.core.impl.W0
    @NonNull
    public final Map<Integer, Size> f() {
        return this.f38371d;
    }

    @Override // androidx.camera.core.impl.W0
    @NonNull
    public final Map<Integer, Size> g() {
        return this.f38369b;
    }

    @Override // androidx.camera.core.impl.W0
    @NonNull
    public final Map<Integer, Size> h() {
        return this.f38374g;
    }

    public final int hashCode() {
        return ((((((((((((this.f38368a.hashCode() ^ 1000003) * 1000003) ^ this.f38369b.hashCode()) * 1000003) ^ this.f38370c.hashCode()) * 1000003) ^ this.f38371d.hashCode()) * 1000003) ^ this.f38372e.hashCode()) * 1000003) ^ this.f38373f.hashCode()) * 1000003) ^ this.f38374g.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SurfaceSizeDefinition{analysisSize=");
        sb2.append(this.f38368a);
        sb2.append(", s720pSizeMap=");
        sb2.append(this.f38369b);
        sb2.append(", previewSize=");
        sb2.append(this.f38370c);
        sb2.append(", s1440pSizeMap=");
        sb2.append(this.f38371d);
        sb2.append(", recordSize=");
        sb2.append(this.f38372e);
        sb2.append(", maximumSizeMap=");
        sb2.append(this.f38373f);
        sb2.append(", ultraMaximumSizeMap=");
        return T7.P.f(sb2, this.f38374g, "}");
    }
}
