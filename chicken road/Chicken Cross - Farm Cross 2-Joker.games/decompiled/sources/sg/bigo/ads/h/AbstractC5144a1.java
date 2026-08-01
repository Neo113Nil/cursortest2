package sg.bigo.ads.h;

import android.app.Activity;
import android.os.SystemClock;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.widget.Button;
import sg.bigo.ads.R;
import sg.bigo.ads.api.VideoController;
import sg.bigo.ads.n.AbstractC5391n;
import sg.bigo.ads.w.InterfaceC5495a;

/* renamed from: sg.bigo.ads.h.a1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5144a1 extends AbstractC5151c0 {
    public static final Z0 p = new Z0();
    public sg.bigo.ads.C.l l;
    public ViewGroup m;
    public Button n;
    public F1 o;

    public AbstractC5144a1(Activity activity) {
        super(activity);
    }

    @Override // sg.bigo.ads.h.AbstractC5151c0
    public final sg.bigo.ads.e.h F() {
        return this.l;
    }

    @Override // sg.bigo.ads.h.AbstractC5151c0
    public void I() {
        this.l = ((C5185l1) this.e).D();
    }

    @Override // sg.bigo.ads.h.AbstractC5151c0
    public final boolean J() {
        return this instanceof InterfaceC5495a;
    }

    @Override // sg.bigo.ads.h.AbstractC5151c0
    public boolean L() {
        return this instanceof sg.bigo.ads.w.b;
    }

    @Override // sg.bigo.ads.h.AbstractC5151c0
    public void R() {
        F1 f1 = this.o;
        if (f1 != null) {
            f1.a();
        }
        AbstractC5163f0 abstractC5163f0 = this.e;
        if (abstractC5163f0 == null || !((C5185l1) abstractC5163f0).A()) {
            super.R();
            return;
        }
        this.i.set(true);
        this.j = (SystemClock.elapsedRealtime() - this.k) + this.j;
    }

    @Override // sg.bigo.ads.h.AbstractC5151c0
    public void S() {
        super.S();
        F1 f1 = this.o;
        if (f1 != null) {
            f1.b();
        }
    }

    public abstract int T();

    public ValueCallback U() {
        return null;
    }

    public int V() {
        return 1;
    }

    public final VideoController W() {
        sg.bigo.ads.C.l lVar = this.l;
        if (lVar != null) {
            return lVar.getVideoController();
        }
        return null;
    }

    public final F1 X() {
        if (this.o == null) {
            if (r() || K()) {
                this.o = new F1(this.l);
            } else {
                this.o = AbstractC5391n.a(this.l, T());
            }
            this.o.e = this.c;
        }
        return this.o;
    }

    @Override // sg.bigo.ads.h.AbstractC5151c0
    public void g(int i) {
        ViewGroup viewGroup = (ViewGroup) this.f12687a.findViewById(R.id.inter_native_ad_view);
        this.m = viewGroup;
        if (viewGroup == null) {
            a("can not find ad root view.");
        }
    }

    @Override // sg.bigo.ads.h.AbstractC5151c0, sg.bigo.ads.api.core.BaseAdActivityImpl
    public void w() {
        super.w();
        VideoController W = W();
        if (W != null) {
            W.setVideoLifeCallback(null);
            W.setLoadHTMLCallback(null);
            W.setProgressChangeListener(null);
        }
    }
}
