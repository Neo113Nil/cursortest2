package C;

import C.f0;
import androidx.annotation.NonNull;

/* renamed from: C.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2685e extends f0.b {

    /* renamed from: a, reason: collision with root package name */
    private final f0 f4178a;

    C2685e(f0 f0Var) {
        if (f0Var == null) {
            throw new NullPointerException("Null surfaceOutput");
        }
        this.f4178a = f0Var;
    }

    @Override // C.f0.b
    public final int a() {
        return 0;
    }

    @Override // C.f0.b
    @NonNull
    public final f0 b() {
        return this.f4178a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.b)) {
            return false;
        }
        f0.b bVar = (f0.b) obj;
        return bVar.a() == 0 && this.f4178a.equals(bVar.b());
    }

    public final int hashCode() {
        return this.f4178a.hashCode() ^ (-721379959);
    }

    public final String toString() {
        return "Event{eventCode=0, surfaceOutput=" + this.f4178a + "}";
    }
}
