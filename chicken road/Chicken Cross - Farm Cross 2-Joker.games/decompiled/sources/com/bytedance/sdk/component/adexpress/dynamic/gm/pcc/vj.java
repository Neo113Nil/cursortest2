package com.bytedance.sdk.component.adexpress.dynamic.gm.pcc;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes4.dex */
public class vj implements View.OnTouchListener {
    private boolean gm;
    private com.bytedance.sdk.component.adexpress.dynamic.gm.kj oo;
    private float pcc;
    private float sf;
    private int vj;

    public vj(com.bytedance.sdk.component.adexpress.dynamic.gm.kj kjVar, int i) {
        this.oo = kjVar;
        this.vj = i;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.gm.kj kjVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.pcc = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                float y = motionEvent.getY();
                this.sf = y;
                if (Math.abs(y - this.pcc) > 10.0f) {
                    this.gm = true;
                }
            }
        } else {
            if (!this.gm) {
                return false;
            }
            int sf = com.bytedance.sdk.component.adexpress.oo.qf.sf(com.bytedance.sdk.component.adexpress.oo.pcc(), Math.abs(this.sf - this.pcc));
            if (this.sf - this.pcc < 0.0f && sf > this.vj && (kjVar = this.oo) != null) {
                kjVar.pcc();
                this.pcc = 0.0f;
                this.sf = 0.0f;
                this.gm = false;
            }
        }
        return true;
    }
}
