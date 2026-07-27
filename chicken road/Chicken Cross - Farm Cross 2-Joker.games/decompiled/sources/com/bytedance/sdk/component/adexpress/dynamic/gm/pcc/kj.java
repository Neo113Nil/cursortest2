package com.bytedance.sdk.component.adexpress.dynamic.gm.pcc;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes4.dex */
public class kj implements View.OnTouchListener {
    private final int gm = 10;
    private float oo;
    private final com.bytedance.sdk.component.adexpress.dynamic.gm.kj pcc;
    private float qf;
    private final boolean sf;
    private float vj;
    private float wh;

    public kj(com.bytedance.sdk.component.adexpress.dynamic.gm.kj kjVar, boolean z) {
        this.pcc = kjVar;
        this.sf = z;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.gm.kj kjVar;
        com.bytedance.sdk.component.adexpress.dynamic.gm.kj kjVar2;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.oo = motionEvent.getX();
            this.vj = motionEvent.getY();
            new Object[]{"mStartX: ", Float.valueOf(this.oo), ", mStartY: " + this.vj};
        } else if (action == 1) {
            this.wh = motionEvent.getX();
            this.qf = motionEvent.getY();
            new Object[]{"mEndX: ", Float.valueOf(this.wh), ", mEndY: " + this.qf};
            if (!this.sf && (kjVar2 = this.pcc) != null) {
                kjVar2.pcc();
            } else {
                float f = this.wh - this.oo;
                float f2 = this.qf - this.vj;
                float sqrt = (float) Math.sqrt((f * f) + (f2 * f2));
                new Object[]{"slideDistancePx: ", Float.valueOf(sqrt)};
                float sf = com.bytedance.sdk.component.adexpress.oo.qf.sf(com.bytedance.sdk.component.adexpress.oo.pcc(), Math.abs(sqrt));
                new Object[]{"slideDistanceDp:", Float.valueOf(sf), " and ", "mSlideThreshold:", 10};
                if (sf > 10.0f && (kjVar = this.pcc) != null) {
                    kjVar.pcc();
                }
            }
        }
        return true;
    }
}
