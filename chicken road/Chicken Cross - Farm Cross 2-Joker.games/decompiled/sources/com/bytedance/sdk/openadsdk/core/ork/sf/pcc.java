package com.bytedance.sdk.openadsdk.core.ork.sf;

import android.content.Context;
import android.os.Build;
import android.util.Pair;
import android.view.View;
import android.view.Window;
import com.bytedance.sdk.openadsdk.utils.rj;
import java.util.Arrays;

/* loaded from: classes4.dex */
public class pcc {
    public static Pair<Float, Float> pcc(Window window, int i) {
        float[] fArr = new float[2];
        View decorView = window.getDecorView();
        int width = decorView.getWidth();
        int height = decorView.getHeight();
        int paddingLeft = decorView.getPaddingLeft();
        int paddingTop = decorView.getPaddingTop();
        if (Build.VERSION.SDK_INT >= 35) {
            fArr[0] = width - paddingLeft;
            fArr[1] = height - paddingTop;
        } else {
            fArr[0] = width - (paddingLeft * 2);
            fArr[1] = height - (paddingTop * 2);
        }
        Arrays.toString(fArr);
        fArr[0] = rj.gm(window.getContext(), fArr[0]);
        float gm = rj.gm(window.getContext(), fArr[1]);
        fArr[1] = gm;
        if (fArr[0] < 10.0f || gm < 10.0f) {
            fArr = pcc(window.getContext(), rj.gm(window.getContext(), rj.pcc()), i);
        }
        float max = Math.max(fArr[0], fArr[1]);
        float min = Math.min(fArr[0], fArr[1]);
        if (i == 1) {
            fArr[0] = min;
            fArr[1] = max;
        } else {
            fArr[0] = max;
            fArr[1] = min;
        }
        return new Pair<>(Float.valueOf(fArr[0]), Float.valueOf(fArr[1]));
    }

    private static float[] pcc(Context context, int i, int i2) {
        float pcc = pcc(context);
        float sf = sf(context);
        if ((i2 == 1) != (pcc > sf)) {
            float f = pcc + sf;
            sf = f - sf;
            pcc = f - sf;
        }
        if (i2 == 1) {
            pcc -= i;
        } else {
            sf -= i;
        }
        return new float[]{sf, pcc};
    }

    public static float pcc(Context context) {
        return rj.gm(context, rj.tmg(context));
    }

    public static float sf(Context context) {
        return rj.gm(context, rj.hc(context));
    }
}
