package sg.bigo.ads.v;

import android.content.Context;
import sg.bigo.ads.C.x;
import sg.bigo.ads.K0.AbstractC4944a;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.h.X;

/* loaded from: classes3.dex */
public final class h extends g {
    public h(Context context, X x, String str, boolean z) {
        super(context, x, str, z);
    }

    @Override // sg.bigo.ads.v.g
    public final void a() {
        this.e.setVisibility(0);
        this.e.setText(AbstractC4944a.a(this.f13347a, this.j.b, (x.a(100, this.k) + 1) + "M+"));
        if (this.c) {
            this.e.setTextColor(-1);
        }
        this.f.setVisibility(8);
        this.h.setVisibility(0);
        this.h.setText(this.j.d);
        if (this.c) {
            this.h.setTextColor(I.a(-1, "#9AFFFFFF"));
        }
        this.i.setVisibility(8);
    }
}
