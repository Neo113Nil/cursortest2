package com.bytedance.adsdk.ugeno.oo.oo;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.qf.vy;

/* loaded from: classes4.dex */
public class tmg extends gm implements vy.pcc {
    private Handler tmg;
    private int vh;

    public tmg(Context context) {
        super(context);
        this.vh = 500;
        this.tmg = new com.bytedance.adsdk.ugeno.qf.vy(Looper.getMainLooper(), this);
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
            this.tmg.sendEmptyMessageDelayed(1101, this.vh);
            return false;
        }
        if (action != 1 && action != 3) {
            return false;
        }
        this.tmg.removeMessages(1101);
        return false;
    }

    @Override // com.bytedance.adsdk.ugeno.qf.vy.pcc
    public void pcc(Message message) {
        if (message.what != 1101) {
            return;
        }
        if (this.pcc != null) {
            this.pcc.pcc(this.sf, this.wh, this.gm.sf(), this.gm);
        }
        Handler handler = this.tmg;
        if (handler != null) {
            handler.removeMessages(1101);
        }
    }
}
