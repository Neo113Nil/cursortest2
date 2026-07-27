package sg.bigo.ads.y;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.TextView;
import com.applovin.sdk.AppLovinErrorCodes;
import java.util.List;
import sg.bigo.ads.E0.p;
import sg.bigo.ads.K0.AbstractC4962t;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.K0.InterpolatorC4950g;
import sg.bigo.ads.K0.X;
import sg.bigo.ads.K0.z;
import sg.bigo.ads.R;
import sg.bigo.ads.T0.q;
import sg.bigo.ads.U.r;
import sg.bigo.ads.common.view.RoundedImageView;
import sg.bigo.ads.h.AbstractC5140Q;
import sg.bigo.ads.h.AbstractC5144a1;
import sg.bigo.ads.h.AbstractC5164f1;
import sg.bigo.ads.h.AbstractC5204s;
import sg.bigo.ads.h.C5136M;
import sg.bigo.ads.h.F1;
import sg.bigo.ads.h.O1;
import sg.bigo.ads.h.T;
import sg.bigo.ads.h.Y;
import sg.bigo.ads.u.AbstractC5490k;

/* loaded from: classes3.dex */
public abstract class i extends O1 {
    public final r i;
    public final Y j;
    public ViewGroup k;
    public ViewGroup l;
    public RoundedImageView m;
    public RoundedImageView n;
    public Button o;
    public TextView p;
    public ViewGroup q;
    public AnimationSet r;
    public Rect s;

    public i(sg.bigo.ads.C.l lVar, q qVar, r rVar) {
        super(lVar, qVar);
        this.i = rVar;
        sg.bigo.ads.P.c e = lVar.e();
        Integer a2 = z.a(qVar.a("layer.gp_element"));
        this.j = new Y(a2 != null ? a2.intValue() : 0, 0, e != null ? ((sg.bigo.ads.U0.b) e).U : "");
    }

    public void a(int i, boolean z, boolean z2) {
        ViewGroup viewGroup = this.l;
        if (viewGroup == null) {
            return;
        }
        sg.bigo.ads.C.f.a(viewGroup, 12);
        sg.bigo.ads.C.f.a(this.o, 17);
        sg.bigo.ads.C.f.a(this.m, 17);
        if (z2) {
            sg.bigo.ads.C.f.a(this.k, this.l, 10, this.d, i);
        } else {
            sg.bigo.ads.C.f.a(this.k, this.l, 10, AbstractC5144a1.p, 0);
        }
        sg.bigo.ads.C.f.a(this.n, 5);
        RoundedImageView roundedImageView = this.n;
        if (roundedImageView != null) {
            if (z) {
                sg.bigo.ads.C.f.a(this.k, roundedImageView, 10, this.d, i);
            } else {
                sg.bigo.ads.C.f.a(this.k, roundedImageView, 10, AbstractC5144a1.p, 0);
            }
        }
    }

    public void b(AbstractC5204s abstractC5204s) {
        Bitmap bitmap;
        RoundedImageView roundedImageView = (RoundedImageView) this.l.findViewById(R.id.inter_click_guide_image);
        this.n = roundedImageView;
        if (roundedImageView != null) {
            roundedImageView.setTag(5);
            h hVar = new h(this);
            F1 b = O1.b(abstractC5204s);
            synchronized (b) {
                Bitmap bitmap2 = b.n;
                bitmap = (bitmap2 == null || bitmap2.isRecycled()) ? null : b.n;
            }
            if (bitmap != null) {
                hVar.onReceiveValue(bitmap);
            } else {
                O1.a(abstractC5204s, hVar);
            }
        }
    }

    public final int c(AbstractC5144a1 abstractC5144a1) {
        int i;
        q qVar = this.e;
        if (qVar == null) {
            return -16736769;
        }
        Integer a2 = z.a(qVar.a("layer.cta_color"));
        int intValue = a2 != null ? a2.intValue() : 0;
        return (intValue == 3 && d() && (i = O1.b(abstractC5144a1).o) != 0) ? i : AbstractC5164f1.a(this.d, intValue, null);
    }

    public abstract void d(AbstractC5144a1 abstractC5144a1);

    @Override // sg.bigo.ads.h.O1
    public final boolean e() {
        return true;
    }

    public abstract int f();

    public void g() {
        Context context = this.l.getContext();
        RoundedImageView roundedImageView = (RoundedImageView) this.l.findViewById(R.id.inter_icon);
        this.m = roundedImageView;
        if (roundedImageView != null) {
            roundedImageView.setCornerRadius(AbstractC4963u.a(context, 22));
            this.m.setStrokeWidth(AbstractC4963u.a(context, 1));
            this.m.setStrokeColor(134217728);
        }
    }

