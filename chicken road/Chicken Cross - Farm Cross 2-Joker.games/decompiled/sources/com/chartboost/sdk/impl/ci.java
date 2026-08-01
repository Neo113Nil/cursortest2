package com.chartboost.sdk.impl;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ci extends bi {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ci(AtomicReference sdkConfiguration) {
        super(sdkConfiguration);
        Intrinsics.checkNotNullParameter(sdkConfiguration, "sdkConfiguration");
    }
}
