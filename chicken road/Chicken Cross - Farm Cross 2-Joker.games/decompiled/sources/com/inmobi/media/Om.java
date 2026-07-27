package com.inmobi.media;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Om extends X6 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Om(Ed nativeAdUnitComponent, AbstractC3724g1 adSessionManager) {
        super(nativeAdUnitComponent, adSessionManager);
        Intrinsics.checkNotNullParameter(nativeAdUnitComponent, "nativeAdUnitComponent");
        Intrinsics.checkNotNullParameter(adSessionManager, "adSessionManager");
    }

    @Override // com.inmobi.media.X6
    public final Object a(Continuation continuation) {
        return new C3618c7();
    }
}
