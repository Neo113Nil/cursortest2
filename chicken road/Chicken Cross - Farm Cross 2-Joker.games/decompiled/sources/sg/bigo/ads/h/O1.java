package sg.bigo.ads.h;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import androidx.core.view.ViewCompat;
import java.util.WeakHashMap;
import sg.bigo.ads.K0.AbstractC4962t;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.common.view.RoundedImageView;
import sg.bigo.ads.e0.C5085c;

/* loaded from: classes3.dex */
public abstract class O1 extends W {
    public final sg.bigo.ads.C.l d;
    public final sg.bigo.ads.T0.q e;
    public C5085c f;
    public long g = 0;
    public final WeakHashMap h = new WeakHashMap();

    public O1(sg.bigo.ads.C.l lVar, sg.bigo.ads.T0.q qVar) {
        this.d = lVar;
        this.e = qVar;
    }

    public static F1 b(AbstractC5144a1 abstractC5144a1) {
        if (abstractC5144a1 != null) {
            return abstractC5144a1.X();
        }
        return null;
    }

    public final boolean a(sg.bigo.ads.C.l lVar, AbstractC5144a1 abstractC5144a1, ViewGroup viewGroup, View view, int i, int i2, int i3, View... viewArr) {
        F1 b = b(abstractC5144a1);
        if (b == null) {
            return false;
        }
        b.d = lVar;
        b.a(viewGroup, view, null, i, i2, i3, viewArr);
        sg.bigo.ads.K0.X.a(view, new H1((sg.bigo.ads.m.y0) this));
        return true;
    }

    public abstract int c();

    public boolean d() {
        return false;
    }

    public boolean e() {
        return false;
    }

    public boolean a(AbstractC5144a1 abstractC5144a1, ViewGroup viewGroup, ViewGroup viewGroup2, E1 e1, int i, int i2, int i3, View... viewArr) {
        F1 b = b(abstractC5144a1);
        if (b == null) {
            return false;
        }
        b.a(viewGroup, viewGroup2, e1, i, i2, i3, viewArr);
        sg.bigo.ads.K0.X.a(viewGroup2, new G1(this));
        if (!e()) {
            return true;
        }
        F1.b((View) viewGroup2);
        return true;
    }

    public static void a(AbstractC5144a1 abstractC5144a1, ValueCallback valueCallback) {
        F1 b = b(abstractC5144a1);
        if (b == null) {
            valueCallback.onReceiveValue(AbstractC4962t.a(1, 1, Bitmap.Config.ARGB_8888));
        } else {
            synchronized (b) {
                b.a(new C1(b, valueCallback));
            }
        }
    }

    public final sg.bigo.ads.U.r a(AbstractC5144a1 abstractC5144a1) {
        sg.bigo.ads.U.r rVar;
        if (d()) {
            F1 b = b(abstractC5144a1);
            synchronized (b) {
                Bitmap bitmap = b.n;
                rVar = bitmap != null ? new sg.bigo.ads.U.r(bitmap.getWidth(), b.n.getHeight()) : new sg.bigo.ads.U.r(-1, -1);
            }
            if (rVar.a()) {
                return rVar;
            }
        }
        return AbstractC5164f1.a(this.d);
    }

    public final void a(AbstractC5144a1 abstractC5144a1, RoundedImageView roundedImageView) {
        int i;
        Bitmap bitmap;
        if (abstractC5144a1 == null || roundedImageView == null) {
            return;
        }
        int c = c();
        if (c == 2) {
            roundedImageView.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            return;
        }
        if (c == 3) {
            if (d() && (i = b(abstractC5144a1).o) != 0) {
                roundedImageView.setBackgroundColor(i);
                return;
            }
            Integer a2 = AbstractC5164f1.a((NativeAd) this.d);
            if (a2 != null) {
                roundedImageView.setBackgroundColor(a2.intValue());
                return;
            } else {
                a(abstractC5144a1, new K1(this, roundedImageView));
                return;
            }
        }
        if (c != 4) {
            roundedImageView.setBackgroundColor(-1);
            return;
        }
        M1 m1 = new M1(this, roundedImageView);
        if (d()) {
            F1 b = b(abstractC5144a1);
            synchronized (b) {
                Bitmap bitmap2 = b.n;
                bitmap = (bitmap2 == null || bitmap2.isRecycled()) ? null : b.n;
            }
            if (bitmap != null) {
                m1.onReceiveValue(bitmap);
                return;
            }
        }
        a(abstractC5144a1, m1);
    }
}
