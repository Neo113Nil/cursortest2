package com.bytedance.sdk.openadsdk.core.hc.wh;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.adsdk.ugeno.oo.gbb;
import com.bytedance.adsdk.ugeno.oo.vh;

/* loaded from: classes4.dex */
public class gm implements gbb {
    private boolean pcc = false;

    @Override // com.bytedance.adsdk.ugeno.oo.gbb
    public boolean pcc(com.bytedance.adsdk.ugeno.sf.gm gmVar, MotionEvent motionEvent, vh vhVar, com.bytedance.adsdk.ugeno.oo.oo.gm gmVar2) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.pcc = true;
        } else if ((action == 1 || action == 3) && this.pcc) {
            this.pcc = false;
            if (pcc(gmVar.vh(), motionEvent.getX(), motionEvent.getY()) && vhVar != null) {
                vhVar.pcc(gmVar, gmVar2.oo(), gmVar2.qf().sf(), gmVar2.qf());
            }
        }
        return true;
    }

    private boolean pcc(View view, float f, float f2) {
        return f >= 0.0f && f < ((float) view.getWidth()) && f2 >= 0.0f && f2 < ((float) view.getHeight());
    }
}
