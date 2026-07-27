package sg.bigo.ads.v;

import android.content.Context;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.h.X;

/* loaded from: classes3.dex */
public final class i extends g {
    public i(Context context, X x, String str, boolean z) {
        super(context, x, str, z);
    }

    @Override // sg.bigo.ads.v.g
    public final void a() {
        this.e.setVisibility(8);
        this.f.setVisibility(0);
        this.f.setImageResource(this.j.c);
        this.h.setVisibility(0);
        this.h.setText(this.j.d);
        if (this.c) {
            this.h.setTextColor(I.a(-1, "#9AFFFFFF"));
        }
        this.i.setVisibility(0);
        this.i.setImageResource(this.j.e);
    }
}
