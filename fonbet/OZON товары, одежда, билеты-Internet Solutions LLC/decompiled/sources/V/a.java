package V;

import J.f;
import V.c;
import androidx.annotation.NonNull;
import androidx.lifecycle.J;

/* loaded from: classes8.dex */
final class a extends c.a {

    /* renamed from: a, reason: collision with root package name */
    private final J f27867a;

    /* renamed from: b, reason: collision with root package name */
    private final f.b f27868b;

    a(J j11, f.b bVar) {
        if (j11 == null) {
            throw new NullPointerException("Null lifecycleOwner");
        }
        this.f27867a = j11;
        if (bVar == null) {
            throw new NullPointerException("Null cameraId");
        }
        this.f27868b = bVar;
    }

    @Override // V.c.a
    @NonNull
    public final f.b a() {
        return this.f27868b;
    }

    @Override // V.c.a
    @NonNull
    public final J b() {
        return this.f27867a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c.a)) {
            return false;
        }
        c.a aVar = (c.a) obj;
        return this.f27867a.equals(aVar.b()) && this.f27868b.equals(aVar.a());
    }

    public final int hashCode() {
        return ((this.f27867a.hashCode() ^ 1000003) * 1000003) ^ this.f27868b.hashCode();
    }

    public final String toString() {
        return "Key{lifecycleOwner=" + this.f27867a + ", cameraId=" + this.f27868b + "}";
    }
}
