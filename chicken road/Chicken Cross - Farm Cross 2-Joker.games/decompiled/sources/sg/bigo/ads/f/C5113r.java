package sg.bigo.ads.f;

import java.util.HashMap;

/* renamed from: sg.bigo.ads.f.r, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5113r implements z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f12774a;

    public C5113r(v vVar) {
        this.f12774a = vVar;
    }

    @Override // sg.bigo.ads.f.z
    public final void a() {
    }

    @Override // sg.bigo.ads.f.z
    public final void a(sg.bigo.ads.U.j jVar, sg.bigo.ads.P.f fVar) {
        this.f12774a.a(jVar, 0, 1, fVar);
    }

    @Override // sg.bigo.ads.f.z
    public final void b() {
        this.f12774a.z();
        v vVar = this.f12774a;
        sg.bigo.ads.P.c cVar = vVar.k.f12482a;
        Object obj = vVar.N.get("show_proportion");
        if (obj == null) {
            obj = "";
        }
        String str = (String) obj;
        String o = this.f12774a.o();
        Object obj2 = this.f12774a.N.get("render_style");
        int intValue = ((Integer) (obj2 != null ? obj2 : 0)).intValue();
        HashMap a2 = sg.bigo.ads.s1.b.a(cVar, (sg.bigo.ads.Q.b) null, false);
        sg.bigo.ads.s1.b.a(a2, cVar, str, o, intValue);
        sg.bigo.ads.s1.b.a("06002043", a2);
    }

    @Override // sg.bigo.ads.f.z
    public final void c() {
        v vVar = this.f12774a;
        vVar.V = true;
        if (vVar.s) {
            vVar.z();
        }
    }
}