    public final void h() {
        int i;
        ViewStub viewStub;
        View inflate;
        ViewStub viewStub2;
        View inflate2;
        ViewGroup viewGroup;
        q qVar = this.e;
        if (qVar != null) {
            Integer a2 = z.a(qVar.a("layer.guided_click"));
            i = a2 != null ? a2.intValue() : 0;
        } else {
            i = 2;
        }
        if (i == 1) {
            Button button = this.o;
            if (button != null) {
                AbstractC5140Q.a(button);
                return;
            }
            return;
        }
        if (i != 3) {
            ViewGroup viewGroup2 = this.l;
            if (viewGroup2 == null || this.o == null || (viewStub2 = (ViewStub) viewGroup2.findViewById(R.id.inter_gesture_zoom_layout)) == null || (inflate2 = viewStub2.inflate()) == null) {
                return;
            }
            inflate2.setAlpha(0.0f);
            sg.bigo.ads.Z.c.a(inflate2, 99.0f);
            View findViewById = inflate2.findViewById(R.id.inter_click_guide);
            View findViewById2 = inflate2.findViewById(R.id.inter_click_ripple);
            if (findViewById == null || findViewById2 == null) {
                return;
            }
            int a3 = AbstractC4963u.a(this.l.getContext(), 50);
            inflate2.setPadding(a3, a3, 0, 0);
            Button button2 = this.o;
            if (button2 != null && (viewGroup = this.l) != null) {
                Point a4 = X.a(viewGroup, button2);
                Rect rect = new Rect(a4.x, a4.y, this.o.getMeasuredWidth() + a4.x, this.o.getMeasuredHeight() + a4.y);
                Rect rect2 = new Rect(0, 0, findViewById2.getLayoutParams().width, findViewById2.getLayoutParams().height);
                int centerY = ((rect.centerY() - rect2.centerY()) + rect2.top) - a3;
                int centerX = ((rect.centerX() - rect2.centerX()) + rect2.left) - a3;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) inflate2.getLayoutParams();
                marginLayoutParams.topMargin = centerY;
                marginLayoutParams.leftMargin = (int) (centerX - (rect.width() * 0.15f));
                inflate2.requestLayout();
            }
            AbstractC5140Q.a(0, 255, 200L, new C5513e(inflate2), new C5514f(inflate2, findViewById, findViewById2));
            return;
        }
        ViewGroup viewGroup3 = this.l;
        if (viewGroup3 == null || (viewStub = (ViewStub) viewGroup3.findViewById(R.id.inter_gesture_slide_layout)) == null || (inflate = viewStub.inflate()) == null) {
            return;
        }
        sg.bigo.ads.Z.c.a(inflate, 99.0f);
        View findViewById3 = inflate.findViewById(R.id.inter_click_guide);
        if (findViewById3 == null) {
            return;
        }
        inflate.setTag(16);
        sg.bigo.ads.C.f.a(this.k, inflate, 10, this.d, 0);
        int max = Math.max(1300, Math.max(600, 600));
        sg.bigo.ads.V.a aVar = new sg.bigo.ads.V.a(-(findViewById3.getContext().getResources().getDisplayMetrics().heightPixels >> 1));
        aVar.setRepeatCount(-1);
        aVar.setInterpolator(new C5136M(1000, max - 1000));
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setRepeatCount(-1);
        long j = 300;
        long j2 = max + AppLovinErrorCodes.INCENTIVIZED_NO_AD_PRELOADED;
        alphaAnimation.setInterpolator(new InterpolatorC4950g(j, 0L, j2));
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.1f, 1.0f, 0.1f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setRepeatCount(-1);
        scaleAnimation.setInterpolator(new InterpolatorC4950g(j, 0L, j2));
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setRepeatCount(-1);
        alphaAnimation2.setInterpolator(new InterpolatorC4950g(j, j2, 0L));
        AnimationSet animationSet = new AnimationSet(false);
        animationSet.setDuration(max);
        animationSet.setRepeatCount(-1);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(aVar);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(alphaAnimation2);
        findViewById3.startAnimation(animationSet);
        this.r = animationSet;
        a(true);
    }

    public abstract boolean i();

    public void a(AbstractC5204s abstractC5204s) {
        Button button = (Button) this.l.findViewById(R.id.inter_btn_cta);
        this.o = button;
        if (button != null) {
            int c = c(abstractC5204s);
            float a2 = AbstractC4963u.a(this.l.getContext(), 8);
            this.o.setBackground(AbstractC4962t.a(a2, a2, a2, a2, (Rect) null, c));
            T.a(this.o, p.b(c));
        }
    }

    public final void a(boolean z) {
        AnimationSet animationSet = this.r;
        if (animationSet == null || this.s == null) {
            return;
        }
        List<Animation> animations = animationSet.getAnimations();
        for (int i = 0; animations != null && i < animations.size(); i++) {
            Animation animation = animations.get(i);
            if (animation instanceof sg.bigo.ads.V.a) {
                sg.bigo.ads.V.a aVar = (sg.bigo.ads.V.a) animation;
                int height = this.s.height();
                aVar.c = height;
                if (z) {
                    aVar.d = height;
                }
            }
        }
    }

    @Override // sg.bigo.ads.h.O1
    public final int c() {
        int i;
        q qVar = this.e;
        if (qVar != null) {
            Integer a2 = z.a(qVar.a("layer.mediaview_colour"));
            i = a2 != null ? a2.intValue() : 0;
        } else {
            i = 3;
        }
        return AbstractC5490k.a(i);
    }
}
