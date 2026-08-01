package com.chartboost.sdk.impl;

import com.chartboost.sdk.tracking.TrackAd;

/* loaded from: classes4.dex */
public interface i7 extends h7 {
    com.chartboost.sdk.tracking.f clearFromStorage(com.chartboost.sdk.tracking.f fVar);

    com.chartboost.sdk.tracking.f persist(com.chartboost.sdk.tracking.f fVar);

    fi refresh(fi fiVar);

    TrackAd store(TrackAd trackAd);

    com.chartboost.sdk.tracking.f track(com.chartboost.sdk.tracking.f fVar);
}
