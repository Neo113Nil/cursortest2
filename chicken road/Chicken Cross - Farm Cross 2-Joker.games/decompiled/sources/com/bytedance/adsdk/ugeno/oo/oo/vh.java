package com.bytedance.adsdk.ugeno.oo.oo;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.qf.vy;

/* loaded from: classes4.dex */
public class vh extends gm implements vy.pcc {
    private Handler hc;
    private boolean tmg;
    private int vh;

    public vh(Context context) {
        super(context);
        this.vh = 500;
        this.hc = new com.bytedance.adsdk.ugeno.qf.vy(Looper.getMainLooper(), this);
    }

    @Override // com.bytedance.adsdk.ugeno.oo.oo.gm
    public boolean pcc(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        MotionEvent motionEvent = (MotionEvent) objArr[0];
        Object obj = this.vj.get("delay");
        if (obj == null) {
            this.vh = 500;
        } else {
            this.vh = com.bytedance.adsdk.ugeno.qf.gm.pcc(String.valueOf(obj), 500);
        }
        return pcc(this.sf, motionEvent);
    }

    private boolean pcc(com.bytedance.adsdk.ugeno.sf.gm gmVar, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.hc.sendEmptyMessageDelayed(1102, this.vh);
        } else {
            if (action == 1) {
                if (this.tmg && this.pcc != null) {
                    this.pcc.pcc(this.sf, this.wh, this.gm.sf(), this.gm);
                    this.tmg = false;
                    Handler handler = this.hc;
                    if (handler != null) {
                        handler.removeMessages(1102);
                    }
                    return true;
                }
                Handler handler2 = this.hc;
                if (handler2 != null) {
                    handler2.removeMessages(1102);
                }
                this.tmg = false;
                return false;
            }
            if (action == 3) {
                Handler handler3 = this.hc;
                if (handler3 != null) {
                    handler3.removeMessages(1102);
                }
                this.tmg = false;
            }
        }
        return true;
    }

    @Override // com.bytedance.adsdk.ugeno.qf.vy.pcc
    public void pcc(Message message) {
        if (message.what != 1102) {
            return;
        }
        this.tmg = true;
        Handler handler = this.hc;
        if (handler != null) {
            handler.removeMessages(1102);
        }
    }
}
