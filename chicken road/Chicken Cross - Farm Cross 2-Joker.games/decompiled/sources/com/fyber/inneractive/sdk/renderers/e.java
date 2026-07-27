package com.fyber.inneractive.sdk.renderers;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.flow.h0;

/* loaded from: classes4.dex */
public abstract class e extends com.fyber.inneractive.sdk.flow.b0 {
    public com.fyber.inneractive.sdk.ui.controller.b k;

    public final ImageView c(ViewGroup viewGroup) {
        com.fyber.inneractive.sdk.rtb.watermark.b bVar;
        if (viewGroup == null) {
            return null;
        }
        InneractiveAdSpot inneractiveAdSpot = this.f5328a;
        ImageView imageView = ((inneractiveAdSpot instanceof h0) && (bVar = ((h0) inneractiveAdSpot).m) != null) ? bVar.f5919a : null;
        if (imageView == null) {
            return null;
        }
        com.fyber.inneractive.sdk.util.v.a(imageView);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        viewGroup.addView(imageView);
        return imageView;
    }
}
