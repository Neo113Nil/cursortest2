package sg.bigo.ads.api.core;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import sg.bigo.ads.K0.P;
import sg.bigo.ads.K0.X;
import sg.bigo.ads.P.k;
import sg.bigo.ads.P.l;
import sg.bigo.ads.P.m;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.e0.C5085c;
import sg.bigo.ads.h.AbstractC5151c0;
import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public abstract class BaseAdActivityImpl {

    /* renamed from: a, reason: collision with root package name */
    public final Activity f12687a;
    public int b = 0;
    public final C5085c c;

    public BaseAdActivityImpl(Activity activity) {
        this.f12687a = activity;
        this.c = Build.VERSION.SDK_INT >= 28 ? new C5085c(activity) : null;
        AbstractC5446j.a(2, new k(this));
    }

    public abstract void a(int i, int i2, Intent intent);

    public boolean a(MotionEvent motionEvent) {
        return false;
    }

    public abstract void b(boolean z);

    public final void p() {
        View decorView;
        if (Build.VERSION.SDK_INT >= 28 && (decorView = this.f12687a.getWindow().getDecorView()) != null) {
            decorView.post(new l(this, decorView));
        }
    }

    public final void q() {
        Window window;
        if (s() || (window = this.f12687a.getWindow()) == null) {
            return;
        }
        P.a(window);
    }

    public final boolean r() {
        return this.b == 1;
    }

    public boolean s() {
        return false;
    }

    public abstract void t();

    public abstract void u();

    public abstract void v();

    public abstract void w();

    public abstract void x();

    public abstract void y();

    public void a(AdCountDownButton adCountDownButton) {
        X.a(adCountDownButton, new m((AbstractC5151c0) this));
    }
}
