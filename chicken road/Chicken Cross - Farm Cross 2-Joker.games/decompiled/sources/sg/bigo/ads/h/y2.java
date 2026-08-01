package sg.bigo.ads.h;

import android.view.View;

/* loaded from: classes3.dex */
public final class y2 extends sg.bigo.ads.K0.E {
    public final /* synthetic */ View i;
    public final /* synthetic */ H2 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(H2 h2, long j, View view) {
        super(j, 1000L);
        this.j = h2;
        this.i = view;
    }

    @Override // sg.bigo.ads.K0.E
    public final void a(long j) {
    }

    @Override // sg.bigo.ads.K0.E
    public final void c() {
        H2 h2 = this.j;
        h2.a(h2.R, new x2(this));
    }
}
