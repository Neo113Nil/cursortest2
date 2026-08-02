package I4;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: c, reason: collision with root package name */
    public static final n f3688c = new n(null, null);

    /* renamed from: a, reason: collision with root package name */
    public final H4.n f3689a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f3690b;

    public n(H4.n nVar, Boolean bool) {
        p3.f.O("Precondition can specify \"exists\" or \"updateTime\" but not both", nVar == null || bool == null, new Object[0]);
        this.f3689a = nVar;
        this.f3690b = bool;
    }

    public static n a(boolean z4) {
        return new n(null, Boolean.valueOf(z4));
    }

    public final boolean b(H4.k kVar) {
        H4.n nVar = this.f3689a;
        if (nVar != null) {
            return kVar.d() && kVar.f3325c.equals(nVar);
        }
        Boolean bool = this.f3690b;
        if (bool != null) {
            return bool.booleanValue() == kVar.d();
        }
        p3.f.O("Precondition should be empty", nVar == null && bool == null, new Object[0]);
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        H4.n nVar2 = nVar.f3689a;
        H4.n nVar3 = this.f3689a;
        if (nVar3 == null ? nVar2 != null : !nVar3.equals(nVar2)) {
            return false;
        }
        Boolean bool = nVar.f3690b;
        Boolean bool2 = this.f3690b;
        return bool2 != null ? bool2.equals(bool) : bool == null;
    }

    public final int hashCode() {
        H4.n nVar = this.f3689a;
        int hashCode = (nVar != null ? nVar.f3333a.hashCode() : 0) * 31;
        Boolean bool = this.f3690b;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        Boolean bool = this.f3690b;
        H4.n nVar = this.f3689a;
        if (nVar == null && bool == null) {
            return "Precondition{<none>}";
        }
        if (nVar != null) {
            return "Precondition{updateTime=" + nVar + "}";
        }
        if (bool == null) {
            p3.f.F("Invalid Precondition", new Object[0]);
            throw null;
        }
        return "Precondition{exists=" + bool + "}";
    }
}
