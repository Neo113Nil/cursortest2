package U0;

/* loaded from: classes.dex */
public final class n extends v {

    /* renamed from: a, reason: collision with root package name */
    public final u f3142a;

    /* renamed from: b, reason: collision with root package name */
    public final t f3143b;

    public n(u uVar, t tVar) {
        this.f3142a = uVar;
        this.f3143b = tVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        u uVar = this.f3142a;
        if (uVar != null ? uVar.equals(((n) vVar).f3142a) : ((n) vVar).f3142a == null) {
            t tVar = this.f3143b;
            if (tVar == null) {
                if (((n) vVar).f3143b == null) {
                    return true;
                }
            } else if (tVar.equals(((n) vVar).f3143b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        u uVar = this.f3142a;
        int hashCode = ((uVar == null ? 0 : uVar.hashCode()) ^ 1000003) * 1000003;
        t tVar = this.f3143b;
        return (tVar != null ? tVar.hashCode() : 0) ^ hashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f3142a + ", mobileSubtype=" + this.f3143b + "}";
    }
}
