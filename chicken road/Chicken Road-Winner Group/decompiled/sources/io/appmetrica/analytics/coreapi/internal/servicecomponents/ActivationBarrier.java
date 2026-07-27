package io.appmetrica.analytics.coreapi.internal.servicecomponents;

import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;

/* loaded from: classes.dex */
public interface ActivationBarrier {
    void subscribe(long j3, ICommonExecutor iCommonExecutor, ActivationBarrierCallback activationBarrierCallback);
}
