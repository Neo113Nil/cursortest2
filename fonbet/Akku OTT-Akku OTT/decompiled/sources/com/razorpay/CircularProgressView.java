package com.razorpay;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* loaded from: classes4.dex */
class CircularProgressView extends View {
    private static final float l$1_I$l$ = 15.0f;
    private int $$_$I1l1_;
    private boolean $I__I;
    private float $l$I1I11I1;
    private int $l_I$1;
    private int $lll$_lIl;
    private ValueAnimator I1I_l1;
    private int I1lII;
    private float IIII$1$_I;
    private RectF I__1l;
    private float _$_l_$1l$;
    private boolean _1__;
    private int __II$$;
    private int __Il11I1l;
    private float ___Il$;
    private Context __l1_;
    private int _l_1l__;
    private float _l_l_1IlI;
    private Paint _llI;
    private float l$$$11Il1;
    private float lI_l1Il_;
    private ValueAnimator llIl;
    private AnimatorSet ll_$$111;

    public CircularProgressView(Context context) {
        super(context);
        this._l_1l__ = 0;
        init(null, 0, context);
    }

    private void __l1_() {
        this._llI.setColor(this.__II$$);
        this._llI.setStyle(Paint.Style.STROKE);
        this._llI.setStrokeWidth(this.$lll$_lIl);
        this._llI.setStrokeCap(Paint.Cap.BUTT);
    }

    private void l$1_I$l$(AttributeSet attributeSet, int i, Context context) {
        getResources();
        this.$l$I1I11I1 = 0.0f;
        this.lI_l1Il_ = 100.0f;
        this.$lll$_lIl = l$1_I$l$(context, 3);
        this._1__ = true;
        this.$I__I = true;
        this._l_l_1IlI = -90.0f;
        this.l$$$11Il1 = -90.0f;
        this.__II$$ = Color.parseColor("#4aa3df");
        this.__Il11I1l = 4000;
        this.$l_I$1 = 5000;
        this.I1lII = 500;
        this.$$_$I1l1_ = 3;
    }

    public int getColor() {
        return this.__II$$;
    }

    public float getMaxProgress() {
        return this.lI_l1Il_;
    }

    public float getProgress() {
        return this.$l$I1I11I1;
    }

    public int getThickness() {
        return this.$lll$_lIl;
    }

    public void init(AttributeSet attributeSet, int i, Context context) {
        l$1_I$l$(attributeSet, i, context);
        this._llI = new Paint(1);
        __l1_();
        this.I__1l = new RectF();
    }

    public boolean isIndeterminate() {
        return this._1__;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.$I__I) {
            startAnimation();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stopAnimation();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = ((isInEditMode() ? this.$l$I1I11I1 : this.___Il$) / this.lI_l1Il_) * 360.0f;
        if (this._1__) {
            canvas.drawArc(this.I__1l, this.l$$$11Il1 + this.IIII$1$_I, this._$_l_$1l$, false, this._llI);
        } else {
            canvas.drawArc(this.I__1l, this.l$$$11Il1, f, false, this._llI);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int measuredWidth = getMeasuredWidth() - paddingRight;
        int measuredHeight = getMeasuredHeight() - paddingBottom;
        if (measuredWidth >= measuredHeight) {
            measuredWidth = measuredHeight;
        }
        this._l_1l__ = measuredWidth;
        setMeasuredDimension(paddingRight + measuredWidth, measuredWidth + paddingBottom);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i >= i2) {
            i = i2;
        }
        this._l_1l__ = i;
        l$1_I$l$();
    }

