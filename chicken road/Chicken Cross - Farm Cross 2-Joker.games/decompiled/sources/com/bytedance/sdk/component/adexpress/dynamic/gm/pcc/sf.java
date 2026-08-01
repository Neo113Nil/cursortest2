package com.bytedance.sdk.component.adexpress.dynamic.gm.pcc;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.gm.vy;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c;

/* loaded from: classes4.dex */
public class sf implements View.OnTouchListener {
    private long gm;
    private boolean oo;
    private float pcc;
    private float sf;
    private vy vj;
    private com.bytedance.sdk.component.adexpress.dynamic.gm.kj wh;

    public sf(vy vyVar, com.bytedance.sdk.component.adexpress.dynamic.gm.kj kjVar) {
        this.vj = vyVar;
        this.wh = kjVar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.gm = System.currentTimeMillis();
            this.pcc = motionEvent.getX();
            this.sf = motionEvent.getY();
            this.vj.vj();
        } else if (action != 1) {
            if (action == 2) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (Math.abs(x - this.pcc) >= com.bytedance.sdk.component.adexpress.oo.qf.pcc(com.bytedance.sdk.component.adexpress.oo.pcc(), 10.0f) || Math.abs(y - this.sf) >= com.bytedance.sdk.component.adexpress.oo.qf.pcc(com.bytedance.sdk.component.adexpress.oo.pcc(), 10.0f)) {
                    this.oo = true;
                    this.vj.wh();
                }
            }
        } else {
            if (this.oo) {
                return false;
            }
            if (System.currentTimeMillis() - this.gm >= c.m) {
                com.bytedance.sdk.component.adexpress.dynamic.gm.kj kjVar = this.wh;
                if (kjVar != null) {
                    kjVar.pcc();
                }
            }
            this.vj.wh();
        }
        return true;
    }
}
