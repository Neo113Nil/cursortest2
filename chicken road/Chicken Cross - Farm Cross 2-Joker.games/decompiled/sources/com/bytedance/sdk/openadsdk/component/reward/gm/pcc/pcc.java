package com.bytedance.sdk.openadsdk.component.reward.gm.pcc;

import android.view.MotionEvent;

/* loaded from: classes4.dex */
public class pcc implements com.bytedance.sdk.component.vy.vj {
    private oo pcc;
    private boolean sf;

    public pcc(oo ooVar) {
        this.sf = false;
        this.pcc = ooVar;
        if (ooVar == null) {
            this.sf = false;
        } else {
            this.sf = ooVar.gm();
        }
    }

    @Override // com.bytedance.sdk.component.vy.vj
    public boolean pcc(MotionEvent motionEvent) {
        if (pcc(this.pcc, motionEvent.getX(), motionEvent.getY()) && this.sf) {
            return false;
        }
        this.sf = false;
        return false;
    }

    @Override // com.bytedance.sdk.component.vy.vj
    public boolean sf(MotionEvent motionEvent) {
        return this.sf && pcc(this.pcc, motionEvent.getX(), motionEvent.getY());
    }

    public void pcc(boolean z) {
        this.sf = z;
    }

    public boolean pcc(oo ooVar, float f, float f2) {
        if (ooVar == null) {
            return false;
        }
        return ooVar.pcc(f, f2);
    }
}
