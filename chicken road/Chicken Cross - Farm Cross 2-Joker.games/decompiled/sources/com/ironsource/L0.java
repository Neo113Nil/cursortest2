package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface L0 {
    default void a() {
    }

    void a(C4666u0 c4666u0);

    void b(IronSourceError ironSourceError);

    default void b(C4666u0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
    }
}
