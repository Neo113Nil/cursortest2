package com.bytedance.adsdk.ugeno.vy.sf;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.adsdk.ugeno.core.hc;
import com.bytedance.adsdk.ugeno.oo;
import java.util.Map;

/* loaded from: classes4.dex */
public class pcc extends FrameLayout {
    private oo pcc;
    private Map<Integer, hc> sf;

    public pcc(Context context) {
        super(context);
    }

    public void setEventMap(Map<Integer, hc> map) {
        this.sf = map;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        oo ooVar = this.pcc;
        if (ooVar != null) {
            int[] pcc = ooVar.pcc(i, i2);
            super.onMeasure(pcc[0], pcc[1]);
        } else {
            super.onMeasure(i, i2);
        }
        oo ooVar2 = this.pcc;
        if (ooVar2 != null) {
            ooVar2.vj();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        oo ooVar = this.pcc;
        if (ooVar != null) {
            ooVar.wh();
        }
        super.onLayout(z, i, i2, i3, i4);
        oo ooVar2 = this.pcc;
        if (ooVar2 != null) {
            ooVar2.pcc(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Map<Integer, hc> map = this.sf;
        if (map == null || !map.containsKey(4)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    public void pcc(oo ooVar) {
        this.pcc = ooVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        oo ooVar = this.pcc;
        if (ooVar != null) {
            ooVar.qf();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        oo ooVar = this.pcc;
        if (ooVar != null) {
            ooVar.kj();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        oo ooVar = this.pcc;
        if (ooVar != null) {
            ooVar.sf(i, i2, i3, i4);
        }
    }
}
