package com.chartboost.sdk.impl;

import com.chartboost.sdk.view.CBImpressionActivity;

/* loaded from: classes4.dex */
public interface m9 {
    void attachViewToActivity(qk qkVar);

    void finishActivity();

    CBImpressionActivity getActivity();

    boolean isActivityHardwareAccelerated();

    void setFullscreen();
}
