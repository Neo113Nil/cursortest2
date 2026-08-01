package sg.bigo.ads.m0;

import android.graphics.Rect;
import android.widget.RelativeLayout;
import sg.bigo.ads.q0.AbstractC5446j;

/* renamed from: sg.bigo.ads.m0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5349b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5353f f13110a;

    public RunnableC5349b(C5353f c5353f) {
        this.f13110a = c5353f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5353f c5353f = this.f13110a;
        RelativeLayout relativeLayout = c5353f.e;
        if (relativeLayout == null || c5353f.h > 0) {
            AbstractC5446j.a(c5353f.l);
            return;
        }
        if (!sg.bigo.ads.J0.a.a(new Rect(), relativeLayout)) {
            AbstractC5446j.a(2, null, this.f13110a.l, 500L);
            return;
        }
        AbstractC5446j.a(this.f13110a.l);
        this.f13110a.h = System.currentTimeMillis();
        C5353f c5353f2 = this.f13110a;
        c5353f2.a(1, c5353f2.i, 0L);
    }
}
