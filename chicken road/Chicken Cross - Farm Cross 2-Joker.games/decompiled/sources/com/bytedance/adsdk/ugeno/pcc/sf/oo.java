package com.bytedance.adsdk.ugeno.pcc.sf;

import android.animation.FloatEvaluator;
import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.pcc.vj;
import com.bytedance.adsdk.ugeno.qf.kj;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes4.dex */
public class oo extends pcc {
    private List<Keyframe> kj;

    public oo(Context context, com.bytedance.adsdk.ugeno.sf.gm gmVar, String str, Map<Float, String> map) {
        super(context, gmVar, str, map);
        this.kj = new ArrayList();
    }

    /* renamed from: com.bytedance.adsdk.ugeno.pcc.sf.oo$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] pcc;

        static {
            int[] iArr = new int[vj.values().length];
            pcc = iArr;
            try {
                iArr[vj.TRANSLATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                pcc[vj.SCALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.pcc.sf.pcc
    public void sf() {
        Keyframe ofFloat;
        Keyframe ofFloat2;
        int i = AnonymousClass1.pcc[this.oo.ordinal()];
        if (i == 1) {
            ofFloat = Keyframe.ofFloat(0.0f, this.qf.jr());
            ofFloat2 = Keyframe.ofFloat(0.0f, this.qf.dax());
        } else if (i != 2) {
            ofFloat = null;
            ofFloat2 = null;
        } else {
            ofFloat = Keyframe.ofFloat(0.0f, this.qf.nac());
            ofFloat2 = Keyframe.ofFloat(0.0f, this.qf.lu());
        }
        if (ofFloat != null) {
            this.vj.add(ofFloat);
        }
        if (ofFloat2 != null) {
            this.kj.add(ofFloat2);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.pcc.sf.pcc
    public void pcc(float f, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() != 2) {
                return;
            }
            float optDouble = (float) jSONArray.optDouble(0);
            float optDouble2 = (float) jSONArray.optDouble(1);
            if (this.oo == vj.TRANSLATE) {
                optDouble = kj.pcc(this.pcc, optDouble);
                optDouble2 = kj.pcc(this.pcc, optDouble2);
            }
            this.vj.add(Keyframe.ofFloat(f, optDouble));
            this.kj.add(Keyframe.ofFloat(f, optDouble2));
        } catch (JSONException unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.pcc.sf.pcc
    public List<PropertyValuesHolder> vj() {
        String sf = this.oo.sf();
        oo();
        PropertyValuesHolder ofKeyframe = PropertyValuesHolder.ofKeyframe(sf + "X", (Keyframe[]) this.vj.toArray(new Keyframe[0]));
        this.wh.add(ofKeyframe);
        PropertyValuesHolder ofKeyframe2 = PropertyValuesHolder.ofKeyframe(sf + "Y", (Keyframe[]) this.kj.toArray(new Keyframe[0]));
        this.wh.add(ofKeyframe2);
        TypeEvaluator wh = wh();
        if (wh != null) {
            ofKeyframe.setEvaluator(wh);
            ofKeyframe2.setEvaluator(wh);
        }
        return this.wh;
    }

    @Override // com.bytedance.adsdk.ugeno.pcc.sf.pcc
    public TypeEvaluator wh() {
        return new FloatEvaluator();
    }
}
