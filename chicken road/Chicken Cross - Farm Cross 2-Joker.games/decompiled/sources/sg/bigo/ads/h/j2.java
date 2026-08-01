package sg.bigo.ads.h;

import sg.bigo.ads.i.C5241m;
import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public final class j2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5241m f12897a;
    public final /* synthetic */ H2 b;

    public j2(H2 h2, C5241m c5241m) {
        this.b = h2;
        this.f12897a = c5241m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC5446j.a(this.b.f0);
        C5241m c5241m = this.f12897a;
        if (c5241m.e == this) {
            c5241m.e = null;
        }
        AbstractC5446j.b(new i2(this));
    }
}
