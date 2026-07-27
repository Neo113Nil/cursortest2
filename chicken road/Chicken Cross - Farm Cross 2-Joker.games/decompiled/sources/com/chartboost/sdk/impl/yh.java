package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class yh {
    public static final i7 a() {
        return b4.b.c().a();
    }

    public static final o4 a(String adType, String location, Mediation mediation, i7 eventTracker) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        return new p4(adType, location, mediation, eventTracker);
    }
}
