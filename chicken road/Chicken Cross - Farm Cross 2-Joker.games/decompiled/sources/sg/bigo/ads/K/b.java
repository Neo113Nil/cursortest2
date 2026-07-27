package sg.bigo.ads.K;

import android.app.Activity;
import android.util.Pair;
import sg.bigo.ads.C.l;
import sg.bigo.ads.I.w;
import sg.bigo.ads.h.AbstractC5163f0;
import sg.bigo.ads.h.C5182k1;
import sg.bigo.ads.h.C5185l1;
import sg.bigo.ads.h.Q1;
import sg.bigo.ads.i.C5231c;
import sg.bigo.ads.i.C5241m;
import sg.bigo.ads.l.C5289e;

/* loaded from: classes3.dex */
public final class b extends w {
    public final int x0;

    public b(Activity activity) {
        super(activity);
    }

    @Override // sg.bigo.ads.I.w, sg.bigo.ads.h.H2, sg.bigo.ads.h.AbstractC5204s, sg.bigo.ads.h.AbstractC5144a1, sg.bigo.ads.h.AbstractC5151c0
    public final void I() {
        super.I();
        C5289e c5289e = this.j0;
        c5289e.h = this.x0 * 1000;
        c5289e.c = 2;
    }

    @Override // sg.bigo.ads.h.H2
    public final C5231c L0() {
        Pair a2;
        AbstractC5163f0 abstractC5163f0 = this.e;
        if (abstractC5163f0 == null || (a2 = ((C5185l1) abstractC5163f0).a(this.l)) == null) {
            return null;
        }
        return (C5231c) a2.second;
    }

    @Override // sg.bigo.ads.h.H2
    public final C5241m N0() {
        Pair a2;
        AbstractC5163f0 abstractC5163f0 = this.e;
        if (abstractC5163f0 == null || (a2 = ((C5185l1) abstractC5163f0).a(this.l)) == null) {
            return null;
        }
        return (C5241m) a2.first;
    }

    @Override // sg.bigo.ads.h.H2
    public final void U0() {
        AbstractC5163f0 abstractC5163f0 = this.e;
        if (abstractC5163f0 != null) {
            l lVar = this.l;
            C5182k1 c5182k1 = ((C5185l1) abstractC5163f0).Z;
            if (c5182k1 != null) {
                c5182k1.b(lVar);
            }
        }
    }

    @Override // sg.bigo.ads.h.H2, sg.bigo.ads.h.AbstractC5204s
    public final Q1 b0() {
        Q1 b0 = super.b0();
        b0.c = this.x0;
        return b0;
    }

    @Override // sg.bigo.ads.h.AbstractC5151c0
    public final void z() {
    }

    public b(Activity activity, int i, boolean z) {
        super(activity);
        this.u0 = z;
        this.x0 = i;
    }
}
