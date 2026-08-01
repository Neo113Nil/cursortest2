package com.bytedance.sdk.component.adexpress.dynamic.gm.pcc;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes4.dex */
public class gm implements View.OnTouchListener {
    private float gm;
    private boolean kj;
    private float oo;
    private float pcc;
    private int qf;
    private float sf;
    private boolean vj;
    private boolean vy;
    private com.bytedance.sdk.component.adexpress.dynamic.gm.kj wh;

    public gm(com.bytedance.sdk.component.adexpress.dynamic.gm.kj kjVar) {
        this(kjVar, 5);
    }

    public gm(com.bytedance.sdk.component.adexpress.dynamic.gm.kj kjVar, int i) {
        this.qf = 5;
        this.kj = true;
        this.wh = kjVar;
        if (i > 0) {
            this.qf = i;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.gm.kj kjVar;
        com.bytedance.sdk.component.adexpress.dynamic.gm.kj kjVar2;
        com.bytedance.sdk.component.adexpress.dynamic.gm.kj kjVar3;
        if (this.vy) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.pcc = motionEvent.getX();
            this.sf = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                this.oo = motionEvent.getX();
                this.gm = motionEvent.getY();
                if (Math.abs(this.oo - this.pcc) > 10.0f) {
                    this.vj = true;
                }
                if (Math.abs(this.oo - this.pcc) > 8.0f || Math.abs(this.gm - this.sf) > 8.0f) {
                    this.kj = false;
                }
                int sf = com.bytedance.sdk.component.adexpress.oo.qf.sf(com.bytedance.sdk.component.adexpress.oo.pcc(), Math.abs(this.oo - this.pcc));
                if (this.oo > this.pcc && sf > this.qf && (kjVar3 = this.wh) != null) {
                    kjVar3.pcc();
                    this.vy = true;
                }
            }
        } else {
            if (!this.vj && !this.kj) {
                return false;
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int sf2 = com.bytedance.sdk.component.adexpress.oo.qf.sf(com.bytedance.sdk.component.adexpress.oo.pcc(), Math.abs(this.oo - this.pcc));
            if (this.oo > this.pcc && sf2 > this.qf && (kjVar2 = this.wh) != null) {
                kjVar2.pcc();
                this.vy = true;
            }
            float abs = Math.abs(x - this.pcc);
            float abs2 = Math.abs(y - this.sf);
            if ((abs < 8.0f || abs2 < 8.0f) && (kjVar = this.wh) != null) {
                kjVar.sf();
                this.vy = true;
            }
        }
        return true;
    }
}
