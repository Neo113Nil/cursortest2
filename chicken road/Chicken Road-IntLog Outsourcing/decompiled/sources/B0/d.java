package B0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f142a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f143b;

    public d(String str, Long l2) {
        this.f142a = str;
        this.f143b = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return kotlin.jvm.internal.i.a(this.f142a, dVar.f142a) && kotlin.jvm.internal.i.a(this.f143b, dVar.f143b);
    }

    public final int hashCode() {
        int hashCode = this.f142a.hashCode() * 31;
        Long l2 = this.f143b;
        return hashCode + (l2 == null ? 0 : l2.hashCode());
    }

    public final String toString() {
        return "Preference(key=" + this.f142a + ", value=" + this.f143b + ')';
    }
}
