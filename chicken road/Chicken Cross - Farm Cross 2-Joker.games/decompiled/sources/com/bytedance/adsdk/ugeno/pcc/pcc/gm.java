package com.bytedance.adsdk.ugeno.pcc.pcc;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.util.Log;
import android.view.View;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class gm extends pcc {
    private String gm;
    private Paint kj;
    private float oo;
    private LinearGradient ork;
    private Paint qf;
    private Matrix vh;
    private float vj;
    private PorterDuffXfermode vy;
    private View wh;

    public gm(com.bytedance.adsdk.ugeno.sf.gm gmVar, JSONObject jSONObject) {
        super(gmVar, jSONObject);
        this.wh = this.sf.vh();
        Paint paint = new Paint();
        this.qf = paint;
        paint.setAntiAlias(true);
        this.wh.setLayerType(2, null);
        this.vy = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.kj = new Paint();
        this.vh = new Matrix();
    }

    @Override // com.bytedance.adsdk.ugeno.pcc.pcc.pcc
    public void sf() {
        this.gm = this.pcc.optString("direction", "left");
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
        char c;
        try {
            if (this.sf.zsj() > 0.0f) {
                int zsj = (int) (this.oo * this.sf.zsj());
                int zsj2 = (int) (this.vj * this.sf.zsj());
                this.qf.setXfermode(this.vy);
                String str = this.gm;
                switch (str.hashCode()) {
                    case -1383228885:
                        if (str.equals("bottom")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 115029:
                        if (str.equals(ViewHierarchyConstants.DIMENSION_TOP_KEY)) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3317767:
                        if (str.equals("left")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 108511772:
                        if (str.equals("right")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                if (c == 0) {
                    float f = zsj;
                    canvas.drawRect(f, 0.0f, this.oo, this.vj, this.qf);
                    this.vh.setTranslate(f, this.vj);
                    this.ork.setLocalMatrix(this.vh);
                    this.kj.setShader(this.ork);
                    if (this.sf.zsj() <= 1.0f && this.sf.zsj() > 0.9f) {
                        this.kj.setAlpha((int) (255.0f - (this.sf.zsj() * 255.0f)));
                    }
                    canvas.drawRect(0.0f, 0.0f, f, this.vj, this.kj);
                    return;
                }
                if (c == 1) {
                    float f2 = zsj;
                    canvas.drawRect(0.0f, 0.0f, this.oo - f2, this.vj, this.qf);
                    this.vh.setTranslate(this.oo - f2, 0.0f);
                    this.ork.setLocalMatrix(this.vh);
                    this.kj.setShader(this.ork);
                    if (this.sf.zsj() <= 1.0f && this.sf.zsj() > 0.9f) {
                        this.kj.setAlpha((int) (255.0f - (this.sf.zsj() * 255.0f)));
                    }
                    float f3 = this.oo;
                    canvas.drawRect(f3, this.vj, f3 - f2, 0.0f, this.kj);
                    return;
                }
                if (c == 2) {
                    float f4 = zsj2;
                    canvas.drawRect(0.0f, f4, this.oo, this.vj, this.qf);
                    this.vh.setTranslate(0.0f, f4);
                    this.ork.setLocalMatrix(this.vh);
                    this.kj.setShader(this.ork);
                    if (this.sf.zsj() <= 1.0f && this.sf.zsj() > 0.9f) {
                        this.kj.setAlpha((int) (255.0f - (this.sf.zsj() * 255.0f)));
                    }
                    canvas.drawRect(0.0f, 0.0f, this.oo, f4, this.kj);
                    return;
                }
                if (c != 3) {
                    return;
                }
                float f5 = zsj2;
                canvas.drawRect(0.0f, 0.0f, this.oo, this.vj - f5, this.qf);
                this.vh.setTranslate(0.0f, this.vj - f5);
                this.ork.setLocalMatrix(this.vh);
                this.kj.setShader(this.ork);
                if (this.sf.zsj() <= 1.0f && this.sf.zsj() > 0.9f) {
                    this.kj.setAlpha((int) (255.0f - (this.sf.zsj() * 255.0f)));
                }
                float f6 = this.oo;
                float f7 = this.vj;
                canvas.drawRect(f6, f7, 0.0f, f7 - f5, this.kj);
                return;
            }
            this.qf.setXfermode(this.vy);
            canvas.drawRect(0.0f, 0.0f, this.oo, this.vj, this.qf);
        } catch (Throwable th) {
            Log.e("BaseEffectWrapper", th.getMessage());
        }
    }

    @Override // com.bytedance.adsdk.ugeno.pcc.pcc.pcc
    public void pcc(int i, int i2) {
        this.oo = i;
        this.vj = i2;
        String str = this.gm;
        str.hashCode();
        switch (str) {
            case "bottom":
                this.ork = new LinearGradient(0.0f, -this.vj, 0.0f, 0.0f, 0, -1, Shader.TileMode.CLAMP);
                break;
            case "top":
                this.ork = new LinearGradient(0.0f, this.vj, 0.0f, 0.0f, 0, -1, Shader.TileMode.CLAMP);
                break;
            case "left":
                this.ork = new LinearGradient(this.oo, 0.0f, 0.0f, 0.0f, 0, -1, Shader.TileMode.CLAMP);
                break;
            case "right":
                this.ork = new LinearGradient(-this.oo, 0.0f, 0.0f, this.vj, 0, -1, Shader.TileMode.CLAMP);
                break;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.pcc.pcc.pcc
    public List<PropertyValuesHolder> gm() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PropertyValuesHolder.ofFloat("rubIn", 0.0f, 1.0f));
        arrayList.add(PropertyValuesHolder.ofFloat(com.bytedance.adsdk.ugeno.pcc.vj.ALPHA.sf(), 0.0f, 1.0f));
        return arrayList;
    }
}
