package com.bytedance.adsdk.ugeno.pcc.sf;

import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.content.Context;
import com.bytedance.adsdk.ugeno.pcc.vj;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes4.dex */
public abstract class pcc {
    protected Map<Float, String> gm;
    protected vj oo;
    protected Context pcc;
    protected com.bytedance.adsdk.ugeno.sf.gm qf;
    protected String sf;
    protected List<PropertyValuesHolder> wh = new ArrayList();
    protected List<Keyframe> vj = new ArrayList();

    public abstract void pcc(float f, String str);

    public abstract void sf();

    public abstract TypeEvaluator wh();

    public pcc(Context context, com.bytedance.adsdk.ugeno.sf.gm gmVar, String str, Map<Float, String> map) {
        this.pcc = context;
        this.sf = str;
        this.gm = map;
        this.oo = vj.pcc(this.sf);
        this.qf = gmVar;
    }

    public boolean pcc() {
        Map<Float, String> map = this.gm;
        if (map == null || map.size() <= 0) {
            return false;
        }
        return this.gm.containsKey(Float.valueOf(0.0f));
    }

    public void gm() {
        Map<Float, String> map = this.gm;
        if (map == null || map.size() <= 0) {
            return;
        }
        Map<Float, String> map2 = this.gm;
        if (map2 instanceof TreeMap) {
            float floatValue = ((Float) ((TreeMap) map2).lastKey()).floatValue();
            if (floatValue != 100.0f) {
                pcc(100.0f, this.gm.get(Float.valueOf(floatValue)));
            }
        }
    }

    public void oo() {
        Map<Float, String> map = this.gm;
        if (map == null || map.size() <= 0) {
            return;
        }
        if (!pcc()) {
            sf();
        }
        for (Map.Entry<Float, String> entry : this.gm.entrySet()) {
            if (entry != null) {
                pcc(entry.getKey().floatValue() / 100.0f, entry.getValue());
            }
        }
        gm();
    }

    public List<PropertyValuesHolder> vj() {
        String sf = this.oo.sf();
        oo();
        PropertyValuesHolder ofKeyframe = PropertyValuesHolder.ofKeyframe(sf, (Keyframe[]) this.vj.toArray(new Keyframe[0]));
        TypeEvaluator wh = wh();
        if (wh != null) {
            ofKeyframe.setEvaluator(wh);
        }
        this.wh.add(ofKeyframe);
        return this.wh;
    }
}
