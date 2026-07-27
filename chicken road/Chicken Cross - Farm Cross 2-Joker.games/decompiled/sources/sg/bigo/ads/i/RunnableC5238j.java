package sg.bigo.ads.i;

import android.content.Context;
import android.widget.FrameLayout;
import sg.bigo.ads.j.C5252f;
import sg.bigo.ads.k1.A;
import sg.bigo.ads.k1.C5270k;
import sg.bigo.ads.k1.C5271l;

/* renamed from: sg.bigo.ads.i.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5238j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5239k f12985a;

    public RunnableC5238j(C5239k c5239k) {
        this.f12985a = c5239k;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C5239k c5239k = this.f12985a;
            C5252f c5252f = c5239k.c.p;
            Context context = c5239k.b;
            if (context == null) {
                c5252f.getClass();
                return;
            }
            if (c5252f.m == null) {
                c5252f.b(context);
            }
            A a2 = c5252f.m;
            if (a2 == null) {
                return;
            }
            C5270k a3 = C5271l.a(a2.b);
            a2.i = a3;
            if (a3 != null) {
                this.f12985a.c.r = 1;
                a2.k.a(a2.i);
                a2.c.addView(a2.i, new FrameLayout.LayoutParams(-1, -1));
            }
            c5252f.f();
        } catch (Throwable unused) {
        }
    }
}
