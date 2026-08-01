package com.bytedance.sdk.openadsdk.core.ork;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.tmg;
import com.bytedance.sdk.openadsdk.utils.rj;

/* loaded from: classes4.dex */
public class jsj extends GestureDetector {
    private final pcc pcc;
    private final com.bytedance.sdk.openadsdk.core.gm.wh sf;

    public jsj(Context context) {
        this(context, new pcc());
    }

    public jsj(Context context, pcc pccVar) {
        super(context, pccVar);
        this.pcc = pccVar;
        this.sf = new com.bytedance.sdk.openadsdk.core.gm.wh();
        setIsLongpressEnabled(false);
    }

    void pcc() {
        this.pcc.pcc();
    }

    public boolean sf() {
        return this.pcc.sf();
    }

    public com.bytedance.sdk.openadsdk.core.model.tmg pcc(Context context, View view) {
        if (this.sf == null) {
            return new tmg.pcc().pcc();
        }
        return new tmg.pcc().wh(this.sf.pcc).vj(this.sf.sf).oo(this.sf.gm).gm(this.sf.oo).sf(this.sf.vj).pcc(this.sf.wh).pcc(rj.pcc(view)).sf(rj.gm(view)).oo(this.sf.qf).vj(this.sf.kj).wh(this.sf.vy).pcc(this.sf.tmg).sf(com.bytedance.sdk.openadsdk.core.ork.sf().pcc() ? 1 : 2).pcc("vessel").pcc(rj.kj(context)).gm(rj.ork(context)).sf(rj.vy(context)).pcc();
    }

    @Override // android.view.GestureDetector
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.sf.pcc(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    static class pcc extends GestureDetector.SimpleOnGestureListener {
        boolean pcc = false;

        pcc() {
        }

        void pcc() {
            this.pcc = false;
        }

        boolean sf() {
            return this.pcc;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            this.pcc = true;
            return super.onSingleTapUp(motionEvent);
        }
    }
}
