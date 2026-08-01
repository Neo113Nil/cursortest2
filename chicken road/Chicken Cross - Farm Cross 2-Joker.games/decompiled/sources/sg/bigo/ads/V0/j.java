package sg.bigo.ads.V0;

/* loaded from: classes3.dex */
public final class j extends sg.bigo.ads.P0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sg.bigo.ads.U.k f12590a;

    public j(sg.bigo.ads.U.k kVar) {
        this.f12590a = kVar;
    }

    @Override // sg.bigo.ads.P0.d
    public final void a(int i, int i2, int i3, String str, Object obj) {
        sg.bigo.ads.U.k kVar = this.f12590a;
        if (kVar != null) {
            kVar.a(i2, i3, str);
        }
    }

    @Override // sg.bigo.ads.P0.b
    public final void a(int i, String str) {
        sg.bigo.ads.U.k kVar = this.f12590a;
        if (kVar != null) {
            kVar.a();
        }
    }
}
