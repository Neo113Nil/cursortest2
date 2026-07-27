package sg.bigo.ads.v;

/* loaded from: classes3.dex */
public final class n extends sg.bigo.ads.E0.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f13351a;

    public n(u uVar) {
        this.f13351a = uVar;
    }

    @Override // sg.bigo.ads.E0.k
    public final long a() {
        return 500L;
    }

    @Override // sg.bigo.ads.E0.k
    public final boolean b(int i) {
        u uVar = this.f13351a;
        uVar.i = i;
        if (uVar.b(uVar.c)) {
            u uVar2 = this.f13351a;
            uVar2.c(uVar2.i);
        }
        t tVar = this.f13351a.m;
        if (tVar == null) {
            return false;
        }
        tVar.a();
        return false;
    }

    @Override // sg.bigo.ads.E0.k
    public final void a(int i) {
        t tVar = this.f13351a.m;
        if (tVar != null) {
            tVar.b();
        }
    }
}
