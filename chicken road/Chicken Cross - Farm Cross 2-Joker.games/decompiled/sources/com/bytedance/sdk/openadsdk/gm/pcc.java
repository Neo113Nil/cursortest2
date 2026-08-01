package com.bytedance.sdk.openadsdk.gm;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.utils.rj;

/* loaded from: classes4.dex */
public class pcc extends com.bytedance.sdk.openadsdk.core.wh.kj {
    private boolean gm;
    private int oo;
    private Paint pcc;
    private float sf;

    public pcc(Context context) {
        super(context);
        pcc();
    }

    private void pcc() {
        this.sf = rj.pcc(getContext(), 8.0f);
        this.pcc = new Paint();
    }

    public void setMinTextSize(float f) {
        if (f <= 0.0f) {
            return;
        }
        this.sf = f;
    }

    private void pcc(String str, int i) {
        if (!this.gm && i > 0) {
            float textSize = getTextSize();
            this.pcc.set(getPaint());
            int paddingLeft = (i - getPaddingLeft()) - getPaddingRight();
            float pcc = pcc(textSize, str);
            while (pcc > paddingLeft) {
                textSize -= 1.0f;
                this.pcc.setTextSize(textSize);
                if (textSize <= this.sf) {
                    break;
                } else {
                    pcc = pcc(textSize, str);
                }
            }
            setTextSize(0, textSize);
            this.gm = true;
        }
    }

    private float pcc(float f, String str) {
        this.pcc.setTextSize(f);
        return this.pcc.measureText(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.wh.kj, android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.oo = getMeasuredHeight();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, this.oo);
        } else {
            layoutParams.height = this.oo;
        }
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.openadsdk.core.wh.kj, android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        int i = this.oo;
        if (i == 0 || layoutParams == null) {
            return;
        }
        layoutParams.height = i;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        pcc(getText().toString(), getWidth());
    }
}
