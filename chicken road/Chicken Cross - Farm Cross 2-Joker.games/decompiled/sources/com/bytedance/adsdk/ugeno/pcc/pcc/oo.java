package com.bytedance.adsdk.ugeno.pcc.pcc;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.qf.kj;
import com.bytedance.adsdk.ugeno.qf.pcc;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class oo extends pcc {
    private static final float dax;
    private static final float gbb;
    private static final float jr;
    private static final float nac;
    private int gm;
    private Path hc;
    private int kj;
    private float lu;
    private Paint oo;
    private int ork;
    private int qf;
    private boolean tmg;
    private int vh;
    private Path vj;
    private float vy;
    private pcc.C0108pcc wh;

    static {
        float radians = (float) Math.toRadians(30.0d);
        gbb = radians;
        jr = (float) Math.tan(radians);
        dax = (float) Math.cos(radians);
        nac = (float) Math.sin(radians);
    }

    public oo(com.bytedance.adsdk.ugeno.sf.gm gmVar, JSONObject jSONObject) {
        super(gmVar, jSONObject);
        this.tmg = true;
        Paint paint = new Paint();
        this.oo = paint;
        paint.setAntiAlias(true);
        this.vj = new Path();
        this.vy = this.sf.of();
        this.hc = new Path();
    }

    @Override // com.bytedance.adsdk.ugeno.pcc.pcc.pcc
    public void sf() {
        this.gm = (int) kj.pcc(this.sf.vh().getContext(), this.pcc.optInt("shineWidth", 30));
        String optString = this.pcc.optString("backgroundColor", "linear-gradient(90deg, rgba(255, 255, 255, 0), rgba(255, 255, 255, 0.25) 30%, rgba(255, 255, 255, 0.3) 50%, rgba(255, 255, 255, 0.25) 70%, rgba(255, 255, 255, 0))");
        String str = TextUtils.isEmpty(optString) ? "linear-gradient(90deg, rgba(255, 255, 255, 0), rgba(255, 255, 255, 0.25) 30%, rgba(255, 255, 255, 0.3) 50%, rgba(255, 255, 255, 0.25) 70%, rgba(255, 255, 255, 0))" : optString;
        if (str.startsWith("linear")) {
            this.wh = com.bytedance.adsdk.ugeno.qf.pcc.sf(str);
        } else {
            int pcc = com.bytedance.adsdk.ugeno.qf.pcc.pcc(str);
            this.qf = pcc;
            this.kj = com.bytedance.adsdk.ugeno.qf.pcc.pcc(pcc, 32);
            this.tmg = false;
        }
        this.lu = dax * this.gm;
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
        LinearGradient linearGradient;
        try {
            if (this.sf.hpk() > 0.0f) {
                int i = this.ork;
                float f = jr;
                float hpk = (i + (i * f)) * this.sf.hpk();
                this.hc.reset();
                this.hc.moveTo(hpk, 0.0f);
                int i2 = this.vh;
                float f2 = hpk - (i2 * f);
                this.hc.lineTo(f2, i2);
                this.hc.lineTo(f2 + this.gm, this.vh);
                this.hc.lineTo(this.gm + hpk, 0.0f);
                this.hc.close();
                float f3 = this.lu;
                float f4 = dax * f3;
                float f5 = f3 * nac;
                if (this.tmg && this.wh != null) {
                    linearGradient = new LinearGradient(hpk, 0.0f, hpk + f4, f5, this.wh.sf, (float[]) null, Shader.TileMode.CLAMP);
                } else {
                    float f6 = hpk + f4;
                    int i3 = this.kj;
                    linearGradient = new LinearGradient(hpk, 0.0f, f6, f5, new int[]{i3, this.qf, i3}, (float[]) null, Shader.TileMode.CLAMP);
                }
                this.oo.setShader(linearGradient);
                Path path = this.vj;
                if (path != null) {
                    canvas.clipPath(path, Region.Op.INTERSECT);
                }
                canvas.drawPath(this.hc, this.oo);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.pcc.pcc.pcc
    public void pcc(int i, int i2) {
        this.ork = i;
        this.vh = i2;
        try {
            RectF rectF = new RectF(0.0f, 0.0f, i, i2);
            Path path = this.vj;
            float f = this.vy;
            path.addRoundRect(rectF, f, f, Path.Direction.CW);
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.pcc.pcc.pcc
    public List<PropertyValuesHolder> gm() {
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat(oo(), 0.0f, 1.0f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(ofFloat);
        return arrayList;
    }
}
