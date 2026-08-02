package E;

import E.Y;
import androidx.annotation.NonNull;

/* renamed from: E.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2891g extends Y.a {

    /* renamed from: a, reason: collision with root package name */
    private final int f6896a;

    /* renamed from: b, reason: collision with root package name */
    private final C.K f6897b;

    C2891g(int i11, C.K k11) {
        this.f6896a = i11;
        this.f6897b = k11;
    }

    @Override // E.Y.a
    @NonNull
    final C.K a() {
        return this.f6897b;
    }

    @Override // E.Y.a
    final int b() {
        return this.f6896a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Y.a)) {
            return false;
        }
        Y.a aVar = (Y.a) obj;
        return this.f6896a == aVar.b() && this.f6897b.equals(aVar.a());
    }

    public final int hashCode() {
        return ((this.f6896a ^ 1000003) * 1000003) ^ this.f6897b.hashCode();
    }

    public final String toString() {
        return "CaptureError{requestId=" + this.f6896a + ", imageCaptureException=" + this.f6897b + "}";
    }
}
