package sg.bigo.ads.w1;

import com.facebook.login.LoginLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import sg.bigo.ads.x0.AbstractC5503c;
import sg.bigo.ads.x0.C5508h;
import sg.bigo.ads.x0.InterfaceC5501a;

/* loaded from: classes3.dex */
public final class b extends AbstractC5503c {
    public final ArrayList b = new ArrayList();
    public int c = -1;
    public boolean d = false;
    public final /* synthetic */ c e;
    public final /* synthetic */ int f;
    public final /* synthetic */ String g;
    public final /* synthetic */ InterfaceC5501a h;
    public final /* synthetic */ String i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;
    public final /* synthetic */ Map m;
    public final /* synthetic */ boolean n;

    public b(c cVar, int i, String str, sg.bigo.ads.B0.d dVar, String str2, boolean z, int i2, int i3, Map map, boolean z2) {
        this.e = cVar;
        this.f = i;
        this.g = str;
        this.h = dVar;
        this.i = str2;
        this.j = z;
        this.k = i2;
        this.l = i3;
        this.m = map;
        this.n = z2;
    }

    @Override // sg.bigo.ads.x0.AbstractC5503c
    public final sg.bigo.ads.C0.c a(sg.bigo.ads.C0.a aVar) {
        return aVar;
    }

    @Override // sg.bigo.ads.x0.AbstractC5503c
    public final void a(sg.bigo.ads.B0.c cVar, C5508h c5508h) {
        sg.bigo.ads.B0.a aVar = (sg.bigo.ads.B0.a) cVar;
        if (!this.d) {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                c cVar2 = this.e;
                if ((cVar2 != null && cVar2.a(intValue)) || super.b(aVar, intValue)) {
                    this.c = intValue;
                    this.d = true;
                }
            }
            c cVar3 = this.e;
            if (cVar3 != null) {
                cVar3.b();
            }
            d.a(this.f, this.g, LoginLogger.EVENT_EXTRAS_FAILURE, this.h, this.i, this.j, this.k, this.l, this.m, c5508h.f13385a, c5508h.b, this.n);
            return;
        }
        c cVar4 = this.e;
        if (cVar4 != null) {
            cVar4.a();
        }
        d.a(this.f, this.g, "success", this.h, this.i, this.j, this.k, this.l, this.m, this.c, "Something wrong occurs when handling the request, but it is still successful", this.n);
    }

    @Override // sg.bigo.ads.x0.AbstractC5503c
    public final boolean b(sg.bigo.ads.B0.c cVar, int i) {
        sg.bigo.ads.B0.a aVar = (sg.bigo.ads.B0.a) cVar;
        this.b.add(Integer.valueOf(i));
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            c cVar2 = this.e;
            if ((cVar2 != null && cVar2.a(intValue)) || super.b(aVar, intValue)) {
                this.c = intValue;
                this.d = true;
                return true;
            }
        }
        return false;
    }

    @Override // sg.bigo.ads.x0.AbstractC5503c
    public final void a(sg.bigo.ads.B0.c cVar, int i) {
        this.b.add(Integer.valueOf(i));
    }

    @Override // sg.bigo.ads.x0.AbstractC5503c
    public final void a(sg.bigo.ads.B0.c cVar, sg.bigo.ads.C0.c cVar2) {
        sg.bigo.ads.C0.a aVar = (sg.bigo.ads.C0.a) cVar2;
        c cVar3 = this.e;
        if (cVar3 != null) {
            cVar3.a();
        }
        d.a(this.f, this.g, "success", this.h, this.i, this.j, this.k, this.l, this.m, aVar.f12244a, "success", this.n);
    }
}
