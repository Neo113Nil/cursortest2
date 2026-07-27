package sg.bigo.ads.J;

import android.app.Activity;
import android.util.Pair;
import sg.bigo.ads.C.l;
import sg.bigo.ads.D.k;
import sg.bigo.ads.I.x;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.h.AbstractC5163f0;
import sg.bigo.ads.h.AbstractC5204s;
import sg.bigo.ads.w.i;

/* loaded from: classes3.dex */
public final class b extends i {
    public boolean t0;
    public boolean u0;

    public b(Activity activity) {
        super(activity);
        this.t0 = false;
        this.u0 = false;
    }

    @Override // sg.bigo.ads.w.i
    public final Pair I0() {
        l D = this.b0.D();
        if (D == null) {
            return null;
        }
        Object eVar = D instanceof sg.bigo.ads.D.i ? new e(this.f12687a, this) : D instanceof k ? new h(this.f12687a, this) : null;
        if (eVar == null) {
            return null;
        }
        return new Pair(D, eVar);
    }

    @Override // sg.bigo.ads.w.i
    public final void K0() {
        if (this.t0) {
            return;
        }
        AbstractC5163f0 abstractC5163f0 = this.e;
        if (abstractC5163f0 instanceof x) {
            this.t0 = true;
            ((x) abstractC5163f0).G();
        }
    }

    @Override // sg.bigo.ads.w.i
    public final void L0() {
        if (this.t0) {
            return;
        }
        AbstractC5163f0 abstractC5163f0 = this.e;
        if (abstractC5163f0 instanceof x) {
            this.t0 = true;
            ((x) abstractC5163f0).G();
        }
    }

    @Override // sg.bigo.ads.w.i, sg.bigo.ads.h.AbstractC5204s, sg.bigo.ads.h.AbstractC5144a1, sg.bigo.ads.h.AbstractC5151c0
    public final void R() {
        if (this.u0) {
            return;
        }
        AdCountDownButton adCountDownButton = this.g;
        if (adCountDownButton != null && !adCountDownButton.c) {
            adCountDownButton.a();
        }
        AbstractC5204s abstractC5204s = this.a0;
        if (abstractC5204s instanceof h) {
            ((h) abstractC5204s).R();
        } else if (abstractC5204s instanceof e) {
            ((e) abstractC5204s).R();
        } else {
            super.R();
        }
    }

    @Override // sg.bigo.ads.w.i, sg.bigo.ads.h.AbstractC5204s, sg.bigo.ads.h.AbstractC5144a1, sg.bigo.ads.h.AbstractC5151c0
    public final void S() {
        if (this.u0) {
            return;
        }
        AdCountDownButton adCountDownButton = this.g;
        if (adCountDownButton != null && !adCountDownButton.c) {
            adCountDownButton.b();
        }
        AbstractC5204s abstractC5204s = this.a0;
        if (abstractC5204s instanceof h) {
            ((h) abstractC5204s).S();
        } else if (abstractC5204s instanceof e) {
            ((e) abstractC5204s).S();
        } else {
            super.S();
        }
    }

    @Override // sg.bigo.ads.w.i
    public final boolean b(boolean z, boolean z2) {
        boolean b = super.b(z, z2);
        if (!b || this.k0) {
            return b;
        }
        if (!z2) {
            new sg.bigo.ads.I.l(this.f12687a).a(new a(this));
        }
        return false;
    }
}
