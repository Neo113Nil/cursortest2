package C;

import C.s0;
import android.view.Surface;
import androidx.annotation.NonNull;

/* renamed from: C.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2686f extends s0.c {

    /* renamed from: a, reason: collision with root package name */
    private final int f4181a;

    /* renamed from: b, reason: collision with root package name */
    private final Surface f4182b;

    C2686f(int i11, Surface surface) {
        this.f4181a = i11;
        if (surface == null) {
            throw new NullPointerException("Null surface");
        }
        this.f4182b = surface;
    }

    @Override // C.s0.c
    public final int a() {
        return this.f4181a;
    }

    @Override // C.s0.c
    @NonNull
    public final Surface b() {
        return this.f4182b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s0.c)) {
            return false;
        }
        s0.c cVar = (s0.c) obj;
        return this.f4181a == cVar.a() && this.f4182b.equals(cVar.b());
    }

    public final int hashCode() {
        return this.f4182b.hashCode() ^ ((this.f4181a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "Result{resultCode=" + this.f4181a + ", surface=" + this.f4182b + "}";
    }
}
