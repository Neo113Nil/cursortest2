package com.instagram.common.viewpoint.core;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;

/* loaded from: assets/audience_network.dex */
public final class ZA extends ImageView {
    public ZA(C1153dL c1153dL, View.OnClickListener onClickListener) {
        super(c1153dL);
        Bitmap bitmap = XY.A01(XX.CREDIT_LINE_PILL);
        setImageBitmap(bitmap);
        setOnClickListener(onClickListener);
    }
}
