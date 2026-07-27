package sg.bigo.ads.api;

import sg.bigo.ads.H.d;
import sg.bigo.ads.P.j;
import sg.bigo.ads.h.C5190n0;
import sg.bigo.ads.h.InterfaceC5159e0;

/* loaded from: classes3.dex */
public class IBAdCreator implements InterfaceC5159e0 {
    @Override // sg.bigo.ads.h.InterfaceC5159e0
    public C5190n0 getAdInstance(j jVar) {
        return ((sg.bigo.ads.U0.b) jVar.f12482a).l == 20 ? new d(jVar) : new C5190n0(jVar);
    }
}
