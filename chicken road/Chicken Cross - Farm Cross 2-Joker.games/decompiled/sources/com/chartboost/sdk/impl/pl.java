package com.chartboost.sdk.impl;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class pl extends hj {
    public /* synthetic */ pl(String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? Integer.valueOf(Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE) : num);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pl(String uri, Integer num) {
        super("VAST wrapper loop detected for URI: " + uri, num);
        Intrinsics.checkNotNullParameter(uri, "uri");
    }
}
