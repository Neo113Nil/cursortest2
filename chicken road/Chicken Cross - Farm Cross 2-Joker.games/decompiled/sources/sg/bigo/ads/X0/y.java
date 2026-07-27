package sg.bigo.ads.X0;

import android.os.SystemClock;
import java.util.concurrent.ConcurrentHashMap;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public final class y implements x {

    /* renamed from: a, reason: collision with root package name */
    public final String f12618a;
    public final x b;
    public final sg.bigo.ads.U.h c;
    public final sg.bigo.ads.T0.g d;
    public final sg.bigo.ads.T0.n e;
    public final sg.bigo.ads.Q0.n f;
    public final z g;

    public y(String str, x xVar, sg.bigo.ads.T0.g gVar, sg.bigo.ads.T0.n nVar, sg.bigo.ads.U.h hVar, sg.bigo.ads.Q0.n nVar2, z zVar) {
        this.f12618a = str;
        this.b = xVar;
        this.c = hVar;
        this.d = gVar;
        this.e = nVar;
        this.f = nVar2;
        this.g = zVar;
        t.c.b.compareAndSet(-1, 0);
    }

    @Override // sg.bigo.ads.X0.x
    public final void a(int i, int i2, String str) {
        t tVar = t.c;
        String str2 = this.f12618a;
        tVar.getClass();
        if (1101 == i2 || 1105 == i2) {
            ConcurrentHashMap concurrentHashMap = tVar.f12614a;
            if (concurrentHashMap == null) {
                concurrentHashMap = new ConcurrentHashMap();
                tVar.f12614a = concurrentHashMap;
            }
            if (str2 != null && t.a(concurrentHashMap, str2)) {
                concurrentHashMap.put(str2, Long.valueOf(SystemClock.elapsedRealtime()));
            }
            if (tVar.b.compareAndSet(0, -1)) {
                AbstractC5496a.a("ConfigInitProcessor", "Failed to init config and set status.");
            }
        }
        x xVar = this.b;
        if (xVar != null) {
            xVar.a(i, i2, str);
        }
    }

    @Override // sg.bigo.ads.X0.x
    public final void a(int i) {
        t tVar = t.c;
        ConcurrentHashMap concurrentHashMap = tVar.f12614a;
        if (concurrentHashMap != null) {
            concurrentHashMap.clear();
        }
        tVar.b.set(1);
        x xVar = this.b;
        if (xVar != null) {
            xVar.a(i);
        }
        if (1 == sg.bigo.ads.O.g.f12472a.Q) {
            sg.bigo.ads.S0.h hVar = sg.bigo.ads.S0.g.f12539a;
            sg.bigo.ads.Q0.n nVar = this.f;
            sg.bigo.ads.U.h hVar2 = this.c;
            sg.bigo.ads.T0.g gVar = this.d;
            sg.bigo.ads.T0.n nVar2 = this.e;
            z zVar = this.g;
            hVar.f12540a = nVar;
            hVar.b = hVar2;
            hVar.c = gVar;
            hVar.d = nVar2;
            hVar.e = zVar;
        }
    }
}
