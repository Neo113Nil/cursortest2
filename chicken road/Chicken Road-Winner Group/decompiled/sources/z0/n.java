package z0;

/* loaded from: classes.dex */
public final class n extends v {

    /* renamed from: a, reason: collision with root package name */
    public final u f10690a;

    /* renamed from: b, reason: collision with root package name */
    public final t f10691b;

    public n(u uVar, t tVar) {
        this.f10690a = uVar;
        this.f10691b = tVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            u uVar = this.f10690a;
            if (uVar != null ? uVar.equals(((n) vVar).f10690a) : ((n) vVar).f10690a == null) {
                t tVar = this.f10691b;
                if (tVar != null ? tVar.equals(((n) vVar).f10691b) : ((n) vVar).f10691b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        u uVar = this.f10690a;
        int hashCode = ((uVar == null ? 0 : uVar.hashCode()) ^ 1000003) * 1000003;
        t tVar = this.f10691b;
        return (tVar != null ? tVar.hashCode() : 0) ^ hashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f10690a + ", mobileSubtype=" + this.f10691b + "}";
    }
}
