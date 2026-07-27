package sg.bigo.ads.x;

import android.graphics.Point;
import sg.bigo.ads.d1.u;
import sg.bigo.ads.w.InterfaceC5495a;

/* loaded from: classes3.dex */
public final class l implements u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f13376a;

    public l(q qVar) {
        this.f13376a = qVar;
    }

    @Override // sg.bigo.ads.d1.u
    public final void a(int i, int i2, int i3, int i4, int i5, int i6) {
        if (this.f13376a.u != null) {
            sg.bigo.ads.U.j jVar = new sg.bigo.ads.U.j(new Point(i3, i4), new Point(i, i2));
            q qVar = this.f13376a;
            qVar.u.a(qVar.v, qVar.A, i5, i6, jVar, qVar.r, qVar);
        }
    }

    @Override // sg.bigo.ads.d1.u
    public final void a(sg.bigo.ads.U.j jVar) {
        q qVar = this.f13376a;
        InterfaceC5495a interfaceC5495a = qVar.u;
        if (interfaceC5495a != null) {
            interfaceC5495a.a(qVar.v, qVar.A, 1, 5, new sg.bigo.ads.U.j(), qVar.r, qVar);
        }
    }
}
