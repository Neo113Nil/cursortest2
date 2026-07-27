package com.bytedance.adsdk.ugeno.core;

import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.bytedance.adsdk.ugeno.core.pcc;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class ork {
    private AnimatorSet gm = new AnimatorSet();
    private View oo;
    Paint pcc;
    private String qf;
    private pcc sf;
    private int vj;
    private int wh;

    public ork(View view, pcc pccVar) {
        this.oo = view;
        this.sf = pccVar;
        Paint paint = new Paint();
        this.pcc = paint;
        paint.setAntiAlias(true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0187, code lost:
    
        if (r2.equals("accelerate") == false) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void pcc() {
        ArrayList arrayList = new ArrayList();
        List<pcc.C0102pcc> gm = this.sf.gm();
        if (gm == null || gm.size() <= 0) {
            return;
        }
        for (pcc.C0102pcc c0102pcc : gm) {
            if (c0102pcc != null) {
                ObjectAnimator objectAnimator = new ObjectAnimator();
                objectAnimator.setDuration(c0102pcc.pcc());
                if (TextUtils.equals(c0102pcc.vj(), "translateX")) {
                    objectAnimator.setPropertyName("translationX");
                } else if (TextUtils.equals(c0102pcc.vj(), "translateY")) {
                    objectAnimator.setPropertyName("translationY");
                } else {
                    objectAnimator.setPropertyName(c0102pcc.vj());
                }
                objectAnimator.setStartDelay(c0102pcc.oo());
                objectAnimator.setTarget(this.oo);
                char c = 0;
                if (TextUtils.equals(c0102pcc.vj(), "backgroundColor")) {
                    objectAnimator.setIntValues((int) c0102pcc.wh(), (int) c0102pcc.qf());
                    Log.d("UGenAnimation", "playAnimation: from = " + c0102pcc.wh() + "; to=" + c0102pcc.qf());
                } else {
                    objectAnimator.setFloatValues(c0102pcc.wh(), c0102pcc.qf());
                }
                int sf = (int) this.sf.sf();
                if (sf != 0) {
                    objectAnimator.setRepeatCount(sf);
                } else {
                    objectAnimator.setRepeatCount((int) c0102pcc.sf());
                }
                if (TextUtils.equals(c0102pcc.vj(), "backgroundColor")) {
                    objectAnimator.setEvaluator(new ArgbEvaluator());
                }
                String wh = this.sf.wh();
                if (TextUtils.isEmpty(wh)) {
                    wh = c0102pcc.gm();
                }
                if (TextUtils.equals(wh, "reverse")) {
                    objectAnimator.setRepeatMode(2);
                } else {
                    objectAnimator.setRepeatMode(1);
                }
                if (c0102pcc.kj() != null && c0102pcc.kj().length > 0) {
                    objectAnimator.setFloatValues(c0102pcc.kj());
                }
                if (TextUtils.equals(c0102pcc.vj(), "rotationX")) {
                    this.oo.post(new Runnable() { // from class: com.bytedance.adsdk.ugeno.core.ork.1
                        @Override // java.lang.Runnable
                        public void run() {
                            ork.this.oo.setPivotX(ork.this.oo.getWidth() / 2.0f);
                            ork.this.oo.setPivotY(ork.this.oo.getHeight());
                        }
                    });
                }
                if (TextUtils.equals(c0102pcc.vj(), "ripple")) {
                    this.qf = c0102pcc.ork();
                }
                String vy = c0102pcc.vy();
                vy.hashCode();
                switch (vy.hashCode()) {
                    case -1354466595:
                        break;
                    case -1263948740:
                        if (vy.equals("decelerate")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1102672091:
                        if (vy.equals("linear")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 475910905:
                        if (vy.equals("accelerateDecelerate")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1312628413:
                        if (vy.equals("standard")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        objectAnimator.setInterpolator(new AccelerateInterpolator());
                        break;
                    case 1:
                        objectAnimator.setInterpolator(new DecelerateInterpolator());
                        break;
                    case 2:
                    case 4:
                        objectAnimator.setInterpolator(new LinearInterpolator());
                        break;
                    case 3:
                        objectAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
                        break;
                }
                arrayList.add(objectAnimator);
            }
        }
        if (this.sf.oo() != 0) {
            this.gm.setDuration(this.sf.oo());
        }
        this.gm.setStartDelay(this.sf.vj());
        if (TextUtils.equals(this.sf.pcc(), "sequentially")) {
            this.gm.playSequentially(arrayList);
        } else {
            this.gm.playTogether(arrayList);
        }
        this.gm.start();
    }

    public void sf() {
        AnimatorSet animatorSet = this.gm;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public void pcc(Canvas canvas, IAnimation iAnimation) {
        try {
            if (iAnimation.getRipple() == 0.0f || TextUtils.isEmpty(this.qf)) {
                return;
            }
            this.pcc.setColor(com.bytedance.adsdk.ugeno.qf.pcc.pcc(this.qf));
            this.pcc.setAlpha(90);
            ((ViewGroup) this.oo.getParent()).setClipChildren(true);
            canvas.drawCircle(this.vj, this.wh, Math.min(r0, r2) * 2 * iAnimation.getRipple(), this.pcc);
        } catch (Throwable th) {
            Log.d("UGenAnimation", "ripple animation error " + th.getMessage());
        }
    }

    public void pcc(int i, int i2) {
        this.vj = i / 2;
        this.wh = i2 / 2;
    }
}
