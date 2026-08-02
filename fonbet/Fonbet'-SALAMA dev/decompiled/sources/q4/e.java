package q4;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Object f15857a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f15858b;

    public e(Object obj, Object obj2) {
        this.f15857a = obj;
        this.f15858b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        Object obj2 = eVar.f15857a;
        Object obj3 = this.f15857a;
        if (obj3 == null ? obj2 != null : !obj3.equals(obj2)) {
            return false;
        }
        Object obj4 = eVar.f15858b;
        Object obj5 = this.f15858b;
        return obj5 == null ? obj4 == null : obj5.equals(obj4);
    }

    public final int hashCode() {
        Object obj = this.f15857a;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f15858b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "Pair(" + this.f15857a + "," + this.f15858b + ")";
    }
}
