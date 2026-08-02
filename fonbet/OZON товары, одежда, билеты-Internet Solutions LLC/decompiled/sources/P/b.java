package P;

import android.graphics.Rect;
import android.util.Size;
import androidx.annotation.NonNull;
import java.util.UUID;

/* loaded from: classes8.dex */
final class b extends f {

    /* renamed from: a, reason: collision with root package name */
    private final UUID f20561a;

    /* renamed from: b, reason: collision with root package name */
    private final int f20562b;

    /* renamed from: c, reason: collision with root package name */
    private final int f20563c;

    /* renamed from: d, reason: collision with root package name */
    private final Rect f20564d;

    /* renamed from: e, reason: collision with root package name */
    private final Size f20565e;

    /* renamed from: f, reason: collision with root package name */
    private final int f20566f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f20567g;

    b(UUID uuid, int i11, int i12, Rect rect, Size size, int i13, boolean z11) {
        if (uuid == null) {
            throw new NullPointerException("Null getUuid");
        }
        this.f20561a = uuid;
        this.f20562b = i11;
        this.f20563c = i12;
        if (rect == null) {
            throw new NullPointerException("Null getCropRect");
        }
        this.f20564d = rect;
        if (size == null) {
            throw new NullPointerException("Null getSize");
        }
        this.f20565e = size;
        this.f20566f = i13;
        this.f20567g = z11;
    }

    @Override // P.f
    @NonNull
    public final Rect a() {
        return this.f20564d;
    }

    @Override // P.f
    public final int b() {
        return this.f20563c;
    }

    @Override // P.f
    public final int c() {
        return this.f20566f;
    }

    @Override // P.f
    @NonNull
    public final Size d() {
        return this.f20565e;
    }

    @Override // P.f
    public final int e() {
        return this.f20562b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f20561a.equals(fVar.f()) && this.f20562b == fVar.e() && this.f20563c == fVar.b() && this.f20564d.equals(fVar.a()) && this.f20565e.equals(fVar.d()) && this.f20566f == fVar.c() && this.f20567g == fVar.g() && !fVar.i();
    }

    @Override // P.f
    @NonNull
    final UUID f() {
        return this.f20561a;
    }

    @Override // P.f
    public final boolean g() {
        return this.f20567g;
    }

    public final int hashCode() {
        return ((((((((((((((this.f20561a.hashCode() ^ 1000003) * 1000003) ^ this.f20562b) * 1000003) ^ this.f20563c) * 1000003) ^ this.f20564d.hashCode()) * 1000003) ^ this.f20565e.hashCode()) * 1000003) ^ this.f20566f) * 1000003) ^ (this.f20567g ? 1231 : 1237)) * 1000003) ^ 1237;
    }

    @Override // P.f
    public final boolean i() {
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OutConfig{getUuid=");
        sb2.append(this.f20561a);
        sb2.append(", getTargets=");
        sb2.append(this.f20562b);
        sb2.append(", getFormat=");
        sb2.append(this.f20563c);
        sb2.append(", getCropRect=");
        sb2.append(this.f20564d);
        sb2.append(", getSize=");
        sb2.append(this.f20565e);
        sb2.append(", getRotationDegrees=");
        sb2.append(this.f20566f);
        sb2.append(", isMirroring=");
        return Pk0.a.a(", shouldRespectInputCropRect=false}", sb2, this.f20567g);
    }
}
