package C;

import C.f0;
import android.graphics.Rect;
import android.util.Size;
import androidx.annotation.NonNull;

/* renamed from: C.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2684d extends f0.a {

    /* renamed from: a, reason: collision with root package name */
    private final Size f4169a;

    /* renamed from: b, reason: collision with root package name */
    private final Rect f4170b;

    /* renamed from: c, reason: collision with root package name */
    private final androidx.camera.core.impl.I f4171c;

    /* renamed from: d, reason: collision with root package name */
    private final int f4172d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f4173e;

    C2684d(Size size, Rect rect, androidx.camera.core.impl.I i11, int i12, boolean z11) {
        if (size == null) {
            throw new NullPointerException("Null inputSize");
        }
        this.f4169a = size;
        if (rect == null) {
            throw new NullPointerException("Null inputCropRect");
        }
        this.f4170b = rect;
        this.f4171c = i11;
        this.f4172d = i12;
        this.f4173e = z11;
    }

    @Override // C.f0.a
    public final androidx.camera.core.impl.I a() {
        return this.f4171c;
    }

    @Override // C.f0.a
    @NonNull
    public final Rect b() {
        return this.f4170b;
    }

    @Override // C.f0.a
    @NonNull
    public final Size c() {
        return this.f4169a;
    }

    @Override // C.f0.a
    public final boolean d() {
        return this.f4173e;
    }

    @Override // C.f0.a
    public final int e() {
        return this.f4172d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.a)) {
            return false;
        }
        f0.a aVar = (f0.a) obj;
        if (!this.f4169a.equals(aVar.c()) || !this.f4170b.equals(aVar.b())) {
            return false;
        }
        androidx.camera.core.impl.I i11 = this.f4171c;
        if (i11 == null) {
            if (aVar.a() != null) {
                return false;
            }
        } else if (!i11.equals(aVar.a())) {
            return false;
        }
        return this.f4172d == aVar.e() && this.f4173e == aVar.d();
    }

    public final int hashCode() {
        int hashCode = (((this.f4169a.hashCode() ^ 1000003) * 1000003) ^ this.f4170b.hashCode()) * 1000003;
        androidx.camera.core.impl.I i11 = this.f4171c;
        return ((((hashCode ^ (i11 == null ? 0 : i11.hashCode())) * 1000003) ^ this.f4172d) * 1000003) ^ (this.f4173e ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CameraInputInfo{inputSize=");
        sb2.append(this.f4169a);
        sb2.append(", inputCropRect=");
        sb2.append(this.f4170b);
        sb2.append(", cameraInternal=");
        sb2.append(this.f4171c);
        sb2.append(", rotationDegrees=");
        sb2.append(this.f4172d);
        sb2.append(", mirroring=");
        return Pk0.a.a("}", sb2, this.f4173e);
    }
}
