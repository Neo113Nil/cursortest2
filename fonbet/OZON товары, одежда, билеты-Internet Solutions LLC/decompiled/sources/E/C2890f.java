package E;

import E.O;
import androidx.annotation.NonNull;

/* renamed from: E.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2890f extends O.b {

    /* renamed from: a, reason: collision with root package name */
    private final P f6894a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.camera.core.p f6895b;

    C2890f(P p11, androidx.camera.core.p pVar) {
        if (p11 == null) {
            throw new NullPointerException("Null processingRequest");
        }
        this.f6894a = p11;
        this.f6895b = pVar;
    }

    @Override // E.O.b
    @NonNull
    final androidx.camera.core.p a() {
        return this.f6895b;
    }

    @Override // E.O.b
    @NonNull
    final P b() {
        return this.f6894a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof O.b)) {
            return false;
        }
        O.b bVar = (O.b) obj;
        return this.f6894a.equals(bVar.b()) && this.f6895b.equals(bVar.a());
    }

    public final int hashCode() {
        return ((this.f6894a.hashCode() ^ 1000003) * 1000003) ^ this.f6895b.hashCode();
    }

    public final String toString() {
        return "InputPacket{processingRequest=" + this.f6894a + ", imageProxy=" + this.f6895b + "}";
    }
}
