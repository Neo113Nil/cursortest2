package com.bytedance.sdk.component.vy;

import android.content.Context;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes4.dex */
public abstract class gm implements View.OnTouchListener {
    private ViewConfiguration pcc;
    private int sf = -1;

    abstract void pcc(View.OnTouchListener onTouchListener);

    boolean pcc(float f, float f2, float f3, float f4, Context context) {
        if (this.pcc == null) {
            this.pcc = ViewConfiguration.get(context);
        }
        if (this.sf == -1) {
            this.sf = this.pcc.getScaledTouchSlop();
        }
        new Object[]{"mTouchSlop is: ", Integer.valueOf(this.sf)};
        if (Math.abs(f - f3) <= this.sf && Math.abs(f2 - f4) <= this.sf) {
            new Object[]{"isClick", "upX: ", Float.valueOf(f), " ,downX: ", Float.valueOf(f3), " ,upY: ", Float.valueOf(f2), "downY: ", Float.valueOf(f4)};
            return true;
        }
        new Object[]{"notClick", "upX: ", Float.valueOf(f), " ,downX: ", Float.valueOf(f3), " ,upY: ", Float.valueOf(f2), "downY: ", Float.valueOf(f4)};
        return false;
    }
}
