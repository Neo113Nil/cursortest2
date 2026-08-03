package com.fyber.inneractive.sdk.renderers;

/* loaded from: classes3.dex */
public abstract class e extends com.fyber.inneractive.sdk.flow.b0 {
    public com.fyber.inneractive.sdk.ui.controller.b k;

    public final android.widget.ImageView c(android.view.ViewGroup viewGroup) {
        com.fyber.inneractive.sdk.rtb.watermark.b bVar;
        if (viewGroup == null) {
            return null;
        }
        com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot = this.f3675a;
        android.widget.ImageView imageView = ((inneractiveAdSpot instanceof com.fyber.inneractive.sdk.flow.h0) && (bVar = ((com.fyber.inneractive.sdk.flow.h0) inneractiveAdSpot).m) != null) ? bVar.f4262a : null;
        if (imageView == null) {
            return null;
        }
        com.fyber.inneractive.sdk.util.v.a(imageView);
        imageView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        viewGroup.addView(imageView);
        return imageView;
    }
}
