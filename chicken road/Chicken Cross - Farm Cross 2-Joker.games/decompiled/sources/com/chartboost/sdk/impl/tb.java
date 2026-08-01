package com.chartboost.sdk.impl;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class tb extends hj {
    public /* synthetic */ tb(Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Integer.valueOf(Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE) : num);
    }

    public tb(Integer num) {
        super("Maximum wrapper depth exceeded.", num);
    }
}
