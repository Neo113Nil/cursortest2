package F1;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f2567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f2568b;

    public r(t tVar, t tVar2) {
        this.f2567a = tVar;
        this.f2568b = tVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        return this.f2567a.equals(rVar.f2567a) && this.f2568b.equals(rVar.f2568b);
    }

    public final int hashCode() {
        return this.f2568b.hashCode() + (this.f2567a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[");
        t tVar = this.f2567a;
        sb.append(tVar);
        t tVar2 = this.f2568b;
        if (tVar.equals(tVar2)) {
            str = "";
        } else {
            str = ", " + tVar2;
        }
        return p031e1.k.i(sb, str, "]");
    }
}