    public void resetAnimation() {
        ValueAnimator valueAnimator = this.llIl;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.llIl.cancel();
        }
        ValueAnimator valueAnimator2 = this.I1I_l1;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            this.I1I_l1.cancel();
        }
        AnimatorSet animatorSet = this.ll_$$111;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.ll_$$111.cancel();
        }
        int i = 0;
        if (this._1__) {
            this._$_l_$1l$ = l$1_I$l$;
            this.ll_$$111 = new AnimatorSet();
            AnimatorSet animatorSet2 = null;
            while (i < this.$$_$I1l1_) {
                AnimatorSet l$1_I$l$2 = l$1_I$l$(i);
                AnimatorSet.Builder play = this.ll_$$111.play(l$1_I$l$2);
                if (animatorSet2 != null) {
                    play.after(animatorSet2);
                }
                i++;
                animatorSet2 = l$1_I$l$2;
            }
            this.ll_$$111.addListener(new AnimatorListenerAdapter() { // from class: com.razorpay.CircularProgressView.4
                boolean wasCancelled = false;

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    this.wasCancelled = true;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    if (this.wasCancelled) {
                        return;
                    }
                    CircularProgressView.this.resetAnimation();
                }
            });
            this.ll_$$111.start();
            return;
        }
        float f = this._l_l_1IlI;
        this.l$$$11Il1 = f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, 360.0f + f);
        this.llIl = ofFloat;
        ofFloat.setDuration(this.$l_I$1);
        this.llIl.setInterpolator(new DecelerateInterpolator(2.0f));
        this.llIl.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.razorpay.CircularProgressView.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator3) {
                CircularProgressView.this.l$$$11Il1 = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                CircularProgressView.this.invalidate();
            }
        });
        this.llIl.start();
        this.___Il$ = 0.0f;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, this.$l$I1I11I1);
        this.I1I_l1 = ofFloat2;
        ofFloat2.setDuration(this.I1lII);
        this.I1I_l1.setInterpolator(new LinearInterpolator());
        this.I1I_l1.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.razorpay.CircularProgressView.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator3) {
                CircularProgressView.this.___Il$ = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                CircularProgressView.this.invalidate();
            }
        });
        this.I1I_l1.start();
    }

    public void setColor(int i) {
        this.__II$$ = i;
        __l1_();
        invalidate();
    }

    public void setIndeterminate(boolean z) {
        boolean z2 = this._1__ == z;
        this._1__ = z;
        if (z2) {
            resetAnimation();
        }
    }

    public void setMaxProgress(float f) {
        this.lI_l1Il_ = f;
        invalidate();
    }

    public void setProgress(float f) {
        this.$l$I1I11I1 = f;
        if (!this._1__) {
            ValueAnimator valueAnimator = this.I1I_l1;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.I1I_l1.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.___Il$, f);
            this.I1I_l1 = ofFloat;
            ofFloat.setDuration(this.I1lII);
            this.I1I_l1.setInterpolator(new LinearInterpolator());
            this.I1I_l1.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.razorpay.CircularProgressView.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    CircularProgressView.this.___Il$ = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    CircularProgressView.this.invalidate();
                }
            });
            this.I1I_l1.start();
        }
        invalidate();
    }

    public void setThickness(int i) {
        this.$lll$_lIl = i;
        __l1_();
        l$1_I$l$();
        invalidate();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        int visibility = getVisibility();
        super.setVisibility(i);
        if (i != visibility) {
            if (i == 0) {
                resetAnimation();
            } else if (i == 8 || i == 4) {
                stopAnimation();
            }
        }
    }

    public void startAnimation() {
        resetAnimation();
    }

    public void stopAnimation() {
        ValueAnimator valueAnimator = this.llIl;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.llIl = null;
        }
        ValueAnimator valueAnimator2 = this.I1I_l1;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.I1I_l1 = null;
        }
        AnimatorSet animatorSet = this.ll_$$111;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.ll_$$111 = null;
        }
    }

    public CircularProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this._l_1l__ = 0;
        init(attributeSet, 0, context);
    }

    public CircularProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this._l_1l__ = 0;
        init(attributeSet, i, context);
    }

    private void l$1_I$l$() {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        RectF rectF = this.I__1l;
        int i = this.$lll$_lIl;
        int i2 = this._l_1l__;
        rectF.set(paddingLeft + i, paddingTop + i, (i2 - paddingLeft) - i, (i2 - paddingTop) - i);
    }

    private AnimatorSet l$1_I$l$(float f) {
        final float f2 = (((r0 - 1) * 360.0f) / this.$$_$I1l1_) + l$1_I$l$;
        final float a = android.support.v4.media.b.a(f2, l$1_I$l$, f, -90.0f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(l$1_I$l$, f2);
        ofFloat.setDuration((this.__Il11I1l / this.$$_$I1l1_) / 2);
        ofFloat.setInterpolator(new DecelerateInterpolator(1.0f));
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.razorpay.CircularProgressView.5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                CircularProgressView.this._$_l_$1l$ = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CircularProgressView.this.invalidate();
            }
        });
        int i = this.$$_$I1l1_;
        float f3 = (0.5f + f) * 720.0f;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat((f * 720.0f) / i, f3 / i);
        ofFloat2.setDuration((this.__Il11I1l / this.$$_$I1l1_) / 2);
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.razorpay.CircularProgressView.6
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                CircularProgressView.this.IIII$1$_I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            }
        });
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(a, (a + f2) - l$1_I$l$);
        ofFloat3.setDuration((this.__Il11I1l / this.$$_$I1l1_) / 2);
        ofFloat3.setInterpolator(new DecelerateInterpolator(1.0f));
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.razorpay.CircularProgressView.7
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                CircularProgressView.this.l$$$11Il1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CircularProgressView circularProgressView = CircularProgressView.this;
                circularProgressView._$_l_$1l$ = (f2 - circularProgressView.l$$$11Il1) + a;
                CircularProgressView.this.invalidate();
            }
        });
        int i2 = this.$$_$I1l1_;
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f3 / i2, ((f + 1.0f) * 720.0f) / i2);
        ofFloat4.setDuration((this.__Il11I1l / this.$$_$I1l1_) / 2);
        ofFloat4.setInterpolator(new LinearInterpolator());
        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.razorpay.CircularProgressView.8
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                CircularProgressView.this.IIII$1$_I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.play(ofFloat3).with(ofFloat4).after(ofFloat2);
        return animatorSet;
    }

    private int l$1_I$l$(Context context, int i) {
        return (int) TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }
}
