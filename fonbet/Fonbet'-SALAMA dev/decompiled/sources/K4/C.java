package K4;

import com.google.protobuf.I;
import java.util.List;

/* loaded from: classes2.dex */
public final class C extends P6.b {

    /* renamed from: c, reason: collision with root package name */
    public final List f3967c;

    /* renamed from: d, reason: collision with root package name */
    public final I f3968d;

    /* renamed from: e, reason: collision with root package name */
    public final H4.h f3969e;

    /* renamed from: f, reason: collision with root package name */
    public final H4.k f3970f;

    public C(List list, I i7, H4.h hVar, H4.k kVar) {
        this.f3967c = list;
        this.f3968d = i7;
        this.f3969e = hVar;
        this.f3970f = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C.class != obj.getClass()) {
            return false;
        }
        C c3 = (C) obj;
        if (!this.f3967c.equals(c3.f3967c)) {
            return false;
        }
        if (!((com.google.protobuf.G) this.f3968d).equals(c3.f3968d) || !this.f3969e.equals(c3.f3969e)) {
            return false;
        }
        H4.k kVar = c3.f3970f;
        H4.k kVar2 = this.f3970f;
        return kVar2 != null ? kVar2.equals(kVar) : kVar == null;
    }

    public final int hashCode() {
        int hashCode = (this.f3969e.f3318a.hashCode() + ((((com.google.protobuf.G) this.f3968d).hashCode() + (this.f3967c.hashCode() * 31)) * 31)) * 31;
        H4.k kVar = this.f3970f;
        return hashCode + (kVar != null ? kVar.hashCode() : 0);
    }

    public final String toString() {
        return "DocumentChange{updatedTargetIds=" + this.f3967c + ", removedTargetIds=" + this.f3968d + ", key=" + this.f3969e + ", newDocument=" + this.f3970f + '}';
    }
}
