package com.chartboost.sdk.impl;

import com.chartboost.sdk.tracking.TrackAd;

/* loaded from: classes4.dex */
public abstract class f0 {
    public static final TrackAd.AdSize a(e0 e0Var) {
        if (e0Var != null) {
            return new TrackAd.AdSize(e0Var.a(), e0Var.c());
        }
        return null;
    }
}
