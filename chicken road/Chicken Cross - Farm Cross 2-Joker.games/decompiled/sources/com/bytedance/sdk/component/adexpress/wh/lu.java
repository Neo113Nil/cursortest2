package com.bytedance.sdk.component.adexpress.wh;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class lu extends LinearLayout {
    private ImageView gm;
    private LinearLayout kj;
    private com.bytedance.sdk.component.utils.yt oo;
    private int ork;
    private TextView pcc;
    private pcc qf;
    private TextView sf;
    private JSONObject tmg;
    private int vh;
    private TextView vj;
    private int vy;
    private TextView wh;

    public interface pcc {
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
    }

    public lu(Context context, View view, int i, int i2, int i3, JSONObject jSONObject) {
        super(context);
        this.vy = i;
        this.ork = i2;
        this.vh = i3;
        this.tmg = jSONObject;
        pcc(context, view);
    }

    protected void pcc(Context context, View view) {
        addView(view);
        this.kj = (LinearLayout) findViewById(2097610727);
        this.gm = (ImageView) findViewById(2097610725);
        this.pcc = (TextView) findViewById(2097610724);
        this.sf = (TextView) findViewById(2097610726);
        this.vj = (TextView) findViewById(2097610723);
        this.wh = (TextView) findViewById(2097610728);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor("#57000000"));
        this.kj.setBackground(gradientDrawable);
    }

    public void setShakeText(String str) {
        if (TextUtils.isEmpty(str)) {
            this.vj.setVisibility(8);
            this.wh.setVisibility(8);
        } else {
            this.vj.setText(str);
        }
    }

    public LinearLayout getShakeLayout() {
        return this.kj;
    }

    public void setOnShakeViewListener(pcc pccVar) {
        this.qf = pccVar;
    }

    public void pcc() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.start();
        postDelayed(new AnonymousClass1(), 500L);
    }

    /* renamed from: com.bytedance.sdk.component.adexpress.wh.lu$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {
        AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (lu.this.gm != null) {
                final RotateAnimation rotateAnimation = new RotateAnimation(-14.0f, 14.0f, 1, 0.9f, 1, 0.9f);
                rotateAnimation.setInterpolator(new sf(null));
                rotateAnimation.setDuration(1000L);
                rotateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.bytedance.sdk.component.adexpress.wh.lu.1.1
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        lu.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.wh.lu.1.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                lu.this.gm.startAnimation(rotateAnimation);
                            }
                        }, 250L);
                    }
                });
                lu.this.gm.startAnimation(rotateAnimation);
            }
        }
    }

    private static class sf implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return f <= 0.25f ? (f * (-2.0f)) + 0.5f : f <= 0.5f ? (f * 4.0f) - 1.0f : f <= 0.75f ? (f * (-4.0f)) + 3.0f : (f * 2.0f) - 1.5f;
        }

        private sf() {
        }

        /* synthetic */ sf(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            if (this.oo == null) {
                this.oo = new com.bytedance.sdk.component.utils.yt(getContext().getApplicationContext(), 1);
            }
            new Object() { // from class: com.bytedance.sdk.component.adexpress.wh.lu.2
            };
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }
}
