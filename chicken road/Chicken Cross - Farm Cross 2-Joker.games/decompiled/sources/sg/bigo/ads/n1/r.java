package sg.bigo.ads.n1;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public boolean f13218a = false;
    public final Handler b = new Handler(Looper.getMainLooper());
    public final ArrayList c = new ArrayList();
    public final p d = new p(this);

    public final synchronized boolean a() {
        sg.bigo.ads.r1.q qVar;
        int playStatus;
        if (this.c.isEmpty()) {
            return false;
        }
        Iterator it = this.c.iterator();
        View view = null;
        boolean z = false;
        int i = 0;
        while (it.hasNext()) {
            View view2 = (View) ((WeakReference) it.next()).get();
            if (view2 instanceof sg.bigo.ads.r1.q) {
                z = view2.getContext() != null && sg.bigo.ads.I0.f.j(view2.getContext().getApplicationContext());
                float f = 0.0f;
                if (sg.bigo.ads.J0.a.a(new Rect(), view2)) {
                    float height = view2.getHeight() * 1.0f * view2.getWidth();
                    float height2 = r7.height() * 1.0f * r7.width();
                    if (height > 0.0f) {
                        f = height2 / height;
                    }
                }
                int i2 = (int) (f * 100.0f);
                if (i2 >= i && i2 >= 50 && z) {
                    if (i2 == i) {
                        sg.bigo.ads.r1.q qVar2 = (sg.bigo.ads.r1.q) view;
                        if (qVar2.f && qVar2.getPlayStatus() == 2) {
                            qVar2.a();
                        }
                    } else {
                        i = i2;
                    }
                    view = view2;
                }
                sg.bigo.ads.r1.q qVar3 = (sg.bigo.ads.r1.q) view2;
                if (qVar3.getPlayStatus() == 2) {
                    qVar3.a();
                }
            } else {
                it.remove();
            }
        }
        if (view != null && (playStatus = (qVar = (sg.bigo.ads.r1.q) view).getPlayStatus()) != 2 && playStatus != 5 && playStatus != 0) {
            qVar.c();
        }
        return z;
    }

    public final synchronized void b() {
        this.b.removeCallbacksAndMessages(null);
        a();
    }

    public final synchronized void c() {
        b();
        this.b.post(this.d);
    }

    public final synchronized void a(sg.bigo.ads.r1.q qVar) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            View view = (View) ((WeakReference) it.next()).get();
            if (view == null) {
                it.remove();
            } else if (view == qVar) {
                AbstractC5496a.b("VideoPlayerManager", "register playerView exist already");
                return;
            }
        }
        this.c.add(new WeakReference(qVar));
        this.c.size();
        c();
        if (!this.f13218a) {
            this.f13218a = true;
            sg.bigo.ads.I0.f.a(qVar.getContext().getApplicationContext(), this);
        }
    }
}
