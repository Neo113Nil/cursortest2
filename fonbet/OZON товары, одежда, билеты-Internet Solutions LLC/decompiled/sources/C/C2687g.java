package C;

import C.s0;
import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.annotation.NonNull;

/* renamed from: C.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2687g extends s0.d {

    /* renamed from: a, reason: collision with root package name */
    private final Rect f4183a;

    /* renamed from: b, reason: collision with root package name */
    private final int f4184b;

    /* renamed from: c, reason: collision with root package name */
    private final int f4185c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f4186d;

    /* renamed from: e, reason: collision with root package name */
    private final Matrix f4187e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f4188f;

    C2687g(Rect rect, int i11, int i12, boolean z11, Matrix matrix, boolean z12) {
        if (rect == null) {
            throw new NullPointerException("Null getCropRect");
        }
        this.f4183a = rect;
        this.f4184b = i11;
        this.f4185c = i12;
        this.f4186d = z11;
        if (matrix == null) {
            throw new NullPointerException("Null getSensorToBufferTransform");
        }
        this.f4187e = matrix;
        this.f4188f = z12;
    }

    @Override // C.s0.d
    @NonNull
    public final Rect a() {
        return this.f4183a;
    }

    @Override // C.s0.d
    public final int b() {
        return this.f4184b;
    }

    @Override // C.s0.d
    @NonNull
    public final Matrix c() {
        return this.f4187e;
    }

    @Override // C.s0.d
    public final int d() {
        return this.f4185c;
    }

    @Override // C.s0.d
    public final boolean e() {
        return this.f4186d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s0.d)) {
            return false;
        }
        s0.d dVar = (s0.d) obj;
        return this.f4183a.equals(dVar.a()) && this.f4184b == dVar.b() && this.f4185c == dVar.d() && this.f4186d == dVar.e() && this.f4187e.equals(dVar.c()) && this.f4188f == dVar.f();
    }

    @Override // C.s0.d
    public final boolean f() {
        return this.f4188f;
    }

    public final int hashCode() {
        return ((((((((((this.f4183a.hashCode() ^ 1000003) * 1000003) ^ this.f4184b) * 1000003) ^ this.f4185c) * 1000003) ^ (this.f4186d ? 1231 : 1237)) * 1000003) ^ this.f4187e.hashCode()) * 1000003) ^ (this.f4188f ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TransformationInfo{getCropRect=");
        sb2.append(this.f4183a);
        sb2.append(", getRotationDegrees=");
        sb2.append(this.f4184b);
        sb2.append(", getTargetRotation=");
        sb2.append(this.f4185c);
        sb2.append(", hasCameraTransform=");
        sb2.append(this.f4186d);
        sb2.append(", getSensorToBufferTransform=");
        sb2.append(this.f4187e);
        sb2.append(", isMirroring=");
        return Pk0.a.a("}", sb2, this.f4188f);
    }
}
