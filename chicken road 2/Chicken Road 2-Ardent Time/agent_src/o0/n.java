package o0;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final o0.C0942a f8166a;

    /* renamed from: b, reason: collision with root package name */
    public final m0.d f8167b;

    public /* synthetic */ n(o0.C0942a c0942a, m0.d dVar) {
        this.f8166a = c0942a;
        this.f8167b = dVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != null && (obj instanceof o0.n)) {
            o0.n nVar = (o0.n) obj;
            if (p0.AbstractC0966r.e(this.f8166a, nVar.f8166a) && p0.AbstractC0966r.e(this.f8167b, nVar.f8167b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.f8166a, this.f8167b});
    }

    public final java.lang.String toString() {
        o0.i iVar = new o0.i(this);
        iVar.a(this.f8166a, "key");
        iVar.a(this.f8167b, "feature");
        return iVar.toString();
    }
}
