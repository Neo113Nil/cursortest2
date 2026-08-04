package p154w;

/* JADX INFO: loaded from: classes.dex */
public class f extends e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f17242m;

    public f(n nVar) {
        super(nVar);
        if (nVar instanceof j) {
            this.f17235e = 2;
        } else {
            this.f17235e = 3;
        }
    }

    @Override // p154w.e
    public final void d(int i7) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.f17237g = i7;
        for (d dVar : this.f17240k) {
            dVar.a(dVar);
        }
    }
}
