package com.bytedance.adsdk.ugeno.vy.wh;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.Log;
import android.widget.TextView;
import com.bytedance.adsdk.ugeno.core.IAnimation;
import com.bytedance.adsdk.ugeno.oo;
import com.bytedance.adsdk.ugeno.pcc.kj;
import com.bytedance.adsdk.ugeno.pcc.qf;

/* loaded from: classes4.dex */
public class pcc extends TextView implements IAnimation, qf {
    private kj gm;
    private float oo;
    private oo pcc;
    private float qf;
    private float sf;
    private float vj;
    private float wh;

    public pcc(Context context) {
        super(context);
        this.oo = -1.0f;
        this.wh = 1.0f;
        this.qf = 0.0f;
        this.gm = new kj(this);
    }

    public void pcc(oo ooVar) {
        this.pcc = ooVar;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        oo ooVar = this.pcc;
        if (ooVar != null) {
            int[] pcc = ooVar.pcc(i, i2);
            super.onMeasure(pcc[0], pcc[1]);
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        oo ooVar = this.pcc;
        if (ooVar != null) {
            ooVar.pcc(i, i2, i3, i4);
        }
        if (z && this.oo > 0.0f) {
            pcc(((i3 - i) - getCompoundPaddingLeft()) - getCompoundPaddingRight(), ((i4 - i2) - getCompoundPaddingBottom()) - getCompoundPaddingTop());
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation, com.bytedance.adsdk.ugeno.pcc.qf
    public float getRipple() {
        return this.sf;
    }

    public void setShine(float f) {
        kj kjVar = this.gm;
        if (kjVar != null) {
            kjVar.gm(f);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.pcc.qf
    public float getShine() {
        return this.gm.getShine();
    }

    public void setStretch(float f) {
        kj kjVar = this.gm;
        if (kjVar != null) {
            kjVar.oo(f);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.pcc.qf
    public float getStretch() {
        return this.gm.getStretch();
    }

    public void setRubIn(float f) {
        kj kjVar = this.gm;
        if (kjVar != null) {
            kjVar.vj(f);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.pcc.qf
    public float getRubIn() {
        return this.gm.getRubIn();
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation
    public void setRipple(float f) {
        this.sf = f;
        kj kjVar = this.gm;
        if (kjVar != null) {
            kjVar.sf(f);
        }
        postInvalidate();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        oo ooVar = this.pcc;
        if (ooVar != null) {
            ooVar.pcc(canvas, this);
            this.pcc.pcc(canvas);
        }
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        oo ooVar = this.pcc;
        if (ooVar != null) {
            ooVar.sf(canvas);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        oo ooVar = this.pcc;
        if (ooVar != null) {
            ooVar.sf(i, i2, i3, i3);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        oo ooVar = this.pcc;
        if (ooVar != null) {
            ooVar.qf();
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        oo ooVar = this.pcc;
        if (ooVar != null) {
            ooVar.kj();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    public void setBorderRadius(float f) {
        kj kjVar = this.gm;
        if (kjVar != null) {
            kjVar.pcc(f);
        }
    }

    public float getBorderRadius() {
        return this.gm.pcc();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.gm.pcc(i);
    }

    @Override // android.widget.TextView
    public void setTextSize(float f) {
        super.setTextSize(f);
        this.vj = getTextSize();
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        this.vj = getTextSize();
    }

    public void setMinTextSize(float f) {
        this.oo = f;
    }

    private void pcc(int i, int i2) {
        CharSequence text = getText();
        if (text == null || text.length() == 0 || i2 <= 0 || i <= 0 || this.vj == 0.0f) {
            return;
        }
        TextPaint paint = getPaint();
        float f = this.vj;
        int pcc = pcc(text, paint, i, f);
        while (pcc > i2 && f > this.oo) {
            Log.d("UGTextView", "resizeText: targetSize=" + f + "; mMinTextSize=" + this.oo);
            f = Math.max(f - 1.0f, this.oo);
            pcc = pcc(text, paint, i, f);
        }
        Log.d("UGTextView", "resizeText: targetSize: ".concat(String.valueOf(f)));
        setTextSize(0, f);
        setLineSpacing(this.qf, this.wh);
    }

    private int pcc(CharSequence charSequence, TextPaint textPaint, int i, float f) {
        TextPaint textPaint2 = new TextPaint(textPaint);
        textPaint2.setTextSize(f);
        return new StaticLayout(charSequence, textPaint2, i, Layout.Alignment.ALIGN_NORMAL, this.wh, this.qf, true).getHeight();
    }

    @Override // android.widget.TextView
    public void setLineSpacing(float f, float f2) {
        super.setLineSpacing(f, f2);
        this.wh = f2;
        this.qf = f;
    }
}
