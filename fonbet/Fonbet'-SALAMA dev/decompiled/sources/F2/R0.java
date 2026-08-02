package F2;

import com.google.android.gms.ads.internal.client.zze;
import y2.C1799c;

/* loaded from: classes.dex */
public final class R0 extends AbstractBinderC0255t0 {
    @Override // F2.InterfaceC0257u0
    public final void zze(zze zzeVar) {
        C1799c c1799c;
        R4.c cVar = T0.e().f2640g;
        if (cVar != null) {
            if (zzeVar == null) {
                c1799c = null;
            } else {
                c1799c = new C1799c(zzeVar.f10720a, zzeVar.f10721b, zzeVar.f10722c, null);
            }
            A5.p pVar = (A5.p) cVar.f6064b;
            if (c1799c != null) {
                pVar.error(Integer.toString(c1799c.f18138a), c1799c.f18139b, c1799c.f18140c);
            } else {
                pVar.success(null);
            }
        }
    }
}
