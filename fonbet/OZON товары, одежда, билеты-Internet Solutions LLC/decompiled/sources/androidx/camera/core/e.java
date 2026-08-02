package androidx.camera.core;

import android.graphics.Matrix;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.X0;

/* loaded from: classes8.dex */
final class e extends r {

    /* renamed from: a, reason: collision with root package name */
    private final X0 f38078a;

    /* renamed from: b, reason: collision with root package name */
    private final long f38079b;

    /* renamed from: c, reason: collision with root package name */
    private final int f38080c;

    /* renamed from: d, reason: collision with root package name */
    private final Matrix f38081d;

    e(X0 x02, long j11, int i11, Matrix matrix) {
        if (x02 == null) {
            throw new NullPointerException("Null tagBundle");
        }
        this.f38078a = x02;
        this.f38079b = j11;
        this.f38080c = i11;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransformMatrix");
        }
        this.f38081d = matrix;
    }

    @Override // C.L
    @NonNull
    public final X0 a() {
        return this.f38078a;
    }

    @Override // C.L
    public final int c() {
        return this.f38080c;
    }

    @Override // androidx.camera.core.r
    @NonNull
    public final Matrix e() {
        return this.f38081d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        e eVar = (e) rVar;
        if (this.f38078a.equals(eVar.f38078a)) {
            return this.f38079b == eVar.f38079b && this.f38080c == eVar.f38080c && this.f38081d.equals(rVar.e());
        }
        return false;
    }

    @Override // C.L
    public final long getTimestamp() {
        return this.f38079b;
    }

    public final int hashCode() {
        int hashCode = (this.f38078a.hashCode() ^ 1000003) * 1000003;
        long j11 = this.f38079b;
        return ((((hashCode ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f38080c) * 1000003) ^ this.f38081d.hashCode();
    }

    public final String toString() {
        return "ImmutableImageInfo{tagBundle=" + this.f38078a + ", timestamp=" + this.f38079b + ", rotationDegrees=" + this.f38080c + ", sensorToBufferTransformMatrix=" + this.f38081d + "}";
    }
}
