package sg.bigo.ads.r1;

import sg.bigo.ads.K0.I;
import sg.bigo.ads.q0.AbstractC5446j;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13272a;
    public final /* synthetic */ g b;

    public e(g gVar, int i) {
        this.b = gVar;
        this.f13272a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a();
        int i = this.f13272a;
        if (i != 9 && i != 10) {
            if (i == 12) {
                g gVar = this.b;
                gVar.a(gVar.b);
                return;
            } else if (i != 15) {
                return;
            }
        }
        g gVar2 = this.b;
        gVar2.a(gVar2.b);
        g gVar3 = this.b;
        String str = gVar3.c;
        if (I.a((CharSequence) str)) {
            AbstractC5496a.a("MediaPlayerWrapper", "invalidate file path, set data source failed");
        } else {
            gVar3.c = str;
            AbstractC5446j.a(1, new d(gVar3, str));
        }
    }
}
