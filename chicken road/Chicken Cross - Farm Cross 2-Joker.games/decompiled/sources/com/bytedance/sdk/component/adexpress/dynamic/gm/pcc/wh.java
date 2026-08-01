package com.bytedance.sdk.component.adexpress.dynamic.gm.pcc;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes4.dex */
public class wh implements View.OnTouchListener {
    private static int gm = 10;
    private boolean oo;
    private float pcc;
    private float sf;
    private com.bytedance.sdk.component.adexpress.dynamic.gm.kj vj;

    public wh(com.bytedance.sdk.component.adexpress.dynamic.gm.kj kjVar) {
        this.vj = kjVar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.pcc = motionEvent.getX();
            this.sf = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (Math.abs(x - this.pcc) >= gm || Math.abs(y - this.sf) >= gm) {
                    this.oo = true;
                }
            } else if (action == 3) {
                this.oo = false;
            }
        } else {
            if (this.oo) {
                this.oo = false;
                return false;
            }
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (Math.abs(x2 - this.pcc) >= gm || Math.abs(y2 - this.sf) >= gm) {
                this.oo = false;
            } else {
                com.bytedance.sdk.component.adexpress.dynamic.gm.kj kjVar = this.vj;
                if (kjVar != null) {
                    kjVar.pcc();
                }
            }
        }
        return true;
    }
}
