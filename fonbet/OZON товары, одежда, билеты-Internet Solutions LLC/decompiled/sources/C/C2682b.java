package C;

import C.r;
import androidx.annotation.NonNull;

/* renamed from: C.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2682b extends r {

    /* renamed from: a, reason: collision with root package name */
    private final r.b f4162a;

    /* renamed from: b, reason: collision with root package name */
    private final r.a f4163b;

    C2682b(r.b bVar, r.a aVar) {
        if (bVar == null) {
            throw new NullPointerException("Null type");
        }
        this.f4162a = bVar;
        this.f4163b = aVar;
    }

    @Override // C.r
    public final r.a c() {
        return this.f4163b;
    }

    @Override // C.r
    @NonNull
    public final r.b d() {
        return this.f4162a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (!this.f4162a.equals(rVar.d())) {
            return false;
        }
        r.a aVar = this.f4163b;
        return aVar == null ? rVar.c() == null : aVar.equals(rVar.c());
    }

    public final int hashCode() {
        int hashCode = (this.f4162a.hashCode() ^ 1000003) * 1000003;
        r.a aVar = this.f4163b;
        return hashCode ^ (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        return "CameraState{type=" + this.f4162a + ", error=" + this.f4163b + "}";
    }
}
