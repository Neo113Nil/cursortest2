package sg.bigo.ads.h;

import android.graphics.Point;
import android.graphics.Rect;
import java.util.HashMap;

/* renamed from: sg.bigo.ads.h.l0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5184l0 implements sg.bigo.ads.f.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5190n0 f12903a;

    public C5184l0(C5190n0 c5190n0) {
        this.f12903a = c5190n0;
    }

    @Override // sg.bigo.ads.f.z
    public final void a(sg.bigo.ads.U.j jVar, sg.bigo.ads.P.f fVar) {
        int i;
        if (jVar != null) {
            Rect rect = this.f12903a.V;
            Point point = jVar.f12564a;
            if (point != null && jVar.b != null && rect != null && rect.contains(point.x, point.y)) {
                Point point2 = jVar.b;
                if (rect.contains(point2.x, point2.y)) {
                    i = 33;
                    this.f12903a.a(jVar, i, 1, fVar);
                }
            }
        }
        i = 0;
        this.f12903a.a(jVar, i, 1, fVar);
    }

    @Override // sg.bigo.ads.f.z
    public final void b() {
        this.f12903a.D();
        C5190n0 c5190n0 = this.f12903a;
        sg.bigo.ads.P.c cVar = c5190n0.k.f12482a;
        Object obj = c5190n0.N.get("show_proportion");
        if (obj == null) {
            obj = "";
        }
        String str = (String) obj;
        String o = this.f12903a.o();
        Object obj2 = this.f12903a.N.get("render_style");
        int intValue = ((Integer) (obj2 != null ? obj2 : 0)).intValue();
        HashMap a2 = sg.bigo.ads.s1.b.a(cVar, (sg.bigo.ads.Q.b) null, false);
        sg.bigo.ads.s1.b.a(a2, cVar, str, o, intValue);
        sg.bigo.ads.s1.b.a("06002043", a2);
    }

    @Override // sg.bigo.ads.f.z
    public final void c() {
        C5190n0 c5190n0 = this.f12903a;
        c5190n0.Z = true;
        if (c5190n0.s) {
            c5190n0.D();
        }
    }

    @Override // sg.bigo.ads.f.z
    public final void a() {
        sg.bigo.ads.f.z zVar = this.f12903a.X;
        if (zVar != null) {
            zVar.a();
        }
    }
}
