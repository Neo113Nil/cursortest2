package v4;

/* loaded from: classes2.dex */
public final class m extends k {

    /* renamed from: a, reason: collision with root package name */
    public static final m f17189a = new m();

    @Override // v4.k
    public final String a() {
        return ".key";
    }

    @Override // v4.k
    public final boolean b(r rVar) {
        return true;
    }

    @Override // v4.k
    public final p c(c cVar, r rVar) {
        q4.k.c(rVar instanceof v);
        return new p(c.b((String) rVar.getValue()), j.f17184e);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((p) obj).f17195a.compareTo(((p) obj2).f17195a);
    }

    @Override // v4.k
    public final p d() {
        return p.f17194d;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        return obj instanceof m;
    }

    public final int hashCode() {
        return 37;
    }

    public final String toString() {
        return "KeyIndex";
    }
}
