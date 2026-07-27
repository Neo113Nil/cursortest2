package com.bytedance.adsdk.ugeno.pcc.sf;

import android.animation.ArgbEvaluator;
import android.animation.IntEvaluator;
import android.animation.Keyframe;
import android.animation.TypeEvaluator;
import android.content.Context;
import com.bytedance.adsdk.ugeno.pcc.vj;
import java.util.TreeMap;

/* loaded from: classes4.dex */
public class gm extends pcc {
    public gm(Context context, com.bytedance.adsdk.ugeno.sf.gm gmVar, String str, TreeMap<Float, String> treeMap) {
        super(context, gmVar, str, treeMap);
    }

    @Override // com.bytedance.adsdk.ugeno.pcc.sf.pcc
    public void sf() {
        if (this.oo == vj.BACKGROUND_COLOR) {
            this.vj.add(Keyframe.ofInt(0.0f, this.qf.kun()));
        }
    }

    @Override // com.bytedance.adsdk.ugeno.pcc.sf.pcc
    public void pcc(float f, String str) {
        Keyframe ofInt;
        if (this.oo == vj.BACKGROUND_COLOR) {
            ofInt = Keyframe.ofInt(f, com.bytedance.adsdk.ugeno.qf.pcc.pcc(str));
        } else {
            ofInt = Keyframe.ofInt(f, com.bytedance.adsdk.ugeno.qf.gm.pcc(str, 0));
        }
        this.vj.add(ofInt);
    }

    @Override // com.bytedance.adsdk.ugeno.pcc.sf.pcc
    public TypeEvaluator wh() {
        if (this.oo == vj.BACKGROUND_COLOR) {
            return new ArgbEvaluator();
        }
        return new IntEvaluator();
    }
}
