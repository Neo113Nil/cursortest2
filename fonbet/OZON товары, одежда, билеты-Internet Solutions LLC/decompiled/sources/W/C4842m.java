package W;

import C.s0;
import W.Y;
import androidx.annotation.NonNull;

/* renamed from: W.m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C4842m extends Y {

    /* renamed from: d, reason: collision with root package name */
    private final int f33089d;

    /* renamed from: e, reason: collision with root package name */
    private final Y.a f33090e;

    /* renamed from: f, reason: collision with root package name */
    private final s0.d f33091f;

    C4842m(int i11, Y.a aVar, s0.d dVar) {
        this.f33089d = i11;
        if (aVar == null) {
            throw new NullPointerException("Null streamState");
        }
        this.f33090e = aVar;
        this.f33091f = dVar;
    }

    @Override // W.Y
    public final int a() {
        return this.f33089d;
    }

    @Override // W.Y
    public final s0.d b() {
        return this.f33091f;
    }

    @Override // W.Y
    @NonNull
    public final Y.a c() {
        return this.f33090e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Y)) {
            return false;
        }
        Y y11 = (Y) obj;
        if (this.f33089d != y11.a() || !this.f33090e.equals(y11.c())) {
            return false;
        }
        s0.d dVar = this.f33091f;
        return dVar == null ? y11.b() == null : dVar.equals(y11.b());
    }

    public final int hashCode() {
        int hashCode = (((this.f33089d ^ 1000003) * 1000003) ^ this.f33090e.hashCode()) * 1000003;
        s0.d dVar = this.f33091f;
        return hashCode ^ (dVar == null ? 0 : dVar.hashCode());
    }

    public final String toString() {
        return "StreamInfo{id=" + this.f33089d + ", streamState=" + this.f33090e + ", inProgressTransformationInfo=" + this.f33091f + "}";
    }
}
