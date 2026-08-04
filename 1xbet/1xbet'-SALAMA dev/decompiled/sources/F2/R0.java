package F2;

import com.google.android.gms.ads.internal.client.zze;
import p167y2.C1059c;

/* JADX INFO: loaded from: classes.dex */
public final class R0 extends AbstractBinderC0255t0 {
    @Override // F2.InterfaceC0257u0
    public final void zze(zze zzeVar) {
        C1059c c1059c;
        R4.c cVar = T0.e().f2640g;
        if (cVar != null) {
            if (zzeVar == null) {
                c1059c = null;
            } else {
                c1059c = new C1059c(zzeVar.f10720a, zzeVar.f10721b, zzeVar.f10722c, null);
            }
            A5.p pVar = (A5.p) cVar.f6064b;
            if (c1059c != null) {
                pVar.error(Integer.toString(c1059c.f18144a), c1059c.f18145b, c1059c.f18146c);
            } else {
                pVar.success(null);
            }
        }
    }
}
