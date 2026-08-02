package N;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.InterfaceC5130z;

/* renamed from: N.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3644b<T> extends p<T> {

    /* renamed from: a, reason: collision with root package name */
    private final T f18201a;

    /* renamed from: b, reason: collision with root package name */
    private final G.h f18202b;

    /* renamed from: c, reason: collision with root package name */
    private final int f18203c;

    /* renamed from: d, reason: collision with root package name */
    private final Size f18204d;

    /* renamed from: e, reason: collision with root package name */
    private final Rect f18205e;

    /* renamed from: f, reason: collision with root package name */
    private final int f18206f;

    /* renamed from: g, reason: collision with root package name */
    private final Matrix f18207g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC5130z f18208h;

    C3644b(T t2, G.h hVar, int i11, Size size, Rect rect, int i12, Matrix matrix, InterfaceC5130z interfaceC5130z) {
        if (t2 == null) {
            throw new NullPointerException("Null data");
        }
        this.f18201a = t2;
        this.f18202b = hVar;
        this.f18203c = i11;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f18204d = size;
        if (rect == null) {
            throw new NullPointerException("Null cropRect");
        }
        this.f18205e = rect;
        this.f18206f = i12;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransform");
        }
        this.f18207g = matrix;
        if (interfaceC5130z == null) {
            throw new NullPointerException("Null cameraCaptureResult");
        }
        this.f18208h = interfaceC5130z;
    }

    @Override // N.p
    @NonNull
    public final InterfaceC5130z a() {
        return this.f18208h;
    }

    @Override // N.p
    @NonNull
    public final Rect b() {
        return this.f18205e;
    }

    @Override // N.p
    @NonNull
    public final T c() {
        return this.f18201a;
    }

    @Override // N.p
    public final G.h d() {
        return this.f18202b;
    }

    @Override // N.p
    public final int e() {
        return this.f18203c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (!this.f18201a.equals(pVar.c())) {
            return false;
        }
        G.h hVar = this.f18202b;
        if (hVar == null) {
            if (pVar.d() != null) {
                return false;
            }
        } else if (!hVar.equals(pVar.d())) {
            return false;
        }
        return this.f18203c == pVar.e() && this.f18204d.equals(pVar.h()) && this.f18205e.equals(pVar.b()) && this.f18206f == pVar.f() && this.f18207g.equals(pVar.g()) && this.f18208h.equals(pVar.a());
    }

    @Override // N.p
    public final int f() {
        return this.f18206f;
    }

    @Override // N.p
    @NonNull
    public final Matrix g() {
        return this.f18207g;
    }

    @Override // N.p
    @NonNull
    public final Size h() {
        return this.f18204d;
    }

    public final int hashCode() {
        int hashCode = (this.f18201a.hashCode() ^ 1000003) * 1000003;
        G.h hVar = this.f18202b;
        return ((((((((((((hashCode ^ (hVar == null ? 0 : hVar.hashCode())) * 1000003) ^ this.f18203c) * 1000003) ^ this.f18204d.hashCode()) * 1000003) ^ this.f18205e.hashCode()) * 1000003) ^ this.f18206f) * 1000003) ^ this.f18207g.hashCode()) * 1000003) ^ this.f18208h.hashCode();
    }

    public final String toString() {
        return "Packet{data=" + this.f18201a + ", exif=" + this.f18202b + ", format=" + this.f18203c + ", size=" + this.f18204d + ", cropRect=" + this.f18205e + ", rotationDegrees=" + this.f18206f + ", sensorToBufferTransform=" + this.f18207g + ", cameraCaptureResult=" + this.f18208h + "}";
    }
}
