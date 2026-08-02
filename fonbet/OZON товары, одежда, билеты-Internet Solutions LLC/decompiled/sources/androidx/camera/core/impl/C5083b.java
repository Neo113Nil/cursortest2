package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.c1;
import java.util.List;

/* renamed from: androidx.camera.core.impl.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5083b extends AbstractC5081a {

    /* renamed from: a, reason: collision with root package name */
    private final V0 f38253a;

    /* renamed from: b, reason: collision with root package name */
    private final int f38254b;

    /* renamed from: c, reason: collision with root package name */
    private final Size f38255c;

    /* renamed from: d, reason: collision with root package name */
    private final C.A f38256d;

    /* renamed from: e, reason: collision with root package name */
    private final List<c1.b> f38257e;

    /* renamed from: f, reason: collision with root package name */
    private final T f38258f;

    /* renamed from: g, reason: collision with root package name */
    private final Range<Integer> f38259g;

    C5083b(V0 v02, int i11, Size size, C.A a11, List<c1.b> list, T t2, Range<Integer> range) {
        if (v02 == null) {
            throw new NullPointerException("Null surfaceConfig");
        }
        this.f38253a = v02;
        this.f38254b = i11;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f38255c = size;
        if (a11 == null) {
            throw new NullPointerException("Null dynamicRange");
        }
        this.f38256d = a11;
        if (list == null) {
            throw new NullPointerException("Null captureTypes");
        }
        this.f38257e = list;
        this.f38258f = t2;
        this.f38259g = range;
    }

    @Override // androidx.camera.core.impl.AbstractC5081a
    @NonNull
    public final List<c1.b> b() {
        return this.f38257e;
    }

    @Override // androidx.camera.core.impl.AbstractC5081a
    @NonNull
    public final C.A c() {
        return this.f38256d;
    }

    @Override // androidx.camera.core.impl.AbstractC5081a
    public final int d() {
        return this.f38254b;
    }

    @Override // androidx.camera.core.impl.AbstractC5081a
    public final T e() {
        return this.f38258f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5081a)) {
            return false;
        }
        AbstractC5081a abstractC5081a = (AbstractC5081a) obj;
        if (!this.f38253a.equals(abstractC5081a.g()) || this.f38254b != abstractC5081a.d() || !this.f38255c.equals(abstractC5081a.f()) || !this.f38256d.equals(abstractC5081a.c()) || !this.f38257e.equals(abstractC5081a.b())) {
            return false;
        }
        T t2 = this.f38258f;
        if (t2 == null) {
            if (abstractC5081a.e() != null) {
                return false;
            }
        } else if (!t2.equals(abstractC5081a.e())) {
            return false;
        }
        Range<Integer> range = this.f38259g;
        return range == null ? abstractC5081a.h() == null : range.equals(abstractC5081a.h());
    }

    @Override // androidx.camera.core.impl.AbstractC5081a
    @NonNull
    public final Size f() {
        return this.f38255c;
    }

    @Override // androidx.camera.core.impl.AbstractC5081a
    @NonNull
    public final V0 g() {
        return this.f38253a;
    }

    @Override // androidx.camera.core.impl.AbstractC5081a
    public final Range<Integer> h() {
        return this.f38259g;
    }

    public final int hashCode() {
        int hashCode = (((((((((this.f38253a.hashCode() ^ 1000003) * 1000003) ^ this.f38254b) * 1000003) ^ this.f38255c.hashCode()) * 1000003) ^ this.f38256d.hashCode()) * 1000003) ^ this.f38257e.hashCode()) * 1000003;
        T t2 = this.f38258f;
        int hashCode2 = (hashCode ^ (t2 == null ? 0 : t2.hashCode())) * 1000003;
        Range<Integer> range = this.f38259g;
        return hashCode2 ^ (range != null ? range.hashCode() : 0);
    }

    public final String toString() {
        return "AttachedSurfaceInfo{surfaceConfig=" + this.f38253a + ", imageFormat=" + this.f38254b + ", size=" + this.f38255c + ", dynamicRange=" + this.f38256d + ", captureTypes=" + this.f38257e + ", implementationOptions=" + this.f38258f + ", targetFrameRate=" + this.f38259g + "}";
    }
}
