package com.mbridge.msdk.config.dynamic.baseview.rewardpopview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;
import com.mbridge.msdk.dycreator.baseview.rewardpopview.AcquireRewardPopViewConst;

/* loaded from: classes6.dex */
public class MBGradientAndShadowTextView extends TextView {

    /* renamed from: a, reason: collision with root package name */
    private int f9098a;
    private int b;
    private int c;
    private int d;
    private LinearGradient e;
    public float mShadowDx;
    public float mShadowDy;
    public float mShadowRadius;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f9099a;
        public int b;
        public int c;
        public int d = 40;
        public float e = 3.0f;
        public float f = 1.5f;
        public float g = 1.8f;
    }

    public MBGradientAndShadowTextView(Context context) {
        super(context);
        this.f9098a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
        a();
    }

    private void a() {
        setTextSize(this.d);
        setTypeface(Typeface.defaultFromStyle(3));
        this.e = new LinearGradient(0.0f, 0.0f, 0.0f, getTextSize(), this.f9098a, this.b, Shader.TileMode.CLAMP);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        getPaint().setShader(null);
        getPaint().setShadowLayer(3.0f, 1.5f, 1.8f, this.c);
        super.onDraw(canvas);
        getPaint().clearShadowLayer();
        getPaint().setShader(this.e);
        super.onDraw(canvas);
    }

    public MBGradientAndShadowTextView(Context context, a aVar) {
        super(context);
        this.f9098a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
        if (aVar != null) {
            this.f9098a = aVar.f9099a;
            this.b = aVar.b;
            this.c = aVar.c;
            this.d = aVar.d;
            this.mShadowRadius = aVar.e;
            this.mShadowDx = aVar.f;
            this.mShadowDy = aVar.g;
        }
        a();
    }

    public MBGradientAndShadowTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9098a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }

    public MBGradientAndShadowTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9098a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }

    public MBGradientAndShadowTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f9098a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }
}
