package sg.bigo.ads.v;

/* loaded from: classes3.dex */
public final class s extends sg.bigo.ads.E0.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sg.bigo.ads.E0.k f13356a;

    public s(n nVar) {
        this.f13356a = nVar;
    }

    @Override // sg.bigo.ads.E0.k
    public final long a() {
        sg.bigo.ads.E0.k kVar = this.f13356a;
        if (kVar != null) {
            return kVar.a();
        }
        return -1L;
    }

    @Override // sg.bigo.ads.E0.k
    public final boolean b(int i) {
        sg.bigo.ads.E0.k kVar = this.f13356a;
        if (kVar == null) {
            return true;
        }
        kVar.b(i);
        return true;
    }

    @Override // sg.bigo.ads.E0.k
    public final void a(int i) {
        sg.bigo.ads.E0.k kVar = this.f13356a;
        if (kVar != null) {
            kVar.a(i);
        }
    }
}
