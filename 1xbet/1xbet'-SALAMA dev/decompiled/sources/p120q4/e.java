package p120q4;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f15863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f15864b;

    public e(Object obj, Object obj2) {
        this.f15863a = obj;
        this.f15864b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        Object obj2 = eVar.f15863a;
        Object obj3 = this.f15863a;
        if (obj3 == null ? obj2 != null : !obj3.equals(obj2)) {
            return false;
        }
        Object obj4 = eVar.f15864b;
        Object obj5 = this.f15864b;
        return obj5 == null ? obj4 == null : obj5.equals(obj4);
    }

    public final int hashCode() {
        Object obj = this.f15863a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f15864b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "Pair(" + this.f15863a + "," + this.f15864b + ")";
    }
}
