package v4;

/* JADX INFO: loaded from: classes2.dex */
public final class q extends f {
    @Override // v4.f
    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // v4.f, v4.r
    public final boolean i(c cVar) {
        return false;
    }

    @Override // v4.f, v4.r
    public final boolean isEmpty() {
        return false;
    }

    @Override // v4.f, java.lang.Comparable
    /* JADX INFO: renamed from: l */
    public final int compareTo(r rVar) {
        return rVar == this ? 0 : 1;
    }

    @Override // v4.f, v4.r
    public final r o(c cVar) {
        return cVar.equals(c.f17177d) ? this : j.f17190e;
    }

    @Override // v4.f
    public final String toString() {
        return "<Max Node>";
    }

    @Override // v4.f, v4.r
    public final r e() {
        return this;
    }
}
