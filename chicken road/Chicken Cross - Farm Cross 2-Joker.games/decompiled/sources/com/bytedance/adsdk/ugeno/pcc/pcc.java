package com.bytedance.adsdk.ugeno.pcc;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import com.bytedance.adsdk.ugeno.pcc.gm;
import com.bytedance.adsdk.ugeno.pcc.pcc.pcc;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class pcc extends AnimatorListenerAdapter {
    private ValueAnimator gm;
    private String kj;
    private Context oo;
    private com.bytedance.adsdk.ugeno.sf.gm pcc;
    private com.bytedance.adsdk.ugeno.pcc.pcc.pcc qf;
    private gm sf;
    private int vj;
    private sf vy;
    private int wh = 1;

    public pcc(Context context, com.bytedance.adsdk.ugeno.sf.gm gmVar, gm gmVar2) {
        this.pcc = gmVar;
        this.sf = gmVar2;
        this.oo = context;
    }

    public void pcc() {
        ValueAnimator valueAnimator = this.gm;
        if (valueAnimator == null || this.wh == 0 || this.vj == Integer.MIN_VALUE) {
            return;
        }
        valueAnimator.start();
    }

    public void pcc(sf sfVar) {
        this.vy = sfVar;
    }

    public void sf() {
        ValueAnimator valueAnimator = this.gm;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }

    public void gm() {
        ValueAnimator valueAnimator = this.gm;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public ValueAnimator oo() {
        String key;
        com.bytedance.adsdk.ugeno.pcc.sf.pcc gmVar;
        gm gmVar2 = this.sf;
        if (gmVar2 == null || this.pcc == null) {
            return null;
        }
        Map<String, TreeMap<Float, String>> sf = gmVar2.sf();
        ArrayList arrayList = new ArrayList();
        if (sf != null && !sf.isEmpty()) {
            for (Map.Entry<String, TreeMap<Float, String>> entry : sf.entrySet()) {
                if (entry != null) {
                    key = entry.getKey();
                    String gm = vj.pcc(key).gm();
                    gm.hashCode();
                    switch (gm) {
                        case "int":
                            gmVar = new com.bytedance.adsdk.ugeno.pcc.sf.gm(this.oo, this.pcc, key, entry.getValue());
                            break;
                        case "float":
                            gmVar = new com.bytedance.adsdk.ugeno.pcc.sf.sf(this.oo, this.pcc, key, entry.getValue());
                            break;
                        case "point":
                            gmVar = new com.bytedance.adsdk.ugeno.pcc.sf.oo(this.oo, this.pcc, key, entry.getValue());
                            break;
                        default:
                            gmVar = null;
                            break;
                    }
                    if (gmVar != null) {
                        arrayList.addAll(gmVar.vj());
                    }
                }
            }
        }
        JSONObject pcc = this.sf.pcc();
        if (pcc != null) {
            com.bytedance.adsdk.ugeno.pcc.pcc.pcc pcc2 = pcc.C0107pcc.pcc(this.pcc, pcc);
            this.qf = pcc2;
            if (pcc2 != null) {
                arrayList.addAll(pcc2.gm());
            }
        }
        final View vh = this.pcc.vh();
        if (vh == null) {
            return null;
        }
        final gm.pcc qf = this.sf.qf();
        if (qf != null) {
            vh.post(new Runnable() { // from class: com.bytedance.adsdk.ugeno.pcc.pcc.1
                @Override // java.lang.Runnable
                public void run() {
                    int width = vh.getWidth();
                    int height = vh.getHeight();
                    vh.setPivotX(oo.pcc(qf.pcc, width));
                    vh.setPivotY(oo.pcc(qf.sf, height));
                }
            });
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(vh, (PropertyValuesHolder[]) arrayList.toArray(new PropertyValuesHolder[0]));
        this.vj = oo.pcc(this.sf.oo());
        ofPropertyValuesHolder.setDuration(this.sf.gm());
        int i = this.vj;
        if (i != Integer.MIN_VALUE) {
            ofPropertyValuesHolder.setRepeatCount(i);
        }
        this.wh = this.sf.ork();
        this.kj = this.sf.vy();
        ofPropertyValuesHolder.setStartDelay(this.sf.wh());
        ofPropertyValuesHolder.setRepeatMode(oo.pcc(this.sf.vj()));
        ofPropertyValuesHolder.setInterpolator(oo.sf(this.sf.kj()));
        ofPropertyValuesHolder.addListener(this);
        this.gm = ofPropertyValuesHolder;
        return ofPropertyValuesHolder;
    }

    public void pcc(Canvas canvas) {
        com.bytedance.adsdk.ugeno.pcc.pcc.pcc pccVar = this.qf;
        if (pccVar != null) {
            pccVar.pcc(canvas);
        }
    }

    public void sf(Canvas canvas) {
        com.bytedance.adsdk.ugeno.pcc.pcc.pcc pccVar = this.qf;
        if (pccVar != null) {
            pccVar.sf(canvas);
        }
    }

    public void pcc(int i, int i2) {
        com.bytedance.adsdk.ugeno.pcc.pcc.pcc pccVar = this.qf;
        if (pccVar != null) {
            pccVar.pcc(i, i2);
        }
    }

    public String vj() {
        return this.kj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        sf sfVar = this.vy;
        if (sfVar != null) {
            sfVar.pcc();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        sf sfVar = this.vy;
        if (sfVar != null) {
            sfVar.sf();
        }
    }
}
