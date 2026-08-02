package J;

import J.f;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.AbstractC5094g0;

/* loaded from: classes8.dex */
final class a extends f.b {

    /* renamed from: a, reason: collision with root package name */
    private final String f12605a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC5094g0 f12606b;

    a(String str, AbstractC5094g0 abstractC5094g0) {
        if (str == null) {
            throw new NullPointerException("Null cameraIdString");
        }
        this.f12605a = str;
        if (abstractC5094g0 == null) {
            throw new NullPointerException("Null cameraConfigId");
        }
        this.f12606b = abstractC5094g0;
    }

    @Override // J.f.b
    @NonNull
    public final AbstractC5094g0 b() {
        return this.f12606b;
    }

    @Override // J.f.b
    @NonNull
    public final String c() {
        return this.f12605a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f.b)) {
            return false;
        }
        f.b bVar = (f.b) obj;
        return this.f12605a.equals(bVar.c()) && this.f12606b.equals(bVar.b());
    }

    public final int hashCode() {
        return ((this.f12605a.hashCode() ^ 1000003) * 1000003) ^ this.f12606b.hashCode();
    }

    public final String toString() {
        return "CameraId{cameraIdString=" + this.f12605a + ", cameraConfigId=" + this.f12606b + "}";
    }
}
