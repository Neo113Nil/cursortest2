package com.mbridge.msdk.config.dynamic.baseview.rewardpopview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.mbridge.msdk.config.dynamic.baseview.ComponentRelativeLayout;
import com.mbridge.msdk.config.dynamic.baseview.rewardpopview.MBGradientAndShadowTextView;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;

/* loaded from: classes6.dex */
public class MBAcquireRewardPopView extends ComponentRelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private final String f9090a;
    private float b;
    private float c;
    private float d;
    private float e;
    private int f;
    private boolean g;
    private boolean h;
    private final View.OnClickListener i;
    private Runnable j;
    private Runnable k;
    private View.OnTouchListener l;
    private final View.OnClickListener m;
    private final View.OnClickListener n;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBAcquireRewardPopView.g(MBAcquireRewardPopView.this);
            throw null;
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
            mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.j);
            if (TextUtils.isEmpty((String) view.getTag())) {
                return;
            }
            MBAcquireRewardPopView.g(MBAcquireRewardPopView.this);
            throw null;
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MBAcquireRewardPopView.this.f <= 0) {
                MBAcquireRewardPopView.g(MBAcquireRewardPopView.this);
                throw null;
            }
            MBAcquireRewardPopView.j(MBAcquireRewardPopView.this);
            MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
            mBAcquireRewardPopView.postDelayed(mBAcquireRewardPopView.j, 1000L);
        }
    }

    class d implements Runnable {

        class a implements Animation.AnimationListener {
            a() {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                MBAcquireRewardPopView.this.g = false;
                MBAcquireRewardPopView.this.setVisibility(8);
                MBAcquireRewardPopView.this.removeAllViews();
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        }

        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(300L);
            alphaAnimation.setAnimationListener(new a());
            MBAcquireRewardPopView.this.startAnimation(alphaAnimation);
        }
    }

    class e implements View.OnTouchListener {
        e() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                MBAcquireRewardPopView.this.b = motionEvent.getX();
                MBAcquireRewardPopView.this.c = motionEvent.getY();
            } else {
                if (action == 1) {
                    if (MBAcquireRewardPopView.this.d <= MBAcquireRewardPopView.this.b) {
                        MBAcquireRewardPopView.g(MBAcquireRewardPopView.this);
                        throw null;
                    }
                    if (Math.abs(MBAcquireRewardPopView.this.d - MBAcquireRewardPopView.this.b) <= 50.0f || Math.abs(MBAcquireRewardPopView.this.e - MBAcquireRewardPopView.this.c) >= 100.0f) {
                        MBAcquireRewardPopView.g(MBAcquireRewardPopView.this);
                        throw null;
                    }
                    if (MBAcquireRewardPopView.this.h) {
                        return false;
                    }
                    MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                    mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.j);
                    MBAcquireRewardPopView.this.h = true;
                    View rightAnswerView = MBAcquireRewardPopView.this.getRightAnswerView();
                    View childAt = MBAcquireRewardPopView.this.getChildAt(0);
                    if (childAt != null) {
                        MBAcquireRewardPopView.this.a(childAt, rightAnswerView);
                    }
                    MBAcquireRewardPopView.g(MBAcquireRewardPopView.this);
                    throw null;
                }
                if (action == 2) {
                    MBAcquireRewardPopView.this.d = motionEvent.getX();
                    MBAcquireRewardPopView.this.e = motionEvent.getY();
                }
            }
            return false;
        }
    }

    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBAcquireRewardPopView.g(MBAcquireRewardPopView.this);
            throw null;
        }
    }

    public MBAcquireRewardPopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9090a = "MBAcquireRewardPopView";
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.i = new b();
        this.j = new c();
        this.k = new d();
        this.l = new e();
        this.m = new f();
        this.n = new a();
    }

    static /* synthetic */ com.mbridge.msdk.config.dynamic.baseview.rewardpopview.a g(MBAcquireRewardPopView mBAcquireRewardPopView) {
        mBAcquireRewardPopView.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View getRightAnswerView() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        new MBGradientAndShadowTextView.a();
        throw null;
    }

    private View getSlidePopView() {
        int a2 = v0.a(getContext(), 290.0f);
        LinearLayout linearLayout = new LinearLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a2, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        new MBGradientAndShadowTextView.a();
        throw null;
    }

    private View getWrongAnswerView() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        new MBGradientAndShadowTextView.a();
        throw null;
    }

    static /* synthetic */ int j(MBAcquireRewardPopView mBAcquireRewardPopView) {
        int i = mBAcquireRewardPopView.f;
        mBAcquireRewardPopView.f = i - 1;
        return i;
    }

    public void init(com.mbridge.msdk.config.dynamic.baseview.rewardpopview.a aVar) {
        q0.b("MBAcquireRewardPopView", "Must generate parameters.");
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentRelativeLayout, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.j);
    }

    public void onPause() {
        if (!this.g || this.f <= 0) {
            return;
        }
        removeCallbacks(this.j);
    }

    public void onResume() {
        if (!this.g || this.f <= 0) {
            return;
        }
        post(this.j);
    }

    public void onStop() {
        if (!this.g || this.f <= 0) {
            return;
        }
        removeCallbacks(this.j);
    }

    public void onTimeLessThanReduce(int i) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view, View view2) {
        removeView(view);
        addView(view2);
    }
}
