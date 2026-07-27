package com.bytedance.sdk.openadsdk.qy.sf;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.nn;

/* loaded from: classes4.dex */
public class wh {
    public static boolean pcc(View view, int i) {
        return pcc(view, false, i);
    }

    public static boolean pcc(View view, boolean z, int i) {
        if (view == null) {
            return false;
        }
        return nn.pcc(view, z ? 30 : 50, i, false);
    }
}
