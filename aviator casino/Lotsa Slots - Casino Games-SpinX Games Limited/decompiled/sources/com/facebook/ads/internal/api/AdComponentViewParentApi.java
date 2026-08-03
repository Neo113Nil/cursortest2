package com.facebook.ads.internal.api;

/* loaded from: classes2.dex */
public interface AdComponentViewParentApi extends com.facebook.ads.internal.api.AdComponentView {
    void bringChildToFront(android.view.View view);

    void onAttachedToWindow();

    void onDetachedFromWindow();

    void onMeasure(int i, int i2);

    void onVisibilityChanged(android.view.View view, int i);

    void setMeasuredDimension(int i, int i2);
}
