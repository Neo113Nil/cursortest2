package com.bytedance.adsdk.ugeno.pcc.pcc;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class sf extends pcc {
    private int gm;
    private int oo;
    private int vj;
    private Paint wh;

    public sf(com.bytedance.adsdk.ugeno.sf.gm gmVar, JSONObject jSONObject) {
        super(gmVar, jSONObject);
        Paint paint = new Paint();
        this.wh = paint;
        paint.setAntiAlias(true);
    }

    @Override // com.bytedance.adsdk.ugeno.pcc.pcc.pcc
    public void sf() {
        this.gm = com.bytedance.adsdk.ugeno.qf.pcc.pcc(this.pcc.optString("backgroundColor"), -1);
    }

    @Override // com.bytedance.adsdk.ugeno.pcc.pcc.pcc
    public void pcc(Canvas canvas) {
        gm(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.pcc.pcc.pcc
    public void sf(Canvas canvas) {
        gm(canvas);
    }

    private void gm(Canvas canvas) {
        try {
            if (this.sf.ri() > 0.0f) {
                this.wh.setColor(this.gm);
                this.wh.setAlpha((int) ((1.0f - this.sf.ri()) * 255.0f));
                ((ViewGroup) this.sf.vh().getParent()).setClipChildren(true);
                canvas.drawCircle(this.oo, this.vj, Math.min(r0, r2) * 2 * this.sf.ri(), this.wh);
            }
        } catch (Throwable th) {
            Log.d("BaseEffectWrapper", "ripple animation error " + th.getMessage());
        }
    }

    @Override // com.bytedance.adsdk.ugeno.pcc.pcc.pcc
    public void pcc(int i, int i2) {
        this.oo = i / 2;
        this.vj = i2 / 2;
    }

    @Override // com.bytedance.adsdk.ugeno.pcc.pcc.pcc
    public List<PropertyValuesHolder> gm() {
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat(oo(), 0.0f, 1.0f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(ofFloat);
        return arrayList;
    }
}
