package com.google.firebase.concurrent;

import com.google.firebase.inject.Provider;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes4.dex */
public final /* synthetic */ class p implements Provider {
    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        ScheduledExecutorService lambda$static$2;
        lambda$static$2 = ExecutorsRegistrar.lambda$static$2();
        return lambda$static$2;
    }
}
