package com.onesignal.core.internal.config.impl;

import D4.X;
import f4.v;
import kotlin.jvm.internal.j;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class FeatureFlagsRefreshService$onUnfocused$1 extends j implements InterfaceC1430a {
    final /* synthetic */ FeatureFlagsRefreshService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeatureFlagsRefreshService$onUnfocused$1(FeatureFlagsRefreshService featureFlagsRefreshService) {
        super(0);
        this.this$0 = featureFlagsRefreshService;
    }

    @Override // t4.InterfaceC1430a
    public /* bridge */ /* synthetic */ Object invoke() {
        m9invoke();
        return v.f5689a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m9invoke() {
        X x5;
        FeatureFlagsRefreshService featureFlagsRefreshService = this.this$0;
        synchronized (featureFlagsRefreshService) {
            x5 = featureFlagsRefreshService.pollJob;
            if (x5 != null) {
                x5.b(null);
            }
            featureFlagsRefreshService.pollJob = null;
            featureFlagsRefreshService.pollingAppId = null;
        }
    }
}
