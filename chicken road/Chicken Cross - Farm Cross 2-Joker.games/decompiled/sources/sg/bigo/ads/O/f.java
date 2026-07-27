package sg.bigo.ads.O;

import sg.bigo.ads.p0.AbstractC5429c;

/* loaded from: classes3.dex */
public abstract class f {
    public static int a() {
        sg.bigo.ads.T0.g gVar = g.f12472a;
        sg.bigo.ads.T0.f fVar = gVar != null ? gVar.K : null;
        int i = 0;
        int i2 = (fVar == null || fVar.f12552a != 1) ? 0 : 1;
        int i3 = (fVar == null || fVar.b != 1) ? 0 : 1;
        if (fVar != null && fVar.c == 1) {
            i = 1;
        }
        return (AbstractC5429c.a(AbstractC5429c.h) ? AbstractC5429c.a() : 2) | (i << 4) | (i3 << 3) | (i2 << 2);
    }
}
