package com.bytedance.sdk.openadsdk.gm;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.rj;

/* loaded from: classes4.dex */
public class vh extends View {
    private final int pcc;

    public vh(Context context) {
        this(context, Color.parseColor("#25000000"));
    }

    public vh(Context context, int i) {
        super(context);
        setBackgroundColor(i);
        this.pcc = rj.sf(getContext(), 0.66f);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(getMeasuredWidth(), this.pcc);
    }
}
