package N;

import B90.C2618u;
import N.F;
import androidx.annotation.NonNull;
import java.util.List;

/* renamed from: N.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3645c extends F.b {

    /* renamed from: a, reason: collision with root package name */
    private final y f18209a;

    /* renamed from: b, reason: collision with root package name */
    private final List<P.f> f18210b;

    C3645c(y yVar, List<P.f> list) {
        if (yVar == null) {
            throw new NullPointerException("Null surfaceEdge");
        }
        this.f18209a = yVar;
        if (list == null) {
            throw new NullPointerException("Null outConfigs");
        }
        this.f18210b = list;
    }

    @Override // N.F.b
    @NonNull
    public final List<P.f> a() {
        return this.f18210b;
    }

    @Override // N.F.b
    @NonNull
    public final y b() {
        return this.f18209a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.b)) {
            return false;
        }
        F.b bVar = (F.b) obj;
        return this.f18209a.equals(bVar.b()) && this.f18210b.equals(bVar.a());
    }

    public final int hashCode() {
        return ((this.f18209a.hashCode() ^ 1000003) * 1000003) ^ this.f18210b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("In{surfaceEdge=");
        sb2.append(this.f18209a);
        sb2.append(", outConfigs=");
        return C2618u.h(sb2, this.f18210b, "}");
    }
}
