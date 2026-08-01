package sg.bigo.ads.h;

import android.view.View;

/* loaded from: classes3.dex */
public final class T1 extends sg.bigo.ads.K0.E {
    public final /* synthetic */ View i;
    public final /* synthetic */ C5149b2 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T1(C5149b2 c5149b2, long j, View view) {
        super(j, 1000L);
        this.j = c5149b2;
        this.i = view;
    }

    @Override // sg.bigo.ads.K0.E
    public final void a(long j) {
    }

    @Override // sg.bigo.ads.K0.E
    public final void c() {
        C5149b2 c5149b2 = this.j;
        c5149b2.a(c5149b2.R, new S1(this));
    }
}
