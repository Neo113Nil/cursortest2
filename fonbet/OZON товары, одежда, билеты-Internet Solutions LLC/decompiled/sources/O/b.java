package O;

import N.y;
import O.m;
import Ve.Om;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
final class b extends m.b {

    /* renamed from: a, reason: collision with root package name */
    private final y f19684a;

    /* renamed from: b, reason: collision with root package name */
    private final y f19685b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f19686c;

    b(y yVar, y yVar2, ArrayList arrayList) {
        if (yVar == null) {
            throw new NullPointerException("Null primarySurfaceEdge");
        }
        this.f19684a = yVar;
        if (yVar2 == null) {
            throw new NullPointerException("Null secondarySurfaceEdge");
        }
        this.f19685b = yVar2;
        this.f19686c = arrayList;
    }

    @Override // O.m.b
    @NonNull
    public final List<d> a() {
        return this.f19686c;
    }

    @Override // O.m.b
    @NonNull
    public final y b() {
        return this.f19684a;
    }

    @Override // O.m.b
    @NonNull
    public final y c() {
        return this.f19685b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m.b)) {
            return false;
        }
        m.b bVar = (m.b) obj;
        return this.f19684a.equals(bVar.b()) && this.f19685b.equals(bVar.c()) && this.f19686c.equals(bVar.a());
    }

    public final int hashCode() {
        return ((((this.f19684a.hashCode() ^ 1000003) * 1000003) ^ this.f19685b.hashCode()) * 1000003) ^ this.f19686c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("In{primarySurfaceEdge=");
        sb2.append(this.f19684a);
        sb2.append(", secondarySurfaceEdge=");
        sb2.append(this.f19685b);
        sb2.append(", outConfigs=");
        return Om.a("}", sb2, this.f19686c);
    }
}
