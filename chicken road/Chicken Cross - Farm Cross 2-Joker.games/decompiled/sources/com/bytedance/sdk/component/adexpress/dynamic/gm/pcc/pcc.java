package com.bytedance.sdk.component.adexpress.dynamic.gm.pcc;

import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.SoftReference;

/* loaded from: classes4.dex */
public class pcc implements View.OnTouchListener {
    private static int gm = 10;
    private com.bytedance.sdk.component.adexpress.dynamic.gm.kj oo;
    private float pcc;
    private float sf;
    private int vj;
    private RectF wh = new RectF();
    private long qf = 0;
    private final int kj = 200;
    private final int vy = 3;
    private SoftReference<ViewGroup> ork = new SoftReference<>(null);

    public pcc(com.bytedance.sdk.component.adexpress.dynamic.gm.kj kjVar, int i, final ViewGroup viewGroup) {
        this.vj = gm;
        this.oo = kjVar;
        if (i > 0) {
            this.vj = i;
        }
        if (viewGroup != null) {
            viewGroup.post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.gm.pcc.pcc.1
                @Override // java.lang.Runnable
                public void run() {
                    pcc.this.ork = new SoftReference(viewGroup);
                }
            });
        }
    }

    private RectF pcc(View view) {
        if (view == null) {
            return new RectF();
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new RectF(iArr[0], iArr[1], r2 + view.getWidth(), iArr[1] + view.getHeight());
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.gm.kj kjVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.wh = pcc(this.ork.get());
            this.pcc = motionEvent.getRawX();
            this.sf = motionEvent.getRawY();
            this.qf = System.currentTimeMillis();
        } else if (action == 1) {
            RectF rectF = this.wh;
            if (rectF != null && !rectF.contains(this.pcc, this.sf)) {
                return false;
            }
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            float abs = Math.abs(rawX - this.pcc);
            float abs2 = Math.abs(rawY - this.sf);
            int i = this.vj;
            if (abs >= i && abs2 >= i) {
                com.bytedance.sdk.component.adexpress.dynamic.gm.kj kjVar2 = this.oo;
                if (kjVar2 != null) {
                    kjVar2.pcc();
                }
            } else if ((System.currentTimeMillis() - this.qf < 200 || (abs < 3.0f && abs2 < 3.0f)) && (kjVar = this.oo) != null) {
                kjVar.pcc();
            }
        }
        return true;
    }
}
