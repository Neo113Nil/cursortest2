package sg.bigo.ads.K;

import android.app.Activity;
import sg.bigo.ads.I.s;
import sg.bigo.ads.h.Q1;

/* loaded from: classes3.dex */
public final class a extends s {
    public final int h0;

    public a(Activity activity) {
        super(activity);
    }

    @Override // sg.bigo.ads.I.s, sg.bigo.ads.h.C5149b2, sg.bigo.ads.h.AbstractC5204s
    public final Q1 b0() {
        Q1 b0 = super.b0();
        b0.c = this.h0;
        return b0;
    }

    @Override // sg.bigo.ads.h.AbstractC5151c0
    public final void z() {
    }

    public a(Activity activity, int i, boolean z) {
        super(activity);
        this.g0 = z;
        this.h0 = i;
    }
}
