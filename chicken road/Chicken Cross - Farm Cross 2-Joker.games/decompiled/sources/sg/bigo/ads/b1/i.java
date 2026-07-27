package sg.bigo.ads.b1;

import java.util.Map;
import sg.bigo.ads.K0.A;

/* loaded from: classes3.dex */
public abstract class i extends AbstractC5032e {
    public final sg.bigo.ads.P0.b k;
    public final Map l;

    public i(Map map, sg.bigo.ads.U.h hVar, sg.bigo.ads.Q0.n nVar, sg.bigo.ads.P0.b bVar) {
        super(hVar, nVar, 15000L);
        this.k = bVar;
        this.l = map;
    }

    @Override // sg.bigo.ads.b1.AbstractC5032e
    public void a(C5030c c5030c) {
        for (String str : this.l.keySet()) {
            c5030c.a(this.l.get(str), str);
        }
    }

    @Override // sg.bigo.ads.b1.AbstractC5032e
    public final void a(int i, int i2, String str) {
        this.k.a(this.f12697a, i, i2, str, null);
    }

    @Override // sg.bigo.ads.b1.AbstractC5032e
    public final void a(Map map, String str) {
        sg.bigo.ads.P0.b bVar = this.k;
        bVar.getClass();
        bVar.a(this.f12697a, (String) A.b(new String[]{str}));
    }
}
