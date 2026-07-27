package sg.bigo.ads.v;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import sg.bigo.ads.K0.AbstractC4944a;
import sg.bigo.ads.K0.AbstractC4962t;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.K0.X;
import sg.bigo.ads.common.view.AdImageView;
import sg.bigo.ads.common.view.FixContentFrameLayout;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13357a;
    public int b;
    public int c;
    public final int d;
    public final RoundedFrameLayout e;
    public final FixContentFrameLayout f;
    public final View g;
    public final AdImageView h;
    public int i;
    public int j;
    public Bitmap k;
    public int l;
    public t m;
    public final boolean n;
    public ValueAnimator o;
    public ValueAnimator p;
    public long q = 0;
    public boolean r = false;

    public u(Context context, int i, boolean z, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8;
        this.f13357a = context;
        this.n = z;
        this.d = i3;
        RoundedFrameLayout roundedFrameLayout = (RoundedFrameLayout) AbstractC4944a.a(context, i4, null, false);
        this.e = roundedFrameLayout;
        this.f = (FixContentFrameLayout) roundedFrameLayout.findViewById(i5);
        this.g = roundedFrameLayout.findViewById(i6);
        this.h = (AdImageView) roundedFrameLayout.findViewById(i7);
        d(i);
        if (i2 == Integer.MIN_VALUE) {
            c(0);
        } else if (i2 != 4) {
            if (i2 == 1) {
                i8 = -1;
            } else if (i2 != 2) {
                i2 = 3;
            } else {
                i8 = ViewCompat.MEASURED_STATE_MASK;
            }
            c(i8);
        }
        this.c = i2;
        this.l = 255;
        X.a(roundedFrameLayout, new l(this));
        roundedFrameLayout.setTag(-188383023, this);
    }

    public abstract boolean a();

    public final boolean a(int i) {
        return this.r ? i == 5 : i == 4;
    }

    public final boolean b(int i) {
        return this.r ? i == 4 : i == 3;
    }

    public final void c(int i) {
        if (a()) {
            this.h.post(new p(this, i));
        }
    }

    public final void d(int i) {
        FixContentFrameLayout fixContentFrameLayout;
        boolean z;
        this.b = i;
        if (a()) {
            int a2 = AbstractC4963u.a(this.f13357a, 12);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f.getLayoutParams();
            layoutParams.gravity = 17;
            layoutParams.topMargin = a2;
            layoutParams.leftMargin = a2;
            layoutParams.rightMargin = a2;
            layoutParams.bottomMargin = a2;
            layoutParams.height = -2;
            layoutParams.width = -2;
            this.f.setLayoutParams(layoutParams);
            fixContentFrameLayout = this.f;
            z = true;
        } else {
            fixContentFrameLayout = this.f;
            z = false;
        }
        fixContentFrameLayout.setFixContent(z);
    }

    public final void a(Bitmap bitmap) {
        t tVar;
        boolean z = true;
        boolean z2 = false;
        boolean z3 = (this.q != 0 ? SystemClock.elapsedRealtime() - this.q : 0L) > 300;
        boolean a2 = a(this.d);
        int i = ViewCompat.MEASURED_STATE_MASK;
        if (a2 || a(this.c)) {
            Context context = this.f13357a;
            AbstractC5446j.e();
            this.k = AbstractC4962t.a(context, bitmap);
            if (a(this.d)) {
                Integer a3 = sg.bigo.ads.E0.p.a(this.k);
                this.j = a3 != null ? a3.intValue() : -16777216;
            } else {
                this.j = ViewCompat.MEASURED_STATE_MASK;
            }
            m mVar = new m(this);
            if (z3) {
                ValueAnimator valueAnimator = this.p;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
                this.p = ofInt;
                ofInt.setInterpolator(new LinearInterpolator());
                this.p.addUpdateListener(new q(this, mVar));
                this.p.addListener(new r(mVar));
                this.p.setDuration(500L);
                this.p.start();
            } else {
                mVar.b(255);
                mVar.a(255);
            }
            z2 = true;
        }
        if (b(this.d) || b(this.c)) {
            Integer a4 = sg.bigo.ads.E0.p.a(bitmap);
            if (a4 != null) {
                i = a4.intValue();
            }
            n nVar = new n(this);
            if (z3) {
                ValueAnimator valueAnimator2 = this.o;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                this.o = sg.bigo.ads.E0.p.a(this.h, i, new s(nVar));
            } else {
                nVar.b(i);
                nVar.a(i);
            }
        } else {
            z = z2;
        }
        if (z || (tVar = this.m) == null) {
            return;
        }
        tVar.b();
    }

    public final void a(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        sg.bigo.ads.L0.d dVar = (sg.bigo.ads.L0.d) this.g.getLayoutParams();
        if (dVar.f12407a == i || dVar.b == i2) {
            return;
        }
        dVar.f12407a = i;
        dVar.b = i2;
        this.g.setLayoutParams(dVar);
    }
}
