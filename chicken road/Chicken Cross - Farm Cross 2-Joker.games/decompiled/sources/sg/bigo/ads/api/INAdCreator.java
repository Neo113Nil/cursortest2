package sg.bigo.ads.api;

import sg.bigo.ads.H.h;
import sg.bigo.ads.P.j;
import sg.bigo.ads.h.C5185l1;
import sg.bigo.ads.h.InterfaceC5159e0;

/* loaded from: classes3.dex */
public class INAdCreator implements InterfaceC5159e0 {
    @Override // sg.bigo.ads.h.InterfaceC5159e0
    public C5185l1 getAdInstance(j jVar) {
        return ((sg.bigo.ads.U0.b) jVar.f12482a).l == 20 ? new h(jVar) : new C5185l1(jVar);
    }
}
