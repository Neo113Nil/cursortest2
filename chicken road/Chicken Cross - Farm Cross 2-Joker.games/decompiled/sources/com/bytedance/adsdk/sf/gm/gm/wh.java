package com.bytedance.adsdk.sf.gm.gm;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;

/* loaded from: classes4.dex */
public class wh extends pcc {
    wh(com.bytedance.adsdk.sf.vy vyVar, vj vjVar) {
        super(vyVar, vjVar);
    }

    @Override // com.bytedance.adsdk.sf.gm.gm.pcc
    public void sf(Canvas canvas, Matrix matrix, int i) {
        super.sf(canvas, matrix, i);
    }

    @Override // com.bytedance.adsdk.sf.gm.gm.pcc, com.bytedance.adsdk.sf.pcc.pcc.vj
    public void pcc(RectF rectF, Matrix matrix, boolean z) {
        super.pcc(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
    }
}
