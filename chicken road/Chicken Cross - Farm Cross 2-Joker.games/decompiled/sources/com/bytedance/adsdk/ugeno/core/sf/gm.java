package com.bytedance.adsdk.ugeno.core.sf;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.bytedance.adsdk.ugeno.core.hc;
import com.bytedance.adsdk.ugeno.core.jr;

/* loaded from: classes4.dex */
public class gm {
    private hc gm;
    private Context oo;
    private float pcc;
    private float sf;
    private boolean vj;
    private final int wh;

    public gm(Context context, hc hcVar) {
        this.oo = context;
        this.gm = hcVar;
        this.wh = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public boolean pcc(jr jrVar, com.bytedance.adsdk.ugeno.sf.gm gmVar, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.pcc = motionEvent.getX();
            this.sf = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (Math.abs(x - this.pcc) >= this.wh || Math.abs(y - this.sf) >= this.wh) {
                    this.vj = true;
                }
            } else if (action == 3) {
                this.vj = false;
            }
        } else {
            if (this.vj) {
                this.vj = false;
                return false;
            }
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (Math.abs(x2 - this.pcc) >= this.wh || Math.abs(y2 - this.sf) >= this.wh) {
                this.vj = false;
            } else if (jrVar != null) {
                jrVar.pcc(this.gm, gmVar, gmVar);
                return true;
            }
        }
        return true;
    }
}
