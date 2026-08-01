package sg.bigo.ads.w;

import sg.bigo.ads.f.z;

/* loaded from: classes3.dex */
public final class g implements z {

    /* renamed from: a, reason: collision with root package name */
    public final int f13366a;
    public final sg.bigo.ads.C.l b;
    public final i c;

    public g(i iVar, sg.bigo.ads.C.l lVar, int i) {
        this.f13366a = i;
        this.b = lVar;
        this.c = iVar;
    }

    @Override // sg.bigo.ads.f.z
    public final void a(sg.bigo.ads.U.j jVar, sg.bigo.ads.P.f fVar) {
        sg.bigo.ads.C.l lVar = this.b;
        if (lVar != null) {
            lVar.a(jVar, this.f13366a, 14, fVar);
        }
    }

    @Override // sg.bigo.ads.f.z
    public final void b() {
    }

    @Override // sg.bigo.ads.f.z
    public final void c() {
    }

    @Override // sg.bigo.ads.f.z
    public final void a() {
        i iVar = this.c;
        if (iVar != null) {
            iVar.b(true, true);
        }
    }
}
