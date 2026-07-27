package sg.bigo.ads.s1;

import java.util.AbstractMap;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.U.h;
import sg.bigo.ads.q0.AbstractC5446j;
import sg.bigo.ads.u1.g;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public final class d {
    public static final d e = new d();

    /* renamed from: a, reason: collision with root package name */
    public sg.bigo.ads.t1.b f13306a;
    public g b;
    public final AtomicBoolean c = new AtomicBoolean(false);
    public h d;

    public final void a(String str, AbstractMap abstractMap) {
        if ("06002007".equals(str) && sg.bigo.ads.F0.a.f()) {
            AbstractC5446j.a(3, null, new c(this, str, abstractMap), 0L);
            return;
        }
        if (this.f13306a == null) {
            AbstractC5496a.a("Stats", "mConfig is null, eventId =" + str);
            return;
        }
        if (!sg.bigo.ads.F0.a.f() || "06002066".equals(str)) {
            if (!this.c.get()) {
                AbstractC5496a.a("Stats", "please execute initStatic first");
                return;
            }
            if (I.a((CharSequence) str)) {
                AbstractC5496a.a("Stats", "eventId is empty or events is null, eventId =" + str);
                return;
            }
            sg.bigo.ads.t1.a aVar = (sg.bigo.ads.t1.a) this.f13306a.c.get(str);
            if (!(aVar == null ? false : aVar.b)) {
                AbstractC5496a.a("Stats", "not hit report eventId=" + str);
                return;
            }
            g gVar = this.b;
            if (gVar != null) {
                sg.bigo.ads.v1.c.f13361a.submit(new sg.bigo.ads.v1.a(new sg.bigo.ads.u1.b(gVar, str, abstractMap)));
            }
        }
    }
}
