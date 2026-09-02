package R0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f1651a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f1652b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f1653c;

    public a(java.lang.String str, java.lang.String str2) {
        this.f1651a = str;
        this.f1652b = null;
        this.f1653c = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || R0.a.class != obj.getClass()) {
            return false;
        }
        R0.a aVar = (R0.a) obj;
        if (this.f1651a.equals(aVar.f1651a)) {
            return this.f1653c.equals(aVar.f1653c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1653c.hashCode() + (this.f1651a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DartEntrypoint( bundle path: ");
        sb.append(this.f1651a);
        sb.append(", function: ");
        return B1.a.j(sb, this.f1653c, " )");
    }

    public a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f1651a = str;
        this.f1652b = str2;
        this.f1653c = str3;
    }
}
