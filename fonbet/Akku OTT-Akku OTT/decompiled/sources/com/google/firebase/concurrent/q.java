package com.google.firebase.concurrent;

import com.google.firebase.inject.Provider;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes4.dex */
public final /* synthetic */ class q implements Provider {
    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        ScheduledExecutorService lambda$static$3;
        lambda$static$3 = ExecutorsRegistrar.lambda$static$3();
        return lambda$static$3;
    }
}
