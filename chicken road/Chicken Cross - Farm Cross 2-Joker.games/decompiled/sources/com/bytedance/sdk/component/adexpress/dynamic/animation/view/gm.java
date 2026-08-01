package com.bytedance.sdk.component.adexpress.dynamic.animation.view;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.internal.view.SupportMenu;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vh;
import com.bytedance.sdk.component.adexpress.dynamic.oo.qf;

/* loaded from: classes4.dex */
public class gm {
    private int oo;
    Paint pcc;
    private int vj;
    private int wh;
    Path sf = new Path();
    Path gm = new Path();

    public gm() {
        Paint paint = new Paint();
        this.pcc = paint;
        paint.setAntiAlias(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void pcc(Canvas canvas, IAnimation iAnimation, View view) {
        int i;
        String str;
        float[] fArr;
        int i2 = 0;
        if (iAnimation.getRippleValue() != 0.0f) {
            if (com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().gm() != null) {
                try {
                    str = (String) view.getTag(2097610712);
                    try {
                        fArr = qf.sf(str);
                    } catch (Exception unused) {
                        fArr = null;
                        if (!str.startsWith("#")) {
                        }
                        ((ViewGroup) view.getParent()).setClipChildren(true);
                        canvas.drawCircle(this.oo, this.vj, Math.min(r1, r4) * 2 * iAnimation.getRippleValue(), this.pcc);
                        if (iAnimation.getShineValue() != 0.0f) {
                        }
                        if (iAnimation.getMarqueeValue() == 0.0f) {
                        }
                    }
                } catch (Exception unused2) {
                    str = "";
                }
                if (!str.startsWith("#")) {
                    this.pcc.setColor(Color.parseColor(str));
                    this.pcc.setAlpha(90);
                } else if (fArr != null) {
                    this.pcc.setColor(com.bytedance.sdk.component.adexpress.oo.qf.pcc(fArr[3] * (1.0f - iAnimation.getRippleValue()), fArr[0] / 256.0f, fArr[1] / 256.0f, fArr[2] / 256.0f));
                }
            }
            ((ViewGroup) view.getParent()).setClipChildren(true);
            canvas.drawCircle(this.oo, this.vj, Math.min(r1, r4) * 2 * iAnimation.getRippleValue(), this.pcc);
        }
        if (iAnimation.getShineValue() != 0.0f) {
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).setClipChildren(true);
            }
            if (view.getParent().getParent() != null) {
                ((ViewGroup) view.getParent().getParent()).setClipChildren(true);
            }
            this.sf.reset();
            try {
                i = ((Integer) view.getTag(2097610711)).intValue();
            } catch (Exception unused3) {
                i = 0;
            }
            if (i >= 0) {
                int shineValue = ((int) ((((this.oo * 4) + (i * 2)) + (this.vj * 2)) * iAnimation.getShineValue())) - ((this.vj * 2) + i);
                float f = shineValue;
                int i3 = this.vj;
                this.pcc.setShader(new LinearGradient(f, 0.0f, ((i + i3) / 2) + shineValue, i3 / 2, new int[]{Color.parseColor("#20ffffff"), Color.parseColor("#60ffffff"), Color.parseColor("#65ffffff")}, (float[]) null, Shader.TileMode.MIRROR));
                this.pcc.setStrokeWidth(this.oo * 2);
                Path path = this.gm;
                if (path != null) {
                    canvas.clipPath(path, Region.Op.INTERSECT);
                }
                int i4 = shineValue + i;
                canvas.drawLine(f, 0.0f, i4 + r1, this.vj, this.pcc);
            }
        }
        if (iAnimation.getMarqueeValue() == 0.0f) {
            try {
                i2 = ((Integer) view.getTag(2097610709)).intValue();
            } catch (Exception unused4) {
            }
            if (i2 >= 0) {
                this.sf.reset();
                this.sf.moveTo(0.0f, 0.0f);
                this.sf.lineTo(this.oo * 2, 0.0f);
                this.sf.lineTo(this.oo * 2, this.vj * 2);
                this.sf.lineTo(0.0f, this.vj * 2);
                this.sf.lineTo(0.0f, 0.0f);
                this.pcc.setShader(new LinearGradient(0.0f, 0.0f, this.oo * 2, this.vj * 2, new int[]{(int) (iAnimation.getMarqueeValue() * (-65536.0f)), (int) ((1.0f - iAnimation.getMarqueeValue()) * (-65536.0f))}, (float[]) null, Shader.TileMode.CLAMP));
                this.pcc.setColor(SupportMenu.CATEGORY_MASK);
                this.pcc.setStyle(Paint.Style.STROKE);
                this.pcc.setStrokeWidth(i2);
                canvas.drawPath(this.sf, this.pcc);
            }
        }
    }

    public void pcc(View view, float f) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = (int) (this.wh * f);
        view.setTranslationX((this.wh - layoutParams.width) / 2);
        if (view instanceof vh) {
            int i = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i >= viewGroup.getChildCount()) {
                    break;
                }
                viewGroup.getChildAt(i).setTranslationX((-(this.wh - layoutParams.width)) / 2);
                i++;
            }
        }
        view.setLayoutParams(layoutParams);
    }

    public void pcc(View view, int i, int i2) {
        String str;
        this.oo = i / 2;
        this.vj = i2 / 2;
        if (this.wh == 0 && view.getLayoutParams().width > 0) {
            this.wh = view.getLayoutParams().width;
        }
        try {
            str = (String) view.getTag(2097610710);
            try {
                this.gm.addRoundRect(new RectF(0.0f, 0.0f, i, i2), i2 / 2, i2 / 2, Path.Direction.CW);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            str = "";
        }
        if ("right".equals(str)) {
            view.setPivotX(this.oo * 2);
            view.setPivotY(this.vj);
        } else if ("left".equals(str)) {
            view.setPivotX(0.0f);
            view.setPivotY(this.vj);
        } else {
            view.setPivotX(this.oo);
            view.setPivotY(this.vj);
        }
    }
}
