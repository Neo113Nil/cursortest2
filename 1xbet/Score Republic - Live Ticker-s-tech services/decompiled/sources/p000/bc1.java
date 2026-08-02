package p000;

import android.R;
import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class bc1 implements View.OnTouchListener {

    /* JADX INFO: renamed from: j */
    public final int f819j;

    /* JADX INFO: renamed from: k */
    public final int f820k;

    /* JADX INFO: renamed from: l */
    public final int f821l;

    /* JADX INFO: renamed from: m */
    public final long f822m;

    /* JADX INFO: renamed from: n */
    public final View f823n;

    /* JADX INFO: renamed from: o */
    public final nu1 f824o;

    /* JADX INFO: renamed from: p */
    public int f825p = 1;

    /* JADX INFO: renamed from: q */
    public float f826q;

    /* JADX INFO: renamed from: r */
    public float f827r;

    /* JADX INFO: renamed from: s */
    public boolean f828s;

    /* JADX INFO: renamed from: t */
    public int f829t;

    /* JADX INFO: renamed from: u */
    public VelocityTracker f830u;

    /* JADX INFO: renamed from: v */
    public float f831v;

    public bc1(View view, nu1 nu1Var) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        this.f819j = viewConfiguration.getScaledTouchSlop();
        this.f820k = viewConfiguration.getScaledMinimumFlingVelocity() * 16;
        this.f821l = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f822m = view.getContext().getResources().getInteger(R.integer.config_shortAnimTime);
        this.f823n = view;
        this.f824o = nu1Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m636a(float f, float f2, C0159e2 c0159e2) {
        float fMo637b = mo637b();
        float f3 = f - fMo637b;
        float alpha = this.f823n.getAlpha();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(this.f822m);
        valueAnimatorOfFloat.addUpdateListener(new yb1(this, fMo637b, f3, alpha, f2 - alpha));
        if (c0159e2 != null) {
            valueAnimatorOfFloat.addListener(c0159e2);
        }
        valueAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: b */
    public float mo637b() {
        return this.f823n.getTranslationX();
    }

    /* JADX INFO: renamed from: c */
    public void mo638c(float f) {
        this.f823n.setTranslationX(f);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        motionEvent.offsetLocation(this.f831v, 0.0f);
        int i = this.f825p;
        View view2 = this.f823n;
        if (i < 2) {
            this.f825p = view2.getWidth();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f826q = motionEvent.getRawX();
            this.f827r = motionEvent.getRawY();
            this.f824o.getClass();
            VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
            this.f830u = velocityTrackerObtain;
            velocityTrackerObtain.addMovement(motionEvent);
            return false;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                VelocityTracker velocityTracker = this.f830u;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                    float rawX = motionEvent.getRawX() - this.f826q;
                    float rawY = motionEvent.getRawY() - this.f827r;
                    float fAbs = Math.abs(rawX);
                    int i2 = this.f819j;
                    if (fAbs > i2 && Math.abs(rawY) < Math.abs(rawX) / 2.0f) {
                        this.f828s = true;
                        if (rawX <= 0.0f) {
                            i2 = -i2;
                        }
                        this.f829t = i2;
                        view2.getParent().requestDisallowInterceptTouchEvent(true);
                        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                        motionEventObtain.setAction((motionEvent.getActionIndex() << 8) | 3);
                        view2.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (this.f828s) {
                        this.f831v = rawX;
                        mo638c(rawX - this.f829t);
                        view2.setAlpha(Math.max(0.0f, Math.min(1.0f, 1.0f - ((Math.abs(rawX) * 2.0f) / this.f825p))));
                        return true;
                    }
                }
            } else if (actionMasked == 3 && this.f830u != null) {
                m636a(0.0f, 1.0f, null);
                this.f830u.recycle();
                this.f830u = null;
                this.f831v = 0.0f;
                this.f826q = 0.0f;
                this.f827r = 0.0f;
                this.f828s = false;
                return false;
            }
        } else if (this.f830u != null) {
            float rawX2 = motionEvent.getRawX() - this.f826q;
            this.f830u.addMovement(motionEvent);
            this.f830u.computeCurrentVelocity(1000);
            float xVelocity = this.f830u.getXVelocity();
            float fAbs2 = Math.abs(xVelocity);
            float fAbs3 = Math.abs(this.f830u.getYVelocity());
            if (Math.abs(rawX2) > this.f825p / 2 && this.f828s) {
                z2 = rawX2 > 0.0f;
                z = true;
            } else if (this.f820k > fAbs2 || fAbs2 > this.f821l || fAbs3 >= fAbs2 || fAbs3 >= fAbs2 || !this.f828s) {
                z = false;
                z2 = false;
            } else {
                z = ((xVelocity > 0.0f ? 1 : (xVelocity == 0.0f ? 0 : -1)) < 0) == ((rawX2 > 0.0f ? 1 : (rawX2 == 0.0f ? 0 : -1)) < 0);
                z2 = this.f830u.getXVelocity() > 0.0f;
            }
            if (z) {
                int i3 = this.f825p;
                if (!z2) {
                    i3 = -i3;
                }
                m636a(i3, 0.0f, new C0159e2(1, this));
            } else if (this.f828s) {
                m636a(0.0f, 1.0f, null);
            }
            VelocityTracker velocityTracker2 = this.f830u;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
            }
            this.f830u = null;
            this.f831v = 0.0f;
            this.f826q = 0.0f;
            this.f827r = 0.0f;
            this.f828s = false;
            return false;
        }
        return false;
    }
}
