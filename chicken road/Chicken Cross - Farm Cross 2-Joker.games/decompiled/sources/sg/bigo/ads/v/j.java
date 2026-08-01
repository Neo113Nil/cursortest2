package sg.bigo.ads.v;

import android.content.Context;
import io.ktor.sse.ServerSentEventKt;
import sg.bigo.ads.C.x;
import sg.bigo.ads.K0.AbstractC4944a;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.h.X;

/* loaded from: classes3.dex */
public final class j extends g {
    public j(Context context, X x, String str, boolean z) {
        super(context, x, str, z);
    }

    @Override // sg.bigo.ads.v.g
    public final void a() {
        this.e.setVisibility(0);
        this.e.setText(AbstractC4944a.a(this.f13347a, this.j.b, "4." + (x.a(7, this.k) + 3)));
        if (this.c) {
            this.e.setTextColor(-1);
        }
        this.f.setVisibility(0);
        this.f.setImageResource(this.j.c);
        this.h.setVisibility(0);
        this.h.setText(((x.a(901, this.k) + 100) + "K") + ServerSentEventKt.SPACE + AbstractC4944a.a(this.f13347a, this.j.d, new Object[0]));
        if (this.c) {
            this.h.setTextColor(I.a(-1, "#9AFFFFFF"));
        }
        this.i.setVisibility(8);
    }
}
