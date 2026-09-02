package I1;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public static final I1.e f701c = new I1.e(i1.AbstractC0190i.b0(new java.util.ArrayList()), null);

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Set f702a;

    /* renamed from: b, reason: collision with root package name */
    public final Q1.l f703b;

    public e(java.util.Set set, Q1.l lVar) {
        this.f702a = set;
        this.f703b = lVar;
    }

    public final void a(java.lang.String hostname, s1.InterfaceC0991a interfaceC0991a) {
        kotlin.jvm.internal.i.e(hostname, "hostname");
        java.util.Iterator it = this.f702a.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new java.lang.ClassCastException();
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof I1.e) {
            I1.e eVar = (I1.e) obj;
            if (kotlin.jvm.internal.i.a(eVar.f702a, this.f702a) && kotlin.jvm.internal.i.a(eVar.f703b, this.f703b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f702a.hashCode() + 1517) * 41;
        Q1.l lVar = this.f703b;
        return hashCode + (lVar != null ? lVar.hashCode() : 0);
    }
}
