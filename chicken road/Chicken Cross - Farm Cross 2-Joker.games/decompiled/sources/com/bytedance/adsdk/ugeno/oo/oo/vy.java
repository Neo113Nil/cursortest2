package com.bytedance.adsdk.ugeno.oo.oo;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.oo.gbb;

/* loaded from: classes4.dex */
public class vy extends gm {
    private gbb gbb;
    private boolean hc;
    private float tmg;
    private float vh;

    public vy(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.oo.oo.gm
    public boolean pcc(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        MotionEvent motionEvent = (MotionEvent) objArr[0];
        gbb gbbVar = this.gbb;
        if (gbbVar != null) {
            return gbbVar.pcc(this.sf, motionEvent, this.pcc, this);
        }
        return pcc(this.sf, motionEvent);
    }

    public boolean pcc(com.bytedance.adsdk.ugeno.sf.gm gmVar, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.vh = motionEvent.getRawX();
            this.tmg = motionEvent.getRawY();
        } else {
            if (action != 1) {
                if (action == 2) {
                    float rawX = motionEvent.getRawX();
                    float rawY = motionEvent.getRawY();
                    if (Math.abs(rawX - this.vh) >= 15.0f || Math.abs(rawY - this.tmg) >= 15.0f) {
                        this.hc = true;
                    }
                } else if (action == 3) {
                    this.hc = false;
                }
            }
            if (this.hc) {
                this.hc = false;
                this.vh = 0.0f;
                this.tmg = 0.0f;
                Log.d("GesThrough_UGTapEvent", "Non-tap event");
                return false;
            }
            float rawX2 = motionEvent.getRawX();
            float rawY2 = motionEvent.getRawY();
            if (Math.abs(rawX2 - this.vh) >= 15.0f || Math.abs(rawY2 - this.tmg) >= 15.0f) {
                this.hc = false;
                Log.d("GesThrough_UGTapEvent", "Non-tap event");
                return false;
            }
            Log.d("GesThrough_UGTapEvent", "Tap event, direct handling");
            if (this.pcc != null) {
                this.pcc.pcc(gmVar, this.wh, this.gm.sf(), this.gm);
                this.vh = 0.0f;
                this.tmg = 0.0f;
                return true;
            }
        }
        return true;
    }

    public void pcc(gbb gbbVar) {
        this.gbb = gbbVar;
    }
}
