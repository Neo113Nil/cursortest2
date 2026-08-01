package com.bytedance.adsdk.ugeno.pcc.pcc;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class vj extends pcc {
    private float gm;
    private PorterDuffXfermode hc;
    private boolean kj;
    private float oo;
    private Path ork;
    private String qf;
    private Path tmg;
    private Path vh;
    private Paint vj;
    private boolean vy;
    private float wh;

    public vj(com.bytedance.adsdk.ugeno.sf.gm gmVar, JSONObject jSONObject) {
        super(gmVar, jSONObject);
        this.kj = true;
        this.vy = true;
        Paint paint = new Paint();
        this.vj = paint;
        paint.setAntiAlias(true);
        this.sf.vh().setLayerType(2, null);
        this.hc = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.ork = new Path();
        this.vh = new Path();
        this.tmg = new Path();
        this.vj.setXfermode(this.hc);
    }

    @Override // com.bytedance.adsdk.ugeno.pcc.pcc.pcc
    public void sf() {
        this.wh = (float) this.pcc.optDouble("start", 0.0d);
        this.qf = this.pcc.optString("direction", "center");
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
        int fmh;
        int fmh2;
        if (this.sf.fmh() > 0.0f) {
            fmh = (int) (this.gm * this.sf.fmh());
            fmh2 = (int) (this.oo * this.sf.fmh());
            this.vj.setXfermode(this.hc);
            String str = this.qf;
            str.hashCode();
            switch (str) {
                case "bottom":
                    canvas.drawRect(0.0f, fmh2, this.gm, this.oo, this.vj);
                    break;
                case "center":
                    this.ork.reset();
                    this.vh.reset();
                    this.tmg.reset();
                    this.ork.addCircle(this.gm / 2.0f, this.oo / 2.0f, fmh, Path.Direction.CW);
                    Path path = this.vh;
                    float f = this.gm;
                    path.addRect(f / 2.0f, 0.0f, f, this.oo, Path.Direction.CW);
                    this.vh.op(this.ork, Path.Op.DIFFERENCE);
                    this.tmg.addRect(0.0f, 0.0f, this.gm / 2.0f, this.oo, Path.Direction.CW);
                    this.tmg.op(this.ork, Path.Op.DIFFERENCE);
                    canvas.drawPath(this.vh, this.vj);
                    canvas.drawPath(this.tmg, this.vj);
                    break;
                case "top":
                    canvas.drawRect(0.0f, 0.0f, this.gm, this.oo - fmh2, this.vj);
                    break;
                case "left":
                    canvas.drawRect(0.0f, 0.0f, this.gm - fmh, this.oo, this.vj);
                    break;
                case "right":
                    canvas.drawRect(fmh, 0.0f, this.gm, this.oo, this.vj);
                    break;
            }
            return;
        }
        this.vj.setXfermode(this.hc);
        canvas.drawRect(0.0f, 0.0f, this.gm, this.oo, this.vj);
    }

    @Override // com.bytedance.adsdk.ugeno.pcc.pcc.pcc
    public void pcc(int i, int i2) {
        if (i > 0 && this.kj) {
            this.gm = i;
            this.kj = false;
        }
        if (i2 <= 0 || !this.vy) {
            return;
        }
        this.oo = i2;
        this.vy = false;
    }

    @Override // com.bytedance.adsdk.ugeno.pcc.pcc.pcc
    public List<PropertyValuesHolder> gm() {
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat(oo(), this.wh, 1.0f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(ofFloat);
        return arrayList;
    }
}
