package E;

import B90.C2618u;
import C.I;
import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.AbstractC5111p;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: E.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2892h extends d0 {

    /* renamed from: b, reason: collision with root package name */
    private final Executor f6898b;

    /* renamed from: c, reason: collision with root package name */
    private final I.f f6899c;

    /* renamed from: d, reason: collision with root package name */
    private final I.g f6900d;

    /* renamed from: e, reason: collision with root package name */
    private final Rect f6901e;

    /* renamed from: f, reason: collision with root package name */
    private final Matrix f6902f;

    /* renamed from: g, reason: collision with root package name */
    private final int f6903g;

    /* renamed from: h, reason: collision with root package name */
    private final int f6904h;

    /* renamed from: i, reason: collision with root package name */
    private final int f6905i;

    /* renamed from: j, reason: collision with root package name */
    private final List<AbstractC5111p> f6906j;

    C2892h(Executor executor, I.f fVar, I.g gVar, Rect rect, Matrix matrix, int i11, int i12, int i13, List list) {
        if (executor == null) {
            throw new NullPointerException("Null appExecutor");
        }
        this.f6898b = executor;
        this.f6899c = fVar;
        this.f6900d = gVar;
        this.f6901e = rect;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransform");
        }
        this.f6902f = matrix;
        this.f6903g = i11;
        this.f6904h = i12;
        this.f6905i = i13;
        if (list == null) {
            throw new NullPointerException("Null sessionConfigCameraCaptureCallbacks");
        }
        this.f6906j = list;
    }

    @Override // E.d0
    @NonNull
    final Executor b() {
        return this.f6898b;
    }

    @Override // E.d0
    final int c() {
        return this.f6905i;
    }

    @Override // E.d0
    @NonNull
    final Rect d() {
        return this.f6901e;
    }

    @Override // E.d0
    public final I.e e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        if (!this.f6898b.equals(d0Var.b())) {
            return false;
        }
        d0Var.e();
        I.f fVar = this.f6899c;
        if (fVar == null) {
            if (d0Var.g() != null) {
                return false;
            }
        } else if (!fVar.equals(d0Var.g())) {
            return false;
        }
        I.g gVar = this.f6900d;
        if (gVar == null) {
            if (d0Var.h() != null) {
                return false;
            }
        } else if (!gVar.equals(d0Var.h())) {
            return false;
        }
        return this.f6901e.equals(d0Var.d()) && this.f6902f.equals(d0Var.j()) && this.f6903g == d0Var.i() && this.f6904h == d0Var.f() && this.f6905i == d0Var.c() && this.f6906j.equals(d0Var.k());
    }

    @Override // E.d0
    final int f() {
        return this.f6904h;
    }

    @Override // E.d0
    public final I.f g() {
        return this.f6899c;
    }

    @Override // E.d0
    final I.g h() {
        return this.f6900d;
    }

    public final int hashCode() {
        int hashCode = (this.f6898b.hashCode() ^ 1000003) * (-721379959);
        I.f fVar = this.f6899c;
        int hashCode2 = (hashCode ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        I.g gVar = this.f6900d;
        return ((((((((((((hashCode2 ^ (gVar != null ? gVar.hashCode() : 0)) * 1000003) ^ this.f6901e.hashCode()) * 1000003) ^ this.f6902f.hashCode()) * 1000003) ^ this.f6903g) * 1000003) ^ this.f6904h) * 1000003) ^ this.f6905i) * 1000003) ^ this.f6906j.hashCode();
    }

    @Override // E.d0
    final int i() {
        return this.f6903g;
    }

    @Override // E.d0
    @NonNull
    final Matrix j() {
        return this.f6902f;
    }

    @Override // E.d0
    @NonNull
    final List<AbstractC5111p> k() {
        return this.f6906j;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TakePictureRequest{appExecutor=");
        sb2.append(this.f6898b);
        sb2.append(", inMemoryCallback=null, onDiskCallback=");
        sb2.append(this.f6899c);
        sb2.append(", outputFileOptions=");
        sb2.append(this.f6900d);
        sb2.append(", cropRect=");
        sb2.append(this.f6901e);
        sb2.append(", sensorToBufferTransform=");
        sb2.append(this.f6902f);
        sb2.append(", rotationDegrees=");
        sb2.append(this.f6903g);
        sb2.append(", jpegQuality=");
        sb2.append(this.f6904h);
        sb2.append(", captureMode=");
        sb2.append(this.f6905i);
        sb2.append(", sessionConfigCameraCaptureCallbacks=");
        return C2618u.h(sb2, this.f6906j, "}");
    }
}
