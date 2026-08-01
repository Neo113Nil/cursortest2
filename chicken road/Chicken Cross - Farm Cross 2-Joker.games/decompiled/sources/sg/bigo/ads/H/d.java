package sg.bigo.ads.H;

import android.content.Context;
import sg.bigo.ads.Y0.D;
import sg.bigo.ads.api.popup.PopupAd;
import sg.bigo.ads.h.C5190n0;

/* loaded from: classes3.dex */
public final class d extends C5190n0 implements PopupAd {
    public d(sg.bigo.ads.P.j jVar) {
        super(jVar);
    }

    @Override // sg.bigo.ads.h.C5190n0, sg.bigo.ads.h.AbstractC5163f0
    public final Class B() {
        return c.class;
    }

    @Override // sg.bigo.ads.h.C5190n0
    public final int C() {
        return 3;
    }

    @Override // sg.bigo.ads.h.AbstractC5163f0
    public final void a(Context context) {
        if (D.a(context, c.class, this)) {
            return;
        }
        b(2004, 0, "This ad cannot be open");
    }

    @Override // sg.bigo.ads.h.AbstractC5163f0
    public final int z() {
        return this.k.b.c;
    }
}
